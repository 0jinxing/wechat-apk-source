package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$22
  implements View.OnClickListener
{
  VoipVideoFragment$22(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4896);
    h.pYm.e(11619, new Object[] { Integer.valueOf(2) });
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
      ((c)this.sYn.sVY.get()).cJL();
    AppMethodBeat.o(4896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.22
 * JD-Core Version:    0.6.2
 */