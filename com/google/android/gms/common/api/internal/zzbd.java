package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zzbd
  implements zzbp, zzq
{
  private final Context mContext;
  private final Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> zzdh;
  final zzav zzfq;
  private final Lock zzga;
  private final ClientSettings zzgf;
  private final Map<Api<?>, Boolean> zzgi;
  private final GoogleApiAvailabilityLight zzgk;
  final Map<Api.AnyClientKey<?>, Api.Client> zzil;
  private final Condition zziz;
  private final zzbf zzja;
  final Map<Api.AnyClientKey<?>, ConnectionResult> zzjb;
  private volatile zzbc zzjc;
  private ConnectionResult zzjd;
  int zzje;
  final zzbq zzjf;

  public zzbd(Context paramContext, zzav paramzzav, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder, ArrayList<zzp> paramArrayList, zzbq paramzzbq)
  {
    AppMethodBeat.i(60816);
    this.zzjb = new HashMap();
    this.zzjd = null;
    this.mContext = paramContext;
    this.zzga = paramLock;
    this.zzgk = paramGoogleApiAvailabilityLight;
    this.zzil = paramMap;
    this.zzgf = paramClientSettings;
    this.zzgi = paramMap1;
    this.zzdh = paramAbstractClientBuilder;
    this.zzfq = paramzzav;
    this.zzjf = paramzzbq;
    paramContext = (ArrayList)paramArrayList;
    int i = paramContext.size();
    int j = 0;
    while (j < i)
    {
      paramzzav = paramContext.get(j);
      j++;
      ((zzp)paramzzav).zza(this);
    }
    this.zzja = new zzbf(this, paramLooper);
    this.zziz = paramLock.newCondition();
    this.zzjc = new zzau(this);
    AppMethodBeat.o(60816);
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect()
  {
    AppMethodBeat.i(60820);
    connect();
    ConnectionResult localConnectionResult;
    while (true)
      if (isConnecting())
        try
        {
          this.zziz.await();
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          localConnectionResult = new ConnectionResult(15, null);
          AppMethodBeat.o(60820);
        }
    while (true)
    {
      return localConnectionResult;
      if (isConnected())
      {
        localConnectionResult = ConnectionResult.RESULT_SUCCESS;
        AppMethodBeat.o(60820);
      }
      else if (this.zzjd != null)
      {
        localConnectionResult = this.zzjd;
        AppMethodBeat.o(60820);
      }
      else
      {
        localConnectionResult = new ConnectionResult(13, null);
        AppMethodBeat.o(60820);
      }
    }
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(60821);
    connect();
    paramLong = paramTimeUnit.toNanos(paramLong);
    if (isConnecting())
      if (paramLong > 0L);
    while (true)
    {
      try
      {
        disconnect();
        paramTimeUnit = new com/google/android/gms/common/ConnectionResult;
        paramTimeUnit.<init>(14, null);
        AppMethodBeat.o(60821);
        return paramTimeUnit;
        paramLong = this.zziz.awaitNanos(paramLong);
      }
      catch (InterruptedException paramTimeUnit)
      {
        Thread.currentThread().interrupt();
        paramTimeUnit = new ConnectionResult(15, null);
        AppMethodBeat.o(60821);
        continue;
      }
      if (isConnected())
      {
        paramTimeUnit = ConnectionResult.RESULT_SUCCESS;
        AppMethodBeat.o(60821);
      }
      else if (this.zzjd != null)
      {
        paramTimeUnit = this.zzjd;
        AppMethodBeat.o(60821);
      }
      else
      {
        paramTimeUnit = new ConnectionResult(13, null);
        AppMethodBeat.o(60821);
      }
    }
  }

  @GuardedBy("mLock")
  public final void connect()
  {
    AppMethodBeat.i(60819);
    this.zzjc.connect();
    AppMethodBeat.o(60819);
  }

  @GuardedBy("mLock")
  public final void disconnect()
  {
    AppMethodBeat.i(60822);
    if (this.zzjc.disconnect())
      this.zzjb.clear();
    AppMethodBeat.o(60822);
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    AppMethodBeat.i(60833);
    String str = String.valueOf(paramString).concat("  ");
    paramPrintWriter.append(paramString).append("mState=").println(this.zzjc);
    Iterator localIterator = this.zzgi.keySet().iterator();
    while (localIterator.hasNext())
    {
      Api localApi = (Api)localIterator.next();
      paramPrintWriter.append(paramString).append(localApi.getName()).println(":");
      ((Api.Client)this.zzil.get(localApi.getClientKey())).dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    AppMethodBeat.o(60833);
  }

  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    AppMethodBeat.i(60817);
    paramT.zzx();
    paramT = this.zzjc.enqueue(paramT);
    AppMethodBeat.o(60817);
    return paramT;
  }

  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    AppMethodBeat.i(60818);
    paramT.zzx();
    paramT = this.zzjc.execute(paramT);
    AppMethodBeat.o(60818);
    return paramT;
  }

  @GuardedBy("mLock")
  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    AppMethodBeat.i(60823);
    paramApi = paramApi.getClientKey();
    if (this.zzil.containsKey(paramApi))
      if (((Api.Client)this.zzil.get(paramApi)).isConnected())
      {
        paramApi = ConnectionResult.RESULT_SUCCESS;
        AppMethodBeat.o(60823);
      }
    while (true)
    {
      return paramApi;
      if (this.zzjb.containsKey(paramApi))
      {
        paramApi = (ConnectionResult)this.zzjb.get(paramApi);
        AppMethodBeat.o(60823);
      }
      else
      {
        paramApi = null;
        AppMethodBeat.o(60823);
      }
    }
  }

  public final boolean isConnected()
  {
    return this.zzjc instanceof zzag;
  }

  public final boolean isConnecting()
  {
    return this.zzjc instanceof zzaj;
  }

  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    return false;
  }

  public final void maybeSignOut()
  {
  }

  public final void onConnected(Bundle paramBundle)
  {
    AppMethodBeat.i(60829);
    this.zzga.lock();
    try
    {
      this.zzjc.onConnected(paramBundle);
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60829);
    }
    throw paramBundle;
  }

  public final void onConnectionSuspended(int paramInt)
  {
    AppMethodBeat.i(60830);
    this.zzga.lock();
    try
    {
      this.zzjc.onConnectionSuspended(paramInt);
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60830);
    }
  }

  public final void zza(ConnectionResult paramConnectionResult, Api<?> paramApi, boolean paramBoolean)
  {
    AppMethodBeat.i(60828);
    this.zzga.lock();
    try
    {
      this.zzjc.zza(paramConnectionResult, paramApi, paramBoolean);
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60828);
    }
    throw paramConnectionResult;
  }

  final void zza(zzbe paramzzbe)
  {
    AppMethodBeat.i(60831);
    paramzzbe = this.zzja.obtainMessage(1, paramzzbe);
    this.zzja.sendMessage(paramzzbe);
    AppMethodBeat.o(60831);
  }

  final void zzb(RuntimeException paramRuntimeException)
  {
    AppMethodBeat.i(60832);
    paramRuntimeException = this.zzja.obtainMessage(2, paramRuntimeException);
    this.zzja.sendMessage(paramRuntimeException);
    AppMethodBeat.o(60832);
  }

  final void zzbc()
  {
    AppMethodBeat.i(60824);
    this.zzga.lock();
    try
    {
      zzaj localzzaj = new com/google/android/gms/common/api/internal/zzaj;
      localzzaj.<init>(this, this.zzgf, this.zzgi, this.zzgk, this.zzdh, this.zzga, this.mContext);
      this.zzjc = localzzaj;
      this.zzjc.begin();
      this.zziz.signalAll();
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60824);
    }
  }

  final void zzbd()
  {
    AppMethodBeat.i(60825);
    this.zzga.lock();
    try
    {
      this.zzfq.zzaz();
      zzag localzzag = new com/google/android/gms/common/api/internal/zzag;
      localzzag.<init>(this);
      this.zzjc = localzzag;
      this.zzjc.begin();
      this.zziz.signalAll();
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60825);
    }
  }

  final void zzf(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60826);
    this.zzga.lock();
    try
    {
      this.zzjd = paramConnectionResult;
      paramConnectionResult = new com/google/android/gms/common/api/internal/zzau;
      paramConnectionResult.<init>(this);
      this.zzjc = paramConnectionResult;
      this.zzjc.begin();
      this.zziz.signalAll();
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60826);
    }
    throw paramConnectionResult;
  }

  @GuardedBy("mLock")
  public final void zzz()
  {
    AppMethodBeat.i(60827);
    if (isConnected())
      ((zzag)this.zzjc).zzap();
    AppMethodBeat.o(60827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbd
 * JD-Core Version:    0.6.2
 */