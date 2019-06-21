package com.tencent.mm.plugin.luckymoney.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class an extends ak
{
  public String cRS;
  long cvx;
  public String nSX;
  public RealnameGuideHelper nTN;
  public String nYA;
  public int nYB;
  public LuckyMoneyEmojiSwitch nYC;
  public String nYV;
  public int nYW;
  public k nYn;
  public String talker;

  public an(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(42413);
    this.nYn = null;
    this.nYW = 0;
    this.nSX = paramString1;
    this.cRS = paramString2;
    this.talker = paramString5;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", String.valueOf(paramInt1));
    localHashMap.put("channelId", String.valueOf(paramInt2));
    localHashMap.put("sendId", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    if (!bo.isNullOrNil(paramString3))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
      localHashMap.put("nickName", URLEncoder.encode(bo.nullAsNil(paramString4)));
    }
    localHashMap.put("sessionUserName", paramString5);
    localHashMap.put("ver", paramString6);
    localHashMap.put("timingIdentifier", paramString7);
    M(localHashMap);
    AppMethodBeat.o(42413);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42414);
    try
    {
      this.nYn = v.W(paramJSONObject);
      this.nYC = LuckyMoneyEmojiSwitch.V(paramJSONObject);
      ab.i("NetSceneLuckyMoneyDetail", "luckyMoneyEmojiSwitch:%s", new Object[] { this.nYC.toString() });
      this.nYA = paramJSONObject.optString("expression_md5");
      this.nYB = paramJSONObject.optInt("expression_type");
      ab.i("NetSceneLuckyMoneyDetail", "expressionmd5:%s expressiontype:%s", new Object[] { this.nYA, Integer.valueOf(this.nYB) });
      String str3;
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          String str1 = ((JSONObject)localObject).optString("guide_flag");
          String str2 = ((JSONObject)localObject).optString("guide_wording");
          paramString = ((JSONObject)localObject).optString("left_button_wording");
          str3 = ((JSONObject)localObject).optString("right_button_wording");
          String str4 = ((JSONObject)localObject).optString("upload_credit_url");
          localObject = new com/tencent/mm/plugin/wallet_core/id_verify/util/RealnameGuideHelper;
          ((RealnameGuideHelper)localObject).<init>();
          this.nTN = ((RealnameGuideHelper)localObject);
          this.nTN.a(str1, str2, paramString, str3, str4, 1003);
        }
      }
      this.nYV = paramJSONObject.optString("SystemMsgContext");
      this.nYW = paramJSONObject.optInt("showYearExpression");
      ab.i("NetSceneLuckyMoneyDetail", "showYearExpression:%s", new Object[] { Integer.valueOf(this.nYW) });
      if ((paramInt == 0) && (!bo.isNullOrNil(this.nYV)))
      {
        boolean bool = bo.isNullOrNil(this.nYn.nXl);
        if (bool);
      }
      try
      {
        if (r.Yz().equals(this.nYn.nXl));
        for (paramString = ah.getContext().getString(2131301205); ; paramString = ((b)g.K(b.class)).mJ(this.nYn.nXl))
        {
          str3 = this.nYV;
          paramJSONObject = new java/lang/StringBuilder;
          paramJSONObject.<init>("$");
          this.nYV = str3.replace(this.nYn.nXl + "$", paramString);
          x.eV(this.nYV, this.talker);
          g.RQ();
          paramInt = ((Integer)g.RP().Ry().get(ac.a.xWQ, Integer.valueOf(0))).intValue();
          int i = ((a)g.K(a.class)).a(a.a.lIS, 0);
          if ((bo.gW(paramInt, 1)) || (bo.gW(i, 1)))
          {
            if (this.nYC == null)
            {
              paramString = new com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEmojiSwitch;
              paramString.<init>();
              this.nYC = paramString;
            }
            this.nYC.nXp = 1;
            this.nYC.nXq = 1;
            this.nYC.nXr = 1;
            this.nYC.nXs = 1;
            this.nYW = 1;
          }
          ab.i("NetSceneLuckyMoneyDetail", "localSwitch() luckyMoneyEmojiSwitch:%s ", new Object[] { this.nYC.toString() });
          AppMethodBeat.o(42414);
          return;
        }
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e("NetSceneLuckyMoneyDetail", "insertLocalSysMsgIfNeed error: %s", new Object[] { paramString.getMessage() });
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.w("NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
        AppMethodBeat.o(42414);
      }
    }
  }

  public final String bgF()
  {
    return "/cgi-bin/mmpay-bin/openwxhb";
  }

  public final int getType()
  {
    return 1685;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.an
 * JD-Core Version:    0.6.2
 */