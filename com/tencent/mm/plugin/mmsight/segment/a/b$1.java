package com.tencent.mm.plugin.mmsight.segment.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.c;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements c
{
  b$1(b paramb)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(3709);
    if (this.oAj.fqL)
      this.oAj.oAb.yI(this.oAj.oAd);
    AppMethodBeat.o(3709);
  }

  public final void S(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3712);
    this.oAj.oAc = paramInt3;
    if (this.oAj.oAg != null)
      this.oAj.oAg.aa(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(3712);
  }

  public final void bnT()
  {
    AppMethodBeat.i(3711);
    ab.i("MicroMsg.MMSegmentVideoPlayer", "onSeekComplete, onSeekCompleteListener: %s", new Object[] { this.oAj.oAi });
    if (this.oAj.oAi != null)
    {
      this.oAj.oAi.cf(this.oAj.oAb);
      AppMethodBeat.o(3711);
    }
    while (true)
    {
      return;
      if (this.oAj.cFy)
        this.oAj.oAb.start();
      AppMethodBeat.o(3711);
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3710);
    if (this.oAj.oAf != null)
      this.oAj.oAf.ey(paramInt1, paramInt2);
    AppMethodBeat.o(3710);
  }

  public final void pL()
  {
    AppMethodBeat.i(3708);
    if (this.oAj.oAh != null)
      this.oAj.oAh.ce(this.oAj.oAb);
    if (this.oAj.cFy)
      this.oAj.oAb.start();
    this.oAj.VN = true;
    AppMethodBeat.o(3708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.b.1
 * JD-Core Version:    0.6.2
 */