package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureEditorContainer$5
  implements View.OnClickListener
{
  CaptureEditorContainer$5(CaptureEditorContainer paramCaptureEditorContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3029);
    CaptureEditorContainer.c(this.lnr).lgR = (System.currentTimeMillis() - CaptureEditorContainer.c(this.lnr).lgN);
    EmojiCaptureReporter.a(17, CaptureEditorContainer.c(this.lnr).ezZ, 0L, 0L, CaptureEditorContainer.c(this.lnr).lgR, 0L, 0L, 0, 0, CaptureEditorContainer.c(this.lnr).scene);
    EmojiCaptureReporter.up(3);
    paramView = this.lnr.getPresenter();
    if (paramView != null)
    {
      paramView.bmz();
      AppMethodBeat.o(3029);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.5
 * JD-Core Version:    0.6.2
 */