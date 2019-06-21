package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoicePrintFinishUI$1
  implements View.OnClickListener
{
  VoicePrintFinishUI$1(VoicePrintFinishUI paramVoicePrintFinishUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26205);
    if (VoicePrintFinishUI.a(this.sMs) == 72)
    {
      paramView = new Intent();
      paramView.setClass(this.sMs, VoiceUnLockUI.class);
      paramView.putExtra("kscene_type", 73);
      this.sMs.startActivity(paramView);
    }
    this.sMs.finish();
    AppMethodBeat.o(26205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoicePrintFinishUI.1
 * JD-Core Version:    0.6.2
 */