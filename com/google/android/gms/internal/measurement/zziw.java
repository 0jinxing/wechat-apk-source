package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

@VisibleForTesting
public final class zziw
  implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener
{
  private volatile boolean zzapk;
  private volatile zzff zzapl;

  protected zziw(zzii paramzzii)
  {
  }

  // ERROR //
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 36
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 44
    //   7: invokestatic 50	com/google/android/gms/common/internal/Preconditions:checkMainThread	(Ljava/lang/String;)V
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield 52	com/google/android/gms/internal/measurement/zziw:zzapl	Lcom/google/android/gms/internal/measurement/zzff;
    //   16: invokevirtual 58	com/google/android/gms/internal/measurement/zzff:getService	()Landroid/os/IInterface;
    //   19: checkcast 60	com/google/android/gms/internal/measurement/zzey
    //   22: astore_2
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 52	com/google/android/gms/internal/measurement/zziw:zzapl	Lcom/google/android/gms/internal/measurement/zzff;
    //   28: aload_0
    //   29: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   32: invokevirtual 66	com/google/android/gms/internal/measurement/zzhg:zzgd	()Lcom/google/android/gms/internal/measurement/zzgg;
    //   35: astore_3
    //   36: new 68	com/google/android/gms/internal/measurement/zziz
    //   39: astore_1
    //   40: aload_1
    //   41: aload_0
    //   42: aload_2
    //   43: invokespecial 71	com/google/android/gms/internal/measurement/zziz:<init>	(Lcom/google/android/gms/internal/measurement/zziw;Lcom/google/android/gms/internal/measurement/zzey;)V
    //   46: aload_3
    //   47: aload_1
    //   48: invokevirtual 77	com/google/android/gms/internal/measurement/zzgg:zzc	(Ljava/lang/Runnable;)V
    //   51: aload_0
    //   52: monitorexit
    //   53: ldc 36
    //   55: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: return
    //   59: astore_1
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 52	com/google/android/gms/internal/measurement/zziw:zzapl	Lcom/google/android/gms/internal/measurement/zzff;
    //   65: aload_0
    //   66: iconst_0
    //   67: putfield 29	com/google/android/gms/internal/measurement/zziw:zzapk	Z
    //   70: goto -19 -> 51
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: ldc 36
    //   78: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_1
    //   82: athrow
    //   83: astore_1
    //   84: goto -24 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   12	51	59	java/lang/IllegalStateException
    //   12	51	73	finally
    //   51	53	73	finally
    //   60	70	73	finally
    //   74	76	73	finally
    //   12	51	83	android/os/DeadObjectException
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(69341);
    Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
    zzfg localzzfg = this.zzape.zzacw.zzjo();
    if (localzzfg != null)
      localzzfg.zzip().zzg("Service connection failed", paramConnectionResult);
    try
    {
      this.zzapk = false;
      this.zzapl = null;
      this.zzape.zzgd().zzc(new zzjb(this));
      AppMethodBeat.o(69341);
      return;
    }
    finally
    {
      AppMethodBeat.o(69341);
    }
    throw paramConnectionResult;
  }

  public final void onConnectionSuspended(int paramInt)
  {
    AppMethodBeat.i(69340);
    Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
    this.zzape.zzge().zzis().log("Service connection suspended");
    this.zzape.zzgd().zzc(new zzja(this));
    AppMethodBeat.o(69340);
  }

  // ERROR //
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc 141
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 143
    //   7: invokestatic 50	com/google/android/gms/common/internal/Preconditions:checkMainThread	(Ljava/lang/String;)V
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_2
    //   13: ifnonnull +31 -> 44
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 29	com/google/android/gms/internal/measurement/zziw:zzapk	Z
    //   21: aload_0
    //   22: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   25: invokevirtual 123	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   28: invokevirtual 146	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   31: ldc 148
    //   33: invokevirtual 131	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   36: aload_0
    //   37: monitorexit
    //   38: ldc 141
    //   40: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: return
    //   44: aload_2
    //   45: invokeinterface 154 1 0
    //   50: astore_1
    //   51: ldc 156
    //   53: aload_1
    //   54: invokevirtual 162	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: istore_3
    //   58: iload_3
    //   59: ifeq +130 -> 189
    //   62: aload_2
    //   63: ifnonnull +59 -> 122
    //   66: aconst_null
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   72: invokevirtual 123	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   75: invokevirtual 165	com/google/android/gms/internal/measurement/zzfg:zzit	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   78: ldc 167
    //   80: invokevirtual 131	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   83: aload_1
    //   84: ifnonnull +126 -> 210
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield 29	com/google/android/gms/internal/measurement/zziw:zzapk	Z
    //   92: invokestatic 173	com/google/android/gms/common/stats/ConnectionTracker:getInstance	()Lcom/google/android/gms/common/stats/ConnectionTracker;
    //   95: aload_0
    //   96: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   99: invokevirtual 177	com/google/android/gms/internal/measurement/zzhg:getContext	()Landroid/content/Context;
    //   102: aload_0
    //   103: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   106: invokestatic 180	com/google/android/gms/internal/measurement/zzii:zza	(Lcom/google/android/gms/internal/measurement/zzii;)Lcom/google/android/gms/internal/measurement/zziw;
    //   109: invokevirtual 184	com/google/android/gms/common/stats/ConnectionTracker:unbindService	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   112: aload_0
    //   113: monitorexit
    //   114: ldc 141
    //   116: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: goto -76 -> 43
    //   122: aload_2
    //   123: ldc 156
    //   125: invokeinterface 188 2 0
    //   130: astore_1
    //   131: aload_1
    //   132: instanceof 60
    //   135: ifeq +11 -> 146
    //   138: aload_1
    //   139: checkcast 60	com/google/android/gms/internal/measurement/zzey
    //   142: astore_1
    //   143: goto -75 -> 68
    //   146: new 190	com/google/android/gms/internal/measurement/zzfa
    //   149: dup
    //   150: aload_2
    //   151: invokespecial 193	com/google/android/gms/internal/measurement/zzfa:<init>	(Landroid/os/IBinder;)V
    //   154: astore_1
    //   155: goto -87 -> 68
    //   158: astore_1
    //   159: aconst_null
    //   160: astore_1
    //   161: aload_0
    //   162: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   165: invokevirtual 123	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   168: invokevirtual 146	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   171: ldc 195
    //   173: invokevirtual 131	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   176: goto -93 -> 83
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: ldc 141
    //   184: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aload_1
    //   188: athrow
    //   189: aload_0
    //   190: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   193: invokevirtual 123	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   196: invokevirtual 146	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   199: ldc 197
    //   201: aload_1
    //   202: invokevirtual 111	com/google/android/gms/internal/measurement/zzfi:zzg	(Ljava/lang/String;Ljava/lang/Object;)V
    //   205: aconst_null
    //   206: astore_1
    //   207: goto -124 -> 83
    //   210: aload_0
    //   211: getfield 21	com/google/android/gms/internal/measurement/zziw:zzape	Lcom/google/android/gms/internal/measurement/zzii;
    //   214: invokevirtual 66	com/google/android/gms/internal/measurement/zzhg:zzgd	()Lcom/google/android/gms/internal/measurement/zzgg;
    //   217: astore_2
    //   218: new 199	com/google/android/gms/internal/measurement/zzix
    //   221: astore 4
    //   223: aload 4
    //   225: aload_0
    //   226: aload_1
    //   227: invokespecial 200	com/google/android/gms/internal/measurement/zzix:<init>	(Lcom/google/android/gms/internal/measurement/zziw;Lcom/google/android/gms/internal/measurement/zzey;)V
    //   230: aload_2
    //   231: aload 4
    //   233: invokevirtual 77	com/google/android/gms/internal/measurement/zzgg:zzc	(Ljava/lang/Runnable;)V
    //   236: goto -124 -> 112
    //   239: astore_1
    //   240: goto -128 -> 112
    //   243: astore_2
    //   244: goto -83 -> 161
    //
    // Exception table:
    //   from	to	target	type
    //   44	58	158	android/os/RemoteException
    //   122	143	158	android/os/RemoteException
    //   146	155	158	android/os/RemoteException
    //   189	205	158	android/os/RemoteException
    //   16	38	179	finally
    //   44	58	179	finally
    //   68	83	179	finally
    //   87	92	179	finally
    //   92	112	179	finally
    //   112	114	179	finally
    //   122	143	179	finally
    //   146	155	179	finally
    //   161	176	179	finally
    //   180	182	179	finally
    //   189	205	179	finally
    //   210	236	179	finally
    //   92	112	239	java/lang/IllegalArgumentException
    //   68	83	243	android/os/RemoteException
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(69337);
    Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
    this.zzape.zzge().zzis().log("Service disconnected");
    this.zzape.zzgd().zzc(new zziy(this, paramComponentName));
    AppMethodBeat.o(69337);
  }

  public final void zzc(Intent paramIntent)
  {
    AppMethodBeat.i(69335);
    this.zzape.zzab();
    Context localContext = this.zzape.getContext();
    ConnectionTracker localConnectionTracker = ConnectionTracker.getInstance();
    try
    {
      if (this.zzapk)
        this.zzape.zzge().zzit().log("Connection attempt already in progress");
      while (true)
      {
        return;
        this.zzape.zzge().zzit().log("Using local app measurement service");
        this.zzapk = true;
        localConnectionTracker.bindService(localContext, paramIntent, zzii.zza(this.zzape), 129);
        AppMethodBeat.o(69335);
      }
    }
    finally
    {
      AppMethodBeat.o(69335);
    }
    throw paramIntent;
  }

  public final void zzkh()
  {
    AppMethodBeat.i(69338);
    this.zzape.zzab();
    Context localContext = this.zzape.getContext();
    try
    {
      if (this.zzapk)
        this.zzape.zzge().zzit().log("Connection attempt already in progress");
      while (true)
      {
        return;
        if (this.zzapl != null)
        {
          this.zzape.zzge().zzit().log("Already awaiting connection attempt");
          AppMethodBeat.o(69338);
        }
        else
        {
          zzff localzzff = new com/google/android/gms/internal/measurement/zzff;
          localzzff.<init>(localContext, Looper.getMainLooper(), this, this);
          this.zzapl = localzzff;
          this.zzape.zzge().zzit().log("Connecting to remote service");
          this.zzapk = true;
          this.zzapl.checkAvailabilityAndConnect();
          AppMethodBeat.o(69338);
        }
      }
    }
    finally
    {
      AppMethodBeat.o(69338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zziw
 * JD-Core Version:    0.6.2
 */