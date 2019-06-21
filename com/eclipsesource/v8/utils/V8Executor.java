package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class V8Executor extends Thread
{
  private Exception exception;
  private volatile boolean forceTerminating;
  private boolean longRunning;
  private String messageHandler;
  private LinkedList<String[]> messageQueue;
  private String result;
  private V8 runtime;
  private final String script;
  private volatile boolean shuttingDown;
  private volatile boolean terminated;

  public V8Executor(String paramString)
  {
    this(paramString, false, null);
  }

  public V8Executor(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(75085);
    this.terminated = false;
    this.shuttingDown = false;
    this.forceTerminating = false;
    this.exception = null;
    this.messageQueue = new LinkedList();
    this.script = paramString1;
    this.longRunning = paramBoolean;
    this.messageHandler = paramString2;
    AppMethodBeat.o(75085);
  }

  public void forceTermination()
  {
    AppMethodBeat.i(75088);
    try
    {
      this.forceTerminating = true;
      this.shuttingDown = true;
      if (this.runtime != null)
        this.runtime.terminateExecution();
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(75088);
    }
  }

  public Exception getException()
  {
    return this.exception;
  }

  public String getResult()
  {
    return this.result;
  }

  public boolean hasException()
  {
    if (this.exception != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean hasTerminated()
  {
    return this.terminated;
  }

  public boolean isShuttingDown()
  {
    return this.shuttingDown;
  }

  public boolean isTerminating()
  {
    return this.forceTerminating;
  }

  public void postMessage(String[] paramArrayOfString)
  {
    AppMethodBeat.i(75086);
    try
    {
      this.messageQueue.add(paramArrayOfString);
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(75086);
    }
    throw paramArrayOfString;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 98
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: invokestatic 102	com/eclipsesource/v8/V8:createV8Runtime	()Lcom/eclipsesource/v8/V8;
    //   11: putfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   14: aload_0
    //   15: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   18: astore_1
    //   19: new 6	com/eclipsesource/v8/utils/V8Executor$ExecutorTermination
    //   22: astore_2
    //   23: aload_2
    //   24: aload_0
    //   25: invokespecial 105	com/eclipsesource/v8/utils/V8Executor$ExecutorTermination:<init>	(Lcom/eclipsesource/v8/utils/V8Executor;)V
    //   28: aload_1
    //   29: aload_2
    //   30: ldc 107
    //   32: invokevirtual 111	com/eclipsesource/v8/V8:registerJavaMethod	(Lcom/eclipsesource/v8/JavaVoidCallback;Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   35: pop
    //   36: aload_0
    //   37: aload_0
    //   38: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   41: invokevirtual 115	com/eclipsesource/v8/utils/V8Executor:setup	(Lcom/eclipsesource/v8/V8;)V
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_0
    //   47: getfield 44	com/eclipsesource/v8/utils/V8Executor:forceTerminating	Z
    //   50: ifne +83 -> 133
    //   53: aload_0
    //   54: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   57: astore_2
    //   58: new 117	java/lang/StringBuilder
    //   61: astore_1
    //   62: aload_1
    //   63: ldc 119
    //   65: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: aload_2
    //   69: aload_1
    //   70: aload_0
    //   71: getfield 53	com/eclipsesource/v8/utils/V8Executor:script	Ljava/lang/String;
    //   74: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: aload_0
    //   81: invokevirtual 131	com/eclipsesource/v8/utils/V8Executor:getName	()Ljava/lang/String;
    //   84: iconst_m1
    //   85: invokevirtual 135	com/eclipsesource/v8/V8:executeScript	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;
    //   88: astore_2
    //   89: aload_2
    //   90: ifnull +11 -> 101
    //   93: aload_0
    //   94: aload_2
    //   95: invokevirtual 136	java/lang/Object:toString	()Ljava/lang/String;
    //   98: putfield 82	com/eclipsesource/v8/utils/V8Executor:result	Ljava/lang/String;
    //   101: aload_2
    //   102: instanceof 138
    //   105: ifeq +12 -> 117
    //   108: aload_2
    //   109: checkcast 138	com/eclipsesource/v8/Releasable
    //   112: invokeinterface 141 1 0
    //   117: aload_2
    //   118: instanceof 138
    //   121: ifeq +12 -> 133
    //   124: aload_2
    //   125: checkcast 138	com/eclipsesource/v8/Releasable
    //   128: invokeinterface 141 1 0
    //   133: aload_0
    //   134: getfield 44	com/eclipsesource/v8/utils/V8Executor:forceTerminating	Z
    //   137: ifne +341 -> 478
    //   140: aload_0
    //   141: getfield 55	com/eclipsesource/v8/utils/V8Executor:longRunning	Z
    //   144: ifeq +334 -> 478
    //   147: aload_0
    //   148: monitorenter
    //   149: aload_0
    //   150: getfield 51	com/eclipsesource/v8/utils/V8Executor:messageQueue	Ljava/util/LinkedList;
    //   153: invokevirtual 144	java/util/LinkedList:isEmpty	()Z
    //   156: ifeq +14 -> 170
    //   159: aload_0
    //   160: getfield 42	com/eclipsesource/v8/utils/V8Executor:shuttingDown	Z
    //   163: ifne +7 -> 170
    //   166: aload_0
    //   167: invokevirtual 147	java/lang/Object:wait	()V
    //   170: aload_0
    //   171: getfield 51	com/eclipsesource/v8/utils/V8Executor:messageQueue	Ljava/util/LinkedList;
    //   174: invokevirtual 144	java/util/LinkedList:isEmpty	()Z
    //   177: ifeq +10 -> 187
    //   180: aload_0
    //   181: getfield 42	com/eclipsesource/v8/utils/V8Executor:shuttingDown	Z
    //   184: ifne +10 -> 194
    //   187: aload_0
    //   188: getfield 44	com/eclipsesource/v8/utils/V8Executor:forceTerminating	Z
    //   191: ifeq +65 -> 256
    //   194: aload_0
    //   195: monitorexit
    //   196: aload_0
    //   197: monitorenter
    //   198: aload_0
    //   199: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   202: invokevirtual 151	com/eclipsesource/v8/V8:getLocker	()Lcom/eclipsesource/v8/V8Locker;
    //   205: invokevirtual 156	com/eclipsesource/v8/V8Locker:hasLock	()Z
    //   208: ifeq +15 -> 223
    //   211: aload_0
    //   212: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   215: invokevirtual 157	com/eclipsesource/v8/V8:release	()V
    //   218: aload_0
    //   219: aconst_null
    //   220: putfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   223: aload_0
    //   224: iconst_1
    //   225: putfield 40	com/eclipsesource/v8/utils/V8Executor:terminated	Z
    //   228: aload_0
    //   229: monitorexit
    //   230: ldc 98
    //   232: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: return
    //   236: astore_2
    //   237: aload_0
    //   238: monitorexit
    //   239: ldc 98
    //   241: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_2
    //   245: athrow
    //   246: astore_2
    //   247: aload_0
    //   248: monitorexit
    //   249: ldc 98
    //   251: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   254: aload_2
    //   255: athrow
    //   256: aload_0
    //   257: monitorexit
    //   258: aload_0
    //   259: getfield 51	com/eclipsesource/v8/utils/V8Executor:messageQueue	Ljava/util/LinkedList;
    //   262: invokevirtual 144	java/util/LinkedList:isEmpty	()Z
    //   265: ifne -132 -> 133
    //   268: aload_0
    //   269: getfield 51	com/eclipsesource/v8/utils/V8Executor:messageQueue	Ljava/util/LinkedList;
    //   272: iconst_0
    //   273: invokevirtual 161	java/util/LinkedList:remove	(I)Ljava/lang/Object;
    //   276: checkcast 163	[Ljava/lang/String;
    //   279: astore_3
    //   280: new 165	com/eclipsesource/v8/V8Array
    //   283: astore_1
    //   284: aload_1
    //   285: aload_0
    //   286: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   289: invokespecial 167	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   292: new 165	com/eclipsesource/v8/V8Array
    //   295: astore_2
    //   296: aload_2
    //   297: aload_0
    //   298: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   301: invokespecial 167	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   304: aload_3
    //   305: arraylength
    //   306: istore 4
    //   308: iconst_0
    //   309: istore 5
    //   311: iload 5
    //   313: iload 4
    //   315: if_icmpge +76 -> 391
    //   318: aload_2
    //   319: aload_3
    //   320: iload 5
    //   322: aaload
    //   323: invokevirtual 171	com/eclipsesource/v8/V8Array:push	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Array;
    //   326: pop
    //   327: iinc 5 1
    //   330: goto -19 -> 311
    //   333: astore_2
    //   334: aload_0
    //   335: monitorexit
    //   336: ldc 98
    //   338: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   341: aload_2
    //   342: athrow
    //   343: astore_2
    //   344: aload_0
    //   345: aload_2
    //   346: putfield 46	com/eclipsesource/v8/utils/V8Executor:exception	Ljava/lang/Exception;
    //   349: aload_0
    //   350: monitorenter
    //   351: aload_0
    //   352: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   355: invokevirtual 151	com/eclipsesource/v8/V8:getLocker	()Lcom/eclipsesource/v8/V8Locker;
    //   358: invokevirtual 156	com/eclipsesource/v8/V8Locker:hasLock	()Z
    //   361: ifeq +15 -> 376
    //   364: aload_0
    //   365: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   368: invokevirtual 157	com/eclipsesource/v8/V8:release	()V
    //   371: aload_0
    //   372: aconst_null
    //   373: putfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   376: aload_0
    //   377: iconst_1
    //   378: putfield 40	com/eclipsesource/v8/utils/V8Executor:terminated	Z
    //   381: aload_0
    //   382: monitorexit
    //   383: ldc 98
    //   385: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   388: goto -153 -> 235
    //   391: aload_1
    //   392: aload_2
    //   393: invokevirtual 174	com/eclipsesource/v8/V8Array:push	(Lcom/eclipsesource/v8/V8Value;)Lcom/eclipsesource/v8/V8Array;
    //   396: pop
    //   397: aload_0
    //   398: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   401: aload_0
    //   402: getfield 57	com/eclipsesource/v8/utils/V8Executor:messageHandler	Ljava/lang/String;
    //   405: aload_1
    //   406: invokevirtual 178	com/eclipsesource/v8/V8:executeVoidFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)V
    //   409: aload_2
    //   410: invokevirtual 179	com/eclipsesource/v8/V8Array:release	()V
    //   413: aload_1
    //   414: invokevirtual 179	com/eclipsesource/v8/V8Array:release	()V
    //   417: goto -284 -> 133
    //   420: astore_2
    //   421: aload_0
    //   422: monitorenter
    //   423: aload_0
    //   424: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   427: invokevirtual 151	com/eclipsesource/v8/V8:getLocker	()Lcom/eclipsesource/v8/V8Locker;
    //   430: invokevirtual 156	com/eclipsesource/v8/V8Locker:hasLock	()Z
    //   433: ifeq +15 -> 448
    //   436: aload_0
    //   437: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   440: invokevirtual 157	com/eclipsesource/v8/V8:release	()V
    //   443: aload_0
    //   444: aconst_null
    //   445: putfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   448: aload_0
    //   449: iconst_1
    //   450: putfield 40	com/eclipsesource/v8/utils/V8Executor:terminated	Z
    //   453: aload_0
    //   454: monitorexit
    //   455: ldc 98
    //   457: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   460: aload_2
    //   461: athrow
    //   462: astore_3
    //   463: aload_2
    //   464: invokevirtual 179	com/eclipsesource/v8/V8Array:release	()V
    //   467: aload_1
    //   468: invokevirtual 179	com/eclipsesource/v8/V8Array:release	()V
    //   471: ldc 98
    //   473: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   476: aload_3
    //   477: athrow
    //   478: aload_0
    //   479: monitorenter
    //   480: aload_0
    //   481: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   484: invokevirtual 151	com/eclipsesource/v8/V8:getLocker	()Lcom/eclipsesource/v8/V8Locker;
    //   487: invokevirtual 156	com/eclipsesource/v8/V8Locker:hasLock	()Z
    //   490: ifeq +15 -> 505
    //   493: aload_0
    //   494: getfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   497: invokevirtual 157	com/eclipsesource/v8/V8:release	()V
    //   500: aload_0
    //   501: aconst_null
    //   502: putfield 66	com/eclipsesource/v8/utils/V8Executor:runtime	Lcom/eclipsesource/v8/V8;
    //   505: aload_0
    //   506: iconst_1
    //   507: putfield 40	com/eclipsesource/v8/utils/V8Executor:terminated	Z
    //   510: aload_0
    //   511: monitorexit
    //   512: ldc 98
    //   514: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   517: goto -282 -> 235
    //   520: astore_2
    //   521: aload_0
    //   522: monitorexit
    //   523: ldc 98
    //   525: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   528: aload_2
    //   529: athrow
    //   530: astore_2
    //   531: aload_0
    //   532: monitorexit
    //   533: ldc 98
    //   535: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   538: aload_2
    //   539: athrow
    //   540: astore_2
    //   541: aload_0
    //   542: monitorexit
    //   543: ldc 98
    //   545: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   548: aload_2
    //   549: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	46	236	finally
    //   237	239	236	finally
    //   198	223	246	finally
    //   223	230	246	finally
    //   247	249	246	finally
    //   149	170	333	finally
    //   170	187	333	finally
    //   187	194	333	finally
    //   194	196	333	finally
    //   256	258	333	finally
    //   334	336	333	finally
    //   46	89	343	java/lang/Exception
    //   93	101	343	java/lang/Exception
    //   101	117	343	java/lang/Exception
    //   117	133	343	java/lang/Exception
    //   133	149	343	java/lang/Exception
    //   258	304	343	java/lang/Exception
    //   336	343	343	java/lang/Exception
    //   409	417	343	java/lang/Exception
    //   463	478	343	java/lang/Exception
    //   46	89	420	finally
    //   93	101	420	finally
    //   101	117	420	finally
    //   117	133	420	finally
    //   133	149	420	finally
    //   258	304	420	finally
    //   336	343	420	finally
    //   344	349	420	finally
    //   409	417	420	finally
    //   463	478	420	finally
    //   304	308	462	finally
    //   318	327	462	finally
    //   391	409	462	finally
    //   480	505	520	finally
    //   505	512	520	finally
    //   521	523	520	finally
    //   351	376	530	finally
    //   376	383	530	finally
    //   531	533	530	finally
    //   423	448	540	finally
    //   448	455	540	finally
    //   541	543	540	finally
  }

  protected void setup(V8 paramV8)
  {
  }

  public void shutdown()
  {
    AppMethodBeat.i(75089);
    try
    {
      this.shuttingDown = true;
      notify();
      return;
    }
    finally
    {
      AppMethodBeat.o(75089);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8Executor
 * JD-Core Version:    0.6.2
 */