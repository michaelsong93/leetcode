#include <limits.h>

int reverse(int x){
    long long remaining = 0;
    while(x != 0){
        remaining = remaining * 10;
        remaining = remaining + x % 10;
        x = x / 10;
    }
    if(remaining > INT_MAX || remaining < INT_MIN) return 0;

    return remaining;
}