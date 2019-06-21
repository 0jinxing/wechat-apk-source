package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$f
{
  public String bCu;
  public String quc;
  public String userName;

  public static f WL(String paramString)
  {
    AppMethodBeat.i(24676);
    Map localMap = br.z(paramString, "bizprofile");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$f;
        paramString.<init>();
        paramString.bCu = bo.nullAsNil((String)localMap.get(".bizprofile.nickname"));
        paramString.userName = bo.nullAsNil((String)localMap.get(".bizprofile.username"));
        paramString.quc = bo.nullAsNil((String)localMap.get(".bizprofile.showchat"));
        AppMethodBeat.o(24676);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.f
 * JD-Core Version:    0.6.2
 */