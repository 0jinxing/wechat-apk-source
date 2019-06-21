package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$6", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "plugin-brandservice_release"})
public final class MPVideoWriteCommentLayout$6
  implements TextWatcher
{
  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(15280);
    paramCharSequence = MPVideoWriteCommentLayout.i(this.jYh);
    Editable localEditable = MPVideoWriteCommentLayout.e(this.jYh).getText();
    j.o(localEditable, "contentEt.text");
    if (((CharSequence)localEditable).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramCharSequence.setEnabled(bool);
      AppMethodBeat.o(15280);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.6
 * JD-Core Version:    0.6.2
 */