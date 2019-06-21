package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.a.a.a;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;

public final class l
  implements d
{
  private static boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, String paramString, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(103214);
    Paint.FontMetrics localFontMetrics = paramd.hcE.getFontMetrics();
    float f;
    if (paramd.hcE.hdH == a.a.hdO)
    {
      f = paramFloat2 + Math.abs(localFontMetrics.ascent);
      paramd = paramd.hcF;
      paramFloat2 = paramd.measureText(paramString);
      if ((paramFloat3 <= 0.0F) || (paramFloat3 >= paramFloat2))
        break label189;
      paramCanvas.save();
      paramFloat2 = paramFloat3 / paramFloat2;
      paramCanvas.translate(paramFloat1, f);
      paramCanvas.scale(paramFloat2, 1.0F);
      paramCanvas.drawText(paramString, 0.0F, 0.0F, paramd);
      paramCanvas.restore();
    }
    while (true)
    {
      AppMethodBeat.o(103214);
      return true;
      if (paramd.hcE.hdH == a.a.hdQ)
      {
        f = paramFloat2 + Math.abs((-localFontMetrics.ascent + localFontMetrics.descent) / 2.0F - localFontMetrics.descent);
        break;
      }
      f = paramFloat2;
      if (paramd.hcE.hdH != a.a.hdP)
        break;
      f = paramFloat2 - Math.abs(localFontMetrics.descent);
      break;
      label189: paramCanvas.drawText(paramString, paramFloat1, f, paramd);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    AppMethodBeat.i(103215);
    paramDrawActionArg = (DrawTextActionArg)paramDrawActionArg;
    boolean bool;
    if (paramDrawActionArg == null)
    {
      bool = false;
      AppMethodBeat.o(103215);
    }
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, paramDrawActionArg.text, paramDrawActionArg.x, paramDrawActionArg.y, paramDrawActionArg.hcW);
      AppMethodBeat.o(103215);
    }
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    boolean bool = false;
    AppMethodBeat.i(103213);
    if (paramJSONArray.length() < 3)
      AppMethodBeat.o(103213);
    while (true)
    {
      return bool;
      bool = a(paramd, paramCanvas, paramJSONArray.optString(0), g.d(paramJSONArray, 1), g.d(paramJSONArray, 2), g.d(paramJSONArray, 3));
      AppMethodBeat.o(103213);
    }
  }

  public final BaseDrawActionArg ayf()
  {
    AppMethodBeat.i(103212);
    DrawTextActionArg localDrawTextActionArg = new DrawTextActionArg();
    AppMethodBeat.o(103212);
    return localDrawTextActionArg;
  }

  public final String getMethod()
  {
    return "fillText";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.l
 * JD-Core Version:    0.6.2
 */