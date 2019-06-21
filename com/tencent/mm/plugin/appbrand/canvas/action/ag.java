package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg;
import org.json.JSONArray;

public final class ag
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103292);
    if ("left".equalsIgnoreCase(paramString))
    {
      paramd.hcE.setTextAlign(Paint.Align.LEFT);
      paramd.hcF.setTextAlign(Paint.Align.LEFT);
    }
    while (true)
    {
      AppMethodBeat.o(103292);
      return true;
      if ("right".equalsIgnoreCase(paramString))
      {
        paramd.hcE.setTextAlign(Paint.Align.RIGHT);
        paramd.hcF.setTextAlign(Paint.Align.RIGHT);
      }
      else if ("center".equalsIgnoreCase(paramString))
      {
        paramd.hcE.setTextAlign(Paint.Align.CENTER);
        paramd.hcF.setTextAlign(Paint.Align.CENTER);
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103293);
    paramCanvas = (SetTextAlignActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103293);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdq);
      AppMethodBeat.o(103293);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103291);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103291);
    while (true)
    {
      return bool;
      bool = b(paramd, paramJSONArray.optString(0));
      AppMethodBeat.o(103291);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103290);
    SetTextAlignActionArg localSetTextAlignActionArg = new SetTextAlignActionArg();
    AppMethodBeat.o(103290);
    return localSetTextAlignActionArg;
  }

  public final String getMethod()
  {
    return "setTextAlign";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.ag
 * JD-Core Version:    0.6.2
 */