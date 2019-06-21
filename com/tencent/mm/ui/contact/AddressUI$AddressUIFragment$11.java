package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddressUI$AddressUIFragment$11
  implements Runnable
{
  AddressUI$AddressUIFragment$11(AddressUI.AddressUIFragment paramAddressUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33494);
    AddressUI.AddressUIFragment.a(this.zkz).dHy();
    if (AddressUI.AddressUIFragment.e(this.zkz) != null)
    {
      AddressUI.AddressUIFragment.e(this.zkz).reset();
      if (AddressUI.AddressUIFragment.e(this.zkz).getOpenIMCount() <= 0)
      {
        AddressUI.AddressUIFragment.e(this.zkz).setVisibility(8);
        AppMethodBeat.o(33494);
      }
    }
    while (true)
    {
      return;
      AddressUI.AddressUIFragment.e(this.zkz).setVisibility(0);
      AppMethodBeat.o(33494);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.11
 * JD-Core Version:    0.6.2
 */