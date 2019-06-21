package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CompletedIdempotentResult;", "", "idempotentResume", "result", "token", "Lkotlinx/coroutines/NotCompleted;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/NotCompleted;)V", "toString", "", "kotlinx-coroutines-core"})
final class s
{
  public final Object result;

  public final String toString()
  {
    AppMethodBeat.i(118507);
    String str = "CompletedIdempotentResult[" + this.result + ']';
    AppMethodBeat.o(118507);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.s
 * JD-Core Version:    0.6.2
 */