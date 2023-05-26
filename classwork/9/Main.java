import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Main {
    public static int flipBit(int value, int bitIndex) {

        return value / Math.pow(10,(String.valueOf(value).length() - bitIndex)) + value;
    }
    public static void main(String[] args) {
    }
}
