package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class q$b
{
  public String ttf;
  public String ttg;
  public String tzU;
  public String tzV;
  public String tzW;
  public String tzX;
  public int tzY;

  public final void aA(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46791);
    this.ttf = paramJSONObject.optString("tinyapp_name");
    this.tzU = paramJSONObject.optString("tinyapp_logo");
    this.tzV = paramJSONObject.optString("tinyapp_desc");
    this.tzW = paramJSONObject.optString("tinyapp_username");
    this.ttg = paramJSONObject.optString("tinyapp_path");
    this.tzX = paramJSONObject.optString("activity_tinyapp_btn_text");
    this.tzY = paramJSONObject.optInt("tinyapp_version", 0);
    AppMethodBeat.o(46791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.q.b
 * JD-Core Version:    0.6.2
 */