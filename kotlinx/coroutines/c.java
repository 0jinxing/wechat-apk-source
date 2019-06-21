package kotlinx.coroutines;

import a.c.e;
import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "context", "context$annotations", "()V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "defaultResumeMode", "", "getDefaultResumeMode$kotlinx_coroutines_core", "()I", "isActive", "()Z", "handleOnCompletionException", "", "exception", "", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "initParentJob$kotlinx_coroutines_core", "nameString", "", "nameString$kotlinx_coroutines_core", "onCancellation", "cause", "onCompleted", "value", "(Ljava/lang/Object;)V", "onCompletedExceptionally", "onCompletionInternal", "state", "", "mode", "suppressed", "onCompletionInternal$kotlinx_coroutines_core", "onStart", "onStartInternal", "onStartInternal$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "start", "R", "Lkotlinx/coroutines/CoroutineStart;", "receiver", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "(Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"})
public abstract class c<T> extends bg
  implements a.c.c<T>, ac, bc
{
  private final e BPx;
  protected final e BPy;

  public c(e parame, boolean paramBoolean)
  {
    super(paramBoolean);
    this.BPy = parame;
    this.BPx = this.BPy.plus((e)this);
  }

  // ERROR //
  public final <R> void a(ad paramad, R paramR, a.f.a.m<? super R, ? super a.c.c<? super T>, ? extends Object> paramm)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 107
    //   3: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_3
    //   7: ldc 108
    //   9: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 93	kotlinx/coroutines/c:BPy	La/c/e;
    //   16: getstatic 112	kotlinx/coroutines/bc:BQx	Lkotlinx/coroutines/bc$b;
    //   19: checkcast 114	a/c/e$c
    //   22: invokeinterface 118 2 0
    //   27: checkcast 11	kotlinx/coroutines/bc
    //   30: astore 4
    //   32: aload_0
    //   33: getfield 122	kotlinx/coroutines/bg:BQA	Lkotlinx/coroutines/m;
    //   36: ifnonnull +27 -> 63
    //   39: iconst_1
    //   40: istore 5
    //   42: iload 5
    //   44: ifne +25 -> 69
    //   47: new 124	java/lang/IllegalStateException
    //   50: dup
    //   51: ldc 126
    //   53: invokevirtual 132	java/lang/Object:toString	()Ljava/lang/String;
    //   56: invokespecial 135	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   59: checkcast 106	java/lang/Throwable
    //   62: athrow
    //   63: iconst_0
    //   64: istore 5
    //   66: goto -24 -> 42
    //   69: aload 4
    //   71: ifnonnull +77 -> 148
    //   74: aload_0
    //   75: getstatic 141	kotlinx/coroutines/bl:BQP	Lkotlinx/coroutines/bl;
    //   78: checkcast 143	kotlinx/coroutines/m
    //   81: putfield 122	kotlinx/coroutines/bg:BQA	Lkotlinx/coroutines/m;
    //   84: aload_0
    //   85: checkcast 7	a/c/c
    //   88: astore 4
    //   90: aload_3
    //   91: ldc 108
    //   93: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   96: aload 4
    //   98: ldc 145
    //   100: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   103: getstatic 151	kotlinx/coroutines/ae:pCY	[I
    //   106: aload_1
    //   107: invokevirtual 156	kotlinx/coroutines/ad:ordinal	()I
    //   110: iaload
    //   111: tableswitch	default:+29 -> 140, 1:+108->219, 2:+116->227, 3:+161->272, 4:+115->226
    //   141: nop
    //   142: ifle +22967 -> 23109
    //   145: nop
    //   146: if_icmpne -16615 -> -16469
    //   149: iconst_1
    //   150: invokeinterface 162 1 0
    //   155: pop
    //   156: aload 4
    //   158: aload_0
    //   159: checkcast 164	kotlinx/coroutines/o
    //   162: invokeinterface 167 2 0
    //   167: astore 4
    //   169: aload_0
    //   170: aload 4
    //   172: putfield 122	kotlinx/coroutines/bg:BQA	Lkotlinx/coroutines/m;
    //   175: aload_0
    //   176: invokevirtual 171	kotlinx/coroutines/bg:elt	()Ljava/lang/Object;
    //   179: instanceof 173
    //   182: ifne +31 -> 213
    //   185: iconst_1
    //   186: istore 5
    //   188: iload 5
    //   190: ifeq -106 -> 84
    //   193: aload 4
    //   195: invokeinterface 176 1 0
    //   200: aload_0
    //   201: getstatic 141	kotlinx/coroutines/bl:BQP	Lkotlinx/coroutines/bl;
    //   204: checkcast 143	kotlinx/coroutines/m
    //   207: putfield 122	kotlinx/coroutines/bg:BQA	Lkotlinx/coroutines/m;
    //   210: goto -126 -> 84
    //   213: iconst_0
    //   214: istore 5
    //   216: goto -28 -> 188
    //   219: aload_3
    //   220: aload_2
    //   221: aload 4
    //   223: invokestatic 182	kotlinx/coroutines/b/a:b	(La/f/a/m;Ljava/lang/Object;La/c/c;)V
    //   226: return
    //   227: aload_3
    //   228: ldc 184
    //   230: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   233: aload 4
    //   235: ldc 145
    //   237: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   240: aload_3
    //   241: aload_2
    //   242: aload 4
    //   244: invokestatic 189	a/c/a/b:a	(La/f/a/m;Ljava/lang/Object;La/c/c;)La/c/c;
    //   247: invokestatic 193	a/c/a/b:c	(La/c/c;)La/c/c;
    //   250: astore_1
    //   251: getstatic 199	a/y:AUy	La/y;
    //   254: astore_2
    //   255: getstatic 205	a/p:AUp	La/p$a;
    //   258: astore_3
    //   259: aload_1
    //   260: aload_2
    //   261: invokestatic 209	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   264: invokeinterface 212 2 0
    //   269: goto -43 -> 226
    //   272: aload_3
    //   273: ldc 184
    //   275: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   278: aload 4
    //   280: ldc 145
    //   282: invokestatic 88	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   285: aload 4
    //   287: invokeinterface 216 1 0
    //   292: astore_1
    //   293: aload_1
    //   294: aconst_null
    //   295: invokestatic 221	kotlinx/coroutines/a/o:b	(La/c/e;Ljava/lang/Object;)Ljava/lang/Object;
    //   298: astore 6
    //   300: aload_3
    //   301: invokestatic 226	a/f/b/z:dt	(Ljava/lang/Object;)Ljava/lang/Object;
    //   304: checkcast 228	a/f/a/m
    //   307: aload_2
    //   308: aload 4
    //   310: invokeinterface 232 3 0
    //   315: astore_2
    //   316: aload_1
    //   317: aload 6
    //   319: invokestatic 235	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   322: aload_2
    //   323: getstatic 241	a/c/a/a:AVh	La/c/a/a;
    //   326: if_acmpeq -100 -> 226
    //   329: getstatic 205	a/p:AUp	La/p$a;
    //   332: astore_1
    //   333: aload 4
    //   335: aload_2
    //   336: invokestatic 209	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   339: invokeinterface 212 2 0
    //   344: goto -118 -> 226
    //   347: astore_2
    //   348: aload_1
    //   349: aload 6
    //   351: invokestatic 235	kotlinx/coroutines/a/o:a	(La/c/e;Ljava/lang/Object;)V
    //   354: aload_2
    //   355: athrow
    //   356: astore_1
    //   357: getstatic 205	a/p:AUp	La/p$a;
    //   360: astore_2
    //   361: aload 4
    //   363: aload_1
    //   364: invokestatic 247	a/q:n	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   367: invokestatic 209	a/p:dl	(Ljava/lang/Object;)Ljava/lang/Object;
    //   370: invokeinterface 212 2 0
    //   375: goto -149 -> 226
    //
    // Exception table:
    //   from	to	target	type
    //   300	316	347	finally
    //   285	300	356	java/lang/Throwable
    //   316	322	356	java/lang/Throwable
    //   348	356	356	java/lang/Throwable
  }

  public final e dWv()
  {
    return this.BPx;
  }

  public final void dn(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = r.ed(paramObject);
    switch (super.L(elt(), localObject2))
    {
    case 3:
    default:
      throw ((Throwable)new IllegalStateException("unexpected result".toString()));
    case 0:
      String str = "Job " + this + " is already complete or completing, but is being completed with " + localObject2;
      paramObject = localObject2;
      if (!(localObject2 instanceof q))
        paramObject = null;
      localObject2 = (q)paramObject;
      paramObject = localObject1;
      if (localObject2 != null)
        paramObject = ((q)localObject2).cause;
      throw ((Throwable)new IllegalStateException(str, paramObject));
    case 1:
    case 2:
    }
  }

  public final void eb(Object paramObject)
  {
    if ((paramObject instanceof q))
      j.p(((q)paramObject).cause, "exception");
  }

  public final e ekT()
  {
    return this.BPx;
  }

  public final void ekU()
  {
    onStart();
  }

  public final String ekV()
  {
    String str = v.a(this.BPx);
    if (str == null);
    for (str = super.ekV(); ; str = "\"" + str + "\":" + super.ekV())
      return str;
  }

  public final boolean isActive()
  {
    return super.isActive();
  }

  protected void onStart()
  {
  }

  public final void u(Throwable paramThrowable)
  {
    j.p(paramThrowable, "exception");
    z.a(this.BPy, paramThrowable, (bc)this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c
 * JD-Core Version:    0.6.2
 */