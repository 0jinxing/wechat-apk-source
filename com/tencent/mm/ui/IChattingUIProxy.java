package com.tencent.mm.ui;

public abstract interface IChattingUIProxy
{
  public abstract void onEnterBegin();

  public abstract void onEnterEnd();

  public abstract void onExitBegin();

  public abstract void onExitEnd();

  public abstract void onInit(int paramInt, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.IChattingUIProxy
 * JD-Core Version:    0.6.2
 */