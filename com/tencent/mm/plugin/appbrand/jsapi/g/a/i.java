package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.e.b;
import com.tencent.mm.plugin.appbrand.widget.e.d;
import java.util.LinkedList;

public final class i
{
  private static LinkedList<View> hOL;
  private static LinkedList<d> hOM;
  private static LinkedList<b> hON;

  static
  {
    AppMethodBeat.i(51243);
    hOL = new LinkedList();
    hOM = new LinkedList();
    hON = new LinkedList();
    AppMethodBeat.o(51243);
  }

  public static boolean a(b paramb)
  {
    AppMethodBeat.i(51239);
    synchronized (hON)
    {
      if (hON.size() > 0)
      {
        bool = false;
        AppMethodBeat.o(51239);
        return bool;
      }
      hON.push(paramb);
      boolean bool = true;
      AppMethodBeat.o(51239);
    }
  }

  public static boolean a(d paramd)
  {
    AppMethodBeat.i(51241);
    synchronized (hOM)
    {
      if (hOM.size() > 0)
      {
        bool = false;
        AppMethodBeat.o(51241);
        return bool;
      }
      hOM.push(paramd);
      boolean bool = true;
      AppMethodBeat.o(51241);
    }
  }

  public static b aEe()
  {
    AppMethodBeat.i(51238);
    synchronized (hON)
    {
      if (hON.size() <= 0)
      {
        localb = null;
        AppMethodBeat.o(51238);
        return localb;
      }
      b localb = (b)hON.removeFirst();
      cm(localb);
      AppMethodBeat.o(51238);
    }
  }

  public static d aEf()
  {
    AppMethodBeat.i(51240);
    synchronized (hOM)
    {
      if (hOM.size() <= 0)
      {
        locald = null;
        AppMethodBeat.o(51240);
        return locald;
      }
      d locald = (d)hOM.removeFirst();
      cm(locald);
      AppMethodBeat.o(51240);
    }
  }

  private static void cm(View paramView)
  {
    AppMethodBeat.i(51242);
    if (paramView == null)
      AppMethodBeat.o(51242);
    while (true)
    {
      return;
      if (!ViewGroup.class.isInstance(paramView.getParent()))
      {
        AppMethodBeat.o(51242);
      }
      else
      {
        ((ViewGroup)paramView.getParent()).removeView(paramView);
        AppMethodBeat.o(51242);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.i
 * JD-Core Version:    0.6.2
 */