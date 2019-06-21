package com.tencent.mm.plugin.fts;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.PriorityBlockingQueue;

public final class g
  implements m
{
  a mBh;

  public g()
  {
    AppMethodBeat.i(136575);
    this.mBh = new a();
    AppMethodBeat.o(136575);
  }

  public final a a(int paramInt, a parama)
  {
    AppMethodBeat.i(136578);
    if (this.mBh == null)
    {
      parama = null;
      AppMethodBeat.o(136578);
      return parama;
    }
    parama.mPriority = paramInt;
    a locala = this.mBh;
    if (!locala.mBk)
    {
      paramInt = parama.getPriority();
      locala.mBj.put(parama);
      if (locala.mBl != null)
        break label71;
      locala.vU(paramInt);
    }
    while (true)
    {
      AppMethodBeat.o(136578);
      break;
      label71: if (paramInt < locala.mBi)
      {
        locala.interrupt();
        locala.vU(paramInt);
      }
    }
  }

  public final boolean isStart()
  {
    AppMethodBeat.i(136576);
    boolean bool;
    if ((this.mBh != null) && (this.mBh.isAlive()))
    {
      bool = true;
      AppMethodBeat.o(136576);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136576);
    }
  }

  public final void quit()
  {
    AppMethodBeat.i(136577);
    if ((this.mBh == null) || (!this.mBh.isAlive()))
      AppMethodBeat.o(136577);
    while (true)
    {
      return;
      this.mBh.quit();
      try
      {
        this.mBh.join();
        label42: this.mBh = null;
        ab.i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon quited.");
        AppMethodBeat.o(136577);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label42;
      }
    }
  }

  final class a extends Thread
  {
    int mBi;
    PriorityBlockingQueue<a> mBj;
    volatile boolean mBk;
    a mBl;
    private boolean mBm;
    Runnable mBn;
    e mBo;
    boolean mBp;
    private int mTid;

    public a()
    {
      super();
      AppMethodBeat.i(136570);
      this.mTid = 0;
      this.mBi = 2147483647;
      this.mBj = new PriorityBlockingQueue();
      this.mBk = false;
      this.mBp = false;
      AppMethodBeat.o(136570);
    }

    // ERROR //
    public final void hy(boolean paramBoolean)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_2
      //   2: aload_0
      //   3: monitorenter
      //   4: ldc 66
      //   6: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   9: aload_0
      //   10: getfield 68	com/tencent/mm/plugin/fts/g$a:mBm	Z
      //   13: iload_1
      //   14: if_icmpne +11 -> 25
      //   17: ldc 66
      //   19: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   22: aload_0
      //   23: monitorexit
      //   24: return
      //   25: aload_0
      //   26: iload_1
      //   27: putfield 68	com/tencent/mm/plugin/fts/g$a:mBm	Z
      //   30: aload_0
      //   31: getfield 46	com/tencent/mm/plugin/fts/g$a:mBi	I
      //   34: iflt +126 -> 160
      //   37: aload_0
      //   38: invokevirtual 72	com/tencent/mm/plugin/fts/g$a:isAlive	()Z
      //   41: ifeq +119 -> 160
      //   44: aload_0
      //   45: getfield 43	com/tencent/mm/plugin/fts/g$a:mTid	I
      //   48: ifeq +112 -> 160
      //   51: aload_0
      //   52: getfield 68	com/tencent/mm/plugin/fts/g$a:mBm	Z
      //   55: istore_1
      //   56: iload_1
      //   57: ifeq +6 -> 63
      //   60: bipush 10
      //   62: istore_2
      //   63: aload_0
      //   64: getfield 43	com/tencent/mm/plugin/fts/g$a:mTid	I
      //   67: iload_2
      //   68: invokestatic 78	android/os/Process:setThreadPriority	(II)V
      //   71: new 80	java/lang/StringBuilder
      //   74: astore_3
      //   75: aload_3
      //   76: ldc 82
      //   78: invokespecial 83	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   81: aload_0
      //   82: getfield 68	com/tencent/mm/plugin/fts/g$a:mBm	Z
      //   85: ifeq +36 -> 121
      //   88: ldc 85
      //   90: astore 4
      //   92: ldc 87
      //   94: aload_3
      //   95: aload 4
      //   97: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   100: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   103: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   106: ldc 66
      //   108: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   111: goto -89 -> 22
      //   114: astore 4
      //   116: aload_0
      //   117: monitorexit
      //   118: aload 4
      //   120: athrow
      //   121: ldc 102
      //   123: astore 4
      //   125: goto -33 -> 92
      //   128: astore 4
      //   130: ldc 87
      //   132: aload 4
      //   134: ldc 104
      //   136: iconst_2
      //   137: anewarray 106	java/lang/Object
      //   140: dup
      //   141: iconst_0
      //   142: aload_0
      //   143: getfield 43	com/tencent/mm/plugin/fts/g$a:mTid	I
      //   146: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   149: aastore
      //   150: dup
      //   151: iconst_1
      //   152: iload_2
      //   153: invokestatic 112	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   156: aastore
      //   157: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   160: ldc 66
      //   162: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   165: goto -143 -> 22
      //
      // Exception table:
      //   from	to	target	type
      //   4	22	114	finally
      //   25	56	114	finally
      //   63	88	114	finally
      //   92	106	114	finally
      //   106	111	114	finally
      //   130	160	114	finally
      //   160	165	114	finally
      //   63	88	128	java/lang/SecurityException
      //   92	106	128	java/lang/SecurityException
    }

    public final void quit()
    {
      try
      {
        AppMethodBeat.i(136572);
        this.mBk = true;
        interrupt();
        AppMethodBeat.o(136572);
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }

    // ERROR //
    public final void run()
    {
      // Byte code:
      //   0: ldc 125
      //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aload_0
      //   6: invokestatic 129	android/os/Process:myTid	()I
      //   9: putfield 43	com/tencent/mm/plugin/fts/g$a:mTid	I
      //   12: invokestatic 132	java/lang/Thread:interrupted	()Z
      //   15: pop
      //   16: aload_0
      //   17: getfield 55	com/tencent/mm/plugin/fts/g$a:mBk	Z
      //   20: istore_1
      //   21: iload_1
      //   22: ifeq +22 -> 44
      //   25: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   28: aload_0
      //   29: aconst_null
      //   30: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   33: aload_0
      //   34: iconst_0
      //   35: putfield 43	com/tencent/mm/plugin/fts/g$a:mTid	I
      //   38: ldc 125
      //   40: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   43: return
      //   44: aload_0
      //   45: aconst_null
      //   46: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   49: aload_0
      //   50: getfield 53	com/tencent/mm/plugin/fts/g$a:mBj	Ljava/util/concurrent/PriorityBlockingQueue;
      //   53: invokevirtual 143	java/util/concurrent/PriorityBlockingQueue:take	()Ljava/lang/Object;
      //   56: checkcast 145	com/tencent/mm/plugin/fts/a/a/a
      //   59: astore_2
      //   60: aload_2
      //   61: ifnonnull +14 -> 75
      //   64: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   67: aload_0
      //   68: aconst_null
      //   69: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   72: goto -60 -> 12
      //   75: aload_0
      //   76: aload_2
      //   77: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   80: aload_0
      //   81: aload_2
      //   82: invokevirtual 148	com/tencent/mm/plugin/fts/a/a/a:getPriority	()I
      //   85: invokevirtual 151	com/tencent/mm/plugin/fts/g$a:vU	(I)V
      //   88: aload_2
      //   89: invokevirtual 154	com/tencent/mm/plugin/fts/a/a/a:getName	()Ljava/lang/String;
      //   92: astore_3
      //   93: aload_3
      //   94: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
      //   97: ifeq +1038 -> 1135
      //   100: aload_2
      //   101: invokevirtual 161	java/lang/Object:toString	()Ljava/lang/String;
      //   104: astore 4
      //   106: aload 4
      //   108: astore_3
      //   109: invokestatic 167	java/lang/System:currentTimeMillis	()J
      //   112: lstore 5
      //   114: aload_2
      //   115: invokevirtual 170	com/tencent/mm/plugin/fts/a/a/a:execute	()Z
      //   118: pop
      //   119: aload_2
      //   120: invokestatic 167	java/lang/System:currentTimeMillis	()J
      //   123: lload 5
      //   125: lsub
      //   126: aload_2
      //   127: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   130: ladd
      //   131: putfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   134: aload_2
      //   135: invokevirtual 177	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   138: aload_2
      //   139: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   142: invokestatic 183	com/tencent/mm/plugin/fts/a/e:K	(IJ)V
      //   145: aload_2
      //   146: invokevirtual 177	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   149: aload_2
      //   150: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   153: invokestatic 186	com/tencent/mm/plugin/fts/a/e:L	(IJ)V
      //   156: aload_2
      //   157: getfield 189	com/tencent/mm/plugin/fts/a/a/a:mDq	J
      //   160: lconst_1
      //   161: land
      //   162: lconst_0
      //   163: lcmp
      //   164: ifle +340 -> 504
      //   167: iconst_1
      //   168: istore 7
      //   170: iload 7
      //   172: ifeq +43 -> 215
      //   175: aload_2
      //   176: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   179: ldc2_w 190
      //   182: lcmp
      //   183: ifle +32 -> 215
      //   186: aload_2
      //   187: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   190: ldc2_w 192
      //   193: lcmp
      //   194: ifge +21 -> 215
      //   197: bipush 27
      //   199: aload_2
      //   200: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   203: invokestatic 183	com/tencent/mm/plugin/fts/a/e:K	(IJ)V
      //   206: bipush 27
      //   208: aload_2
      //   209: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   212: invokestatic 186	com/tencent/mm/plugin/fts/a/e:L	(IJ)V
      //   215: aload_2
      //   216: instanceof 195
      //   219: ifeq +291 -> 510
      //   222: aload_2
      //   223: checkcast 195	com/tencent/mm/plugin/fts/a/a/h
      //   226: astore 8
      //   228: ldc 197
      //   230: iconst_4
      //   231: anewarray 106	java/lang/Object
      //   234: dup
      //   235: iconst_0
      //   236: aload_3
      //   237: aastore
      //   238: dup
      //   239: iconst_1
      //   240: aload 8
      //   242: getfield 201	com/tencent/mm/plugin/fts/a/a/h:mEl	Lcom/tencent/mm/plugin/fts/a/a/i;
      //   245: invokevirtual 204	com/tencent/mm/plugin/fts/a/a/i:toString	()Ljava/lang/String;
      //   248: aastore
      //   249: dup
      //   250: iconst_2
      //   251: aload 8
      //   253: getfield 208	com/tencent/mm/plugin/fts/a/a/h:mEm	Lcom/tencent/mm/plugin/fts/a/a/j;
      //   256: invokevirtual 211	com/tencent/mm/plugin/fts/a/a/j:toString	()Ljava/lang/String;
      //   259: aastore
      //   260: dup
      //   261: iconst_3
      //   262: aload_2
      //   263: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   266: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   269: aastore
      //   270: invokestatic 222	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   273: astore 4
      //   275: aload 8
      //   277: getfield 208	com/tencent/mm/plugin/fts/a/a/h:mEm	Lcom/tencent/mm/plugin/fts/a/a/j;
      //   280: getfield 226	com/tencent/mm/plugin/fts/a/a/j:mEy	Ljava/util/List;
      //   283: invokeinterface 231 1 0
      //   288: istore 7
      //   290: aload_2
      //   291: invokevirtual 177	com/tencent/mm/plugin/fts/a/a/a:getId	()I
      //   294: aload_2
      //   295: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   298: iload 7
      //   300: i2l
      //   301: invokestatic 234	com/tencent/mm/plugin/fts/a/e:i	(IJJ)V
      //   304: aload_2
      //   305: getfield 237	com/tencent/mm/plugin/fts/a/a/a:mDr	Ljava/util/List;
      //   308: ifnull +364 -> 672
      //   311: aload_2
      //   312: getfield 237	com/tencent/mm/plugin/fts/a/a/a:mDr	Ljava/util/List;
      //   315: invokeinterface 231 1 0
      //   320: iconst_1
      //   321: if_icmple +351 -> 672
      //   324: new 239	java/lang/StringBuffer
      //   327: astore 8
      //   329: aload 8
      //   331: invokespecial 240	java/lang/StringBuffer:<init>	()V
      //   334: iconst_1
      //   335: istore 7
      //   337: iload 7
      //   339: aload_2
      //   340: getfield 237	com/tencent/mm/plugin/fts/a/a/a:mDr	Ljava/util/List;
      //   343: invokeinterface 231 1 0
      //   348: if_icmpge +194 -> 542
      //   351: aload_2
      //   352: getfield 237	com/tencent/mm/plugin/fts/a/a/a:mDr	Ljava/util/List;
      //   355: iload 7
      //   357: iconst_1
      //   358: isub
      //   359: invokeinterface 244 2 0
      //   364: checkcast 246	com/tencent/mm/plugin/fts/a/a/a$a
      //   367: astore 9
      //   369: aload_2
      //   370: getfield 237	com/tencent/mm/plugin/fts/a/a/a:mDr	Ljava/util/List;
      //   373: iload 7
      //   375: invokeinterface 244 2 0
      //   380: checkcast 246	com/tencent/mm/plugin/fts/a/a/a$a
      //   383: astore 10
      //   385: aload 8
      //   387: ldc 248
      //   389: invokevirtual 251	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   392: pop
      //   393: aload 8
      //   395: aload 10
      //   397: getfield 255	com/tencent/mm/plugin/fts/a/a/a$a:mDt	Ljava/lang/String;
      //   400: invokevirtual 251	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   403: pop
      //   404: aload 8
      //   406: ldc_w 257
      //   409: invokevirtual 251	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   412: pop
      //   413: aload 8
      //   415: aload 10
      //   417: getfield 260	com/tencent/mm/plugin/fts/a/a/a$a:timestamp	J
      //   420: aload 9
      //   422: getfield 260	com/tencent/mm/plugin/fts/a/a/a$a:timestamp	J
      //   425: lsub
      //   426: invokevirtual 263	java/lang/StringBuffer:append	(J)Ljava/lang/StringBuffer;
      //   429: pop
      //   430: aload 8
      //   432: ldc_w 265
      //   435: invokevirtual 251	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   438: pop
      //   439: iinc 7 1
      //   442: goto -105 -> 337
      //   445: astore 4
      //   447: ldc 125
      //   449: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   452: aload 4
      //   454: athrow
      //   455: astore 4
      //   457: aload_2
      //   458: invokestatic 167	java/lang/System:currentTimeMillis	()J
      //   461: lload 5
      //   463: lsub
      //   464: aload_2
      //   465: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   468: ladd
      //   469: putfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   472: ldc 125
      //   474: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   477: aload 4
      //   479: athrow
      //   480: astore 8
      //   482: aload_2
      //   483: astore 4
      //   485: aload 8
      //   487: astore_2
      //   488: aload 4
      //   490: ifnonnull +190 -> 680
      //   493: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   496: aload_0
      //   497: aconst_null
      //   498: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   501: goto -489 -> 12
      //   504: iconst_0
      //   505: istore 7
      //   507: goto -337 -> 170
      //   510: ldc_w 267
      //   513: iconst_2
      //   514: anewarray 106	java/lang/Object
      //   517: dup
      //   518: iconst_0
      //   519: aload_3
      //   520: aastore
      //   521: dup
      //   522: iconst_1
      //   523: aload_2
      //   524: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   527: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   530: aastore
      //   531: invokestatic 222	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   534: astore 4
      //   536: iconst_0
      //   537: istore 7
      //   539: goto -249 -> 290
      //   542: ldc_w 269
      //   545: iconst_1
      //   546: anewarray 106	java/lang/Object
      //   549: dup
      //   550: iconst_0
      //   551: aload 8
      //   553: invokevirtual 270	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   556: aastore
      //   557: invokestatic 222	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   560: astore 8
      //   562: aload 8
      //   564: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
      //   567: ifne +565 -> 1132
      //   570: new 80	java/lang/StringBuilder
      //   573: astore 9
      //   575: aload 9
      //   577: invokespecial 271	java/lang/StringBuilder:<init>	()V
      //   580: aload 9
      //   582: aload 4
      //   584: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   587: ldc_w 273
      //   590: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   593: aload 8
      //   595: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   598: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   601: astore 4
      //   603: aload_2
      //   604: invokevirtual 276	com/tencent/mm/plugin/fts/a/a/a:aAo	()Ljava/lang/String;
      //   607: astore 9
      //   609: aload 4
      //   611: astore 8
      //   613: aload 9
      //   615: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
      //   618: ifne +36 -> 654
      //   621: new 80	java/lang/StringBuilder
      //   624: astore 8
      //   626: aload 8
      //   628: invokespecial 271	java/lang/StringBuilder:<init>	()V
      //   631: aload 8
      //   633: aload 4
      //   635: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   638: ldc_w 273
      //   641: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   644: aload 9
      //   646: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   649: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   652: astore 8
      //   654: ldc 87
      //   656: aload 8
      //   658: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   661: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   664: aload_0
      //   665: aconst_null
      //   666: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   669: goto -657 -> 12
      //   672: ldc_w 278
      //   675: astore 8
      //   677: goto -115 -> 562
      //   680: aload_2
      //   681: instanceof 280
      //   684: ifeq +69 -> 753
      //   687: aload 4
      //   689: invokevirtual 283	com/tencent/mm/plugin/fts/a/a/a:isCancelled	()Z
      //   692: ifne +12 -> 704
      //   695: aload_0
      //   696: getfield 53	com/tencent/mm/plugin/fts/g$a:mBj	Ljava/util/concurrent/PriorityBlockingQueue;
      //   699: aload 4
      //   701: invokevirtual 287	java/util/concurrent/PriorityBlockingQueue:put	(Ljava/lang/Object;)V
      //   704: ldc 87
      //   706: ldc_w 289
      //   709: iconst_3
      //   710: anewarray 106	java/lang/Object
      //   713: dup
      //   714: iconst_0
      //   715: aload_3
      //   716: aastore
      //   717: dup
      //   718: iconst_1
      //   719: aload 4
      //   721: invokevirtual 283	com/tencent/mm/plugin/fts/a/a/a:isCancelled	()Z
      //   724: invokestatic 294	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   727: aastore
      //   728: dup
      //   729: iconst_2
      //   730: aload 4
      //   732: getfield 174	com/tencent/mm/plugin/fts/a/a/a:mDp	J
      //   735: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   738: aastore
      //   739: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   742: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   745: aload_0
      //   746: aconst_null
      //   747: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   750: goto -738 -> 12
      //   753: aload_2
      //   754: instanceof 299
      //   757: ifeq +114 -> 871
      //   760: ldc 87
      //   762: aload_2
      //   763: ldc_w 301
      //   766: iconst_1
      //   767: anewarray 106	java/lang/Object
      //   770: dup
      //   771: iconst_0
      //   772: aload_3
      //   773: aastore
      //   774: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   777: aload_0
      //   778: getfield 303	com/tencent/mm/plugin/fts/g$a:mBo	Lcom/tencent/mm/plugin/fts/e;
      //   781: ifnull +12 -> 793
      //   784: aload_0
      //   785: getfield 303	com/tencent/mm/plugin/fts/g$a:mBo	Lcom/tencent/mm/plugin/fts/e;
      //   788: invokeinterface 308 1 0
      //   793: bipush 18
      //   795: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   798: aload_0
      //   799: getfield 57	com/tencent/mm/plugin/fts/g$a:mBp	Z
      //   802: ifne -60 -> 742
      //   805: new 80	java/lang/StringBuilder
      //   808: astore_3
      //   809: aload_3
      //   810: invokespecial 271	java/lang/StringBuilder:<init>	()V
      //   813: aload_3
      //   814: aload 4
      //   816: invokevirtual 314	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   819: ldc_w 316
      //   822: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   825: aload_2
      //   826: invokestatic 322	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   829: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   832: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   835: astore_2
      //   836: getstatic 328	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
      //   839: ldc_w 330
      //   842: aload_2
      //   843: aconst_null
      //   844: invokevirtual 334	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
      //   847: aload_0
      //   848: iconst_1
      //   849: putfield 57	com/tencent/mm/plugin/fts/g$a:mBp	Z
      //   852: goto -110 -> 742
      //   855: astore_2
      //   856: invokestatic 137	com/tencent/mm/plugin/fts/a:bzU	()V
      //   859: aload_0
      //   860: aconst_null
      //   861: putfield 139	com/tencent/mm/plugin/fts/g$a:mBl	Lcom/tencent/mm/plugin/fts/a/a/a;
      //   864: ldc 125
      //   866: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   869: aload_2
      //   870: athrow
      //   871: aload_2
      //   872: instanceof 336
      //   875: ifeq +28 -> 903
      //   878: ldc 87
      //   880: aload_2
      //   881: ldc_w 338
      //   884: iconst_1
      //   885: anewarray 106	java/lang/Object
      //   888: dup
      //   889: iconst_0
      //   890: aload_3
      //   891: aastore
      //   892: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   895: bipush 6
      //   897: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   900: goto -158 -> 742
      //   903: aload_2
      //   904: instanceof 340
      //   907: ifeq +28 -> 935
      //   910: ldc 87
      //   912: aload_2
      //   913: ldc_w 338
      //   916: iconst_1
      //   917: anewarray 106	java/lang/Object
      //   920: dup
      //   921: iconst_0
      //   922: aload_3
      //   923: aastore
      //   924: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   927: bipush 7
      //   929: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   932: goto -190 -> 742
      //   935: aload_2
      //   936: instanceof 342
      //   939: ifeq +43 -> 982
      //   942: ldc 87
      //   944: aload_2
      //   945: ldc_w 338
      //   948: iconst_1
      //   949: anewarray 106	java/lang/Object
      //   952: dup
      //   953: iconst_0
      //   954: aload_3
      //   955: aastore
      //   956: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   959: iconst_3
      //   960: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   963: aload_0
      //   964: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   967: ifnull -225 -> 742
      //   970: aload_0
      //   971: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   974: invokeinterface 348 1 0
      //   979: goto -237 -> 742
      //   982: aload_2
      //   983: instanceof 350
      //   986: ifeq +71 -> 1057
      //   989: ldc 87
      //   991: aload_2
      //   992: ldc_w 338
      //   995: iconst_1
      //   996: anewarray 106	java/lang/Object
      //   999: dup
      //   1000: iconst_0
      //   1001: aload_3
      //   1002: aastore
      //   1003: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1006: aload_2
      //   1007: invokevirtual 353	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   1010: ifnull +40 -> 1050
      //   1013: aload_2
      //   1014: invokevirtual 353	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   1017: ldc_w 355
      //   1020: invokevirtual 359	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   1023: ifeq +27 -> 1050
      //   1026: bipush 17
      //   1028: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   1031: aload_0
      //   1032: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   1035: ifnull -293 -> 742
      //   1038: aload_0
      //   1039: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   1042: invokeinterface 348 1 0
      //   1047: goto -305 -> 742
      //   1050: iconst_4
      //   1051: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   1054: goto -23 -> 1031
      //   1057: ldc 87
      //   1059: aload_2
      //   1060: ldc_w 338
      //   1063: iconst_1
      //   1064: anewarray 106	java/lang/Object
      //   1067: dup
      //   1068: iconst_0
      //   1069: aload_3
      //   1070: aastore
      //   1071: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1074: iconst_5
      //   1075: invokestatic 311	com/tencent/mm/plugin/fts/a/e:vV	(I)V
      //   1078: aload_0
      //   1079: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   1082: ifnull -340 -> 742
      //   1085: aload_0
      //   1086: getfield 344	com/tencent/mm/plugin/fts/g$a:mBn	Ljava/lang/Runnable;
      //   1089: invokeinterface 348 1 0
      //   1094: goto -352 -> 742
      //   1097: astore_2
      //   1098: aconst_null
      //   1099: astore_3
      //   1100: aconst_null
      //   1101: astore 4
      //   1103: goto -615 -> 488
      //   1106: astore_3
      //   1107: aconst_null
      //   1108: astore 8
      //   1110: aload_2
      //   1111: astore 4
      //   1113: aload_3
      //   1114: astore_2
      //   1115: aload 8
      //   1117: astore_3
      //   1118: goto -630 -> 488
      //   1121: astore 8
      //   1123: aload_2
      //   1124: astore 4
      //   1126: aload 8
      //   1128: astore_2
      //   1129: goto -641 -> 488
      //   1132: goto -529 -> 603
      //   1135: goto -1026 -> 109
      //
      // Exception table:
      //   from	to	target	type
      //   114	119	445	java/lang/Exception
      //   114	119	455	finally
      //   447	455	455	finally
      //   109	114	480	java/lang/Exception
      //   119	167	480	java/lang/Exception
      //   175	215	480	java/lang/Exception
      //   215	290	480	java/lang/Exception
      //   290	334	480	java/lang/Exception
      //   337	439	480	java/lang/Exception
      //   457	480	480	java/lang/Exception
      //   510	536	480	java/lang/Exception
      //   542	562	480	java/lang/Exception
      //   562	603	480	java/lang/Exception
      //   603	609	480	java/lang/Exception
      //   613	654	480	java/lang/Exception
      //   654	661	480	java/lang/Exception
      //   12	21	855	finally
      //   44	60	855	finally
      //   75	93	855	finally
      //   93	106	855	finally
      //   109	114	855	finally
      //   119	167	855	finally
      //   175	215	855	finally
      //   215	290	855	finally
      //   290	334	855	finally
      //   337	439	855	finally
      //   457	480	855	finally
      //   510	536	855	finally
      //   542	562	855	finally
      //   562	603	855	finally
      //   603	609	855	finally
      //   613	654	855	finally
      //   654	661	855	finally
      //   680	704	855	finally
      //   704	742	855	finally
      //   753	793	855	finally
      //   793	852	855	finally
      //   871	900	855	finally
      //   903	932	855	finally
      //   935	979	855	finally
      //   982	1031	855	finally
      //   1031	1047	855	finally
      //   1050	1054	855	finally
      //   1057	1094	855	finally
      //   12	21	1097	java/lang/Exception
      //   44	60	1097	java/lang/Exception
      //   75	93	1106	java/lang/Exception
      //   93	106	1121	java/lang/Exception
    }

    final void vU(int paramInt)
    {
      do
        try
        {
          AppMethodBeat.i(136571);
          if ((this.mBi == paramInt) || (!isAlive()))
            AppMethodBeat.o(136571);
          while (true)
          {
            return;
            if ((paramInt >= 0) || (this.mBi < 0))
              break;
            Process.setThreadPriority(this.mTid, -8);
            this.mBi = paramInt;
            AppMethodBeat.o(136571);
          }
        }
        finally
        {
        }
      while ((paramInt < 0) || (this.mBi >= 0));
      if (this.mBm);
      for (int i = 10; ; i = 0)
      {
        Process.setThreadPriority(this.mTid, i);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.g
 * JD-Core Version:    0.6.2
 */