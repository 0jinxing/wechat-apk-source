package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg;
import org.json.JSONArray;
import org.json.JSONException;

public final class r
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103236);
    boolean bool;
    if (!TextUtils.isEmpty(paramString))
    {
      paramd.hcE.yB(paramString);
      paramd.hcF.yB(paramString);
      bool = true;
      AppMethodBeat.o(103236);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(103236);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103237);
    paramCanvas = (SetFontFamilyActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103237);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.bnS);
      AppMethodBeat.o(103237);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103235);
    if (paramJSONArray.length() == 0)
      AppMethodBeat.o(103235);
    while (true)
    {
      return bool;
      try
      {
        paramCanvas = paramJSONArray.getString(0);
        bool = b(paramd, paramCanvas);
        AppMethodBeat.o(103235);
      }
      catch (JSONException paramd)
      {
        com.tencent.luggage.g.d.i("MicroMsg.SetFontFamily", "get 'fontFamily' error.");
        AppMethodBeat.o(103235);
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103234);
    SetFontFamilyActionArg localSetFontFamilyActionArg = new SetFontFamilyActionArg();
    AppMethodBeat.o(103234);
    return localSetFontFamilyActionArg;
  }

  public final String getMethod()
  {
    return "setFontFamily";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.r
 * JD-Core Version:    0.6.2
 */