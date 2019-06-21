package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.b;
import com.tencent.mm.plugin.mmsight.model.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1$1$1
  implements Runnable
{
  a$1$1$1(a.1.1 param1, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(540);
    synchronized (a.a(this.lZy.lZw.lZv))
    {
      ab.i("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", new Object[] { Long.valueOf(bo.az(this.lZx)) });
      long l = bo.yz();
      a.a(this.lZy.lZw.lZv, a.e(this.lZy.lZw.lZv).asl());
      a.g(this.lZy.lZw.lZv).setFilePath(a.f(this.lZy.lZw.lZv));
      a.g(this.lZy.lZw.lZv).mb(a.h(this.lZy.lZw.lZv));
      a.g(this.lZy.lZw.lZv).cv(this.lZy.lZw.lZs);
      a.g(this.lZy.lZw.lZv).s(a.i(this.lZy.lZw.lZv), a.j(this.lZy.lZw.lZv), this.lZy.lZw.lZt, this.lZy.lZw.lZu);
      a.g(this.lZy.lZw.lZv).ko(a.k(this.lZy.lZw.lZv));
      a.g(this.lZy.lZw.lZv).a(a.l(this.lZy.lZw.lZv));
      a.a(this.lZy.lZw.lZv, a.a.lZI);
      ab.i("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", new Object[] { Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(540);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.1.1.1
 * JD-Core Version:    0.6.2
 */