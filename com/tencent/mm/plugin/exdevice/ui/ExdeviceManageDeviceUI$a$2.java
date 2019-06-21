package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class ExdeviceManageDeviceUI$a$2
  implements View.OnClickListener
{
  ExdeviceManageDeviceUI$a$2(ExdeviceManageDeviceUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19984);
    if (ExdeviceManageDeviceUI.a.b(this.lBo))
      AppMethodBeat.o(19984);
    while (true)
    {
      return;
      paramView = paramView.getTag();
      if ((paramView == null) || (!(paramView instanceof Integer)))
      {
        AppMethodBeat.o(19984);
      }
      else
      {
        int i = ((Integer)paramView).intValue();
        if ((i < 0) || (i >= this.lBo.getCount()))
        {
          AppMethodBeat.o(19984);
        }
        else
        {
          paramView = this.lBo.uT(i);
          Context localContext = (Context)ExdeviceManageDeviceUI.a.c(this.lBo).get();
          if (localContext == null)
          {
            ab.e("MicroMsg.ExdeviceManageDeviceUI", "Start activity failed, context is null.");
            AppMethodBeat.o(19984);
          }
          else
          {
            ExdeviceManageDeviceUI.a.a(localContext, paramView);
            AppMethodBeat.o(19984);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceManageDeviceUI.a.2
 * JD-Core Version:    0.6.2
 */