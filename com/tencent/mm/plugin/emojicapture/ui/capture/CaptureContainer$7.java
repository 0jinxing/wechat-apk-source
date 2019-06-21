package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureBeautySettingUI;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureContainer$7
  implements View.OnClickListener
{
  CaptureContainer$7(Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2959);
    paramView = new Intent(this.jWS, EmojiCaptureBeautySettingUI.class);
    this.jWS.startActivity(paramView);
    AppMethodBeat.o(2959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.7
 * JD-Core Version:    0.6.2
 */