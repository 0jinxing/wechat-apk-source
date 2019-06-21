package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class BindLinkedInUI$7
  implements View.OnClickListener
{
  BindLinkedInUI$7(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13392);
    if (!BindLinkedInUI.b(this.grc))
    {
      BindLinkedInUI.c(this.grc);
      AppMethodBeat.o(13392);
    }
    while (true)
    {
      return;
      if (!BindLinkedInUI.d(this.grc))
      {
        BindLinkedInUI.e(this.grc);
        AppMethodBeat.o(13392);
      }
      else
      {
        h.a(this.grc, this.grc.getString(2131298561), null, new BindLinkedInUI.7.1(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(13392);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.7
 * JD-Core Version:    0.6.2
 */