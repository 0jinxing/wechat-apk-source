package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorInputView$4
  implements View.OnClickListener
{
  EditorInputView$4(EditorInputView paramEditorInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110553);
    EditorInputView.a(this.slH).requestFocus();
    AppMethodBeat.o(110553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView.4
 * JD-Core Version:    0.6.2
 */