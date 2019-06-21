package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class c
{
  public String hAa = "ok";
  public List<b> ido = null;

  public final JSONArray aGx()
  {
    AppMethodBeat.i(94382);
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = this.ido.iterator();
    while (localIterator.hasNext())
      localJSONArray.put(((b)localIterator.next()).toJSONObject());
    AppMethodBeat.o(94382);
    return localJSONArray;
  }

  public final String toString()
  {
    AppMethodBeat.i(94381);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mErrorMsg:");
    ((StringBuilder)localObject).append(this.hAa);
    ((StringBuilder)localObject).append(" mWifiList:");
    Iterator localIterator;
    if ((this.ido != null) && (this.ido.size() > 0))
      localIterator = this.ido.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      ((StringBuilder)localObject).append(" WiFiItem:");
      ((StringBuilder)localObject).append(localb);
      continue;
      ((StringBuilder)localObject).append("null:");
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(94381);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.c
 * JD-Core Version:    0.6.2
 */