package tvir.signup.task;

import lombok.extern.slf4j.Slf4j;
import org.androidannotations.annotations.*;
import tvir.signup.activity.SignUpActivity;
import tvir.signup.service.SignUpService;

// @author: m on 29.03.15 17:21.
@EBean
@Slf4j
public class UserSignUpTask {

    @Bean SignUpService signUpService;

    @RootContext SignUpActivity signUpActivity;

    @Background(id = "signup")
    public void signup(String mEmail, String mPassword) {
        onLoginComplete(signUpService.signup(mEmail, mPassword));
    }

    @UiThread
    void onLoginComplete(boolean success) {
        signUpActivity.onLoginComplete(success);
    }

}
