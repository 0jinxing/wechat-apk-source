package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
final class StoryCommentView$f
  implements DialogInterface.OnDismissListener
{
  StoryCommentView$f(StoryCommentView paramStoryCommentView, StoryCommentInputView paramStoryCommentInputView)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(110419);
    this.sjP.oE(2);
    if (!StoryCommentView.e(this.sjP))
      StoryCommentView.a(this.sjP, this.sjT.getContent());
    this.sjT.eAk.destroy();
    AppMethodBeat.o(110419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.f
 * JD-Core Version:    0.6.2
 */