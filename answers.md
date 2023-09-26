## CS 520 In class exercise 1 answers
By Patrick Walsh, Matthew Lips

Link to our repository: https://github.com/pw42020/ie1-basic-stats

---
## Questions
### Question 1
1. In the basic-stats folder in the main (previously called master) branch, how many commits does the README.md file have?

After checking out [the history of the README.md file on GitHub](https://github.com/pw42020/ie1-basic-stats/commits/master/README.md), it is clear that there are 16 total commits in main/master for the README.md file.

2. For the README.md file, what is the set of the different authors of its commits?

The different authors for the commits, also found by looking in the same place above, are "brunyuriy", "rjust", and "DeveloperTommy"

3. For the README.md file, what is the hash of the commit that mentions the ant build tool?

From the same history link on GitHub, the "added more info about Ant" hash can be found to be `c2111cc0d37bfde779a317e533d3a5e68b8ed9e3`.

4. How many total commits have been made in the repository across all branches?

To add all of the commits that have been made in the repository across all branches, viewing the [branches commit section](https://github.com/LASER-UMASS/basic-stats/branches/all) on GitHub, we can see all commits on all branches other than main, and how many branches they are ahead of main as well.

Main has a total of 53 commits, and we can also add any amount of commits each branch is ahead of main as well. `v5.0.0` is ahead of main by 30 commits, `v4.0.0` is ahead of main by 24 commits, `v3.0.0` is ahead of main by 13 commits, `v2.0.0` is ahead of main by 5 commits, and `feature-branch` is ahead of main by 16 commits.

$$53+30+24+13+5+16 = 141$$

total commits.

5. List the files modified in the commit with the hash `01da475`.

By taking a look at the [commit page on GitHub](https://github.com/LASER-UMASS/basic-stats/commit/01da475b0395fa18b773e68b93721dae4caf651b) for the hash `01da475`, we find that
- src/Models/Model.java
- src/Models/Numbers.java
- src/Views/AddNumView.java
- src/Views/MeanView.java
- src/Views/MedianView.java
- src/Views/ModeView.java
- src/Views/NumbersView.java
- and src/Views/ResetView.java

were all updated in this commit.

6. What is the most recent commit in the main branch?

The most recent commit in the main branch is hash `da90e878188c6de8870581bdb447299821d7e87b` that is labelled "Updated README.md" on October 31st, 2017.

### Question 2