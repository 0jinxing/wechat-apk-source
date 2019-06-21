package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$7
  implements Runnable
{
  a$7(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(551);
    synchronized (a.a(this.lZv))
    {
      if (a.n(this.lZv) == a.a.lZH)
      {
        ab.e("MicroMsg.FaceVideoRecorder", "hy: not started when cancel. should not happen");
        a.d(this.lZv);
        AppMethodBeat.o(551);
        return;
      }
      ab.i("MicroMsg.FaceVideoRecorder", "hy: cancel record");
      a.g(this.lZv).cancel();
      a.d(this.lZv);
      com.tencent.mm.plugin.facedetect.model.d.bsq().b(a.o(this.lZv));
      a.a(this.lZv, a.a.lZM);
      a.m(this.lZv).release();
      AppMethodBeat.o(551);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.7
 * JD-Core Version:    0.6.2
 */