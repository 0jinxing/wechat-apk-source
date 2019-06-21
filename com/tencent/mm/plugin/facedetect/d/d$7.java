package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$7
  implements Runnable
{
  d$7(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(317);
    synchronized (this.lVO.lVI)
    {
      if (!this.lVO.lVC)
      {
        ab.w("MicroMsg.NumberFaceMotion", "hy: not triggered symbol. auto start");
        this.lVO.lVC = true;
        d.b(this.lVO);
        AppMethodBeat.o(317);
        return;
      }
      ab.i("MicroMsg.NumberFaceMotion", "hy: user already start. do nothing");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d.7
 * JD-Core Version:    0.6.2
 */