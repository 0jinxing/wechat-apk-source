package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager
  implements Handler.Callback
{
  private final Handler mHandler;
  private final Object mLock;
  private final GmsClientEventState zztf;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> zztg;

  @VisibleForTesting
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> zzth;
  private final ArrayList<GoogleApiClient.OnConnectionFailedListener> zzti;
  private volatile boolean zztj;
  private final AtomicInteger zztk;
  private boolean zztl;

  public GmsClientEventManager(Looper paramLooper, GmsClientEventState paramGmsClientEventState)
  {
    AppMethodBeat.i(61334);
    this.zztg = new ArrayList();
    this.zzth = new ArrayList();
    this.zzti = new ArrayList();
    this.zztj = false;
    this.zztk = new AtomicInteger(0);
    this.zztl = false;
    this.mLock = new Object();
    this.zztf = paramGmsClientEventState;
    this.mHandler = new Handler(paramLooper, this);
    AppMethodBeat.o(61334);
  }

  public final boolean areCallbacksEnabled()
  {
    return this.zztj;
  }

  public final void disableCallbacks()
  {
    AppMethodBeat.i(61335);
    this.zztj = false;
    this.zztk.incrementAndGet();
    AppMethodBeat.o(61335);
  }

  public final void enableCallbacks()
  {
    this.zztj = true;
  }

  public final boolean handleMessage(Message arg1)
  {
    AppMethodBeat.i(61346);
    GoogleApiClient.ConnectionCallbacks localConnectionCallbacks;
    if (???.what == 1)
      localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)???.obj;
    while (true)
    {
      synchronized (this.mLock)
      {
        if ((this.zztj) && (this.zztf.isConnected()) && (this.zztg.contains(localConnectionCallbacks)))
          localConnectionCallbacks.onConnected(this.zztf.getConnectionHint());
        AppMethodBeat.o(61346);
        bool = true;
        return bool;
      }
      int i = ???.what;
      Log.wtf("GmsClientEvents", 45 + "Don't know how to handle message: " + i, new Exception());
      boolean bool = false;
      AppMethodBeat.o(61346);
    }
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(61341);
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      boolean bool = this.zztg.contains(paramConnectionCallbacks);
      AppMethodBeat.o(61341);
      return bool;
    }
  }

  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(61344);
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      boolean bool = this.zzti.contains(paramOnConnectionFailedListener);
      AppMethodBeat.o(61344);
      return bool;
    }
  }

  @VisibleForTesting
  public final void onConnectionFailure(ConnectionResult paramConnectionResult)
  {
    int i = 0;
    AppMethodBeat.i(61339);
    boolean bool;
    if (Looper.myLooper() == this.mHandler.getLooper())
    {
      bool = true;
      Preconditions.checkState(bool, "onConnectionFailure must only be called on the Handler thread");
      this.mHandler.removeMessages(1);
    }
    while (true)
    {
      synchronized (this.mLock)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(this.zzti);
        int j = this.zztk.get();
        localArrayList = (ArrayList)localArrayList;
        int k = localArrayList.size();
        if (i < k)
        {
          Object localObject2 = localArrayList.get(i);
          int m = i + 1;
          localObject2 = (GoogleApiClient.OnConnectionFailedListener)localObject2;
          if ((!this.zztj) || (this.zztk.get() != j))
          {
            AppMethodBeat.o(61339);
            return;
            bool = false;
            break;
          }
          i = m;
          if (!this.zzti.contains(localObject2))
            continue;
          ((GoogleApiClient.OnConnectionFailedListener)localObject2).onConnectionFailed(paramConnectionResult);
          i = m;
        }
      }
      AppMethodBeat.o(61339);
    }
  }

  @VisibleForTesting
  protected final void onConnectionSuccess()
  {
    AppMethodBeat.i(61336);
    synchronized (this.mLock)
    {
      onConnectionSuccess(this.zztf.getConnectionHint());
      AppMethodBeat.o(61336);
      return;
    }
  }

  @VisibleForTesting
  public final void onConnectionSuccess(Bundle paramBundle)
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(61337);
    boolean bool2;
    if (Looper.myLooper() == this.mHandler.getLooper())
    {
      bool2 = true;
      Preconditions.checkState(bool2, "onConnectionSuccess must only be called on the Handler thread");
    }
    while (true)
    {
      synchronized (this.mLock)
      {
        if (this.zztl)
          break label227;
        bool2 = true;
        Preconditions.checkState(bool2);
        this.mHandler.removeMessages(1);
        this.zztl = true;
        if (this.zzth.size() != 0)
          break label233;
        bool2 = bool1;
        Preconditions.checkState(bool2);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(this.zztg);
        int j = this.zztk.get();
        localArrayList = (ArrayList)localArrayList;
        int k = localArrayList.size();
        if (i >= k)
          break label239;
        Object localObject2 = localArrayList.get(i);
        int m = i + 1;
        localObject2 = (GoogleApiClient.ConnectionCallbacks)localObject2;
        if ((!this.zztj) || (!this.zztf.isConnected()) || (this.zztk.get() != j))
          break label239;
        i = m;
        if (this.zzth.contains(localObject2))
          continue;
        ((GoogleApiClient.ConnectionCallbacks)localObject2).onConnected(paramBundle);
        i = m;
      }
      bool2 = false;
      break;
      label227: bool2 = false;
      continue;
      label233: bool2 = false;
    }
    label239: this.zzth.clear();
    this.zztl = false;
    AppMethodBeat.o(61337);
  }

  @VisibleForTesting
  public final void onUnintentionalDisconnection(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(61338);
    if (Looper.myLooper() == this.mHandler.getLooper());
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
      this.mHandler.removeMessages(1);
      synchronized (this.mLock)
      {
        this.zztl = true;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(this.zztg);
        int j = this.zztk.get();
        localArrayList = (ArrayList)localArrayList;
        int k = localArrayList.size();
        Object localObject3;
        int m;
        do
        {
          if (i >= k)
            break;
          localObject3 = localArrayList.get(i);
          m = i + 1;
          localObject3 = (GoogleApiClient.ConnectionCallbacks)localObject3;
          if ((!this.zztj) || (this.zztk.get() != j))
            break;
          i = m;
        }
        while (!this.zztg.contains(localObject3));
        ((GoogleApiClient.ConnectionCallbacks)localObject3).onConnectionSuspended(paramInt);
        i = m;
      }
    }
    this.zzth.clear();
    this.zztl = false;
    AppMethodBeat.o(61338);
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(61340);
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      if (this.zztg.contains(paramConnectionCallbacks))
      {
        String str = String.valueOf(paramConnectionCallbacks);
        int i = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 62);
        localStringBuilder.append("registerConnectionCallbacks(): listener ").append(str).append(" is already registered");
        if (this.zztf.isConnected())
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramConnectionCallbacks));
        AppMethodBeat.o(61340);
        return;
      }
      this.zztg.add(paramConnectionCallbacks);
    }
  }

  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(61343);
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      if (this.zzti.contains(paramOnConnectionFailedListener))
      {
        String str = String.valueOf(paramOnConnectionFailedListener);
        int i = String.valueOf(str).length();
        paramOnConnectionFailedListener = new java/lang/StringBuilder;
        paramOnConnectionFailedListener.<init>(i + 67);
        paramOnConnectionFailedListener.append("registerConnectionFailedListener(): listener ").append(str).append(" is already registered");
        AppMethodBeat.o(61343);
        return;
      }
      this.zzti.add(paramOnConnectionFailedListener);
    }
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(61342);
    Preconditions.checkNotNull(paramConnectionCallbacks);
    synchronized (this.mLock)
    {
      if (!this.zztg.remove(paramConnectionCallbacks))
      {
        paramConnectionCallbacks = String.valueOf(paramConnectionCallbacks);
        i = String.valueOf(paramConnectionCallbacks).length();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 52);
        localStringBuilder.append("unregisterConnectionCallbacks(): listener ").append(paramConnectionCallbacks).append(" not found");
      }
      while (!this.zztl)
      {
        int i;
        StringBuilder localStringBuilder;
        AppMethodBeat.o(61342);
        return;
      }
      this.zzth.add(paramConnectionCallbacks);
    }
  }

  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(61345);
    Preconditions.checkNotNull(paramOnConnectionFailedListener);
    synchronized (this.mLock)
    {
      if (!this.zzti.remove(paramOnConnectionFailedListener))
      {
        String str = String.valueOf(paramOnConnectionFailedListener);
        int i = String.valueOf(str).length();
        paramOnConnectionFailedListener = new java/lang/StringBuilder;
        paramOnConnectionFailedListener.<init>(i + 57);
        paramOnConnectionFailedListener.append("unregisterConnectionFailedListener(): listener ").append(str).append(" not found");
      }
      AppMethodBeat.o(61345);
      return;
    }
  }

  @VisibleForTesting
  public static abstract interface GmsClientEventState
  {
    public abstract Bundle getConnectionHint();

    public abstract boolean isConnected();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GmsClientEventManager
 * JD-Core Version:    0.6.2
 */