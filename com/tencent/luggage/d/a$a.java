package com.tencent.luggage.d;

import com.tencent.luggage.bridge.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import org.json.JSONObject;

public final class a$a
{
  public CONTEXT bOZ;
  public k bPa;

  public a$a(a parama)
  {
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(90769);
    this.bPa.a(paramString, paramJSONObject);
    AppMethodBeat.o(90769);
  }

  public final void c(String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(90768);
    k localk = this.bPa;
    String str = paramString;
    if (paramString == null)
      str = "";
    localk.bOy = str;
    if (paramMap != null);
    for (paramString = new JSONObject(paramMap); ; paramString = null)
    {
      localk.bOz = paramString;
      if (localk.bOs != 0)
        localk.wM();
      AppMethodBeat.o(90768);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.a.a
 * JD-Core Version:    0.6.2
 */