package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.o;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "_state$annotations", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate", "()Lkotlin/coroutines/Continuation;", "dispatchYield", "", "value", "dispatchYield$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "resumeCancellable", "resumeCancellableWithException", "exception", "", "resumeCancelled", "", "resumeUndispatched", "resumeUndispatchedWithException", "resumeWith", "result", "Lkotlin/Result;", "takeState", "toString", "", "kotlinx-coroutines-core"})
public final class al<T> extends an<T>
  implements c<T>
{
  public final Object BPZ;
  public Object BPs;
  public final w BQa;
  public final c<T> BQb;

  public al(w paramw, c<? super T> paramc)
  {
    super(0);
    AppMethodBeat.i(118516);
    this.BQa = paramw;
    this.BQb = paramc;
    this.BPs = am.eli();
    this.BPZ = o.d(dWv());
    AppMethodBeat.o(118516);
  }

  public final e dWv()
  {
    AppMethodBeat.i(118517);
    e locale = this.BQb.dWv();
    AppMethodBeat.o(118517);
    return locale;
  }

  // ERROR //
  public final void dn(Object paramObject)
  {
    // Byte code:
    //   0: ldc 113
    //   2: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 81	kotlinx/coroutines/al:BQb	La/c/c;
    //   9: invokeinterface 109 1 0
    //   14: astore_2
    //   15: aload_1
    //   16: invokestatic 119	kotlinx/coroutines/r:ed	(Ljava/lang/Object;)Ljava/lang/Object;
    //   19: astore_3
    //   20: aload_0
    //   21: getfield 79	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   24: aload_2
    //   25: invokevirtual 125	kotlinx/coroutines/w:b	(La/c/e;)Z
    //   28: ifeq +31 -> 59
    //   31: aload_0
    //   32: aload_3
    //   33: putfield 89	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 129	kotlinx/coroutines/al:BQd	I
    //   41: aload_0
    //   42: getfield 79	kotlinx/coroutines/al:BQa	Lkotlinx/coroutines/w;
    //   45: aload_2
    //   46: aload_0
    //   47: checkcast 131	java/lang/Runnable
    //   50: invokevirtual 135	kotlinx/coroutines/w:a	(La/c/e;Ljava/lang/Runnable;)V
    //   53: ldc 113
    //   55: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: return
    //   59: getstatic 141	kotlinx/coroutines/bu:BQT	Lkotlinx/coroutines/bu;
    //   62: astore_2
    //   63: getstatic 145	kotlinx/coroutines/bu:BQS	Lkotlinx/coroutines/a/p;
    //   66: invokevirtual 151	kotlinx/coroutines/a/p:get	()Ljava/lang/Object;
    //   69: checkcast 153	kotlinx/coroutines/bu$a
    //   72: astore_2
    //   73: aload_2
    //   74: getfield 157	kotlinx/coroutines/bu$a:csi	Z
    //   77: ifeq +29 -> 106
    //   80: aload_0
    //   81: aload_3
    //   82: putfield 89	kotlinx/coroutines/al:BPs	Ljava/lang/Object;
    //   85: aload_0
    //   86: iconst_0
    //   87: putfield 129	kotlinx/coroutines/al:BQd	I
    //   90: aload_2
    //   91: getfield 161	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   94: aload_0
    //   95: invokevirtual 166	kotlinx/coroutines/a/b:addLast	(Ljava/lang/Object;)V
    //   98: ldc 113
    //   100: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -45 -> 58
    //   106: aload_2
    //   107: ldc 168
    //   109: invokestatic 170	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   112: aload_2
    //   113: iconst_1
    //   114: putfield 157	kotlinx/coroutines/bu$a:csi	Z
    //   117: aload_0
    //   118: invokevirtual 93	kotlinx/coroutines/al:dWv	()La/c/e;
    //   121: astore_3
    //   122: aload_3
    //   123: aload_0
    //   124: getfield 101	kotlinx/coroutines/al:BPZ	Ljava/lang/Object;
    //   127: invokestatic 173	kotlinx/coroutines/a/o:b	(La/c/e;Ljava/lang/Object;)Ljava/lang/Object;
    //   130: astore 4
    //   132: aload_0
    //   133: getfield 81	kotlinx/coroutines/al:BQb	La/c/c;
    //   136: aload_1
    //   137: invokeinterface 175 2 0
    //   142: getstatic 181	a/y:AUy	La/y;
    //   145: astore_1
    //   146: aload_3
    //   147: aload 4
    //   149: invokestatic 184	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   152: aload_2
    //   153: getfield 161	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   156: invokevirtual 187	kotlinx/coroutines/a/b:elE	()Ljava/lang/Object;
    //   159: checkcast 131	java/lang/Runnable
    //   162: astore_1
    //   163: aload_1
    //   164: ifnonnull +74 -> 238
    //   167: aload_2
    //   168: iconst_0
    //   169: putfield 157	kotlinx/coroutines/bu$a:csi	Z
    //   172: ldc 113
    //   174: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: goto -119 -> 58
    //   180: astore_1
    //   181: aload_3
    //   182: aload 4
    //   184: invokestatic 184	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   187: ldc 113
    //   189: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aload_1
    //   193: athrow
    //   194: astore_3
    //   195: aload_2
    //   196: getfield 161	kotlinx/coroutines/bu$a:BQU	Lkotlinx/coroutines/a/b;
    //   199: invokevirtual 190	kotlinx/coroutines/a/b:clear	()V
    //   202: new 192	kotlinx/coroutines/ak
    //   205: astore_1
    //   206: aload_1
    //   207: ldc 194
    //   209: aload_3
    //   210: invokespecial 197	kotlinx/coroutines/ak:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: aload_1
    //   214: checkcast 112	java/lang/Throwable
    //   217: astore_1
    //   218: ldc 113
    //   220: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: aload_1
    //   224: athrow
    //   225: astore_1
    //   226: aload_2
    //   227: iconst_0
    //   228: putfield 157	kotlinx/coroutines/bu$a:csi	Z
    //   231: ldc 113
    //   233: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload_1
    //   237: athrow
    //   238: aload_1
    //   239: invokeinterface 200 1 0
    //   244: goto -92 -> 152
    //
    // Exception table:
    //   from	to	target	type
    //   132	146	180	finally
    //   112	132	194	java/lang/Throwable
    //   146	152	194	java/lang/Throwable
    //   152	163	194	java/lang/Throwable
    //   181	194	194	java/lang/Throwable
    //   238	244	194	java/lang/Throwable
    //   112	132	225	finally
    //   146	152	225	finally
    //   152	163	225	finally
    //   181	194	225	finally
    //   195	225	225	finally
    //   238	244	225	finally
  }

  public final Object ekO()
  {
    AppMethodBeat.i(118513);
    Object localObject = this.BPs;
    if (localObject != am.eli());
    for (int i = 1; i == 0; i = 0)
    {
      localObject = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118513);
      throw ((Throwable)localObject);
    }
    this.BPs = am.eli();
    AppMethodBeat.o(118513);
    return localObject;
  }

  public final c<T> ekR()
  {
    return (c)this;
  }

  public final String toString()
  {
    AppMethodBeat.i(118515);
    String str = "DispatchedContinuation[" + this.BQa + ", " + af.d(this.BQb) + ']';
    AppMethodBeat.o(118515);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.al
 * JD-Core Version:    0.6.2
 */