# mobODF1
We use this repository to practice coding using TDD and Mob programming approaches 

# [What is MOB](https://www.remotemobprogramming.org/)

# Preparing MOB env

1. Clone this repo
2. Install [Scoop](https://scoop.sh/#/)
3. Install mob
   1.  `scoop install mob`


# Mobbing
The mob session starts with selecting a driver who will share his/her screen for an agreed amount of time and everyone else is a navigator who will focus on thinking about the problem in hand and will guide the driver through the coding.

From this repo directory the driver will type:

`mob start 10`

This will checkout to a work branch and trigger a 10m timer.

When the timer is up, the driver will let the team know and will type:

`mob next`

This will commit and push any change to the branch.

The following driver will begin to share their screen, and the cycle starts again.

Once the exercise is complete, the last driver will type:

`mobe done`

Changes will be staged in the main branch, and the driver needs to commit and push them to finish the exercise.
   
