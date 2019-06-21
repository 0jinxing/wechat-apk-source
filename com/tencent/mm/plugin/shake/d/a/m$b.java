package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class m$b
{
  public String pdz;
  public String qtZ;
  public String thumbUrl;
  public String title;

  public static b WH(String paramString)
  {
    AppMethodBeat.i(24672);
    Map localMap = br.z(paramString, "nativepay");
    if (localMap != null);
    while (true)
    {
      try
      {
        paramString = new com/tencent/mm/plugin/shake/d/a/m$b;
        paramString.<init>();
        paramString.title = bo.nullAsNil((String)localMap.get(".nativepay.title"));
        paramString.thumbUrl = bo.nullAsNil((String)localMap.get(".nativepay.thumburl"));
        paramString.qtZ = bo.nullAsNil((String)localMap.get(".nativepay.wx_pay_url"));
        paramString.pdz = bo.nullAsNil((String)localMap.get(".nativepay.price"));
        AppMethodBeat.o(24672);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.m.b
 * JD-Core Version:    0.6.2
 */