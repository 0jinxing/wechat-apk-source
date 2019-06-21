package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.d.b.a;
import com.tencent.mm.plugin.story.g.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$11
  implements View.OnClickListener
{
  EditorView$11(EditorView paramEditorView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110580);
    this.smw.getPresenter().Ab();
    paramView = h.scu;
    h.EU(12);
    AppMethodBeat.o(110580);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.11
 * JD-Core Version:    0.6.2
 */