package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$15
  implements View.OnClickListener
{
  VoipVideoFragment$15(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(4885);
    h.pYm.e(11079, new Object[] { Integer.valueOf(4) });
    if ((!VoipVideoFragment.l(this.sYn)) && (this.sYn.sVY.get() != null))
      VoipVideoFragment.t(this.sYn).getVisibility();
    int i;
    if (VoipVideoFragment.t(this.sYn).getVisibility() == 0)
    {
      i = 4;
      if (i != 0)
        break label262;
    }
    label262: for (int j = 0; ; j = 8)
    {
      VoipVideoFragment.t(this.sYn).setVisibility(j);
      VoipVideoFragment.x(this.sYn).setVisibility(j);
      VoipVideoFragment.y(this.sYn).setVisibility(j);
      VoipVideoFragment.b(this.sYn).setVisibility(j);
      VoipVideoFragment.a(this.sYn).setVisibility(j);
      paramView = this.sYn;
      if (j == 0)
        bool = true;
      VoipVideoFragment.e(paramView, bool);
      if (ae.gjk)
      {
        VoipVideoFragment.C(this.sYn).setVisibility(j);
        VoipVideoFragment.D(this.sYn).setVisibility(j);
        VoipVideoFragment.E(this.sYn).setVisibility(j);
        VoipVideoFragment.F(this.sYn).setVisibility(j);
        VoipVideoFragment.G(this.sYn).setVisibility(j);
        VoipVideoFragment.H(this.sYn).setVisibility(j);
      }
      if (i == 0)
        VoipVideoFragment.u(this.sYn);
      AppMethodBeat.o(4885);
      return;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.15
 * JD-Core Version:    0.6.2
 */