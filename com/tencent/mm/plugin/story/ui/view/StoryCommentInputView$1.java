package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "plugin-story_release"})
public final class StoryCommentInputView$1
  implements TextWatcher
{
  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(110388);
    int k;
    boolean bool;
    if (paramEditable != null)
    {
      int i = ((CharSequence)paramEditable).length();
      int j = 60 - i;
      StoryCommentInputView localStoryCommentInputView = this.sjp;
      if (((CharSequence)paramEditable).length() > 0)
      {
        k = 1;
        if ((k == 0) || (j < 0) || (StoryCommentInputView.a(this.sjp).getLineCount() > 10))
          break label146;
        bool = true;
        label72: StoryCommentInputView.a(localStoryCommentInputView, bool);
        if (i < 55)
          break label177;
        StoryCommentInputView.c(this.sjp).setVisibility(0);
        StoryCommentInputView.c(this.sjp).setText((CharSequence)String.valueOf(j));
        if (j < 0)
          break label152;
        StoryCommentInputView.c(this.sjp).setTextColor(StoryCommentInputView.d(this.sjp));
        AppMethodBeat.o(110388);
      }
    }
    while (true)
    {
      return;
      k = 0;
      break;
      label146: bool = false;
      break label72;
      label152: StoryCommentInputView.c(this.sjp).setTextColor(StoryCommentInputView.e(this.sjp));
      AppMethodBeat.o(110388);
      continue;
      label177: StoryCommentInputView.c(this.sjp).setVisibility(8);
      AppMethodBeat.o(110388);
      continue;
      StoryCommentInputView.a(this.sjp, false);
      StoryCommentInputView.c(this.sjp).setVisibility(8);
      AppMethodBeat.o(110388);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.1
 * JD-Core Version:    0.6.2
 */