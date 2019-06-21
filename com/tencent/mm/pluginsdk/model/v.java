package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.x5.sdk.d;
import java.util.HashMap;
import java.util.Map;

public final class v
{
  private static final Map<String, Object> vbK;

  static
  {
    AppMethodBeat.i(114675);
    vbK = new HashMap();
    AppMethodBeat.o(114675);
  }

  public static void r(String paramString, Object paramObject)
  {
    AppMethodBeat.i(114674);
    vbK.put(paramString, paramObject);
    d.initTbsSettings(vbK);
    AppMethodBeat.o(114674);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.v
 * JD-Core Version:    0.6.2
 */