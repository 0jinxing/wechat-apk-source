package com.tencent.wework.api;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.BaseMessage;
import java.util.HashMap;
import java.util.Map;

public final class WWAPIImpl
  implements IWWAPI
{
  private BroadcastReceiver ALA;
  private String ALz;
  private Map<String, Object> callbacks;
  private Context context;

  public WWAPIImpl(Context paramContext)
  {
    AppMethodBeat.i(80493);
    this.callbacks = new HashMap();
    this.ALA = new WWAPIImpl.1(this);
    this.context = paramContext;
    AppMethodBeat.o(80493);
  }

  private int dTL()
  {
    int i = 0;
    AppMethodBeat.i(80495);
    try
    {
      PackageInfo localPackageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.wework", 128);
      if (localPackageInfo == null)
      {
        AppMethodBeat.o(80495);
        j = i;
      }
      while (true)
      {
        return j;
        j = localPackageInfo.versionCode;
        AppMethodBeat.o(80495);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(80495);
        int j = i;
      }
    }
  }

  public final boolean a(BaseMessage paramBaseMessage)
  {
    boolean bool = false;
    AppMethodBeat.i(80496);
    Intent localIntent = new Intent("com.tencent.wework.apihost");
    localIntent.setClassName("com.tencent.wework", "com.tencent.wework.apihost.WWAPIActivity");
    localIntent.addFlags(411041792);
    try
    {
      paramBaseMessage.setContext(this.context);
      localIntent.putExtras(BaseMessage.b(paramBaseMessage));
      Context localContext = this.context;
      paramBaseMessage = new android/content/Intent;
      paramBaseMessage.<init>(this.context, this.ALA.getClass());
      localIntent.putExtra("PendingIntent", PendingIntent.getBroadcast(localContext, 0, paramBaseMessage, 134217728));
      this.context.startActivity(localIntent);
      bool = true;
      AppMethodBeat.o(80496);
      return bool;
    }
    catch (Throwable paramBaseMessage)
    {
      while (true)
        AppMethodBeat.o(80496);
    }
  }

  public final boolean dTK()
  {
    AppMethodBeat.i(80494);
    boolean bool;
    if (dTL() >= 100)
    {
      bool = true;
      AppMethodBeat.o(80494);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80494);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.WWAPIImpl
 * JD-Core Version:    0.6.2
 */