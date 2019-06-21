package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorChangeTextView$5
  implements View.OnClickListener
{
  EditorChangeTextView$5(EditorChangeTextView paramEditorChangeTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3059);
    EditorChangeTextView.b(this.lnF).setText((CharSequence)"");
    AppMethodBeat.o(3059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.5
 * JD-Core Version:    0.6.2
 */