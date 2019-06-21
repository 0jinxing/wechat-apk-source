package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorChangeTextView$b
  implements Runnable
{
  EditorChangeTextView$b(EditorChangeTextView paramEditorChangeTextView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3062);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.lnF.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localInputMethodManager.showSoftInput((View)EditorChangeTextView.b(this.lnF), 0);
      AppMethodBeat.o(3062);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3062);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.b
 * JD-Core Version:    0.6.2
 */