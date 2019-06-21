package com.tencent.mm.opensdk.channel;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class MMessageActV2
{
  public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
  public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
  public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
  private static final String TAG = "MicroMsg.SDK.MMessageAct";

  public static boolean send(Context paramContext, MMessageActV2.Args paramArgs)
  {
    boolean bool = false;
    AppMethodBeat.i(128140);
    if ((paramContext == null) || (paramArgs == null))
    {
      Log.e("MicroMsg.SDK.MMessageAct", "send fail, invalid argument");
      AppMethodBeat.o(128140);
    }
    while (true)
    {
      return bool;
      if (d.b(paramArgs.targetPkgName))
      {
        Log.e("MicroMsg.SDK.MMessageAct", "send fail, invalid targetPkgName, targetPkgName = " + paramArgs.targetPkgName);
        AppMethodBeat.o(128140);
      }
      else
      {
        if (d.b(paramArgs.targetClassName))
          paramArgs.targetClassName = (paramArgs.targetPkgName + ".wxapi.WXEntryActivity");
        Log.d("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + paramArgs.targetPkgName + ", targetClassName = " + paramArgs.targetClassName);
        Intent localIntent = new Intent();
        localIntent.setClassName(paramArgs.targetPkgName, paramArgs.targetClassName);
        if (paramArgs.bundle != null)
          localIntent.putExtras(paramArgs.bundle);
        String str = paramContext.getPackageName();
        localIntent.putExtra("_mmessage_sdkVersion", 620954368);
        localIntent.putExtra("_mmessage_appPackage", str);
        localIntent.putExtra("_mmessage_content", paramArgs.content);
        localIntent.putExtra("_mmessage_checksum", b.a(paramArgs.content, 620954368, str));
        localIntent.putExtra("_message_token", paramArgs.token);
        if (paramArgs.flags == -1)
          localIntent.addFlags(268435456).addFlags(134217728);
        try
        {
          while (true)
          {
            paramContext.startActivity(localIntent);
            Log.d("MicroMsg.SDK.MMessageAct", "send mm message, intent=".concat(String.valueOf(localIntent)));
            bool = true;
            AppMethodBeat.o(128140);
            break;
            localIntent.setFlags(paramArgs.flags);
          }
        }
        catch (Exception paramContext)
        {
          Log.e("MicroMsg.SDK.MMessageAct", "send fail, ex = " + paramContext.getMessage());
          AppMethodBeat.o(128140);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.channel.MMessageActV2
 * JD-Core Version:    0.6.2
 */