package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.SimpleClient;

public abstract class BaseSimpleClient<T extends IInterface>
  implements Api.SimpleClient<T>
{
  private final Context mContext;
  private final Object mLock = new Object();
  private int mState = 1;
  private T zzrj = null;

  public BaseSimpleClient(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public Context getContext()
  {
    return this.mContext;
  }

  public Feature[] getRequiredFeatures()
  {
    return new Feature[0];
  }

  public T getService()
  {
    synchronized (this.mLock)
    {
      if (this.mState == 5)
      {
        DeadObjectException localDeadObjectException = new android/os/DeadObjectException;
        localDeadObjectException.<init>();
        throw localDeadObjectException;
      }
    }
    Object localObject3;
    if (this.mState != 4)
    {
      localObject3 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject3).<init>("Not connected. Call connect() and wait for onConnected() to be called.");
      throw ((Throwable)localObject3);
    }
    if (this.zzrj != null);
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "Client is connected but service is null");
      localObject3 = this.zzrj;
      return localObject3;
    }
  }

  public void setState(int paramInt, T paramT)
  {
    synchronized (this.mLock)
    {
      this.mState = paramInt;
      this.zzrj = paramT;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.BaseSimpleClient
 * JD-Core Version:    0.6.2
 */