package com.tencent.mm.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FindMoreFriendsUI$5
  implements Runnable
{
  int eRu = 0;

  FindMoreFriendsUI$5(FindMoreFriendsUI paramFindMoreFriendsUI, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29211);
    if (this.yhB.getView() == null)
    {
      AppMethodBeat.o(29211);
      return;
    }
    int i = ak.de(this.yhB.getContext());
    int j = ak.J(this.yhB.getContext(), -1);
    if (j <= 0)
      if (this.eRu < 2)
      {
        ab.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight again!");
        this.yhB.getView().post(this);
        label77: this.eRu += 1;
      }
    while (true)
    {
      ab.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(this.eRu), Integer.valueOf(j), Integer.valueOf(i) });
      AppMethodBeat.o(29211);
      break;
      ab.e("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight finally!");
      break label77;
      int k = i + j;
      if (k != this.yhB.getView().getPaddingTop())
      {
        ab.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] now:%s old:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.yhB.getView().getPaddingTop()) });
        this.yhB.getView().setPadding(0, k, 0, this.aqy.getHeight());
      }
      else
      {
        ab.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.5
 * JD-Core Version:    0.6.2
 */