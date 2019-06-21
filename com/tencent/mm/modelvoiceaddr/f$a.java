package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.d.a;
import com.tencent.mm.audio.d.d;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class f$a
  implements Runnable
{
  public f$a(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116695);
    while (true)
    {
      synchronized (this.gbb)
      {
        ab.i("MicroMsg.SceneVoiceAddr", "initDeviceInLock");
        try
        {
          localObject1 = new java/io/File;
          ((File)localObject1).<init>(f.d(this.gbb));
          ((File)localObject1).delete();
          if (f.c(this.gbb))
          {
            i = 8000;
            f localf2 = this.gbb;
            localObject1 = new com/tencent/mm/audio/b/c;
            ((com.tencent.mm.audio.b.c)localObject1).<init>(i, 1, 3);
            localf2.coZ = ((com.tencent.mm.audio.b.c)localObject1);
            this.gbb.coZ.cpB = -19;
            this.gbb.coZ.bq(false);
            if (!f.c(this.gbb))
            {
              localf2 = this.gbb;
              localObject1 = new com/tencent/mm/audio/d/d;
              ((d)localObject1).<init>();
              localf2.gaY = ((a)localObject1);
              if (!this.gbb.gaY.eo(f.d(this.gbb)))
              {
                ab.e("MicroMsg.SceneVoiceAddr", "init speex writer failed");
                this.gbb.gaY.Fe();
                this.gbb.gaY = null;
              }
            }
            if ((f.c(this.gbb)) || (q.etn.erW <= 0))
              break label356;
            this.gbb.coZ.v(q.etn.erW, true);
            this.gbb.coZ.br(false);
            localf2 = this.gbb;
            localObject1 = new com/tencent/qqpinyin/voicerecoapi/c;
            ((com.tencent.qqpinyin.voicerecoapi.c)localObject1).<init>(f.f(this.gbb));
            localf2.gaZ = ((com.tencent.qqpinyin.voicerecoapi.c)localObject1);
            i = this.gbb.gaZ.dPU();
            if (i == 0)
              break label371;
            ab.e("MicroMsg.SceneVoiceAddr", "init VoiceDetectAPI failed :".concat(String.valueOf(i)));
            f.g(this.gbb);
            AppMethodBeat.o(116695);
            return;
          }
        }
        catch (Exception localException)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("delete file failed, ");
          ab.e("MicroMsg.SceneVoiceAddr", f.d(this.gbb), new Object[] { localException });
          continue;
        }
      }
      int i = 16000;
      continue;
      label356: this.gbb.coZ.v(5, false);
      continue;
      label371: this.gbb.coZ.cpM = f.h(this.gbb);
      if (!this.gbb.coZ.EL())
      {
        ab.e("MicroMsg.SceneVoiceAddr", "start record failed");
        f.g(this.gbb);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.f.a
 * JD-Core Version:    0.6.2
 */