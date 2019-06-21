package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureEditorContainer$2
  implements View.OnClickListener
{
  CaptureEditorContainer$2(CaptureEditorContainer paramCaptureEditorContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3026);
    EmojiCaptureReporter.a(11, CaptureEditorContainer.c(this.lnr).ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, CaptureEditorContainer.c(this.lnr).scene);
    Object localObject = CaptureEditorContainer.h(this.lnr);
    paramView = this.lnr.getPresenter();
    boolean bool;
    if (paramView != null)
    {
      bool = paramView.bmy();
      ((View)localObject).setSelected(bool);
      localObject = CaptureEditorContainer.i(this.lnr);
      if (!CaptureEditorContainer.h(this.lnr).isSelected())
        break label116;
    }
    label116: for (paramView = CaptureEditorContainer.j(this.lnr); ; paramView = CaptureEditorContainer.k(this.lnr))
    {
      ((ImageView)localObject).setImageDrawable(paramView);
      AppMethodBeat.o(3026);
      return;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.2
 * JD-Core Version:    0.6.2
 */