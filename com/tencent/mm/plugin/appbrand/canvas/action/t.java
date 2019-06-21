package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg;
import org.json.JSONArray;
import org.json.JSONException;

public final class t
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103244);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      break;
    case -1657669071:
    case -1178781136:
    case -1039745817:
    }
    while (true)
    {
      AppMethodBeat.o(103244);
      return true;
      if (!paramString.equals("oblique"))
        break;
      i = 0;
      break;
      if (!paramString.equals("italic"))
        break;
      i = 1;
      break;
      if (!paramString.equals("normal"))
        break;
      i = 2;
      break;
      paramd.hcE.nE(2);
      paramd.hcF.nE(2);
      continue;
      paramd.hcE.nE(2);
      paramd.hcF.nE(2);
      continue;
      paramd.hcE.nE(0);
      paramd.hcF.nE(0);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103245);
    paramCanvas = (SetFontStyleActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103245);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdh);
      AppMethodBeat.o(103245);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103243);
    if (paramJSONArray.length() == 0)
      AppMethodBeat.o(103243);
    while (true)
    {
      return bool;
      try
      {
        paramCanvas = paramJSONArray.getString(0);
        bool = b(paramd, paramCanvas);
        AppMethodBeat.o(103243);
      }
      catch (JSONException paramd)
      {
        com.tencent.luggage.g.d.i("MicroMsg.SetFontStyle", "get 'fontStyle' error.");
        AppMethodBeat.o(103243);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103242);
    SetFontStyleActionArg localSetFontStyleActionArg = new SetFontStyleActionArg();
    AppMethodBeat.o(103242);
    return localSetFontStyleActionArg;
  }

  public final String getMethod()
  {
    return "setFontStyle";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.t
 * JD-Core Version:    0.6.2
 */