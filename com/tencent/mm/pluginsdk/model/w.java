package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class w extends r
{
  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    Object localObject = null;
    AppMethodBeat.i(125839);
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null))
    {
      AppMethodBeat.o(125839);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
      if (paramContext != null)
      {
        paramResolveInfo = paramContext.toString();
        paramResolveInfo = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(paramResolveInfo);
        if (paramResolveInfo.find())
        {
          paramContext = paramResolveInfo.replaceAll("");
          AppMethodBeat.o(125839);
        }
        else
        {
          paramContext = paramContext.toString();
          AppMethodBeat.o(125839);
        }
      }
      else
      {
        AppMethodBeat.o(125839);
        paramContext = localObject;
      }
    }
  }

  public final boolean aix(String paramString)
  {
    AppMethodBeat.i(125837);
    boolean bool;
    if ((paramString != null) && ("com.tencent.map".equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(125837);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125837);
    }
  }

  public final String anK()
  {
    return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
  }

  public final String dgX()
  {
    return "TencentMap.apk";
  }

  public final s.a dgY()
  {
    AppMethodBeat.i(125838);
    s.a locala = new s.a();
    locala.vbD = 2131304037;
    String str = g.Nu().getValue("QQMapDownloadTips");
    if (!bo.isNullOrNil(str))
      locala.vbE = str;
    locala.vbF = 2131304042;
    locala.vbC = 2130839084;
    AppMethodBeat.o(125838);
    return locala;
  }

  public final boolean fE(Context paramContext)
  {
    AppMethodBeat.i(125836);
    Object localObject = new Intent("android.intent.action.VIEW", Uri.parse("sosomap://type=nav"));
    localObject = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    int j;
    boolean bool;
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      int i = ((List)localObject).size();
      j = 0;
      if (j < i)
      {
        paramContext = (ResolveInfo)((List)localObject).get(j);
        if ((paramContext != null) && (paramContext.activityInfo != null) && ("com.tencent.map".equals(paramContext.activityInfo.packageName)))
        {
          bool = true;
          AppMethodBeat.o(125836);
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(125836);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.w
 * JD-Core Version:    0.6.2
 */