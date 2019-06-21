package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class ServiceNotifySettingsUI$a$1$1
  implements DialogInterface.OnClickListener
{
  ServiceNotifySettingsUI$a$1$1(ServiceNotifySettingsUI.a.1 param1, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29855);
    paramInt = 0;
    if (paramInt < ServiceNotifySettingsUI.a.a(this.yqi.yqh).size())
    {
      paramDialogInterface = (ServiceNotifySettingsUI.a.a)ServiceNotifySettingsUI.a.a(this.yqi.yqh).get(paramInt);
      if ((paramDialogInterface != null) && (this.eiH.equals(paramDialogInterface.username)))
      {
        ServiceNotifySettingsUI.a.b(this.yqi.yqh).add(ServiceNotifySettingsUI.a.a(this.yqi.yqh).remove(paramInt));
        this.yqi.yqh.notifyDataSetChanged();
        paramDialogInterface = ((d)g.K(d.class)).zb(this.eiH);
        if (paramDialogInterface == null)
        {
          paramDialogInterface = "";
          label124: if (this.yqi.yqg != 1)
            break label247;
          ab.d("MicroMsg.ServiceNotifySettingsUI", "stev report(%s), eventId : %s, appId %s, mSceneId %s", new Object[] { Integer.valueOf(13798), Integer.valueOf(4), paramDialogInterface, ServiceNotifySettingsUI.a.c(this.yqi.yqh) });
          h.pYm.e(13798, new Object[] { Integer.valueOf(4), paramDialogInterface, Integer.valueOf(0), ServiceNotifySettingsUI.a.c(this.yqi.yqh), Long.valueOf(bo.anT()) });
          AppMethodBeat.o(29855);
        }
      }
    }
    while (true)
    {
      return;
      paramDialogInterface = paramDialogInterface.field_appId;
      break label124;
      label247: h.pYm.e(13796, new Object[] { Integer.valueOf(12), paramDialogInterface, "", Integer.valueOf(0), Long.valueOf(bo.anT()) });
      AppMethodBeat.o(29855);
      continue;
      paramInt++;
      break;
      AppMethodBeat.o(29855);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI.a.1.1
 * JD-Core Version:    0.6.2
 */