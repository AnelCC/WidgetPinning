# Widget pinned

### What is widget pinning?

Widget pinning is a feature that allows users to keep a specific widget on their screen, preventing it from being minimized or hidden by other windows or apps. It essentially locks the widget in place, ensuring it remains visible and accessible.

### Widget discoverability
On devices running Android 8.0 (API level 26) and higher, launchers that let users create pinned shortcuts also let them pin widgets onto their home screen. Similar to pinned shortcuts, these pinned widgets give users access to specific tasks in your app and can be added to the home screen directly from the app, as shown in the following video.

## Widget types

### Information widgets
Information widgets typically display crucial information elements and track how that information changes over time. Examples of information widgets are weather widgets, clock widgets, or sports score tracking widgets. Tapping information widgets typically launches the associated app and opens a detailed view of the widget information.

### Collection widgets
Collection widgets specialize in displaying multiple elements of the same type, such as a collection of pictures from a gallery app, a collection of articles from a news app, or a collection of emails or messages from a communication app. Collection widgets can scroll vertically.
Collection widgets typically focus on the following use cases:
 * Browsing the collection.
 * Opening an element of the collection to its detail view in the associated app.
 * Interacting with elements, such as marking them done—with support for compound buttons in Android 12 (API level 31).

### Control widgets
The main purpose of a control widget is to display frequently used functions so that the user can trigger them from the home screen without having to open the app. You can think of them as remote controls for an app. An example of a control widget is a home control widget that lets users turn lights in the house on or off.
Interacting with a control widget might open an associated detail view in the app. This depends on whether the control widget's function outputs any data, such as in the case of a search widget.

### Hybrid widgets
While some widgets represent one of the types in the preceding sections—information, collection, or control—many widgets are hybrids that combine elements of different types. For example, a music player widget is primarily a control widget, but it also shows the user what track is currently playing, like an information widget.
When planning your widget, design around one of the base types and add elements of other types as needed.


## Preview 🎉
<img src="https://raw.githubusercontent.com/AnelCC/WidgetPinning/refs/heads/main/images/widget1.png" width="180" height="400"/><img src="https://raw.githubusercontent.com/AnelCC/WidgetPinning/refs/heads/main/images/widget2.png" width="180" height="400"/>
<img src="https://raw.githubusercontent.com/AnelCC/WidgetPinning/refs/heads/main/images/widget3.png" width="180" height="400"/><img src="https://raw.githubusercontent.com/AnelCC/WidgetPinning/refs/heads/main/images/widget4.png" width="180" height="400"/>

Reference:
https://developer.android.com/develop/ui/views/appwidgets/discoverability
https://developer.android.com/develop/ui/views/appwidgets/overview
