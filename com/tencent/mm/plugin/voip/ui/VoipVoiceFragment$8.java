package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VoipVoiceFragment$8
  implements View.OnClickListener
{
  VoipVoiceFragment$8(VoipVoiceFragment paramVoipVoiceFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4946);
    ab.i("MicroMsg.VoipVoiceFragment", "click hangup voice talking button");
    if ((this.sYV.sVY != null) && (this.sYV.sVY.get() != null) && (((c)this.sYV.sVY.get()).cJk()))
      this.sYV.fZ(2131304415, -1);
    AppMethodBeat.o(4946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.8
 * JD-Core Version:    0.6.2
 */