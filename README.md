# Widget Android Embed Sample

A sample Android project showcasing how to embed Twyla Widget in an activity:

<p align="center">
  <img src="https://assets.canvas.twyla.ai/widget/widget-sample-github-readme.png" width="350" title="hover text">
</p>

## Getting Started
1. Grab the widget configuration from Twyla Canvas Widget configurator (Project settings -> Twyla Widget Widget -> Generate Snippet). 
2. Add the embed attribute `data-embed-mode="true"` to the script. It should look something like:
```html
<script
  id="twyla-widget-script"
  src="https://widget.chat.twyla.ai/twyla-widget.js"
  data-hook-url="<hook-url>"
  data-api-key="<api-key>"
  data-primary-color="#2f80ed"
  data-greeting="false"
  data-embed-mode="true"
>
</script>
```
3. Import the Project in Android Studio.
4.  In `assets/index.html`, replace the script with the one from step #2.
5. Run the project
