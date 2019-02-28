package whu.iss.insurance.dto;

/**
 * @author RickZhou
 * Create by RickZhou on 2019/2/27
 * 这个类是用于后端和前端数据交互
 * 对传输的数据进行封装
 */
public class Result {
    private boolean result;
    private Object data;
    private String reason;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
