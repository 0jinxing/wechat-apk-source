package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apm;
import com.tencent.mm.protocal.protobuf.apn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;

  public g()
  {
    AppMethodBeat.i(126851);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new apm();
    ((b.a)localObject).fsK = new apn();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
    ((b.a)localObject).fsI = 1191;
    this.ehh = ((b.a)localObject).acD();
    localObject = (apm)this.ehh.fsG.fsP;
    ((apm)localObject).cvd = 2;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("invoice_info.title");
    localLinkedList.add("invoice_info.tax_number");
    localLinkedList.add("invoice_info.bank_number");
    localLinkedList.add("invoice_info.bank_name");
    localLinkedList.add("invoice_info.type");
    localLinkedList.add("invoice_info.email");
    localLinkedList.add("invoice_info.company_address");
    localLinkedList.add("invoice_info.company_address_detail");
    localLinkedList.add("invoice_info.company_address_postcode");
    localLinkedList.add("invoice_info.phone");
    ((apm)localObject).wtx = localLinkedList;
    ((apm)localObject).wtw = false;
    AppMethodBeat.o(126851);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(126853);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(126853);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126852);
    ab.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we parse the json and resetList..");
      paramArrayOfByte = (apn)((b)paramq).fsH.fsP;
      if (paramArrayOfByte.wty == null);
    }
    try
    {
      paramq = new org/json/JSONObject;
      paramq.<init>(paramArrayOfByte.wty);
      boolean bool = paramq.getBoolean("has_invoice_info");
      ab.i("MicroMsg.NetSceneGetUserAutoFillInfo", "has_invoice_info is ..".concat(String.valueOf(bool)));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xQQ, Boolean.valueOf(bool));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(126852);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
        ab.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
    }
  }

  public final int getType()
  {
    return 1191;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.g
 * JD-Core Version:    0.6.2
 */