package com.tencent.mm.plugin.downloader_app.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DeleteTaskFooterView$2
  implements View.OnClickListener
{
  DeleteTaskFooterView$2(DeleteTaskFooterView paramDeleteTaskFooterView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136216);
    if (DeleteTaskFooterView.a(this.kQb))
    {
      DeleteTaskFooterView.a(this.kQb, false);
      DeleteTaskFooterView.b(this.kQb).setImageResource(2130838332);
    }
    while (true)
    {
      if (DeleteTaskFooterView.c(this.kQb))
        DeleteTaskFooterView.gi(DeleteTaskFooterView.a(this.kQb));
      DeleteTaskFooterView.d(this.kQb);
      AppMethodBeat.o(136216);
      return;
      DeleteTaskFooterView.a(this.kQb, true);
      DeleteTaskFooterView.b(this.kQb).setImageResource(2130838331);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView.2
 * JD-Core Version:    0.6.2
 */