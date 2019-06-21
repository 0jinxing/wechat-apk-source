package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$8
  implements Runnable
{
  a$8(a parama, a.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(553);
    synchronized (a.a(this.lZv))
    {
      a.a(this.lZv, this.lZF);
      if (a.n(this.lZv) == a.a.lZH)
      {
        ab.e("MicroMsg.FaceVideoRecorder", "hy: not initialized. should not happen");
        a.d(this.lZv);
        if (a.r(this.lZv) != null)
          a.r(this.lZv).Lu(null);
        AppMethodBeat.o(553);
      }
      while (true)
      {
        return;
        if ((a.n(this.lZv) == a.a.lZM) || (a.n(this.lZv) == a.a.lZI))
        {
          ab.w("MicroMsg.FaceVideoRecorder", "hy: cancelled or not started capturing.");
          a.d(this.lZv);
          if (a.r(this.lZv) != null)
            a.r(this.lZv).Lu(null);
          AppMethodBeat.o(553);
        }
        else if (a.n(this.lZv) == a.a.lZL)
        {
          ab.i("MicroMsg.FaceVideoRecorder", "hy: already stopped");
          if (a.r(this.lZv) != null)
            a.r(this.lZv).Lu(a.g(this.lZv).getFilePath());
          AppMethodBeat.o(553);
        }
        else
        {
          if (a.n(this.lZv) != a.a.lZK)
            break;
          ab.i("MicroMsg.FaceVideoRecorder", "hy: stopping. wait");
          AppMethodBeat.o(553);
        }
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("hy: stop record and release");
      ab.i("MicroMsg.FaceVideoRecorder", Thread.currentThread().getName());
      com.tencent.mm.plugin.facedetect.model.d.bsq().b(a.o(this.lZv));
      a.a(this.lZv, a.a.lZK);
      localObject2 = a.g(this.lZv);
      a.8.1 local1 = new com/tencent/mm/plugin/facedetect/e/a$8$1;
      local1.<init>(this);
      ((com.tencent.mm.plugin.mmsight.model.a.d)localObject2).v(local1);
      AppMethodBeat.o(553);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.8
 * JD-Core Version:    0.6.2
 */