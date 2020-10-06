#include <stdio.h>
#include <string.h>

int majorityElement(int* nums, int numsSize){

    int max = 0;
    int index = -1;
    for(int i = 0; i < numsSize-1; i++){
        int count = 0;
        for(int j = i+1; j < numsSize; j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
        if(count > max){
            max = count;
            index = i;
        }
    }
    
    
    return nums[index];
}