package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;

public final class MenuDelegate_EnableDebug extends com.tencent.mm.plugin.appbrand.menu.a.a<com.tencent.luggage.sdk.a.a.a>
{
  public MenuDelegate_EnableDebug()
  {
    super(o.imQ.ordinal());
    AppMethodBeat.i(102136);
    AppMethodBeat.o(102136);
  }

  public static void f(Context paramContext, final String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(102137);
    MenuDelegate_EnableDebug.SetAppDebugModeTask localSetAppDebugModeTask = new MenuDelegate_EnableDebug.SetAppDebugModeTask((byte)0);
    localSetAppDebugModeTask.appId = paramString;
    localSetAppDebugModeTask.enable = paramBoolean;
    AppBrandMainProcessService.a(localSetAppDebugModeTask);
    if (localSetAppDebugModeTask.enable);
    for (paramString = paramContext.getString(2131296590); ; paramString = paramContext.getString(2131296589))
    {
      if ((paramContext instanceof Activity))
        ((Activity)paramContext).runOnUiThread(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(102130);
            Toast.makeText(this.val$context, paramString, 0).show();
            ((Activity)this.val$context).finish();
            AppMethodBeat.o(102130);
          }
        });
      AppMethodBeat.o(102137);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug
 * JD-Core Version:    0.6.2
 */