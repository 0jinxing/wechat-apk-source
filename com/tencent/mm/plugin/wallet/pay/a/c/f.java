package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.w;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class f extends m
{
  public String aIm;
  private int cIf;
  public String cRb;
  public String cRc;
  public String cRd;
  public String cRe;
  public String cRf;
  public Orders pWy;
  private int scene;
  private String tos;
  public int tot;
  public com.tencent.mm.plugin.wallet.pay.a.d tou;

  public f(PayInfo paramPayInfo, int paramInt)
  {
    AppMethodBeat.i(45938);
    this.pWy = null;
    this.tos = null;
    this.tot = 0;
    this.tou = null;
    this.scene = 0;
    this.cIf = 0;
    HashMap localHashMap1;
    HashMap localHashMap2;
    if (paramPayInfo == null)
    {
      ab.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "error payinfo is null %s", new Object[] { bo.dpG().toString() });
      this.tos = "";
      this.scene = paramInt;
      localHashMap1 = new HashMap();
      localHashMap2 = new HashMap();
      localHashMap1.put("support_cardtag3", "1");
      localHashMap1.put("req_key", this.tos);
      localHashMap1.put("bind_query_scene", String.valueOf(paramInt));
      localHashMap1.put("is_merge", "1");
      Object localObject = (l)g.K(l.class);
      localHashMap1.put("is_root", "0");
      if ((localObject == null) || ((!((l)localObject).bxo()) && (!((l)localObject).bxB())))
        break label273;
      localHashMap1.put("is_device_open_touch", "1");
      localObject = ((l)localObject).bxw();
      if (localObject != null)
        localHashMap1.putAll((Map)localObject);
      ab.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is true");
    }
    while (true)
    {
      if (paramPayInfo != null)
        this.cIf = paramPayInfo.cIf;
      a(paramPayInfo, localHashMap1, localHashMap2);
      M(localHashMap1);
      ba(localHashMap2);
      AppMethodBeat.o(45938);
      return;
      this.tos = paramPayInfo.czZ;
      break;
      label273: localHashMap1.put("is_device_open_touch", "0");
      ab.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is false");
    }
  }

  public int ZU()
  {
    return 1593;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45940);
    try
    {
      this.aIm = paramString;
      this.pWy = Orders.ap(paramJSONObject);
      if (this.pWy != null)
        this.pWy.czZ = this.tos;
      long l = paramJSONObject.optJSONObject("bindqueryresp").optLong("time_stamp");
      if (l > 0L)
        w.setTimeStamp(String.valueOf(l));
      while (true)
      {
        paramString = paramJSONObject.optJSONObject("query_order_info");
        if (paramString != null)
        {
          ab.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "get query_order_info");
          r.cPI().tDe = (paramString.optInt("query_order_time", 5) * 1000);
          r.cPI().mRetryCount = paramString.optInt("query_order_count", 0);
          r.cPI().tDf = paramString.optString("default_query_order_wording", "");
        }
        paramString = paramJSONObject.optString("pay_remind_wording");
        r.cPI().tDg = paramString;
        af.a(paramJSONObject.optJSONObject("bindqueryresp"), this.cIf, false);
        paramString = (l)g.K(l.class);
        if (paramString == null)
          break label487;
        ab.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is not null");
        paramString.bxp();
        paramInt = r.cPI().cQm();
        if (paramInt != 0)
          break label415;
        if (!paramString.bxn())
          break;
        paramString.hq(r.cPI().cQk());
        paramString.hr(false);
        if (paramJSONObject.has("real_name_info"))
        {
          paramString = paramJSONObject.optJSONObject("real_name_info");
          this.cRb = paramString.optString("guide_flag");
          this.cRc = paramString.optString("guide_wording");
          this.cRd = paramString.optString("left_button_wording");
          this.cRe = paramString.optString("right_button_wording");
          this.cRf = paramString.optString("upload_credit_url");
          this.tot = paramString.optInt("guide_type", 0);
        }
        if (paramJSONObject.has("user_notify_info"))
        {
          paramString = paramJSONObject.optJSONObject("user_notify_info");
          if (paramString != null)
            break label498;
          paramString = null;
          this.tou = paramString;
        }
        AppMethodBeat.o(45940);
        return;
        ab.w("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "no time_stamp in qrcodeusebindquery.");
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "hy: " + paramString.toString());
        AppMethodBeat.o(45940);
        continue;
        if (paramString.bxA())
        {
          paramString.hr(r.cPI().cQk());
          paramString.hq(false);
          continue;
          label415: if ((paramInt == 1) && (paramString.bxn()))
          {
            paramString.hq(r.cPI().cQk());
            paramString.hr(false);
          }
          else if ((paramInt == 2) && (paramString.bxA()))
          {
            paramString.hr(r.cPI().cQk());
            paramString.hq(false);
            continue;
            label487: ab.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is null");
            continue;
            label498: paramInt = paramString.optInt("notify_flag", 0);
            String str1 = paramString.optString("notify_wording", "");
            String str2 = paramString.optString("left_button_wording", "");
            paramJSONObject = paramString.optString("right_button_wording", "");
            String str3 = paramString.optString("confirm_button_wording", "");
            if (paramInt == 0)
            {
              paramString = null;
            }
            else
            {
              paramString = new com/tencent/mm/plugin/wallet/pay/a/d;
              paramString.<init>();
              paramString.tob = paramInt;
              paramString.toc = str1;
              paramString.nZb = str2;
              paramString.nZc = paramJSONObject;
              paramString.tod = str3;
            }
          }
        }
      }
    }
  }

  public final void a(com.tencent.mm.wallet_core.c.d paramd, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(45939);
    super.a(paramd, paramJSONObject);
    int i = this.cIf;
    paramJSONObject = this.tos;
    int j = paramd.errCode;
    ab.v("Micromsg.WalletPayLinkReport", "kvQrcode scene %s reqKey %s errcode %s", new Object[] { Integer.valueOf(i), paramJSONObject, Integer.valueOf(j) });
    h.pYm.e(15000, new Object[] { Integer.valueOf(i), paramJSONObject, Integer.valueOf(j) });
    AppMethodBeat.o(45939);
  }

  public final int bgI()
  {
    return 112;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/qrcodeusebindquery";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.a.c.f
 * JD-Core Version:    0.6.2
 */