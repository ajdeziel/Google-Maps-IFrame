# SENG 310 - Prototype Implementation
For use in Human Computer Interaction to deploy a customized Google Maps within a prototyping tool via an iframe.

As part of a group implementation project prototyping Crowdz; an application designed to measure the population density in specific locations to determine how occupied it is (i.e. lets users know how busy a restaurant/clinic/public place is in real time, and based on past trends).


## Documentation
Crowdz makes use of the Google Maps JavaScript API to provide the scrollable map. The icons on the map are custom made, and are interactive. When clicked, the marker will produce a content window that is  shown at the bottom of the screen, overlaying on top of the map. This is just a .png image, and proto.io's functions emulate the interactions that would be included in the final version. 

As this is a prototype implementation, it was decided to limit the bounds of the map to the area around the University of Victoria. The bounded area primarily consists of Saanich's Gordon Head & University Heights neighbourhoods, as well as the Shelbourne/Hillside area. This was done to reduce the number of icons needed, all of which had to be individually mapped. 


### External links
* For more information, visit <a href='https://sites.google.com/view/crowdz-implementation-phase-3/home'>Crowdz's implementation report</a>
* View prototype implementation in action @ <a href='https://ajdeziel.github.io/crowdz-prototype-ui/frame.html'>GitHub Pages</a>
