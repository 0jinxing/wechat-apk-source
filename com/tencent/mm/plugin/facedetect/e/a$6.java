package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$6
  implements Runnable
{
  a$6(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(550);
    synchronized (a.a(this.lZv))
    {
      if (a.n(this.lZv) == a.a.lZH)
      {
        ab.e("MicroMsg.FaceVideoRecorder", "hy: not started. should not happen");
        a.d(this.lZv);
        AppMethodBeat.o(550);
      }
      while (true)
      {
        return;
        if (a.n(this.lZv) != a.a.lZJ)
          break;
        ab.w("MicroMsg.FaceVideoRecorder", "hy: already started or wait start");
        AppMethodBeat.o(550);
      }
      ab.i("MicroMsg.FaceVideoRecorder", "hy: startRecord record");
      com.tencent.mm.plugin.facedetect.model.d.bsq().a(a.o(this.lZv));
      a.g(this.lZv).b(a.k(this.lZv), a.p(this.lZv), a.q(this.lZv));
      a.a(this.lZv, a.a.lZJ);
      AppMethodBeat.o(550);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.6
 * JD-Core Version:    0.6.2
 */