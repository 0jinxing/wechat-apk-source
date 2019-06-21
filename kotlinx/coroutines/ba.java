package kotlinx.coroutines;

import a.f.a.b;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/InvokeOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/Job;", "job", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V", "_invoked", "Lkotlinx/atomicfu/AtomicInt;", "invoke", "toString", "", "kotlinx-coroutines-core"})
final class ba extends be<bc>
{
  private static final AtomicIntegerFieldUpdater BQw;
  private final b<Throwable, y> BQu;
  private volatile int BQv;

  static
  {
    AppMethodBeat.i(118533);
    BQw = AtomicIntegerFieldUpdater.newUpdater(ba.class, "BQv");
    AppMethodBeat.o(118533);
  }

  public ba(bc parambc, b<? super Throwable, y> paramb)
  {
    super(parambc);
    AppMethodBeat.i(118532);
    this.BQu = paramb;
    this.BQv = 0;
    AppMethodBeat.o(118532);
  }

  public final String toString()
  {
    AppMethodBeat.i(118531);
    String str = "InvokeOnCancelling[" + af.ef(this) + '@' + af.ee(this) + ']';
    AppMethodBeat.o(118531);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118529);
    if (BQw.compareAndSet(this, 0, 1))
      this.BQu.am(paramThrowable);
    AppMethodBeat.o(118529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ba
 * JD-Core Version:    0.6.2
 */