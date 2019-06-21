package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$insectBottom$1$1"})
final class EditorAudioView$c
  implements Runnable
{
  EditorAudioView$c(View paramView, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110517);
    this.slj.setPadding(this.slj.getPaddingLeft(), this.slj.getPaddingTop(), this.slj.getPaddingRight(), this.slk);
    this.slj.requestLayout();
    AppMethodBeat.o(110517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.c
 * JD-Core Version:    0.6.2
 */