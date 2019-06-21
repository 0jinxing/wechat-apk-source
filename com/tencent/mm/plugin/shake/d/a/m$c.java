package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$c
{
  public String id;
  public String thumbUrl;
  public String title;

  public static c WI(String paramString)
  {
    AppMethodBeat.i(24673);
    Map localMap = br.z(paramString, "product");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$c;
        paramString.<init>();
        paramString.title = bo.nullAsNil((String)localMap.get(".product.title"));
        paramString.thumbUrl = bo.nullAsNil((String)localMap.get(".product.thumburl"));
        paramString.id = bo.nullAsNil((String)localMap.get(".product.product_id"));
        AppMethodBeat.o(24673);
        return paramString;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShakeTVXmlParser", paramString, "", new Object[0]);
        paramString = null;
        continue;
      }
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.c
 * JD-Core Version:    0.6.2
 */