package stepdefinitions;

import java.util.List;


import com.typicode.jsonplaceholder.jsonplaceholder.Post;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.common.mapper.TypeRef;

public class allPosts {
	
	RequestSpecification req;
	List<Post> posts;
	Response resp;
	
	@Given("API is available")
	public void api_is_available() {
		 req= RestAssured.given().log().all()
		     .baseUri("https://jsonplaceholder.typicode.com")
		     .header("Content-type","application/json; charset=UTF-8");
	}
	
	@When("user sends the request for all Post using GET")
	public void user_sends_the_request_for_all_post_using_get() {
	resp=req.when().get("/posts");
    posts=resp.jsonPath().getList("$",Post.class);
	for (Post post: posts) {
		System.out.println("id"+ post.getId());
		System.out.println("body"+ post.getBody());	
	}
	}
	
@When("user sends the request using id  {string} and {string} http method")
public void user_sends_the_request_using_id_and_http_method(String id, String method) {
	if(method.equalsIgnoreCase("Get")) {
		resp=req.when().get("/posts/"+id);
	}
	else if(method.equalsIgnoreCase("Delete")){
		resp=req.when().delete("/posts/"+id);
	}
}
@When("user sends the request to update a Post using id {int} and PUT http method")
public void user_sends_the_request_to_update_a_post_using_id_and_put_http_method(int id) {
	 Post post = new Post(id, "foo", "bar", 1);
	resp=  req
		  .body(post)
		  .when()
		  .put("posts/" +id );
}

@When("user sends a POST request to add a Post with title {string} and body {string}")
public void user_sends_a_post_request_to_add_a_post_with_title_and_body(String title, String body){
	Post post = new Post( title, body, 1);
	resp=  req.body(post)
			.when().post("/posts");
}
 
	@Then("status code is {int}")
	public void status_code_is(Integer int1) {
	   resp.then().log().all().assertThat().statusCode(int1);
	}
}
