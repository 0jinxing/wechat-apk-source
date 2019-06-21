package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorAudioSearchView$n
  implements Runnable
{
  EditorAudioSearchView$n(EditorAudioSearchView paramEditorAudioSearchView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110487);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.skR.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localInputMethodManager.showSoftInput((View)EditorAudioSearchView.a(this.skR), 0);
      AppMethodBeat.o(110487);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110487);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioSearchView.n
 * JD-Core Version:    0.6.2
 */