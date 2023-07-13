package validator;

import static validator.ErrorMessage.*;

import java.util.List;

public class ExceptionController {

    public static void noIntegerValueException(String numbers){
        for(char number : numbers.toCharArray()){
            int isIntger = number - '0';
            if(isIntger<0 || isIntger>9){
                throw new IllegalArgumentException(NOT_INTAGER_ERROR_MESSAGE.getMessage());
            }
        }
    }

    public static void noValidAmountException(String amount){
        if(Integer.parseInt(amount)%1000 != 0){
            throw new IllegalArgumentException(NOT_THOUSAND_ERROR_MESSAGE.getMessage());
        }
    }

    public static void noValidLottoNumberException(int number){
        if(number<1 || number>45){
            throw new IllegalArgumentException(NOT_OUTRANGE_NUMBER_ERROR_MESSAGE.getMessage());
        }
    }

    public static void overlapNumberException(List<Integer> winningNumberList, int correctInteger){
        if(winningNumberList.contains(correctInteger)){
            throw new IllegalArgumentException(OVERLAP_NUMBER_ERROR_MESSAGE.getMessage());
        }
    }

    public static void noValidDigitExecption(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(INPUT_SIXDIGIT_NUMBER.getMessage());
        }
    }
}