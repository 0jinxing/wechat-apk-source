package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg;
import org.json.JSONArray;
import org.json.JSONException;

public final class u
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103248);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 3029637:
    case -1039745817:
    }
    while (true)
    {
      AppMethodBeat.o(103248);
      return true;
      if (!paramString.equals("bold"))
        break;
      i = 0;
      break;
      if (!paramString.equals("normal"))
        break;
      i = 1;
      break;
      paramd.hcE.setFakeBoldText(true);
      paramd.hcF.setFakeBoldText(true);
      continue;
      paramd.hcE.setFakeBoldText(false);
      paramd.hcF.setFakeBoldText(false);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103249);
    paramCanvas = (SetFontWeightArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103249);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdi);
      AppMethodBeat.o(103249);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103247);
    if (paramJSONArray.length() == 0)
      AppMethodBeat.o(103247);
    while (true)
    {
      return bool;
      try
      {
        paramCanvas = paramJSONArray.getString(0);
        bool = b(paramd, paramCanvas);
        AppMethodBeat.o(103247);
      }
      catch (JSONException paramd)
      {
        com.tencent.luggage.g.d.i("MicroMsg.SetFontWeight", "get 'fontWeight' error.");
        AppMethodBeat.o(103247);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103246);
    SetFontWeightArg localSetFontWeightArg = new SetFontWeightArg();
    AppMethodBeat.o(103246);
    return localSetFontWeightArg;
  }

  public final String getMethod()
  {
    return "setFontWeight";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.u
 * JD-Core Version:    0.6.2
 */