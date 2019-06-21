package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class CompressPreviewUI$3
  implements View.OnClickListener
{
  CompressPreviewUI$3(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68240);
    BackwardSupportUtil.c.a(CompressPreviewUI.d(this.pxt));
    AppMethodBeat.o(68240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.3
 * JD-Core Version:    0.6.2
 */