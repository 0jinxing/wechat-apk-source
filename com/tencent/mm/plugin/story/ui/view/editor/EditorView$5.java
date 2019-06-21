package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$5
  implements View.OnClickListener
{
  EditorView$5(EditorView paramEditorView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110574);
    paramView = this.smw;
    CharSequence localCharSequence = (CharSequence)"";
    EditorInputView.b localb = EditorInputView.slG;
    int i = EditorInputView.cCy();
    localb = EditorInputView.slG;
    paramView.a(true, localCharSequence, i, EditorInputView.cCz());
    paramView = h.scu;
    h.EU(8);
    AppMethodBeat.o(110574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.5
 * JD-Core Version:    0.6.2
 */