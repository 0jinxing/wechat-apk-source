package a.i.b.a.e;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.f.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

@l(dWo={1, 1, 13})
public final class f$a
{
  public static c a(f paramf, b paramb)
  {
    AppMethodBeat.i(123034);
    j.p(paramb, "fqName");
    paramf = paramf.ekH();
    if (paramf != null)
    {
      paramf = paramf.getDeclaredAnnotations();
      if (paramf != null)
      {
        paramf = g.a(paramf, paramb);
        AppMethodBeat.o(123034);
      }
    }
    while (true)
    {
      return paramf;
      paramf = null;
      AppMethodBeat.o(123034);
    }
  }

  public static List<c> a(f paramf)
  {
    AppMethodBeat.i(123033);
    paramf = paramf.ekH();
    if (paramf != null)
    {
      paramf = paramf.getDeclaredAnnotations();
      if (paramf != null)
      {
        paramf = g.a(paramf);
        AppMethodBeat.o(123033);
      }
    }
    while (true)
    {
      return paramf;
      paramf = (List)v.AUP;
      AppMethodBeat.o(123033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.f.a
 * JD-Core Version:    0.6.2
 */