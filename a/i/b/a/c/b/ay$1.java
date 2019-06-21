package a.i.b.a.c.b;

import a.i.b.a.c.f.b;
import a.i.b.a.c.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ay$1 extends az
{
  ay$1(String paramString)
  {
    super(paramString, false);
  }

  public final boolean b(a.i.b.a.c.i.e.a.e parame, p paramp, l paraml)
  {
    AppMethodBeat.i(119301);
    int i;
    boolean bool;
    if (d.r(paramp))
      if (d.C(paraml) != an.BeS)
      {
        i = 1;
        if (i == 0)
          break label51;
        bool = ay.a(paramp, paraml);
        AppMethodBeat.o(119301);
      }
    label282: 
    while (true)
    {
      return bool;
      i = 0;
      break;
      label51: if ((paramp instanceof k))
      {
        parame = ((k)paramp).dZo();
        if ((d.v(parame)) && (d.r(parame)) && ((paraml instanceof k)) && (d.r(paraml.dXW())) && (ay.a(paramp, paraml)))
        {
          AppMethodBeat.o(119301);
          bool = true;
        }
      }
      else
      {
        parame = paramp;
        l locall;
        do
        {
          paramp = parame;
          if (parame == null)
            break;
          locall = parame.dXW();
          if ((locall instanceof e))
          {
            paramp = locall;
            if (!d.u(locall))
              break;
          }
          parame = locall;
        }
        while (!(locall instanceof ab));
        paramp = locall;
        if (paramp == null)
        {
          AppMethodBeat.o(119301);
          bool = false;
        }
        else
        {
          while (true)
          {
            if (paraml == null)
              break label282;
            if (paramp == paraml)
            {
              AppMethodBeat.o(119301);
              bool = true;
              break;
            }
            if ((paraml instanceof ab))
            {
              if (((paramp instanceof ab)) && (((ab)paramp).dZF().equals(((ab)paraml).dZF())) && (d.e(paraml, paramp)))
              {
                AppMethodBeat.o(119301);
                bool = true;
                break;
              }
              AppMethodBeat.o(119301);
              bool = false;
              break;
            }
            paraml = paraml.dXW();
          }
          AppMethodBeat.o(119301);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.ay.1
 * JD-Core Version:    0.6.2
 */