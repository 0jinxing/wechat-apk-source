package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class SightCaptureUI$20
  implements e.a
{
  SightCaptureUI$20(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(55217);
    SightCaptureUI.T(this.oDf).d(0.0D, true);
    AppMethodBeat.o(55217);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55215);
    ab.e("MicroMsg.SightCaptureUI", "%d on error what %d extra %d", new Object[] { Integer.valueOf(this.oDf.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(55215);
  }

  public final void pL()
  {
    AppMethodBeat.i(55216);
    if (SightCaptureUI.T(this.oDf) != null)
    {
      SightCaptureUI.T(this.oDf).start();
      SightCaptureUI.T(this.oDf).setLoop(true);
    }
    al.af(SightCaptureUI.N(this.oDf));
    SightCaptureUI.T(this.oDf).setOneTimeVideoTextureUpdateCallback(new SightCaptureUI.20.1(this));
    AppMethodBeat.o(55216);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.20
 * JD-Core Version:    0.6.2
 */