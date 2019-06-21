package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/AbstractContinuation;", "Lkotlinx/coroutines/CancellableContinuation;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "completeResume", "", "token", "", "getSuccessfulResult", "state", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "nameString", "", "tryResume", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryResumeWithException", "exception", "", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"})
public final class j<T> extends a<T>
  implements Runnable, i<T>
{
  private final e BPx;

  public j(c<? super T> paramc)
  {
    super(paramc);
    AppMethodBeat.i(118526);
    this.BPx = paramc.dWv();
    AppMethodBeat.o(118526);
  }

  public final void a(w paramw, T paramT)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118524);
    a.f.b.j.p(paramw, "receiver$0");
    Object localObject2 = this.BPv;
    Object localObject3 = localObject2;
    if (!(localObject2 instanceof al))
      localObject3 = null;
    localObject2 = (al)localObject3;
    localObject3 = localObject1;
    if (localObject2 != null)
      localObject3 = ((al)localObject2).BQa;
    if (localObject3 == paramw);
    for (int i = 3; ; i = this.BQd)
    {
      l(paramT, i);
      AppMethodBeat.o(118524);
      return;
    }
  }

  public final e dWv()
  {
    return this.BPx;
  }

  public final <T> T ec(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof s))
      localObject = ((s)paramObject).result;
    return localObject;
  }

  protected final String ekQ()
  {
    AppMethodBeat.i(118525);
    String str = "CancellableContinuation(" + af.d(this.BPv) + ')';
    AppMethodBeat.o(118525);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.j
 * JD-Core Version:    0.6.2
 */