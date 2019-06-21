package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$a
{
  public String path;
  public String thumbUrl;
  public String title;
  public String username;
  public int version;

  public static a WG(String paramString)
  {
    AppMethodBeat.i(24671);
    Map localMap = br.z(paramString, "program");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$a;
        paramString.<init>();
        paramString.title = bo.nullAsNil((String)localMap.get(".program.title"));
        paramString.thumbUrl = bo.nullAsNil((String)localMap.get(".program.thumburl"));
        paramString.username = bo.nullAsNil((String)localMap.get(".program.username"));
        paramString.path = bo.nullAsNil((String)localMap.get(".program.path"));
        paramString.version = bo.getInt((String)localMap.get(".program.version"), 0);
        AppMethodBeat.o(24671);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.a
 * JD-Core Version:    0.6.2
 */