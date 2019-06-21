package a.i.b.a.c.b;

import a.i.b.a.c.i.d;
import a.i.b.a.c.i.e.a.f;
import a.i.b.a.c.l.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ay$6 extends az
{
  ay$6(String paramString)
  {
    super(paramString, true);
  }

  public final boolean b(a.i.b.a.c.i.e.a.e parame, p paramp, l paraml)
  {
    AppMethodBeat.i(119306);
    while (true)
    {
      e locale1 = (e)d.a(paramp, e.class);
      e locale2 = (e)d.a(paraml, e.class, false);
      boolean bool;
      if (locale2 == null)
      {
        AppMethodBeat.o(119306);
        bool = false;
      }
      while (true)
      {
        return bool;
        if ((locale1 != null) && (d.u(locale1)))
        {
          paraml = (e)d.a(locale1, e.class);
          if ((paraml != null) && (d.c(locale2, paraml)))
          {
            AppMethodBeat.o(119306);
            bool = true;
          }
        }
        else
        {
          paraml = d.a(paramp);
          locale1 = (e)d.a(paraml, e.class);
          if (locale1 != null)
            break;
          AppMethodBeat.o(119306);
          bool = false;
        }
      }
      if (d.c(locale2, locale1))
      {
        int i;
        if (parame != ay.Bfk)
          if (!(paraml instanceof b))
            i = 1;
        while (true)
        {
          if (i == 0)
            break label265;
          AppMethodBeat.o(119306);
          bool = true;
          break;
          if ((paraml instanceof k))
          {
            i = 1;
          }
          else if (parame == ay.Bfj)
          {
            i = 1;
          }
          else if ((parame == ay.eae()) || (parame == null))
          {
            i = 0;
          }
          else
          {
            if ((parame instanceof f));
            for (paraml = ((f)parame).ejP(); ; paraml = parame.dZS())
            {
              if ((!d.b(paraml, locale2)) && (!n.ag(paraml)))
                break label259;
              i = 1;
              break;
            }
            label259: i = 0;
          }
        }
      }
      label265: paraml = locale2.dXW();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.ay.6
 * JD-Core Version:    0.6.2
 */