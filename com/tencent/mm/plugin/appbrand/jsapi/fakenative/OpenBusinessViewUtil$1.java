package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.axp;
import com.tencent.mm.sdk.platformtools.ab;

final class OpenBusinessViewUtil$1
  implements b.a
{
  OpenBusinessViewUtil$1(OpenBusinessViewUtil.a parama)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(131044);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null) && (paramb.fsH.fsP != null) && ((paramb.fsH.fsP instanceof axp)))
    {
      paramString = (axp)paramb.fsH.fsP;
      ab.i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request success, appId:%s, path:%s", new Object[] { paramString.csB, paramString.wBA });
      if (this.hJC != null)
        this.hJC.ce(paramString.csB, paramString.wBA);
      AppMethodBeat.o(131044);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request fail");
      if (this.hJC != null)
        this.hJC.R(paramInt2, paramString);
      AppMethodBeat.o(131044);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil.1
 * JD-Core Version:    0.6.2
 */