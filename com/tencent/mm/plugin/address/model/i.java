package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.asa;
import com.tencent.mm.protocal.protobuf.bty;
import com.tencent.mm.protocal.protobuf.btz;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class i extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public btz gIL;

  public i(com.tencent.mm.plugin.j.a.b paramb)
  {
    AppMethodBeat.i(16746);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bty();
    ((b.a)localObject).fsK = new btz();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
    ((b.a)localObject).fsI = 1180;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bty)this.ehh.fsG.fsP;
    ((bty)localObject).cvd = 2;
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder("{\"user_uin\":");
    aw.ZK();
    localStringBuilder1.append(c.QF() + " ,\"user_data_list\": [");
    if (paramb.type.equals("0"))
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.nuH + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.title + "\"},{\"key\": \"tax_number\",\"value\": \"" + paramb.nuJ + "\"},{\"key\": \"bank_number\",\"value\": \"" + paramb.nuK + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.nuN + "\"},{\"key\": \"company_address_detail\",\"value\": \"" + paramb.nuP + "\"},{\"key\": \"bank_name\",\"value\": \"" + paramb.nuL + "\"}]}}");
    while (true)
    {
      localStringBuilder1.append("]}");
      ((bty)localObject).wty = localStringBuilder1.toString();
      AppMethodBeat.o(16746);
      return;
      localStringBuilder1.append("{\"group_key\": \"invoice_info\",\"group_info\": {\"group_id\": " + paramb.nuH + ",\"field_list\": [{\"key\": \"type\",\"value\": \"" + paramb.type + "\"},{\"key\": \"title\",\"value\": \"" + paramb.nuI + "\"},{\"key\": \"phone\",\"value\": \"" + paramb.nuO + "\"},{\"key\": \"email\",\"value\": \"" + paramb.dtV + "\"}]}}");
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16748);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16748);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16747);
    ab.d("MicroMsg.NetSceneSaveUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.gIL = ((btz)((com.tencent.mm.ai.b)paramq).fsH.fsP);
      if ((this.gIL != null) && (this.gIL.wVS != null) && (this.gIL.wVS.size() > 0) && (this.gIL.wVS.get(0) != null))
        ab.i("MicroMsg.NetSceneSaveUserAutoFillInfo", "resp groupId is.." + ((asa)this.gIL.wVS.get(0)).wcR);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16747);
  }

  public final int getType()
  {
    return 1180;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.i
 * JD-Core Version:    0.6.2
 */