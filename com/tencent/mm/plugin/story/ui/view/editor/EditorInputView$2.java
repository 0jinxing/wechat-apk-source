package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorInputView$2
  implements View.OnClickListener
{
  EditorInputView$2(EditorInputView paramEditorInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110551);
    EditorInputView localEditorInputView = this.slH;
    paramView = localEditorInputView.slA;
    if (paramView != null)
      paramView.onCancel();
    localEditorInputView.slx.clearFocus();
    AppMethodBeat.o(110551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView.2
 * JD-Core Version:    0.6.2
 */