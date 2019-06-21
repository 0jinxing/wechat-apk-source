package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ban;
import com.tencent.mm.protocal.protobuf.bao;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  public String kbH;
  public int kbI;
  public String kbJ;
  public int kbK;
  public String kbL;
  public String kfB;

  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(88030);
    this.kbI = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ban();
    ((b.a)localObject).fsK = new bao();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/marksharecard";
    ((b.a)localObject).fsI = 907;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ban)this.ehh.fsG.fsP;
    ((ban)localObject).cMC = paramString;
    ((ban)localObject).wEk = paramInt2;
    ((ban)localObject).wEj = paramInt1;
    ((ban)localObject).scene = paramInt3;
    this.kfB = paramString;
    AppMethodBeat.o(88030);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(88032);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88032);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88031);
    ab.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(907), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bao)this.ehh.fsH.fsP;
      ab.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + paramq.kdS);
      paramq = paramq.kdS;
      if (!TextUtils.isEmpty(paramq))
        break label129;
      ab.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(88031);
      return;
      try
      {
        label129: paramArrayOfByte = new org/json/JSONObject;
        paramArrayOfByte.<init>(paramq);
        this.kbH = paramArrayOfByte.optString("mark_user");
        this.kbI = paramArrayOfByte.optInt("mark_succ", 0);
        this.kbJ = paramArrayOfByte.optString("mark_card_id");
        this.kbK = paramArrayOfByte.optInt("expire_time", 0);
        this.kbL = paramArrayOfByte.optString("pay_qrcode_wording");
      }
      catch (JSONException paramq)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", paramq, "", new Object[0]);
      }
    }
  }

  public final int getType()
  {
    return 907;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.f
 * JD-Core Version:    0.6.2
 */