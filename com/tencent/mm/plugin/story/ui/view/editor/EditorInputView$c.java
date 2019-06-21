package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorInputView$c
  implements Runnable
{
  EditorInputView$c(EditorInputView paramEditorInputView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110556);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.slH.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localInputMethodManager.showSoftInput((View)EditorInputView.a(this.slH), 0);
      AppMethodBeat.o(110556);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110556);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView.c
 * JD-Core Version:    0.6.2
 */