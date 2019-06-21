package com.tencent.mm.plugin.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.provider.Settings.System;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static NotificationChannel a(NotificationManager paramNotificationManager, String paramString)
  {
    AppMethodBeat.i(125794);
    try
    {
      paramNotificationManager = paramNotificationManager.getNotificationChannels();
      if (paramNotificationManager == null)
      {
        AppMethodBeat.o(125794);
        paramNotificationManager = null;
      }
      while (true)
      {
        return paramNotificationManager;
        int i = paramNotificationManager.size();
        if (i <= 0)
        {
          AppMethodBeat.o(125794);
          paramNotificationManager = null;
        }
        else
        {
          Iterator localIterator = paramNotificationManager.iterator();
          boolean bool;
          do
          {
            do
            {
              if (!localIterator.hasNext())
                break;
              paramNotificationManager = (NotificationChannel)localIterator.next();
            }
            while ((paramNotificationManager == null) || (paramNotificationManager.getId() == null));
            bool = bo.isEqual(paramNotificationManager.getId(), paramString);
          }
          while (!bool);
          AppMethodBeat.o(125794);
        }
      }
    }
    catch (Exception paramNotificationManager)
    {
      while (true)
      {
        ab.e("MicroMsg.NotificationManufacturerCompatibility", "deleteNoNumberNotification exception:%s", new Object[] { paramNotificationManager.getMessage() });
        AppMethodBeat.o(125794);
        paramNotificationManager = null;
      }
    }
  }

  private static void a(NotificationChannel paramNotificationChannel, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(125792);
    paramSharedPreferences = paramSharedPreferences.getString("settings.ringtone", com.tencent.mm.m.a.evO);
    if (!bo.isNullOrNil(paramSharedPreferences))
    {
      ab.e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s", new Object[] { Uri.parse(paramSharedPreferences) });
      paramNotificationChannel.setSound(Uri.parse(paramSharedPreferences), Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }
    AppMethodBeat.o(125792);
  }

  private static void a(Context paramContext, NotificationManager paramNotificationManager, String paramString, boolean paramBoolean1, boolean paramBoolean2, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(125790);
    NotificationChannel localNotificationChannel = new NotificationChannel(paramString, paramContext.getString(2131301800), 4);
    localNotificationChannel.setDescription(paramContext.getString(2131301799));
    localNotificationChannel.enableLights(true);
    localNotificationChannel.setLightColor(-16711936);
    localNotificationChannel.setVibrationPattern(bo.gjH);
    localNotificationChannel.enableVibration(paramBoolean1);
    if (paramBoolean2)
    {
      paramContext = paramSharedPreferences.getString("settings.ringtone", com.tencent.mm.m.a.evO);
      if (!bo.isNullOrNil(paramContext))
      {
        ab.e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s", new Object[] { Uri.parse(paramContext) });
        localNotificationChannel.setSound(Uri.parse(paramContext), Notification.AUDIO_ATTRIBUTES_DEFAULT);
      }
    }
    paramSharedPreferences.edit().putString("message_channel_id", paramString).commit();
    paramNotificationManager.createNotificationChannel(localNotificationChannel);
    AppMethodBeat.o(125790);
  }

  private static void a(Context paramContext, NotificationManager paramNotificationManager, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(138324);
    NotificationChannel localNotificationChannel = new NotificationChannel(paramString, paramContext.getString(2131301800), 4);
    localNotificationChannel.setDescription(paramContext.getString(2131301799));
    localNotificationChannel.enableLights(true);
    localNotificationChannel.setLightColor(-16711936);
    localNotificationChannel.setVibrationPattern(bo.gjH);
    if (paramBoolean1)
    {
      localNotificationChannel.enableVibration(true);
      if (!paramBoolean1)
        break label123;
      if (paramBoolean4)
        a(localNotificationChannel, paramSharedPreferences);
    }
    while (true)
    {
      paramSharedPreferences.edit().putString("message_channel_id", paramString).commit();
      paramNotificationManager.createNotificationChannel(localNotificationChannel);
      AppMethodBeat.o(138324);
      return;
      localNotificationChannel.enableVibration(paramBoolean3);
      break;
      label123: if (paramBoolean2)
        if (paramBoolean4)
          a(localNotificationChannel, paramSharedPreferences);
        else
          localNotificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }
  }

  public static boolean a(Context paramContext, NotificationManager paramNotificationManager, boolean paramBoolean1, boolean paramBoolean2, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(125788);
    if (!com.tencent.mm.sdk.h.b.dqw())
    {
      AppMethodBeat.o(125788);
      paramBoolean1 = false;
      return paramBoolean1;
    }
    String str = com.tencent.mm.bo.a.My();
    NotificationChannel localNotificationChannel = a(paramNotificationManager, str);
    if (localNotificationChannel == null)
      a(paramContext, paramNotificationManager, str, paramBoolean1, paramBoolean2, paramSharedPreferences);
    while (true)
    {
      AppMethodBeat.o(125788);
      paramBoolean1 = true;
      break;
      if (localNotificationChannel.getSound() == null)
        try
        {
          paramNotificationManager.deleteNotificationChannel(localNotificationChannel.getId());
          a(paramContext, paramNotificationManager, "message_channel_compatibility_id", paramBoolean1, paramBoolean2, paramSharedPreferences);
          com.tencent.mm.bo.a.aii("message_channel_compatibility_id");
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", new Object[] { paramContext.getMessage() });
        }
      else
        a(paramContext, paramNotificationManager, str, paramBoolean1, paramBoolean2, paramSharedPreferences);
    }
  }

  public static boolean b(Context paramContext, NotificationManager paramNotificationManager, boolean paramBoolean1, boolean paramBoolean2, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(138323);
    Object localObject = getProperty("ro.build.version.emui").toLowerCase();
    boolean bool1;
    boolean bool2;
    if (((String)localObject).startsWith("EmotionUI_8".toLowerCase()))
    {
      bool1 = false;
      bool2 = true;
    }
    while (true)
    {
      if ((!bool2) && (!bool1))
        AppMethodBeat.o(138323);
      String str;
      for (paramBoolean1 = false; ; paramBoolean1 = true)
      {
        return paramBoolean1;
        if (!((String)localObject).startsWith("EmotionUI_9".toLowerCase()))
          break label255;
        bool1 = true;
        bool2 = false;
        break;
        str = com.tencent.mm.bo.a.My();
        localObject = a(paramNotificationManager, str);
        if (localObject != null)
          break label131;
        a(paramContext, paramNotificationManager, str, bool2, bool1, paramBoolean1, paramBoolean2, paramSharedPreferences);
        AppMethodBeat.o(138323);
      }
      label131: if ((bool2) && ((!((NotificationChannel)localObject).shouldVibrate()) || (((NotificationChannel)localObject).getSound() == null)));
      for (int i = 1; ; i = 0)
      {
        while (true)
        {
          if (i == 0)
            break label231;
          try
          {
            if (((NotificationChannel)localObject).getSound() != null)
              f.kA(((NotificationChannel)localObject).getSound().toString());
            paramNotificationManager.deleteNotificationChannel(((NotificationChannel)localObject).getId());
            a(paramContext, paramNotificationManager, "message_channel_compatibility_id", true, false, paramBoolean1, paramBoolean2, paramSharedPreferences);
            com.tencent.mm.bo.a.aii("message_channel_compatibility_id");
          }
          catch (Exception paramContext)
          {
            ab.e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", new Object[] { paramContext.getMessage() });
          }
        }
        break;
        label231: a(paramContext, paramNotificationManager, str, bool2, bool1, paramBoolean1, paramBoolean2, paramSharedPreferences);
        break;
      }
      label255: bool1 = false;
      bool2 = false;
    }
  }

  private static String getProperty(String paramString)
  {
    AppMethodBeat.i(125793);
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      paramString = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { paramString, "unknown" });
      AppMethodBeat.o(125793);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.NotificationManufacturerCompatibility", "getProperty() Exception:%s", new Object[] { paramString.getMessage() });
        paramString = "unknown";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.b
 * JD-Core Version:    0.6.2
 */