# University of Hawaii Maui College AR Demo
#### Introduction
This project is an extension of Google's AR Core demo app with additional features requested by students enrolled in the ABIT program under Debasis Bhattacharya at UHMC. This project will serve as a way for these students to market their business ideas using emerging augmented reality technology.
#### System Requirements
* Google Pixel, Pixel XL, Pixel 2, Pixel 2 XL
* Samsung Galaxy S8 (SM-G950U, SM-G950N, SM-G950F, SM-G950FD, SM-G950W, SM-G950U1)
#### Dependencies
The AR libraries are included in the git tree; just import the project to Android Studio and run.

#### Application usage / Workflow
1. Open the app and allow camera permissions.
2. Focus the camera on a surface that you wish to place objects on.
3. When the app finds a surface, tap anywhere on the screen and the menu will open (swipe from left edge to access the menu again).
4. If you wish to change the object's size, it can be done in the "Adjustments" tab, otherwise select the asset.
	1. Currently, the object size is determined by a scaling factor, so the object will increase in size in all three dimensions based on this scale.
	2. Scale needs to be changed before the object is placed to take effect (default is 1).
5. Tap the surface wherever you wish to place the object.
	1. Currently, the object will be placed facing the camera. Rotation is still a work in progress, but for now, the workaround is moving the camera so that the object faces the desired direction.

#### Screenshots

#### Credits
* [Debasis Bhattacharya](mailto:debasisb@hawaii.edu) - Project Supervisor
* [Mario Canul](mailto:mcanul@hawaii.edu) - Undergraduate Cybersecurity Researcher
* [Saxon Knight](mailto:knight7@hawaii.edu) - Undergraduate Cybersecurity Researcher
* [National Science Foundation](http://nsf.gov) - This project is possible thanks to the funding support of the National Science Foundation
