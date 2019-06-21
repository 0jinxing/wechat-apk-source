package com.tencent.mm.plugin.voiceprint.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseVoicePrintUI$2
  implements View.OnClickListener
{
  BaseVoicePrintUI$2(BaseVoicePrintUI paramBaseVoicePrintUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26131);
    this.sLV.finish();
    AppMethodBeat.o(26131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.2
 * JD-Core Version:    0.6.2
 */