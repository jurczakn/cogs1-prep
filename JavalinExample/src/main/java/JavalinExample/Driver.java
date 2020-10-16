package JavalinExample;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		Javalin app = Javalin.create().start(9090);
		app.get("/hello", ctx -> ctx.html("Hello World"));
	}

}
