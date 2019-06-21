package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.aee;
import com.tencent.mm.protocal.protobuf.do;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class l$1
  implements l.b
{
  l$1(String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(129852);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(129852);
    }
    while (true)
    {
      return;
      paramString = (aee)paramb.fsH.fsP;
      if ((paramString.wmh == null) || (paramString.wmh.size() == 0))
      {
        ab.e("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, AppConfigList is empty");
        AppMethodBeat.o(129852);
      }
      else
      {
        ab.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer appConfigList.size:%d", new Object[] { Integer.valueOf(paramString.wmh.size()) });
        paramString = paramString.wmh.iterator();
        while (paramString.hasNext())
        {
          paramb = (do)paramString.next();
          ab.i("MicroMsg.CommonConfigManager", "setVersion syncConfigFromServer, the config is %s, the configVersion is %d", new Object[] { paramb.vFt, Integer.valueOf(paramb.vFs) });
          if (!bo.isNullOrNil(paramb.vFt))
          {
            l.a.C(this.hhv, paramb.jCt, paramb.vFs);
            l.a.D(this.hhv, paramb.jCt, paramb.vFs);
            l.a.h(this.hhv, paramb.jCt, paramb.vFt);
          }
        }
        AppMethodBeat.o(129852);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.l.1
 * JD-Core Version:    0.6.2
 */