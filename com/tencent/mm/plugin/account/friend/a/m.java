package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.net.URLEncoder;
import java.util.List;
import org.apache.http.NameValuePair;

public final class m
{
  public static String aqc()
  {
    AppMethodBeat.i(108382);
    ab.i("MicroMsg.GoogleContactLogic", "getRequestCodeUrl:%s", new Object[] { "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com" });
    AppMethodBeat.o(108382);
    return "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com";
  }

  public static String au(List<NameValuePair> paramList)
  {
    AppMethodBeat.i(108383);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      NameValuePair localNameValuePair = (NameValuePair)paramList.get(j);
      if (!TextUtils.isEmpty(localNameValuePair.getName()))
      {
        if (j != 0)
          localStringBuilder.append("&");
        localStringBuilder.append(URLEncoder.encode(localNameValuePair.getName(), "UTF-8"));
        localStringBuilder.append("=");
        if (!TextUtils.isEmpty(localNameValuePair.getValue()))
          localStringBuilder.append(URLEncoder.encode(localNameValuePair.getValue(), "UTF-8"));
      }
    }
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(108383);
    return paramList;
  }

  public static boolean cx(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(108384);
    Intent localIntent1 = new Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
    Intent localIntent2 = new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT");
    if ((paramContext.getPackageManager().resolveActivity(localIntent2, 0) != null) && (paramContext.getPackageManager().resolveActivity(localIntent1, 0) != null))
      if (Build.VERSION.SDK_INT >= 8)
        if (paramContext.getSharedPreferences(ah.doA(), 0).getBoolean("googleauth", false))
          AppMethodBeat.o(108384);
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(108384);
      continue;
      AppMethodBeat.o(108384);
      continue;
      AppMethodBeat.o(108384);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.m
 * JD-Core Version:    0.6.2
 */