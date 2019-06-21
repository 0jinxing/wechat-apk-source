package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorChangeTextView$4
  implements View.OnClickListener
{
  EditorChangeTextView$4(EditorChangeTextView paramEditorChangeTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3058);
    Editable localEditable = EditorChangeTextView.b(this.lnF).getText();
    paramView = this.lnF.getCallback();
    if (paramView != null)
      paramView.i((CharSequence)localEditable, EditorChangeTextView.c(this.lnF));
    EditorChangeTextView.b(this.lnF).clearFocus();
    if (this.lnF.getTextChanged())
      EmojiCaptureReporter.a(16, this.lnF.getReporter().ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, this.lnF.getReporter().scene);
    EmojiCaptureReporter.a(15, this.lnF.getReporter().ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, this.lnF.getReporter().scene);
    AppMethodBeat.o(3058);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.4
 * JD-Core Version:    0.6.2
 */