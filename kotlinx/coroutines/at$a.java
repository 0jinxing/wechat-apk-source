package kotlinx.coroutines;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/EventLoopBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopBase$DelayedTask;", "timeMillis", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "kotlinx-coroutines-core"})
final class at$a extends at.b
{
  private final i<y> BQn;

  public at$a(long paramLong)
  {
    AppMethodBeat.i(118575);
    this.BQn = ((i)localObject);
    paramLong = this.BQn;
    Object localObject = (ap)this;
    j.p(paramLong, "receiver$0");
    j.p(localObject, "handle");
    paramLong.h((b)new aq((ap)localObject));
    AppMethodBeat.o(118575);
  }

  public final void run()
  {
    AppMethodBeat.i(118574);
    this.BQn.a(this.BQo, y.AUy);
    AppMethodBeat.o(118574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.at.a
 * JD-Core Version:    0.6.2
 */