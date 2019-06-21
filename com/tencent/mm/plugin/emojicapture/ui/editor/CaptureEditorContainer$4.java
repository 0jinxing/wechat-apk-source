package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.c.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureEditorContainer$4
  implements View.OnClickListener
{
  CaptureEditorContainer$4(CaptureEditorContainer paramCaptureEditorContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3028);
    paramView = this.lnr.getPresenter();
    if (paramView != null)
    {
      paramView.Ab();
      AppMethodBeat.o(3028);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3028);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.4
 * JD-Core Version:    0.6.2
 */