package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CompletionHandlerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"})
public final class u extends RuntimeException
{
  public u(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    AppMethodBeat.i(118576);
    AppMethodBeat.o(118576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.u
 * JD-Core Version:    0.6.2
 */