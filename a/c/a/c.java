package a.c.a;

import a.c.b.a.a;
import a.c.e;
import a.c.f;
import a.f.a.m;
import a.f.b.j;
import a.f.b.z;
import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, dWr=1)
public class c
{
  public static final <R, T> a.c.c<y> a(final m<? super R, ? super a.c.c<? super T>, ? extends Object> paramm, final R paramR, a.c.c<? super T> paramc)
  {
    AppMethodBeat.i(56389);
    j.p(paramm, "receiver$0");
    j.p(paramc, "completion");
    j.p(paramc, "completion");
    if ((paramm instanceof a))
    {
      paramm = ((a)paramm).a(paramR, paramc);
      AppMethodBeat.o(56389);
    }
    while (true)
    {
      return paramm;
      final e locale = paramc.dWv();
      if (locale == f.AVg)
      {
        if (paramc == null)
        {
          paramm = new v("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
          AppMethodBeat.o(56389);
          throw paramm;
        }
        paramm = (a.c.c)new c.a(paramc, paramc, paramm, paramR);
        AppMethodBeat.o(56389);
      }
      else
      {
        if (paramc == null)
        {
          paramm = new v("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
          AppMethodBeat.o(56389);
          throw paramm;
        }
        paramm = (a.c.c)new b(paramc, locale, paramc, locale, paramm, paramR);
        AppMethodBeat.o(56389);
      }
    }
  }

  public static final <T> a.c.c<T> c(a.c.c<? super T> paramc)
  {
    AppMethodBeat.i(56390);
    j.p(paramc, "receiver$0");
    if (!(paramc instanceof a.c.b.a.c));
    for (Object localObject = null; ; localObject = paramc)
    {
      a.c.b.a.c localc = (a.c.b.a.c)localObject;
      localObject = paramc;
      if (localc != null)
      {
        localObject = localc.dWx();
        if (localObject != null)
          break label49;
        localObject = paramc;
      }
      label49: 
      while (true)
      {
        AppMethodBeat.o(56390);
        return localObject;
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class b extends a.c.b.a.c
  {
    private int label;

    public b(a.c.c paramc1, e parame1, a.c.c paramc2, e parame2, m paramm, Object paramObject)
    {
      super(parame2);
    }

    public final Object bO(Object paramObject)
    {
      AppMethodBeat.i(56388);
      switch (this.label)
      {
      default:
        paramObject = (Throwable)new IllegalStateException("This coroutine had already completed".toString());
        AppMethodBeat.o(56388);
        throw paramObject;
      case 0:
        this.label = 1;
        a.c.c localc = (a.c.c)this;
        paramObject = paramm;
        if (paramObject == null)
        {
          paramObject = new v("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
          AppMethodBeat.o(56388);
          throw paramObject;
        }
        paramObject = ((m)z.dt(paramObject)).m(paramR, localc);
        AppMethodBeat.o(56388);
      case 1:
      }
      while (true)
      {
        return paramObject;
        this.label = 2;
        AppMethodBeat.o(56388);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.c.a.c
 * JD-Core Version:    0.6.2
 */