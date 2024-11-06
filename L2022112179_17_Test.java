import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class L2022112179_17_Test {

    // 测试用例设计原则：等价类划分
    // 1. 正常情况：输入字符串长度大于10，且存在重复的长度为10的子串。
    // 2. 边界情况：输入字符串长度正好为10，且没有重复子串。
    // 3. 特殊情况：输入字符串长度小于10。
    // 4. 重复情况：输入字符串中所有字符相同。

    @Test
    public void testNormalCase() {
        // 测试目的：验证正常情况下的功能
        // 测试用例：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        Solution solution17 = new Solution();
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> result = solution17.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testBoundaryCase() {
        // 测试目的：验证边界情况下的功能
        // 测试用例：s = "ACGTACGTAC"
        Solution solution17 = new Solution();
        List<String> expected = new ArrayList<>();
        List<String> result = solution17.findRepeatedDnaSequences("ACGTACGTAC");
        assertEquals(expected, result);
    }

    @Test
    public void testSpecialCase() {
        // 测试目的：验证特殊情况下的功能
        // 测试用例：s = "ACGT"
        Solution solution17 = new Solution();
        List<String> expected = new ArrayList<>();
        List<String> result = solution17.findRepeatedDnaSequences("ACGT");
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatCase() {
        // 测试目的：验证重复情况下的功能
        // 测试用例：s = "AAAAAAAAAAAAA"
        Solution solution17 = new Solution();
        List<String> expected = Arrays.asList("AAAAAAAAAA");
        List<String> result = solution17.findRepeatedDnaSequences("AAAAAAAAAAAAA");
        assertEquals(expected, result);
    }
} 