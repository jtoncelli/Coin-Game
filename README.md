# Coin-Game
An interactive game to play against the computer from one of my first programming classes. 

-----------------------
### Rules

I'm not sure what the game is called, but it is an interesting programming challenge. The game in real life consists of 23 coins on a table and two players, and the winner is whoever does not pick up the last coin. During a move, a player can either pick up one or two coins. The number of coins used can be changed to however many you want, and the rules and strategy apply the same. Using the correct strategy can ensure victory. 

There are many iterations of this game in which a player can take 1, 2, 3, or even more each turn, but the principal strategy remains the same. 

-----------------------

### Strategy

Before considering 23 coins, think about the base case. To win, you need to leave only 1 coin left to be picked up by your opponent. Because you can either pick up 1 or 2 coins per turn, the number of coins immediety before your victory is either 2 or 3. Therefore, you want to try to guarentee that at the end of the game, you will be left with 2 or 3 coins in order to corner the opponent into losing. 


Now that you understand the winning conditions, think about having 4 coins left. 

If the opponent takes 1, you are left with 3 and you win!

If the opponent takes 2, you are left with 2 and you win!

Therefore, you need to guarentee that you leave your opponent with 4 coins to choose from, but how do you do this?


In a game with 7 coins, your ideal situation is to have the opponent make a turn with 4 coins left. To meet this condition, they have to move first, and they can take 1 or 2 coins. In response, you will take the opposite amount that they have. If they pick up 1 coin, you pick up 2. If they pick up 2 coins, you take 1. Doing this puts you in a winning situation. 



You now understand how to win with 2, 3, 4 and 7 coins, and these principles can be applied to games with more coins as well. If it is the opponent's turn with 7 coins left, you know how to win, so you just need to get there. You can apply the same strategy of doing the opposite move as your opponent to any multiple of 3 added to 4, and you will result with the winning condition of 4 coins with your opponent's move. 

-----------

## Summary

**In order to guarentee victory, you have to try to leave your opponent with any multiple of 3 added to 4, and remove the opposite number of coins as them for every move.** 

In a 23-coin game, you want to move first to take 1 coin, leaving your opponent with 22 coins, which is 18 + 4, or (3 * 6) + 4. For every move following this one, you simply do the opposite as your opponent, and you will win!

If you do not move first, you should try to get your opponent to slip up, and take back the advantage. If they know the strategy, then you have no possibility of winning. If they don't, then try to reproduce the winning conditions in your favor, but there is no guarentee that you will win. 








