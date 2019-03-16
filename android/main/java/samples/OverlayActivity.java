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
    public Properties withAttributes() {
        return new Attributes()
                .setOverlayServices()
                .setParticipantsAvatarBorderRadius()
                .setParticipantsFocusBackgroundColor()
                .setParticipantsViewerBackgroundColor()
                .setVideocallFocusBackgroundColor()
                .setVideocallButtonBackgroundColor()
                .setChatViewerBackgroundColor()
                .setChatEditorBackgroundColor();
    }

    // Change the room or style attributes interactively.
    // https://documentation.attach.live/android/concepts/interactive-changes
    private void changeRoom() {
        setAttachRoom(new Room("twitter", "hashtag", "i-love-attach"));
        setAttachAttributes(new Attributes()
                .setChatViewerBackgroundColor()
                .setChatEditorBackgroundColor();
    };
}
