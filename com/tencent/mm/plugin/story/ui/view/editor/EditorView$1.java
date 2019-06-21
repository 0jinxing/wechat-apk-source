package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$1
  implements View.OnClickListener
{
  EditorView$1(EditorView paramEditorView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110570);
    paramView = this.smw;
    if (!this.smw.bmC());
    for (boolean bool = true; ; bool = false)
    {
      paramView.gC(bool);
      paramView = h.scu;
      h.EU(6);
      AppMethodBeat.o(110570);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.1
 * JD-Core Version:    0.6.2
 */