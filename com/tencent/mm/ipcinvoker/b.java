package com.tencent.mm.ipcinvoker;

import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
  private static volatile b eFJ;
  Map<String, Class<?>> eFK;
  public Map<String, a> eFL;
  private volatile boolean eFM;
  Map<String, Set<j>> eFN;
  private Handler mHandler;

  private b()
  {
    AppMethodBeat.i(114012);
    this.eFK = new HashMap();
    this.eFL = new ConcurrentHashMap();
    HandlerThread localHandlerThread = new HandlerThread("IPCBridgeThread#" + hashCode());
    localHandlerThread.start();
    this.mHandler = new Handler(localHandlerThread.getLooper());
    this.eFN = new HashMap();
    AppMethodBeat.o(114012);
  }

  public static b PL()
  {
    AppMethodBeat.i(114011);
    if (eFJ == null);
    try
    {
      if (eFJ == null)
      {
        localb = new com/tencent/mm/ipcinvoker/b;
        localb.<init>();
        eFJ = localb;
      }
      b localb = eFJ;
      AppMethodBeat.o(114011);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(114011);
    }
  }

  public final void PM()
  {
    try
    {
      this.eFM = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final a ld(String paramString)
  {
    // Byte code:
    //   0: ldc 131
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 133
    //   7: ldc 135
    //   9: iconst_1
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: invokestatic 140	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: aload_0
    //   21: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   24: aload_1
    //   25: invokeinterface 98 2 0
    //   30: checkcast 6	com/tencent/mm/ipcinvoker/b$a
    //   33: astore_2
    //   34: aload_2
    //   35: ifnonnull +597 -> 632
    //   38: aload_0
    //   39: getfield 124	com/tencent/mm/ipcinvoker/b:eFM	Z
    //   42: ifeq +27 -> 69
    //   45: ldc 133
    //   47: ldc 142
    //   49: iconst_1
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: aastore
    //   57: invokestatic 140	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: ldc 131
    //   62: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: aconst_null
    //   66: astore_1
    //   67: aload_1
    //   68: areturn
    //   69: invokestatic 147	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   72: invokestatic 150	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   75: if_acmpne +24 -> 99
    //   78: ldc 133
    //   80: ldc 152
    //   82: iconst_0
    //   83: anewarray 4	java/lang/Object
    //   86: invokestatic 155	com/tencent/mm/ipcinvoker/h/b:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: ldc 131
    //   91: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aconst_null
    //   95: astore_1
    //   96: goto -29 -> 67
    //   99: aload_1
    //   100: invokestatic 161	com/tencent/mm/ipcinvoker/e:getContext	()Landroid/content/Context;
    //   103: invokevirtual 166	android/content/Context:getPackageName	()Ljava/lang/String;
    //   106: invokestatic 172	com/tencent/mm/ipcinvoker/h/c:P	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   109: astore_3
    //   110: aload_0
    //   111: getfield 36	com/tencent/mm/ipcinvoker/b:eFK	Ljava/util/Map;
    //   114: new 45	java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial 173	java/lang/StringBuilder:<init>	()V
    //   121: aload_3
    //   122: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: bipush 47
    //   127: invokevirtual 179	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   130: aload_1
    //   131: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokeinterface 98 2 0
    //   142: checkcast 181	java/lang/Class
    //   145: astore 4
    //   147: aload 4
    //   149: ifnonnull +28 -> 177
    //   152: ldc 133
    //   154: ldc 183
    //   156: iconst_1
    //   157: anewarray 4	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_1
    //   163: aastore
    //   164: invokestatic 155	com/tencent/mm/ipcinvoker/h/b:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: ldc 131
    //   169: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: aconst_null
    //   173: astore_1
    //   174: goto -107 -> 67
    //   177: new 6	com/tencent/mm/ipcinvoker/b$a
    //   180: dup
    //   181: iconst_0
    //   182: invokespecial 186	com/tencent/mm/ipcinvoker/b$a:<init>	(B)V
    //   185: astore_2
    //   186: aload_0
    //   187: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   190: astore 5
    //   192: aload 5
    //   194: monitorenter
    //   195: aload_0
    //   196: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   199: aload_1
    //   200: aload_2
    //   201: invokeinterface 190 3 0
    //   206: pop
    //   207: aload 5
    //   209: monitorexit
    //   210: aload_2
    //   211: monitorenter
    //   212: aload_2
    //   213: iconst_1
    //   214: putfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   217: aload_2
    //   218: monitorexit
    //   219: invokestatic 161	com/tencent/mm/ipcinvoker/e:getContext	()Landroid/content/Context;
    //   222: astore 5
    //   224: aload_2
    //   225: new 195	com/tencent/mm/ipcinvoker/b$1
    //   228: dup
    //   229: aload_0
    //   230: aload_2
    //   231: aload 5
    //   233: aload_1
    //   234: invokespecial 198	com/tencent/mm/ipcinvoker/b$1:<init>	(Lcom/tencent/mm/ipcinvoker/b;Lcom/tencent/mm/ipcinvoker/b$a;Landroid/content/Context;Ljava/lang/String;)V
    //   237: putfield 202	com/tencent/mm/ipcinvoker/b$a:serviceConnection	Landroid/content/ServiceConnection;
    //   240: new 204	android/content/Intent
    //   243: astore 6
    //   245: aload 6
    //   247: invokespecial 205	android/content/Intent:<init>	()V
    //   250: aload 6
    //   252: aload_3
    //   253: aload 4
    //   255: invokevirtual 208	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   258: invokevirtual 212	android/content/Intent:setClassName	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   261: astore_3
    //   262: ldc 133
    //   264: ldc 214
    //   266: iconst_3
    //   267: anewarray 4	java/lang/Object
    //   270: dup
    //   271: iconst_0
    //   272: aload_2
    //   273: invokevirtual 54	java/lang/Object:hashCode	()I
    //   276: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   279: aastore
    //   280: dup
    //   281: iconst_1
    //   282: invokestatic 226	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   285: invokevirtual 230	java/lang/Thread:getId	()J
    //   288: invokestatic 235	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   291: aastore
    //   292: dup
    //   293: iconst_2
    //   294: aload_3
    //   295: aastore
    //   296: invokestatic 140	com/tencent/mm/ipcinvoker/h/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   299: aload 5
    //   301: aload_3
    //   302: aload_2
    //   303: getfield 202	com/tencent/mm/ipcinvoker/b$a:serviceConnection	Landroid/content/ServiceConnection;
    //   306: bipush 33
    //   308: invokevirtual 239	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   311: pop
    //   312: new 241	com/tencent/mm/ipcinvoker/b$2
    //   315: astore_3
    //   316: aload_3
    //   317: aload_0
    //   318: aload_2
    //   319: aload_1
    //   320: invokespecial 244	com/tencent/mm/ipcinvoker/b$2:<init>	(Lcom/tencent/mm/ipcinvoker/b;Lcom/tencent/mm/ipcinvoker/b$a;Ljava/lang/String;)V
    //   323: aload_2
    //   324: aload_3
    //   325: putfield 248	com/tencent/mm/ipcinvoker/b$a:eFU	Ljava/lang/Runnable;
    //   328: aload_0
    //   329: getfield 77	com/tencent/mm/ipcinvoker/b:mHandler	Landroid/os/Handler;
    //   332: astore 4
    //   334: aload_2
    //   335: getfield 248	com/tencent/mm/ipcinvoker/b$a:eFU	Ljava/lang/Runnable;
    //   338: astore_3
    //   339: invokestatic 150	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   342: invokestatic 147	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   345: if_acmpne +77 -> 422
    //   348: ldc2_w 249
    //   351: lstore 7
    //   353: aload 4
    //   355: aload_3
    //   356: lload 7
    //   358: invokevirtual 254	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   361: pop
    //   362: aload_2
    //   363: monitorenter
    //   364: aload_2
    //   365: getfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   368: ifeq +7 -> 375
    //   371: aload_2
    //   372: invokevirtual 257	java/lang/Object:wait	()V
    //   375: aload_2
    //   376: monitorexit
    //   377: aload_2
    //   378: monitorenter
    //   379: aload_2
    //   380: iconst_0
    //   381: putfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   384: aload_2
    //   385: monitorexit
    //   386: aload_2
    //   387: astore_1
    //   388: aload_1
    //   389: getfield 261	com/tencent/mm/ipcinvoker/b$a:eFS	Lcom/tencent/mm/ipcinvoker/b/a;
    //   392: astore_1
    //   393: ldc 131
    //   395: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   398: goto -331 -> 67
    //   401: astore_1
    //   402: aload 5
    //   404: monitorexit
    //   405: ldc 131
    //   407: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   410: aload_1
    //   411: athrow
    //   412: astore_1
    //   413: aload_2
    //   414: monitorexit
    //   415: ldc 131
    //   417: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: aload_1
    //   421: athrow
    //   422: ldc2_w 262
    //   425: lstore 7
    //   427: goto -74 -> 353
    //   430: astore_3
    //   431: aload_2
    //   432: monitorexit
    //   433: ldc 131
    //   435: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   438: aload_3
    //   439: athrow
    //   440: astore_3
    //   441: ldc 133
    //   443: ldc_w 265
    //   446: iconst_1
    //   447: anewarray 4	java/lang/Object
    //   450: dup
    //   451: iconst_0
    //   452: aload_3
    //   453: aastore
    //   454: invokestatic 268	com/tencent/mm/ipcinvoker/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   457: aload_0
    //   458: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   461: astore_3
    //   462: aload_3
    //   463: monitorenter
    //   464: aload_0
    //   465: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   468: aload_1
    //   469: invokeinterface 271 2 0
    //   474: pop
    //   475: aload_3
    //   476: monitorexit
    //   477: aload_2
    //   478: monitorenter
    //   479: aload_2
    //   480: iconst_0
    //   481: putfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   484: aload_2
    //   485: monitorexit
    //   486: ldc 131
    //   488: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   491: aconst_null
    //   492: astore_1
    //   493: goto -426 -> 67
    //   496: astore_1
    //   497: aload_2
    //   498: monitorexit
    //   499: ldc 131
    //   501: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   504: aload_1
    //   505: athrow
    //   506: astore_1
    //   507: aload_3
    //   508: monitorexit
    //   509: ldc 131
    //   511: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   514: aload_1
    //   515: athrow
    //   516: astore_1
    //   517: aload_2
    //   518: monitorenter
    //   519: aload_2
    //   520: iconst_0
    //   521: putfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   524: aload_2
    //   525: monitorexit
    //   526: ldc 131
    //   528: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   531: aload_1
    //   532: athrow
    //   533: astore_1
    //   534: aload_2
    //   535: monitorexit
    //   536: ldc 131
    //   538: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   541: aload_1
    //   542: athrow
    //   543: astore_3
    //   544: ldc 133
    //   546: ldc_w 273
    //   549: iconst_1
    //   550: anewarray 4	java/lang/Object
    //   553: dup
    //   554: iconst_0
    //   555: aload_3
    //   556: invokestatic 279	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   559: aastore
    //   560: invokestatic 268	com/tencent/mm/ipcinvoker/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   563: aload_0
    //   564: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   567: astore_3
    //   568: aload_3
    //   569: monitorenter
    //   570: aload_0
    //   571: getfield 41	com/tencent/mm/ipcinvoker/b:eFL	Ljava/util/Map;
    //   574: aload_1
    //   575: invokeinterface 271 2 0
    //   580: pop
    //   581: aload_3
    //   582: monitorexit
    //   583: aload_2
    //   584: monitorenter
    //   585: aload_2
    //   586: iconst_0
    //   587: putfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   590: aload_2
    //   591: monitorexit
    //   592: ldc 131
    //   594: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   597: aconst_null
    //   598: astore_1
    //   599: goto -532 -> 67
    //   602: astore_1
    //   603: aload_3
    //   604: monitorexit
    //   605: ldc 131
    //   607: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   610: aload_1
    //   611: athrow
    //   612: astore_1
    //   613: aload_2
    //   614: monitorexit
    //   615: ldc 131
    //   617: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   620: aload_1
    //   621: athrow
    //   622: astore_1
    //   623: aload_2
    //   624: monitorexit
    //   625: ldc 131
    //   627: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   630: aload_1
    //   631: athrow
    //   632: aload_2
    //   633: astore_1
    //   634: aload_2
    //   635: getfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   638: ifeq -250 -> 388
    //   641: aload_2
    //   642: monitorenter
    //   643: aload_2
    //   644: getfield 193	com/tencent/mm/ipcinvoker/b$a:eFT	Z
    //   647: ifeq +7 -> 654
    //   650: aload_2
    //   651: invokevirtual 257	java/lang/Object:wait	()V
    //   654: aload_2
    //   655: monitorexit
    //   656: aload_2
    //   657: astore_1
    //   658: goto -270 -> 388
    //   661: astore_1
    //   662: aload_2
    //   663: monitorexit
    //   664: ldc 131
    //   666: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   669: aload_1
    //   670: athrow
    //   671: astore_1
    //   672: ldc 133
    //   674: ldc_w 265
    //   677: iconst_1
    //   678: anewarray 4	java/lang/Object
    //   681: dup
    //   682: iconst_0
    //   683: aload_1
    //   684: aastore
    //   685: invokestatic 268	com/tencent/mm/ipcinvoker/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   688: aload_2
    //   689: astore_1
    //   690: goto -302 -> 388
    //
    // Exception table:
    //   from	to	target	type
    //   195	210	401	finally
    //   402	405	401	finally
    //   212	219	412	finally
    //   413	415	412	finally
    //   364	375	430	finally
    //   375	377	430	finally
    //   431	433	430	finally
    //   240	348	440	java/lang/InterruptedException
    //   353	364	440	java/lang/InterruptedException
    //   433	440	440	java/lang/InterruptedException
    //   379	386	496	finally
    //   497	499	496	finally
    //   464	477	506	finally
    //   507	509	506	finally
    //   240	348	516	finally
    //   353	364	516	finally
    //   433	440	516	finally
    //   441	464	516	finally
    //   509	516	516	finally
    //   544	570	516	finally
    //   605	612	516	finally
    //   479	486	533	finally
    //   534	536	533	finally
    //   240	348	543	java/lang/SecurityException
    //   353	364	543	java/lang/SecurityException
    //   433	440	543	java/lang/SecurityException
    //   570	583	602	finally
    //   603	605	602	finally
    //   585	592	612	finally
    //   613	615	612	finally
    //   519	526	622	finally
    //   623	625	622	finally
    //   643	654	661	finally
    //   654	656	661	finally
    //   662	664	661	finally
    //   641	643	671	java/lang/InterruptedException
    //   664	671	671	java/lang/InterruptedException
  }

  public final boolean le(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(114014);
    if (e.lg(paramString))
      AppMethodBeat.o(114014);
    while (true)
    {
      return bool;
      if (this.eFL.get(paramString) != null)
      {
        bool = true;
        AppMethodBeat.o(114014);
      }
      else
      {
        AppMethodBeat.o(114014);
      }
    }
  }

  public final void lf(String paramString)
  {
    AppMethodBeat.i(114015);
    if (e.lg(paramString))
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "the same process(%s), do not need to release IPCBridge.", new Object[] { paramString });
      AppMethodBeat.o(114015);
    }
    while (true)
    {
      return;
      a locala;
      synchronized (this.eFL)
      {
        locala = (a)this.eFL.get(paramString);
        if (locala == null)
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, IPCBridgeWrapper is null.", new Object[] { paramString });
          AppMethodBeat.o(114015);
        }
      }
      if (locala.eFT);
      try
      {
        locala.eFT = false;
        locala.notifyAll();
        if (locala.serviceConnection == null)
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, ServiceConnection is null.", new Object[] { paramString });
          AppMethodBeat.o(114015);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(114015);
      }
      this.mHandler.post(new b.3(this, locala, paramString));
      AppMethodBeat.o(114015);
    }
  }

  public static final class a
  {
    a eFS;
    public volatile boolean eFT;
    Runnable eFU;
    ServiceConnection serviceConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b
 * JD-Core Version:    0.6.2
 */