package com.tencent.mm.plugin.readerapp.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ReaderAppSubscribeUI$1
  implements AdapterView.OnItemClickListener
{
  ReaderAppSubscribeUI$1(ReaderAppSubscribeUI paramReaderAppSubscribeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(76802);
    paramAdapterView = ReaderAppSubscribeUI.a(this.pEZ);
    if ((paramAdapterView.pFb & paramAdapterView.pFa[paramInt]) != 0)
    {
      paramAdapterView.pFb &= (paramAdapterView.pFa[paramInt] ^ 0xFFFFFFFF);
      paramAdapterView.pFd -= 1;
      if (paramAdapterView.pFd < 0)
        paramAdapterView.pFd = 0;
      paramAdapterView.notifyDataSetChanged();
      paramInt = i;
    }
    while (true)
    {
      if (paramInt == 0)
        h.g(this.pEZ, 2131298637, 2131297061);
      AppMethodBeat.o(76802);
      return;
      if (paramAdapterView.pFd < 3)
      {
        paramAdapterView.pFb |= paramAdapterView.pFa[paramInt];
        paramAdapterView.pFd += 1;
        if (paramAdapterView.pFd > paramAdapterView.pFa.length)
          paramAdapterView.pFd = paramAdapterView.pFa.length;
        paramAdapterView.notifyDataSetChanged();
        paramInt = i;
      }
      else
      {
        paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI.1
 * JD-Core Version:    0.6.2
 */