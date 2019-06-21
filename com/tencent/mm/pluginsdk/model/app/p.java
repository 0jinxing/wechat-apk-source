package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.plugin.s.a.a;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class p
{
  public static String B(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79337);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "buildRedirectUrl fail, invalid arguments");
      paramString1 = null;
      AppMethodBeat.o(79337);
      return paramString1;
    }
    int i = paramString1.indexOf("#");
    String str1;
    if (i >= 0)
    {
      str1 = paramString1.substring(i);
      paramString1 = paramString1.substring(0, i);
    }
    while (true)
    {
      i = paramString1.indexOf("?");
      Object localObject = "";
      String str2 = paramString1;
      if (i >= 0)
      {
        localObject = paramString1.substring(i + 1);
        str2 = paramString1.substring(0, i);
      }
      ab.v("MicroMsg.AppUtil", "buildRedirectUrl, sharpStr = %s, paramStr = %s, srcUrl = %s", new Object[] { str1, localObject, str2 });
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      if (!bo.isNullOrNil((String)localObject))
      {
        String[] arrayOfString = ((String)localObject).split("&");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          int j = arrayOfString.length;
          i = 0;
          if (i < j)
          {
            String str3 = arrayOfString[i];
            if (!bo.isNullOrNil(str3))
            {
              int k = str3.indexOf("=");
              ab.v("MicroMsg.AppUtil", "buildRedirectUrl, equalIdx = %d", new Object[] { Integer.valueOf(k) });
              if (k < 0)
                break label252;
              localObject = str3.substring(0, k + 1);
              paramString1 = str3.substring(k + 1);
            }
            while (true)
            {
              localLinkedHashMap.put(localObject, paramString1);
              i++;
              break;
              label252: paramString1 = "";
              localObject = str3;
            }
          }
        }
      }
      paramString1 = paramString2;
      if (paramString2 == null)
        paramString1 = "";
      localLinkedHashMap.put("from=", paramString1);
      ab.v("MicroMsg.AppUtil", "buildRedirectUrl, pMap size = %d", new Object[] { Integer.valueOf(localLinkedHashMap.size()) });
      paramString1 = new StringBuilder();
      localObject = localLinkedHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramString2 = (String)((Iterator)localObject).next();
        if (paramString1.length() > 0)
          paramString1.append("&");
        paramString1.append(paramString2);
        paramString1.append((String)localLinkedHashMap.get(paramString2));
      }
      paramString1 = paramString1.toString();
      paramString2 = str2 + "?" + paramString1;
      paramString1 = paramString2;
      if (!bo.isNullOrNil(str1))
        paramString1 = paramString2 + str1;
      ab.v("MicroMsg.AppUtil", "buildRedirectUrl, ret url = %s", new Object[] { paramString1 });
      AppMethodBeat.o(79337);
      break;
      str1 = "";
    }
  }

  public static String C(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(79336);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
      paramContext = null;
      AppMethodBeat.o(79336);
      return paramContext;
    }
    String str1 = aa.g(paramContext.getSharedPreferences(ah.doA(), 0));
    String str2;
    if ((str1 == null) || (str1.length() == 0))
      str2 = "zh_CN";
    while (true)
    {
      paramContext = paramContext.getString(2131301886, new Object[] { paramString1, Integer.valueOf(d.vxo), str2, d.eSg, paramString2, Integer.valueOf(0) });
      AppMethodBeat.o(79336);
      break;
      str2 = str1;
      if (str1.equals("en"))
        str2 = "en_US";
    }
  }

  public static boolean a(Context paramContext, f paramf, String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(79342);
    a locala = a.a.bYQ();
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "isAppValid, packageName is null");
      locala.c(paramf);
      AppMethodBeat.o(79342);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      if (paramf == null)
      {
        ab.i("MicroMsg.AppUtil", "app does not exist");
        AppMethodBeat.o(79342);
        paramBoolean = bool;
      }
      else if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
      {
        ab.e("MicroMsg.AppUtil", "isAppValid fail, local packageName is null");
        locala.c(paramf);
        AppMethodBeat.o(79342);
        paramBoolean = false;
      }
      else if ((paramf.field_signature == null) || (paramf.field_signature.length() == 0))
      {
        ab.e("MicroMsg.AppUtil", "isAppValid fail, local signature is null");
        locala.c(paramf);
        AppMethodBeat.o(79342);
        paramBoolean = false;
      }
      else
      {
        Signature[] arrayOfSignature = bx(paramContext, paramString);
        if ((arrayOfSignature == null) || (arrayOfSignature.length == 0))
        {
          ab.e("MicroMsg.AppUtil", "isAppValid, apk signatures is null");
          locala.c(paramf);
          AppMethodBeat.o(79342);
          paramBoolean = false;
        }
        else if (!paramf.field_packageName.equals(paramString))
        {
          ab.e("MicroMsg.AppUtil", "isAppValid, packageName is diff, src:%s,local:%s", new Object[] { paramf.field_packageName, paramString });
          locala.c(paramf);
          if (paramBoolean)
            Toast.makeText(paramContext, paramContext.getString(2131301883), 1).show();
          AppMethodBeat.o(79342);
          paramBoolean = false;
        }
        else
        {
          ab.i("MicroMsg.AppUtil", "server signatures:%s", new Object[] { paramf.field_signature });
          int i = arrayOfSignature.length;
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label373;
            paramString = q.aiQ(g.x(arrayOfSignature[j].toByteArray()));
            ab.i("MicroMsg.AppUtil", "local signatures:%s", new Object[] { paramString });
            if ((paramf.field_signature != null) && (paramf.field_signature.equals(paramString)))
            {
              locala.d(paramf);
              AppMethodBeat.o(79342);
              paramBoolean = bool;
              break;
            }
          }
          label373: if (paramBoolean)
            Toast.makeText(paramContext, paramContext.getString(2131301884), 1).show();
          ab.w("MicroMsg.AppUtil", "isAppValid, signature is diff");
          locala.c(paramf);
          AppMethodBeat.o(79342);
          paramBoolean = false;
        }
      }
    }
  }

  public static String aiO(String paramString)
  {
    AppMethodBeat.i(79340);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
      paramString = null;
      AppMethodBeat.o(79340);
    }
    while (true)
    {
      return paramString;
      paramString = q.aiQ(paramString);
      AppMethodBeat.o(79340);
    }
  }

  public static void aiP(String paramString)
  {
    AppMethodBeat.i(79348);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppUtil", "appid is null");
      AppMethodBeat.o(79348);
    }
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = ah.doB();
      if (localSharedPreferences != null)
      {
        String str = localSharedPreferences.getString("key_app_ids_registion_while_not_login", "");
        if (str.contains(paramString))
        {
          ab.i("MicroMsg.AppUtil", "this app has been saved : %s in %s", new Object[] { paramString, str });
          AppMethodBeat.o(79348);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(paramString);
          localStringBuilder.append("|");
          localStringBuilder.append(str);
          paramString = localStringBuilder.toString();
          localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", paramString).commit();
        }
      }
      else
      {
        AppMethodBeat.o(79348);
      }
    }
  }

  public static void at(Bundle paramBundle)
  {
    AppMethodBeat.i(79343);
    if (paramBundle != null)
      paramBundle.putString("wx_token_key", "com.tencent.mm.openapi.token");
    AppMethodBeat.o(79343);
  }

  public static void au(Bundle paramBundle)
  {
    AppMethodBeat.i(79344);
    if (paramBundle != null)
      paramBundle.putString("platformId", "wechat");
    AppMethodBeat.o(79344);
  }

  public static boolean b(Context paramContext, f paramf)
  {
    boolean bool = true;
    AppMethodBeat.i(79347);
    ab.i("MicroMsg.AppUtil", "check the signature of the Application.");
    if (paramContext == null)
    {
      ab.e("MicroMsg.AppUtil", "context is null.");
      AppMethodBeat.o(79347);
    }
    while (true)
    {
      return bool;
      if (paramf == null)
      {
        ab.e("MicroMsg.AppUtil", "appInfo is null.");
        AppMethodBeat.o(79347);
      }
      else if (bo.isNullOrNil(paramf.field_packageName))
      {
        ab.e("MicroMsg.AppUtil", "packageName is null.");
        AppMethodBeat.o(79347);
      }
      else if (bo.isNullOrNil(paramf.field_signature))
      {
        ab.e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", new Object[] { paramf.field_packageName });
        AppMethodBeat.o(79347);
      }
      else
      {
        paramContext = bx(paramContext, paramf.field_packageName);
        if ((paramContext == null) || (paramContext.length == 0))
        {
          ab.e("MicroMsg.AppUtil", "apk signatures is null");
          AppMethodBeat.o(79347);
          bool = false;
        }
        else
        {
          int i = paramContext.length;
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label239;
            String str = q.aiQ(g.x(paramContext[j].toByteArray()));
            if (paramf.field_signature.equals(str))
            {
              ab.i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", new Object[] { paramf.field_appName, paramf.field_signature });
              AppMethodBeat.o(79347);
              break;
            }
          }
          label239: ab.w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", new Object[] { paramf.field_appName });
          AppMethodBeat.o(79347);
          bool = false;
        }
      }
    }
  }

  public static String bw(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79339);
    paramContext = bx(paramContext, paramString);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      ab.e("MicroMsg.AppUtil", "signs is null");
      paramContext = null;
      AppMethodBeat.o(79339);
    }
    while (true)
    {
      return paramContext;
      paramContext = q.aiQ(g.x(paramContext[0].toByteArray()));
      AppMethodBeat.o(79339);
    }
  }

  public static Signature[] bx(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(79346);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "getSignature, packageName is null");
      AppMethodBeat.o(79346);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getPackageManager();
      try
      {
        paramContext = paramContext.getPackageInfo(paramString, 64);
        if (paramContext != null)
          break label100;
        ab.e("MicroMsg.AppUtil", "info is null, packageName = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(79346);
        paramContext = localObject;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.e("MicroMsg.AppUtil", "NameNotFoundException");
        AppMethodBeat.o(79346);
        paramContext = localObject;
      }
      continue;
      label100: paramContext = paramContext.signatures;
      AppMethodBeat.o(79346);
    }
  }

  public static boolean d(Context paramContext, f paramf, String paramString)
  {
    AppMethodBeat.i(138581);
    boolean bool = a(paramContext, paramf, paramString, false);
    AppMethodBeat.o(138581);
    return bool;
  }

  public static void dhH()
  {
    ao.vdg = null;
    ao.vdh = -1L;
  }

  public static void dhI()
  {
    AppMethodBeat.i(79349);
    SharedPreferences localSharedPreferences = ah.doB();
    if (localSharedPreferences != null)
      localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", "").commit();
    AppMethodBeat.o(79349);
  }

  public static String f(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(79335);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      ab.e("MicroMsg.AppUtil", "buildSourceUrl fail, invalid arguments");
      paramContext = null;
      AppMethodBeat.o(79335);
      return paramContext;
    }
    String str1 = aa.g(paramContext.getSharedPreferences(ah.doA(), 0));
    String str2;
    if ((str1 == null) || (str1.length() == 0))
      str2 = "zh_CN";
    while (true)
    {
      paramContext = paramContext.getString(2131301885, new Object[] { paramString1, Integer.valueOf(d.vxo), str2, d.eSg, paramString2 });
      AppMethodBeat.o(79335);
      break;
      str2 = str1;
      if (str1.equals("en"))
        str2 = "en_US";
    }
  }

  public static void j(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(79345);
    paramBundle.putString("platformId", "wechat");
    if (!bo.isNullOrNil(paramString))
      paramBundle.putString("launchParam", paramString);
    AppMethodBeat.o(79345);
  }

  public static boolean u(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79338);
    boolean bool;
    if (b.getPackageInfo(paramContext, paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(79338);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.p
 * JD-Core Version:    0.6.2
 */