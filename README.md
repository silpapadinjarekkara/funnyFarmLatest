
Assignment
Your task is to develop the backend for the word association puzzle game funny farm
The player is introduced with boxes that contains words. All words are hidden except the main topic. The boxes connected to any cleared words (including the main topic) are visible but the words are still hidden by a masking of dots ('.')
When the user guess a word and that word exist in one of the visible boxes the word in the box is revealed and all connected words boxes are made visible. If that word exist but in an invisible box the state doesn't change.
https://funny-farm.appspot.com/game/farm
You are allowed to change any code except for the two below requirements in this project:
The UI team has already finished and therefore the interface has already been decided. They expect a set JSON structure defined by the records in the package com.etraveli.funnyfarm.api.model
The game designer is also finished and has presented you with the game world file located in resources/farm_world.json He has also provided you with some helping record files located in com.etraveli.funnyfarm.game.gameworld and parsing of the file.
You need to implement an internal model and the GameEngine
Write tests
Write down a short log where you motivate your choices
If you feel the task is too large you can scale it down, you should focus on code clarity, testing, testability.




# Instructions for reviewing


1. You need to see past your own preferences. The assignee has probably chosen techniques and technology which they are comfortable with. Examples could be the usage of streams, how they write loops, using latest java or 3rd party libraries such as lombok. All of this is behavior that can be corrected or maybe learned from during code reviews when they have joined your team.
2. Does the candidate seem to master the techniques he has chosen?
  1. Examples could be checking for isPresent on Optionals. Using Synchronize correctly, handling of exceptions etc.
3. The assignment presents the opportunity to show some code design
  1. It shouldn’t be too over engineered, but remember that the candidate might want to show off.
  2. How does the structure and design look?
4. Is the code clean and easily understood?
5. Are the tests well written?
  1. Independent
  2. Isolated
  3. Easy to understand
6. How is the test coverage?
  1. The candidate has been asked to write tests. We expect it to at least cover all of his/hers code except any model objects or records.
  Prepare for the interview. The candidate has put time and effort into this test and he/she deserves some feedback.
7. How does the work log / git history look like?
  1. Has the candidate motivated his choices in a good way?
