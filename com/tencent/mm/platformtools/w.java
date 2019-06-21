package com.tencent.mm.platformtools;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Settings;
import com.jg.JgMethodChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class w
{
  public static boolean I(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(124568);
    boolean bool2 = bo.isNullOrNil(paramString);
    ab.v("MicroMsg.MMAccountManager", "remove account : ".concat(String.valueOf(paramString)));
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMAccountManager", "null context");
      AppMethodBeat.o(124568);
    }
    while (true)
    {
      return bool1;
      try
      {
        Account[] arrayOfAccount = cs(paramContext);
        if ((arrayOfAccount == null) || (arrayOfAccount.length == 0))
        {
          ab.d("MicroMsg.MMAccountManager", "get account info is null or nil");
          AppMethodBeat.o(124568);
          bool1 = true;
          continue;
        }
        AccountManager localAccountManager = AccountManager.get(paramContext);
        int i = arrayOfAccount.length;
        int j = 0;
        if (j >= i)
          break label206;
        paramContext = arrayOfAccount[j];
        if (bool2)
          localAccountManager.removeAccount(paramContext, null, null);
        while (true)
        {
          j++;
          break;
          if (paramContext.name.equals(paramString))
          {
            localAccountManager.removeAccount(paramContext, null, null);
            ab.i("MicroMsg.MMAccountManager", "remove account success: ".concat(String.valueOf(paramString)));
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        ab.e("MicroMsg.MMAccountManager", "exception in removeAccount() " + paramContext.getMessage());
        AppMethodBeat.o(124568);
      }
      continue;
      label206: AppMethodBeat.o(124568);
      bool1 = true;
    }
  }

  public static void J(Context paramContext, String paramString)
  {
    AppMethodBeat.i(124573);
    if (cp(paramContext))
    {
      com.tencent.mm.sdk.g.d.h(new h(paramContext, cr(paramContext), paramString), "MMAccountManager_deleteSpecifiedContact").start();
      AppMethodBeat.o(124573);
    }
    while (true)
    {
      return;
      I(paramContext, null);
      ab.d("MicroMsg.MMAccountManager", "no account added or not current account");
      AppMethodBeat.o(124573);
    }
  }

  private static boolean K(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(124578);
    paramContext = cs(paramContext);
    if ((paramContext == null) || (paramContext.length == 0))
      AppMethodBeat.o(124578);
    while (true)
    {
      return bool;
      int i = paramContext.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label70;
        if (paramContext[j].name.equals(paramString))
        {
          bool = true;
          AppMethodBeat.o(124578);
          break;
        }
      }
      label70: AppMethodBeat.o(124578);
    }
  }

  private static Account[] L(Context paramContext, String paramString)
  {
    AppMethodBeat.i(124579);
    Object localObject = null;
    try
    {
      paramContext = AccountManager.get(paramContext).getAccountsByType(paramString);
      AppMethodBeat.o(124579);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MMAccountManager", "get all accounts failed");
        ab.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        paramContext = localObject;
      }
    }
  }

  public static int a(Context paramContext, w.a parama)
  {
    AppMethodBeat.i(124565);
    int i;
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMAccountManager", "context is null");
      AppMethodBeat.o(124565);
      i = 0;
    }
    while (true)
    {
      return i;
      Object localObject1 = anQ();
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
      {
        ab.e("MicroMsg.MMAccountManager", "account username is null or nil");
        localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, "");
        if (bo.isNullOrNil((String)localObject2));
      }
      else
      {
        if (!K(paramContext, (String)localObject2))
          break label101;
        i = 3;
        AppMethodBeat.o(124565);
        continue;
      }
      AppMethodBeat.o(124565);
      i = 0;
      continue;
      label101: if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
      {
        AppMethodBeat.o(124565);
        i = 2;
      }
      else
      {
        try
        {
          paramContext = AccountManager.get(paramContext);
          localObject1 = new android/accounts/Account;
          ((Account)localObject1).<init>((String)localObject2, "com.tencent.mm.account");
          if (paramContext.addAccountExplicitly((Account)localObject1, "", null))
          {
            ContentResolver.setSyncAutomatically((Account)localObject1, "com.android.contacts", true);
            paramContext = new android/os/Bundle;
            paramContext.<init>();
            paramContext.putString("authAccount", (String)localObject2);
            paramContext.putString("accountType", "com.tencent.mm.account");
            if (parama != null)
              parama.o(paramContext);
            AppMethodBeat.o(124565);
            i = 1;
          }
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
          ab.e("MicroMsg.MMAccountManager", "exception in addAccountNoNeedBindMobile() " + paramContext.getMessage());
          if (parama != null)
            parama.o(null);
          AppMethodBeat.o(124565);
          i = 2;
        }
      }
    }
  }

  public static int a(Context paramContext, String paramString, w.a parama)
  {
    int i = 0;
    AppMethodBeat.i(124566);
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMAccountManager", "activity is null");
      AppMethodBeat.o(124566);
    }
    while (true)
    {
      return i;
      if (!bo.isNullOrNil(paramString))
        break;
      ab.e("MicroMsg.MMAccountManager", "account username is null or nil");
      AppMethodBeat.o(124566);
    }
    Object localObject = anQ();
    if (bo.isNullOrNil((String)localObject));
    while (true)
    {
      try
      {
        AccountManager localAccountManager = AccountManager.get(paramContext);
        localObject = new android/accounts/Account;
        ((Account)localObject).<init>(paramString, "com.tencent.mm.account");
        boolean bool = b.o(paramContext, "android.permission.READ_CONTACTS");
        if (!bool)
        {
          AppMethodBeat.o(124566);
          i = 2;
          break;
        }
        if (K(paramContext, paramString))
        {
          ContentResolver.setSyncAutomatically((Account)localObject, "com.android.contacts", true);
          i = 3;
          AppMethodBeat.o(124566);
          break;
        }
        I(paramContext, null);
        if (localAccountManager.addAccountExplicitly((Account)localObject, "", null))
        {
          ContentResolver.setSyncAutomatically((Account)localObject, "com.android.contacts", true);
          localObject = new android/os/Bundle;
          ((Bundle)localObject).<init>();
          ((Bundle)localObject).putString("authAccount", paramString);
          ((Bundle)localObject).putString("accountType", "com.tencent.mm.account");
          if (parama != null)
            parama.o((Bundle)localObject);
          localObject = new android/content/ContentValues;
          ((ContentValues)localObject).<init>();
          ((ContentValues)localObject).put("account_name", paramString);
          ((ContentValues)localObject).put("account_type", "com.tencent.mm.account");
          ((ContentValues)localObject).put("should_sync", Integer.valueOf(1));
          ((ContentValues)localObject).put("ungrouped_visible", Integer.valueOf(1));
          paramContext.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, (ContentValues)localObject);
          AppMethodBeat.o(124566);
          i = 1;
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        ab.e("MicroMsg.MMAccountManager", "exception in addAccount() " + paramContext.getMessage());
        if (parama != null)
          parama.o(null);
        AppMethodBeat.o(124566);
        i = 2;
      }
      break;
      paramString = (String)localObject;
    }
  }

  private static String anQ()
  {
    AppMethodBeat.i(124570);
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.e("MicroMsg.MMAccountManager", "getCurrentAccountName MMCore.acc Not Ready");
      localObject = "";
      AppMethodBeat.o(124570);
      return localObject;
    }
    Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(4, null);
    if (!bo.isNullOrNil((String)localObject));
    while (true)
    {
      localObject = vu((String)localObject);
      AppMethodBeat.o(124570);
      break;
      String str = r.YA();
      localObject = str;
      if (bo.isNullOrNil(str))
      {
        str = r.Yz();
        if (!bo.isNullOrNil(str))
        {
          localObject = str;
          if (!ad.aoA(str));
        }
        else
        {
          localObject = "";
        }
      }
    }
  }

  public static void cm(Context paramContext)
  {
    AppMethodBeat.i(124567);
    com.tencent.mm.bp.d.dlL();
    if (com.tencent.mm.sdk.platformtools.g.cdl == 0)
    {
      ab.d("MicroMsg.MMAccountManager", "do not auto add account");
      AppMethodBeat.o(124567);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.sdk.platformtools.g.cdl == 1)
      {
        if (l.apS() == l.a.gvz)
        {
          ab.d("MicroMsg.MMAccountManager", "auto add account result: ".concat(String.valueOf(a(paramContext, l.apU(), null))));
          AppMethodBeat.o(124567);
        }
        else
        {
          ab.i("MicroMsg.MMAccountManager", "the user not bind mobile or not aggreed to upload addressbook");
          AppMethodBeat.o(124567);
        }
      }
      else
      {
        if (com.tencent.mm.sdk.platformtools.g.cdl == 2)
          ab.d("MicroMsg.MMAccountManager", "auto add account result: ".concat(String.valueOf(a(paramContext, null))));
        AppMethodBeat.o(124567);
      }
    }
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public static boolean cn(Context paramContext)
  {
    AppMethodBeat.i(124569);
    boolean bool1 = false;
    if (paramContext != null)
    {
      Intent localIntent = new Intent("com.tencent.mm.login.ACTION_LOGOUT");
      localIntent.putExtra("accountName", anQ());
      localIntent.putExtra("accountType", "com.tencent.mm.account");
      boolean bool2 = I(paramContext, anQ());
      bool1 = bool2;
      if (bool2)
      {
        paramContext.sendBroadcast(localIntent);
        bool1 = bool2;
      }
    }
    AppMethodBeat.o(124569);
    return bool1;
  }

  public static void co(Context paramContext)
  {
    AppMethodBeat.i(124571);
    if (cp(paramContext))
    {
      com.tencent.mm.sdk.g.d.h(new h(paramContext, cr(paramContext)), "MMAccountManager_updateAllContact").start();
      AppMethodBeat.o(124571);
    }
    while (true)
    {
      return;
      I(paramContext, null);
      ab.d("MicroMsg.MMAccountManager", "no account added or not current account");
      AppMethodBeat.o(124571);
    }
  }

  private static boolean cp(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(124574);
    paramContext = cr(paramContext);
    if (paramContext == null)
      AppMethodBeat.o(124574);
    while (true)
    {
      return bool;
      if (paramContext.name.equals(anQ()))
      {
        bool = true;
        AppMethodBeat.o(124574);
      }
      else
      {
        AppMethodBeat.o(124574);
      }
    }
  }

  public static boolean cq(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(124575);
    if (!cp(paramContext))
    {
      ab.e("MicroMsg.MMAccountManager", "no account added or not current account");
      AppMethodBeat.o(124575);
    }
    while (true)
    {
      return bool;
      if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
      {
        AppMethodBeat.o(124575);
      }
      else
      {
        paramContext = cr(paramContext);
        if (paramContext != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putBoolean("expedited", true);
          localBundle.putBoolean("do_not_retry", true);
          ContentResolver.requestSync(paramContext, "com.android.contacts", localBundle);
          AppMethodBeat.o(124575);
          bool = true;
        }
        else
        {
          ab.e("MicroMsg.MMAccountManager", "no account added");
          AppMethodBeat.o(124575);
        }
      }
    }
  }

  private static Account cr(Context paramContext)
  {
    AppMethodBeat.i(124576);
    Object localObject1 = anQ();
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, "");
    if (!bo.isNullOrNil((String)localObject2))
    {
      localObject1 = cs(paramContext);
      if (localObject1 == null)
      {
        AppMethodBeat.o(124576);
        paramContext = null;
      }
    }
    while (true)
    {
      return paramContext;
      int i = localObject1.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label105;
        paramContext = localObject1[j];
        if (paramContext.name.equals(localObject2))
        {
          AppMethodBeat.o(124576);
          break;
        }
      }
      label105: AppMethodBeat.o(124576);
      paramContext = null;
    }
  }

  private static Account[] cs(Context paramContext)
  {
    AppMethodBeat.i(124577);
    try
    {
      paramContext = AccountManager.get(paramContext).getAccountsByType("com.tencent.mm.account");
      AppMethodBeat.o(124577);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MMAccountManager", "get all accounts failed");
        ab.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(124577);
      }
    }
  }

  public static String ct(Context paramContext)
  {
    AppMethodBeat.i(124580);
    Account[] arrayOfAccount = L(paramContext, "com.google");
    Object localObject = null;
    String str = null;
    paramContext = localObject;
    if (arrayOfAccount != null)
    {
      paramContext = localObject;
      if (arrayOfAccount.length > 0)
      {
        int i = arrayOfAccount.length;
        int j = 0;
        for (paramContext = str; j < i; paramContext = str)
        {
          str = arrayOfAccount[j].name;
          if (!bo.isNullOrNil(str))
          {
            paramContext = str;
            if (bo.amW(str))
              break;
          }
          j++;
        }
      }
    }
    AppMethodBeat.o(124580);
    return paramContext;
  }

  public static void n(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124572);
    if (cp(paramContext))
    {
      com.tencent.mm.sdk.g.d.h(new h(paramContext, cr(paramContext), paramString1, paramString2), "MMAccountManager_updateSpecifiedContact").start();
      AppMethodBeat.o(124572);
    }
    while (true)
    {
      return;
      I(paramContext, null);
      ab.d("MicroMsg.MMAccountManager", "no account added or not current account");
      AppMethodBeat.o(124572);
    }
  }

  private static String vu(String paramString)
  {
    AppMethodBeat.i(124581);
    try
    {
      String str = Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#¥￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).replaceAll("_").trim();
      paramString = str;
      AppMethodBeat.o(124581);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMAccountManager", "stringFilter failed, %s, %s", new Object[] { paramString, localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.MMAccountManager", localException, "", new Object[0]);
        AppMethodBeat.o(124581);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.w
 * JD-Core Version:    0.6.2
 */