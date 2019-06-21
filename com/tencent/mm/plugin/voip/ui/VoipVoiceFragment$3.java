package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class VoipVoiceFragment$3
  implements View.OnClickListener
{
  VoipVoiceFragment$3(VoipVoiceFragment paramVoipVoiceFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4941);
    h.pYm.e(11619, new Object[] { Integer.valueOf(3) });
    if ((this.sYV.sVY != null) && (this.sYV.sVY.get() != null))
      ((c)this.sYV.sVY.get()).cJL();
    AppMethodBeat.o(4941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.3
 * JD-Core Version:    0.6.2
 */