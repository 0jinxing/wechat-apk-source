package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class VoipVoiceFragment$1
  implements View.OnClickListener
{
  VoipVoiceFragment$1(VoipVoiceFragment paramVoipVoiceFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4938);
    h.pYm.e(11618, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
    if ((this.sYV.sVY != null) && (this.sYV.sVY.get() != null))
      ((c)this.sYV.sVY.get()).mv(true);
    if (this.sYV.sWu != null)
      this.sYV.sWu.S(false, true);
    AppMethodBeat.o(4938);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.1
 * JD-Core Version:    0.6.2
 */