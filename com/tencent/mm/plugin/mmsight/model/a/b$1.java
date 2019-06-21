package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$1
  implements Runnable
{
  b$1(b paramb, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76569);
    b localb = this.ovz;
    ab.i("MicroMsg.FrameBufProcessor", "process srcWidth %d srcHeight %d targetWidth %d targetHeight %d bufIndex: %d", new Object[] { Integer.valueOf(localb.fYx), Integer.valueOf(localb.fYy), Integer.valueOf(localb.eTi), Integer.valueOf(localb.eTj), Integer.valueOf(localb.ovt) });
    if ((localb.eTl == 21) || (localb.eTl == 2130706688))
      SightVideoJNI.NV21ToYUV420XXAndScaleRotate(localb.ovq, localb.ovr, localb.fYx, localb.fYy, localb.eTi, localb.eTj, 1, localb.rotate, localb.ovv, localb.ovx, localb.ovw);
    while (true)
    {
      ab.v("MicroMsg.FrameBufProcessor", "process used %sms %d %d bufIndex %d", new Object[] { Long.valueOf(bo.az(localb.ovu)), Integer.valueOf(localb.ovq.length), Integer.valueOf(localb.ovr.length), Integer.valueOf(localb.ovt) });
      this.ovy.a(this.ovz);
      j.owk.g(this.ovz.ovq);
      AppMethodBeat.o(76569);
      return;
      if (localb.eTl == 19)
        SightVideoJNI.NV21ToYUV420XXAndScaleRotate(localb.ovq, localb.ovr, localb.fYx, localb.fYy, localb.eTi, localb.eTj, 2, localb.rotate, localb.ovv, localb.ovx, localb.ovw);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.b.1
 * JD-Core Version:    0.6.2
 */