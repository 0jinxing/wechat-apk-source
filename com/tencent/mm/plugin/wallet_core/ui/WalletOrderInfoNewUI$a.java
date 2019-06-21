package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bc;
import com.tencent.mm.protocal.protobuf.bnu;
import org.json.JSONObject;

final class WalletOrderInfoNewUI$a
{
  public String cEh;
  public String cIY;
  public String tID;
  public int tIE;
  public String title;
  public String ttf;
  public String ttg;
  public String tzU;
  public String tzV;
  public String tzW;
  public String tzX;
  public String url;

  public WalletOrderInfoNewUI$a(bnu parambnu)
  {
    AppMethodBeat.i(47448);
    if ((parambnu != null) && (parambnu.wQV != null))
    {
      parambnu = parambnu.wQV;
      this.url = parambnu.url;
      this.cEh = parambnu.cEh;
      this.cIY = parambnu.cIY;
      this.tID = parambnu.tID;
      this.title = parambnu.title;
      this.tzW = parambnu.tzW;
      this.ttg = parambnu.ttg;
      this.tIE = parambnu.tIE;
      this.ttf = this.title;
      this.tzU = this.cIY;
      this.tzV = this.cEh;
      this.tzX = this.tID;
    }
    AppMethodBeat.o(47448);
  }

  public WalletOrderInfoNewUI$a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(47447);
    if (paramJSONObject == null)
      AppMethodBeat.o(47447);
    while (true)
    {
      return;
      paramJSONObject = paramJSONObject.optJSONObject("activity_change_info");
      if (paramJSONObject != null)
      {
        this.url = paramJSONObject.optString("url");
        this.cEh = paramJSONObject.optString("wording");
        this.cIY = paramJSONObject.optString("icon");
        this.tID = paramJSONObject.optString("btn_text");
        this.title = paramJSONObject.optString("title");
        this.ttf = paramJSONObject.optString("tinyapp_name");
        this.tzU = paramJSONObject.optString("tinyapp_logo");
        this.tzV = paramJSONObject.optString("tinyapp_desc");
        this.tzW = paramJSONObject.optString("tinyapp_username");
        this.ttg = paramJSONObject.optString("tinyapp_path");
        this.tzX = paramJSONObject.optString("activity_tinyapp_btn_text");
      }
      AppMethodBeat.o(47447);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(47449);
    String str = this.url + " , " + this.cEh + " , " + this.cIY + " , " + this.tID + " , " + this.title;
    AppMethodBeat.o(47449);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.a
 * JD-Core Version:    0.6.2
 */