package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.modelvoiceaddr.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements c.a
{
  short[] gbj;

  g$1(g paramg)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116705);
    ab.e("MicroMsg.SceneVoiceInputAddr", "onRecError state = %s detailState = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.gbk.cG(10, -1);
    AppMethodBeat.o(116705);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(116704);
    ab.d("MicroMsg.SceneVoiceInputAddr", "OnRecPcmDataReady len: %s time: %s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis()) });
    if (this.gbj != null)
    {
      j = i;
      if (this.gbj.length >= paramInt / 2);
    }
    else
    {
      this.gbj = new short[paramInt / 2];
    }
    for (int j = i; j < paramInt / 2; j++)
      this.gbj[j] = ((short)(short)(paramArrayOfByte[(j * 2)] & 0xFF | paramArrayOfByte[(j * 2 + 1)] << 8));
    g.a(this.gbk, this.gbj, paramInt / 2);
    if (g.d(this.gbk) != null)
    {
      g.d(this.gbk).f(this.gbj, paramInt / 2);
      AppMethodBeat.o(116704);
    }
    while (true)
    {
      return;
      this.gbk.cG(9, -1);
      ab.e("MicroMsg.SceneVoiceInputAddr", "mVoiceSilentDetectAPI is null");
      AppMethodBeat.o(116704);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.g.1
 * JD-Core Version:    0.6.2
 */