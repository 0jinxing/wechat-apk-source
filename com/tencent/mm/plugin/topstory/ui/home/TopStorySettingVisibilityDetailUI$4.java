package com.tencent.mm.plugin.topstory.ui.home;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStorySettingVisibilityDetailUI$4
  implements DialogInterface.OnClickListener
{
  TopStorySettingVisibilityDetailUI$4(TopStorySettingVisibilityDetailUI paramTopStorySettingVisibilityDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(1638);
    this.sCO.finish();
    AppMethodBeat.o(1638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI.4
 * JD-Core Version:    0.6.2
 */