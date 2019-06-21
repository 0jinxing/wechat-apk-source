package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

final class zzt
  implements ServiceConnection
{

  @GuardedBy("this")
  int state;
  final Messenger zzcc;
  zzy zzcd;

  @GuardedBy("this")
  final Queue<zzz<?>> zzce;

  @GuardedBy("this")
  final SparseArray<zzz<?>> zzcf;

  private zzt(zzr paramzzr)
  {
    AppMethodBeat.i(57603);
    this.state = 0;
    this.zzcc = new Messenger(new Handler(Looper.getMainLooper(), new zzu(this)));
    this.zzce = new ArrayDeque();
    this.zzcf = new SparseArray();
    AppMethodBeat.o(57603);
  }

  private final void zzr()
  {
    AppMethodBeat.i(57607);
    zzr.zze(this.zzcg).execute(new zzw(this));
    AppMethodBeat.o(57607);
  }

  // ERROR //
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 101
    //   4: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 103
    //   9: iconst_2
    //   10: invokestatic 109	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   13: pop
    //   14: aload_2
    //   15: ifnonnull +18 -> 33
    //   18: aload_0
    //   19: iconst_0
    //   20: ldc 111
    //   22: invokevirtual 115	com/google/android/gms/iid/zzt:zzd	(ILjava/lang/String;)V
    //   25: ldc 101
    //   27: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: new 117	com/google/android/gms/iid/zzy
    //   36: astore_1
    //   37: aload_1
    //   38: aload_2
    //   39: invokespecial 120	com/google/android/gms/iid/zzy:<init>	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 122	com/google/android/gms/iid/zzt:zzcd	Lcom/google/android/gms/iid/zzy;
    //   47: aload_0
    //   48: iconst_2
    //   49: putfield 39	com/google/android/gms/iid/zzt:state	I
    //   52: aload_0
    //   53: invokespecial 124	com/google/android/gms/iid/zzt:zzr	()V
    //   56: ldc 101
    //   58: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: goto -31 -> 30
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore_1
    //   70: aload_0
    //   71: iconst_0
    //   72: aload_1
    //   73: invokevirtual 128	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   76: invokevirtual 115	com/google/android/gms/iid/zzt:zzd	(ILjava/lang/String;)V
    //   79: ldc 101
    //   81: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: goto -54 -> 30
    //
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   18	30	64	finally
    //   33	47	64	finally
    //   47	61	64	finally
    //   70	84	64	finally
    //   33	47	69	android/os/RemoteException
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    try
    {
      AppMethodBeat.i(57608);
      Log.isLoggable("MessengerIpcClient", 2);
      zzd(2, "Service disconnected");
      AppMethodBeat.o(57608);
      return;
    }
    finally
    {
      paramComponentName = finally;
    }
    throw paramComponentName;
  }

  final void zzd(int paramInt, String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(57609);
        if (Log.isLoggable("MessengerIpcClient", 3))
        {
          localObject = String.valueOf(paramString);
          if (((String)localObject).length() != 0)
            "Disconnected: ".concat((String)localObject);
        }
        else
        {
          switch (this.state)
          {
          default:
            localObject = new java/lang/IllegalStateException;
            paramInt = this.state;
            paramString = new java/lang/StringBuilder;
            paramString.<init>(26);
            ((IllegalStateException)localObject).<init>("Unknown state: " + paramInt);
            AppMethodBeat.o(57609);
            throw ((Throwable)localObject);
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
      }
      finally
      {
      }
      new String("Disconnected: ");
    }
    paramString = new java/lang/IllegalStateException;
    paramString.<init>();
    AppMethodBeat.o(57609);
    throw paramString;
    Log.isLoggable("MessengerIpcClient", 2);
    this.state = 4;
    ConnectionTracker.getInstance().unbindService(zzr.zzd(this.zzcg), this);
    Object localObject = new com/google/android/gms/iid/zzaa;
    ((zzaa)localObject).<init>(paramInt, paramString);
    paramString = this.zzce.iterator();
    while (paramString.hasNext())
      ((zzz)paramString.next()).zzd((zzaa)localObject);
    this.zzce.clear();
    for (paramInt = 0; paramInt < this.zzcf.size(); paramInt++)
      ((zzz)this.zzcf.valueAt(paramInt)).zzd((zzaa)localObject);
    this.zzcf.clear();
    AppMethodBeat.o(57609);
    while (true)
    {
      return;
      this.state = 4;
      AppMethodBeat.o(57609);
      continue;
      AppMethodBeat.o(57609);
    }
  }

  final boolean zzd(Message paramMessage)
  {
    AppMethodBeat.i(57605);
    int i = paramMessage.arg1;
    if (Log.isLoggable("MessengerIpcClient", 3))
      new StringBuilder(41).append("Received response to request: ").append(i);
    while (true)
    {
      zzz localzzz;
      try
      {
        localzzz = (zzz)this.zzcf.get(i);
        if (localzzz == null)
        {
          paramMessage = new java/lang/StringBuilder;
          paramMessage.<init>(50);
          paramMessage.append("Received response for unknown request: ").append(i);
          return true;
        }
        this.zzcf.remove(i);
        zzs();
        paramMessage = paramMessage.getData();
        if (paramMessage.getBoolean("unsupported", false))
        {
          localzzz.zzd(new zzaa(4, "Not supported by GmsCore"));
          AppMethodBeat.o(57605);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(57605);
      }
      localzzz.zzh(paramMessage);
    }
  }

  final boolean zze(zzz paramzzz)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    Object localObject;
    try
    {
      AppMethodBeat.i(57604);
      switch (this.state)
      {
      default:
        paramzzz = new java/lang/IllegalStateException;
        int i = this.state;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(26);
        paramzzz.<init>("Unknown state: " + i);
        AppMethodBeat.o(57604);
        throw paramzzz;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    finally
    {
    }
    this.zzce.add(paramzzz);
    if (this.state == 0)
      bool1 = true;
    Preconditions.checkState(bool1);
    Log.isLoggable("MessengerIpcClient", 2);
    this.state = 1;
    paramzzz = new android/content/Intent;
    paramzzz.<init>("com.google.android.c2dm.intent.REGISTER");
    paramzzz.setPackage("com.google.android.gms");
    if (!ConnectionTracker.getInstance().bindService(zzr.zzd(this.zzcg), paramzzz, this, 1))
    {
      zzd(0, "Unable to bind to service");
      AppMethodBeat.o(57604);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      localObject = zzr.zze(this.zzcg);
      paramzzz = new com/google/android/gms/iid/zzv;
      paramzzz.<init>(this);
      ((ScheduledExecutorService)localObject).schedule(paramzzz, 30L, TimeUnit.SECONDS);
      break;
      this.zzce.add(paramzzz);
      AppMethodBeat.o(57604);
      bool1 = bool2;
      continue;
      this.zzce.add(paramzzz);
      zzr();
      AppMethodBeat.o(57604);
      bool1 = bool2;
      continue;
      AppMethodBeat.o(57604);
      bool1 = false;
    }
  }

  final void zzg(int paramInt)
  {
    try
    {
      AppMethodBeat.i(57612);
      zzz localzzz = (zzz)this.zzcf.get(paramInt);
      if (localzzz != null)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(31);
        ((StringBuilder)localObject2).append("Timing out request: ").append(paramInt);
        this.zzcf.remove(paramInt);
        localObject2 = new com/google/android/gms/iid/zzaa;
        ((zzaa)localObject2).<init>(3, "Timed out waiting for response");
        localzzz.zzd((zzaa)localObject2);
        zzs();
      }
      AppMethodBeat.o(57612);
      return;
    }
    finally
    {
    }
  }

  final void zzs()
  {
    try
    {
      AppMethodBeat.i(57610);
      if ((this.state == 2) && (this.zzce.isEmpty()) && (this.zzcf.size() == 0))
      {
        Log.isLoggable("MessengerIpcClient", 2);
        this.state = 3;
        ConnectionTracker.getInstance().unbindService(zzr.zzd(this.zzcg), this);
      }
      AppMethodBeat.o(57610);
      return;
    }
    finally
    {
    }
  }

  final void zzt()
  {
    try
    {
      AppMethodBeat.i(57611);
      if (this.state == 1)
        zzd(1, "Timed out while binding");
      AppMethodBeat.o(57611);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzt
 * JD-Core Version:    0.6.2
 */