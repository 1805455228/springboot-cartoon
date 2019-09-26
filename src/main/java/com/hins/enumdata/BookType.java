package com.hins.enumdata;

/**
 * @author qixuan.chen
 * @date 2019-09-25 21:56
 */
public enum BookType {

    SERIALIZED(0,"连载中"),
    FINISH(1,"已完结");

    private int value;
    private String text;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    BookType(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 自己定义一个静态方法,通过code返回枚举常量对象
     * @return
     */
    public static BookType getValue(int value){

        for (BookType mo : values()) {
            if(mo.getValue()== value){
                return mo;
            }
        }
        return null;
    }

}
