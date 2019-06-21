package com.tencent.xweb;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.f;
import org.xwalk.core.XWalkEnvironment;

public final class i
{
  public static i.a AMa;
  private static String AMc = "";
  public f AMb;
  public volatile boolean iff;

  public static i.a a(i.a parama, String paramString, Context paramContext)
  {
    AppMethodBeat.i(3811);
    m.jy(paramContext);
    if (m.dTZ().AMA != i.a.AMd)
    {
      parama = m.dTZ().AMA;
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "use hardcode jscore type = ".concat(String.valueOf(parama)));
      if (WebView.getCurWebType() != WebView.d.ANc)
        break label130;
      paramString = parama;
      if (i.a.AMe != parama)
      {
        paramString = parama;
        if (i.a.AMi != parama)
          paramString = i.a.AMl;
      }
    }
    while (true)
    {
      AppMethodBeat.o(3811);
      return paramString;
      if (a.auV(paramString) == i.a.AMd)
        break;
      parama = a.auV(paramString);
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "module " + paramString + "use cmd jscore type = " + parama);
      break;
      label130: if (WebView.getCurWebType() == WebView.d.ANb)
      {
        paramString = parama;
        if (i.a.AMk != parama)
        {
          paramString = parama;
          if (i.a.AMj != parama)
          {
            paramString = parama;
            if (i.a.AMe != parama)
              paramString = i.a.AMl;
          }
        }
      }
      else
      {
        paramString = parama;
        if (WebView.getCurWebType() == WebView.d.ANd)
        {
          paramString = parama;
          if (i.a.AMe != parama)
            paramString = i.a.AMl;
        }
      }
    }
  }

  public static i.a dTU()
  {
    return AMa;
  }

  public static String dTV()
  {
    return AMc;
  }

  public final boolean dTW()
  {
    AppMethodBeat.i(3812);
    boolean bool = this.AMb.dTW();
    AppMethodBeat.o(3812);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.i
 * JD-Core Version:    0.6.2
 */