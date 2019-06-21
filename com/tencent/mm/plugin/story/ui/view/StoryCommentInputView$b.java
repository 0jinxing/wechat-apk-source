package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$OnTextOperationListener;", "append", "", "text", "", "del", "onToSendTextEnable", "enable", "", "performSend", "plugin-story_release"})
public final class StoryCommentInputView$b
  implements ChatFooterPanel.a
{
  public final void aRg()
  {
    AppMethodBeat.i(110393);
    StoryCommentInputView.a(this.sjp).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    StoryCommentInputView.a(this.sjp).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    AppMethodBeat.o(110393);
  }

  public final void aYY()
  {
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(110392);
    StoryCommentInputView.a(this.sjp).asB(paramString);
    AppMethodBeat.o(110392);
  }

  public final void fC(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.b
 * JD-Core Version:    0.6.2
 */