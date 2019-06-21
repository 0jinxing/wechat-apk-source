package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VoipVoiceFragment$9
  implements View.OnClickListener
{
  VoipVoiceFragment$9(VoipVoiceFragment paramVoipVoiceFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4947);
    ab.i("MicroMsg.VoipVoiceFragment", "click cancel voice invite button");
    if ((this.sYV.sVY != null) && (this.sYV.sVY.get() != null) && (((c)this.sYV.sVY.get()).cJs()))
    {
      this.sYV.fZ(2131304371, -1);
      VoipVoiceFragment.j(this.sYV).setEnabled(false);
    }
    AppMethodBeat.o(4947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment.9
 * JD-Core Version:    0.6.2
 */