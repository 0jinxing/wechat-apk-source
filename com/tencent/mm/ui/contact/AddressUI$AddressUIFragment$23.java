package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class AddressUI$AddressUIFragment$23
  implements MMSlideDelView.f
{
  AddressUI$AddressUIFragment$23(AddressUI.AddressUIFragment paramAddressUIFragment)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(33505);
    if (paramObject == null)
    {
      ab.e("MicroMsg.AddressUI", "onItemDel object null");
      AppMethodBeat.o(33505);
    }
    while (true)
    {
      return;
      AddressUI.AddressUIFragment.a(this.zkz, paramObject.toString());
      AppMethodBeat.o(33505);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.23
 * JD-Core Version:    0.6.2
 */