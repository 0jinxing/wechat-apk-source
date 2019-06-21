package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class q$a
{
  public String name;
  public String pia;
  public String title;
  public int type;
  public String tzS;
  public String tzT;
  public String url;

  public final void aA(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46790);
    this.url = paramJSONObject.optString("url");
    this.name = paramJSONObject.optString("wording");
    this.pia = paramJSONObject.optString("icon");
    this.tzS = paramJSONObject.optString("btn_text");
    this.type = paramJSONObject.optInt("type");
    this.title = paramJSONObject.optString("title");
    this.tzT = paramJSONObject.optString("small_title");
    AppMethodBeat.o(46790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.q.a
 * JD-Core Version:    0.6.2
 */