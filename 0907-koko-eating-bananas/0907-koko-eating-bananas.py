class Solution(object):
    def minEatingSpeed(self, piles, h):
        import math
        l, r = 1, max(piles)

        while l < r:
            k = (l + r) // 2
            hours = 0
            for p in piles:
                hours += math.ceil(float(p) / k)

            if hours <= h:
                r = k  
            else:
                l = k + 1  

        return l