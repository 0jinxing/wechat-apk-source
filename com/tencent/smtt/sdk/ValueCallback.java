package com.tencent.smtt.sdk;

public abstract interface ValueCallback<T> extends android.webkit.ValueCallback<T>
{
  public abstract void onReceiveValue(T paramT);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ValueCallback
 * JD-Core Version:    0.6.2
 */