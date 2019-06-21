package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.model.x;
import com.tencent.mm.protocal.protobuf.asq;

final class ExdeviceManageDeviceUI$a$4
  implements Runnable
{
  ExdeviceManageDeviceUI$a$4(ExdeviceManageDeviceUI.a parama, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19985);
    Object localObject = new asq();
    ((asq)localObject).jBE = this.lBp.field_deviceID;
    ((asq)localObject).vIk = this.lBp.field_deviceType;
    localObject = new x((asq)localObject, 2);
    aw.Rg().a((m)localObject, 0);
    AppMethodBeat.o(19985);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI.a.4
 * JD-Core Version:    0.6.2
 */