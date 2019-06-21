package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"})
final class EditorChangeTextView$1
  implements View.OnFocusChangeListener
{
  EditorChangeTextView$1(EditorChangeTextView paramEditorChangeTextView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(3054);
    EditorChangeTextView.a(this.lnF, paramBoolean);
    AppMethodBeat.o(3054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.1
 * JD-Core Version:    0.6.2
 */