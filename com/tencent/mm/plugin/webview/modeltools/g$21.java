package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class g$21
  implements bz.a
{
  g$21(g paramg)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(6990);
    new Thread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6989);
        ab.d("MicroMsg.SubCoreTools", "webview hijack sysMsgListener");
        Map localMap = br.z(this.gUV, "sysmsg");
        long l = bo.getLong((String)localMap.get(".sysmsg.hijackconfig.expiretime"), 9223372036854775807L);
        String str1 = ".sysmsg.hijackconfig.domainlist.domain";
        int i = 0;
        if (i > 0)
          str1 = ".sysmsg.hijackconfig.domainlist.domain" + i;
        while (true)
        {
          i++;
          String str2 = (String)localMap.get(str1);
          if (!bo.isNullOrNil(str2))
          {
            i locali = new i();
            locali.field_expireTime = l;
            locali.field_host = str2;
            this.upo.b(locali);
            break;
          }
          AppMethodBeat.o(6989);
          return;
        }
      }
    }).start();
    AppMethodBeat.o(6990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.g.21
 * JD-Core Version:    0.6.2
 */