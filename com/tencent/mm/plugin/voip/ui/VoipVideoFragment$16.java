package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$16
  implements View.OnClickListener
{
  VoipVideoFragment$16(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4886);
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
      ((c)this.sYn.sVY.get()).cJw();
    AppMethodBeat.o(4886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.16
 * JD-Core Version:    0.6.2
 */