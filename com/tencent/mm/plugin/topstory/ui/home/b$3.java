package com.tencent.mm.plugin.topstory.ui.home;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;

final class b$3
  implements Runnable
{
  b$3(b paramb, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1569);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "showNavBarShadow %s, %s", new Object[] { Integer.valueOf(this.itf), Integer.valueOf(this.sCg) });
    int i = this.itf + 16581375 * this.sCg;
    this.sCf.sBN.setBackgroundColor(i);
    this.sCf.sBN.setVisibility(0);
    if ((Build.VERSION.SDK_INT >= 21) && (!com.tencent.mm.sdk.h.b.Mt()))
      this.sCf.sBH.getWindow().setStatusBarColor(ah.s(i, this.sCf.sBH.getResources().getColor(2131689495)));
    this.sCf.sBS = true;
    this.sCf.sBN.setOnClickListener(new b.3.1(this));
    if (this.sCf.sBU != null)
      this.sCf.sBU.setScrollEnable(false);
    AppMethodBeat.o(1569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.3
 * JD-Core Version:    0.6.2
 */