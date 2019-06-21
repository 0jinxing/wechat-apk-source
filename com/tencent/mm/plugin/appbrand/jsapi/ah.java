package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ah extends b
{
  private c hcM;
  private String hwL;
  private Map<String, Object> hwM;
  int hwN;

  public ah AM(String paramString)
  {
    this.hwL = paramString;
    return this;
  }

  public final void aCj()
  {
    AppMethodBeat.i(91040);
    if (this.hcM == null)
      AppMethodBeat.o(91040);
    while (true)
    {
      return;
      this.hcM.a(this);
      AppMethodBeat.o(91040);
    }
  }

  public ah b(c paramc, int paramInt)
  {
    AppMethodBeat.i(91036);
    j(paramc);
    this.hwN = paramInt;
    AppMethodBeat.o(91036);
    return this;
  }

  public final String getData()
  {
    AppMethodBeat.i(91039);
    String str;
    if (this.hwL != null)
    {
      str = this.hwL;
      AppMethodBeat.o(91039);
    }
    while (true)
    {
      return str;
      if (this.hwM != null)
      {
        i.d(this.hwM);
        str = new JSONObject(this.hwM).toString();
        AppMethodBeat.o(91039);
      }
      else
      {
        str = null;
        AppMethodBeat.o(91039);
      }
    }
  }

  public ah j(c paramc)
  {
    if (paramc == null);
    while (true)
    {
      return this;
      this.hcM = paramc;
      this.hwN = 0;
    }
  }

  public final ah n(String paramString, Object paramObject)
  {
    AppMethodBeat.i(91037);
    if (this.hwM == null)
      this.hwM = new HashMap();
    this.hwM.put(paramString, paramObject);
    AppMethodBeat.o(91037);
    return this;
  }

  public ah t(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(91038);
    if (paramMap == null)
      AppMethodBeat.o(91038);
    while (true)
    {
      return this;
      i.d(paramMap);
      this.hwM = paramMap;
      AppMethodBeat.o(91038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ah
 * JD-Core Version:    0.6.2
 */