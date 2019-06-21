package com.tencent.mm.view.e;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.view.SmileyPanelViewPager;

final class a$1 extends ak
{
  a$1(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(63023);
    switch (paramMessage.what)
    {
    default:
    case 1102:
    case 1103:
    }
    while (true)
    {
      AppMethodBeat.o(63023);
      while (true)
      {
        return;
        this.AdQ.dMY();
        a.a(this.AdQ);
        if ((a.b(this.AdQ) == null) || (a.c(this.AdQ) == null))
          break;
        int i = a.d(this.AdQ).Aer;
        int j;
        if (i >= 0)
        {
          j = i;
          if (i <= a.d(this.AdQ).atl(a.b(this.AdQ)).dMX());
        }
        else
        {
          j = a.d(this.AdQ).atl(a.b(this.AdQ)).dMX() - 1;
        }
        a.a(this.AdQ, j + a.d(this.AdQ).atl(a.b(this.AdQ)).jis);
        a.c(this.AdQ).setCurrentItem(a.e(this.AdQ));
        a.f(this.AdQ);
        AppMethodBeat.o(63023);
      }
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "update selection");
      a.b(this.AdQ, paramMessage.arg1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a.1
 * JD-Core Version:    0.6.2
 */