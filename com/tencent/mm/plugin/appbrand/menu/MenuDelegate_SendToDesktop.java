package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.w;

public final class MenuDelegate_SendToDesktop extends a<w>
{
  MenuDelegate_SendToDesktop()
  {
    super(o.imW.ordinal());
    AppMethodBeat.i(132233);
    AppMethodBeat.o(132233);
  }

  static final class SaveNoMoreShowPermissionNotifyStatusTask extends MainProcessTask
  {
    public static final Parcelable.Creator<SaveNoMoreShowPermissionNotifyStatusTask> CREATOR;

    static
    {
      AppMethodBeat.i(132232);
      CREATOR = new MenuDelegate_SendToDesktop.SaveNoMoreShowPermissionNotifyStatusTask.1();
      AppMethodBeat.o(132232);
    }

    public SaveNoMoreShowPermissionNotifyStatusTask()
    {
    }

    public SaveNoMoreShowPermissionNotifyStatusTask(byte paramByte)
    {
    }

    public final void asP()
    {
      AppMethodBeat.i(132231);
      f.xH().bG("key_sendtodesktop_no_more_show_permission_notify_dialog", "1");
      AppMethodBeat.o(132231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_SendToDesktop
 * JD-Core Version:    0.6.2
 */