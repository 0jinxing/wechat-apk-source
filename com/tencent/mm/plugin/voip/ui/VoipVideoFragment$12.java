package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$12
  implements View.OnClickListener
{
  VoipVideoFragment$12(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4881);
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
      ((c)this.sYn.sVY.get()).cJw();
    AppMethodBeat.o(4881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.12
 * JD-Core Version:    0.6.2
 */