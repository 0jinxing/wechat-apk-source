package com.tencent.mm.plugin.address.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletAddAddressUI$1
  implements AddrEditView.a
{
  WalletAddAddressUI$1(WalletAddAddressUI paramWalletAddAddressUI)
  {
  }

  public final void onClick()
  {
    AppMethodBeat.i(16932);
    boolean bool = b.a(this.gKV, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(16932);
    while (true)
    {
      return;
      WalletAddAddressUI.a(this.gKV);
      AppMethodBeat.o(16932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletAddAddressUI.1
 * JD-Core Version:    0.6.2
 */