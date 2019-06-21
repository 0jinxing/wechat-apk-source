package com.tencent.mm.plugin.story.ui.view;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "textView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "keyEvent", "Landroid/view/KeyEvent;", "onEditorAction"})
final class StoryCommentInputView$3
  implements TextView.OnEditorActionListener
{
  StoryCommentInputView$3(StoryCommentInputView paramStoryCommentInputView)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(138899);
    if (4 != paramInt)
    {
      j.o(paramKeyEvent, "keyEvent");
      if (paramKeyEvent.getAction() != 66);
    }
    else if (StoryCommentInputView.b(this.sjp))
    {
      paramTextView = h.scu;
      h.EX(9);
      paramKeyEvent = StoryCommentInputView.a(this.sjp).getText();
      if (paramKeyEvent != null)
      {
        StoryCommentInputView.i(this.sjp);
        paramTextView = this.sjp.getCommentInputCallback();
        if (paramTextView != null)
          paramTextView.m(paramKeyEvent.toString(), Boolean.TRUE);
      }
    }
    AppMethodBeat.o(138899);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.3
 * JD-Core Version:    0.6.2
 */