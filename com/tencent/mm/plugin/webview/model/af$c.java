package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class af$c
{
  static void a(d paramd, String paramString, int paramInt1, ArrayList<String> paramArrayList, af.b paramb, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(6669);
    if (paramd == null)
    {
      ab.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm invoker null");
      AppMethodBeat.o(6669);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("oauth_url", paramString);
      localBundle.putInt("opt", paramInt1);
      localBundle.putStringArrayList("scopes", paramArrayList);
      localBundle.putInt("webview_binder_id", paramInt2);
      if (paramBoolean);
      try
      {
        paramb.add(1373);
        paramd.s(1373, localBundle);
        AppMethodBeat.o(6669);
      }
      catch (RemoteException paramd)
      {
        ab.w("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm doScene exp : %s", new Object[] { paramd.getLocalizedMessage() });
        AppMethodBeat.o(6669);
      }
    }
  }

  public static boolean a(d paramd)
  {
    boolean bool1 = false;
    AppMethodBeat.i(6671);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      paramd = paramd.g(93, localBundle);
      if (paramd == null)
      {
        ab.w("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept Bundle isOauthNative null");
        AppMethodBeat.o(6671);
      }
      while (true)
      {
        return bool1;
        boolean bool2 = paramd.getBoolean("is_oauth_native");
        bool1 = bool2;
        AppMethodBeat.o(6671);
      }
    }
    catch (RemoteException paramd)
    {
      while (true)
      {
        ab.w("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept exp:%s", new Object[] { paramd.getLocalizedMessage() });
        AppMethodBeat.o(6671);
      }
    }
  }

  public static boolean a(String paramString, d paramd)
  {
    boolean bool = false;
    AppMethodBeat.i(6670);
    if ((af.cXD() == null) && (!af.cXE()));
    try
    {
      Object localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      localObject = paramd.g(94, (Bundle)localObject);
      paramd = null;
      if (localObject != null)
        paramd = ((Bundle)localObject).getString("oauth_host_paths");
      localObject = paramd;
      if (bo.isNullOrNil(paramd))
        localObject = "open.weixin.qq.com/connect/oauth2/authorize";
      af.K(((String)localObject).split(";"));
      af.cXF();
      if ((af.cXD() == null) || (af.cXD().length == 0))
      {
        ab.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost sOauthHostPaths nil");
        AppMethodBeat.o(6670);
        return bool;
      }
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.OauthAuthorizeLogic", "isOauthHost exp:%s", new Object[] { paramString.getLocalizedMessage() });
        AppMethodBeat.o(6670);
        continue;
        paramString = Uri.parse(paramString);
        paramString = paramString.getAuthority() + paramString.getPath();
        if (bo.isNullOrNil(paramString))
        {
          ab.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost target nil");
          AppMethodBeat.o(6670);
        }
        else
        {
          ab.d("MicroMsg.OauthAuthorizeLogic", "isOauthHost target:%s", new Object[] { paramString });
          for (int i = 0; ; i++)
          {
            if (i >= af.cXD().length)
              break label243;
            if (paramString.equalsIgnoreCase(af.cXD()[i]))
            {
              AppMethodBeat.o(6670);
              bool = true;
              break;
            }
          }
          label243: AppMethodBeat.o(6670);
        }
      }
    }
  }

  public static boolean a(String paramString1, String paramString2, int paramInt1, d paramd, af.d paramd1, af.b paramb, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(6668);
    if (paramd == null)
    {
      ab.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize invoker null");
      AppMethodBeat.o(6668);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize scene: %d", new Object[] { Integer.valueOf(paramInt1) });
      paramd1.d(new af.c.1(paramd1, paramb));
      paramd1 = new Bundle();
      paramd1.putString("oauth_url", paramString1);
      paramd1.putString("biz_username", paramString2);
      paramd1.putInt("scene", paramInt1);
      paramd1.putInt("webview_binder_id", paramInt2);
      try
      {
        paramb.add(1254);
        paramd.s(1254, paramd1);
        AppMethodBeat.o(6668);
        bool = true;
      }
      catch (RemoteException paramString1)
      {
        ab.w("MicroMsg.OauthAuthorizeLogic", "invoker.doScene exp : %s", new Object[] { paramString1.getLocalizedMessage() });
        AppMethodBeat.o(6668);
      }
    }
  }

  public static String aep(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(6672);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(6672);
    while (true)
    {
      return localObject2;
      try
      {
        String str = Uri.parse(paramString).getQueryParameter("appid");
        localObject2 = str;
        localObject1 = str;
        if (bo.isNullOrNil(str))
        {
          localObject1 = str;
          ab.i("MicroMsg.OauthAuthorizeLogic", "parseAppId try case not sensitive, oauthUrl:%s", new Object[] { paramString });
          localObject1 = str;
          localObject2 = Uri.parse(paramString.toLowerCase()).getQueryParameter("appid");
        }
        AppMethodBeat.o(6672);
      }
      catch (Exception paramString)
      {
        while (true)
          localObject2 = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c
 * JD-Core Version:    0.6.2
 */