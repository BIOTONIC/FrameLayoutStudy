# FrameLayoutStudy
Simple demo of FrameLayout in Android

- In this demo, I design a layout using pictures from [Deemo](https://www.rayark.com/g/deemo/).
- This layout is designed in [src/res/layout/layout_main.xml](https://github.com/BIOTONIC/FrameLayoutStudy/blob/master/app/src/main/res/layout/activity_main.xml).
- The first layer is a relative layout. The background and three stickers are put on this layer.
- Also, there is a frame layout inside the relative layout, where I put [a customized LogoView](https://github.com/BIOTONIC/FrameLayoutStudy/blob/master/app/src/main/java/com/lovejoy/layouttest/LogoView.java) in it. You can drag and move the logo.
- At first I find ToEndof does not work, then I realized that my pictures are too large and I set them width and height to 'wrap_content'. So the best solution is to set specific size of width and height.
- Below is the screenshot.
![](https://github.com/BIOTONIC/FrameLayoutStudy/blob/master/app/src/main/res/drawable/screenshot.png)
