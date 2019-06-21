package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import android.support.v4.f.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.tasks.Task;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zzw
  implements zzbp
{
  private final Looper zzcn;
  private final GoogleApiManager zzcq;
  private final Lock zzga;
  private final ClientSettings zzgf;
  private final Map<Api.AnyClientKey<?>, zzv<?>> zzgg;
  private final Map<Api.AnyClientKey<?>, zzv<?>> zzgh;
  private final Map<Api<?>, Boolean> zzgi;
  private final zzav zzgj;
  private final GoogleApiAvailabilityLight zzgk;
  private final Condition zzgl;
  private final boolean zzgm;
  private final boolean zzgn;
  private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zzgo;

  @GuardedBy("mLock")
  private boolean zzgp;

  @GuardedBy("mLock")
  private Map<zzh<?>, ConnectionResult> zzgq;

  @GuardedBy("mLock")
  private Map<zzh<?>, ConnectionResult> zzgr;

  @GuardedBy("mLock")
  private zzz zzgs;

  @GuardedBy("mLock")
  private ConnectionResult zzgt;

  public zzw(Context paramContext, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder, ArrayList<zzp> paramArrayList, zzav paramzzav, boolean paramBoolean)
  {
    AppMethodBeat.i(60983);
    this.zzgg = new HashMap();
    this.zzgh = new HashMap();
    this.zzgo = new LinkedList();
    this.zzga = paramLock;
    this.zzcn = paramLooper;
    this.zzgl = paramLock.newCondition();
    this.zzgk = paramGoogleApiAvailabilityLight;
    this.zzgj = paramzzav;
    this.zzgi = paramMap1;
    this.zzgf = paramClientSettings;
    this.zzgm = paramBoolean;
    paramLock = new HashMap();
    paramMap1 = paramMap1.keySet().iterator();
    while (paramMap1.hasNext())
    {
      paramGoogleApiAvailabilityLight = (Api)paramMap1.next();
      paramLock.put(paramGoogleApiAvailabilityLight.getClientKey(), paramGoogleApiAvailabilityLight);
    }
    paramGoogleApiAvailabilityLight = new HashMap();
    paramMap1 = (ArrayList)paramArrayList;
    int i = paramMap1.size();
    int j = 0;
    while (j < i)
    {
      paramArrayList = paramMap1.get(j);
      j++;
      paramArrayList = (zzp)paramArrayList;
      paramGoogleApiAvailabilityLight.put(paramArrayList.mApi, paramArrayList);
    }
    j = 0;
    i = 1;
    int k = 0;
    paramMap1 = paramMap.entrySet().iterator();
    if (paramMap1.hasNext())
    {
      paramArrayList = (Map.Entry)paramMap1.next();
      paramzzav = (Api)paramLock.get(paramArrayList.getKey());
      paramMap = (Api.Client)paramArrayList.getValue();
      if (paramMap.requiresGooglePlayServices())
      {
        if (((Boolean)this.zzgi.get(paramzzav)).booleanValue())
          break label499;
        j = 1;
        k = 1;
      }
    }
    while (true)
    {
      paramzzav = new zzv(paramContext, paramzzav, paramLooper, paramMap, (zzp)paramGoogleApiAvailabilityLight.get(paramzzav), paramClientSettings, paramAbstractClientBuilder);
      this.zzgg.put((Api.AnyClientKey)paramArrayList.getKey(), paramzzav);
      if (paramMap.requiresSignIn())
        this.zzgh.put((Api.AnyClientKey)paramArrayList.getKey(), paramzzav);
      int m = k;
      k = j;
      j = m;
      break;
      i = k;
      m = 0;
      k = j;
      j = i;
      i = m;
      continue;
      if ((k != 0) && (i == 0) && (j == 0));
      for (paramBoolean = true; ; paramBoolean = false)
      {
        this.zzgn = paramBoolean;
        this.zzcq = GoogleApiManager.zzbf();
        AppMethodBeat.o(60983);
        return;
      }
      label499: m = 1;
      k = j;
      j = m;
    }
  }

  private final ConnectionResult zza(Api.AnyClientKey<?> paramAnyClientKey)
  {
    AppMethodBeat.i(60992);
    this.zzga.lock();
    try
    {
      paramAnyClientKey = (zzv)this.zzgg.get(paramAnyClientKey);
      if ((this.zzgq != null) && (paramAnyClientKey != null))
        paramAnyClientKey = (ConnectionResult)this.zzgq.get(paramAnyClientKey.zzm());
      while (true)
      {
        return paramAnyClientKey;
        this.zzga.unlock();
        paramAnyClientKey = null;
        AppMethodBeat.o(60992);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60992);
    }
    throw paramAnyClientKey;
  }

  private final boolean zza(zzv<?> paramzzv, ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(61000);
    boolean bool;
    if ((!paramConnectionResult.isSuccess()) && (!paramConnectionResult.hasResolution()) && (((Boolean)this.zzgi.get(paramzzv.getApi())).booleanValue()) && (paramzzv.zzae().requiresGooglePlayServices()) && (this.zzgk.isUserResolvableError(paramConnectionResult.getErrorCode())))
    {
      bool = true;
      AppMethodBeat.o(61000);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61000);
    }
  }

  private final boolean zzaf()
  {
    AppMethodBeat.i(60995);
    this.zzga.lock();
    try
    {
      boolean bool;
      if (this.zzgp)
      {
        bool = this.zzgm;
        if (bool);
      }
      else
      {
        this.zzga.unlock();
        AppMethodBeat.o(60995);
        bool = false;
      }
      while (true)
      {
        return bool;
        Iterator localIterator = this.zzgh.keySet().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            ConnectionResult localConnectionResult = zza((Api.AnyClientKey)localIterator.next());
            if (localConnectionResult != null)
            {
              bool = localConnectionResult.isSuccess();
              if (bool);
            }
            else
            {
              this.zzga.unlock();
              AppMethodBeat.o(60995);
              bool = false;
              break;
            }
          }
        this.zzga.unlock();
        bool = true;
        AppMethodBeat.o(60995);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60995);
    }
  }

  @GuardedBy("mLock")
  private final void zzag()
  {
    AppMethodBeat.i(60998);
    if (this.zzgf == null)
    {
      this.zzgj.zzim = Collections.emptySet();
      AppMethodBeat.o(60998);
    }
    while (true)
    {
      return;
      HashSet localHashSet = new HashSet(this.zzgf.getRequiredScopes());
      Map localMap = this.zzgf.getOptionalApiSettings();
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        Api localApi = (Api)localIterator.next();
        ConnectionResult localConnectionResult = getConnectionResult(localApi);
        if ((localConnectionResult != null) && (localConnectionResult.isSuccess()))
          localHashSet.addAll(((ClientSettings.OptionalApiSettings)localMap.get(localApi)).mScopes);
      }
      this.zzgj.zzim = localHashSet;
      AppMethodBeat.o(60998);
    }
  }

  @GuardedBy("mLock")
  private final void zzah()
  {
    AppMethodBeat.i(60999);
    while (!this.zzgo.isEmpty())
      execute((BaseImplementation.ApiMethodImpl)this.zzgo.remove());
    this.zzgj.zzb(null);
    AppMethodBeat.o(60999);
  }

  @GuardedBy("mLock")
  private final ConnectionResult zzai()
  {
    AppMethodBeat.i(61001);
    Iterator localIterator = this.zzgg.values().iterator();
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    Object localObject4;
    int k;
    while (true)
      if (localIterator.hasNext())
      {
        Object localObject3 = (zzv)localIterator.next();
        localObject4 = ((GoogleApi)localObject3).getApi();
        localObject3 = ((GoogleApi)localObject3).zzm();
        localObject3 = (ConnectionResult)this.zzgq.get(localObject3);
        if ((!((ConnectionResult)localObject3).isSuccess()) && ((!((Boolean)this.zzgi.get(localObject4)).booleanValue()) || (((ConnectionResult)localObject3).hasResolution()) || (this.zzgk.isUserResolvableError(((ConnectionResult)localObject3).getErrorCode()))))
          if ((((ConnectionResult)localObject3).getErrorCode() == 4) && (this.zzgm))
          {
            k = ((Api)localObject4).zzj().getPriority();
            if ((localObject1 == null) || (i > k))
            {
              i = k;
              localObject1 = localObject3;
            }
          }
          else
          {
            int m = ((Api)localObject4).zzj().getPriority();
            localObject4 = localObject3;
            k = m;
            if (localObject2 != null)
            {
              if (j <= m)
                break label261;
              k = m;
              localObject4 = localObject3;
            }
          }
      }
    while (true)
    {
      j = k;
      localObject2 = localObject4;
      break;
      if ((localObject2 != null) && (localObject1 != null) && (j > i))
        AppMethodBeat.o(61001);
      while (true)
      {
        return localObject1;
        AppMethodBeat.o(61001);
        localObject1 = localObject2;
      }
      label261: localObject4 = localObject2;
      k = j;
    }
  }

  private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean zzb(T paramT)
  {
    AppMethodBeat.i(60986);
    Api.AnyClientKey localAnyClientKey = paramT.getClientKey();
    ConnectionResult localConnectionResult = zza(localAnyClientKey);
    boolean bool;
    if ((localConnectionResult != null) && (localConnectionResult.getErrorCode() == 4))
    {
      paramT.setFailedResult(new Status(4, null, this.zzcq.zza(((zzv)this.zzgg.get(localAnyClientKey)).zzm(), System.identityHashCode(this.zzgj))));
      bool = true;
      AppMethodBeat.o(60986);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60986);
    }
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect()
  {
    AppMethodBeat.i(60988);
    connect();
    ConnectionResult localConnectionResult;
    while (true)
      if (isConnecting())
        try
        {
          this.zzgl.await();
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          localConnectionResult = new ConnectionResult(15, null);
          AppMethodBeat.o(60988);
        }
    while (true)
    {
      return localConnectionResult;
      if (isConnected())
      {
        localConnectionResult = ConnectionResult.RESULT_SUCCESS;
        AppMethodBeat.o(60988);
      }
      else if (this.zzgt != null)
      {
        localConnectionResult = this.zzgt;
        AppMethodBeat.o(60988);
      }
      else
      {
        localConnectionResult = new ConnectionResult(13, null);
        AppMethodBeat.o(60988);
      }
    }
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(60989);
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
        AppMethodBeat.o(60989);
        return paramTimeUnit;
        paramLong = this.zzgl.awaitNanos(paramLong);
      }
      catch (InterruptedException paramTimeUnit)
      {
        Thread.currentThread().interrupt();
        paramTimeUnit = new ConnectionResult(15, null);
        AppMethodBeat.o(60989);
        continue;
      }
      if (isConnected())
      {
        paramTimeUnit = ConnectionResult.RESULT_SUCCESS;
        AppMethodBeat.o(60989);
      }
      else if (this.zzgt != null)
      {
        paramTimeUnit = this.zzgt;
        AppMethodBeat.o(60989);
      }
      else
      {
        paramTimeUnit = new ConnectionResult(13, null);
        AppMethodBeat.o(60989);
      }
    }
  }

  public final void connect()
  {
    AppMethodBeat.i(60987);
    this.zzga.lock();
    try
    {
      boolean bool = this.zzgp;
      if (bool);
      while (true)
      {
        return;
        this.zzgp = true;
        this.zzgq = null;
        this.zzgr = null;
        this.zzgs = null;
        this.zzgt = null;
        this.zzcq.zzr();
        Task localTask = this.zzcq.zza(this.zzgg.values());
        HandlerExecutor localHandlerExecutor = new com/google/android/gms/common/util/concurrent/HandlerExecutor;
        localHandlerExecutor.<init>(this.zzcn);
        zzy localzzy = new com/google/android/gms/common/api/internal/zzy;
        localzzy.<init>(this, null);
        localTask.addOnCompleteListener(localHandlerExecutor, localzzy);
        this.zzga.unlock();
        AppMethodBeat.o(60987);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60987);
    }
  }

  public final void disconnect()
  {
    AppMethodBeat.i(60990);
    this.zzga.lock();
    try
    {
      this.zzgp = false;
      this.zzgq = null;
      this.zzgr = null;
      if (this.zzgs != null)
      {
        this.zzgs.cancel();
        this.zzgs = null;
      }
      this.zzgt = null;
      while (!this.zzgo.isEmpty())
      {
        BaseImplementation.ApiMethodImpl localApiMethodImpl = (BaseImplementation.ApiMethodImpl)this.zzgo.remove();
        localApiMethodImpl.zza(null);
        localApiMethodImpl.cancel();
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60990);
    }
    this.zzgl.signalAll();
    this.zzga.unlock();
    AppMethodBeat.o(60990);
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
  }

  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    AppMethodBeat.i(60984);
    if ((this.zzgm) && (zzb(paramT)))
      AppMethodBeat.o(60984);
    while (true)
    {
      return paramT;
      if (!isConnected())
      {
        this.zzgo.add(paramT);
        AppMethodBeat.o(60984);
      }
      else
      {
        this.zzgj.zzir.zzb(paramT);
        paramT = ((zzv)this.zzgg.get(paramT.getClientKey())).doRead(paramT);
        AppMethodBeat.o(60984);
      }
    }
  }

  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    AppMethodBeat.i(60985);
    Api.AnyClientKey localAnyClientKey = paramT.getClientKey();
    if ((this.zzgm) && (zzb(paramT)))
      AppMethodBeat.o(60985);
    while (true)
    {
      return paramT;
      this.zzgj.zzir.zzb(paramT);
      paramT = ((zzv)this.zzgg.get(localAnyClientKey)).doWrite(paramT);
      AppMethodBeat.o(60985);
    }
  }

  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    AppMethodBeat.i(60991);
    paramApi = zza(paramApi.getClientKey());
    AppMethodBeat.o(60991);
    return paramApi;
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(60993);
    this.zzga.lock();
    try
    {
      if (this.zzgq != null)
      {
        ConnectionResult localConnectionResult = this.zzgt;
        if (localConnectionResult == null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60993);
    }
  }

  public final boolean isConnecting()
  {
    AppMethodBeat.i(60994);
    this.zzga.lock();
    try
    {
      if (this.zzgq == null)
      {
        bool = this.zzgp;
        if (bool)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60994);
    }
  }

  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    AppMethodBeat.i(60996);
    this.zzga.lock();
    try
    {
      if ((this.zzgp) && (!zzaf()))
      {
        this.zzcq.zzr();
        Object localObject = new com/google/android/gms/common/api/internal/zzz;
        ((zzz)localObject).<init>(this, paramSignInConnectionListener);
        this.zzgs = ((zzz)localObject);
        localObject = this.zzcq.zza(this.zzgh.values());
        paramSignInConnectionListener = new com/google/android/gms/common/util/concurrent/HandlerExecutor;
        paramSignInConnectionListener.<init>(this.zzcn);
        ((Task)localObject).addOnCompleteListener(paramSignInConnectionListener, this.zzgs);
        this.zzga.unlock();
        return bool;
      }
      this.zzga.unlock();
      boolean bool = false;
      AppMethodBeat.o(60996);
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60996);
    }
  }

  public final void maybeSignOut()
  {
    AppMethodBeat.i(60997);
    this.zzga.lock();
    try
    {
      this.zzcq.maybeSignOut();
      if (this.zzgs != null)
      {
        this.zzgs.cancel();
        this.zzgs = null;
      }
      if (this.zzgr == null)
      {
        localObject1 = new android/support/v4/f/a;
        ((a)localObject1).<init>(this.zzgh.size());
        this.zzgr = ((Map)localObject1);
      }
      ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
      localConnectionResult.<init>(4);
      Object localObject1 = this.zzgh.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        zzv localzzv = (zzv)((Iterator)localObject1).next();
        this.zzgr.put(localzzv.zzm(), localConnectionResult);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60997);
    }
    if (this.zzgq != null)
      this.zzgq.putAll(this.zzgr);
    this.zzga.unlock();
    AppMethodBeat.o(60997);
  }

  public final void zzz()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzw
 * JD-Core Version:    0.6.2
 */