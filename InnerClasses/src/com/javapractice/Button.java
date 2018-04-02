package com.javapractice;

public class Button {
    private String title;
    private OnClickListener onClickListner;

    public Button(String tittle) {
        this.title = tittle;
    }

    public String getTittle(){
        return title;
    }

    public void setOnClickListner(OnClickListener onClickListner){
        this.onClickListner = onClickListner;
    }

    public void onClick(){
        this.onClickListner.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
