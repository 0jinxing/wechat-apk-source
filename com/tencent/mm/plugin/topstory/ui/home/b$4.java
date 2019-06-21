package com.tencent.mm.plugin.topstory.ui.home;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class b$4
  implements Runnable
{
  b$4(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1570);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "hideNavBarShadow");
    this.sCf.sBN.setVisibility(8);
    if ((Build.VERSION.SDK_INT >= 21) && (!com.tencent.mm.sdk.h.b.Mt()))
      this.sCf.sBH.getWindow().setStatusBarColor(this.sCf.sBH.getResources().getColor(2131689495));
    this.sCf.sBS = false;
    if (this.sCf.sBU != null)
      this.sCf.sBU.setScrollEnable(true);
    AppMethodBeat.o(1570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.4
 * JD-Core Version:    0.6.2
 */