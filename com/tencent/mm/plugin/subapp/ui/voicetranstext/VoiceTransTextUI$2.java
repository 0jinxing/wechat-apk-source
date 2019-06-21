package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class VoiceTransTextUI$2
  implements View.OnLongClickListener
{
  VoiceTransTextUI$2(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(25593);
    ab.d("MicroMsg.VoiceTransTextUI", "onLongClick");
    paramView = this.swl;
    String str = this.swl.getString(2131296875);
    VoiceTransTextUI.2.1 local1 = new VoiceTransTextUI.2.1(this);
    h.a(paramView, "", new String[] { str }, "", local1);
    AppMethodBeat.o(25593);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI.2
 * JD-Core Version:    0.6.2
 */