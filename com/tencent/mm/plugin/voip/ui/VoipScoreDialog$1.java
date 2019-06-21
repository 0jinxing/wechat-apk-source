package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipScoreDialog$1
  implements View.OnClickListener
{
  VoipScoreDialog$1(VoipScoreDialog paramVoipScoreDialog, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4856);
    VoipScoreDialog.a(this.sWP, this.val$index);
    AppMethodBeat.o(4856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipScoreDialog.1
 * JD-Core Version:    0.6.2
 */