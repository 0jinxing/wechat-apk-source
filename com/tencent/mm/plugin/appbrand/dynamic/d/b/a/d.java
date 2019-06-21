package com.tencent.mm.plugin.appbrand.dynamic.d.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import org.json.JSONObject;

public final class d extends a
{
  public final int azV()
  {
    return 0;
  }

  public final DrawCanvasArg c(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(10898);
    paramString = super.c(paramJSONObject, paramString);
    paramString.h(paramJSONObject.optJSONArray("actions"));
    AppMethodBeat.o(10898);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.d
 * JD-Core Version:    0.6.2
 */