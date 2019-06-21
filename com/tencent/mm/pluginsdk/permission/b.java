package com.tencent.mm.pluginsdk.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.app.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;

public final class b
{
  private static HashMap<String, c> vdj;
  private static HashMap<String, d> vdk;

  static
  {
    AppMethodBeat.i(79426);
    vdj = new HashMap();
    vdk = new HashMap();
    AppMethodBeat.o(79426);
  }

  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(79418);
    a.a(paramActivity, paramArrayOfString, paramInt);
    AppMethodBeat.o(79418);
  }

  public static void a(Intent paramIntent, d paramd)
  {
    AppMethodBeat.i(79421);
    a(paramIntent, "", "", paramd);
    AppMethodBeat.o(79421);
  }

  public static void a(Intent paramIntent, String paramString1, String paramString2, d paramd)
  {
    AppMethodBeat.i(79420);
    ab.i("MicroMsg.MPermissionUtil", "startSettings reasonTitle:%s, reasonMsg:%s", new Object[] { paramString1, paramString2 });
    String str = String.valueOf(System.currentTimeMillis());
    vdk.put(str, paramd);
    Context localContext = ah.getContext();
    paramd = new Intent(localContext, PermissionActivity.class);
    paramd.putExtra("scene", 2);
    paramd.setSelector(paramIntent);
    paramd.putExtra("key", str);
    paramd.putExtra("reasonTitle", paramString1);
    paramd.putExtra("reasonMsg", paramString2);
    paramd.addFlags(268435456);
    localContext.startActivity(paramd);
    AppMethodBeat.o(79420);
  }

  public static void a(c paramc, String[] paramArrayOfString)
  {
    AppMethodBeat.i(79419);
    ab.i("MicroMsg.MPermissionUtil", "requestPermission requestCode:%s", new Object[] { Integer.valueOf(1001) });
    Context localContext = ah.getContext();
    Object localObject = new int[2];
    for (int i = 0; i < 2; i++)
      localObject[i] = 0;
    if ((Build.VERSION.SDK_INT < 23) || (e(localContext, paramArrayOfString)))
    {
      paramc.r((int[])localObject);
      AppMethodBeat.o(79419);
    }
    while (true)
    {
      return;
      localObject = String.valueOf(System.currentTimeMillis());
      vdj.put(localObject, paramc);
      paramc = new Intent(localContext, PermissionActivity.class);
      paramc.putExtra("scene", 1);
      paramc.putExtra("requestCode", 1001);
      paramc.putExtra("permission", paramArrayOfString);
      paramc.putExtra("key", (String)localObject);
      paramc.addFlags(268435456);
      localContext.startActivity(paramc);
      AppMethodBeat.o(79419);
    }
  }

  public static boolean a(Activity paramActivity, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    boolean bool = true;
    AppMethodBeat.i(79412);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
      AppMethodBeat.o(79412);
    while (true)
    {
      return bool;
      try
      {
        int i = android.support.v4.content.b.checkSelfPermission(paramActivity, paramString1);
        if (i != 0)
          break;
        AppMethodBeat.o(79412);
      }
      catch (Exception paramActivity)
      {
        ab.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
        AppMethodBeat.o(79412);
      }
    }
    if (!bo.isNullOrNil(paramString3))
      h.a(paramActivity, paramString3, paramString2, false, new b.1(paramActivity, paramString1, paramInt));
    while (true)
    {
      AppMethodBeat.o(79412);
      bool = false;
      break;
      a.a(paramActivity, new String[] { paramString1 }, paramInt);
    }
  }

  public static boolean ai(Activity paramActivity)
  {
    boolean bool1 = false;
    AppMethodBeat.i(79413);
    boolean bool2 = g(paramActivity, "android.permission.WRITE_EXTERNAL_STORAGE");
    ab.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool2) });
    if (!bool2)
      AppMethodBeat.o(79413);
    while (true)
    {
      return bool1;
      bool2 = g(paramActivity, "android.permission.READ_PHONE_STATE");
      ab.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
      {
        AppMethodBeat.o(79413);
      }
      else
      {
        AppMethodBeat.o(79413);
        bool1 = true;
      }
    }
  }

  static c aiT(String paramString)
  {
    AppMethodBeat.i(79424);
    paramString = (c)vdj.remove(paramString);
    AppMethodBeat.o(79424);
    return paramString;
  }

  static d aiU(String paramString)
  {
    AppMethodBeat.i(79425);
    paramString = (d)vdk.remove(paramString);
    AppMethodBeat.o(79425);
    return paramString;
  }

  public static void b(Activity paramActivity, String paramString, int paramInt)
  {
    AppMethodBeat.i(79417);
    a.a(paramActivity, new String[] { paramString }, paramInt);
    AppMethodBeat.o(79417);
  }

  private static boolean bz(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79423);
    try
    {
      int i = android.support.v4.content.b.checkSelfPermission(paramContext, paramString);
      if (i != 0)
      {
        AppMethodBeat.o(79423);
        return bool;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramContext });
        AppMethodBeat.o(79423);
        continue;
        AppMethodBeat.o(79423);
        bool = true;
      }
    }
  }

  public static boolean e(Context paramContext, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(79422);
    if (paramArrayOfString.length == 0)
      AppMethodBeat.o(79422);
    while (true)
    {
      return bool;
      int i = paramArrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label56;
        if (!bz(paramContext, paramArrayOfString[j]))
        {
          AppMethodBeat.o(79422);
          break;
        }
      }
      label56: bool = true;
      AppMethodBeat.o(79422);
    }
  }

  private static boolean g(Activity paramActivity, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(79414);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
      AppMethodBeat.o(79414);
    while (true)
    {
      return bool;
      try
      {
        int i = android.support.v4.content.b.checkSelfPermission(paramActivity, paramString);
        if (i != 0)
          break label75;
        AppMethodBeat.o(79414);
      }
      catch (Exception paramActivity)
      {
        ab.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
        AppMethodBeat.o(79414);
      }
      continue;
      label75: AppMethodBeat.o(79414);
      bool = false;
    }
  }

  public static boolean j(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(79416);
    int i;
    try
    {
      i = android.support.v4.content.b.checkSelfPermission(paramContext, paramString);
      if (i != 0)
      {
        AppMethodBeat.o(79416);
        paramBoolean = false;
        return paramBoolean;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramContext });
        AppMethodBeat.o(79416);
        paramBoolean = false;
        continue;
        if (paramBoolean)
          break;
        AppMethodBeat.o(79416);
        paramBoolean = true;
      }
      str = null;
      if (!paramString.equals("android.permission.READ_CONTACTS"))
        break label109;
    }
    String str = "android.permission.WRITE_CONTACTS";
    label80: if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        i = android.support.v4.content.b.checkSelfPermission(paramContext, str);
        if (i != 0)
          break label151;
        AppMethodBeat.o(79416);
        paramBoolean = true;
        break;
        label109: if (!paramString.equals("android.permission.WRITE_CONTACTS"))
          break label80;
        str = "android.permission.READ_CONTACTS";
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.MPermissionUtil", "check mpermission otherPermisson exception:%s.", new Object[] { paramContext });
        AppMethodBeat.o(79416);
        paramBoolean = false;
      }
      break;
      label151: AppMethodBeat.o(79416);
      paramBoolean = false;
      break;
    }
  }

  public static boolean o(Context paramContext, String paramString)
  {
    AppMethodBeat.i(79415);
    boolean bool = j(paramContext, paramString, true);
    AppMethodBeat.o(79415);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.b
 * JD-Core Version:    0.6.2
 */