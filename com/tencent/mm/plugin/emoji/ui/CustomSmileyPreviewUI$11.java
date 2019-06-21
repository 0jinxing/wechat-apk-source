package com.tencent.mm.plugin.emoji.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CustomSmileyPreviewUI$11
  implements View.OnClickListener
{
  CustomSmileyPreviewUI$11(CustomSmileyPreviewUI paramCustomSmileyPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53235);
    Toast.makeText(this.kYV.mController.ylL, "isHevc:" + CustomSmileyPreviewUI.e(this.kYV).eAi, 0).show();
    AppMethodBeat.o(53235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.11
 * JD-Core Version:    0.6.2
 */