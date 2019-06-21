package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ts;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

final class j$4
  implements f.a<String, ts>
{
  j$4(j paramj)
  {
  }

  private static byte[] a(ts paramts)
  {
    AppMethodBeat.i(135517);
    if (paramts != null);
    while (true)
    {
      try
      {
        paramts = paramts.toByteArray();
        AppMethodBeat.o(135517);
        return paramts;
      }
      catch (IOException paramts)
      {
        ab.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", paramts, "hy: error when convert to byte array", new Object[0]);
      }
      paramts = new byte[0];
      AppMethodBeat.o(135517);
    }
  }

  public final boolean bgp()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.4
 * JD-Core Version:    0.6.2
 */