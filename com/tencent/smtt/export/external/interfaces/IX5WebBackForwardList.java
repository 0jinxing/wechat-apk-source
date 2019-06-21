package com.tencent.smtt.export.external.interfaces;

public abstract interface IX5WebBackForwardList
{
  public abstract int getCurrentIndex();

  public abstract IX5WebHistoryItem getCurrentItem();

  public abstract IX5WebHistoryItem getItemAtIndex(int paramInt);

  public abstract int getSize();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList
 * JD-Core Version:    0.6.2
 */