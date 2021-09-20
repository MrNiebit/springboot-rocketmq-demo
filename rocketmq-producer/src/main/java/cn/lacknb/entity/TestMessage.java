package cn.lacknb.entity;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/9/20 4:16 下午
 **/
public class TestMessage {

    private String msgId;

    private String content;

    @Override
    public String toString() {
        return "TestMessage{" +
                "msgId='" + msgId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
