package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VoipVideoFragment$20
  implements View.OnClickListener
{
  VoipVideoFragment$20(VoipVideoFragment paramVoipVideoFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4894);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "click cancel video invite button");
    if ((this.sYn.sVY != null) && (this.sYn.sVY.get() != null) && (((c)this.sYn.sVY.get()).cJr()))
    {
      VoipVideoFragment.a(this.sYn).setEnabled(false);
      VoipVideoFragment.f(this.sYn).setEnabled(false);
      VoipVideoFragment.g(this.sYn).setVisibility(0);
      VoipVideoFragment.g(this.sYn).setText(2131304371);
    }
    AppMethodBeat.o(4894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.20
 * JD-Core Version:    0.6.2
 */