package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg;
import org.json.JSONArray;

public final class x
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103260);
    if ("butt".equalsIgnoreCase(paramString))
    {
      paramd.hcF.setStrokeCap(Paint.Cap.BUTT);
      paramd.hcE.setStrokeCap(Paint.Cap.BUTT);
    }
    while (true)
    {
      AppMethodBeat.o(103260);
      return true;
      if ("round".equalsIgnoreCase(paramString))
      {
        paramd.hcF.setStrokeCap(Paint.Cap.ROUND);
        paramd.hcE.setStrokeCap(Paint.Cap.ROUND);
      }
      else if ("square".equalsIgnoreCase(paramString))
      {
        paramd.hcF.setStrokeCap(Paint.Cap.SQUARE);
        paramd.hcE.setStrokeCap(Paint.Cap.SQUARE);
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103261);
    paramCanvas = (SetLineCapActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103261);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdj);
      AppMethodBeat.o(103261);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103259);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103259);
    while (true)
    {
      return bool;
      bool = b(paramd, paramJSONArray.optString(0));
      AppMethodBeat.o(103259);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103258);
    SetLineCapActionArg localSetLineCapActionArg = new SetLineCapActionArg();
    AppMethodBeat.o(103258);
    return localSetLineCapActionArg;
  }

  public final String getMethod()
  {
    return "setLineCap";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.x
 * JD-Core Version:    0.6.2
 */