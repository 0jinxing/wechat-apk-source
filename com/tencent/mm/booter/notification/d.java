package com.tencent.mm.booter.notification;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.NotificationQueue.ParcelNotificationQueue;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.LauncherUI;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  private static boolean edF;
  private static boolean edG;
  private static boolean edH;
  private static int edI;
  private static int edJ;
  private static boolean edK;
  private static String edL;
  public static boolean edM;
  public static boolean edN;
  private static int edO;
  private static boolean edP;
  private static Uri edQ;

  static
  {
    AppMethodBeat.i(15950);
    edF = true;
    edG = true;
    edH = false;
    edI = -1;
    edJ = -1;
    edK = true;
    edL = "samsung";
    edM = true;
    edN = false;
    edO = -1;
    edP = true;
    edQ = Uri.parse("content://com.android.badge/badge");
    AppMethodBeat.o(15950);
  }

  private static void A(String paramString, int paramInt)
  {
    AppMethodBeat.i(15947);
    if (com.tencent.mm.sdk.platformtools.ah.getContext() == null)
    {
      ab.printErrStackTrace("MicroMsg.BusinessNotification", null, "normal badge context is null", new Object[0]);
      AppMethodBeat.o(15947);
    }
    while (true)
    {
      return;
      Context localContext = com.tencent.mm.sdk.platformtools.ah.getContext();
      int i = paramInt;
      if (paramInt < 0)
        i = f.Nr();
      c(localContext, paramString, i);
      AppMethodBeat.o(15947);
    }
  }

  private static boolean IN()
  {
    boolean bool = false;
    AppMethodBeat.i(15946);
    if (edN)
    {
      bool = edM;
      AppMethodBeat.o(15946);
    }
    while (true)
    {
      return bool;
      edN = true;
      if (!Build.BRAND.equals(edL))
      {
        edM = false;
        AppMethodBeat.o(15946);
      }
      else
      {
        edM = true;
        AppMethodBeat.o(15946);
        bool = true;
      }
    }
  }

  public static int a(Notification paramNotification, g paramg)
  {
    AppMethodBeat.i(15945);
    int i;
    if ((paramNotification == null) || (!edF))
    {
      AppMethodBeat.o(15945);
      i = 0;
    }
    while (true)
    {
      return i;
      if (paramg == null)
        i = 0;
      try
      {
        while (true)
        {
          paramg = Class.forName("android.app.MiuiNotification").newInstance();
          Field localField = paramg.getClass().getDeclaredField("messageCount");
          localField.setAccessible(true);
          localField.set(paramg, Integer.valueOf(i));
          paramNotification.getClass().getField("extraNotification").set(paramNotification, paramg);
          ab.i("MicroMsg.BusinessNotification", "miuiNotification: %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(15945);
          break;
          int j = paramg.eeH;
          paramg = com.tencent.mm.booter.notification.queue.b.IP().eeh;
          if (paramg.eeg == null)
            paramg.restore();
          paramg = paramg.eeg.iterator();
          for (i = 0; paramg.hasNext(); i = ((NotificationItem)paramg.next()).eea + i);
          i = j - i;
        }
      }
      catch (NoSuchFieldException paramNotification)
      {
        while (true)
          edF = false;
      }
      catch (IllegalArgumentException paramNotification)
      {
        while (true)
          edF = false;
      }
      catch (IllegalAccessException paramNotification)
      {
        while (true)
          edF = false;
      }
      catch (ClassNotFoundException paramNotification)
      {
        while (true)
          edF = false;
      }
      catch (InstantiationException paramNotification)
      {
        while (true)
          edF = false;
      }
      catch (Exception paramNotification)
      {
        while (true)
          edF = false;
      }
    }
  }

  public static void bx(boolean paramBoolean)
  {
    AppMethodBeat.i(15944);
    if (!edP)
      AppMethodBeat.o(15944);
    while (true)
    {
      return;
      Object localObject = com.tencent.mm.sdk.platformtools.ah.getContext();
      if (localObject == null)
      {
        AppMethodBeat.o(15944);
      }
      else
      {
        localObject = ((Context)localObject).getContentResolver();
        if (localObject == null)
          AppMethodBeat.o(15944);
        else
          try
          {
            ab.i("MicroMsg.BusinessNotification", "sync all user badge");
            localObject = ((ContentResolver)localObject).call(edQ, "getShortcutList", null, null);
            if (localObject == null)
            {
              ab.i("MicroMsg.BusinessNotification", "getShortcutList return null");
              AppMethodBeat.o(15944);
            }
            else
            {
              String str = ((Bundle)localObject).getString("shortcut_list");
              if (str != null)
              {
                localObject = new org/json/JSONArray;
                ((JSONArray)localObject).<init>(str);
                int i = 0;
                if (i < ((JSONArray)localObject).length())
                {
                  str = ((JSONObject)((JSONArray)localObject).get(i)).getString("app_shortcut_custom_id");
                  if ((str != null) && (!str.equalsIgnoreCase("null")))
                  {
                    str = com.tencent.mm.plugin.base.model.b.Fs(str);
                    if (!paramBoolean)
                      break label176;
                  }
                  label176: for (int j = 0; ; j = f.kF(str))
                  {
                    z(str, j);
                    i++;
                    break;
                  }
                }
              }
              AppMethodBeat.o(15944);
            }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.BusinessNotification", localException, "sync all user badge: no support getShortcutList", new Object[0]);
            AppMethodBeat.o(15944);
          }
      }
    }
  }

  private static boolean c(Context paramContext, final String paramString, final int paramInt)
  {
    AppMethodBeat.i(15948);
    com.tencent.mm.sdk.g.d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(15941);
        d.d(this.val$context, paramString, paramInt);
        AppMethodBeat.o(15941);
      }
    }
    , "normalNotification");
    AppMethodBeat.o(15948);
    return true;
  }

  public static void in(int paramInt)
  {
    AppMethodBeat.i(15942);
    Context localContext;
    int i;
    if ((com.tencent.mm.sdk.platformtools.ah.getContext() != null) && (IN()))
    {
      localContext = com.tencent.mm.sdk.platformtools.ah.getContext();
      if (paramInt != -1)
        break label251;
      i = f.Nr();
    }
    while (true)
    {
      Object localObject;
      if ((localContext != null) && (IN()) && (edO != i))
      {
        edO = i;
        localObject = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        ((Intent)localObject).putExtra("badge_count", i);
        ((Intent)localObject).putExtra("badge_count_package_name", com.tencent.mm.sdk.platformtools.ah.getPackageName());
        ((Intent)localObject).putExtra("badge_count_class_name", LauncherUI.class.getName());
        ab.i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", new Object[] { Integer.valueOf(i), Build.BRAND });
        localContext.sendBroadcast((Intent)localObject);
      }
      label145: boolean bool;
      if (edK)
      {
        if (Build.VERSION.SDK_INT < 11)
          edK = false;
      }
      else
      {
        if (!edH)
          break label411;
        bool = edG;
        label156: if ((!bool) || (edI == paramInt));
      }
      try
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        ((Intent)localObject).putExtra("packageName", com.tencent.mm.sdk.platformtools.ah.getPackageName());
        ((Intent)localObject).putExtra("className", LauncherUI.class.getName());
        ((Intent)localObject).putExtra("notificationNum", paramInt);
        com.tencent.mm.sdk.platformtools.ah.getContext().sendBroadcast((Intent)localObject);
        ab.i("MicroMsg.BusinessNotification", "vivo badge: %d", new Object[] { Integer.valueOf(paramInt) });
        A(null, paramInt);
        AppMethodBeat.o(15942);
        return;
        label251: i = paramInt;
        continue;
        if (edJ == paramInt)
          break label145;
        while (true)
        {
          try
          {
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            ((Bundle)localObject).putString("package", com.tencent.mm.sdk.platformtools.ah.getPackageName());
            ((Bundle)localObject).putString("class", LauncherUI.class.getName());
            ((Bundle)localObject).putInt("badgenumber", paramInt);
            if (com.tencent.mm.sdk.platformtools.ah.getContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, (Bundle)localObject) == null)
              break label405;
            bool = true;
            edK = bool;
            ab.i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(edK) });
          }
          catch (Exception localException1)
          {
            ab.i("MicroMsg.BusinessNotification", "no huawei badge");
            ab.e("MicroMsg.BusinessNotification", "alvin: no badge" + localException1.toString());
            edK = false;
          }
          break;
          label405: bool = false;
        }
        label411: edH = true;
        if (!Build.BRAND.equals("vivo"))
        {
          edG = false;
          bool = false;
          break label156;
        }
        edG = true;
        bool = true;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          edG = false;
          ab.printErrStackTrace("MicroMsg.BusinessNotification", localException2, "", new Object[0]);
        }
      }
    }
  }

  public static void z(String paramString, int paramInt)
  {
    AppMethodBeat.i(15943);
    if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString))
    {
      ab.printErrStackTrace("MicroMsg.BusinessNotification", null, "syncUserBadge username is null", new Object[0]);
      AppMethodBeat.o(15943);
    }
    while (true)
    {
      return;
      paramString = com.tencent.mm.plugin.base.model.b.Ft(paramString);
      if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString))
      {
        AppMethodBeat.o(15943);
      }
      else
      {
        A(paramString, paramInt);
        AppMethodBeat.o(15943);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.d
 * JD-Core Version:    0.6.2
 */