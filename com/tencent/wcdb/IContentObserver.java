package com.tencent.wcdb;

import android.net.Uri;
import android.os.IInterface;

public abstract interface IContentObserver extends IInterface
{
  public abstract void onChange(boolean paramBoolean, Uri paramUri);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.IContentObserver
 * JD-Core Version:    0.6.2
 */