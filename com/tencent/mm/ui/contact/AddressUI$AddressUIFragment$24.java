package com.tencent.mm.ui.contact;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddressUI$AddressUIFragment$24
  implements u.b
{
  AddressUI$AddressUIFragment$24(AddressUI.AddressUIFragment paramAddressUIFragment)
  {
  }

  public final void qB(boolean paramBoolean)
  {
    AppMethodBeat.i(33506);
    if (AddressUI.AddressUIFragment.d(this.zkz) == null)
      AppMethodBeat.o(33506);
    while (true)
    {
      return;
      BizContactEntranceView localBizContactEntranceView = AddressUI.AddressUIFragment.d(this.zkz);
      if (localBizContactEntranceView.zld == null)
      {
        AppMethodBeat.o(33506);
      }
      else if (paramBoolean)
      {
        localBizContactEntranceView.zld.setBackgroundResource(2130839162);
        AppMethodBeat.o(33506);
      }
      else
      {
        localBizContactEntranceView.zld.setBackground(null);
        AppMethodBeat.o(33506);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.24
 * JD-Core Version:    0.6.2
 */