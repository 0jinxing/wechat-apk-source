package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class TextEditorItemView$b
  implements Runnable
{
  TextEditorItemView$b(TextEditorItemView paramTextEditorItemView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3110);
    EditorItemContainer localEditorItemContainer = this.loA.getItemContainer();
    if (localEditorItemContainer != null)
    {
      localEditorItemContainer.setEditing((a)this.loA);
      AppMethodBeat.o(3110);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3110);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView.b
 * JD-Core Version:    0.6.2
 */