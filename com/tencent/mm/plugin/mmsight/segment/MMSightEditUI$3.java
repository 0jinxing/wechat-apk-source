package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class MMSightEditUI$3
  implements e.a
{
  MMSightEditUI$3(MMSightEditUI paramMMSightEditUI)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(54967);
    MMSightEditUI.j(this.oxT).d(0.0D, true);
    AppMethodBeat.o(54967);
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
    AppMethodBeat.i(54965);
    ab.e("MicroMsg.MMSightEditUI", "%d on error what %d extra %d", new Object[] { Integer.valueOf(this.oxT.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(54965);
  }

  public final void pL()
  {
    AppMethodBeat.i(54966);
    if (MMSightEditUI.j(this.oxT) != null)
    {
      MMSightEditUI.j(this.oxT).start();
      MMSightEditUI.j(this.oxT).setLoop(true);
      MMSightEditUI.j(this.oxT).setAlpha(1.0F);
      al.n(new MMSightEditUI.3.1(this), 300L);
    }
    AppMethodBeat.o(54966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.MMSightEditUI.3
 * JD-Core Version:    0.6.2
 */