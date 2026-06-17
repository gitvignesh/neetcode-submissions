class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy_index = 0
        max_profit = 0

        for sell_index, price in enumerate(prices):
            current_profit = price - prices[buy_index]
        
            if current_profit < 0:
                # Found a new lower price to buy at
                buy_index = sell_index
            else:
                # Update max profit if current transaction is better
                 max_profit = max(max_profit, current_profit)

        return max_profit