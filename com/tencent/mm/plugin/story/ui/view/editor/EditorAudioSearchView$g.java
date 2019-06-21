package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView$init$5", "Landroid/text/TextWatcher;", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "", "p2", "p3", "onTextChanged", "plugin-story_release"})
public final class EditorAudioSearchView$g
  implements TextWatcher
{
  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(110480);
    int i;
    if (paramEditable != null)
    {
      i = paramEditable.length();
      if (i <= 0)
        break label56;
      paramEditable = EditorAudioSearchView.g(this.skR);
      if (paramEditable == null)
        break label48;
      paramEditable.setVisibility(0);
      AppMethodBeat.o(110480);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label48: AppMethodBeat.o(110480);
      continue;
      label56: paramEditable = EditorAudioSearchView.g(this.skR);
      if (paramEditable != null)
      {
        paramEditable.setVisibility(8);
        AppMethodBeat.o(110480);
      }
      else
      {
        AppMethodBeat.o(110480);
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioSearchView.g
 * JD-Core Version:    0.6.2
 */