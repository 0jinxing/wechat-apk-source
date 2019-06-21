package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$7
  implements View.OnClickListener
{
  VoipVideoFragment$7(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4876);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "switch camera");
    VoipVideoFragment.t(this.sYn).setEnabled(false);
    VoipVideoFragment.u(this.sYn);
    VoipVideoFragment.t(this.sYn).setEnabled(true);
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null))
      ((c)this.sYn.sVY.get()).cJu();
    AppMethodBeat.o(4876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.7
 * JD-Core Version:    0.6.2
 */