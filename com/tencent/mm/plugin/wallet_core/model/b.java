package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public double pPt = 0.0D;
  public int tgO = 0;
  public int tgP = 0;
  public int tgQ = 0;
  public double tgR = 0.0D;
  public String twA;
  public b.a twB;
  public String twx;
  public LinkedList<b.b> twy;
  public String twz;

  public static b.a aq(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46701);
    b.a locala = new b.a();
    if (paramJSONObject != null)
      try
      {
        locala.twC = paramJSONObject.optString("sector_title", "");
        paramJSONObject = paramJSONObject.optJSONArray("label");
        if (paramJSONObject != null)
        {
          locala.twD = new b.c[paramJSONObject.length()];
          for (int i = 0; i < paramJSONObject.length(); i++)
          {
            JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
            b.c localc = new com/tencent/mm/plugin/wallet_core/model/b$c;
            localc.<init>();
            localc.title = localJSONObject.optString("title", "");
            localc.desc = localJSONObject.optString("desc", "");
            localc.kbV = localJSONObject.optString("logo_url", "");
            localc.ttd = localJSONObject.optInt("jump_type");
            localc.kdF = localJSONObject.optString("jump_url", "");
            locala.twD[i] = localc;
          }
        }
      }
      catch (JSONException paramJSONObject)
      {
      }
    AppMethodBeat.o(46701);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.b
 * JD-Core Version:    0.6.2
 */