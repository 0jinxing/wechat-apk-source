package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.editor.item.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$8
  implements View.OnClickListener
{
  EditorView$8(EditorView paramEditorView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110577);
    EditorView localEditorView = this.smw;
    if (!(paramView instanceof f))
      paramView = null;
    while (true)
    {
      EditorView.a(localEditorView, (f)paramView);
      paramView = EditorView.e(this.smw);
      if (paramView != null)
      {
        paramView.setVisibility(8);
        this.smw.a(true, paramView.getText(), paramView.getColor(), paramView.getTextBg());
        AppMethodBeat.o(110577);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(110577);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.8
 * JD-Core Version:    0.6.2
 */