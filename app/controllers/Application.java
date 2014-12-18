package controllers;

import Beans.ChangeAddressUserVO;
import Beans.CurrentAddressUserVO;
import play.*;
import play.api.libs.json.*;
import play.data.Form;
import play.libs.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

import static play.data.Form.form;


public class Application extends Controller {


    public static Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public static Result ChangeAddress() {
        CurrentAddressUserVO  vo = new CurrentAddressUserVO();
        return ok(ChangeAddress.render("Ready"));
    }

    public static Result ConfirmChangeAddress() {

        return ok(confirmation.render("Your new application is ready."));
    }

    public static Result register() {
        Form<ChangeAddressUserVO> userForm = form(ChangeAddressUserVO.class);
        ChangeAddressUserVO vo = userForm.bindFromRequest().get();
        String concateDate = vo.getMonth() + "-" + vo.getDate() + "-" + vo.getYear();
        vo.setConcateDate(concateDate);
        return ok(ConfirmAddressChange.render(vo));
    }

    public static Result CurrentAddress(){
        Logger.info("Angular Js Ajax Call");
        CurrentAddressUserVO  vo = new CurrentAddressUserVO();
        return ok(Json.toJson(vo));
    }
}