package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apm;
import com.tencent.mm.protocal.protobuf.apn;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public b()
  {
    AppMethodBeat.i(16725);
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
    AppMethodBeat.o(16725);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16727);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16727);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16726);
    ab.d("MicroMsg.NetSceneGetUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      com.tencent.mm.plugin.address.a.a.arR().gIF = new com.tencent.mm.plugin.j.a.a();
      ab.i("MicroMsg.NetSceneGetUserAutoFillInfo", "return is 0.now we resetList and parse the json ..");
      paramq = (apn)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneGetUserAutoFillInfo", "resp json is.." + paramq.wty);
      if (paramq.wty != null)
        try
        {
          paramArrayOfByte = new org/json/JSONObject;
          paramArrayOfByte.<init>(paramq.wty);
          paramq = paramArrayOfByte.getJSONArray("user_data_list").getJSONObject(0).getJSONArray("group_info_list");
          if ((paramq != null) && (paramq.length() > 0))
          {
            int i = 0;
            paramInt1 = paramq.length();
            if (i < paramInt1)
            {
              while (true)
              {
                JSONObject localJSONObject;
                try
                {
                  localObject1 = paramq.getJSONObject(i);
                  paramArrayOfByte = new com/tencent/mm/plugin/j/a/b;
                  paramArrayOfByte.<init>();
                  paramArrayOfByte.nuH = ((JSONObject)localObject1).getInt("group_id");
                  paramArrayOfByte.nuQ = ((JSONObject)localObject1).getString("invoice_url");
                  Object localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>("get groupid:");
                  ab.i("MicroMsg.NetSceneGetUserAutoFillInfo", ((JSONObject)localObject1).getInt("group_id") + "get invoiceUrl:" + ((JSONObject)localObject1).getString("invoice_url"));
                  localObject1 = ((JSONObject)localObject1).getJSONArray("field_list");
                  if ((localObject1 == null) || (((JSONArray)localObject1).length() <= 0))
                    break label740;
                  int j = 0;
                  if (j >= ((JSONArray)localObject1).length())
                    break label740;
                  localJSONObject = ((JSONArray)localObject1).getJSONObject(j);
                  localObject2 = localJSONObject.getString("key");
                  paramInt1 = -1;
                  switch (((String)localObject2).hashCode())
                  {
                  default:
                    switch (paramInt1)
                    {
                    default:
                      j++;
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    }
                    break;
                  case 110371416:
                    if (!((String)localObject2).equals("title"))
                      continue;
                    paramInt1 = 0;
                    break;
                  case -192204195:
                    if (!((String)localObject2).equals("tax_number"))
                      continue;
                    paramInt1 = 1;
                    break;
                  case -1787383122:
                    if (!((String)localObject2).equals("bank_name"))
                      continue;
                    paramInt1 = 2;
                    break;
                  case 330208940:
                    if (!((String)localObject2).equals("bank_number"))
                      continue;
                    paramInt1 = 3;
                    break;
                  case 3575610:
                    if (!((String)localObject2).equals("type"))
                      continue;
                    paramInt1 = 4;
                    break;
                  case 96619420:
                    if (!((String)localObject2).equals("email"))
                      continue;
                    paramInt1 = 5;
                    break;
                  case 106642798:
                    if (!((String)localObject2).equals("phone"))
                      continue;
                    paramInt1 = 6;
                    break;
                  case 944498430:
                    if (!((String)localObject2).equals("company_address_detail"))
                      continue;
                    paramInt1 = 7;
                    continue;
                    paramArrayOfByte.title = localJSONObject.getString("value");
                    continue;
                  }
                }
                catch (JSONException paramArrayOfByte)
                {
                  ab.e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no.".concat(String.valueOf(i)));
                  i++;
                }
                break;
                paramArrayOfByte.nuJ = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.nuL = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.nuK = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.type = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.dtV = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.nuN = localJSONObject.getString("value");
                paramArrayOfByte.nuO = localJSONObject.getString("value");
                continue;
                paramArrayOfByte.nuP = localJSONObject.getString("value");
              }
              label740: Object localObject1 = com.tencent.mm.plugin.address.a.a.arR();
              if ((paramArrayOfByte.type != null) && (paramArrayOfByte.type.equals("0")))
              {
                paramArrayOfByte.nuI = "";
                paramArrayOfByte.nuO = "";
                paramArrayOfByte.dtV = "";
                ((com.tencent.mm.plugin.address.b.a.a)localObject1).gIF.nuG.add(paramArrayOfByte);
              }
              while (true)
              {
                ab.i("MicroMsg.InvoiceMgr", "type is error..");
                break;
                if ((paramArrayOfByte.type != null) && (paramArrayOfByte.type.equals("1")))
                {
                  paramArrayOfByte.nuI = paramArrayOfByte.title;
                  paramArrayOfByte.title = "";
                  paramArrayOfByte.nuN = "";
                  paramArrayOfByte.nuJ = "";
                  paramArrayOfByte.nuK = "";
                  paramArrayOfByte.nuL = "";
                  paramArrayOfByte.nuP = "";
                  ((com.tencent.mm.plugin.address.b.a.a)localObject1).gIF.nuG.add(paramArrayOfByte);
                }
              }
            }
          }
        }
        catch (JSONException paramq)
        {
          ab.e("MicroMsg.NetSceneGetUserAutoFillInfo", "error parse this json");
        }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16726);
  }

  public final int getType()
  {
    return 1191;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.b
 * JD-Core Version:    0.6.2
 */