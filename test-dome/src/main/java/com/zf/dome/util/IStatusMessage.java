package com.zf.dome.util;

public interface IStatusMessage {
    String getCode();
    String getMessage();

    enum SystemStatus implements IStatusMessage {

        /**
         * 请求成功
         */
        SUCCESS("1000", "操作成功"),
        ERROR("1001", "网络异常，请稍后重试~"),
        /**
         * 请求失败
         */
        FILE_UPLOAD_NULL("1002","上传图片为空文件"), ;

        private String code;
        private String message;

        SystemStatus(String code, String message) {
            this.code = code;
            this.message = message;
        }

        /**
         * 获取
         * @return
         */
        public String getCode() {
            return this.code;
        }

        /**
         *
         * @return
         */
        public String getMessage() {
            return this.message;
        }
    }
}
