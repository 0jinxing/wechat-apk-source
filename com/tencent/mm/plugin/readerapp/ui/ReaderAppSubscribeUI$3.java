package com.tencent.mm.plugin.readerapp.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class ReaderAppSubscribeUI$3
  implements View.OnClickListener
{
  ReaderAppSubscribeUI$3(ReaderAppSubscribeUI paramReaderAppSubscribeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(76804);
    BackwardSupportUtil.c.a(ReaderAppSubscribeUI.b(this.pEZ));
    AppMethodBeat.o(76804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI.3
 * JD-Core Version:    0.6.2
 */