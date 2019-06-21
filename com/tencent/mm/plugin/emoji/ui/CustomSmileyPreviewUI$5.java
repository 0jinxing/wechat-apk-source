package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;

final class CustomSmileyPreviewUI$5
  implements View.OnClickListener
{
  CustomSmileyPreviewUI$5(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138342);
    if (bo.isNullOrNil(this.ghI))
      AppMethodBeat.o(138342);
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("rawUrl", this.ghI);
      d.b(this.kYV, "webview", ".ui.tools.WebViewUI", paramView);
      AppMethodBeat.o(138342);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.5
 * JD-Core Version:    0.6.2
 */