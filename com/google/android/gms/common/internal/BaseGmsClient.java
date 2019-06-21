package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class BaseGmsClient<T extends IInterface>
{
  public static final int CONNECT_STATE_CONNECTED = 4;
  public static final int CONNECT_STATE_DISCONNECTED = 1;
  public static final int CONNECT_STATE_DISCONNECTING = 5;
  public static final int CONNECT_STATE_LOCAL_CONNECTING = 3;
  public static final int CONNECT_STATE_REMOTE_CONNECTING = 2;
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  public static final String FEATURE_GOOGLE_ME = "service_googleme";
  public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = { "service_esmobile", "service_googleme" };
  public static final String KEY_PENDING_INTENT = "pendingIntent";
  private static final Feature[] zzqz = new Feature[0];

  @VisibleForTesting
  protected ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks;
  private final Context mContext;

  @VisibleForTesting
  protected AtomicInteger mDisconnectCount = new AtomicInteger(0);
  final Handler mHandler;
  private final Object mLock = new Object();
  private final Looper zzcn;
  private final GoogleApiAvailabilityLight zzgk;
  private int zzra;
  private long zzrb;
  private long zzrc;
  private int zzrd;
  private long zzre;

  @VisibleForTesting
  private GmsServiceEndpoint zzrf;
  private final GmsClientSupervisor zzrg;
  private final Object zzrh = new Object();

  @GuardedBy("mServiceBrokerLock")
  private IGmsServiceBroker zzri;

  @GuardedBy("mLock")
  private T zzrj;
  private final ArrayList<BaseGmsClient<T>.CallbackProxy<?>> zzrk = new ArrayList();

  @GuardedBy("mLock")
  private BaseGmsClient<T>.GmsServiceConnection zzrl;

  @GuardedBy("mLock")
  private int zzrm = 1;
  private final BaseConnectionCallbacks zzrn;
  private final BaseOnConnectionFailedListener zzro;
  private final int zzrp;
  private final String zzrq;
  private ConnectionResult zzrr = null;
  private boolean zzrs = false;
  private volatile ConnectionInfo zzrt = null;

  @VisibleForTesting
  protected BaseGmsClient(Context paramContext, Handler paramHandler, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener)
  {
    this.mContext = ((Context)Preconditions.checkNotNull(paramContext, "Context must not be null"));
    this.mHandler = ((Handler)Preconditions.checkNotNull(paramHandler, "Handler must not be null"));
    this.zzcn = paramHandler.getLooper();
    this.zzrg = ((GmsClientSupervisor)Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null"));
    this.zzgk = ((GoogleApiAvailabilityLight)Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null"));
    this.zzrp = paramInt;
    this.zzrn = paramBaseConnectionCallbacks;
    this.zzro = paramBaseOnConnectionFailedListener;
    this.zzrq = null;
  }

  protected BaseGmsClient(Context paramContext, Looper paramLooper, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    this(paramContext, paramLooper, GmsClientSupervisor.getInstance(paramContext), GoogleApiAvailabilityLight.getInstance(), paramInt, (BaseConnectionCallbacks)Preconditions.checkNotNull(paramBaseConnectionCallbacks), (BaseOnConnectionFailedListener)Preconditions.checkNotNull(paramBaseOnConnectionFailedListener), paramString);
  }

  @VisibleForTesting
  protected BaseGmsClient(Context paramContext, Looper paramLooper, GmsClientSupervisor paramGmsClientSupervisor, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight, int paramInt, BaseConnectionCallbacks paramBaseConnectionCallbacks, BaseOnConnectionFailedListener paramBaseOnConnectionFailedListener, String paramString)
  {
    this.mContext = ((Context)Preconditions.checkNotNull(paramContext, "Context must not be null"));
    this.zzcn = ((Looper)Preconditions.checkNotNull(paramLooper, "Looper must not be null"));
    this.zzrg = ((GmsClientSupervisor)Preconditions.checkNotNull(paramGmsClientSupervisor, "Supervisor must not be null"));
    this.zzgk = ((GoogleApiAvailabilityLight)Preconditions.checkNotNull(paramGoogleApiAvailabilityLight, "API availability must not be null"));
    this.mHandler = new zzb(paramLooper);
    this.zzrp = paramInt;
    this.zzrn = paramBaseConnectionCallbacks;
    this.zzro = paramBaseOnConnectionFailedListener;
    this.zzrq = paramString;
  }

  private final void zza(int paramInt, T paramT)
  {
    boolean bool = true;
    int i;
    int j;
    if (paramInt == 4)
    {
      i = 1;
      if (paramT == null)
        break label94;
      j = 1;
      label17: if (i != j)
        break label100;
      Preconditions.checkArgument(bool);
    }
    while (true)
    {
      synchronized (this.mLock)
      {
        this.zzrm = paramInt;
        this.zzrj = paramT;
        onSetConnectState(paramInt, paramT);
        switch (paramInt)
        {
        default:
          return;
          i = 0;
          break;
          j = 0;
          break label17;
          bool = false;
          break;
        case 2:
        case 3:
          label94: label100: String str;
          Object localObject2;
          if ((this.zzrl != null) && (this.zzrf != null))
          {
            str = this.zzrf.zzcw();
            paramT = this.zzrf.getPackageName();
            paramInt = String.valueOf(str).length();
            i = String.valueOf(paramT).length();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>(paramInt + 70 + i);
            ((StringBuilder)localObject2).append("Calling connect() while still connected, missing disconnect() for ").append(str).append(" on ").append(paramT);
            this.zzrg.unbindService(this.zzrf.zzcw(), this.zzrf.getPackageName(), this.zzrf.getBindFlags(), this.zzrl, getRealClientName());
            this.mDisconnectCount.incrementAndGet();
          }
          paramT = new com/google/android/gms/common/internal/BaseGmsClient$GmsServiceConnection;
          paramT.<init>(this, this.mDisconnectCount.get());
          this.zzrl = paramT;
          if ((this.zzrm == 3) && (getLocalStartServiceAction() != null))
          {
            paramT = new com/google/android/gms/common/internal/GmsServiceEndpoint;
            paramT.<init>(getContext().getPackageName(), getLocalStartServiceAction(), true, getServiceBindFlags());
            this.zzrf = paramT;
            if (this.zzrg.bindService(this.zzrf.zzcw(), this.zzrf.getPackageName(), this.zzrf.getBindFlags(), this.zzrl, getRealClientName()))
              continue;
            localObject2 = this.zzrf.zzcw();
            str = this.zzrf.getPackageName();
            i = String.valueOf(localObject2).length();
            paramInt = String.valueOf(str).length();
            paramT = new java/lang/StringBuilder;
            paramT.<init>(i + 34 + paramInt);
            paramT.append("unable to connect to service: ").append((String)localObject2).append(" on ").append(str);
            onPostServiceBindingHandler(16, null, this.mDisconnectCount.get());
          }
          break;
        case 4:
        case 1:
        }
      }
      paramT = new GmsServiceEndpoint(getStartServicePackage(), getStartServiceAction(), false, getServiceBindFlags());
      continue;
      onConnectedLocked(paramT);
      continue;
      if (this.zzrl != null)
      {
        this.zzrg.unbindService(getStartServiceAction(), getStartServicePackage(), getServiceBindFlags(), this.zzrl, getRealClientName());
        this.zzrl = null;
      }
    }
  }

  private final void zza(ConnectionInfo paramConnectionInfo)
  {
    this.zzrt = paramConnectionInfo;
  }

  private final boolean zza(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.mLock)
    {
      if (this.zzrm != paramInt1)
      {
        bool = false;
        return bool;
      }
      zza(paramInt2, paramT);
      boolean bool = true;
    }
  }

  private final boolean zzcq()
  {
    synchronized (this.mLock)
    {
      if (this.zzrm == 3)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  private final boolean zzcr()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.zzrs)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (!TextUtils.isEmpty(getServiceDescriptor()))
      {
        bool2 = bool1;
        if (!TextUtils.isEmpty(getLocalStartServiceAction()))
          try
          {
            Class.forName(getServiceDescriptor());
            bool2 = true;
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            bool2 = bool1;
          }
      }
    }
  }

  private final void zzj(int paramInt)
  {
    if (zzcq())
    {
      paramInt = 5;
      this.zzrs = true;
    }
    while (true)
    {
      this.mHandler.sendMessage(this.mHandler.obtainMessage(paramInt, this.mDisconnectCount.get(), 16));
      return;
      paramInt = 4;
    }
  }

  public void checkAvailabilityAndConnect()
  {
    int i = this.zzgk.isGooglePlayServicesAvailable(this.mContext, getMinApkVersion());
    if (i != 0)
    {
      zza(1, null);
      triggerNotAvailable(new LegacyClientCallbackAdapter(), i, null);
    }
    while (true)
    {
      return;
      connect(new LegacyClientCallbackAdapter());
    }
  }

  protected final void checkConnected()
  {
    if (!isConnected())
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }

  public void connect(ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    this.mConnectionProgressReportCallbacks = ((ConnectionProgressReportCallbacks)Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null."));
    zza(2, null);
  }

  protected abstract T createServiceInterface(IBinder paramIBinder);

  public void disconnect()
  {
    this.mDisconnectCount.incrementAndGet();
    synchronized (this.zzrk)
    {
      int i = this.zzrk.size();
      for (int j = 0; j < i; j++)
        ((CallbackProxy)this.zzrk.get(j)).removeListener();
      this.zzrk.clear();
    }
    synchronized (this.zzrh)
    {
      this.zzri = null;
      zza(1, null);
      return;
      localObject3 = finally;
      throw localObject3;
    }
  }

  @Deprecated
  public final void doCallbackDEPRECATED(BaseGmsClient<T>.CallbackProxy<?> paramBaseGmsClient)
  {
    synchronized (this.zzrk)
    {
      this.zzrk.add(paramBaseGmsClient);
      this.mHandler.sendMessage(this.mHandler.obtainMessage(2, this.mDisconnectCount.get(), -1, paramBaseGmsClient));
      return;
    }
  }

  public void dump(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i;
    synchronized (this.mLock)
    {
      i = this.zzrm;
      paramArrayOfString = this.zzrj;
    }
    while (true)
    {
      Object localObject;
      synchronized (this.zzrh)
      {
        localObject = this.zzri;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i)
        {
        default:
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (paramArrayOfString != null)
            break label527;
          paramPrintWriter.append("null");
          paramPrintWriter.append(" mServiceBroker=");
          if (localObject != null)
            break label561;
          paramPrintWriter.println("null");
          ??? = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          long l;
          if (this.zzrc > 0L)
          {
            paramArrayOfString = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            l = this.zzrc;
            localObject = ???.format(new Date(this.zzrc));
            paramArrayOfString.println(String.valueOf(localObject).length() + 21 + l + " " + (String)localObject);
          }
          if (this.zzrb > 0L)
            paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          switch (this.zzra)
          {
          default:
            paramPrintWriter.append(String.valueOf(this.zzra));
            localObject = paramPrintWriter.append(" lastSuspendedTime=");
            l = this.zzrb;
            paramArrayOfString = ???.format(new Date(this.zzrb));
            ((PrintWriter)localObject).println(String.valueOf(paramArrayOfString).length() + 21 + l + " " + paramArrayOfString);
            if (this.zzre > 0L)
            {
              paramPrintWriter.append(paramString).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzrd));
              paramString = paramPrintWriter.append(" lastFailedTime=");
              l = this.zzre;
              ??? = ???.format(new Date(this.zzre));
              paramString.println(String.valueOf(???).length() + 21 + l + " " + ???);
            }
            return;
            paramString = finally;
            throw paramString;
          case 1:
          case 2:
          }
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 1:
        }
      }
      paramPrintWriter.print("REMOTE_CONNECTING");
      continue;
      paramPrintWriter.print("LOCAL_CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label527: paramPrintWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
      continue;
      label561: paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IGmsServiceBroker)localObject).asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }

  public Account getAccount()
  {
    return null;
  }

  public final Account getAccountOrDefault()
  {
    if (getAccount() != null);
    for (Account localAccount = getAccount(); ; localAccount = new Account("<<default account>>", "com.google"))
      return localAccount;
  }

  public Feature[] getApiFeatures()
  {
    return zzqz;
  }

  public final Feature[] getAvailableFeatures()
  {
    Object localObject = this.zzrt;
    if (localObject == null);
    for (localObject = null; ; localObject = ((ConnectionInfo)localObject).getAvailableFeatures())
      return localObject;
  }

  public Bundle getConnectionHint()
  {
    return null;
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public String getEndpointPackageName()
  {
    if ((isConnected()) && (this.zzrf != null))
      return this.zzrf.getPackageName();
    throw new RuntimeException("Failed to connect when checking package");
  }

  protected Bundle getGetServiceRequestExtraArgs()
  {
    return new Bundle();
  }

  @VisibleForTesting
  public final Handler getHandlerForTesting()
  {
    return this.mHandler;
  }

  protected String getLocalStartServiceAction()
  {
    return null;
  }

  public final Looper getLooper()
  {
    return this.zzcn;
  }

  public int getMinApkVersion()
  {
    return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  }

  protected final String getRealClientName()
  {
    if (this.zzrq == null);
    for (String str = this.mContext.getClass().getName(); ; str = this.zzrq)
      return str;
  }

  public void getRemoteService(IAccountAccessor arg1, Set<Scope> paramSet)
  {
    Object localObject = getGetServiceRequestExtraArgs();
    localObject = new GetServiceRequest(this.zzrp).setCallingPackage(this.mContext.getPackageName()).setExtraArgs((Bundle)localObject);
    if (paramSet != null)
      ((GetServiceRequest)localObject).setScopes(paramSet);
    if (requiresSignIn())
      ((GetServiceRequest)localObject).setClientRequestedAccount(getAccountOrDefault()).setAuthenticatedAccount(???);
    while (true)
    {
      ((GetServiceRequest)localObject).setClientRequiredFeatures(getRequiredFeatures());
      ((GetServiceRequest)localObject).setClientApiFeatures(getApiFeatures());
      try
      {
        synchronized (this.zzrh)
        {
          if (this.zzri != null)
          {
            paramSet = this.zzri;
            GmsCallbacks localGmsCallbacks = new com/google/android/gms/common/internal/BaseGmsClient$GmsCallbacks;
            localGmsCallbacks.<init>(this, this.mDisconnectCount.get());
            paramSet.getService(localGmsCallbacks, (GetServiceRequest)localObject);
          }
          return;
          if (!requiresAccount())
            continue;
          ((GetServiceRequest)localObject).setClientRequestedAccount(getAccount());
        }
      }
      catch (DeadObjectException )
      {
        while (true)
          triggerConnectionSuspended(1);
      }
      catch (SecurityException )
      {
        throw ???;
      }
      catch (RemoteException )
      {
        while (true)
          onPostInitHandler(8, null, null, this.mDisconnectCount.get());
      }
      catch (RuntimeException )
      {
        label165: break label165;
      }
    }
  }

  public Feature[] getRequiredFeatures()
  {
    return zzqz;
  }

  protected Set<Scope> getScopes()
  {
    return Collections.EMPTY_SET;
  }

  public final T getService()
  {
    synchronized (this.mLock)
    {
      if (this.zzrm == 5)
      {
        DeadObjectException localDeadObjectException = new android/os/DeadObjectException;
        localDeadObjectException.<init>();
        throw localDeadObjectException;
      }
    }
    checkConnected();
    if (this.zzrj != null);
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "Client is connected but service is null");
      IInterface localIInterface = this.zzrj;
      return localIInterface;
    }
  }

  protected int getServiceBindFlags()
  {
    return 129;
  }

  public IBinder getServiceBrokerBinder()
  {
    synchronized (this.zzrh)
    {
      if (this.zzri == null)
      {
        localIBinder = null;
        return localIBinder;
      }
      IBinder localIBinder = this.zzri.asBinder();
    }
  }

  @VisibleForTesting
  public final IGmsServiceBroker getServiceBrokerForTesting()
  {
    synchronized (this.zzrh)
    {
      IGmsServiceBroker localIGmsServiceBroker = this.zzri;
      return localIGmsServiceBroker;
    }
  }

  protected abstract String getServiceDescriptor();

  public Intent getSignInIntent()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }

  protected abstract String getStartServiceAction();

  protected String getStartServicePackage()
  {
    return "com.google.android.gms";
  }

  public boolean isConnected()
  {
    synchronized (this.mLock)
    {
      if (this.zzrm == 4)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public boolean isConnecting()
  {
    synchronized (this.mLock)
    {
      if ((this.zzrm == 2) || (this.zzrm == 3))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  protected void onConnectedLocked(T paramT)
  {
    this.zzrc = System.currentTimeMillis();
  }

  protected void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.zzrd = paramConnectionResult.getErrorCode();
    this.zzre = System.currentTimeMillis();
  }

  protected void onConnectionSuspended(int paramInt)
  {
    this.zzra = paramInt;
    this.zzrb = System.currentTimeMillis();
  }

  protected void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramInt2, -1, new PostInitCallback(paramInt1, paramIBinder, paramBundle)));
  }

  protected void onPostServiceBindingHandler(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(7, paramInt2, -1, new PostServiceBindingCallback(paramInt1, paramBundle)));
  }

  void onSetConnectState(int paramInt, T paramT)
  {
  }

  public void onUserSignOut(SignOutCallbacks paramSignOutCallbacks)
  {
    paramSignOutCallbacks.onSignOutComplete();
  }

  public boolean providesSignIn()
  {
    return false;
  }

  public boolean requiresAccount()
  {
    return false;
  }

  public boolean requiresGooglePlayServices()
  {
    return true;
  }

  public boolean requiresSignIn()
  {
    return false;
  }

  @VisibleForTesting
  public void setConnectionInfoForTesting(ConnectionInfo paramConnectionInfo)
  {
    this.zzrt = paramConnectionInfo;
  }

  @VisibleForTesting
  public final void setServiceBrokerForTesting(IGmsServiceBroker paramIGmsServiceBroker)
  {
    synchronized (this.zzrh)
    {
      this.zzri = paramIGmsServiceBroker;
      return;
    }
  }

  @VisibleForTesting
  public final void setServiceForTesting(T paramT)
  {
    if (paramT != null);
    for (int i = 4; ; i = 1)
    {
      zza(i, paramT);
      return;
    }
  }

  public void triggerConnectionSuspended(int paramInt)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.mDisconnectCount.get(), paramInt));
  }

  @VisibleForTesting
  protected void triggerNotAvailable(ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks, int paramInt, PendingIntent paramPendingIntent)
  {
    this.mConnectionProgressReportCallbacks = ((ConnectionProgressReportCallbacks)Preconditions.checkNotNull(paramConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null."));
    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.mDisconnectCount.get(), paramInt, paramPendingIntent));
  }

  public static abstract interface BaseConnectionCallbacks
  {
    public static final int CAUSE_NETWORK_LOST = 2;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    public abstract void onConnected(Bundle paramBundle);

    public abstract void onConnectionSuspended(int paramInt);
  }

  public static abstract interface BaseOnConnectionFailedListener
  {
    public abstract void onConnectionFailed(ConnectionResult paramConnectionResult);
  }

  protected abstract class CallbackProxy<TListener>
  {
    private TListener zzli;
    private boolean zzrv;

    public CallbackProxy()
    {
      Object localObject;
      this.zzli = localObject;
      this.zzrv = false;
    }

    // ERROR //
    public void deliverCallback()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:zzli	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:zzrv	Z
      //   11: ifeq +47 -> 58
      //   14: aload_0
      //   15: invokestatic 38	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   18: astore_2
      //   19: aload_2
      //   20: invokestatic 38	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   23: invokevirtual 42	java/lang/String:length	()I
      //   26: istore_3
      //   27: new 44	java/lang/StringBuilder
      //   30: astore 4
      //   32: aload 4
      //   34: iload_3
      //   35: bipush 47
      //   37: iadd
      //   38: invokespecial 47	java/lang/StringBuilder:<init>	(I)V
      //   41: aload 4
      //   43: ldc 49
      //   45: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   48: aload_2
      //   49: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   52: ldc 55
      //   54: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   57: pop
      //   58: aload_0
      //   59: monitorexit
      //   60: aload_1
      //   61: ifnull +34 -> 95
      //   64: aload_0
      //   65: aload_1
      //   66: invokevirtual 58	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:deliverCallback	(Ljava/lang/Object;)V
      //   69: aload_0
      //   70: monitorenter
      //   71: aload_0
      //   72: iconst_1
      //   73: putfield 26	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:zzrv	Z
      //   76: aload_0
      //   77: monitorexit
      //   78: aload_0
      //   79: invokevirtual 61	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:unregister	()V
      //   82: return
      //   83: astore_2
      //   84: aload_0
      //   85: monitorexit
      //   86: aload_2
      //   87: athrow
      //   88: astore_2
      //   89: aload_0
      //   90: invokevirtual 64	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:onDeliverCallbackFailed	()V
      //   93: aload_2
      //   94: athrow
      //   95: aload_0
      //   96: invokevirtual 64	com/google/android/gms/common/internal/BaseGmsClient$CallbackProxy:onDeliverCallbackFailed	()V
      //   99: goto -30 -> 69
      //   102: astore_2
      //   103: aload_0
      //   104: monitorexit
      //   105: aload_2
      //   106: athrow
      //
      // Exception table:
      //   from	to	target	type
      //   2	58	83	finally
      //   58	60	83	finally
      //   84	86	83	finally
      //   64	69	88	java/lang/RuntimeException
      //   71	78	102	finally
      //   103	105	102	finally
    }

    protected abstract void deliverCallback(TListener paramTListener);

    protected abstract void onDeliverCallbackFailed();

    public void removeListener()
    {
      try
      {
        this.zzli = null;
        return;
      }
      finally
      {
      }
    }

    public void unregister()
    {
      removeListener();
      synchronized (BaseGmsClient.zzf(BaseGmsClient.this))
      {
        BaseGmsClient.zzf(BaseGmsClient.this).remove(this);
        return;
      }
    }
  }

  public static abstract interface ConnectionProgressReportCallbacks
  {
    public abstract void onReportServiceBinding(ConnectionResult paramConnectionResult);
  }

  @VisibleForTesting
  public static final class GmsCallbacks extends IGmsCallbacks.Stub
  {
    private BaseGmsClient zzrw;
    private final int zzrx;

    public GmsCallbacks(BaseGmsClient paramBaseGmsClient, int paramInt)
    {
      this.zzrw = paramBaseGmsClient;
      this.zzrx = paramInt;
    }

    public final void onAccountValidationComplete(int paramInt, Bundle paramBundle)
    {
      AppMethodBeat.i(89570);
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
      AppMethodBeat.o(89570);
    }

    public final void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      AppMethodBeat.i(89571);
      Preconditions.checkNotNull(this.zzrw, "onPostInitComplete can be called only once per call to getRemoteService");
      this.zzrw.onPostInitHandler(paramInt, paramIBinder, paramBundle, this.zzrx);
      this.zzrw = null;
      AppMethodBeat.o(89571);
    }

    public final void onPostInitCompleteWithConnectionInfo(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo)
    {
      AppMethodBeat.i(89572);
      Preconditions.checkNotNull(this.zzrw, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      Preconditions.checkNotNull(paramConnectionInfo);
      BaseGmsClient.zza(this.zzrw, paramConnectionInfo);
      onPostInitComplete(paramInt, paramIBinder, paramConnectionInfo.getResolutionBundle());
      AppMethodBeat.o(89572);
    }
  }

  @VisibleForTesting
  public final class GmsServiceConnection
    implements ServiceConnection
  {
    private final int zzrx;

    public GmsServiceConnection(int arg2)
    {
      int i;
      this.zzrx = i;
    }

    public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
    {
      AppMethodBeat.i(89573);
      if (paramIBinder == null)
      {
        BaseGmsClient.zza(BaseGmsClient.this, 16);
        AppMethodBeat.o(89573);
      }
      while (true)
      {
        return;
        synchronized (BaseGmsClient.zza(BaseGmsClient.this))
        {
          BaseGmsClient.zza(BaseGmsClient.this, IGmsServiceBroker.Stub.asInterface(paramIBinder));
          BaseGmsClient.this.onPostServiceBindingHandler(0, null, this.zzrx);
          AppMethodBeat.o(89573);
        }
      }
    }

    public final void onServiceDisconnected(ComponentName arg1)
    {
      AppMethodBeat.i(89574);
      synchronized (BaseGmsClient.zza(BaseGmsClient.this))
      {
        BaseGmsClient.zza(BaseGmsClient.this, null);
        BaseGmsClient.this.mHandler.sendMessage(BaseGmsClient.this.mHandler.obtainMessage(6, this.zzrx, 1));
        AppMethodBeat.o(89574);
        return;
      }
    }
  }

  public class LegacyClientCallbackAdapter
    implements BaseGmsClient.ConnectionProgressReportCallbacks
  {
    public LegacyClientCallbackAdapter()
    {
    }

    public void onReportServiceBinding(ConnectionResult paramConnectionResult)
    {
      AppMethodBeat.i(89575);
      if (paramConnectionResult.isSuccess())
      {
        BaseGmsClient.this.getRemoteService(null, BaseGmsClient.this.getScopes());
        AppMethodBeat.o(89575);
      }
      while (true)
      {
        return;
        if (BaseGmsClient.zzg(BaseGmsClient.this) != null)
          BaseGmsClient.zzg(BaseGmsClient.this).onConnectionFailed(paramConnectionResult);
        AppMethodBeat.o(89575);
      }
    }
  }

  protected final class PostInitCallback extends BaseGmsClient.zza
  {
    public final IBinder service;

    public PostInitCallback(int paramIBinder, IBinder paramBundle, Bundle arg4)
    {
      super(paramIBinder, localBundle);
      this.service = paramBundle;
    }

    protected final void handleServiceFailure(ConnectionResult paramConnectionResult)
    {
      AppMethodBeat.i(89576);
      if (BaseGmsClient.zzg(BaseGmsClient.this) != null)
        BaseGmsClient.zzg(BaseGmsClient.this).onConnectionFailed(paramConnectionResult);
      BaseGmsClient.this.onConnectionFailed(paramConnectionResult);
      AppMethodBeat.o(89576);
    }

    protected final boolean handleServiceSuccess()
    {
      boolean bool = false;
      AppMethodBeat.i(89577);
      try
      {
        String str1 = this.service.getInterfaceDescriptor();
        if (!BaseGmsClient.this.getServiceDescriptor().equals(str1))
        {
          String str2 = BaseGmsClient.this.getServiceDescriptor();
          new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(str1).length()).append("service descriptor mismatch: ").append(str2).append(" vs. ").append(str1);
          AppMethodBeat.o(89577);
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          AppMethodBeat.o(89577);
          continue;
          Object localObject = BaseGmsClient.this.createServiceInterface(this.service);
          if ((localObject != null) && ((BaseGmsClient.zza(BaseGmsClient.this, 2, 4, (IInterface)localObject)) || (BaseGmsClient.zza(BaseGmsClient.this, 3, 4, (IInterface)localObject))))
          {
            BaseGmsClient.zza(BaseGmsClient.this, null);
            localObject = BaseGmsClient.this.getConnectionHint();
            if (BaseGmsClient.zze(BaseGmsClient.this) != null)
              BaseGmsClient.zze(BaseGmsClient.this).onConnected((Bundle)localObject);
            bool = true;
            AppMethodBeat.o(89577);
          }
          else
          {
            AppMethodBeat.o(89577);
          }
        }
      }
    }
  }

  protected final class PostServiceBindingCallback extends BaseGmsClient.zza
  {
    public PostServiceBindingCallback(int paramBundle, Bundle arg3)
    {
      super(paramBundle, localBundle);
    }

    protected final void handleServiceFailure(ConnectionResult paramConnectionResult)
    {
      AppMethodBeat.i(89578);
      BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(paramConnectionResult);
      BaseGmsClient.this.onConnectionFailed(paramConnectionResult);
      AppMethodBeat.o(89578);
    }

    protected final boolean handleServiceSuccess()
    {
      AppMethodBeat.i(89579);
      BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
      AppMethodBeat.o(89579);
      return true;
    }
  }

  public static abstract interface SignOutCallbacks
  {
    public abstract void onSignOutComplete();
  }

  abstract class zza extends BaseGmsClient<T>.CallbackProxy<Boolean>
  {
    public final Bundle resolution;
    public final int statusCode;

    protected zza(int paramBundle, Bundle arg3)
    {
      super(Boolean.TRUE);
      this.statusCode = paramBundle;
      Object localObject;
      this.resolution = localObject;
    }

    protected void deliverCallback(Boolean paramBoolean)
    {
      Object localObject = null;
      if (paramBoolean == null)
        BaseGmsClient.zza(BaseGmsClient.this, 1, null);
      while (true)
      {
        return;
        switch (this.statusCode)
        {
        default:
          BaseGmsClient.zza(BaseGmsClient.this, 1, null);
          paramBoolean = localObject;
          if (this.resolution != null)
            paramBoolean = (PendingIntent)this.resolution.getParcelable("pendingIntent");
          handleServiceFailure(new ConnectionResult(this.statusCode, paramBoolean));
          break;
        case 0:
          if (!handleServiceSuccess())
          {
            BaseGmsClient.zza(BaseGmsClient.this, 1, null);
            handleServiceFailure(new ConnectionResult(8, null));
          }
          break;
        case 10:
        }
      }
      BaseGmsClient.zza(BaseGmsClient.this, 1, null);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }

    protected abstract void handleServiceFailure(ConnectionResult paramConnectionResult);

    protected abstract boolean handleServiceSuccess();

    protected void onDeliverCallbackFailed()
    {
    }
  }

  final class zzb extends Handler
  {
    public zzb(Looper arg2)
    {
      super();
    }

    private static void zza(Message paramMessage)
    {
      AppMethodBeat.i(89581);
      paramMessage = (BaseGmsClient.CallbackProxy)paramMessage.obj;
      paramMessage.onDeliverCallbackFailed();
      paramMessage.unregister();
      AppMethodBeat.o(89581);
    }

    private static boolean zzb(Message paramMessage)
    {
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (paramMessage.what != 2)
      {
        bool2 = bool1;
        if (paramMessage.what != 1)
          if (paramMessage.what != 7)
            break label35;
      }
      label35: for (bool2 = bool1; ; bool2 = false)
        return bool2;
    }

    public final void handleMessage(Message paramMessage)
    {
      PendingIntent localPendingIntent = null;
      AppMethodBeat.i(89580);
      if (BaseGmsClient.this.mDisconnectCount.get() != paramMessage.arg1)
      {
        if (zzb(paramMessage))
          zza(paramMessage);
        AppMethodBeat.o(89580);
      }
      while (true)
      {
        return;
        if (((paramMessage.what == 1) || (paramMessage.what == 7) || (paramMessage.what == 4) || (paramMessage.what == 5)) && (!BaseGmsClient.this.isConnecting()))
        {
          zza(paramMessage);
          AppMethodBeat.o(89580);
        }
        else if (paramMessage.what == 4)
        {
          BaseGmsClient.zza(BaseGmsClient.this, new ConnectionResult(paramMessage.arg2));
          if ((BaseGmsClient.zzb(BaseGmsClient.this)) && (!BaseGmsClient.zzc(BaseGmsClient.this)))
          {
            BaseGmsClient.zza(BaseGmsClient.this, 3, null);
            AppMethodBeat.o(89580);
          }
          else
          {
            if (BaseGmsClient.zzd(BaseGmsClient.this) != null);
            for (paramMessage = BaseGmsClient.zzd(BaseGmsClient.this); ; paramMessage = new ConnectionResult(8))
            {
              BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(paramMessage);
              BaseGmsClient.this.onConnectionFailed(paramMessage);
              AppMethodBeat.o(89580);
              break;
            }
          }
        }
        else
        {
          if (paramMessage.what == 5)
          {
            if (BaseGmsClient.zzd(BaseGmsClient.this) != null);
            for (paramMessage = BaseGmsClient.zzd(BaseGmsClient.this); ; paramMessage = new ConnectionResult(8))
            {
              BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(paramMessage);
              BaseGmsClient.this.onConnectionFailed(paramMessage);
              AppMethodBeat.o(89580);
              break;
            }
          }
          if (paramMessage.what == 3)
          {
            if ((paramMessage.obj instanceof PendingIntent))
              localPendingIntent = (PendingIntent)paramMessage.obj;
            paramMessage = new ConnectionResult(paramMessage.arg2, localPendingIntent);
            BaseGmsClient.this.mConnectionProgressReportCallbacks.onReportServiceBinding(paramMessage);
            BaseGmsClient.this.onConnectionFailed(paramMessage);
            AppMethodBeat.o(89580);
          }
          else if (paramMessage.what == 6)
          {
            BaseGmsClient.zza(BaseGmsClient.this, 5, null);
            if (BaseGmsClient.zze(BaseGmsClient.this) != null)
              BaseGmsClient.zze(BaseGmsClient.this).onConnectionSuspended(paramMessage.arg2);
            BaseGmsClient.this.onConnectionSuspended(paramMessage.arg2);
            BaseGmsClient.zza(BaseGmsClient.this, 5, 1, null);
            AppMethodBeat.o(89580);
          }
          else if ((paramMessage.what == 2) && (!BaseGmsClient.this.isConnected()))
          {
            zza(paramMessage);
            AppMethodBeat.o(89580);
          }
          else if (zzb(paramMessage))
          {
            ((BaseGmsClient.CallbackProxy)paramMessage.obj).deliverCallback();
            AppMethodBeat.o(89580);
          }
          else
          {
            int i = paramMessage.what;
            Log.wtf("GmsClient", 45 + "Don't know how to handle message: " + i, new Exception());
            AppMethodBeat.o(89580);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.BaseGmsClient
 * JD-Core Version:    0.6.2
 */