package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.a;
import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$12
  implements View.OnClickListener
{
  EditorView$12(EditorView paramEditorView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138932);
    paramView = EditorView.k(this.smw);
    if (paramView != null)
      paramView.dismiss();
    EditorView.a(this.smw, new c(this.jWS));
    paramView = EditorView.k(this.smw);
    if (paramView != null)
      paramView.slQ = EditorView.h(this.smw);
    paramView = EditorView.k(this.smw);
    if (paramView != null)
      paramView.rYr = EditorView.j(this.smw);
    paramView = EditorView.k(this.smw);
    if (paramView != null)
      paramView.slP = ((a)new EditorView.12.1(this));
    paramView = EditorView.k(this.smw);
    if (paramView != null)
      paramView.slO = ((a)new EditorView.12.2(this));
    paramView = EditorView.k(this.smw);
    if (paramView != null)
    {
      paramView.show();
      AppMethodBeat.o(138932);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(138932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.12
 * JD-Core Version:    0.6.2
 */