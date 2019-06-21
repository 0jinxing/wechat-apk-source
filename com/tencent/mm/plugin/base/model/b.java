package com.tencent.mm.plugin.base.model;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.e.a;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  public static final String SOURCE_KEY;
  private static char[] fuo;
  private static String jDl;

  static
  {
    AppMethodBeat.i(79080);
    SOURCE_KEY = ah.getPackageName();
    jDl = "";
    fuo = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    AppMethodBeat.o(79080);
  }

  public static int C(ad paramad)
  {
    AppMethodBeat.i(79074);
    int i;
    if (paramad.dsf())
    {
      i = 2;
      AppMethodBeat.o(79074);
    }
    while (true)
    {
      return i;
      if (!com.tencent.mm.model.t.nJ(paramad.field_username))
      {
        i = 1;
        AppMethodBeat.o(79074);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(79074);
      }
    }
  }

  public static String Fs(String paramString)
  {
    AppMethodBeat.i(79076);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(79076);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str1 = bo.aw(ah.getContext(), Process.myPid());
      String str2 = ah.getPackageName();
      ab.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { str1 });
      try
      {
        if (str2.equals(str1))
        {
          boolean bool = g.RN().QY();
          if (!bool)
          {
            AppMethodBeat.o(79076);
            paramString = null;
            continue;
          }
          g.RN();
        }
        for (int i = com.tencent.mm.kernel.a.QF(); ; i = aa.ano().gcU.QF())
        {
          if (!paramString.startsWith("shortcut_"))
            break label178;
          paramString = da(new String(Fu(paramString.substring(9))), String.valueOf(i));
          AppMethodBeat.o(79076);
          break;
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(79076);
        paramString = null;
      }
      continue;
      label178: AppMethodBeat.o(79076);
    }
  }

  public static String Ft(String paramString)
  {
    AppMethodBeat.i(79077);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(79077);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str = bo.aw(ah.getContext(), Process.myPid());
      Object localObject = ah.getPackageName();
      if ((((String)localObject).equals(str)) && (!g.RN().QY()))
      {
        AppMethodBeat.o(79077);
        paramString = null;
      }
      else
      {
        ab.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { str });
        try
        {
          if (((String)localObject).equals(str))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            g.RN();
          }
          for (paramString = da(paramString, com.tencent.mm.kernel.a.QF()); ; paramString = da(paramString, aa.ano().gcU.QF()))
          {
            if (!bo.isNullOrNil(paramString))
              break label195;
            AppMethodBeat.o(79077);
            paramString = null;
            break;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
          }
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(79077);
          paramString = null;
        }
        continue;
        label195: paramString = "shortcut_" + V(paramString.getBytes());
        AppMethodBeat.o(79077);
      }
    }
  }

  public static final byte[] Fu(String paramString)
  {
    AppMethodBeat.i(79079);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(79079);
    }
    while (true)
    {
      return paramString;
      byte[] arrayOfByte = new byte[paramString.length() / 2];
      for (int i = 0; i < arrayOfByte.length; i++)
        arrayOfByte[i] = ((byte)(byte)Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16));
      AppMethodBeat.o(79079);
      paramString = arrayOfByte;
    }
  }

  public static String V(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79078);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(79078);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        localStringBuilder.append(fuo[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
        localStringBuilder.append(fuo[(paramArrayOfByte[i] & 0xF)]);
      }
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(79078);
    }
  }

  public static boolean Z(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79062);
    jDl = r.Yz();
    Intent localIntent = a(paramContext, paramString, true, jDl);
    paramString = (Intent)localIntent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(79062);
    }
    while (true)
    {
      return bool;
      a(paramContext, localIntent, paramString.getStringExtra("app_shortcut_custom_id"), true);
      AppMethodBeat.o(79062);
      bool = true;
    }
  }

  private static Intent a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(79072);
    if ((paramString1 == null) || (paramContext == null))
    {
      ab.e("MicroMsg.ShortcutManager", "getIntent, wrong parameters");
      AppMethodBeat.o(79072);
      paramContext = null;
    }
    Bitmap localBitmap;
    ad localad;
    String str;
    while (true)
    {
      return paramContext;
      localBitmap = ab(paramContext, paramString1);
      if (localBitmap == null)
      {
        ab.e("MicroMsg.ShortcutManager", "no bmp");
        AppMethodBeat.o(79072);
        paramContext = null;
      }
      else
      {
        localad = ((j)g.K(j.class)).XM().aoO(paramString1);
        if ((localad == null) || ((int)localad.ewQ <= 0))
        {
          ab.e("MicroMsg.ShortcutManager", "no such user");
          AppMethodBeat.o(79072);
          paramContext = null;
        }
        else
        {
          str = Ft(paramString1);
          ab.i("MicroMsg.ShortcutManager", "alvinluo encryptShortcutUser: %s", new Object[] { str });
          if (!bo.isNullOrNil(str))
            break;
          AppMethodBeat.o(79072);
          paramContext = null;
        }
      }
    }
    Intent localIntent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
    localIntent.putExtra("LauncherUI.Shortcut.Username", str);
    localIntent.putExtra("LauncherUI.From.Biz.Shortcut", true);
    localIntent.putExtra("app_shortcut_custom_id", str);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.addFlags(67108864);
    if (paramBoolean);
    for (paramContext = "com.android.launcher.action.INSTALL_SHORTCUT"; ; paramContext = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      paramContext = new Intent(paramContext);
      paramContext.putExtra("android.intent.extra.shortcut.NAME", com.tencent.mm.model.t.a(localad, paramString1));
      paramContext.putExtra("duplicate", false);
      paramContext.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
      paramContext.putExtra("android.intent.extra.shortcut.ICON", localBitmap);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", SOURCE_KEY);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", Ft(paramString2));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", str);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", C(localad));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
      AppMethodBeat.o(79072);
      break;
    }
  }

  public static void a(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(79064);
    if (paramContext == null)
    {
      ab.e("MicroMsg.ShortcutManager", "context is null");
      AppMethodBeat.o(79064);
    }
    while (true)
    {
      return;
      if (paramIntent != null)
        break;
      ab.e("MicroMsg.ShortcutManager", "intent is null");
      AppMethodBeat.o(79064);
    }
    if (Build.VERSION.SDK_INT < 26);
    for (boolean bool = a(paramContext, paramIntent, paramBoolean); ; bool = b(paramContext, paramIntent, paramString, paramBoolean))
    {
      if ((!bool) && (paramBoolean))
        d(paramContext, false, paramBoolean);
      AppMethodBeat.o(79064);
      break;
    }
  }

  private static boolean a(Context paramContext, Intent paramIntent, boolean paramBoolean)
  {
    AppMethodBeat.i(79066);
    paramContext.sendBroadcast(paramIntent);
    d(paramContext, true, paramBoolean);
    AppMethodBeat.o(79066);
    return true;
  }

  public static boolean aa(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79070);
    jDl = r.Yz();
    s(paramContext, a(paramContext, paramString, false, jDl));
    AppMethodBeat.o(79070);
    return true;
  }

  private static Bitmap ab(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79073);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * 48.0F);
    paramString = com.tencent.mm.ah.b.a(paramString, false, -1);
    paramContext = paramString;
    if (paramString == null)
    {
      ab.e("MicroMsg.ShortcutManager", "getScaledBitmap fail, bmp is null");
      paramContext = d.LV(2130838444);
    }
    if (paramContext == null)
    {
      ab.e("MicroMsg.ShortcutManager", "use default avatar, bmp is null");
      paramContext = null;
      AppMethodBeat.o(79073);
    }
    while (true)
    {
      return paramContext;
      paramContext = Bitmap.createScaledBitmap(paramContext, i, i, false);
      AppMethodBeat.o(79073);
    }
  }

  @TargetApi(26)
  private static boolean b(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(79067);
    ShortcutManager localShortcutManager = (ShortcutManager)paramContext.getSystemService(ShortcutManager.class);
    if (localShortcutManager == null)
    {
      ab.e("MicroMsg.ShortcutManager", "shortcut manager is null");
      paramBoolean = false;
      AppMethodBeat.o(79067);
    }
    Intent localIntent;
    while (true)
    {
      return paramBoolean;
      if (!localShortcutManager.isRequestPinShortcutSupported())
      {
        ab.e("MicroMsg.ShortcutManager", "alvinluo not support pin shortcuts");
        paramBoolean = false;
        AppMethodBeat.o(79067);
      }
      else if (paramIntent.getBooleanExtra("is_main_shortcut", false))
      {
        ab.i("MicroMsg.ShortcutManager", "alvinluo main icon, do not create shortcut");
        paramBoolean = false;
        AppMethodBeat.o(79067);
      }
      else
      {
        localIntent = (Intent)paramIntent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        if (localIntent != null)
          break;
        ab.e("MicroMsg.ShortcutManager", "alvinluo shortcut intent is null");
        paramBoolean = false;
        AppMethodBeat.o(79067);
      }
    }
    String str1 = paramString;
    if (bo.isNullOrNil(paramString))
      str1 = localIntent.getStringExtra("app_shortcut_custom_id");
    if (bo.isNullOrNil(str1))
    {
      ab.i("MicroMsg.ShortcutManager", "alvinluo shortcutId is null, then use short name as shortcutId");
      str1 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
    }
    for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.ShortcutManager", "alvinluo shortcutId: %s", new Object[] { str1 });
      String str2 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
      paramString = (Intent.ShortcutIconResource)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
      if (paramString != null)
        ab.i("MicroMsg.ShortcutManager", "alvinluo icon resource name: %s, %s", new Object[] { paramString.resourceName, paramString.packageName });
      Object localObject = (Bitmap)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON");
      paramString = (String)localObject;
      if (localObject == null)
      {
        ab.i("MicroMsg.ShortcutManager", "extra_shortcut_icon is null, use icon resource id");
        j = paramIntent.getIntExtra("shortcut_icon_resource_id", -1);
        if (j == -1)
        {
          ab.e("MicroMsg.ShortcutManager", "icon resource id is null");
          paramBoolean = false;
          AppMethodBeat.o(79067);
          break;
        }
        paramString = BitmapFactory.decodeResource(paramContext.getResources(), j);
      }
      if (paramString == null)
      {
        ab.e("MicroMsg.ShortcutManager", "icon bitmap is null");
        paramBoolean = false;
        AppMethodBeat.o(79067);
        break;
      }
      boolean bool = paramIntent.getBooleanExtra("shortcut_is_adaptive_icon", false);
      localObject = new ShortcutInfo.Builder(paramContext, str1).setShortLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setLongLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setIntent(localIntent);
      if (bool)
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithBitmap(paramString));
      while (true)
      {
        paramString = ((ShortcutInfo.Builder)localObject).build();
        bool = paramIntent.getBooleanExtra("duplicate", false);
        ab.i("MicroMsg.ShortcutManager", "alvinluo add shortcut above android o, duplicate: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          break label484;
        localShortcutManager.requestPinShortcut(paramString, null);
        d(paramContext, true, paramBoolean);
        paramBoolean = true;
        AppMethodBeat.o(79067);
        break;
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithAdaptiveBitmap(paramString));
      }
      label484: paramIntent = localShortcutManager.getPinnedShortcuts();
      int j = 0;
      label493: if (j < paramIntent.size())
      {
        localObject = (ShortcutInfo)paramIntent.get(j);
        if (i != 0)
        {
          if ((localObject == null) || (((ShortcutInfo)localObject).getShortLabel() == null) || (!((ShortcutInfo)localObject).getShortLabel().equals(str2)))
            break label652;
          bool = true;
        }
      }
      while (true)
      {
        ab.i("MicroMsg.ShortcutManager", "alvinluo shortcut exist: %b, shortcutName: %s", new Object[] { Boolean.valueOf(bool), str2 });
        if (bool)
        {
          paramIntent = new ArrayList();
          paramIntent.add(paramString);
          ab.i("MicroMsg.ShortcutManager", "alvinluo update shortcuts result: %b", new Object[] { Boolean.valueOf(localShortcutManager.updateShortcuts(paramIntent)) });
          d(paramContext, true, paramBoolean);
          break;
          if ((localObject != null) && (((ShortcutInfo)localObject).getId().equals(str1)))
          {
            bool = true;
            continue;
          }
          label652: j++;
          break label493;
        }
        if (paramBoolean)
        {
          paramIntent = localShortcutManager.createShortcutResultIntent(paramString);
          paramIntent.setClass(paramContext, ShortcutBroadCastReceiver.class);
          localShortcutManager.requestPinShortcut(paramString, PendingIntent.getBroadcast(paramContext, 0, paramIntent, 134217728).getIntentSender());
          break;
        }
        localShortcutManager.requestPinShortcut(paramString, null);
        break;
        bool = false;
      }
    }
  }

  private static void d(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(79068);
    if (paramBoolean2)
      if (!paramBoolean1)
        break label35;
    label35: for (String str = paramContext.getString(2131296524); ; str = paramContext.getString(2131296522))
    {
      h.bQ(paramContext, str);
      AppMethodBeat.o(79068);
      return;
    }
  }

  public static String da(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79075);
    try
    {
      int[] arrayOfInt = new int[256];
      byte[] arrayOfByte = new byte[256];
      for (int i = 0; i < 256; i++)
        arrayOfInt[i] = i;
      for (i = 0; i < 256; i = (short)(i + 1))
        arrayOfByte[i] = ((byte)(byte)paramString2.charAt(i % paramString2.length()));
      i = 0;
      int j = 0;
      while (i < 255)
      {
        j = (j + arrayOfInt[i] + arrayOfByte[i]) % 256;
        k = arrayOfInt[i];
        arrayOfInt[i] = arrayOfInt[j];
        arrayOfInt[j] = k;
        i++;
      }
      paramString1 = paramString1.toCharArray();
      paramString2 = new char[paramString1.length];
      i = 0;
      int k = 0;
      j = 0;
      while (i < paramString1.length)
      {
        k = (k + 1) % 256;
        j = (j + arrayOfInt[k]) % 256;
        int m = arrayOfInt[k];
        arrayOfInt[k] = arrayOfInt[j];
        arrayOfInt[j] = m;
        int n = arrayOfInt[((arrayOfInt[k] + arrayOfInt[j] % 256) % 256)];
        m = paramString1[i];
        paramString2[i] = ((char)(char)((char)n ^ m));
        i = (short)(i + 1);
      }
      paramString1 = new String(paramString2);
      AppMethodBeat.o(79075);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.ShortcutManager", "Exception in rc4, %s", new Object[] { paramString1.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShortcutManager", paramString1, "", new Object[0]);
        paramString1 = null;
        AppMethodBeat.o(79075);
      }
    }
  }

  public static void q(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(79063);
    a(paramContext, paramIntent, null, true);
    AppMethodBeat.o(79063);
  }

  public static void r(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(79065);
    a(paramContext, paramIntent, null, false);
    AppMethodBeat.o(79065);
  }

  public static boolean s(Context paramContext, Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(79071);
    if (paramContext == null)
    {
      ab.e("MicroMsg.ShortcutManager", "context is null");
      AppMethodBeat.o(79071);
    }
    while (true)
    {
      return bool;
      if (paramIntent == null)
      {
        ab.e("MicroMsg.ShortcutManager", "intent is null");
        AppMethodBeat.o(79071);
      }
      else if (Build.VERSION.SDK_INT < 26)
      {
        paramContext.sendBroadcast(paramIntent);
        AppMethodBeat.o(79071);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(79071);
        bool = true;
      }
    }
  }

  public static void x(Activity paramActivity)
  {
    AppMethodBeat.i(79069);
    if (!ah.getContext().getSharedPreferences(ah.doA(), 0).getBoolean("no_more_show_add_short_cut_dialog", false))
    {
      e.a locala = new e.a(paramActivity);
      locala.asO(paramActivity.getString(2131303519));
      String str1 = paramActivity.getString(2131303520);
      String str2 = paramActivity.getString(2131303518);
      locala.al(str1);
      locala.asL(str2);
      locala.Qg(2131296955);
      locala.zQM = true;
      locala.a(new b.1(locala, paramActivity));
      locala.show();
    }
    AppMethodBeat.o(79069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.model.b
 * JD-Core Version:    0.6.2
 */