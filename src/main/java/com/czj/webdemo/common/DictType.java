package com.czj.webdemo.common;


/**
 * 枚举类
 */

public enum DictType {

    DC_STATUS_1("1","草稿","DC_STATUS"),
    DC_STATUS_2("2","待审","DC_STATUS");


    private String code;
    private String detail;
    private String type;
    private DictType(String code, String detail, String type){
        this.code = code;
        this.detail = detail;
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public static DictType getByTypeCode(String type, String code){
        for(DictType dictType :values()){
            if(dictType.getType().equals(type) && dictType.getCode().equals(code)){
                return dictType;
            }
        }
        return null;
    }

    /**
     * 通过type跟code获取中文描述
     * @param type 类型
     * @param code 数值
     * @return
     */
    public static String getDetailByTypeCode(String type, String code){
        for(DictType dictType :values()){
            if(dictType.getType()==type && dictType.getCode().equals(code)){
                return dictType.getDetail();
            }
        }
        return null;
    }


}
