package com.google.android.gms.wearable;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WearableListenerService$zzc extends Handler
{
  private boolean started;
  private final WearableListenerService.zzb zzal;

  WearableListenerService$zzc(WearableListenerService paramWearableListenerService, Looper paramLooper)
  {
    super(paramLooper);
    AppMethodBeat.i(70918);
    this.zzal = new WearableListenerService.zzb(this.zzak, null);
    AppMethodBeat.o(70918);
  }

  @SuppressLint({"UntrackedBindService"})
  private final void zzb()
  {
    try
    {
      AppMethodBeat.i(70921);
      if (this.started)
        AppMethodBeat.o(70921);
      while (true)
      {
        return;
        if (Log.isLoggable("WearableLS", 2))
        {
          String str = String.valueOf(WearableListenerService.zza(this.zzak));
          int i = String.valueOf(str).length();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(i + 13);
          localStringBuilder.append("bindService: ").append(str);
        }
        this.zzak.bindService(WearableListenerService.zzb(this.zzak), this.zzal, 1);
        this.started = true;
        AppMethodBeat.o(70921);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  @SuppressLint({"UntrackedBindService"})
  private final void zzb(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 90
    //   4: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 46	com/google/android/gms/wearable/WearableListenerService$zzc:started	Z
    //   11: ifne +11 -> 22
    //   14: ldc 90
    //   16: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: ldc 48
    //   24: iconst_2
    //   25: invokestatic 54	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   28: ifeq +69 -> 97
    //   31: aload_0
    //   32: getfield 17	com/google/android/gms/wearable/WearableListenerService$zzc:zzak	Lcom/google/android/gms/wearable/WearableListenerService;
    //   35: invokestatic 58	com/google/android/gms/wearable/WearableListenerService:zza	(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/ComponentName;
    //   38: invokestatic 64	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   41: astore_2
    //   42: aload_1
    //   43: invokestatic 64	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   46: invokevirtual 68	java/lang/String:length	()I
    //   49: istore_3
    //   50: aload_2
    //   51: invokestatic 64	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   54: invokevirtual 68	java/lang/String:length	()I
    //   57: istore 4
    //   59: new 70	java/lang/StringBuilder
    //   62: astore 5
    //   64: aload 5
    //   66: iload_3
    //   67: bipush 17
    //   69: iadd
    //   70: iload 4
    //   72: iadd
    //   73: invokespecial 72	java/lang/StringBuilder:<init>	(I)V
    //   76: aload 5
    //   78: ldc 92
    //   80: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_1
    //   84: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: ldc 94
    //   89: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_2
    //   93: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_0
    //   98: getfield 17	com/google/android/gms/wearable/WearableListenerService$zzc:zzak	Lcom/google/android/gms/wearable/WearableListenerService;
    //   101: aload_0
    //   102: getfield 34	com/google/android/gms/wearable/WearableListenerService$zzc:zzal	Lcom/google/android/gms/wearable/WearableListenerService$zzb;
    //   105: invokevirtual 98	com/google/android/gms/wearable/WearableListenerService:unbindService	(Landroid/content/ServiceConnection;)V
    //   108: aload_0
    //   109: iconst_0
    //   110: putfield 46	com/google/android/gms/wearable/WearableListenerService$zzc:started	Z
    //   113: ldc 90
    //   115: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -99 -> 19
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: athrow
    //   126: astore_1
    //   127: goto -19 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   2	19	121	finally
    //   22	97	121	finally
    //   97	108	121	finally
    //   108	118	121	finally
    //   97	108	126	java/lang/RuntimeException
  }

  public final void dispatchMessage(Message paramMessage)
  {
    AppMethodBeat.i(70919);
    zzb();
    while (true)
    {
      try
      {
        super.dispatchMessage(paramMessage);
        return;
      }
      finally
      {
        if (!hasMessages(0))
          zzb("dispatch");
        AppMethodBeat.o(70919);
      }
      AppMethodBeat.o(70919);
    }
  }

  final void quit()
  {
    AppMethodBeat.i(70920);
    getLooper().quit();
    zzb("quit");
    AppMethodBeat.o(70920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService.zzc
 * JD-Core Version:    0.6.2
 */