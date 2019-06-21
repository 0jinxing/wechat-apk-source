package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class OpenIMAddressUI$OpenIMAddressUIFragment$14
  implements MMSlideDelView.f
{
  OpenIMAddressUI$OpenIMAddressUIFragment$14(OpenIMAddressUI.OpenIMAddressUIFragment paramOpenIMAddressUIFragment)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(33779);
    if (paramObject == null)
    {
      ab.e("MicroMsg.OpenIMAddressUI", "onItemDel object null");
      AppMethodBeat.o(33779);
    }
    while (true)
    {
      return;
      OpenIMAddressUI.OpenIMAddressUIFragment.a(this.zoc, paramObject.toString());
      AppMethodBeat.o(33779);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.14
 * JD-Core Version:    0.6.2
 */