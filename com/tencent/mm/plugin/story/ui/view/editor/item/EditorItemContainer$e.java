package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorItemContainer$e
  implements Runnable
{
  EditorItemContainer$e(EditorItemContainer paramEditorItemContainer, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110635);
    if (EditorItemContainer.a(this.smW) != null)
      EditorItemContainer.c(this.smW).removeView((View)EditorItemContainer.a(this.smW));
    EditorItemContainer.b(this.smW);
    a locala = this.lix;
    if (locala != null)
    {
      locala.invoke();
      AppMethodBeat.o(110635);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.e
 * JD-Core Version:    0.6.2
 */