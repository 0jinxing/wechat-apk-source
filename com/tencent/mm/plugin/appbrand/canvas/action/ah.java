package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg;
import org.json.JSONArray;

public final class ah
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103296);
    com.tencent.luggage.g.d.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", new Object[] { paramString });
    if ("top".equalsIgnoreCase(paramString))
    {
      paramd.hcE.hdH = a.a.hdO;
      paramd.hcF.hdH = a.a.hdO;
    }
    while (true)
    {
      AppMethodBeat.o(103296);
      return true;
      if ("middle".equalsIgnoreCase(paramString))
      {
        paramd.hcE.hdH = a.a.hdQ;
        paramd.hcF.hdH = a.a.hdQ;
      }
      else if ("bottom".equalsIgnoreCase(paramString))
      {
        paramd.hcE.hdH = a.a.hdP;
        paramd.hcF.hdH = a.a.hdP;
      }
      else if ("normal".equalsIgnoreCase(paramString))
      {
        paramd.hcE.hdH = a.a.hdN;
        paramd.hcF.hdH = a.a.hdN;
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103297);
    paramCanvas = (SetTextBaseLineActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103297);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdq);
      AppMethodBeat.o(103297);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103295);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103295);
    while (true)
    {
      return bool;
      bool = b(paramd, paramJSONArray.optString(0));
      AppMethodBeat.o(103295);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103294);
    SetTextBaseLineActionArg localSetTextBaseLineActionArg = new SetTextBaseLineActionArg();
    AppMethodBeat.o(103294);
    return localSetTextBaseLineActionArg;
  }

  public final String getMethod()
  {
    return "setTextBaseline";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.ah
 * JD-Core Version:    0.6.2
 */