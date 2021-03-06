package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@KeepForSdk
public class AdvertisingIdClient
{

  @GuardedBy("this")
  private final Context mContext;

  @GuardedBy("this")
  private BlockingServiceConnection zze;

  @GuardedBy("this")
  private zze zzf;

  @GuardedBy("this")
  private boolean zzg;
  private final Object zzh;

  @GuardedBy("mAutoDisconnectTaskLock")
  private AdvertisingIdClient.zza zzi;
  private final boolean zzj;
  private final long zzk;

  @KeepForSdk
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L, false, false);
  }

  @VisibleForTesting
  private AdvertisingIdClient(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(115326);
    this.zzh = new Object();
    Preconditions.checkNotNull(paramContext);
    Context localContext;
    if (paramBoolean1)
    {
      localContext = paramContext.getApplicationContext();
      if (localContext != null);
    }
    for (this.mContext = paramContext; ; this.mContext = paramContext)
    {
      this.zzg = false;
      this.zzk = paramLong;
      this.zzj = paramBoolean2;
      AppMethodBeat.o(115326);
      return;
      paramContext = localContext;
      break;
    }
  }

  @KeepForSdk
  public static AdvertisingIdClient.Info getAdvertisingIdInfo(Context paramContext)
  {
    AppMethodBeat.i(115335);
    Object localObject1 = new zzb(paramContext);
    boolean bool = ((zzb)localObject1).getBoolean("gads:ad_id_app_context:enabled", false);
    float f = ((zzb)localObject1).getFloat("gads:ad_id_app_context:ping_ratio", 0.0F);
    String str = ((zzb)localObject1).getString("gads:ad_id_use_shared_preference:experiment_id", "");
    paramContext = new AdvertisingIdClient(paramContext, -1L, bool, ((zzb)localObject1).getBoolean("gads:ad_id_use_persistent_service:enabled", false));
    try
    {
      long l = SystemClock.elapsedRealtime();
      paramContext.zza(false);
      localObject1 = paramContext.getInfo();
      paramContext.zza((AdvertisingIdClient.Info)localObject1, bool, f, SystemClock.elapsedRealtime() - l, str, null);
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      paramContext.zza(null, bool, f, -1L, str, localThrowable);
      AppMethodBeat.o(115335);
      throw localThrowable;
    }
    finally
    {
      paramContext.finish();
      AppMethodBeat.o(115335);
    }
  }

  @KeepForSdk
  public static boolean getIsAdIdFakeForDebugLogging(Context paramContext)
  {
    AppMethodBeat.i(115336);
    Object localObject = new zzb(paramContext);
    localObject = new AdvertisingIdClient(paramContext, -1L, ((zzb)localObject).getBoolean("gads:ad_id_app_context:enabled", false), ((zzb)localObject).getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
    try
    {
      ((AdvertisingIdClient)localObject).zza(false);
      boolean bool = ((AdvertisingIdClient)localObject).zzb();
      return bool;
    }
    finally
    {
      ((AdvertisingIdClient)localObject).finish();
      AppMethodBeat.o(115336);
    }
    throw paramContext;
  }

  @KeepForSdk
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean)
  {
  }

  private static BlockingServiceConnection zza(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(115334);
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      switch (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, 12451000))
      {
      case 1:
      default:
        paramContext = new IOException("Google Play services not available");
        AppMethodBeat.o(115334);
        throw paramContext;
      case 0:
      case 2:
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = new GooglePlayServicesNotAvailableException(9);
      AppMethodBeat.o(115334);
      throw paramContext;
    }
    Object localObject;
    if (paramBoolean)
      localObject = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
    while (true)
    {
      BlockingServiceConnection localBlockingServiceConnection = new BlockingServiceConnection();
      localObject = new Intent((String)localObject);
      ((Intent)localObject).setPackage("com.google.android.gms");
      try
      {
        paramBoolean = ConnectionTracker.getInstance().bindService(paramContext, (Intent)localObject, localBlockingServiceConnection, 1);
        if (paramBoolean)
        {
          AppMethodBeat.o(115334);
          return localBlockingServiceConnection;
          localObject = "com.google.android.gms.ads.identifier.service.START";
        }
      }
      catch (Throwable paramContext)
      {
        paramContext = new IOException(paramContext);
        AppMethodBeat.o(115334);
        throw paramContext;
      }
    }
    paramContext = new IOException("Connection failure");
    AppMethodBeat.o(115334);
    throw paramContext;
  }

  @VisibleForTesting
  private static zze zza(Context paramContext, BlockingServiceConnection paramBlockingServiceConnection)
  {
    AppMethodBeat.i(115338);
    try
    {
      paramContext = zzf.zza(paramBlockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
      AppMethodBeat.o(115338);
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      paramContext = new IOException("Interrupted exception");
      AppMethodBeat.o(115338);
      throw paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext = new IOException(paramContext);
      AppMethodBeat.o(115338);
    }
    throw paramContext;
  }

  private final void zza()
  {
    AppMethodBeat.i(115329);
    synchronized (this.zzh)
    {
      if (this.zzi != null)
        this.zzi.zzo.countDown();
    }
    try
    {
      this.zzi.join();
      label36: if (this.zzk > 0L)
      {
        AdvertisingIdClient.zza localzza = new com/google/android/gms/ads/identifier/AdvertisingIdClient$zza;
        localzza.<init>(this, this.zzk);
        this.zzi = localzza;
      }
      AppMethodBeat.o(115329);
      return;
      localObject2 = finally;
      AppMethodBeat.o(115329);
      throw localObject2;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label36;
    }
  }

  @VisibleForTesting
  private final void zza(boolean paramBoolean)
  {
    AppMethodBeat.i(115328);
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzg)
        finish();
      this.zze = zza(this.mContext, this.zzj);
      this.zzf = zza(this.mContext, this.zze);
      this.zzg = true;
      if (paramBoolean)
        zza();
      return;
    }
    finally
    {
      AppMethodBeat.o(115328);
    }
  }

  @VisibleForTesting
  private final boolean zza(AdvertisingIdClient.Info paramInfo, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(115337);
    if (Math.random() > paramFloat)
    {
      paramBoolean = false;
      AppMethodBeat.o(115337);
      return paramBoolean;
    }
    HashMap localHashMap = new HashMap();
    if (paramBoolean)
    {
      str = "1";
      label43: localHashMap.put("app_context", str);
      if (paramInfo != null)
        if (!paramInfo.isLimitAdTrackingEnabled())
          break label229;
    }
    label229: for (String str = "1"; ; str = "0")
    {
      localHashMap.put("limit_ad_tracking", str);
      if ((paramInfo != null) && (paramInfo.getId() != null))
        localHashMap.put("ad_id_size", Integer.toString(paramInfo.getId().length()));
      if (paramThrowable != null)
        localHashMap.put("error", paramThrowable.getClass().getName());
      if ((paramString != null) && (!paramString.isEmpty()))
        localHashMap.put("experiment_id", paramString);
      localHashMap.put("tag", "AdvertisingIdClient");
      localHashMap.put("time_spent", Long.toString(paramLong));
      new zza(this, localHashMap).start();
      paramBoolean = true;
      AppMethodBeat.o(115337);
      break;
      str = "0";
      break label43;
    }
  }

  private final boolean zzb()
  {
    AppMethodBeat.i(115331);
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzg)
        break label139;
      synchronized (this.zzh)
      {
        if ((this.zzi == null) || (!this.zzi.zzp))
        {
          IOException localIOException3 = new java/io/IOException;
          localIOException3.<init>("AdvertisingIdClient is not connected.");
          AppMethodBeat.o(115331);
          throw localIOException3;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(115331);
    }
    try
    {
      zza(false);
      if (!this.zzg)
      {
        IOException localIOException1 = new java/io/IOException;
        localIOException1.<init>("AdvertisingIdClient cannot reconnect.");
        AppMethodBeat.o(115331);
        throw localIOException1;
      }
    }
    catch (Exception localException)
    {
      IOException localIOException4 = new java/io/IOException;
      localIOException4.<init>("AdvertisingIdClient cannot reconnect.", localException);
      AppMethodBeat.o(115331);
      throw localIOException4;
    }
    label139: Preconditions.checkNotNull(this.zze);
    Preconditions.checkNotNull(this.zzf);
    try
    {
      boolean bool = this.zzf.zzc();
      zza();
      AppMethodBeat.o(115331);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException2 = new java/io/IOException;
      localIOException2.<init>("Remote exception");
      AppMethodBeat.o(115331);
      throw localIOException2;
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(115333);
    finish();
    super.finalize();
    AppMethodBeat.o(115333);
  }

  // ERROR //
  public final void finish()
  {
    // Byte code:
    //   0: ldc_w 367
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 247
    //   8: invokestatic 250	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield 65	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   17: ifnull +10 -> 27
    //   20: aload_0
    //   21: getfield 254	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   24: ifnonnull +12 -> 36
    //   27: aload_0
    //   28: monitorexit
    //   29: ldc_w 367
    //   32: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: return
    //   36: aload_0
    //   37: getfield 67	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   40: ifeq +17 -> 57
    //   43: invokestatic 192	com/google/android/gms/common/stats/ConnectionTracker:getInstance	()Lcom/google/android/gms/common/stats/ConnectionTracker;
    //   46: aload_0
    //   47: getfield 65	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   50: aload_0
    //   51: getfield 254	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   54: invokevirtual 371	com/google/android/gms/common/stats/ConnectionTracker:unbindService	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield 67	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield 258	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	Lcom/google/android/gms/internal/ads_identifier/zze;
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield 254	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/BlockingServiceConnection;
    //   72: aload_0
    //   73: monitorexit
    //   74: ldc_w 367
    //   77: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -45 -> 35
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: ldc_w 367
    //   89: invokestatic 74	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_1
    //   93: athrow
    //   94: astore_1
    //   95: goto -38 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   13	27	83	finally
    //   27	29	83	finally
    //   36	57	83	finally
    //   57	74	83	finally
    //   84	86	83	finally
    //   36	57	94	java/lang/Throwable
  }

  @KeepForSdk
  public AdvertisingIdClient.Info getInfo()
  {
    AppMethodBeat.i(115330);
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzg)
        break label139;
      synchronized (this.zzh)
      {
        if ((this.zzi == null) || (!this.zzi.zzp))
        {
          IOException localIOException2 = new java/io/IOException;
          localIOException2.<init>("AdvertisingIdClient is not connected.");
          AppMethodBeat.o(115330);
          throw localIOException2;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(115330);
    }
    Object localObject3;
    try
    {
      zza(false);
      if (!this.zzg)
      {
        localObject3 = new java/io/IOException;
        ((IOException)localObject3).<init>("AdvertisingIdClient cannot reconnect.");
        AppMethodBeat.o(115330);
        throw ((Throwable)localObject3);
      }
    }
    catch (Exception localException)
    {
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>("AdvertisingIdClient cannot reconnect.", localException);
      AppMethodBeat.o(115330);
      throw ((Throwable)localObject3);
    }
    label139: Preconditions.checkNotNull(this.zze);
    Preconditions.checkNotNull(this.zzf);
    try
    {
      localObject3 = new com/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
      ((AdvertisingIdClient.Info)localObject3).<init>(this.zzf.getId(), this.zzf.zzb(true));
      zza();
      AppMethodBeat.o(115330);
      return localObject3;
    }
    catch (RemoteException localRemoteException)
    {
      IOException localIOException1 = new java/io/IOException;
      localIOException1.<init>("Remote exception");
      AppMethodBeat.o(115330);
      throw localIOException1;
    }
  }

  @KeepForSdk
  public void start()
  {
    AppMethodBeat.i(115327);
    zza(true);
    AppMethodBeat.o(115327);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.6.2
 */