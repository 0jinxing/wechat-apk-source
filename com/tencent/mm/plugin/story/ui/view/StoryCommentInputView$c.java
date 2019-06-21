package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryCommentInputView$c
  implements Runnable
{
  StoryCommentInputView$c(StoryCommentInputView paramStoryCommentInputView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110394);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.sjp.getContext().getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localInputMethodManager.showSoftInput((View)StoryCommentInputView.a(this.sjp), 0);
      AppMethodBeat.o(110394);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.c
 * JD-Core Version:    0.6.2
 */