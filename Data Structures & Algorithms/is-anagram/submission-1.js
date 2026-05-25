class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const map=new Map();
        for(const st of s){
            map.set(st,(map.get(st) || 0)+1);
        }
        for(const tt of t){
            if (!map.has(tt)) return false; // char not in s
            map.set(tt,(map.get(tt)-1));
            if(map.get(tt)===0){
                map.delete(tt);
            }
        } 
        return map.size===0;
    }
}
