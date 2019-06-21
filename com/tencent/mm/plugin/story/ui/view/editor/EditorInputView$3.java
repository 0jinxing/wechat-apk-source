package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorInputView$3
  implements View.OnClickListener
{
  EditorInputView$3(EditorInputView paramEditorInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110552);
    paramView = EditorInputView.a(this.slH).getText();
    EditorInputView.a locala = this.slH.getCallback();
    if (locala != null)
      locala.e((CharSequence)paramView, EditorInputView.b(this.slH), EditorInputView.c(this.slH));
    EditorInputView.a(this.slH).clearFocus();
    AppMethodBeat.o(110552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView.3
 * JD-Core Version:    0.6.2
 */