package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ExdeviceManageDeviceUI$a$6
  implements Runnable
{
  ExdeviceManageDeviceUI$a$6(ExdeviceManageDeviceUI.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19987);
    ExdeviceManageDeviceUI.a.a(this.lBo).remove(ExdeviceManageDeviceUI.a.d(this.lBo));
    this.lBo.notifyDataSetChanged();
    ExdeviceManageDeviceUI.a.a(this.lBo, -1);
    AppMethodBeat.o(19987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI.a.6
 * JD-Core Version:    0.6.2
 */