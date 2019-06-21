package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$1
  implements View.OnClickListener
{
  VoipVideoFragment$1(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4870);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "hangup video talking");
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null) && (((c)this.sYn.sVY.get()).cJk()))
    {
      VoipVideoFragment.a(this.sYn).setEnabled(false);
      VoipVideoFragment.b(this.sYn).setEnabled(false);
      this.sYn.fZ(2131304415, -1);
    }
    AppMethodBeat.o(4870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.1
 * JD-Core Version:    0.6.2
 */