package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.aee;
import com.tencent.mm.protocal.protobuf.do;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class l$2
  implements l.b
{
  l$2(l.c paramc, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(129853);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if (this.hhw != null)
        this.hhw.xC("");
      AppMethodBeat.o(129853);
    }
    while (true)
    {
      return;
      paramString = (aee)paramb.fsH.fsP;
      if ((paramString.wmh == null) || (paramString.wmh.size() == 0))
      {
        ab.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
        if (this.hhw != null)
          this.hhw.xC("");
        AppMethodBeat.o(129853);
      }
      else
      {
        paramString = (do)paramString.wmh.get(0);
        ab.i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramString.vFt, Integer.valueOf(paramString.vFs) });
        if (!bo.isNullOrNil(paramString.vFt))
        {
          l.a.C(this.hhv, paramString.jCt, paramString.vFs);
          l.a.D(this.hhv, paramString.jCt, paramString.vFs);
          l.a.h(this.hhv, paramString.jCt, paramString.vFt);
          if (this.hhw != null)
          {
            this.hhw.xC(paramString.vFt);
            AppMethodBeat.o(129853);
          }
        }
        else
        {
          if (this.hhw != null)
            this.hhw.xC("");
          AppMethodBeat.o(129853);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.l.2
 * JD-Core Version:    0.6.2
 */