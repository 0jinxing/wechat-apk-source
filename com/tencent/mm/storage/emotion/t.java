package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
{
  public long eRt;
  public String key;
  public int position;
  public int ybg;

  public final JSONObject toJson()
  {
    AppMethodBeat.i(62891);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.key);
      localJSONObject.put("position", this.position);
      localJSONObject.put("use_count", this.ybg);
      localJSONObject.put("last_time", this.eRt);
      AppMethodBeat.o(62891);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(62891);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.t
 * JD-Core Version:    0.6.2
 */