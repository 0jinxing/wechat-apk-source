package com.tencent.mm.plugin.websearch.widget.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a
{
  private String cOS;
  private int x;
  private int y;

  public b(int paramInt1, int paramInt2, String paramString)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.cOS = paramString;
  }

  public final String cVS()
  {
    AppMethodBeat.i(91461);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("x", this.x);
      localJSONObject.put("y", this.y);
      localJSONObject.put("eventId", this.cOS);
      String str = localJSONObject.toString();
      AppMethodBeat.o(91461);
      return str;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("onTap", localJSONException, "", new Object[0]);
    }
  }

  public final String getName()
  {
    return "onTap";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c.b
 * JD-Core Version:    0.6.2
 */