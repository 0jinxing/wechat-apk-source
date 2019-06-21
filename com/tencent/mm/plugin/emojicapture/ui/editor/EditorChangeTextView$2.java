package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "plugin-emojicapture_release"})
public final class EditorChangeTextView$2
  implements TextWatcher
{
  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(3055);
    int i;
    if (paramEditable != null)
      if (((CharSequence)paramEditable).length() > 0)
      {
        i = 1;
        if (i == 0)
          break label51;
        EditorChangeTextView.a(this.lnF).setVisibility(0);
        AppMethodBeat.o(3055);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      label51: EditorChangeTextView.a(this.lnF).setVisibility(8);
      AppMethodBeat.o(3055);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3056);
    this.lnF.setTextChanged(true);
    AppMethodBeat.o(3056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView.2
 * JD-Core Version:    0.6.2
 */