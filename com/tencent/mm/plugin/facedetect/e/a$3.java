package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class a$3
  implements Runnable
{
  public a$3(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(547);
    if ((this.lZn == 90) || (this.lZn == 270))
    {
      ab.i("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down");
      a.a(this.lZv, this.lZo);
      a.b(this.lZv, this.lZp);
    }
    synchronized (a.a(this.lZv))
    {
      a.c(this.lZv, this.lZn);
      a.a(this.lZv, this.lZq);
      a.d(this.lZv, this.lZr);
      a.b(this.lZv);
      a.c(this.lZv);
      a.d(this.lZv);
      al.d(new a.3.1(this));
      AppMethodBeat.o(547);
      return;
      a.a(this.lZv, this.lZp);
      a.b(this.lZv, this.lZo);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.3
 * JD-Core Version:    0.6.2
 */