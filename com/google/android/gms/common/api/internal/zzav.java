package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api<*>;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.service.CommonApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zzav extends GoogleApiClient
  implements zzbq
{
  private final Context mContext;
  private final Looper zzcn;
  private final int zzde;
  private final GoogleApiAvailability zzdg;
  private final Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> zzdh;
  private boolean zzdk;
  private final Lock zzga;
  private final ClientSettings zzgf;
  private final Map<Api<?>, Boolean> zzgi;

  @VisibleForTesting
  final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zzgo;
  private final GmsClientEventManager zzie;
  private zzbp zzif;
  private volatile boolean zzig;
  private long zzih;
  private long zzii;
  private final zzba zzij;

  @VisibleForTesting
  private GooglePlayServicesUpdatedReceiver zzik;
  final Map<Api.AnyClientKey<?>, Api.Client> zzil;
  Set<Scope> zzim;
  private final ListenerHolders zzin;
  private final ArrayList<zzp> zzio;
  private Integer zzip;
  Set<zzch> zziq;
  final zzck zzir;
  private final GmsClientEventManager.GmsClientEventState zzis;

  public zzav(Context paramContext, Lock paramLock, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiAvailability paramGoogleApiAvailability, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> paramAbstractClientBuilder, Map<Api<?>, Boolean> paramMap, List<GoogleApiClient.ConnectionCallbacks> paramList, List<GoogleApiClient.OnConnectionFailedListener> paramList1, Map<Api.AnyClientKey<?>, Api.Client> paramMap1, int paramInt1, int paramInt2, ArrayList<zzp> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(60765);
    this.zzif = null;
    this.zzgo = new LinkedList();
    this.zzih = 120000L;
    this.zzii = 5000L;
    this.zzim = new HashSet();
    this.zzin = new ListenerHolders();
    this.zzip = null;
    this.zziq = null;
    this.zzis = new zzaw(this);
    this.mContext = paramContext;
    this.zzga = paramLock;
    this.zzdk = false;
    this.zzie = new GmsClientEventManager(paramLooper, this.zzis);
    this.zzcn = paramLooper;
    this.zzij = new zzba(this, paramLooper);
    this.zzdg = paramGoogleApiAvailability;
    this.zzde = paramInt1;
    if (this.zzde >= 0)
      this.zzip = Integer.valueOf(paramInt2);
    this.zzgi = paramMap;
    this.zzil = paramMap1;
    this.zzio = paramArrayList;
    this.zzir = new zzck(this.zzil);
    paramContext = paramList.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.ConnectionCallbacks)paramContext.next();
      this.zzie.registerConnectionCallbacks(paramLock);
    }
    paramContext = paramList1.iterator();
    while (paramContext.hasNext())
    {
      paramLock = (GoogleApiClient.OnConnectionFailedListener)paramContext.next();
      this.zzie.registerConnectionFailedListener(paramLock);
    }
    this.zzgf = paramClientSettings;
    this.zzdh = paramAbstractClientBuilder;
    AppMethodBeat.o(60765);
  }

  private final void resume()
  {
    AppMethodBeat.i(60786);
    this.zzga.lock();
    try
    {
      if (this.zzig)
        zzax();
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60786);
    }
  }

  public static int zza(Iterable<Api.Client> paramIterable, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(60805);
    Iterator localIterator = paramIterable.iterator();
    int j = 0;
    int k = 0;
    if (localIterator.hasNext())
    {
      paramIterable = (Api.Client)localIterator.next();
      if (paramIterable.requiresSignIn())
        k = 1;
      if (!paramIterable.providesSignIn())
        break label113;
      j = 1;
    }
    label113: 
    while (true)
    {
      break;
      if (k != 0)
        if ((j != 0) && (paramBoolean))
        {
          j = 2;
          AppMethodBeat.o(60805);
        }
      while (true)
      {
        return j;
        AppMethodBeat.o(60805);
        j = i;
        continue;
        j = 3;
        AppMethodBeat.o(60805);
      }
    }
  }

  private final void zza(GoogleApiClient paramGoogleApiClient, StatusPendingResult paramStatusPendingResult, boolean paramBoolean)
  {
    AppMethodBeat.i(60780);
    Common.CommonApi.clearDefaultAccount(paramGoogleApiClient).setResultCallback(new zzaz(this, paramStatusPendingResult, paramBoolean, paramGoogleApiClient));
    AppMethodBeat.o(60780);
  }

  @GuardedBy("mLock")
  private final void zzax()
  {
    AppMethodBeat.i(60785);
    this.zzie.enableCallbacks();
    this.zzif.connect();
    AppMethodBeat.o(60785);
  }

  private final void zzay()
  {
    AppMethodBeat.i(60787);
    this.zzga.lock();
    try
    {
      if (zzaz())
        zzax();
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60787);
    }
  }

  private final void zzg(int paramInt)
  {
    AppMethodBeat.i(60784);
    label34: Object localObject2;
    if (this.zzip == null)
    {
      this.zzip = Integer.valueOf(paramInt);
      if (this.zzif != null)
        AppMethodBeat.o(60784);
    }
    else
    {
      if (this.zzip.intValue() == paramInt)
        break label519;
      localObject1 = zzh(paramInt);
      localObject2 = zzh(this.zzip.intValue());
      localObject1 = new IllegalStateException(String.valueOf(localObject1).length() + 51 + String.valueOf(localObject2).length() + "Cannot use sign-in mode: " + (String)localObject1 + ". Mode was already set to " + (String)localObject2);
      AppMethodBeat.o(60784);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.zzil.values().iterator();
    paramInt = 0;
    int i = 0;
    label146: if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Api.Client)((Iterator)localObject1).next();
      if (((Api.Client)localObject2).requiresSignIn())
        i = 1;
      if (!((Api.Client)localObject2).providesSignIn())
        break label521;
      paramInt = 1;
    }
    label519: label521: 
    while (true)
    {
      break label146;
      switch (this.zzip.intValue())
      {
      case 3:
      default:
      case 1:
      case 2:
      }
      while (true)
        if ((this.zzdk) && (paramInt == 0))
        {
          this.zzif = new zzw(this.mContext, this.zzga, this.zzcn, this.zzdg, this.zzil, this.zzgf, this.zzgi, this.zzdh, this.zzio, this, false);
          AppMethodBeat.o(60784);
          break;
          if (i == 0)
          {
            localObject1 = new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            AppMethodBeat.o(60784);
            throw ((Throwable)localObject1);
          }
          if (paramInt != 0)
          {
            localObject1 = new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            AppMethodBeat.o(60784);
            throw ((Throwable)localObject1);
            if (i != 0)
            {
              if (this.zzdk)
              {
                this.zzif = new zzw(this.mContext, this.zzga, this.zzcn, this.zzdg, this.zzil, this.zzgf, this.zzgi, this.zzdh, this.zzio, this, true);
                AppMethodBeat.o(60784);
                break;
              }
              this.zzif = zzr.zza(this.mContext, this, this.zzga, this.zzcn, this.zzdg, this.zzil, this.zzgf, this.zzgi, this.zzdh, this.zzio);
              AppMethodBeat.o(60784);
              break;
            }
          }
        }
      this.zzif = new zzbd(this.mContext, this, this.zzga, this.zzcn, this.zzdg, this.zzil, this.zzgf, this.zzgi, this.zzdh, this.zzio, this);
      AppMethodBeat.o(60784);
      break label34;
      break;
    }
  }

  private static String zzh(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "UNKNOWN";
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = "SIGN_IN_MODE_NONE";
      continue;
      str = "SIGN_IN_MODE_REQUIRED";
      continue;
      str = "SIGN_IN_MODE_OPTIONAL";
    }
  }

  public final ConnectionResult blockingConnect()
  {
    boolean bool1 = true;
    AppMethodBeat.i(60775);
    boolean bool2;
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      bool2 = true;
      Preconditions.checkState(bool2, "blockingConnect must not be called on the UI thread");
      this.zzga.lock();
    }
    label51: 
    do
      try
      {
        if (this.zzde >= 0)
          if (this.zzip != null)
          {
            bool2 = bool1;
            Preconditions.checkState(bool2, "Sign-in mode should have been set explicitly by auto-manage.");
          }
        while (true)
        {
          zzg(this.zzip.intValue());
          this.zzie.enableCallbacks();
          ConnectionResult localConnectionResult = this.zzif.blockingConnect();
          return localConnectionResult;
          bool2 = false;
          break;
          bool2 = false;
          break label51;
          if (this.zzip != null)
            break label161;
          this.zzip = Integer.valueOf(zza(this.zzil.values(), false));
        }
      }
      finally
      {
        this.zzga.unlock();
        AppMethodBeat.o(60775);
      }
    while (this.zzip.intValue() != 2);
    label161: IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    AppMethodBeat.o(60775);
    throw localIllegalStateException;
  }

  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool = false;
    AppMethodBeat.i(60776);
    if (Looper.myLooper() != Looper.getMainLooper())
      bool = true;
    Preconditions.checkState(bool, "blockingConnect must not be called on the UI thread");
    Preconditions.checkNotNull(paramTimeUnit, "TimeUnit must not be null");
    this.zzga.lock();
    try
    {
      if (this.zzip == null)
        this.zzip = Integer.valueOf(zza(this.zzil.values(), false));
      while (this.zzip.intValue() != 2)
      {
        zzg(this.zzip.intValue());
        this.zzie.enableCallbacks();
        paramTimeUnit = this.zzif.blockingConnect(paramLong, paramTimeUnit);
        return paramTimeUnit;
      }
      paramTimeUnit = new java/lang/IllegalStateException;
      paramTimeUnit.<init>("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
      AppMethodBeat.o(60776);
      throw paramTimeUnit;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60776);
    }
    throw paramTimeUnit;
  }

  public final PendingResult<Status> clearDefaultAccountAndReconnect()
  {
    AppMethodBeat.i(60779);
    Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
    boolean bool;
    StatusPendingResult localStatusPendingResult;
    if (this.zzip.intValue() != 2)
    {
      bool = true;
      Preconditions.checkState(bool, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
      localStatusPendingResult = new StatusPendingResult(this);
      if (!this.zzil.containsKey(Common.CLIENT_KEY))
        break label80;
      zza(this, localStatusPendingResult, false);
    }
    while (true)
    {
      AppMethodBeat.o(60779);
      return localStatusPendingResult;
      bool = false;
      break;
      label80: AtomicReference localAtomicReference = new AtomicReference();
      Object localObject = new zzax(this, localAtomicReference, localStatusPendingResult);
      zzay localzzay = new zzay(this, localStatusPendingResult);
      localObject = new GoogleApiClient.Builder(this.mContext).addApi(Common.API).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)localObject).addOnConnectionFailedListener(localzzay).setHandler(this.zzij).build();
      localAtomicReference.set(localObject);
      ((GoogleApiClient)localObject).connect();
    }
  }

  public final void connect()
  {
    boolean bool = false;
    AppMethodBeat.i(60773);
    this.zzga.lock();
    do
      try
      {
        if (this.zzde >= 0)
        {
          if (this.zzip != null)
            bool = true;
          Preconditions.checkState(bool, "Sign-in mode should have been set explicitly by auto-manage.");
        }
        while (true)
        {
          connect(this.zzip.intValue());
          return;
          if (this.zzip != null)
            break;
          this.zzip = Integer.valueOf(zza(this.zzil.values(), false));
        }
      }
      finally
      {
        this.zzga.unlock();
        AppMethodBeat.o(60773);
      }
    while (this.zzip.intValue() != 2);
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    AppMethodBeat.o(60773);
    throw localIllegalStateException;
  }

  public final void connect(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(60774);
    this.zzga.lock();
    boolean bool2 = bool1;
    if (paramInt != 3)
    {
      bool2 = bool1;
      if (paramInt != 1)
      {
        if (paramInt != 2)
          break label94;
        bool2 = bool1;
      }
    }
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(33);
      Preconditions.checkArgument(bool2, "Illegal sign-in mode: " + paramInt);
      zzg(paramInt);
      zzax();
      return;
      label94: bool2 = false;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60774);
    }
  }

  public final void disconnect()
  {
    AppMethodBeat.i(60777);
    this.zzga.lock();
    try
    {
      this.zzir.release();
      if (this.zzif != null)
        this.zzif.disconnect();
      this.zzin.release();
      Iterator localIterator = this.zzgo.iterator();
      while (localIterator.hasNext())
      {
        BaseImplementation.ApiMethodImpl localApiMethodImpl = (BaseImplementation.ApiMethodImpl)localIterator.next();
        localApiMethodImpl.zza(null);
        localApiMethodImpl.cancel();
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60777);
    }
    this.zzgo.clear();
    zzbp localzzbp = this.zzif;
    if (localzzbp == null)
    {
      this.zzga.unlock();
      AppMethodBeat.o(60777);
    }
    while (true)
    {
      return;
      zzaz();
      this.zzie.disableCallbacks();
      this.zzga.unlock();
      AppMethodBeat.o(60777);
    }
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    AppMethodBeat.i(60804);
    paramPrintWriter.append(paramString).append("mContext=").println(this.mContext);
    paramPrintWriter.append(paramString).append("mResuming=").print(this.zzig);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.zzgo.size());
    zzck localzzck = this.zzir;
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(localzzck.zzmo.size());
    if (this.zzif != null)
      this.zzif.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    AppMethodBeat.o(60804);
  }

  public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T paramT)
  {
    AppMethodBeat.i(60766);
    boolean bool;
    if (paramT.getClientKey() != null)
      bool = true;
    while (true)
    {
      Preconditions.checkArgument(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      bool = this.zzil.containsKey(paramT.getClientKey());
      String str;
      if (paramT.getApi() != null)
      {
        str = paramT.getApi().getName();
        label51: Preconditions.checkArgument(bool, String.valueOf(str).length() + 65 + "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.zzga.lock();
      }
      try
      {
        if (this.zzif == null)
          this.zzgo.add(paramT);
        while (true)
        {
          return paramT;
          bool = false;
          break;
          str = "the API";
          break label51;
          paramT = this.zzif.enqueue(paramT);
          this.zzga.unlock();
          AppMethodBeat.o(60766);
        }
      }
      finally
      {
        this.zzga.unlock();
        AppMethodBeat.o(60766);
      }
    }
    throw paramT;
  }

  public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T paramT)
  {
    AppMethodBeat.i(60767);
    boolean bool;
    if (paramT.getClientKey() != null)
    {
      bool = true;
      Preconditions.checkArgument(bool, "This task can not be executed (it's probably a Batch or malformed)");
      bool = this.zzil.containsKey(paramT.getClientKey());
      if (paramT.getApi() == null)
        break label149;
    }
    label149: for (Object localObject = paramT.getApi().getName(); ; localObject = "the API")
    {
      Preconditions.checkArgument(bool, String.valueOf(localObject).length() + 65 + "GoogleApiClient is not configured to use " + (String)localObject + " required for this call.");
      this.zzga.lock();
      try
      {
        if (this.zzif != null)
          break label156;
        paramT = new java/lang/IllegalStateException;
        paramT.<init>("GoogleApiClient is not connected yet.");
        AppMethodBeat.o(60767);
        throw paramT;
      }
      finally
      {
        this.zzga.unlock();
        AppMethodBeat.o(60767);
      }
      bool = false;
      break;
    }
    label156: if (this.zzig)
    {
      this.zzgo.add(paramT);
      while (!this.zzgo.isEmpty())
      {
        localObject = (BaseImplementation.ApiMethodImpl)this.zzgo.remove();
        this.zzir.zzb((BasePendingResult)localObject);
        ((BaseImplementation.ApiMethodImpl)localObject).setFailedResult(Status.RESULT_INTERNAL_ERROR);
      }
      this.zzga.unlock();
      AppMethodBeat.o(60767);
    }
    while (true)
    {
      return paramT;
      paramT = this.zzif.execute(paramT);
      this.zzga.unlock();
      AppMethodBeat.o(60767);
    }
  }

  public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> paramAnyClientKey)
  {
    AppMethodBeat.i(60769);
    paramAnyClientKey = (Api.Client)this.zzil.get(paramAnyClientKey);
    Preconditions.checkNotNull(paramAnyClientKey, "Appropriate Api was not requested.");
    AppMethodBeat.o(60769);
    return paramAnyClientKey;
  }

  public final ConnectionResult getConnectionResult(Api<?> paramApi)
  {
    AppMethodBeat.i(60772);
    this.zzga.lock();
    try
    {
      if ((!isConnected()) && (!this.zzig))
      {
        paramApi = new java/lang/IllegalStateException;
        paramApi.<init>("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
        AppMethodBeat.o(60772);
        throw paramApi;
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60772);
    }
    if (this.zzil.containsKey(paramApi.getClientKey()))
    {
      localObject = this.zzif.getConnectionResult(paramApi);
      if (localObject == null)
        if (this.zzig)
        {
          paramApi = ConnectionResult.RESULT_SUCCESS;
          this.zzga.unlock();
          AppMethodBeat.o(60772);
        }
      while (true)
      {
        return paramApi;
        zzbb();
        paramApi = String.valueOf(paramApi.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
        localObject = new java/lang/Exception;
        ((Exception)localObject).<init>();
        Log.wtf("GoogleApiClientImpl", paramApi, (Throwable)localObject);
        paramApi = new ConnectionResult(8, null);
        this.zzga.unlock();
        AppMethodBeat.o(60772);
        continue;
        this.zzga.unlock();
        AppMethodBeat.o(60772);
        paramApi = (Api<?>)localObject;
      }
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>(String.valueOf(paramApi.getName()).concat(" was never registered with GoogleApiClient"));
    AppMethodBeat.o(60772);
    throw ((Throwable)localObject);
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public final Looper getLooper()
  {
    return this.zzcn;
  }

  public final boolean hasApi(Api<?> paramApi)
  {
    AppMethodBeat.i(60770);
    boolean bool = this.zzil.containsKey(paramApi.getClientKey());
    AppMethodBeat.o(60770);
    return bool;
  }

  public final boolean hasConnectedApi(Api<?> paramApi)
  {
    AppMethodBeat.i(60771);
    boolean bool;
    if (!isConnected())
    {
      AppMethodBeat.o(60771);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramApi = (Api.Client)this.zzil.get(paramApi.getClientKey());
      if ((paramApi != null) && (paramApi.isConnected()))
      {
        bool = true;
        AppMethodBeat.o(60771);
      }
      else
      {
        AppMethodBeat.o(60771);
        bool = false;
      }
    }
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(60782);
    boolean bool;
    if ((this.zzif != null) && (this.zzif.isConnected()))
    {
      bool = true;
      AppMethodBeat.o(60782);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60782);
    }
  }

  public final boolean isConnecting()
  {
    AppMethodBeat.i(60783);
    boolean bool;
    if ((this.zzif != null) && (this.zzif.isConnecting()))
    {
      bool = true;
      AppMethodBeat.o(60783);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60783);
    }
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(60790);
    boolean bool = this.zzie.isConnectionCallbacksRegistered(paramConnectionCallbacks);
    AppMethodBeat.o(60790);
    return bool;
  }

  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(60793);
    boolean bool = this.zzie.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
    AppMethodBeat.o(60793);
    return bool;
  }

  public final boolean maybeSignIn(SignInConnectionListener paramSignInConnectionListener)
  {
    AppMethodBeat.i(60798);
    boolean bool;
    if ((this.zzif != null) && (this.zzif.maybeSignIn(paramSignInConnectionListener)))
    {
      bool = true;
      AppMethodBeat.o(60798);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60798);
    }
  }

  public final void maybeSignOut()
  {
    AppMethodBeat.i(60799);
    if (this.zzif != null)
      this.zzif.maybeSignOut();
    AppMethodBeat.o(60799);
  }

  public final void reconnect()
  {
    AppMethodBeat.i(60778);
    disconnect();
    connect();
    AppMethodBeat.o(60778);
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(60789);
    this.zzie.registerConnectionCallbacks(paramConnectionCallbacks);
    AppMethodBeat.o(60789);
  }

  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(60792);
    this.zzie.registerConnectionFailedListener(paramOnConnectionFailedListener);
    AppMethodBeat.o(60792);
  }

  public final <L> ListenerHolder<L> registerListener(L paramL)
  {
    AppMethodBeat.i(60768);
    this.zzga.lock();
    try
    {
      paramL = this.zzin.zza(paramL, this.zzcn, "NO_TYPE");
      return paramL;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60768);
    }
    throw paramL;
  }

  public final void stopAutoManage(FragmentActivity paramFragmentActivity)
  {
    AppMethodBeat.i(60781);
    paramFragmentActivity = new LifecycleActivity(paramFragmentActivity);
    if (this.zzde >= 0)
    {
      zzi.zza(paramFragmentActivity).zzc(this.zzde);
      AppMethodBeat.o(60781);
      return;
    }
    paramFragmentActivity = new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    AppMethodBeat.o(60781);
    throw paramFragmentActivity;
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    AppMethodBeat.i(60791);
    this.zzie.unregisterConnectionCallbacks(paramConnectionCallbacks);
    AppMethodBeat.o(60791);
  }

  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    AppMethodBeat.i(60794);
    this.zzie.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
    AppMethodBeat.o(60794);
  }

  public final void zza(zzch paramzzch)
  {
    AppMethodBeat.i(60800);
    this.zzga.lock();
    try
    {
      if (this.zziq == null)
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        this.zziq = localHashSet;
      }
      this.zziq.add(paramzzch);
      return;
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60800);
    }
    throw paramzzch;
  }

  @GuardedBy("mLock")
  final boolean zzaz()
  {
    boolean bool = false;
    AppMethodBeat.i(60788);
    if (!this.zzig)
      AppMethodBeat.o(60788);
    while (true)
    {
      return bool;
      this.zzig = false;
      this.zzij.removeMessages(2);
      this.zzij.removeMessages(1);
      if (this.zzik != null)
      {
        this.zzik.unregister();
        this.zzik = null;
      }
      AppMethodBeat.o(60788);
      bool = true;
    }
  }

  @GuardedBy("mLock")
  public final void zzb(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(60797);
    if ((paramInt == 1) && (!paramBoolean) && (!this.zzig))
    {
      this.zzig = true;
      if (this.zzik == null)
        this.zzik = this.zzdg.registerCallbackOnUpdate(this.mContext.getApplicationContext(), new zzbb(this));
      this.zzij.sendMessageDelayed(this.zzij.obtainMessage(1), this.zzih);
      this.zzij.sendMessageDelayed(this.zzij.obtainMessage(2), this.zzii);
    }
    this.zzir.zzce();
    this.zzie.onUnintentionalDisconnection(paramInt);
    this.zzie.disableCallbacks();
    if (paramInt == 2)
      zzax();
    AppMethodBeat.o(60797);
  }

  @GuardedBy("mLock")
  public final void zzb(Bundle paramBundle)
  {
    AppMethodBeat.i(60795);
    while (!this.zzgo.isEmpty())
      execute((BaseImplementation.ApiMethodImpl)this.zzgo.remove());
    this.zzie.onConnectionSuccess(paramBundle);
    AppMethodBeat.o(60795);
  }

  public final void zzb(zzch paramzzch)
  {
    AppMethodBeat.i(60801);
    this.zzga.lock();
    while (true)
    {
      try
      {
        if (this.zziq == null)
        {
          paramzzch = new java/lang/Exception;
          paramzzch.<init>();
          Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", paramzzch);
          return;
        }
        if (!this.zziq.remove(paramzzch))
        {
          paramzzch = new java/lang/Exception;
          paramzzch.<init>();
          Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", paramzzch);
          continue;
        }
      }
      finally
      {
        this.zzga.unlock();
        AppMethodBeat.o(60801);
      }
      if (!zzba())
        this.zzif.zzz();
    }
  }

  final boolean zzba()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(60802);
    this.zzga.lock();
    try
    {
      Set localSet = this.zziq;
      if (localSet == null)
      {
        this.zzga.unlock();
        AppMethodBeat.o(60802);
        bool1 = bool2;
      }
      while (true)
      {
        return bool1;
        bool2 = this.zziq.isEmpty();
        if (!bool2)
          bool1 = true;
        this.zzga.unlock();
        AppMethodBeat.o(60802);
      }
    }
    finally
    {
      this.zzga.unlock();
      AppMethodBeat.o(60802);
    }
  }

  final String zzbb()
  {
    AppMethodBeat.i(60803);
    Object localObject = new StringWriter();
    dump("", null, new PrintWriter((Writer)localObject), null);
    localObject = ((StringWriter)localObject).toString();
    AppMethodBeat.o(60803);
    return localObject;
  }

  @GuardedBy("mLock")
  public final void zzc(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60796);
    if (!this.zzdg.isPlayServicesPossiblyUpdating(this.mContext, paramConnectionResult.getErrorCode()))
      zzaz();
    if (!this.zzig)
    {
      this.zzie.onConnectionFailure(paramConnectionResult);
      this.zzie.disableCallbacks();
    }
    AppMethodBeat.o(60796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzav
 * JD-Core Version:    0.6.2
 */