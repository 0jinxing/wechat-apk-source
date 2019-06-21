package com.tencent.mm.plugin.talkroom.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements c.a
{
  f$1(f paramf)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(25713);
    ab.d("MicroMsg.MicRecoder", "pcm len: ".concat(String.valueOf(paramInt)));
    if (paramInt <= 0)
    {
      ab.e("MicroMsg.MicRecoder", "pcm data too low");
      AppMethodBeat.o(25713);
    }
    while (true)
    {
      return;
      f.a(this.sxj, paramArrayOfByte, paramInt);
      paramInt = f.a(this.sxj).Send(paramArrayOfByte, (short)paramInt);
      if (paramInt < 0)
      {
        ab.e("MicroMsg.MicRecoder", "send failed, ret: ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(25713);
      }
      else
      {
        AppMethodBeat.o(25713);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.f.1
 * JD-Core Version:    0.6.2
 */