package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.d.a.n;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Modifier;

@l(dWo={1, 1, 13})
public final class t$a
{
  public static boolean a(t paramt)
  {
    AppMethodBeat.i(123104);
    boolean bool = Modifier.isAbstract(paramt.getModifiers());
    AppMethodBeat.o(123104);
    return bool;
  }

  public static boolean b(t paramt)
  {
    AppMethodBeat.i(123105);
    boolean bool = Modifier.isStatic(paramt.getModifiers());
    AppMethodBeat.o(123105);
    return bool;
  }

  public static boolean c(t paramt)
  {
    AppMethodBeat.i(123106);
    boolean bool = Modifier.isFinal(paramt.getModifiers());
    AppMethodBeat.o(123106);
    return bool;
  }

  public static az d(t paramt)
  {
    AppMethodBeat.i(123107);
    int i = paramt.getModifiers();
    if (Modifier.isPublic(i))
    {
      paramt = ay.Bfa;
      j.o(paramt, "Visibilities.PUBLIC");
      AppMethodBeat.o(123107);
    }
    while (true)
    {
      return paramt;
      if (Modifier.isPrivate(i))
      {
        paramt = ay.BeW;
        j.o(paramt, "Visibilities.PRIVATE");
        AppMethodBeat.o(123107);
      }
      else
      {
        if (Modifier.isProtected(i))
        {
          if (Modifier.isStatic(i));
          for (paramt = n.Blh; ; paramt = n.Bli)
          {
            j.o(paramt, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
            AppMethodBeat.o(123107);
            break;
          }
        }
        paramt = n.Blg;
        j.o(paramt, "JavaVisibilities.PACKAGE_VISIBILITY");
        AppMethodBeat.o(123107);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.t.a
 * JD-Core Version:    0.6.2
 */