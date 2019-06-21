package com.google.firebase.iid;

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

final class aj
  implements ServiceConnection
{
  final Messenger bwS;
  ao bwT;

  @GuardedBy("this")
  final Queue<c<?>> bwU;

  @GuardedBy("this")
  final SparseArray<c<?>> bwV;

  @GuardedBy("this")
  int state;

  private aj(ai paramai)
  {
    AppMethodBeat.i(108820);
    this.state = 0;
    this.bwS = new Messenger(new Handler(Looper.getMainLooper(), new ak(this)));
    this.bwU = new ArrayDeque();
    this.bwV = new SparseArray();
    AppMethodBeat.o(108820);
  }

  private final void zzt()
  {
    AppMethodBeat.i(108824);
    this.bwW.bwP.execute(new am(this));
    AppMethodBeat.o(108824);
  }

  final boolean b(c paramc)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    Object localObject;
    try
    {
      AppMethodBeat.i(108821);
      switch (this.state)
      {
      default:
        paramc = new java/lang/IllegalStateException;
        int i = this.state;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(26);
        paramc.<init>("Unknown state: " + i);
        AppMethodBeat.o(108821);
        throw paramc;
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
    this.bwU.add(paramc);
    if (this.state == 0)
      bool1 = true;
    Preconditions.checkState(bool1);
    Log.isLoggable("MessengerIpcClient", 2);
    this.state = 1;
    paramc = new android/content/Intent;
    paramc.<init>("com.google.android.c2dm.intent.REGISTER");
    paramc.setPackage("com.google.android.gms");
    if (!ConnectionTracker.getInstance().bindService(this.bwW.bvF, paramc, this, 1))
    {
      zza(0, "Unable to bind to service");
      AppMethodBeat.o(108821);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      localObject = this.bwW.bwP;
      paramc = new com/google/firebase/iid/al;
      paramc.<init>(this);
      ((ScheduledExecutorService)localObject).schedule(paramc, 30L, TimeUnit.SECONDS);
      break;
      this.bwU.add(paramc);
      AppMethodBeat.o(108821);
      bool1 = bool2;
      continue;
      this.bwU.add(paramc);
      zzt();
      AppMethodBeat.o(108821);
      bool1 = bool2;
      continue;
      AppMethodBeat.o(108821);
      bool1 = false;
    }
  }

  final boolean f(Message paramMessage)
  {
    AppMethodBeat.i(108822);
    int i = paramMessage.arg1;
    if (Log.isLoggable("MessengerIpcClient", 3))
      new StringBuilder(41).append("Received response to request: ").append(i);
    while (true)
    {
      c localc;
      try
      {
        localc = (c)this.bwV.get(i);
        if (localc == null)
        {
          paramMessage = new java/lang/StringBuilder;
          paramMessage.<init>(50);
          paramMessage.append("Received response for unknown request: ").append(i);
          return true;
        }
        this.bwV.remove(i);
        zzu();
        paramMessage = paramMessage.getData();
        if (paramMessage.getBoolean("unsupported", false))
        {
          localc.a(new d(4, "Not supported by GmsCore"));
          AppMethodBeat.o(108822);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(108822);
      }
      localc.zzb(paramMessage);
    }
  }

  final void fk(int paramInt)
  {
    try
    {
      AppMethodBeat.i(108829);
      c localc = (c)this.bwV.get(paramInt);
      if (localc != null)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(31);
        ((StringBuilder)localObject2).append("Timing out request: ").append(paramInt);
        this.bwV.remove(paramInt);
        localObject2 = new com/google/firebase/iid/d;
        ((d)localObject2).<init>(3, "Timed out waiting for response");
        localc.a((d)localObject2);
        zzu();
      }
      AppMethodBeat.o(108829);
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 250
    //   4: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 135
    //   9: iconst_2
    //   10: invokestatic 141	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   13: pop
    //   14: aload_2
    //   15: ifnonnull +18 -> 33
    //   18: aload_0
    //   19: iconst_0
    //   20: ldc 252
    //   22: invokevirtual 172	com/google/firebase/iid/aj:zza	(ILjava/lang/String;)V
    //   25: ldc 250
    //   27: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: new 254	com/google/firebase/iid/ao
    //   36: astore_1
    //   37: aload_1
    //   38: aload_2
    //   39: invokespecial 257	com/google/firebase/iid/ao:<init>	(Landroid/os/IBinder;)V
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 259	com/google/firebase/iid/aj:bwT	Lcom/google/firebase/iid/ao;
    //   47: aload_0
    //   48: iconst_2
    //   49: putfield 39	com/google/firebase/iid/aj:state	I
    //   52: aload_0
    //   53: invokespecial 189	com/google/firebase/iid/aj:zzt	()V
    //   56: ldc 250
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
    //   73: invokevirtual 262	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   76: invokevirtual 172	com/google/firebase/iid/aj:zza	(ILjava/lang/String;)V
    //   79: ldc 250
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
      AppMethodBeat.i(108825);
      Log.isLoggable("MessengerIpcClient", 2);
      zza(2, "Service disconnected");
      AppMethodBeat.o(108825);
      return;
    }
    finally
    {
      paramComponentName = finally;
    }
    throw paramComponentName;
  }

  final void zza(int paramInt, String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(108826);
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
            AppMethodBeat.o(108826);
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
    AppMethodBeat.o(108826);
    throw paramString;
    Log.isLoggable("MessengerIpcClient", 2);
    this.state = 4;
    ConnectionTracker.getInstance().unbindService(this.bwW.bvF, this);
    Object localObject = new com/google/firebase/iid/d;
    ((d)localObject).<init>(paramInt, paramString);
    paramString = this.bwU.iterator();
    while (paramString.hasNext())
      ((c)paramString.next()).a((d)localObject);
    this.bwU.clear();
    for (paramInt = 0; paramInt < this.bwV.size(); paramInt++)
      ((c)this.bwV.valueAt(paramInt)).a((d)localObject);
    this.bwV.clear();
    AppMethodBeat.o(108826);
    while (true)
    {
      return;
      this.state = 4;
      AppMethodBeat.o(108826);
      continue;
      AppMethodBeat.o(108826);
    }
  }

  final void zzu()
  {
    try
    {
      AppMethodBeat.i(108827);
      if ((this.state == 2) && (this.bwU.isEmpty()) && (this.bwV.size() == 0))
      {
        Log.isLoggable("MessengerIpcClient", 2);
        this.state = 3;
        ConnectionTracker.getInstance().unbindService(this.bwW.bvF, this);
      }
      AppMethodBeat.o(108827);
      return;
    }
    finally
    {
    }
  }

  final void zzv()
  {
    try
    {
      AppMethodBeat.i(108828);
      if (this.state == 1)
        zza(1, "Timed out while binding");
      AppMethodBeat.o(108828);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.aj
 * JD-Core Version:    0.6.2
 */