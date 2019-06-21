package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.b;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements b
{
  c$2(c paramc)
  {
  }

  public final int N(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(135362);
    ab.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack,pcm data len:" + paramArrayOfByte.length);
    paramInt = com.tencent.mm.plugin.voip_cs.b.c.cMe().tew.playCallback(paramArrayOfByte, paramInt);
    if (paramInt != 0)
      ab.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack is failure! pc data:" + paramArrayOfByte.length + ",ret:" + paramInt);
    if (paramInt != 0)
    {
      paramInt = 1;
      AppMethodBeat.o(135362);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(135362);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.c.2
 * JD-Core Version:    0.6.2
 */