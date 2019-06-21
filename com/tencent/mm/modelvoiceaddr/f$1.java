package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.qqpinyin.voicerecoapi.c;

final class f$1
  implements com.tencent.mm.audio.b.c.a
{
  f$1(f paramf)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(116693);
    ab.d("MicroMsg.SceneVoiceAddr", "OnRecPcmDataReady len: %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.qqpinyin.voicerecoapi.c.a locala = new com.tencent.qqpinyin.voicerecoapi.c.a();
    short[] arrayOfShort = new short[paramInt / 2];
    for (int i = 0; i < paramInt / 2; i++)
      arrayOfShort[i] = ((short)(short)(paramArrayOfByte[(i * 2)] & 0xFF | paramArrayOfByte[(i * 2 + 1)] << 8));
    if (this.gbb.gaZ != null)
      this.gbb.gaZ.a(arrayOfShort, paramInt / 2, locala);
    f.a(this.gbb, arrayOfShort, paramInt / 2);
    if (this.gbb.gaY != null);
    for (paramInt = this.gbb.gaY.a(new g.a(paramArrayOfByte, paramInt)); ; paramInt = -1)
    {
      if (-1 == paramInt)
      {
        f.a(this.gbb);
        ab.e("MicroMsg.SceneVoiceAddr", "write to file failed");
        AppMethodBeat.o(116693);
      }
      while (true)
      {
        return;
        paramArrayOfByte = this.gbb;
        paramArrayOfByte.gaT = (paramInt + paramArrayOfByte.gaT);
        if ((this.gbb.gaT > 3300) && (!this.gbb.gaU))
        {
          ab.d("MicroMsg.SceneVoiceAddr", "sendEmptyMessage(0)");
          this.gbb.handler.sendEmptyMessage(0);
          this.gbb.gaU = true;
        }
        if ((locala.AqE == 2) || (locala.AqE == 3))
        {
          ab.i("MicroMsg.SceneVoiceAddr", "state.vad_flag: " + locala.AqE);
          f.a(this.gbb);
        }
        AppMethodBeat.o(116693);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.f.1
 * JD-Core Version:    0.6.2
 */