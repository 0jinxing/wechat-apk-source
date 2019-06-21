package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ca.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;

public final class e$a
  implements MMReceivers.a
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15840);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(15840);
    String str;
    while (true)
    {
      return;
      str = paramIntent.getStringExtra("exdevice_process_action_code_key");
      ab.i("MicroMsg.ExDeviceProcessReceiver", "onReceive, action %s", new Object[] { str });
      if (!bo.isNullOrNil(str))
        break;
      AppMethodBeat.o(15840);
    }
    if (str.equals("action_reload_resources"))
    {
      str = paramIntent.getStringExtra("exdevice_language");
      ab.i("MicroMsg.ExDeviceProcessReceiver", "onReceive, language %s", new Object[] { str });
      paramIntent = aa.amw(str);
      if ("language_default".equalsIgnoreCase(str))
      {
        if (Build.VERSION.SDK_INT < 24)
          break label155;
        paramIntent = aa.xyO;
        Locale.setDefault(paramIntent);
      }
    }
    while (true)
    {
      aa.a(paramContext.getApplicationContext(), paramIntent);
      ah.f(b.a(paramContext.getApplicationContext().getResources(), paramContext.getApplicationContext(), str));
      AppMethodBeat.o(15840);
      break;
      label155: paramIntent = Locale.getDefault();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e.a
 * JD-Core Version:    0.6.2
 */