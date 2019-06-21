package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;

public abstract interface IStatusCallback extends IInterface
{
  public abstract void onResult(Status paramStatus);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.IStatusCallback
 * JD-Core Version:    0.6.2
 */