package com.tencent.mm.ui.contact;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ak;

final class AddressUI$AddressUIFragment$12
  implements Runnable
{
  int eRu = 0;

  AddressUI$AddressUIFragment$12(AddressUI.AddressUIFragment paramAddressUIFragment, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33495);
    if (this.zkz.getView() == null)
    {
      AppMethodBeat.o(33495);
      return;
    }
    int i = ak.de(this.zkz.getContext());
    int j = ak.J(this.zkz.getContext(), -1);
    if (j <= 0)
      if (this.eRu < 2)
      {
        ab.i("MicroMsg.AddressUI", "[trySetParentViewPadding] try getStatusHeight again!");
        this.zkz.getView().post(this);
        label75: this.eRu += 1;
      }
    while (true)
    {
      ab.i("MicroMsg.AddressUI", "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(this.eRu), Integer.valueOf(j), Integer.valueOf(i) });
      AppMethodBeat.o(33495);
      break;
      ab.e("MicroMsg.AddressUI", "[trySetParentViewPadding] try getStatusHeight finally!");
      break label75;
      int k = i + j;
      if (k != this.zkz.getView().getPaddingTop())
      {
        ab.i("MicroMsg.AddressUI", "[trySetParentViewPadding] now:%s old:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.zkz.getView().getPaddingTop()) });
        this.zkz.getView().setPadding(0, k, 0, this.aqy.getHeight());
      }
      else
      {
        ab.i("MicroMsg.AddressUI", "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.12
 * JD-Core Version:    0.6.2
 */