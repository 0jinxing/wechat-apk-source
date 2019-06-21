package com.tencent.mm.plugin.voip.ui;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.video.MovableTextureView;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$5
  implements View.OnClickListener
{
  VoipVideoFragment$5(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4874);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: hwTxtureViewSmall clicked!");
    if (VoipVideoFragment.i(this.sYn))
    {
      paramView = this.sYn;
      if (VoipVideoFragment.l(this.sYn))
        break label332;
      bool = true;
      VoipVideoFragment.c(paramView, bool);
      paramView = this.sYn;
      if (VoipVideoFragment.l(this.sYn))
        break label337;
    }
    label332: label337: for (boolean bool = true; ; bool = false)
    {
      Object localObject = VoipVideoFragment.d(paramView, bool);
      paramView = (MovableTextureView)this.sYn.sXQ;
      int i = ((Point)localObject).x;
      int j = ((Point)localObject).y;
      localObject = (RelativeLayout.LayoutParams)paramView.getLayoutParams();
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i, j);
      localLayoutParams.leftMargin = ((RelativeLayout.LayoutParams)localObject).leftMargin;
      localLayoutParams.topMargin = ((RelativeLayout.LayoutParams)localObject).topMargin;
      paramView.mWidth = i;
      paramView.sZX = j;
      paramView.setLayoutParams(localLayoutParams);
      this.sYn.sXQ.setVisibility(4);
      VoipVideoFragment.q(this.sYn);
      this.sYn.sXP.setVisibility(0);
      VoipVideoFragment.m(this.sYn).setVisibility(0);
      ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: change to big hw texture view!");
      paramView = new RelativeLayout.LayoutParams(-1, -2);
      paramView.addRule(13);
      j = this.sYn.sWp.indexOfChild(VoipVideoFragment.n(this.sYn));
      this.sYn.sWp.removeView(this.sYn.sXQ);
      this.sYn.sWp.addView(this.sYn.sXP, j + 1, paramView);
      ((c)this.sYn.sVY.get()).b(this.sYn.sXP);
      VoipVideoFragment.a(this.sYn, false);
      h.pYm.e(11079, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(4874);
      return;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.5
 * JD-Core Version:    0.6.2
 */