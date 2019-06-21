package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qafpapi.QAFPNative;

final class a$1
  implements c.a
{
  a$1(a parama)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] arg1, int paramInt)
  {
    AppMethodBeat.i(24589);
    g.a locala = new g.a();
    label415: 
    while (true)
    {
      long l;
      synchronized (this.qtD.kbe)
      {
        int i;
        if (this.qtD.qtr == 408)
        {
          ab.v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPProcessTV");
          i = QAFPNative.QAFPProcessTV(???, paramInt);
          l = bo.anU() - this.qtD.qtA;
          ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPProcess clientid:%d pcm:%d ret:%d dur:%d usetime:%d", new Object[] { Integer.valueOf(this.qtD.qtx), Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(l), Long.valueOf(locala.Mr()) });
          if (l <= this.qtD.qtB * 3000 + 4000)
            break label415;
          ??? = new byte[10240];
          ??? = new g.a();
          if (this.qtD.qtr == 408)
          {
            ab.v("MicroMsg.MusicFingerPrintRecorder", "shake tv branch, QAFPGetAudioFingerPrintTV");
            paramInt = QAFPNative.QAFPGetAudioFingerPrintTV((byte[])???);
            ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d outLen:%d time:%d", new Object[] { Integer.valueOf(this.qtD.qtx), Integer.valueOf(paramInt), Long.valueOf(???.Mr()) });
            if ((paramInt < 10240) && (paramInt > 0))
              break label317;
            ab.e("MicroMsg.MusicFingerPrintRecorder", "QAFPGetAudioFingerPrint clientid:%d  out ret:%d  !stop record now", new Object[] { Integer.valueOf(this.qtD.qtx), Integer.valueOf(paramInt) });
            this.qtD.reset();
            AppMethodBeat.o(24589);
          }
        }
        else
        {
          i = QAFPNative.QAFPProcess(???, paramInt);
        }
      }
      paramInt = QAFPNative.QAFPGetAudioFingerPrint((byte[])???);
      continue;
      label317: synchronized (this.qtD.qtn)
      {
        System.arraycopy(???, 0, this.qtD.qtn, 0, paramInt);
        this.qtD.qto = paramInt;
        ??? = this.qtD;
        if (this.qtD.qtB >= 3)
        {
          bool = true;
          ((a)???).qtw = bool;
          this.qtD.qtp = ((int)(l / 1000L));
          this.qtD.agK();
          ??? = this.qtD;
          ???.qtB += 1;
          if (this.qtD.qtw)
          {
            ab.w("MicroMsg.MusicFingerPrintRecorder", "client:%d stop now! duration:%d  ", new Object[] { Integer.valueOf(this.qtD.qtx), Long.valueOf(l) });
            this.qtD.reset();
          }
          AppMethodBeat.o(24589);
          continue;
        }
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.a.1
 * JD-Core Version:    0.6.2
 */