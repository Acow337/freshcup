package sast.freshcup.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sast.freshcup.common.enums.ErrorEnum;

/**
 * @author: 風楪fy
 * @create: 2022-01-15 17:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Boolean success;
    private String errMsg;
    private Integer errCode;
    private T data;

    public static <T> Result success(T data) {
        return new Result<T>(true, null, null, data);
    }

    public static <Void> Result failure(String errMsg) {
        return new Result(false, errMsg, 5000, null);
    }

    public static <Void> Result failure(ErrorEnum error) {
        return new Result(false, error.getErrMsg(), error.getErrCode(), null);
    }
}
