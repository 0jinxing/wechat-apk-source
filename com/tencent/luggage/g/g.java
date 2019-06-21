package com.tencent.luggage.g;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.app.a;
import android.support.v4.content.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
{
  public static boolean a(Activity paramActivity, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    boolean bool = true;
    AppMethodBeat.i(90907);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
      AppMethodBeat.o(90907);
    while (true)
    {
      return bool;
      try
      {
        int i = b.checkSelfPermission(paramActivity, paramString1);
        if (i != 0)
          break;
        AppMethodBeat.o(90907);
      }
      catch (Exception paramActivity)
      {
        ab.e("Luggage.PermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
        AppMethodBeat.o(90907);
      }
    }
    if (!bo.isNullOrNil(paramString3))
    {
      paramString1 = new g.1(paramActivity, paramString1, paramInt);
      String str1 = paramActivity.getString(2131301924);
      String str2 = paramActivity.getString(2131301923);
      paramActivity = new AlertDialog.Builder(paramActivity);
      paramActivity.setMessage(paramString3).setTitle(paramString2).setCancelable(false).setPositiveButton(str1, paramString1).setNegativeButton(str2, null);
      paramActivity.show();
    }
    while (true)
    {
      AppMethodBeat.o(90907);
      bool = false;
      break;
      a.a(paramActivity, new String[] { paramString1 }, paramInt);
    }
  }

  public static boolean o(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90908);
    int i;
    boolean bool;
    try
    {
      i = b.checkSelfPermission(paramContext, paramString);
      if (i != 0)
      {
        AppMethodBeat.o(90908);
        bool = false;
        return bool;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("Luggage.PermissionUtil", "check mpermission exception:%s.", new Object[] { paramContext });
        AppMethodBeat.o(90908);
        bool = false;
      }
      str = null;
      if (!paramString.equals("android.permission.READ_CONTACTS"))
        break label95;
    }
    String str = "android.permission.WRITE_CONTACTS";
    label66: if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        i = b.checkSelfPermission(paramContext, str);
        if (i != 0)
          break label137;
        AppMethodBeat.o(90908);
        bool = true;
        break;
        label95: if (!paramString.equals("android.permission.WRITE_CONTACTS"))
          break label66;
        str = "android.permission.READ_CONTACTS";
      }
      catch (Exception paramContext)
      {
        ab.e("Luggage.PermissionUtil", "check mpermission otherPermisson exception:%s.", new Object[] { paramContext });
        AppMethodBeat.o(90908);
        bool = false;
      }
      break;
      label137: AppMethodBeat.o(90908);
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.g
 * JD-Core Version:    0.6.2
 */