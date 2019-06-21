package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.h;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j extends m
{
  public int tqB;
  public String tqC;
  public int tqD;
  public String tqE;
  public String tqF;
  public String tqG;

  public j()
  {
    AppMethodBeat.i(46184);
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceid", q.getDeviceID(ah.getContext()));
    M(localHashMap);
    AppMethodBeat.o(46184);
  }

  public static boolean bxX()
  {
    AppMethodBeat.i(46187);
    g.RQ();
    long l = ((Long)g.RP().Ry().get(ac.a.xNw, Long.valueOf(0L))).longValue();
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xNx, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.NetSceneTenpayPayManager", "check isExpire %s %s %s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Long.valueOf(i + l) });
    boolean bool;
    if (l > 0L)
      if (new Date().getTime() / 1000L > l + i)
      {
        AppMethodBeat.o(46187);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(46187);
      bool = false;
      continue;
      AppMethodBeat.o(46187);
      bool = true;
    }
  }

  private static boolean isNumeric(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(46188);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(46188);
    while (true)
    {
      return bool;
      int i = paramString.length();
      int j;
      do
      {
        i--;
        if (i < 0)
        {
          bool = true;
          AppMethodBeat.o(46188);
          break;
        }
        j = paramString.charAt(i);
      }
      while ((j >= 48) && (j <= 57));
      AppMethodBeat.o(46188);
    }
  }

  private static ad k(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(46186);
    ad localad = new ad();
    localad.field_is_show = paramJSONObject.optInt("show_label", 0);
    localad.field_pref_key = paramString;
    localad.field_pref_title = paramJSONObject.optString("title");
    localad.field_pref_desc = paramJSONObject.optString("desc");
    localad.field_logo_url = paramJSONObject.optString("logo_url");
    localad.field_jump_type = paramJSONObject.optInt("jump_type");
    localad.field_pref_url = paramJSONObject.optString("jump_h5_url");
    localad.field_tinyapp_username = paramJSONObject.optString("tinyapp_username");
    localad.field_tinyapp_path = paramJSONObject.optString("tinyapp_path");
    AppMethodBeat.o(46186);
    return localad;
  }

  public final int ZU()
  {
    return 1654;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46185);
    ab.i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + paramInt + ";errMsg:" + paramString);
    ab.d("MicroMsg.NetSceneTenpayPayManager", "json: %s", new Object[] { paramJSONObject.toString() });
    label115: String str;
    if (paramInt == 0)
    {
      paramString = paramJSONObject.optString("is_show_deduct", "0");
      if (!isNumeric(paramString))
        break label608;
      this.tqB = Integer.valueOf(paramString).intValue();
      this.tqC = paramJSONObject.optString("deduct_show_url", "");
      paramString = paramJSONObject.optString("deduct_cache_time", "");
      if (!isNumeric(paramString))
        break label614;
      this.tqD = Integer.valueOf(paramString).intValue();
      this.tqE = paramJSONObject.optString("deduct_title", "");
      this.tqF = paramJSONObject.optString("realname_url", "");
      this.tqG = paramJSONObject.optString("forget_pwd_url", "");
      paramString = paramJSONObject.optString("payway_select_wording", "");
      str = paramJSONObject.optString("payway_change_wording", "");
      Object localObject = new ad();
      ((ad)localObject).field_is_show = this.tqB;
      ((ad)localObject).field_pref_key = "wallet_open_auto_pay";
      ((ad)localObject).field_pref_title = this.tqE;
      ((ad)localObject).field_pref_url = this.tqC;
      r.cPH().acP("wallet_open_auto_pay");
      ab.i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s forget_pwd_url %s", new Object[] { Integer.valueOf(this.tqD), this.tqG });
      r.cPH().b((c)localObject);
      localObject = paramJSONObject.optJSONObject("switch_wallet");
      if (localObject != null)
      {
        localObject = k((JSONObject)localObject, "wallet_switch_currency");
        r.cPH().acP("wallet_switch_currency");
        r.cPH().b((c)localObject);
      }
      localObject = paramJSONObject.optJSONObject("im_mch");
      if (localObject != null)
      {
        localObject = k((JSONObject)localObject, "wallet_im_mch");
        r.cPH().acP("wallet_im_mch");
        r.cPH().b((c)localObject);
      }
      localObject = paramJSONObject.optJSONObject("unreg_info");
      if (localObject == null)
        break label621;
      paramJSONObject = ((JSONObject)localObject).optString("unreg_title", "");
      localObject = ((JSONObject)localObject).optString("unreg_url", "");
      g.RQ();
      g.RP().Ry().set(ac.a.xTp, paramJSONObject);
      g.RQ();
      g.RP().Ry().set(ac.a.xTq, localObject);
    }
    while (true)
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xNw, Long.valueOf(new Date().getTime() / 1000L));
      g.RQ();
      g.RP().Ry().set(ac.a.xNx, Integer.valueOf(this.tqD));
      g.RQ();
      g.RP().Ry().set(ac.a.xND, this.tqF);
      g.RQ();
      g.RP().Ry().set(ac.a.xNM, this.tqG);
      if (!bo.isNullOrNil(paramString))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xNK, paramString);
      }
      if (!bo.isNullOrNil(str))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xNL, str);
      }
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(46185);
      return;
      label608: paramString = "0";
      break;
      label614: paramString = "84600";
      break label115;
      label621: g.RQ();
      g.RP().Ry().set(ac.a.xTp, "");
      g.RQ();
      g.RP().Ry().set(ac.a.xTq, "");
    }
  }

  public final int bgI()
  {
    return 0;
  }

  public final int cOo()
  {
    return 100000;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/paymanage";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.j
 * JD-Core Version:    0.6.2
 */