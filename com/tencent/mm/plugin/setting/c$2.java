package com.tencent.mm.plugin.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.Map;

final class c$2
  implements bz.a
{
  c$2(c paramc)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(126826);
    parama = aa.a(parama.eAB.vED);
    if ((parama == null) || (parama.length() == 0))
    {
      ab.e("MicroMsg.SubCoreSetting", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
      AppMethodBeat.o(126826);
    }
    int i;
    while (true)
    {
      return;
      localObject = br.z(parama, "sysmsg");
      if (localObject == null)
      {
        AppMethodBeat.o(126826);
      }
      else
      {
        parama = bo.bc((String)((Map)localObject).get(".sysmsg.RedPoints.redPoint.path"), "");
        i = bo.ank(bo.bc((String)((Map)localObject).get(".sysmsg.RedPoints.redPoint.redPointId"), ""));
        bo.ank(bo.bc((String)((Map)localObject).get(".sysmsg.RedPoints.redPoint.mustClearInSameTime"), ""));
        if (bo.isNullOrNil(parama))
        {
          AppMethodBeat.o(126826);
        }
        else if (parama.equals("my_setting_privaty_recentOption"))
        {
          if (((Integer)g.RP().Ry().get(ac.a.xQF, Integer.valueOf(0))).intValue() >= i)
          {
            AppMethodBeat.o(126826);
          }
          else
          {
            g.RP().Ry().set(ac.a.xQF, Integer.valueOf(i));
            g.RP().Ry().set(ac.a.xQG, Integer.valueOf(i));
            g.RP().Ry().set(ac.a.xQI, Integer.valueOf(i));
            g.RP().Ry().set(ac.a.xQK, Integer.valueOf(i));
            g.RP().Ry().set(ac.a.xQM, Integer.valueOf(i));
            com.tencent.mm.x.c.PK().y(266260, true);
            AppMethodBeat.o(126826);
          }
        }
        else
        {
          if (!parama.equals("my_setting_plugin_switch"))
            break label420;
          parama = bo.bc((String)((Map)localObject).get(".sysmsg.RedPoints.redPoint.ext"), "");
          if (bo.isNullOrNil(parama))
          {
            AppMethodBeat.o(126826);
          }
          else
          {
            if (((Integer)g.RP().Ry().get(ac.a.xRI, Integer.valueOf(0))).intValue() < i)
              break;
            AppMethodBeat.o(126826);
          }
        }
      }
    }
    g.RP().Ry().set(ac.a.xRI, Integer.valueOf(i));
    Object localObject = (String)g.RP().Ry().get(ac.a.xRJ, "");
    if (!bo.isNullOrNil((String)localObject))
      parama = parama.concat(",").concat((String)localObject);
    while (true)
    {
      g.RP().Ry().set(ac.a.xRJ, parama);
      com.tencent.mm.x.c.PK().y(262158, true);
      label420: AppMethodBeat.o(126826);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c.2
 * JD-Core Version:    0.6.2
 */