package samples;

import live.attach.sdk.ui.AttachOverlayActivity;

/**
 * Add a video or chat overlay to your activity
 * by extending AttachOverlayActivity
 * @see  https://documentation.attach.live/android/walkthroughs/overlay
 */
public class OverlayActivity extends AttachOverlayActivity {
    // Set the room.
    // https://documentation.attach.live/android/concepts/rooms
    @Override
    public Room withRoom() {
        return new Room("twitter", "hashtag", "helloattach");
    }

    // Override style attributes.
    // https://documentation.attach.live/android/concepts/attributes
    @Override
    public Properties withProperties() {
        return new Properties()
                .setServices(VIDEOCALL, CHAT);
                .setProperty("chat:viewer-background-color", "#FF0000")
    }

    // Change the room or style attributes interactively.
    // https://documentation.attach.live/android/concepts/interactive-changes
    private void changeRoom() {
        setRoom(new Room("twitter", "hashtag", "i-love-attach"));
        setProperties(new Properties()
                .setProperty("chat:viewer-background-color", "#0000FF")
        );
    };
}
