package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m.a;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import org.json.JSONObject;

public final class af extends u
{
  private static final int CTRL_INDEX = 396;
  private static final String NAME = "saveFileSync";

  public final String b(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102809);
    paramc = ae.d(paramc, paramJSONObject);
    paramc = j(paramc.aIm, paramc.values);
    AppMethodBeat.o(102809);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.af
 * JD-Core Version:    0.6.2
 */