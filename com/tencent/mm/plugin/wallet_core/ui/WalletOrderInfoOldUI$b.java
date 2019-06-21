package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class WalletOrderInfoOldUI$b
{
  public String cEh;
  public String cIY;
  public String tID;
  public String title;
  public String url;

  public WalletOrderInfoOldUI$b(WalletOrderInfoOldUI paramWalletOrderInfoOldUI, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(47491);
    if (paramJSONObject == null)
      AppMethodBeat.o(47491);
    while (true)
    {
      return;
      paramWalletOrderInfoOldUI = paramJSONObject.optJSONObject("activity_change_info");
      if (paramWalletOrderInfoOldUI != null)
      {
        this.url = paramWalletOrderInfoOldUI.optString("url");
        this.cEh = paramWalletOrderInfoOldUI.optString("wording");
        this.cIY = paramWalletOrderInfoOldUI.optString("icon");
        this.tID = paramWalletOrderInfoOldUI.optString("btn_text");
        this.title = paramWalletOrderInfoOldUI.optString("title");
      }
      AppMethodBeat.o(47491);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(47492);
    String str = this.url + " , " + this.cEh + " , " + this.cIY + " , " + this.tID + " , " + this.title;
    AppMethodBeat.o(47492);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.b
 * JD-Core Version:    0.6.2
 */