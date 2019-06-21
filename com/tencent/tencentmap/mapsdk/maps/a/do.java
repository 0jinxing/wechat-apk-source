package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class do
  implements Runnable
{
  do(dn paramdn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98730);
    String str = er.b("settings_in_client", "", true);
    if (!TextUtils.isEmpty(str));
    while (true)
    {
      try
      {
        dn.a(this.a).a(str);
        dn.b(this.a);
        AppMethodBeat.o(98730);
        return;
      }
      catch (Throwable localThrowable)
      {
        er.a("settings_in_client", "", true);
      }
      AppMethodBeat.o(98730);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.do
 * JD-Core Version:    0.6.2
 */