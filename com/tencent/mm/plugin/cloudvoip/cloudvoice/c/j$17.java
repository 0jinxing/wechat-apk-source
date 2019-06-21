package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tr;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

final class j$17
  implements f.a<tr, String>
{
  j$17(j paramj, a parama)
  {
  }

  private static tr aB(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135542);
    tr localtr = new tr();
    try
    {
      localtr.parseFrom(paramArrayOfByte);
      AppMethodBeat.o(135542);
      paramArrayOfByte = localtr;
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", paramArrayOfByte, "hy: unable to parse from data", new Object[0]);
        paramArrayOfByte = null;
        AppMethodBeat.o(135542);
      }
    }
  }

  public final boolean bgp()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.17
 * JD-Core Version:    0.6.2
 */