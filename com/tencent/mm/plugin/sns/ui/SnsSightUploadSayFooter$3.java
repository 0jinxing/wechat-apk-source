package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

final class SnsSightUploadSayFooter$3
  implements Runnable
{
  SnsSightUploadSayFooter$3(SnsSightUploadSayFooter paramSnsSightUploadSayFooter)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39287);
    SnsSightUploadSayFooter.b(this.rxa).performClick();
    SnsSightUploadSayFooter.b(this.rxa).requestFocus();
    SnsSightUploadSayFooter.c(this.rxa).showVKB();
    AppMethodBeat.o(39287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.3
 * JD-Core Version:    0.6.2
 */