package com.tencent.mm.plugin.voip.ui;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$4
  implements View.OnClickListener
{
  VoipVideoFragment$4(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4873);
    paramView = this.sYn;
    boolean bool;
    label46: int i;
    if (!VoipVideoFragment.l(this.sYn))
    {
      bool = true;
      VoipVideoFragment.c(paramView, bool);
      paramView = this.sYn;
      if (VoipVideoFragment.l(this.sYn))
        break label300;
      bool = true;
      paramView = VoipVideoFragment.d(paramView, bool);
      VoipVideoFragment.m(this.sYn).gc(paramView.x, paramView.y);
      ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: mGlSmallVideoView clicked!");
      if ((this.sYn.sXS & 0x1) == 0)
        break label305;
      i = 1;
      label91: if (i == 0)
        break label310;
      if (!VoipVideoFragment.i(this.sYn))
      {
        this.sYn.sXP.setVisibility(4);
        this.sYn.sWp.removeView(this.sYn.sXP);
        this.sYn.sWp.addView(this.sYn.sXQ);
        ((c)this.sYn.sVY.get()).b(this.sYn.sXQ);
        VoipVideoFragment.a(this.sYn, true);
        ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: change hw texture view!");
      }
      VoipVideoFragment.m(this.sYn).setVisibility(4);
      this.sYn.sXQ.setVisibility(0);
      this.sYn.sXQ.bringToFront();
      VoipVideoFragment.n(this.sYn).setVisibility(0);
    }
    while (true)
    {
      VoipVideoFragment.o(this.sYn).setVoipBeauty(this.sYn.sXT);
      VoipVideoFragment.p(this.sYn).setVoipBeauty(this.sYn.sXT);
      h.pYm.e(11079, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(4873);
      return;
      bool = false;
      break;
      label300: bool = false;
      break label46;
      label305: i = 0;
      break label91;
      label310: VoipVideoFragment.m(this.sYn).setVisibility(0);
      this.sYn.sXQ.setVisibility(4);
      VoipVideoFragment.m(this.sYn).bringToFront();
      VoipVideoFragment.n(this.sYn).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.4
 * JD-Core Version:    0.6.2
 */