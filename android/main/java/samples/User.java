package samples;

import live.attach.sdk.AttachSdk;

public class User {
    /**
     * Signs your app user into ATTACH.
     * The user must be signed in before entering a room.
     * <p>
     * If not called, a guest user will be created.
     *
     * @param  id       a String passing the id of the user in the app
     * @param  username a String giving the username of the user
     * @param  avatar   an absolute URL giving the location of the avatar image
     * @see             https://documentation.attach.live/android/concepts/users
     */
    public void signIn(String id, String username, String avatar) {
        AttachSdk.signIn(
            new User(id, username, avatar)
        );
    }

    /**
     * Signs your app user into ATTACH.
     * The user must be signed in before entering a room.
     * <p>
     * If not called, a guest user will be created.
     *
     * @param  token a String giving the JWT (JSON Web Token) of the user
     * @see          https://documentation.attach.live/android/concepts/jwt
     */
    public void signIn(String token) {
        AttachSdk.signIn(
            new User(token)
        );
    }

    /**
     * Signs your current user out of ATTACH.
     * A guest user will be created unless you sign in another user.
     */
    public void signOut() {
        AttachSdk.signOut();
    }
}
