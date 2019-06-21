package a.c.a;

import a.c.b.a.f;
import a.c.c;
import a.f.a.m;
import a.f.b.z;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public final class c$a extends f
{
  private int label;

  public c$a(c paramc1, c paramc2, m paramm, Object paramObject)
  {
    super(paramc2);
  }

  public final Object bO(Object paramObject)
  {
    AppMethodBeat.i(56391);
    switch (this.label)
    {
    default:
      paramObject = (Throwable)new IllegalStateException("This coroutine had already completed".toString());
      AppMethodBeat.o(56391);
      throw paramObject;
    case 0:
      this.label = 1;
      c localc = (c)this;
      paramObject = this.AVm;
      if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        AppMethodBeat.o(56391);
        throw paramObject;
      }
      paramObject = ((m)z.dt(paramObject)).m(this.AVn, localc);
      AppMethodBeat.o(56391);
    case 1:
    }
    while (true)
    {
      return paramObject;
      this.label = 2;
      AppMethodBeat.o(56391);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.c.a.c.a
 * JD-Core Version:    0.6.2
 */