package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ak;

final class MainUI$9
  implements Runnable
{
  int eRu = 0;

  MainUI$9(MainUI paramMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34502);
    if (MainUI.c(this.zvg) == null)
    {
      AppMethodBeat.o(34502);
      return;
    }
    int i = ak.J(this.zvg.getContext(), -1);
    int j = f.de(MainUI.c(this.zvg).getContext());
    if ((i <= 0) || (j <= 0))
      if (this.eRu < 2)
      {
        ab.i("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight again!");
        MainUI.c(this.zvg).post(this);
        label82: this.eRu += 1;
      }
    while (true)
    {
      ab.i("MicroMsg.MainUI", "[trySetListViewMargin] tryCount:%s statusHeight:%s", new Object[] { Integer.valueOf(this.eRu), Integer.valueOf(i) });
      AppMethodBeat.o(34502);
      break;
      ab.e("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight finally!");
      break label82;
      if (i + j != MainUI.c(this.zvg).getPaddingTop())
      {
        ab.i("MicroMsg.MainUI", "[initListViewPadding] now:%s old:%s", new Object[] { Integer.valueOf(i + j), Integer.valueOf(MainUI.c(this.zvg).getPaddingTop()) });
        MainUI.b(this.zvg, j + i);
      }
      else
      {
        ab.i("MicroMsg.MainUI", "[trySetListViewMargin] has try more once! it's right! statusHeight:%s", new Object[] { Integer.valueOf(i) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.9
 * JD-Core Version:    0.6.2
 */