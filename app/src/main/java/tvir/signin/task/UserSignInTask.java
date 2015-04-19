package tvir.signin.task;

import lombok.extern.slf4j.Slf4j;
import org.androidannotations.annotations.*;
import tvir.signin.activity.SignInActivity;
import tvir.signin.service.SignInService;

// @author: m on 29.03.15 17:21.
@EBean
@Slf4j
public class UserSignInTask {

    @Bean SignInService signInService;

    @RootContext SignInActivity signInActivity;

    @Background(id = "signin")
    public void signin(String mEmail, String mPassword) {
        onLoginComplete(signInService.signin(mEmail, mPassword));
    }

    @UiThread
    void onLoginComplete(boolean success) {
        signInActivity.onLoginComplete(success);
    }

}
