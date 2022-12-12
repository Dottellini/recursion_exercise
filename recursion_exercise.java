boolean isPalindrome(char[] array, int index) {
    if(array.length == 0 || array.length == 1) return true;

    if(index == array.length / 2) return true;
    if(array[index] == array[array.length-1-index]) {
        return isPalindrome(array, index+1);
    }

    return false;
}

/////////////////////////
void collatz(int n) {
    System.out.println(n);
    if(n == 1) {
        return;
    }
    else if(n % 2 == 0) {
        collatz(n/2);
    } else {
        collatz(n * 3 + 1);
    }
}


/////////////////////////
void triangleSum(int[] numbers) {
    printArray(numbers, new int[numbers.length - 1], 0);
    System.out.println(Arrays.toString(numbers));
}

void printArray(int[] array, int[] tmp, int index) {
    if(array.length == 1) return;

    if(index < tmp.length) {
        tmp[index] = array[index] + array[index + 1];
        printArray(array, tmp, index + 1);
    }
    
    if(index == array.length - 1)
        triangleSum(tmp);
}