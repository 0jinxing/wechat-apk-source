package a.i.b.a.c.f;

import a.f.b.j;
import a.k.m;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static boolean a(b paramb1, b paramb2)
  {
    boolean bool = true;
    AppMethodBeat.i(121389);
    j.p(paramb1, "receiver$0");
    j.p(paramb2, "packageName");
    if (j.j(paramb1, paramb2))
      AppMethodBeat.o(121389);
    while (true)
    {
      return bool;
      if (paramb2.ehF())
      {
        AppMethodBeat.o(121389);
      }
      else
      {
        paramb1 = paramb1.ByQ.ByV;
        j.o(paramb1, "this.asString()");
        paramb2 = paramb2.ByQ.ByV;
        j.o(paramb2, "packageName.asString()");
        if ((m.jb(paramb1, paramb2)) && (paramb1.charAt(paramb2.length()) == '.'))
        {
          AppMethodBeat.o(121389);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(121389);
        }
      }
    }
  }

  public static final b b(b paramb1, b paramb2)
  {
    AppMethodBeat.i(121390);
    j.p(paramb1, "receiver$0");
    j.p(paramb2, "prefix");
    if ((!a(paramb1, paramb2)) || (paramb2.ehF()))
      AppMethodBeat.o(121390);
    while (true)
    {
      return paramb1;
      if (j.j(paramb1, paramb2))
      {
        paramb1 = b.ByP;
        j.o(paramb1, "FqName.ROOT");
        AppMethodBeat.o(121390);
      }
      else
      {
        paramb1 = paramb1.ByQ.ByV;
        j.o(paramb1, "asString()");
        int i = paramb2.ByQ.ByV.length();
        if (paramb1 == null)
        {
          paramb1 = new v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(121390);
          throw paramb1;
        }
        paramb1 = paramb1.substring(i + 1);
        j.o(paramb1, "(this as java.lang.String).substring(startIndex)");
        paramb1 = new b(paramb1);
        AppMethodBeat.o(121390);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.d
 * JD-Core Version:    0.6.2
 */