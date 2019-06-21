package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class q
{
  public long ttW;
  public long tzN;
  public long tzO;
  public int tzP;
  public int tzQ;
  public long tzR;

  public final void aA(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46792);
    this.ttW = paramJSONObject.optLong("activity_id");
    this.tzN = paramJSONObject.optLong("activity_type", 0L);
    this.tzO = paramJSONObject.optLong("award_id");
    this.tzP = paramJSONObject.optInt("send_record_id");
    this.tzQ = paramJSONObject.optInt("user_record_id");
    this.tzR = paramJSONObject.optLong("activity_mch_id", 0L);
    AppMethodBeat.o(46792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.q
 * JD-Core Version:    0.6.2
 */