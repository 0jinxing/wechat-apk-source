package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.f.b.j;
import a.l;
import a.p;
import a.p.a;
import a.q;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED$annotations", "()V", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "useMode", "resumeCancellable", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeCancellableWithException", "exception", "", "resumeDirect", "resumeDirectWithException", "yieldUndispatched", "", "Lkotlinx/coroutines/DispatchedContinuation;", "kotlinx-coroutines-core"})
public final class am
{
  private static final m BQc;

  static
  {
    AppMethodBeat.i(118583);
    BQc = new m("UNDEFINED");
    AppMethodBeat.o(118583);
  }

  // ERROR //
  public static final <T> void a(c<? super T> paramc, T paramT)
  {
    // Byte code:
    //   0: ldc 62
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 64
    //   8: invokestatic 70	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aload_0
    //   12: instanceof 72
    //   15: ifeq +326 -> 341
    //   18: aload_0
    //   19: checkcast 72	kotlinx/coroutines/al
    //   22: astore_2
    //   23: aload_2
    //   24: getfield 76	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   27: aload_2
    //   28: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   31: invokevirtual 86	kotlinx/coroutines/w:b	(La/c/e;)Z
    //   34: ifeq +34 -> 68
    //   37: aload_2
    //   38: aload_1
    //   39: putfield 90	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   42: aload_2
    //   43: iconst_1
    //   44: putfield 94	kotlinx/coroutines/al:BQd	I
    //   47: aload_2
    //   48: getfield 76	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   51: aload_2
    //   52: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   55: aload_2
    //   56: checkcast 96	java/lang/Runnable
    //   59: invokevirtual 99	kotlinx/coroutines/w:a	(La/c/e;Ljava/lang/Runnable;)V
    //   62: ldc 62
    //   64: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: return
    //   68: getstatic 105	kotlinx/coroutines/bu:BQT	Lkotlinx/coroutines/bu;
    //   71: astore_0
    //   72: getstatic 109	kotlinx/coroutines/bu:BQS	Lkotlinx/coroutines/a/p;
    //   75: invokevirtual 115	kotlinx/coroutines/a/p:get	()Ljava/lang/Object;
    //   78: checkcast 117	kotlinx/coroutines/bu$a
    //   81: astore_0
    //   82: aload_0
    //   83: getfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   86: ifeq +29 -> 115
    //   89: aload_2
    //   90: aload_1
    //   91: putfield 90	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   94: aload_2
    //   95: iconst_1
    //   96: putfield 94	kotlinx/coroutines/al:BQd	I
    //   99: aload_0
    //   100: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   103: aload_2
    //   104: invokevirtual 131	kotlinx/coroutines/a/b:addLast	(Ljava/lang/Object;)V
    //   107: ldc 62
    //   109: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: goto -45 -> 67
    //   115: aload_0
    //   116: ldc 133
    //   118: invokestatic 135	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   121: aload_0
    //   122: iconst_1
    //   123: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   126: aload_2
    //   127: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   130: getstatic 141	kotlinx/coroutines/bc:BQx	Lkotlinx/coroutines/bc$b;
    //   133: checkcast 143	a/c/e$c
    //   136: invokeinterface 148 2 0
    //   141: checkcast 137	kotlinx/coroutines/bc
    //   144: astore_3
    //   145: aload_3
    //   146: ifnull +122 -> 268
    //   149: aload_3
    //   150: invokeinterface 152 1 0
    //   155: ifne +113 -> 268
    //   158: aload_3
    //   159: invokeinterface 156 1 0
    //   164: checkcast 61	java/lang/Throwable
    //   167: astore_3
    //   168: getstatic 162	a/p:AUp	La/p$a;
    //   171: astore 4
    //   173: aload_2
    //   174: aload_3
    //   175: invokestatic 168	a/q:n	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   178: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   181: invokeinterface 177 2 0
    //   186: iconst_1
    //   187: istore 5
    //   189: iload 5
    //   191: ifne +49 -> 240
    //   194: aload_2
    //   195: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   198: astore_3
    //   199: aload_3
    //   200: aload_2
    //   201: getfield 180	kotlinx/coroutines/al:BPZ	Ljava/lang/Object;
    //   204: invokestatic 185	kotlinx/coroutines/a/o:b	(La/c/e;Ljava/lang/Object;)Ljava/lang/Object;
    //   207: astore 4
    //   209: aload_2
    //   210: getfield 189	kotlinx/coroutines/al:BQb	La/c/c;
    //   213: astore 6
    //   215: getstatic 162	a/p:AUp	La/p$a;
    //   218: astore_2
    //   219: aload 6
    //   221: aload_1
    //   222: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   225: invokeinterface 177 2 0
    //   230: getstatic 195	a/y:AUy	La/y;
    //   233: astore_1
    //   234: aload_3
    //   235: aload 4
    //   237: invokestatic 198	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   240: aload_0
    //   241: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   244: invokevirtual 201	kotlinx/coroutines/a/b:elE	()Ljava/lang/Object;
    //   247: checkcast 96	java/lang/Runnable
    //   250: astore_1
    //   251: aload_1
    //   252: ifnonnull +80 -> 332
    //   255: aload_0
    //   256: iconst_0
    //   257: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   260: ldc 62
    //   262: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: goto -198 -> 67
    //   268: iconst_0
    //   269: istore 5
    //   271: goto -82 -> 189
    //   274: astore_1
    //   275: aload_3
    //   276: aload 4
    //   278: invokestatic 198	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   281: ldc 62
    //   283: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: aload_1
    //   287: athrow
    //   288: astore_2
    //   289: aload_0
    //   290: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   293: invokevirtual 204	kotlinx/coroutines/a/b:clear	()V
    //   296: new 206	kotlinx/coroutines/ak
    //   299: astore_1
    //   300: aload_1
    //   301: ldc 208
    //   303: aload_2
    //   304: invokespecial 211	kotlinx/coroutines/ak:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   307: aload_1
    //   308: checkcast 61	java/lang/Throwable
    //   311: astore_1
    //   312: ldc 62
    //   314: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: aload_1
    //   318: athrow
    //   319: astore_1
    //   320: aload_0
    //   321: iconst_0
    //   322: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   325: ldc 62
    //   327: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: aload_1
    //   331: athrow
    //   332: aload_1
    //   333: invokeinterface 214 1 0
    //   338: goto -98 -> 240
    //   341: getstatic 162	a/p:AUp	La/p$a;
    //   344: astore_2
    //   345: aload_0
    //   346: aload_1
    //   347: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   350: invokeinterface 177 2 0
    //   355: ldc 62
    //   357: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: goto -293 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   209	234	274	finally
    //   121	145	288	java/lang/Throwable
    //   149	186	288	java/lang/Throwable
    //   194	209	288	java/lang/Throwable
    //   234	240	288	java/lang/Throwable
    //   240	251	288	java/lang/Throwable
    //   275	288	288	java/lang/Throwable
    //   332	338	288	java/lang/Throwable
    //   121	145	319	finally
    //   149	186	319	finally
    //   194	209	319	finally
    //   234	240	319	finally
    //   240	251	319	finally
    //   275	288	319	finally
    //   289	319	319	finally
    //   332	338	319	finally
  }

  // ERROR //
  public static final <T> void a(c<? super T> paramc, Throwable paramThrowable)
  {
    // Byte code:
    //   0: ldc 218
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 64
    //   8: invokestatic 70	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aload_1
    //   12: ldc 219
    //   14: invokestatic 70	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_0
    //   18: instanceof 72
    //   21: ifeq +350 -> 371
    //   24: aload_0
    //   25: checkcast 72	kotlinx/coroutines/al
    //   28: astore_2
    //   29: aload_2
    //   30: getfield 189	kotlinx/coroutines/al:BQb	La/c/c;
    //   33: invokeinterface 220 1 0
    //   38: astore_0
    //   39: new 222	kotlinx/coroutines/q
    //   42: dup
    //   43: aload_1
    //   44: invokespecial 225	kotlinx/coroutines/q:<init>	(Ljava/lang/Throwable;)V
    //   47: astore_3
    //   48: aload_2
    //   49: getfield 76	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   52: aload_0
    //   53: invokevirtual 86	kotlinx/coroutines/w:b	(La/c/e;)Z
    //   56: ifeq +38 -> 94
    //   59: aload_2
    //   60: new 222	kotlinx/coroutines/q
    //   63: dup
    //   64: aload_1
    //   65: invokespecial 225	kotlinx/coroutines/q:<init>	(Ljava/lang/Throwable;)V
    //   68: putfield 90	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   71: aload_2
    //   72: iconst_1
    //   73: putfield 94	kotlinx/coroutines/al:BQd	I
    //   76: aload_2
    //   77: getfield 76	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   80: aload_0
    //   81: aload_2
    //   82: checkcast 96	java/lang/Runnable
    //   85: invokevirtual 99	kotlinx/coroutines/w:a	(La/c/e;Ljava/lang/Runnable;)V
    //   88: ldc 218
    //   90: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: return
    //   94: getstatic 105	kotlinx/coroutines/bu:BQT	Lkotlinx/coroutines/bu;
    //   97: astore_0
    //   98: getstatic 109	kotlinx/coroutines/bu:BQS	Lkotlinx/coroutines/a/p;
    //   101: invokevirtual 115	kotlinx/coroutines/a/p:get	()Ljava/lang/Object;
    //   104: checkcast 117	kotlinx/coroutines/bu$a
    //   107: astore_0
    //   108: aload_0
    //   109: getfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   112: ifeq +29 -> 141
    //   115: aload_2
    //   116: aload_3
    //   117: putfield 90	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   120: aload_2
    //   121: iconst_1
    //   122: putfield 94	kotlinx/coroutines/al:BQd	I
    //   125: aload_0
    //   126: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   129: aload_2
    //   130: invokevirtual 131	kotlinx/coroutines/a/b:addLast	(Ljava/lang/Object;)V
    //   133: ldc 218
    //   135: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: goto -45 -> 93
    //   141: aload_0
    //   142: ldc 133
    //   144: invokestatic 135	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   147: aload_0
    //   148: iconst_1
    //   149: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   152: aload_2
    //   153: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   156: getstatic 141	kotlinx/coroutines/bc:BQx	Lkotlinx/coroutines/bc$b;
    //   159: checkcast 143	a/c/e$c
    //   162: invokeinterface 148 2 0
    //   167: checkcast 137	kotlinx/coroutines/bc
    //   170: astore_3
    //   171: aload_3
    //   172: ifnull +126 -> 298
    //   175: aload_3
    //   176: invokeinterface 152 1 0
    //   181: ifne +117 -> 298
    //   184: aload_3
    //   185: invokeinterface 156 1 0
    //   190: checkcast 61	java/lang/Throwable
    //   193: astore_3
    //   194: getstatic 162	a/p:AUp	La/p$a;
    //   197: astore 4
    //   199: aload_2
    //   200: aload_3
    //   201: invokestatic 168	a/q:n	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   204: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   207: invokeinterface 177 2 0
    //   212: iconst_1
    //   213: istore 5
    //   215: iload 5
    //   217: ifne +53 -> 270
    //   220: aload_2
    //   221: invokevirtual 80	kotlinx/coroutines/al:dWv	()La/c/e;
    //   224: astore 4
    //   226: aload 4
    //   228: aload_2
    //   229: getfield 180	kotlinx/coroutines/al:BPZ	Ljava/lang/Object;
    //   232: invokestatic 185	kotlinx/coroutines/a/o:b	(La/c/e;Ljava/lang/Object;)Ljava/lang/Object;
    //   235: astore_3
    //   236: aload_2
    //   237: getfield 189	kotlinx/coroutines/al:BQb	La/c/c;
    //   240: astore 6
    //   242: getstatic 162	a/p:AUp	La/p$a;
    //   245: astore_2
    //   246: aload 6
    //   248: aload_1
    //   249: invokestatic 168	a/q:n	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   252: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   255: invokeinterface 177 2 0
    //   260: getstatic 195	a/y:AUy	La/y;
    //   263: astore_1
    //   264: aload 4
    //   266: aload_3
    //   267: invokestatic 198	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   270: aload_0
    //   271: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   274: invokevirtual 201	kotlinx/coroutines/a/b:elE	()Ljava/lang/Object;
    //   277: checkcast 96	java/lang/Runnable
    //   280: astore_1
    //   281: aload_1
    //   282: ifnonnull +80 -> 362
    //   285: aload_0
    //   286: iconst_0
    //   287: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   290: ldc 218
    //   292: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: goto -202 -> 93
    //   298: iconst_0
    //   299: istore 5
    //   301: goto -86 -> 215
    //   304: astore_1
    //   305: aload 4
    //   307: aload_3
    //   308: invokestatic 198	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   311: ldc 218
    //   313: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   316: aload_1
    //   317: athrow
    //   318: astore_1
    //   319: aload_0
    //   320: getfield 125	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   323: invokevirtual 204	kotlinx/coroutines/a/b:clear	()V
    //   326: new 206	kotlinx/coroutines/ak
    //   329: astore_2
    //   330: aload_2
    //   331: ldc 208
    //   333: aload_1
    //   334: invokespecial 211	kotlinx/coroutines/ak:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   337: aload_2
    //   338: checkcast 61	java/lang/Throwable
    //   341: astore_1
    //   342: ldc 218
    //   344: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: aload_1
    //   348: athrow
    //   349: astore_1
    //   350: aload_0
    //   351: iconst_0
    //   352: putfield 121	kotlinx/coroutines/bu$a:csi	Z
    //   355: ldc 218
    //   357: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: aload_1
    //   361: athrow
    //   362: aload_1
    //   363: invokeinterface 214 1 0
    //   368: goto -98 -> 270
    //   371: getstatic 162	a/p:AUp	La/p$a;
    //   374: astore_2
    //   375: aload_0
    //   376: aload_1
    //   377: invokestatic 168	a/q:n	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   380: invokestatic 172	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   383: invokeinterface 177 2 0
    //   388: ldc 218
    //   390: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: goto -300 -> 93
    //
    // Exception table:
    //   from	to	target	type
    //   236	264	304	finally
    //   147	171	318	java/lang/Throwable
    //   175	212	318	java/lang/Throwable
    //   220	236	318	java/lang/Throwable
    //   264	270	318	java/lang/Throwable
    //   270	281	318	java/lang/Throwable
    //   305	318	318	java/lang/Throwable
    //   362	368	318	java/lang/Throwable
    //   147	171	349	finally
    //   175	212	349	finally
    //   220	236	349	finally
    //   264	270	349	finally
    //   270	281	349	finally
    //   305	318	349	finally
    //   319	349	349	finally
    //   362	368	349	finally
  }

  public static final <T> void a(an<? super T> paraman, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(118581);
    j.p(paraman, "receiver$0");
    Object localObject1 = paraman.ekR();
    int j = i;
    Object localObject2;
    if (paramInt != 0)
    {
      if (paramInt == 1)
        j = i;
    }
    else
    {
      if ((j == 0) || (!(localObject1 instanceof al)) || (bo.UY(paramInt) != bo.UY(paraman.BQd)))
        break label124;
      localObject2 = ((al)localObject1).BQa;
      localObject1 = ((c)localObject1).dWv();
      if (!((w)localObject2).b((e)localObject1))
        break label106;
      ((w)localObject2).a((e)localObject1, (Runnable)paraman);
      AppMethodBeat.o(118581);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label106: localObject2 = bu.BQT;
      bu.a(paraman);
      AppMethodBeat.o(118581);
      continue;
      label124: a(paraman, (c)localObject1, paramInt);
      AppMethodBeat.o(118581);
    }
  }

  public static final <T> void a(an<? super T> paraman, c<? super T> paramc, int paramInt)
  {
    AppMethodBeat.i(118582);
    j.p(paraman, "receiver$0");
    j.p(paramc, "delegate");
    Object localObject = paraman.ekO();
    Throwable localThrowable = an.eg(localObject);
    if (localThrowable != null)
    {
      bo.a(paramc, localThrowable, paramInt);
      AppMethodBeat.o(118582);
    }
    while (true)
    {
      return;
      bo.a(paramc, paraman.ec(localObject), paramInt);
      AppMethodBeat.o(118582);
    }
  }

  public static final <T> void b(c<? super T> paramc, T paramT)
  {
    AppMethodBeat.i(118579);
    j.p(paramc, "receiver$0");
    p.a locala;
    if ((paramc instanceof al))
    {
      paramc = ((al)paramc).BQb;
      locala = p.AUp;
      paramc.dn(p.dl(paramT));
      AppMethodBeat.o(118579);
    }
    while (true)
    {
      return;
      locala = p.AUp;
      paramc.dn(p.dl(paramT));
      AppMethodBeat.o(118579);
    }
  }

  public static final <T> void b(c<? super T> paramc, Throwable paramThrowable)
  {
    AppMethodBeat.i(118580);
    j.p(paramc, "receiver$0");
    j.p(paramThrowable, "exception");
    Object localObject;
    if ((paramc instanceof al))
    {
      localObject = ((al)paramc).BQb;
      paramc = p.AUp;
      ((c)localObject).dn(p.dl(q.n(paramThrowable)));
      AppMethodBeat.o(118580);
    }
    while (true)
    {
      return;
      localObject = p.AUp;
      paramc.dn(p.dl(q.n(paramThrowable)));
      AppMethodBeat.o(118580);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.am
 * JD-Core Version:    0.6.2
 */