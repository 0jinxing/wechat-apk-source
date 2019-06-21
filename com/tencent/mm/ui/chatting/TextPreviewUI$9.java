package com.tencent.mm.ui.chatting;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.textview.a;

final class TextPreviewUI$9
  implements n.d
{
  TextPreviewUI$9(TextPreviewUI paramTextPreviewUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(31053);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(31053);
      while (true)
      {
        return;
        ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(TextPreviewUI.c(this.yMF), TextPreviewUI.c(this.yMF)));
        if (TextPreviewUI.d(this.yMF) != null)
        {
          TextPreviewUI.d(this.yMF).dLM();
          TextPreviewUI.d(this.yMF).zWC = true;
          TextPreviewUI.d(this.yMF).zWD = true;
          TextPreviewUI.d(this.yMF).dLL();
        }
        Toast.makeText(this.yMF.mController.ylL, 2131296876, 0).show();
        AppMethodBeat.o(31053);
        continue;
        if (TextPreviewUI.d(this.yMF) != null)
        {
          TextPreviewUI.d(this.yMF).dLL();
          TextPreviewUI.d(this.yMF).dLP();
          TextPreviewUI.d(this.yMF).hH(0, TextPreviewUI.a(this.yMF).getText().length());
          TextPreviewUI.d(this.yMF).zWC = false;
          TextPreviewUI.d(this.yMF).zWD = false;
          TextPreviewUI.d(this.yMF).dLO();
        }
        al.n(new TextPreviewUI.9.1(this), 100L);
        AppMethodBeat.o(31053);
      }
      TextPreviewUI.e(this.yMF.mController.ylL, TextPreviewUI.c(this.yMF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.9
 * JD-Core Version:    0.6.2
 */