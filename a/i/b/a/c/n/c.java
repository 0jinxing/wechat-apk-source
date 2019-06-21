package a.i.b.a.c.n;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public static final boolean r(Throwable paramThrowable)
  {
    AppMethodBeat.i(122927);
    j.p(paramThrowable, "receiver$0");
    paramThrowable = paramThrowable.getClass();
    boolean bool;
    if (j.j(paramThrowable.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException"))
    {
      bool = true;
      AppMethodBeat.o(122927);
    }
    while (true)
    {
      return bool;
      Class localClass = paramThrowable.getSuperclass();
      paramThrowable = localClass;
      if (localClass != null)
        break;
      bool = false;
      AppMethodBeat.o(122927);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.c
 * JD-Core Version:    0.6.2
 */