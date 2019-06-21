package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorChangeTextView$3
  implements View.OnClickListener
{
  EditorChangeTextView$3(EditorChangeTextView paramEditorChangeTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3057);
    this.lnF.cancel();
    AppMethodBeat.o(3057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.3
 * JD-Core Version:    0.6.2
 */