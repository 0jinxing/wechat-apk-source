package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsAddressUI$1$1
  implements Runnable
{
  SnsAddressUI$1$1(SnsAddressUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33922);
    if (!this.zpg.zpf.getIntent().getBooleanExtra("stay_in_wechat", true))
      this.zpg.zpf.moveTaskToBack(true);
    AppMethodBeat.o(33922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI.1.1
 * JD-Core Version:    0.6.2
 */