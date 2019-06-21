package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bfx;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends m
  implements k
{
  private b ehh;
  private f ehi;
  public int kCl;
  public String kCm;
  public bfy tQi;
  public String tQj;
  public String tQk;
  public String tQl;

  public d(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(48059);
    this.kCl = 0;
    this.kCm = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfx();
    ((b.a)localObject).fsK = new bfy();
    ((b.a)localObject).fsI = 1985;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bfx)this.ehh.fsG.fsP;
    ((bfx)localObject).vKZ = paramString1;
    ((bfx)localObject).vLa = paramString2;
    this.ehh.ftb = true;
    ((bfx)localObject).wJM = 0;
    ((bfx)localObject).cHF = paramInt;
    ((bfx)localObject).wJJ = true;
    ab.i("MicroMsg.NetSceneOpenECard", "create NetSceneOpenECard with reuse exist card, cardType: %s, reqSerial: %s, openScene: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    AppMethodBeat.o(48059);
  }

  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, boolean paramBoolean, int paramInt2, String paramString6)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, paramBoolean, false, paramInt2, paramString6);
  }

  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, String paramString6)
  {
    AppMethodBeat.i(48058);
    this.kCl = 0;
    this.kCm = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfx();
    ((b.a)localObject).fsK = new bfy();
    ((b.a)localObject).fsI = 1985;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bfx)this.ehh.fsG.fsP;
    ((bfx)localObject).vKZ = paramString1;
    ((bfx)localObject).vLa = paramString2;
    this.ehh.ftb = true;
    if (paramBoolean1)
    {
      ((bfx)localObject).wJK = paramString3;
      if (!paramBoolean2)
        break label277;
    }
    label277: for (((bfx)localObject).wJM = 1; ; ((bfx)localObject).wJM = 0)
    {
      ((bfx)localObject).tuk = paramString4;
      ((bfx)localObject).pbn = paramString5;
      ((bfx)localObject).cHF = paramInt1;
      ((bfx)localObject).wJJ = false;
      ((bfx)localObject).cME = paramInt2;
      ((bfx)localObject).wJN = paramString6;
      this.tQj = paramString3;
      this.tQk = paramString4;
      this.tQl = paramString5;
      ab.d("MicroMsg.NetSceneOpenECard", "cardNo: %s", new Object[] { paramString3 });
      ab.i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s, bankCardInfo: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), paramString4, paramString5, paramString6 });
      AppMethodBeat.o(48058);
      return;
      ((bfx)localObject).wJL = paramString3;
      break;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48061);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48061);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(48060);
    ab.i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tQi = ((bfy)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.tQi.kdT), this.tQi.kdU });
    if (!bo.isNullOrNil(this.tQi.wJH))
      ab.d("MicroMsg.NetSceneOpenECard", "rettext: %s", new Object[] { this.tQi.wJH });
    try
    {
      paramq = new org/json/JSONObject;
      paramq.<init>(this.tQi.wJH);
      this.kCl = paramq.optInt("retcode", 0);
      this.kCm = paramq.optString("retmsg", "");
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(48060);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneOpenECard", paramq, "", new Object[0]);
    }
  }

  public final int getType()
  {
    return 1985;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.d
 * JD-Core Version:    0.6.2
 */