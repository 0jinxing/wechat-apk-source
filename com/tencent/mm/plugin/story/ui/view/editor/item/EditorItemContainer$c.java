package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorItemContainer$c
  implements Runnable
{
  EditorItemContainer$c(EditorItemContainer paramEditorItemContainer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110632);
    if (EditorItemContainer.d(this.smW) != null)
    {
      EditorItemContainer localEditorItemContainer = this.smW;
      View localView = EditorItemContainer.d(this.smW);
      if (localView == null)
        j.dWJ();
      localEditorItemContainer.r(localView, false);
    }
    AppMethodBeat.o(110632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.c
 * JD-Core Version:    0.6.2
 */