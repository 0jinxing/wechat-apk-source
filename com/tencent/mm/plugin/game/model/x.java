package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ds;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class x
{
  public static c a(e parame)
  {
    c localc = null;
    AppMethodBeat.i(111358);
    if (parame == null)
    {
      ab.e("MicroMsg.GamePBData", "Invalid pb object");
      AppMethodBeat.o(111358);
      parame = localc;
    }
    while (true)
    {
      return parame;
      if (bo.isNullOrNil(parame.mZr))
      {
        ab.e("MicroMsg.GamePBData", "No AppID field, abort");
        AppMethodBeat.o(111358);
        parame = localc;
      }
      else
      {
        ab.i("MicroMsg.GamePBData", "Parsing AppID: %s", new Object[] { parame.mZr });
        localc = new c();
        localc.field_appId = parame.mZr;
        localc.field_appName = parame.Name;
        localc.field_appIconUrl = parame.mZs;
        localc.field_appType = ",1,";
        localc.field_packageName = parame.mZu;
        localc.field_appVersion = parame.Version;
        localc.field_appInfoFlag = parame.mZx;
        if (parame.mZw != null)
        {
          localc.ih(parame.mZw.nac);
          localc.ik(parame.mZw.nad);
          localc.hq(parame.mZw.nag);
          localc.il(parame.mZw.nae);
          localc.mVD = parame.mZw.nai;
          localc.mVE = parame.mZw.nah;
          localc.cBA = parame.mZw.naj;
        }
        if ((parame.mZw != null) && (parame.mZw.naf != null))
        {
          localc.iq(parame.mZw.naf.nac);
          localc.ir(parame.mZw.naf.ndR);
          localc.io(parame.mZw.naf.ndS);
          localc.ip(parame.mZw.naf.ndT);
          localc.hr(parame.mZw.naf.ndV);
        }
        localc.mVk = parame.Desc;
        localc.mVj = parame.mZt;
        localc.status = parame.jBT;
        localc.mVm = parame.mZm;
        localc.versionCode = parame.mZv;
        localc.ctu = parame.mZo;
        localc.mVo = parame.mZy;
        localc.mVw = parame.mZD;
        if ((parame.mZw != null) && (parame.mZw.naf != null))
        {
          localc.mVp = parame.mZw.naf.ndU;
          localc.mVq = parame.mZw.naf.ndW;
          localc.mVr = parame.mZw.naf.ndX;
        }
        localc.egi = parame.mZF;
        localc.mVF = parame.mZG;
        AppMethodBeat.o(111358);
        parame = localc;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.x
 * JD-Core Version:    0.6.2
 */