package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

final class SnsSightUploadSayFooter$1
  implements View.OnClickListener
{
  SnsSightUploadSayFooter$1(SnsSightUploadSayFooter paramSnsSightUploadSayFooter)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(39286);
    if (this.rxa.getVisibility() == 8)
      this.rxa.setVisibility(0);
    if (this.rxa.eAk.getVisibility() == 0)
      i = 1;
    if (i != 0)
      SnsSightUploadSayFooter.a(this.rxa);
    AppMethodBeat.o(39286);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.1
 * JD-Core Version:    0.6.2
 */