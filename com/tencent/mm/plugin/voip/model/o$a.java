package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class o$a
{
  public static int sQV = 1;
  public static int sQW = 2;
  public static int sQX = 3;
  public static int sQY = 4;
  public static int sQZ = 5;
  public static int sRa = 0;
  public static int sRb = 1;
  public int sQS;
  public long sQT;
  public int sQU;
  public int status;

  public final boolean cJh()
  {
    if (this.sQU == sRa);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cJi()
  {
    if (this.status == sQZ);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean parse(String paramString)
  {
    AppMethodBeat.i(4455);
    this.sQU = sRa;
    try
    {
      paramString = br.z(paramString, "voipinvitemsg");
      if (paramString != null)
      {
        if (paramString.get(".voipinvitemsg.roomid") != null)
          this.sQS = bo.getInt((String)paramString.get(".voipinvitemsg.roomid"), 0);
        if (paramString.get(".voipinvitemsg.key") != null)
          this.sQT = bo.getLong((String)paramString.get(".voipinvitemsg.key"), 0L);
        if (paramString.get(".voipinvitemsg.status") != null)
          this.status = bo.getInt((String)paramString.get(".voipinvitemsg.status"), 0);
        if (paramString.get(".voipinvitemsg.invitetype") != null)
          this.sQU = bo.getInt((String)paramString.get(".voipinvitemsg.invitetype"), 0);
        AppMethodBeat.o(4455);
      }
      for (bool = true; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(4455);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VoipExtension", paramString, "", new Object[0]);
        ab.e("MicroMsg.VoipExtension", "parse voip message error: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(4455);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.o.a
 * JD-Core Version:    0.6.2
 */