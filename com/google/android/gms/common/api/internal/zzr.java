package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.f.a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Lcom.google.android.gms.common.api.Api.AnyClientKey<*>;Lcom.google.android.gms.common.api.Api.Client;>;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class zzr
  implements zzbp
{
  private final Context mContext;
  private final Looper zzcn;
  private final zzav zzfq;
  private final zzbd zzfr;
  private final zzbd zzfs;
  private final Map<Api.AnyClientKey<?>, zzbd> zzft;
  private final Set<SignInConnectionListener> zzfu;
  private final Api.Client zzfv;
  private Bundle zzfw;
  private ConnectionResult zzfx;
  private ConnectionResult zzfy;
  private boolean zzfz;
  private final Lock zzga;

  @GuardedBy("mLock")
  private int zzgb;

  private zzr(Context paramContext, zzav paramzzav, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, Map<Api.AnyClientKey<?>, Api.Client> paramMap2, ClientSettings paramClientSettings, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder, Api.Client paramClient, ArrayList<zzp> paramArrayList1, ArrayList<zzp> paramArrayList2, Map<Api<?>, Boolean> paramMap3, Map<Api<?>, Boolean> paramMap4)
  {
    AppMethodBeat.i(60947);
    this.zzfu = Collections.newSetFromMap(new WeakHashMap());
    this.zzfx = null;
    this.zzfy = null;
    this.zzfz = false;
    this.zzgb = 0;
    this.mContext = paramContext;
    this.zzfq = paramzzav;
    this.zzga = paramLock;
    this.zzcn = paramLooper;
    this.zzfv = paramClient;
    this.zzfr = new zzbd(paramContext, this.zzfq, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap2, null, paramMap4, null, paramArrayList2, new zzt(this, null));
    this.zzfs = new zzbd(paramContext, this.zzfq, paramLock, paramLooper, paramGoogleApiAvailabilityLight, paramMap1, paramClientSettings, paramMap3, paramAbstractClientBuilder, paramArrayList1, new zzu(this, null));
    paramContext = new a();
    paramzzav = paramMap2.keySet().iterator();
    while (paramzzav.hasNext())
      paramContext.put((Api.AnyClientKey)paramzzav.next(), this.zzfr);
    paramzzav = paramMap1.keySet().iterator();
    while (paramzzav.hasNext())
      paramContext.put((Api.AnyClientKey)paramzzav.next(), this.zzfs);
    this.zzft = Collections.unmodifiableMap(paramContext);
    AppMethodBeat.o(60947);
  }

  public static zzr zza(Context paramContext, zzav paramzzav, Lock paramLock, Looper paramLooper, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> paramMap, ClientSettings paramClientSettings, Map<Api<?>, Boolean> paramMap1, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder, ArrayList<zzp> paramArrayList)
  {
    AppMethodBeat.i(60946);
    Object localObject1 = null;
    a locala1 = new a();
    a locala2 = new a();
    Object localObject2 = paramMap.entrySet().iterator();
    paramMap = (Map<Api.AnyClientKey<?>, Api.Client>)localObject1;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject1 = (Api.Client)((Map.Entry)localObject3).getValue();
      if (((Api.Client)localObject1).providesSignIn())
        paramMap = (Map<Api.AnyClientKey<?>, Api.Client>)localObject1;
      if (((Api.Client)localObject1).requiresSignIn())
        locala1.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
      else
        locala2.put((Api.AnyClientKey)((Map.Entry)localObject3).getKey(), localObject1);
    }
    boolean bool;
    Object localObject4;
    if (!locala1.isEmpty())
    {
      bool = true;
      Preconditions.checkState(bool, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
      localObject1 = new a();
      localObject2 = new a();
      localObject4 = paramMap1.keySet().iterator();
    }
    while (true)
      if (((Iterator)localObject4).hasNext())
      {
        localObject3 = (Api)((Iterator)localObject4).next();
        Api.AnyClientKey localAnyClientKey = ((Api)localObject3).getClientKey();
        if (locala1.containsKey(localAnyClientKey))
        {
          ((Map)localObject1).put(localObject3, (Boolean)paramMap1.get(localObject3));
          continue;
          bool = false;
          break;
        }
        if (locala2.containsKey(localAnyClientKey))
        {
          ((Map)localObject2).put(localObject3, (Boolean)paramMap1.get(localObject3));
        }
        else
        {
          paramContext = new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
          AppMethodBeat.o(60946);
          throw paramContext;
        }
      }
    Object localObject3 = new ArrayList();
    paramMap1 = new ArrayList();
    paramArrayList = (ArrayList)paramArrayList;
    int i = paramArrayList.size();
    int j = 0;
    while (j < i)
    {
      localObject4 = paramArrayList.get(j);
      j++;
      localObject4 = (zzp)localObject4;
      if (((Map)localObject1).containsKey(((zzp)localObject4).mApi))
      {
        ((ArrayList)localObject3).add(localObject4);
      }
      else if (((Map)localObject2).containsKey(((zzp)localObject4).mApi))
      {
        paramMap1.add(localObject4);
      }
      else
      {
        paramContext = new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
        AppMethodBeat.o(60946);
        throw paramContext;
      }
    }
    paramContext = new zzr(paramContext, paramzzav, paramLock, paramLooper, paramGoogleApiAvailabilityLight, locala1, locala2, paramClientSettings, paramAbstractClientBuilder, paramMap, (ArrayList)localObject3, paramMap1, (Map)localObject1, (Map)localObject2);
    AppMethodBeat.o(60946);
    return paramContext;
  }

  @GuardedBy("mLock")
  private final void zza(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(60963);
    this.zzfq.zzb(paramInt, paramBoolean);
    this.zzfy = null;
    this.zzfx = null;
    AppMethodBeat.o(60963);
  }

  private final void zza(Bundle paramBundle)
  {
    AppMethodBeat.i(60967);
    if (this.zzfw == null)
    {
      this.zzfw = paramBundle;
      AppMethodBeat.o(60967);
    }
    while (true)
    {
      return;
      if (paramBundle != null)
        this.zzfw.putAll(paramBundle);
      AppMethodBeat.o(60967);
    }
  }

  @GuardedBy("mLock")
  private final void zza(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60961);
    switch (this.zzgb)
    {
    default:
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    case 2:
    case 1:
    }
    while (true)
    {
      this.zzgb = 0;
      AppMethodBeat.o(60961);
      return;
      this.zzfq.zzc(paramConnectionResult);
      zzab();
    }
  }

  private final boolean zza(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> paramApiMethodImpl)
  {
    AppMethodBeat.i(60965);
    paramApiMethodImpl = paramApiMethodImpl.getClientKey();
    Preconditions.checkArgument(this.zzft.containsKey(paramApiMethodImpl), "GoogleApiClient is not configured to use the API required for this call.");
    boolean bool = ((zzbd)this.zzft.get(paramApiMethodImpl)).equals(this.zzfs);
    AppMethodBeat.o(60965);
    return bool;
  }

  @GuardedBy("mLock")
  private final void zzaa()
  {
    AppMethodBeat.i(60960);
    if (zzb(this.zzfx))
      if ((zzb(this.zzfy)) || (zzac()))
        switch (this.zzgb)
        {
        default:
          Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
          this.zzgb = 0;
          AppMethodBeat.o(60960);
        case 2:
        case 1:
        }
    while (true)
    {
      return;
      this.zzfq.zzb(this.zzfw);
      zzab();
      break;
      if (this.zzfy != null)
      {
        if (this.zzgb == 1)
        {
          zzab();
          AppMethodBeat.o(60960);
        }
        else
        {
          zza(this.zzfy);
          this.zzfr.disconnect();
          AppMethodBeat.o(60960);
          continue;
          if ((this.zzfx != null) && (zzb(this.zzfy)))
          {
            this.zzfs.disconnect();
            zza(this.zzfx);
            AppMethodBeat.o(60960);
          }
          else if ((this.zzfx != null) && (this.zzfy != null))
          {
            ConnectionResult localConnectionResult = this.zzfx;
            if (this.zzfs.zzje < this.zzfr.zzje)
              localConnectionResult = this.zzfy;
            zza(localConnectionResult);
          }
        }
      }
      else
        AppMethodBeat.o(60960);
    }
  }

  @GuardedBy("mLock")
  private final void zzab()
  {
    AppMethodBeat.i(60962);
    Iterator localIterator = this.zzfu.iterator();
    while (localIterator.hasNext())
      ((SignInConnectionListener)localIterator.next()).onComplete();
    this.zzfu.clear();
    AppMethodBeat.o(60962);
  }

  @GuardedBy("mLock")
  private final boolean zzac()
  {
    AppMethodBeat.i(60964);
    boolean bool;
    if ((this.zzfy != null) && (this.zzfy.getErrorCode() == 4))
    {
      bool = true;
      AppMethodBeat.o(60964);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60964);
    }
  }

  private final PendingIntent zzad()
  {
    AppMethodBeat.i(60966);
    PendingIntent localPendingIntent;
    if (this.zzfv == null)
    {
      localPendingIntent = null;
      AppMethodBeat.o(60966);
    }
    while (true)
    {
      return localPendingIntent;
      localPendingIntent = PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zzfq), this.zzfv.getSignInIntent(), 134217728);
      AppMethodBeat.o(60966);
    }
  }

  private static boolean zzb(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60968);
    boolean bool;
    if ((paramConnectionResult != null) && (paramConnectionResult.isSuccess()))
    {
      bool = true;
      AppMethodBeat.o(60968);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60968);
    }
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect()
  {
    AppMethodBeat.i(60952);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(60952);
    throw localUnsupportedOperationException;
  }

  @GuardedBy("mLock")
  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(60953);
    paramTimeUnit = new UnsupportedOperationException();
    AppMethodBeat.o(60953);
    throw paramTimeUnit;
  }

  @GuardedBy("mLock")
  public final void connect()
  {
    AppMethodBeat.i(60951);
    this.zzgb = 2;
    this.zzfz = false;
    this.zzfy = null;
    this.zzfx = null;
    this.zzfr.connect();
    this.zzfs.connect();
    AppMethodBeat.o(60951);
  }

  @GuardedBy("mLock")
  public final void disconnect()
  {
    AppMethodBeat.i(60954);
    this.zzfy = null;
    this.zzfx = null;
    this.zzgb = 0;
    this.zzfr.disconnect();
    this.zzfs.disconnect();
    zzab();
    AppMethodBeat.o(60954);
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    AppMethodBeat.i(60969);
    paramPrintWriter.append(paramString).append("authClient").println(":");
    this.zzfs.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    this.zzfr.dump(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    AppMethodBeat.o(60969);
  }

  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    AppMethodBeat.i(60948);
    if (zza(paramT))
      if (zzac())
      {
        paramT.setFailedResult(new Status(4, null, zzad()));
        AppMethodBeat.o(60948);
      }
    while (true)
    {
      return paramT;
      paramT = this.zzfs.enqueue(paramT);
      AppMethodBeat.o(60948);
      continue;
      paramT = this.zzfr.enqueue(paramT);
      AppMethodBeat.o(60948);
    }
  }

  @GuardedBy("mLock")
  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    AppMethodBeat.i(60949);
    if (zza(paramT))
      if (zzac())
      {
        paramT.setFailedResult(new Status(4, null, zzad()));
        AppMethodBeat.o(60949);
      }
    while (true)
    {
      return paramT;
      paramT = this.zzfs.execute(paramT);
      AppMethodBeat.o(60949);
      continue;
      paramT = this.zzfr.execute(paramT);
      AppMethodBeat.o(60949);
    }
  }

  @GuardedBy("mLock")
  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    AppMethodBeat.i(60950);
    if (((zzbd)this.zzft.get(paramApi.getClientKey())).equals(this.zzfs))
      if (zzac())
      {
        paramApi = new ConnectionResult(4, zzad());
        AppMethodBeat.o(60950);
      }
    while (true)
    {
      return paramApi;
      paramApi = this.zzfs.getConnectionResult(paramApi);
      AppMethodBeat.o(60950);
      continue;
      paramApi = this.zzfr.getConnectionResult(paramApi);
      AppMethodBeat.o(60950);
    }
  }

  public final boolean isConnected()
  {
    boolean bool1 = true;
    AppMethodBeat.i(60955);
    this.zzga.lock();
    try
    {
      if (this.zzfr.isConnected())
      {
        bool2 = bool1;
        if (!this.zzfs.isConnected())
        {
          bool2 = bool1;
          if (!zzac())
          {
            int i = this.zzgb;
            if (i != 1)
              break label77;
          }
        }
      }
      label77: for (boolean bool2 = bool1; ; bool2 = false)
        return bool2;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60955);
    }
  }

  public final boolean isConnecting()
  {
    AppMethodBeat.i(60956);
    this.zzga.lock();
    try
    {
      int i = this.zzgb;
      if (i == 2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60956);
    }
  }

  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    boolean bool = true;
    AppMethodBeat.i(60957);
    this.zzga.lock();
    try
    {
      if (((isConnecting()) || (isConnected())) && (!this.zzfs.isConnected()))
      {
        this.zzfu.add(paramSignInConnectionListener);
        if (this.zzgb == 0)
          this.zzgb = 1;
        this.zzfy = null;
        this.zzfs.connect();
      }
      while (true)
      {
        return bool;
        this.zzga.unlock();
        bool = false;
        AppMethodBeat.o(60957);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60957);
    }
    throw paramSignInConnectionListener;
  }

  public final void maybeSignOut()
  {
    AppMethodBeat.i(60959);
    this.zzga.lock();
    try
    {
      boolean bool = isConnecting();
      this.zzfs.disconnect();
      Object localObject1 = new com/google/android/gms/common/ConnectionResult;
      ((ConnectionResult)localObject1).<init>(4);
      this.zzfy = ((ConnectionResult)localObject1);
      if (bool)
      {
        Handler localHandler = new android/os/Handler;
        localHandler.<init>(this.zzcn);
        localObject1 = new com/google/android/gms/common/api/internal/zzs;
        ((zzs)localObject1).<init>(this);
        localHandler.post((Runnable)localObject1);
      }
      while (true)
      {
        return;
        zzab();
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60959);
    }
  }

  @GuardedBy("mLock")
  public final void zzz()
  {
    AppMethodBeat.i(60958);
    this.zzfr.zzz();
    this.zzfs.zzz();
    AppMethodBeat.o(60958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzr
 * JD-Core Version:    0.6.2
 */