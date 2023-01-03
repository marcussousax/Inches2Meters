# Android Challenge using Java

They want you to demonstrate knowledge of working directly with XML layout files and some core
views. They want to see LinearLayouts, ImageViews, EditText, Buttons and TextViews. And also to see
your Java code including you demonstrating good use of variables, methods, and conditional logic.

**Acceptance criteria for this - it is done when:**

- There's a brand new complete Android project that runs on an emulator or the device.

- The app has one screen layout, with a LinearLayout (vertical orientation) as its root element,
  featuring an ImageView (any image is fine), an EditText input for the user to type inches, a
  Calculate Button and a TextView which will display the result in meters.

- The Java code should feature 3 methods: A findViews() method which stores the Views as Fields (
  Class variables), a convertToMeters() method which performs the maths and returns the decimal
  height value, and a displayResult() method which formats the value as a string to 2 decimal places
  and displays it.

- The project demonstrates knowledge of conditional logic by checking if the inches EditText value
  is empty, and displays a Toast alert to the user asking them to input the value if it is. (You'll
  need a new method to do this... you can call an isEmpty() method on any string to check this, so
  your if statement should like if(myStringVariable.isEmpty())