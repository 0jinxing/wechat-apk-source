package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class g
{
  private static g txQ;
  public String pbp;
  public int txR = 0;
  private JSONObject txS;

  public static g cPl()
  {
    AppMethodBeat.i(46726);
    if (txQ == null)
      txQ = new g();
    g localg = txQ;
    AppMethodBeat.o(46726);
    return localg;
  }

  public final boolean aFF()
  {
    boolean bool = true;
    AppMethodBeat.i(46728);
    if ((this.txR == 1) && (!bo.isNullOrNil(this.pbp)))
      AppMethodBeat.o(46728);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46728);
    }
  }

  public final void at(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46727);
    this.txS = paramJSONObject;
    try
    {
      if (this.txS != null)
      {
        paramJSONObject = this.txS.optJSONObject("bind_newcard_switch");
        this.txR = paramJSONObject.optInt("forbid_bind_card");
      }
      for (this.pbp = paramJSONObject.optString("forbid_word"); ; this.pbp = "")
      {
        ab.i("MicroMsg.BindQueryComplexSwitchInfo", "feed result %s forbid_bind_card %s forbid_word %s", new Object[] { this.txS, Integer.valueOf(this.txR), this.pbp });
        AppMethodBeat.o(46727);
        return;
        this.txR = 0;
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        this.txR = 0;
        this.pbp = "";
        ab.printErrStackTrace("MicroMsg.BindQueryComplexSwitchInfo", paramJSONObject, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.g
 * JD-Core Version:    0.6.2
 */