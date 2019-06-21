package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class ExdeviceManageDeviceUI$a$1
  implements n.d
{
  ExdeviceManageDeviceUI$a$1(ExdeviceManageDeviceUI.a parama)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(19983);
    paramInt = paramMenuItem.getItemId();
    int i = this.lBo.getCount();
    ab.d("MicroMsg.ExdeviceManageDeviceUI", "onMenuItemSelected, itemId(%d), count(%d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(19983);
    while (true)
    {
      return;
      ExdeviceManageDeviceUI.a.a(this.lBo, paramInt);
      ExdeviceManageDeviceUI.a.a(this.lBo, (b)ExdeviceManageDeviceUI.a.a(this.lBo).get(paramInt));
      this.lBo.notifyDataSetChanged();
      AppMethodBeat.o(19983);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI.a.1
 * JD-Core Version:    0.6.2
 */