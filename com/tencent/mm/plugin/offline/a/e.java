package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.bez;
import com.tencent.mm.protocal.protobuf.bfa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.u;
import org.json.JSONObject;

public final class e extends u
{
  private final b ehh;
  private f ehi;
  public int kCl;
  private String kCm;
  public String oXY;
  public int oXZ;
  public String oYa;
  public int oYb;
  public RealnameGuideHelper oYc;
  private String oYd;
  private String oYe;
  private String oYf;
  private String oYg;
  private String oYh;

  public e(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(43390);
    this.oXY = "";
    this.kCl = -1;
    this.kCm = "";
    this.oXZ = -1;
    this.oYa = "";
    this.oYb = 1;
    b.a locala = new b.a();
    locala.fsJ = new bez();
    locala.fsK = new bfa();
    locala.uri = "/cgi-bin/mmpay-bin/offlinepayconfirm";
    locala.fsI = 609;
    locala.fsL = 0;
    locala.fsM = 0;
    locala.fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString3);
    this.ehh = locala.acD();
    paramString3 = (bez)this.ehh.fsG.fsP;
    paramString3.wIU = paramInt;
    paramString3.Id = paramString1;
    paramString3.guu = paramString2;
    paramString3.vRP = k.cPy();
    this.oYb = paramInt;
    AppMethodBeat.o(43390);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(43391);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43391);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(43392);
    if (paramInt1 != 0)
      ab.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609, errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    bfa localbfa = (bfa)((b)paramq).fsH.fsP;
    int i = paramInt1;
    int j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
      }
    }
    try
    {
      if (localbfa.wqA != null)
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(localbfa.wqA);
        this.oXY = localJSONObject.optString("transaction_id");
        this.kCl = localJSONObject.optInt("retcode");
        this.kCm = localJSONObject.optString("retmsg");
        this.oXZ = localJSONObject.optInt("wx_error_type");
        this.oYa = localJSONObject.optString("wx_error_msg");
        ab.d("MicroMsg.NetSceneOfflinePayConfirm", "onGYNetEnd %s", new Object[] { localJSONObject.toString() });
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
        if (localJSONObject.has("real_name_info"))
        {
          paramq = localJSONObject.optJSONObject("real_name_info");
          this.oYd = paramq.optString("guide_flag");
          this.oYe = paramq.optString("guide_wording");
          this.oYf = paramq.optString("left_button_wording");
          this.oYg = paramq.optString("right_button_wording");
          this.oYh = paramq.optString("upload_credit_url");
          if (!"1".equals(this.oYd))
          {
            i = paramInt1;
            j = paramInt2;
            paramq = paramString;
            if (!"2".equals(this.oYd));
          }
          else
          {
            paramq = new com/tencent/mm/plugin/wallet_core/id_verify/util/RealnameGuideHelper;
            paramq.<init>();
            this.oYc = paramq;
            this.oYc.a(this.oYd, this.oYe, this.oYf, this.oYg, this.oYh, 0);
            paramq = paramString;
            j = paramInt2;
            i = paramInt1;
          }
        }
      }
      if (this.ehi != null)
        this.ehi.onSceneEnd(i, j, paramq, this);
      AppMethodBeat.o(43392);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ah.getContext().getString(2131304763);
      }
    }
  }

  public final int getType()
  {
    return 609;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.e
 * JD-Core Version:    0.6.2
 */