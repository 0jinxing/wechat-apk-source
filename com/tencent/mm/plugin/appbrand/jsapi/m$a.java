package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class m$a
{
  public final String aIm;
  public final Map<String, Object> values;

  public m$a(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(91033);
    this.values = new HashMap();
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
    {
      this.aIm = paramString;
      AppMethodBeat.o(91033);
    }
    while (true)
    {
      return;
      this.aIm = String.format(paramString, paramArrayOfObject);
      AppMethodBeat.o(91033);
    }
  }

  public a m(String paramString, Object paramObject)
  {
    AppMethodBeat.i(91034);
    this.values.put(paramString, paramObject);
    AppMethodBeat.o(91034);
    return this;
  }

  public a v(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(91035);
    if (paramMap != null)
      this.values.putAll(paramMap);
    AppMethodBeat.o(91035);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.a
 * JD-Core Version:    0.6.2
 */