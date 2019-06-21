package a.i.b.a.c.d.a;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.e;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u
{
  public static final l a(w paramw, String paramString)
  {
    AppMethodBeat.i(119743);
    j.p(paramw, "receiver$0");
    j.p(paramString, "value");
    Object localObject = paramw.ejw().dYs();
    if (((localObject instanceof e)) && (((e)localObject).dYc() == a.i.b.a.c.b.f.Bet))
    {
      paramw = ((e)localObject).dZk();
      paramString = a.i.b.a.c.f.f.avX(paramString);
      j.o(paramString, "Name.identifier(value)");
      paramw = paramw.c(paramString, (a.i.b.a.c.c.a.a)c.BjG);
      if (((paramw instanceof e)) && (((e)paramw).dYc() == a.i.b.a.c.b.f.Beu))
      {
        paramw = (l)new h((e)paramw);
        AppMethodBeat.o(119743);
      }
    }
    while (true)
    {
      return paramw;
      AppMethodBeat.o(119743);
      paramw = null;
      continue;
      localObject = a.i.b.a.c.l.c.a.aA(paramw);
      j.p(paramString, "value");
      label190: String str;
      int i;
      if ((m.jb(paramString, "0x")) || (m.jb(paramString, "0X")))
      {
        paramw = paramString.substring(2);
        j.o(paramw, "(this as java.lang.String).substring(startIndex)");
        paramw = new a.i.b.a.c.n.f(paramw, 16);
        str = paramw.tTc;
        i = paramw.BNi;
      }
      try
      {
        boolean bool;
        if (g.q((w)localObject))
        {
          bool = Boolean.parseBoolean(paramString);
          paramString = Boolean.valueOf(bool);
        }
        while (true)
        {
          if (paramString == null)
            break label554;
          paramw = (l)new f(paramString);
          AppMethodBeat.o(119743);
          break;
          if ((m.jb(paramString, "0b")) || (m.jb(paramString, "0B")))
          {
            paramw = paramString.substring(2);
            j.o(paramw, "(this as java.lang.String).substring(startIndex)");
            paramw = new a.i.b.a.c.n.f(paramw, 2);
            break label190;
          }
          paramw = new a.i.b.a.c.n.f(paramString, 10);
          break label190;
          if (g.r((w)localObject))
          {
            paramw = (CharSequence)paramString;
            j.p(paramw, "receiver$0");
            if (paramw.length() == 1)
              paramString = Character.valueOf(paramw.charAt(0));
            else
              paramString = null;
          }
          else if (g.t((w)localObject))
          {
            j.p(str, "receiver$0");
            paramw = m.eX(str, i);
            if (paramw != null)
            {
              i = paramw.intValue();
              if ((i < -128) || (i > 127))
              {
                paramString = null;
                continue;
              }
              paramString = Byte.valueOf((byte)i);
            }
          }
          else if (g.v((w)localObject))
          {
            j.p(str, "receiver$0");
            paramw = m.eX(str, i);
            if (paramw != null)
            {
              i = paramw.intValue();
              if ((i < -32768) || (i > 32767))
              {
                paramString = null;
                continue;
              }
              paramString = Short.valueOf((short)i);
            }
          }
          else if (g.s((w)localObject))
          {
            paramString = m.eX(str, i);
          }
          else if (g.u((w)localObject))
          {
            paramString = m.eY(str, i);
          }
          else if (g.w((w)localObject))
          {
            paramString = m.aww(paramString);
          }
          else if (g.x((w)localObject))
          {
            paramString = m.awx(paramString);
          }
          else
          {
            bool = g.E((w)localObject);
            if (!bool)
              paramString = null;
          }
        }
      }
      catch (IllegalArgumentException paramw)
      {
        while (true)
          paramString = null;
        label554: AppMethodBeat.o(119743);
        paramw = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.u
 * JD-Core Version:    0.6.2
 */