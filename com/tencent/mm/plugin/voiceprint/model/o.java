package com.tencent.mm.plugin.voiceprint.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ud;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

public final class o
{
  public k sLw;
  public ap sLx;
  int sLy;
  int sLz;

  public o()
  {
    AppMethodBeat.i(26118);
    this.sLw = null;
    this.sLx = null;
    this.sLy = 0;
    this.sLz = 0;
    this.sLw = new k();
    this.sLx = new ap(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        boolean bool1 = false;
        AppMethodBeat.i(26117);
        o.this.sLy += 100;
        o.this.sLz += o.this.sLw.getMaxAmplitude() * 100 / 100;
        if (o.this.sLy >= 3000)
        {
          Object localObject = o.this;
          ab.d("MicroMsg.VoicePrintNoiseDetector", "onDetectFinish");
          ((o)localObject).sLw.EB();
          ((o)localObject).sLx.stopTimer();
          ((o)localObject).sLz /= 30;
          if (((o)localObject).sLz >= 30)
          {
            bool2 = true;
            ab.d("MicroMsg.VoicePrintNoiseDetector", "average amplitude: %d, hasNoise:%b", new Object[] { Integer.valueOf(((o)localObject).sLz), Boolean.valueOf(bool2) });
            localObject = new ud();
            ((ud)localObject).cQm.cQn = bool2;
            a.xxA.m((b)localObject);
            AppMethodBeat.o(26117);
          }
        }
        for (boolean bool2 = bool1; ; bool2 = true)
        {
          return bool2;
          bool2 = false;
          break;
          AppMethodBeat.o(26117);
        }
      }
    }
    , true);
    AppMethodBeat.o(26118);
  }

  private void stopRecord()
  {
    AppMethodBeat.i(26119);
    this.sLw.EB();
    ab.d("MicroMsg.VoicePrintNoiseDetector", "stop record");
    AppMethodBeat.o(26119);
  }

  public final void cHP()
  {
    AppMethodBeat.i(26120);
    ab.d("MicroMsg.VoicePrintNoiseDetector", "start detect noise");
    reset();
    String str = m.by("voice_pt_voice_print_noise_detect.rec", true);
    if (!this.sLw.el(str))
    {
      this.sLw.EB();
      reset();
      ab.d("MicroMsg.VoicePrintNoiseDetector", "start record fail");
    }
    while (true)
    {
      this.sLx.ae(100L, 100L);
      AppMethodBeat.o(26120);
      return;
      ab.d("MicroMsg.VoicePrintNoiseDetector", "start record");
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(26121);
    stopRecord();
    this.sLx.stopTimer();
    this.sLy = 0;
    this.sLz = 0;
    AppMethodBeat.o(26121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.o
 * JD-Core Version:    0.6.2
 */