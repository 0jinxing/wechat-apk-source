package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
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
import com.tencent.mm.protocal.protobuf.agn;
import com.tencent.mm.protocal.protobuf.ago;
import com.tencent.mm.protocal.protobuf.nx;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;
  public int kee;
  public String kef;
  public int keg;
  public String keh;

  public ab(LinkedList<nx> paramLinkedList, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2)
  {
    AppMethodBeat.i(87898);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agn();
    ((b.a)localObject).fsK = new ago();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardlistfromapp";
    ((b.a)localObject).fsI = 690;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (agn)this.ehh.fsG.fsP;
    ((agn)localObject).vBz = paramLinkedList;
    ((agn)localObject).cME = paramInt1;
    ((agn)localObject).kKO = paramString1;
    ((agn)localObject).sign = paramString2;
    ((agn)localObject).vBv = paramString3;
    ((agn)localObject).vBu = paramString4;
    ((agn)localObject).wni = paramString5;
    ((agn)localObject).vBw = paramInt2;
    AppMethodBeat.o(87898);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87899);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87899);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87900);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3 + " netType = 690");
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kdS = ((ago)this.ehh.fsH.fsP).kdS;
      if (!TextUtils.isEmpty(this.kdS))
        break label105;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87900);
      return;
      try
      {
        label105: paramq = new org/json/JSONObject;
        paramq.<init>(this.kdS);
        this.kee = paramq.optInt("accept_button_status", 0);
        this.kef = paramq.optString("accept_button_wording");
        this.keg = paramq.optInt("private_status", 0);
        this.keh = paramq.optString("private_wording");
      }
      catch (JSONException paramq)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", paramq, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + paramq.getMessage());
      }
    }
  }

  public final int getType()
  {
    return 690;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ab
 * JD-Core Version:    0.6.2
 */