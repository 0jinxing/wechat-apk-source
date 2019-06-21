package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.modelvoiceaddr.a.c;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements c.a
{
  short[] gbj;

  a$2(a parama)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(286);
    ab.e("MicroMsg.FaceVoiceRecordLogic", "onRecError state = " + paramInt1 + " detailState = " + paramInt2);
    this.lUY.bsT();
    if (a.e(this.lUY) != null)
      a.e(this.lUY).onError(2);
    AppMethodBeat.o(286);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(285);
    ab.d("MicroMsg.FaceVoiceRecordLogic", "OnRecPcmDataReady len: %d", new Object[] { Integer.valueOf(paramInt) });
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
    a.a(this.lUY, this.gbj, paramInt / 2);
    if (a.g(this.lUY) != null)
    {
      a.g(this.lUY).f(this.gbj, paramInt / 2);
      if (a.d(this.lUY) == null)
        break label281;
    }
    label281: for (paramInt = a.d(this.lUY).a(new g.a(paramArrayOfByte, paramInt)); ; paramInt = -1)
    {
      if ((-1 == paramInt) && (a.e(this.lUY) != null))
      {
        a.e(this.lUY).onError(3);
        this.lUY.bsT();
        ab.e("MicroMsg.FaceVoiceRecordLogic", "write to file failed");
        AppMethodBeat.o(285);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(285);
        continue;
        if (a.e(this.lUY) != null)
        {
          a.e(this.lUY).onError(1);
          this.lUY.bsT();
        }
        ab.e("MicroMsg.FaceVoiceRecordLogic", "mVoiceSilentDetectAPI is null");
        AppMethodBeat.o(285);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.a.2
 * JD-Core Version:    0.6.2
 */