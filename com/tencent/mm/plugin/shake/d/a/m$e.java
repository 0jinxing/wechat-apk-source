package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$e
{
  public String cIe;
  public String link;
  public String thumbUrl;
  public String title;

  public static e WK(String paramString)
  {
    AppMethodBeat.i(24675);
    Map localMap = br.z(paramString, "h5url");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$e;
        paramString.<init>();
        paramString.title = bo.nullAsNil((String)localMap.get(".h5url.title"));
        paramString.thumbUrl = bo.nullAsNil((String)localMap.get(".h5url.thumburl"));
        paramString.link = bo.nullAsNil((String)localMap.get(".h5url.link"));
        paramString.cIe = bo.nullAsNil((String)localMap.get(".h5url.username"));
        AppMethodBeat.o(24675);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.e
 * JD-Core Version:    0.6.2
 */