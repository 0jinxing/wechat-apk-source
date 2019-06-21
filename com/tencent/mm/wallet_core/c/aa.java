package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class aa
{
  public String AfX;
  public String AfY;
  public int AfZ;
  public String xfz;
  public String xoz;

  public aa()
  {
    this.AfX = "";
    this.xoz = "";
    this.AfY = "";
    this.xfz = "";
    this.AfZ = 0;
  }

  public aa(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49092);
    this.AfX = "";
    this.xoz = "";
    this.AfY = "";
    this.xfz = "";
    this.AfZ = 0;
    this.AfX = paramJSONObject.optString("device_id");
    this.xoz = paramJSONObject.optString("device_name");
    this.AfY = paramJSONObject.optString("device_os");
    this.AfZ = paramJSONObject.optInt("Is_cur_device");
    this.xfz = paramJSONObject.optString("crt_no");
    AppMethodBeat.o(49092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.aa
 * JD-Core Version:    0.6.2
 */