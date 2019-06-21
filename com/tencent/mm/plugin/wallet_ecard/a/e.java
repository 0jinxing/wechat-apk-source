package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bfv;
import com.tencent.mm.protocal.protobuf.bfw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends m
  implements k
{
  private b ehh;
  private f ehi;
  public int kCl;
  public String kCm;
  public bfw tQm;
  public String token;

  public e(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(48062);
    this.kCl = 0;
    this.kCm = "";
    this.token = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfv();
    ((b.a)localObject).fsK = new bfw();
    ((b.a)localObject).fsI = 1958;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecardauth";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bfv)this.ehh.fsG.fsP;
    ((bfv)localObject).vKZ = paramString1;
    ((bfv)localObject).wJG = paramString2;
    ((bfv)localObject).cHF = paramInt;
    ((bfv)localObject).token = paramString3;
    this.token = null;
    ab.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d, token: %s, wxp_passwd_enc==null: %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString3, Boolean.valueOf(bo.isNullOrNil(paramString2)) });
    ab.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    AppMethodBeat.o(48062);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(48064);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48064);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(48063);
    ab.i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tQm = ((bfw)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s, is_token_invalid: %s", new Object[] { Integer.valueOf(this.tQm.kdT), this.tQm.kdU, Boolean.valueOf(this.tQm.wJI) });
    if (!bo.isNullOrNil(this.tQm.wJH))
      ab.d("MicroMsg.NetSceneOpenECardAuth", "rettext: %s", new Object[] { this.tQm.wJH });
    try
    {
      paramq = new org/json/JSONObject;
      paramq.<init>(this.tQm.wJH);
      this.kCl = paramq.optInt("retcode", 0);
      this.kCm = paramq.optString("retmsg", "");
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(48063);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneOpenECardAuth", paramq, "", new Object[0]);
    }
  }

  public final int getType()
  {
    return 1958;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.e
 * JD-Core Version:    0.6.2
 */