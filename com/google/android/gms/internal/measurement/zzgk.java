package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.BlockingQueue;

final class zzgk extends Thread
{
  private final Object zzamc;
  private final BlockingQueue<zzgj<?>> zzamd;

  public zzgk(String paramString, BlockingQueue<zzgj<?>> paramBlockingQueue)
  {
    AppMethodBeat.i(69059);
    Preconditions.checkNotNull(paramBlockingQueue);
    Object localObject;
    Preconditions.checkNotNull(localObject);
    this.zzamc = new Object();
    this.zzamd = localObject;
    setName(paramBlockingQueue);
    AppMethodBeat.o(69059);
  }

  private final void zza(InterruptedException paramInterruptedException)
  {
    AppMethodBeat.i(69062);
    this.zzalz.zzge().zzip().zzg(String.valueOf(getName()).concat(" was interrupted"), paramInterruptedException);
    AppMethodBeat.o(69062);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 89
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +27 -> 35
    //   11: aload_0
    //   12: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   15: invokestatic 94	com/google/android/gms/internal/measurement/zzgg:zza	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/util/concurrent/Semaphore;
    //   18: invokevirtual 99	java/util/concurrent/Semaphore:acquire	()V
    //   21: iconst_1
    //   22: istore_1
    //   23: goto -16 -> 7
    //   26: astore_2
    //   27: aload_0
    //   28: aload_2
    //   29: invokespecial 101	com/google/android/gms/internal/measurement/zzgk:zza	(Ljava/lang/InterruptedException;)V
    //   32: goto -25 -> 7
    //   35: invokestatic 107	android/os/Process:myTid	()I
    //   38: invokestatic 111	android/os/Process:getThreadPriority	(I)I
    //   41: istore_3
    //   42: aload_0
    //   43: getfield 38	com/google/android/gms/internal/measurement/zzgk:zzamd	Ljava/util/concurrent/BlockingQueue;
    //   46: invokeinterface 117 1 0
    //   51: checkcast 119	com/google/android/gms/internal/measurement/zzgj
    //   54: astore_2
    //   55: aload_2
    //   56: ifnull +91 -> 147
    //   59: aload_2
    //   60: getfield 123	com/google/android/gms/internal/measurement/zzgj:zzamb	Z
    //   63: ifeq +78 -> 141
    //   66: iload_3
    //   67: istore_1
    //   68: iload_1
    //   69: invokestatic 126	android/os/Process:setThreadPriority	(I)V
    //   72: aload_2
    //   73: invokevirtual 128	com/google/android/gms/internal/measurement/zzgj:run	()V
    //   76: goto -34 -> 42
    //   79: astore 4
    //   81: aload_0
    //   82: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   85: invokestatic 132	com/google/android/gms/internal/measurement/zzgg:zzc	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/lang/Object;
    //   88: astore_2
    //   89: aload_2
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   95: invokestatic 94	com/google/android/gms/internal/measurement/zzgg:zza	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/util/concurrent/Semaphore;
    //   98: invokevirtual 135	java/util/concurrent/Semaphore:release	()V
    //   101: aload_0
    //   102: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   105: invokestatic 132	com/google/android/gms/internal/measurement/zzgg:zzc	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/lang/Object;
    //   108: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   111: aload_0
    //   112: aload_0
    //   113: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   116: invokestatic 142	com/google/android/gms/internal/measurement/zzgg:zzd	(Lcom/google/android/gms/internal/measurement/zzgg;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   119: if_acmpne +253 -> 372
    //   122: aload_0
    //   123: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   126: aconst_null
    //   127: invokestatic 145	com/google/android/gms/internal/measurement/zzgg:zza	(Lcom/google/android/gms/internal/measurement/zzgg;Lcom/google/android/gms/internal/measurement/zzgk;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   130: pop
    //   131: aload_2
    //   132: monitorexit
    //   133: ldc 89
    //   135: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload 4
    //   140: athrow
    //   141: bipush 10
    //   143: istore_1
    //   144: goto -76 -> 68
    //   147: aload_0
    //   148: getfield 36	com/google/android/gms/internal/measurement/zzgk:zzamc	Ljava/lang/Object;
    //   151: astore_2
    //   152: aload_2
    //   153: monitorenter
    //   154: aload_0
    //   155: getfield 38	com/google/android/gms/internal/measurement/zzgk:zzamd	Ljava/util/concurrent/BlockingQueue;
    //   158: invokeinterface 148 1 0
    //   163: ifnonnull +27 -> 190
    //   166: aload_0
    //   167: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   170: invokestatic 152	com/google/android/gms/internal/measurement/zzgg:zzb	(Lcom/google/android/gms/internal/measurement/zzgg;)Z
    //   173: istore 5
    //   175: iload 5
    //   177: ifne +13 -> 190
    //   180: aload_0
    //   181: getfield 36	com/google/android/gms/internal/measurement/zzgk:zzamc	Ljava/lang/Object;
    //   184: ldc2_w 153
    //   187: invokevirtual 158	java/lang/Object:wait	(J)V
    //   190: aload_2
    //   191: monitorexit
    //   192: aload_0
    //   193: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   196: invokestatic 132	com/google/android/gms/internal/measurement/zzgg:zzc	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/lang/Object;
    //   199: astore 4
    //   201: aload 4
    //   203: monitorenter
    //   204: aload_0
    //   205: getfield 38	com/google/android/gms/internal/measurement/zzgk:zzamd	Ljava/util/concurrent/BlockingQueue;
    //   208: invokeinterface 148 1 0
    //   213: ifnonnull +142 -> 355
    //   216: aload 4
    //   218: monitorexit
    //   219: aload_0
    //   220: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   223: invokestatic 132	com/google/android/gms/internal/measurement/zzgg:zzc	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/lang/Object;
    //   226: astore 4
    //   228: aload 4
    //   230: monitorenter
    //   231: aload_0
    //   232: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   235: invokestatic 94	com/google/android/gms/internal/measurement/zzgg:zza	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/util/concurrent/Semaphore;
    //   238: invokevirtual 135	java/util/concurrent/Semaphore:release	()V
    //   241: aload_0
    //   242: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   245: invokestatic 132	com/google/android/gms/internal/measurement/zzgg:zzc	(Lcom/google/android/gms/internal/measurement/zzgg;)Ljava/lang/Object;
    //   248: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   251: aload_0
    //   252: aload_0
    //   253: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   256: invokestatic 142	com/google/android/gms/internal/measurement/zzgg:zzd	(Lcom/google/android/gms/internal/measurement/zzgg;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   259: if_acmpne +44 -> 303
    //   262: aload_0
    //   263: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   266: aconst_null
    //   267: invokestatic 145	com/google/android/gms/internal/measurement/zzgg:zza	(Lcom/google/android/gms/internal/measurement/zzgg;Lcom/google/android/gms/internal/measurement/zzgk;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   270: pop
    //   271: aload 4
    //   273: monitorexit
    //   274: ldc 89
    //   276: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: return
    //   280: astore 4
    //   282: aload_0
    //   283: aload 4
    //   285: invokespecial 101	com/google/android/gms/internal/measurement/zzgk:zza	(Ljava/lang/InterruptedException;)V
    //   288: goto -98 -> 190
    //   291: astore 4
    //   293: aload_2
    //   294: monitorexit
    //   295: ldc 89
    //   297: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: aload 4
    //   302: athrow
    //   303: aload_0
    //   304: aload_0
    //   305: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   308: invokestatic 161	com/google/android/gms/internal/measurement/zzgg:zze	(Lcom/google/android/gms/internal/measurement/zzgg;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   311: if_acmpne +26 -> 337
    //   314: aload_0
    //   315: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   318: aconst_null
    //   319: invokestatic 163	com/google/android/gms/internal/measurement/zzgg:zzb	(Lcom/google/android/gms/internal/measurement/zzgg;Lcom/google/android/gms/internal/measurement/zzgk;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   322: pop
    //   323: goto -52 -> 271
    //   326: astore_2
    //   327: aload 4
    //   329: monitorexit
    //   330: ldc 89
    //   332: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   335: aload_2
    //   336: athrow
    //   337: aload_0
    //   338: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   341: invokevirtual 57	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   344: invokevirtual 166	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   347: ldc 168
    //   349: invokevirtual 171	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   352: goto -81 -> 271
    //   355: aload 4
    //   357: monitorexit
    //   358: goto -316 -> 42
    //   361: astore_2
    //   362: aload 4
    //   364: monitorexit
    //   365: ldc 89
    //   367: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   370: aload_2
    //   371: athrow
    //   372: aload_0
    //   373: aload_0
    //   374: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   377: invokestatic 161	com/google/android/gms/internal/measurement/zzgg:zze	(Lcom/google/android/gms/internal/measurement/zzgg;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   380: if_acmpne +27 -> 407
    //   383: aload_0
    //   384: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   387: aconst_null
    //   388: invokestatic 163	com/google/android/gms/internal/measurement/zzgg:zzb	(Lcom/google/android/gms/internal/measurement/zzgg;Lcom/google/android/gms/internal/measurement/zzgk;)Lcom/google/android/gms/internal/measurement/zzgk;
    //   391: pop
    //   392: goto -261 -> 131
    //   395: astore 4
    //   397: aload_2
    //   398: monitorexit
    //   399: ldc 89
    //   401: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   404: aload 4
    //   406: athrow
    //   407: aload_0
    //   408: getfield 15	com/google/android/gms/internal/measurement/zzgk:zzalz	Lcom/google/android/gms/internal/measurement/zzgg;
    //   411: invokevirtual 57	com/google/android/gms/internal/measurement/zzhg:zzge	()Lcom/google/android/gms/internal/measurement/zzfg;
    //   414: invokevirtual 166	com/google/android/gms/internal/measurement/zzfg:zzim	()Lcom/google/android/gms/internal/measurement/zzfi;
    //   417: ldc 168
    //   419: invokevirtual 171	com/google/android/gms/internal/measurement/zzfi:log	(Ljava/lang/String;)V
    //   422: goto -291 -> 131
    //
    // Exception table:
    //   from	to	target	type
    //   11	21	26	java/lang/InterruptedException
    //   35	42	79	finally
    //   42	55	79	finally
    //   59	66	79	finally
    //   68	76	79	finally
    //   147	154	79	finally
    //   192	204	79	finally
    //   295	303	79	finally
    //   365	372	79	finally
    //   180	190	280	java/lang/InterruptedException
    //   154	175	291	finally
    //   180	190	291	finally
    //   190	192	291	finally
    //   282	288	291	finally
    //   293	295	291	finally
    //   231	271	326	finally
    //   271	274	326	finally
    //   303	323	326	finally
    //   327	330	326	finally
    //   337	352	326	finally
    //   204	219	361	finally
    //   355	358	361	finally
    //   362	365	361	finally
    //   91	131	395	finally
    //   131	133	395	finally
    //   372	392	395	finally
    //   397	399	395	finally
    //   407	422	395	finally
  }

  public final void zzjn()
  {
    AppMethodBeat.i(69061);
    synchronized (this.zzamc)
    {
      this.zzamc.notifyAll();
      AppMethodBeat.o(69061);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgk
 * JD-Core Version:    0.6.2
 */