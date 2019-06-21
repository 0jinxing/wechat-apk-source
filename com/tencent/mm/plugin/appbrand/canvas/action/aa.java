package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Paint.Join;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg;
import org.json.JSONArray;

public final class aa
  implements d
{
  private static boolean b(com.tencent.mm.plugin.appbrand.canvas.d paramd, String paramString)
  {
    AppMethodBeat.i(103269);
    if ("miter".equalsIgnoreCase(paramString))
    {
      paramd.hcF.setStrokeJoin(Paint.Join.MITER);
      paramd.hcE.setStrokeJoin(Paint.Join.MITER);
    }
    while (true)
    {
      AppMethodBeat.o(103269);
      return true;
      if ("round".equalsIgnoreCase(paramString))
      {
        paramd.hcF.setStrokeJoin(Paint.Join.ROUND);
        paramd.hcE.setStrokeJoin(Paint.Join.ROUND);
      }
      else if ("bevel".equalsIgnoreCase(paramString))
      {
        paramd.hcF.setStrokeJoin(Paint.Join.BEVEL);
        paramd.hcE.setStrokeJoin(Paint.Join.BEVEL);
      }
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103270);
    paramCanvas = (SetLineJoinActionArg)paramDrawActionArg;
    boolean bool;
    if (paramCanvas == null)
    {
      bool = false;
      AppMethodBeat.o(103270);
    }
    while (true)
    {
      return bool;
      bool = b(paramd, paramCanvas.hdm);
      AppMethodBeat.o(103270);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103268);
    if (paramJSONArray.length() <= 0)
      AppMethodBeat.o(103268);
    while (true)
    {
      return bool;
      bool = b(paramd, paramJSONArray.optString(0));
      AppMethodBeat.o(103268);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103267);
    SetLineJoinActionArg localSetLineJoinActionArg = new SetLineJoinActionArg();
    AppMethodBeat.o(103267);
    return localSetLineJoinActionArg;
  }

  public final String getMethod()
  {
    return "setLineJoin";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.aa
 * JD-Core Version:    0.6.2
 */