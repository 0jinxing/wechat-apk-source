package com.tencent.mm.plugin.topstory.ui.home;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TopStoryUploadUI$3
  implements TextWatcher
{
  TopStoryUploadUI$3(TopStoryUploadUI paramTopStoryUploadUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(1682);
    TopStoryUploadUI.b(this.sDa);
    TopStoryUploadUI.c(this.sDa);
    AppMethodBeat.o(1682);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI.3
 * JD-Core Version:    0.6.2
 */