package com.tencent.mm.media.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/media/encoder/X264TransEncoder$writeRGBData$1$1"})
public final class g$c
  implements Runnable
{
  public g$c(g paramg, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(12965);
    if ((g.b(this.eVX)) || (g.c(this.eVX)))
    {
      ab.e("MicroMsg.X264TransEncoder", "writeRGBData, already stop or cancel, ignore");
      AppMethodBeat.o(12965);
    }
    while (true)
    {
      return;
      long l = bo.yz();
      byte[] arrayOfByte = j.owk.g(Integer.valueOf(this.eVY * this.eVZ * 3 / 2));
      SightVideoJNI.rgbaToNV21(this.eWa, arrayOfByte, this.eVY, this.eVZ);
      ab.i("MicroMsg.X264TransEncoder", "rgbaToNV21 cost " + bo.az(l) + "ms");
      l = bo.yz();
      SightVideoJNI.writeYuvDataForMMSight(g.d(this.eVX), arrayOfByte, arrayOfByte.length, this.eVY, this.eVZ, false, false, this.eVY, this.eVZ);
      Object localObject = new StringBuilder("writeRGBData ").append(this.eVY).append(", ").append(this.eVZ).append(" cost ").append(bo.az(l)).append("ms, ");
      g localg = this.eVX;
      int i = g.e(localg);
      g.a(localg, i + 1);
      ab.i("MicroMsg.X264TransEncoder", i);
      j.owk.g(arrayOfByte);
      if (!g.f(this.eVX))
      {
        localObject = g.h(this.eVX);
        if (localObject != null)
          ((Thread)localObject).start();
        g.g(this.eVX);
      }
      AppMethodBeat.o(12965);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.g.c
 * JD-Core Version:    0.6.2
 */