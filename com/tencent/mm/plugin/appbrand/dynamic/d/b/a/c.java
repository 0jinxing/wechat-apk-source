package com.tencent.mm.plugin.appbrand.dynamic.d.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import org.json.JSONObject;

public final class c extends a
{
  public final int azV()
  {
    return 2;
  }

  public final DrawCanvasArg c(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(10896);
    paramJSONObject = super.c(paramJSONObject, paramString);
    paramJSONObject.hdX = true;
    AppMethodBeat.o(10896);
    return paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.c
 * JD-Core Version:    0.6.2
 */