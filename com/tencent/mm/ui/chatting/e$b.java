package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;

final class e$b
  implements e.c
{
  public static boolean ara(String paramString)
  {
    AppMethodBeat.i(30452);
    boolean bool;
    if ((paramString != null) && ((paramString.startsWith("weixin://openNativeUrl/myDeviceList")) || (paramString.startsWith("weixin://openNativeUrl/bindMyDevice"))))
    {
      bool = true;
      AppMethodBeat.o(30452);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30452);
    }
  }

  public final boolean a(String paramString1, Context paramContext, MMFragment paramMMFragment, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(30453);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(30453);
    while (true)
    {
      return bool;
      if (paramString1.startsWith("weixin://openNativeUrl/myDeviceList"))
      {
        paramString1 = new Intent();
        paramString1.putExtra("device_brand_name", paramString2);
        d.b(paramContext, "exdevice", ".ui.ExdeviceManageDeviceUI", paramString1);
        bool = true;
        AppMethodBeat.o(30453);
      }
      else if (paramString1.startsWith("weixin://openNativeUrl/bindMyDevice"))
      {
        AppMethodBeat.o(30453);
      }
      else
      {
        AppMethodBeat.o(30453);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.e.b
 * JD-Core Version:    0.6.2
 */