package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tv;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

final class j$2
  implements f.a<tv, String>
{
  j$2(j paramj)
  {
  }

  private static tv aA(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135511);
    tv localtv = new tv();
    try
    {
      localtv.parseFrom(paramArrayOfByte);
      AppMethodBeat.o(135511);
      paramArrayOfByte = localtv;
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", paramArrayOfByte, "hy: unable to parse from data", new Object[0]);
        paramArrayOfByte = null;
        AppMethodBeat.o(135511);
      }
    }
  }

  public final boolean bgp()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.2
 * JD-Core Version:    0.6.2
 */