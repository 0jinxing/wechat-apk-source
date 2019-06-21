package com.tencent.mm.plugin.sns.abtest;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NotInterestMenu$1
  implements AdapterView.OnItemClickListener
{
  NotInterestMenu$1(NotInterestMenu paramNotInterestMenu)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(35663);
    if (NotInterestMenu.a(this.qCw) != null)
      NotInterestMenu.a(this.qCw).clZ();
    if (NotInterestMenu.b(this.qCw) != null)
      switch (paramInt)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    while (true)
    {
      AppMethodBeat.o(35663);
      while (true)
      {
        return;
        NotInterestMenu.b(this.qCw).c(NotInterestMenu.c(this.qCw));
        AppMethodBeat.o(35663);
        continue;
        NotInterestMenu.b(this.qCw).d(NotInterestMenu.c(this.qCw));
        AppMethodBeat.o(35663);
      }
      NotInterestMenu.b(this.qCw).e(NotInterestMenu.c(this.qCw));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.NotInterestMenu.1
 * JD-Core Version:    0.6.2
 */