package a.d.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "kotlin-stdlib-jdk7"})
public class a extends a.d.a
{
  public final void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(123227);
    j.p(paramThrowable1, "cause");
    j.p(paramThrowable2, "exception");
    paramThrowable1.addSuppressed(paramThrowable2);
    AppMethodBeat.o(123227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.d.a.a
 * JD-Core Version:    0.6.2
 */