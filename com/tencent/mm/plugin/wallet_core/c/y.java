package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.wallet_core.c.w;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class y extends m
{
  public String cRb;
  public String cRc;
  public String cRd;
  public String cRe;
  public String cRf;
  public String cRg;
  public int cRh;
  public String cRi;
  public String cRj;
  public String cRk;
  public String cRl;
  public LinkedList<String> cRm;
  public ECardInfo cRn;
  public Map<String, String> oYG;
  public int scene;
  public String subtitle;
  public String title;
  public Map<String, String> toe;
  public h tuw;

  public y()
  {
    this(null, 0);
  }

  public y(String paramString, int paramInt)
  {
    AppMethodBeat.i(46547);
    this.cRg = "";
    this.cRh = 0;
    this.cRi = "";
    this.cRj = "";
    this.cRk = "";
    this.cRl = "";
    this.subtitle = "";
    this.title = "";
    this.cRm = new LinkedList();
    this.scene = 0;
    this.oYG = new HashMap();
    this.scene = paramInt;
    this.oYG.put("req_key", paramString);
    this.oYG.put("bind_query_scene", String.valueOf(paramInt));
    paramString = (l)g.K(l.class);
    this.oYG.put("is_root", "0");
    if (paramString != null)
    {
      this.oYG.put("is_device_open_touch", "1");
      paramString = paramString.bxw();
      if (paramString != null)
        this.oYG.putAll(paramString);
      ab.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
    }
    while (true)
    {
      M(this.oYG);
      this.toe = new HashMap();
      g.RQ();
      paramString = (String)g.RP().Ry().get(196612, null);
      g.RQ();
      String str = (String)g.RP().Ry().get(196613, null);
      this.toe.put("bind_serial", paramString);
      this.toe.put("last_bind_serial", str);
      ba(this.toe);
      AppMethodBeat.o(46547);
      return;
      this.oYG.put("is_device_open_touch", "0");
      ab.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
    }
  }

  public int ZU()
  {
    return 1501;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46548);
    if (paramInt != 0)
    {
      AppMethodBeat.o(46548);
      return;
    }
    if (paramJSONObject.has("real_name_info"))
    {
      JSONObject localJSONObject = paramJSONObject.optJSONObject("real_name_info");
      ECardInfo.aw(localJSONObject);
      ab.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", new Object[] { localJSONObject.toString() });
      this.cRb = localJSONObject.optString("guide_flag");
      this.cRc = localJSONObject.optString("guide_wording");
      this.cRd = localJSONObject.optString("left_button_wording");
      this.cRe = localJSONObject.optString("right_button_wording");
      this.cRf = localJSONObject.optString("upload_credit_url");
      this.cRg = localJSONObject.optString("done_button_wording");
      this.cRh = localJSONObject.optInt("is_show_protocol", 0);
      this.cRi = localJSONObject.optString("left_protocol_wording");
      this.cRj = localJSONObject.optString("new_upload_credit_url");
      this.cRk = localJSONObject.optString("protocol_url");
      this.cRl = localJSONObject.optString("right_protocol_wording");
      this.subtitle = localJSONObject.optString("subtitle");
      this.title = localJSONObject.optString("title");
      paramString = localJSONObject.optJSONArray("upload_reasons");
      this.cRm.clear();
      if (paramString != null)
        for (paramInt = 0; paramInt < paramString.length(); paramInt++)
          this.cRm.add(paramString.optString(paramInt));
      if (localJSONObject.has("ecard_info"))
      {
        paramString = localJSONObject.optJSONObject("ecard_info");
        this.cRn = new ECardInfo();
        this.cRn.title = this.title;
        this.cRn.typ = new ArrayList(this.cRm);
        this.cRn.tyr = this.cRk;
        this.cRn.tys = this.cRi;
        this.cRn.tyt = this.cRl;
        this.cRn.tyq = this.cRg;
        this.cRn.jSu = paramString.optInt("ecard_open_scene", 0);
        this.cRn.cvQ = paramString.optString("ecard_type", "");
        this.cRn.tyj = paramString.optInt("show_check_box", 0);
        this.cRn.tyk = paramString.optInt("check_box_selected", 0);
        this.cRn.tyl = paramString.optString("check_box_left_wording", "");
        this.cRn.tym = paramString.optString("check_box_right_wording", "");
        this.cRn.tyn = paramString.optString("check_box_url", "");
        this.cRn.tyo = paramString.optInt("is_upload_credid", 0);
        this.cRn.cRf = paramString.optString("upload_credit_url", "");
      }
      label491: if ((paramJSONObject.has("paymenu_array")) && (this.scene == 1))
      {
        paramString = paramJSONObject.optJSONArray("paymenu_array");
        if (paramString != null)
          com.tencent.mm.plugin.wallet_core.model.z.acA(paramString.toString());
      }
      long l = paramJSONObject.optLong("time_stamp");
      if (l <= 0L)
        break label739;
      w.setTimeStamp(String.valueOf(l));
      label552: af.a(paramJSONObject, this.scene, true);
      if ((af.Hr(this.scene)) || (this.scene == 1))
      {
        paramString = paramJSONObject.optJSONObject("bind_card_menu");
        if (paramString == null)
          break label750;
        ab.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "bind card menu: %s", new Object[] { paramString.toString() });
        g.RQ();
        g.RP().Ry().set(ac.a.xTa, paramString.toString());
      }
      label630: paramString = (l)g.K(l.class);
      if (paramString == null)
        break label874;
      ab.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
      paramString.bxp();
      paramInt = r.cPI().cQm();
      if (paramInt != 0)
        break label802;
      if (!paramString.bxn())
        break label771;
      paramString.hq(r.cPI().cQk());
      paramString.hr(false);
      label696: if (this.scene == 10)
      {
        paramJSONObject = paramJSONObject.optJSONObject("action_entry");
        if (paramJSONObject != null)
          break label885;
        paramString = null;
      }
    }
    while (true)
    {
      this.tuw = paramString;
      AppMethodBeat.o(46548);
      break;
      ECardInfo.aw(null);
      break label491;
      label739: ab.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
      break label552;
      label750: g.RQ();
      g.RP().Ry().set(ac.a.xTa, "");
      break label630;
      label771: if (!paramString.bxA())
        break label696;
      paramString.hr(r.cPI().cQk());
      paramString.hq(false);
      break label696;
      label802: if ((paramInt == 1) && (paramString.bxn()))
      {
        paramString.hq(r.cPI().cQk());
        paramString.hr(false);
        break label696;
      }
      if ((paramInt != 2) || (!paramString.bxA()))
        break label696;
      paramString.hr(r.cPI().cQk());
      paramString.hq(false);
      break label696;
      label874: ab.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
      break label696;
      label885: paramString = new h();
      paramString.id = paramJSONObject.optString("id");
      paramString.cEh = paramJSONObject.optString("wording");
      paramString.color = paramJSONObject.optString("color");
      paramString.type = paramJSONObject.optInt("type");
      paramString.txZ = paramJSONObject.optString("native_url");
      paramString.kLE = paramJSONObject.optString("web_url");
      paramString.tya = paramJSONObject.optString("tiny_app_username");
      paramString.tyb = paramJSONObject.optString("tiny_app_path");
      paramString.tyc = paramJSONObject.optInt("entrance_type");
    }
  }

  public int bgI()
  {
    return 72;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindquerynew";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.y
 * JD-Core Version:    0.6.2
 */