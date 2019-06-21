package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.d.c;

final class DeleteTaskFooterView$1
  implements d.c
{
  DeleteTaskFooterView$1(DeleteTaskFooterView paramDeleteTaskFooterView)
  {
  }

  public final void gh(boolean paramBoolean)
  {
    AppMethodBeat.i(136215);
    DeleteTaskFooterView localDeleteTaskFooterView = this.kQb;
    if (paramBoolean)
    {
      localDeleteTaskFooterView.kPW.setClickable(true);
      localDeleteTaskFooterView.kPY.setImageResource(2130840417);
      localDeleteTaskFooterView.kPX.setTextColor(localDeleteTaskFooterView.getContext().getResources().getColor(2131690190));
      AppMethodBeat.o(136215);
    }
    while (true)
    {
      return;
      localDeleteTaskFooterView.kPW.setClickable(false);
      localDeleteTaskFooterView.kPY.setImageResource(2130840418);
      localDeleteTaskFooterView.kPX.setTextColor(localDeleteTaskFooterView.getContext().getResources().getColor(2131690189));
      AppMethodBeat.o(136215);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView.1
 * JD-Core Version:    0.6.2
 */