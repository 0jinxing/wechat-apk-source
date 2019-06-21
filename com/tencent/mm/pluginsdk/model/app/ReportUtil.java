package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;

public final class ReportUtil
{
  public static void F(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(27388);
    v.b localb = v.Zp().y("kWXEntryActivity_data_center_session_id", true);
    String str;
    int i;
    int j;
    if (localb != null)
    {
      str = localb.getString("kWXEntryActivity_data_center_app_id", "");
      boolean bool = localb.getBoolean("kWXEntryActivity_data_center_can_return_cancel", false);
      i = localb.getInt("kWXEntryActivity_data_center_msg_type", 0);
      j = localb.getInt("kWXEntryActivity_data_center_scene", 0);
      if (paramBoolean)
        paramInt = -2;
      if (!bool)
        break label126;
    }
    label126: for (int k = 0; ; k = -1)
    {
      h.pYm.e(15632, new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(k) });
      AppMethodBeat.o(27388);
      return;
    }
  }

  public static void a(Context paramContext, ReportUtil.ReportArgs paramReportArgs)
  {
    AppMethodBeat.i(27390);
    if (paramReportArgs.Cn == 1)
    {
      b(paramContext, paramReportArgs);
      AppMethodBeat.o(27390);
    }
    while (true)
    {
      return;
      Object localObject = new SendMessageToWX.Resp();
      ((SendMessageToWX.Resp)localObject).errCode = paramReportArgs.errCode;
      ((SendMessageToWX.Resp)localObject).transaction = paramReportArgs.transaction;
      ((SendMessageToWX.Resp)localObject).openId = paramReportArgs.openId;
      Bundle localBundle = new Bundle();
      ((SendMessageToWX.Resp)localObject).toBundle(localBundle);
      p.at(localBundle);
      localObject = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject).targetPkgName = paramReportArgs.Iw;
      ((MMessageActV2.Args)localObject).bundle = localBundle;
      MMessageActV2.send(paramContext, (MMessageActV2.Args)localObject);
      AppMethodBeat.o(27390);
    }
  }

  public static void a(Context paramContext, ReportUtil.ReportArgs paramReportArgs, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(27389);
    v.b localb = v.Zp().y("kWXEntryActivity_data_center_session_id", true);
    if (localb != null)
      bool = localb.getBoolean("kWXEntryActivity_data_center_can_return_cancel", false);
    F(paramBoolean, paramReportArgs.errCode);
    if ((bool) && (paramBoolean))
      paramReportArgs.errCode = -2;
    a(paramContext, paramReportArgs);
    AppMethodBeat.o(27389);
  }

  private static String av(Bundle paramBundle)
  {
    AppMethodBeat.i(27393);
    SendMessageToWX.Req localReq = new SendMessageToWX.Req();
    localReq.fromBundle(paramBundle);
    paramBundle = localReq.transaction;
    AppMethodBeat.o(27393);
    return paramBundle;
  }

  private static void b(Context paramContext, ReportUtil.ReportArgs paramReportArgs)
  {
    AppMethodBeat.i(27391);
    Object localObject = new SendAuth.Resp();
    ((SendAuth.Resp)localObject).transaction = paramReportArgs.transaction;
    ((SendAuth.Resp)localObject).errCode = paramReportArgs.errCode;
    ((SendAuth.Resp)localObject).openId = paramReportArgs.openId;
    Bundle localBundle = new Bundle();
    ((SendAuth.Resp)localObject).toBundle(localBundle);
    p.at(localBundle);
    localObject = new MMessageActV2.Args();
    ((MMessageActV2.Args)localObject).targetPkgName = paramReportArgs.Iw;
    ((MMessageActV2.Args)localObject).bundle = localBundle;
    MMessageActV2.send(paramContext, (MMessageActV2.Args)localObject);
    AppMethodBeat.o(27391);
  }

  public static ReportUtil.ReportArgs c(Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(27392);
    Object localObject1 = paramBundle.getString("SendAppMessageWrapper_AppId");
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject3 = paramBundle.getString("_mmessage_content");
      localObject2 = localObject1;
      if (localObject3 != null)
        localObject2 = Uri.parse((String)localObject3).getQueryParameter("appid");
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject2 = w.l(paramBundle, "_wxapi_payreq_appid");
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        paramBundle = null;
        AppMethodBeat.o(27392);
        return paramBundle;
      }
    }
    Object localObject3 = new f();
    ((f)localObject3).field_appId = ((String)localObject1);
    if ((aw.ZM()) && (aw.RK()))
      am.bYJ().b((c)localObject3, new String[0]);
    while (true)
    {
      localObject2 = new ReportUtil.ReportArgs();
      ((ReportUtil.ReportArgs)localObject2).Iw = ((f)localObject3).field_packageName;
      ((ReportUtil.ReportArgs)localObject2).errCode = paramInt;
      ((ReportUtil.ReportArgs)localObject2).transaction = av(paramBundle);
      ((ReportUtil.ReportArgs)localObject2).openId = ((f)localObject3).field_openId;
      ((ReportUtil.ReportArgs)localObject2).Cn = paramBundle.getInt("_wxapi_command_type");
      AppMethodBeat.o(27392);
      paramBundle = (Bundle)localObject2;
      break;
      ((f)localObject3).field_packageName = paramBundle.getString("_mmessage_appPackage");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ReportUtil
 * JD-Core Version:    0.6.2
 */