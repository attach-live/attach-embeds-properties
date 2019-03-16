package samples;

import live.attach.sdk.AttachSdk;

public class User {
    /**
     * Signs your app user into ATTACH.
     * The user must be signed in before entering a room.
     * <p>
     * If not called, a guest user will be created.
     *
     * @param  username a String giving the username of the user
     * @param  avatar   an absolute URL giving the location of the avatar image
     * @param  preview  an absolute URL giving the location of the preview image
     * @see             https://documentation.attach.live/android/concepts/users
     */
    public void signinUser(String username, String avatar, String preview) {
        AttachSdk.signinUser(new User()
            .withUsername(username)
            .withAvatar(avatar)
            .withPreview(preview)
        );
    }

    /**
     * Signs your app user into ATTACH.
     * The user must be signed in before entering a room.
     * <p>
     * If not called, a guest user will be created.
     *
     * @param  jwt a String giving the JWT (JSON Web Token) of the user
     * @see        https://documentation.attach.live/android/concepts/jwt
     */
    public void signinUserWithJWT(String jwt) {
        AttachSdk.signinUser(new User()
              .fromJWT(jwt);
        );
    }

    /**
     * Signs your current user out of ATTACH.
     * A guest user will be created unless you sign in another user.
     */
    public void signoutUser() {
        AttachSdk.signoutUser();
    }
}
