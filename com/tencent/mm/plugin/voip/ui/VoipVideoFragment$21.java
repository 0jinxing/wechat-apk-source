package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$21
  implements View.OnClickListener
{
  VoipVideoFragment$21(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4895);
    if (System.currentTimeMillis() - VoipVideoFragment.h(this.sYn) <= 1000L)
    {
      AppMethodBeat.o(4895);
      return;
    }
    VoipVideoFragment.a(this.sYn, System.currentTimeMillis());
    h.pYm.e(11618, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
    {
      ((c)this.sYn.sVY.get()).mv(true);
      if (!VoipVideoFragment.i(this.sYn))
        break label188;
      this.sYn.sWp.removeView(this.sYn.sXQ);
    }
    while (true)
    {
      VoipVideoFragment.a(this.sYn, false);
      if (this.sYn.sWu != null)
      {
        this.sYn.cJD();
        this.sYn.sWu.S(false, true);
      }
      AppMethodBeat.o(4895);
      break;
      label188: this.sYn.sWp.removeView(this.sYn.sXP);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.21
 * JD-Core Version:    0.6.2
 */