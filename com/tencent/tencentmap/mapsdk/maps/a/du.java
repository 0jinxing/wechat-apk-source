package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public final class du
{
  public Map<String, Object> a;

  public du()
  {
    AppMethodBeat.i(98746);
    this.a = new HashMap();
    AppMethodBeat.o(98746);
  }

  public final byte[] a()
  {
    AppMethodBeat.i(98747);
    Object localObject = new JSONObject();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      try
      {
        ((JSONObject)localObject).put((String)localEntry.getKey(), localEntry.getValue());
      }
      catch (Exception localException)
      {
      }
    }
    localObject = ((JSONObject)localObject).toString().getBytes();
    AppMethodBeat.o(98747);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.du
 * JD-Core Version:    0.6.2
 */