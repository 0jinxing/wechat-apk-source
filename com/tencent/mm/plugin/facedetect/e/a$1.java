package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class a$1
  implements Runnable
{
  a$1(a parama, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(542);
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
      al.d(new a.1.1(this));
      AppMethodBeat.o(542);
      return;
      a.a(this.lZv, this.lZp);
      a.b(this.lZv, this.lZo);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.1
 * JD-Core Version:    0.6.2
 */