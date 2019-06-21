package a;

import a.d.a;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"stackTrace", "", "Ljava/lang/StackTraceElement;", "", "stackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "addSuppressed", "", "exception", "printStackTrace", "stream", "Ljava/io/PrintStream;", "writer", "Ljava/io/PrintWriter;", "kotlin-stdlib"}, dWr=1)
public class b
{
  public static final void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(56257);
    j.p(paramThrowable1, "receiver$0");
    j.p(paramThrowable2, "exception");
    a.d.b.AVu.a(paramThrowable1, paramThrowable2);
    AppMethodBeat.o(56257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.b
 * JD-Core Version:    0.6.2
 */