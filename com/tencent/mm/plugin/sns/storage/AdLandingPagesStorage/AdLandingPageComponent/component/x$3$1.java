package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.sdk.platformtools.ab;

final class x$3$1
  implements f.a
{
  x$3$1(x.3 param3)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37275);
    ab.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video view height " + this.rbN.rbM.contentView.getHeight() + ", player height " + x.a(this.rbN.rbM).getHeight());
    x.a(this.rbN.rbM, false);
    x.a(this.rbN.rbM, paramString);
    x.a(this.rbN.rbM).Mj(paramString);
    x.c(this.rbN.rbM);
    AppMethodBeat.o(37275);
  }

  public final void cmD()
  {
    AppMethodBeat.i(37274);
    ab.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "video download fail");
    x.a(this.rbN.rbM, true);
    AppMethodBeat.o(37274);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.3.1
 * JD-Core Version:    0.6.2
 */