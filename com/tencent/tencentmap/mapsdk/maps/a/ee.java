package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ee
  implements Runnable
{
  ee(ed paramed)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98783);
    String str = bt.a().getSharedPreferences(ed.a(this.a), 0).getString("halley_cloud_param_content", "");
    if (!TextUtils.isEmpty(str));
    while (true)
    {
      try
      {
        ed.b(this.a).a(str);
        AppMethodBeat.o(98783);
        return;
      }
      catch (Throwable localThrowable)
      {
        ed.a(this.a, "");
      }
      AppMethodBeat.o(98783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ee
 * JD-Core Version:    0.6.2
 */