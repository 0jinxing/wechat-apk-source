package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.c.a.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureContainer$5
  implements View.OnClickListener
{
  CaptureContainer$5(CaptureContainer paramCaptureContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2957);
    paramView = this.lmt.getPresenter();
    if (paramView != null)
    {
      paramView.exit();
      AppMethodBeat.o(2957);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2957);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.5
 * JD-Core Version:    0.6.2
 */