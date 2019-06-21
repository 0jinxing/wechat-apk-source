package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;

public final class ao extends an
{
  protected final Map<String, Object> a(com.tencent.mm.plugin.appbrand.d paramd)
  {
    AppMethodBeat.i(130434);
    paramd = super.a(paramd);
    paramd.put("clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.vxo));
    paramd.put("x5Version", Integer.valueOf(com.tencent.xweb.x5.sdk.d.getTbsVersion(ah.getContext())));
    AppMethodBeat.o(130434);
    return paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ao
 * JD-Core Version:    0.6.2
 */