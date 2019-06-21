package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$3$1
  implements Runnable
{
  a$3$1(a.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(546);
    final long l = bo.yz();
    a.m(this.lZB.lZv).connect(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(545);
        synchronized (a.a(a.3.1.this.lZB.lZv))
        {
          ab.i("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", new Object[] { Long.valueOf(bo.az(l)) });
          long l = bo.yz();
          a.a(a.3.1.this.lZB.lZv, a.e(a.3.1.this.lZB.lZv).asl());
          a.g(a.3.1.this.lZB.lZv).setFilePath(a.f(a.3.1.this.lZB.lZv));
          a.g(a.3.1.this.lZB.lZv).mb(a.h(a.3.1.this.lZB.lZv));
          a.g(a.3.1.this.lZB.lZv).cv(true);
          a.g(a.3.1.this.lZB.lZv).s(a.i(a.3.1.this.lZB.lZv), a.j(a.3.1.this.lZB.lZv), a.3.1.this.lZB.lZt, a.3.1.this.lZB.lZu);
          a.g(a.3.1.this.lZB.lZv).ko(a.k(a.3.1.this.lZB.lZv));
          a.g(a.3.1.this.lZB.lZv).a(a.l(a.3.1.this.lZB.lZv));
          a.a(a.3.1.this.lZB.lZv, a.a.lZI);
          ab.i("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", new Object[] { Long.valueOf(bo.az(l)) });
          if (a.3.1.this.lZB.lZA != null)
            a.3.1.this.lZB.lZA.run();
          AppMethodBeat.o(545);
          return;
        }
      }
    });
    AppMethodBeat.o(546);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.3.1
 * JD-Core Version:    0.6.2
 */