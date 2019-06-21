package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$d
{
  public String qub;
  public String thumbUrl;
  public String title;
  public String username;

  public static d WJ(String paramString)
  {
    AppMethodBeat.i(24674);
    Map localMap = br.z(paramString, "tempsession");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$d;
        paramString.<init>();
        paramString.title = bo.nullAsNil((String)localMap.get(".tempsession.title"));
        paramString.thumbUrl = bo.nullAsNil((String)localMap.get(".tempsession.thumburl"));
        paramString.username = bo.nullAsNil((String)localMap.get(".tempsession.username"));
        paramString.qub = bo.nullAsNil((String)localMap.get(".tempsession.deeplinkjumpurl"));
        AppMethodBeat.o(24674);
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
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.d
 * JD-Core Version:    0.6.2
 */