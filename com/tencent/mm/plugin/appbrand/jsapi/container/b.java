package com.tencent.mm.plugin.appbrand.jsapi.container;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class b extends com.tencent.mm.plugin.appbrand.jsapi.base.b
{
  public static final int CTRL_INDEX = 512;
  public static final String NAME = "removePositioningContainer";

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126280);
    int i = paramJSONObject.getInt("containerId");
    AppMethodBeat.o(126280);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.b
 * JD-Core Version:    0.6.2
 */