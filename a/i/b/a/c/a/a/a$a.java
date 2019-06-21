package a.i.b.a.c.a.a;

import a.f.b.j;
import a.i.b.a.c.f.b;
import a.k.m;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  static a.b a(String paramString, b paramb)
  {
    AppMethodBeat.i(119124);
    b.b.a locala = b.b.BcY;
    j.p(paramb, "packageFqName");
    j.p(paramString, "className");
    b.b[] arrayOfb = b.b.values();
    int i = arrayOfb.length;
    int j = 0;
    int k;
    if (j < i)
    {
      locala = arrayOfb[j];
      if ((j.j(locala.BcW, paramb)) && (m.jb(paramString, locala.BcX)))
      {
        k = 1;
        label69: if (k == 0)
          break label95;
        paramb = locala;
        label76: if (paramb != null)
          break label106;
        AppMethodBeat.o(119124);
        paramString = null;
      }
    }
    while (true)
    {
      return paramString;
      k = 0;
      break label69;
      label95: j++;
      break;
      paramb = null;
      break label76;
      label106: j = paramb.BcX.length();
      if (paramString == null)
      {
        paramString = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(119124);
        throw paramString;
      }
      paramString = paramString.substring(j);
      j.o(paramString, "(this as java.lang.String).substring(startIndex)");
      if (((CharSequence)paramString).length() == 0)
      {
        j = 1;
        label164: if (j == 0)
          break label202;
        paramString = null;
      }
      while (true)
      {
        if (paramString == null)
          break label274;
        paramString = new a.b(paramb, paramString.intValue());
        AppMethodBeat.o(119124);
        break;
        j = 0;
        break label164;
        label202: i = paramString.length();
        k = 0;
        int m;
        for (j = 0; ; j = m + j * 10)
        {
          if (k >= i)
            break label265;
          m = paramString.charAt(k) - '0';
          if ((m < 0) || (9 < m))
          {
            paramString = null;
            break;
          }
          k++;
        }
        label265: paramString = Integer.valueOf(j);
      }
      label274: AppMethodBeat.o(119124);
      paramString = null;
    }
  }

  public static b.b b(String paramString, b paramb)
  {
    AppMethodBeat.i(119125);
    j.p(paramString, "className");
    j.p(paramb, "packageFqName");
    paramString = a(paramString, paramb);
    if (paramString != null)
    {
      paramString = paramString.BcJ;
      AppMethodBeat.o(119125);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(119125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.a.a
 * JD-Core Version:    0.6.2
 */