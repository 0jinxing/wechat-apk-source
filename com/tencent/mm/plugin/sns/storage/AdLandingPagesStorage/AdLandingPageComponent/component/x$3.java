package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.e;

final class x$3
  implements OfflineVideoView.a
{
  x$3(x paramx)
  {
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(37280);
    al.d(new x.3.2(this, paramInt));
    AppMethodBeat.o(37280);
  }

  public final void EA()
  {
    AppMethodBeat.i(37278);
    x.d(this.rbM);
    x.e(this.rbM);
    AppMethodBeat.o(37278);
  }

  public final boolean a(PString paramPString)
  {
    boolean bool = false;
    AppMethodBeat.i(37277);
    String str1 = x.b(this.rbM).qWF;
    String str2 = h.gk("adId", str1);
    if (e.ct(str2))
    {
      paramPString.value = str2;
      x.c(this.rbM);
      bool = true;
      AppMethodBeat.o(37277);
    }
    while (true)
    {
      return bool;
      h.d("adId", str1, false, 62, new x.3.1(this));
      AppMethodBeat.o(37277);
    }
  }

  public final void onStart(int paramInt)
  {
    AppMethodBeat.i(37279);
    x.f(this.rbM);
    x.a(this.rbM, paramInt);
    this.rbM.raN.setVisibility(0);
    AppMethodBeat.o(37279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.3
 * JD-Core Version:    0.6.2
 */