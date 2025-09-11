class Solution:
    
    def sortVowels(self, s: str) -> str:
        b=[False]*len(s)
        vow=[]
        for i in range(len(s)):
            if(s[i] in "aeiouAEIOU"):
                b[i]=True
                vow.append(s[i])
        vow.sort()
        res=""
        ind=0
        for i in range(len(s)):
            if(b[i]==0):
                res+=s[i]
            else:
                res+=vow[ind]
                ind+=1
        return res
        