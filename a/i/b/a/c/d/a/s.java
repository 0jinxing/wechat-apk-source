package a.i.b.a.c.d.a;

import a.aa;
import a.i.b.a.c.f.f;
import a.i.b.a.c.m.a.a;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class s
{
  private static final f a(f paramf, String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(119724);
    if (paramf.ByZ)
    {
      AppMethodBeat.o(119724);
      paramf = null;
    }
    while (true)
    {
      return paramf;
      String str = paramf.ehN();
      a.f.b.j.o(str, "methodName.identifier");
      if (!m.jb(str, paramString1))
      {
        AppMethodBeat.o(119724);
        paramf = null;
      }
      else if (str.length() == paramString1.length())
      {
        AppMethodBeat.o(119724);
        paramf = null;
      }
      else
      {
        int i = str.charAt(paramString1.length());
        if (97 > i);
        while (true)
          if (paramString2 != null)
          {
            if ((aa.AUz) && (!paramBoolean))
            {
              paramf = (Throwable)new AssertionError("Assertion failed");
              AppMethodBeat.o(119724);
              throw paramf;
              if (122 < i)
                continue;
              AppMethodBeat.o(119724);
              paramf = null;
              break;
            }
            paramf = f.avX(paramString2 + m.b(str, (CharSequence)paramString1));
            AppMethodBeat.o(119724);
            break;
          }
        if (!paramBoolean)
        {
          AppMethodBeat.o(119724);
        }
        else
        {
          paramf = a.awr(m.b(str, (CharSequence)paramString1));
          if (!f.avY(paramf))
          {
            AppMethodBeat.o(119724);
            paramf = null;
          }
          else
          {
            paramf = f.avX(paramf);
            AppMethodBeat.o(119724);
          }
        }
      }
    }
  }

  private static f a(f paramf, boolean paramBoolean)
  {
    AppMethodBeat.i(119723);
    a.f.b.j.p(paramf, "methodName");
    if (paramBoolean);
    for (String str = "is"; ; str = null)
    {
      paramf = a(paramf, "set", false, str, 4);
      AppMethodBeat.o(119723);
      return paramf;
    }
  }

  public static final List<f> j(f paramf)
  {
    AppMethodBeat.i(119726);
    a.f.b.j.p(paramf, "name");
    Object localObject = paramf.name;
    a.f.b.j.o(localObject, "name.asString()");
    if (o.avH((String)localObject))
    {
      a.f.b.j.p(paramf, "methodName");
      f localf = a(paramf, "get", false, null, 12);
      localObject = localf;
      if (localf == null)
        localObject = a(paramf, "is", false, null, 8);
      paramf = a.a.j.dm(localObject);
      AppMethodBeat.o(119726);
    }
    while (true)
    {
      return paramf;
      if (o.avI((String)localObject))
      {
        a.f.b.j.p(paramf, "methodName");
        paramf = a.a.j.k((Iterable)a.a.j.listOf(new f[] { a(paramf, false), a(paramf, true) }));
        AppMethodBeat.o(119726);
      }
      else
      {
        localObject = e.BkZ;
        paramf = e.i(paramf);
        AppMethodBeat.o(119726);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.s
 * JD-Core Version:    0.6.2
 */