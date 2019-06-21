package com.tencent.mm.plugin.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public class PluginNotification extends f
  implements com.tencent.mm.plugin.notification.b.a
{
  private an oVw;

  static
  {
    AppMethodBeat.i(125798);
    Context localContext;
    NotificationManager localNotificationManager;
    SharedPreferences localSharedPreferences;
    NotificationChannel localNotificationChannel;
    Object localObject;
    if (d.iW(26))
    {
      localContext = ah.getContext();
      localNotificationManager = (NotificationManager)localContext.getSystemService(NotificationManager.class);
      localSharedPreferences = com.tencent.mm.kernel.a.Mz();
      boolean bool1 = localSharedPreferences.getBoolean("settings_sound", true);
      boolean bool2 = localSharedPreferences.getBoolean("settings_shake", true);
      deleteNoWeChatSetNotification(localNotificationManager);
      deleteNoNumberNotification(localNotificationManager, com.tencent.mm.bo.a.My(), "message_channel");
      ab.i("MicroMsg.PluginNotification", "isEnableMsgNotification:%s isSysEnableMsgNotification:%s sound:%s vibration:%s", new Object[] { Boolean.valueOf(com.tencent.mm.m.a.MC()), Boolean.valueOf(com.tencent.mm.m.a.MD()), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      boolean bool3 = b.b(localContext, localNotificationManager, bool2, bool1, localSharedPreferences);
      boolean bool4 = b.a(localContext, localNotificationManager, bool2, bool1, localSharedPreferences);
      if ((!bool3) && (!bool4))
      {
        localNotificationChannel = new NotificationChannel(com.tencent.mm.bo.a.My(), localContext.getString(2131301800), 4);
        localNotificationChannel.setDescription(localContext.getString(2131301799));
        localNotificationChannel.enableLights(true);
        localNotificationChannel.setLightColor(-16711936);
        localNotificationChannel.setVibrationPattern(bo.gjH);
        localNotificationChannel.enableVibration(bool2);
        if (!bool1)
          break label394;
        localObject = localSharedPreferences.getString("settings.ringtone", com.tencent.mm.m.a.evO);
        if (!bo.isNullOrNil((String)localObject))
        {
          ab.e("MicroMsg.PluginNotification", "sound = %s", new Object[] { Uri.parse((String)localObject) });
          localNotificationChannel.setSound(Uri.parse((String)localObject), Notification.AUDIO_ATTRIBUTES_DEFAULT);
        }
      }
    }
    while (true)
    {
      localSharedPreferences.edit().putString("message_channel_id", com.tencent.mm.bo.a.My()).commit();
      localNotificationManager.createNotificationChannel(localNotificationChannel);
      localObject = new NotificationChannel("reminder_channel_id", localContext.getString(2131301811), 2);
      ((NotificationChannel)localObject).setDescription(localContext.getString(2131301810));
      localNotificationManager.createNotificationChannel((NotificationChannel)localObject);
      if (!com.tencent.mm.m.a.MR())
      {
        localObject = new NotificationChannel("message_dnd_mode_channel_id", localContext.getString(2131301802), 4);
        ((NotificationChannel)localObject).setDescription(localContext.getString(2131301801));
        ((NotificationChannel)localObject).enableLights(true);
        ((NotificationChannel)localObject).setLightColor(-16711936);
        ((NotificationChannel)localObject).enableVibration(false);
        ((NotificationChannel)localObject).setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        localNotificationManager.createNotificationChannel((NotificationChannel)localObject);
      }
      AppMethodBeat.o(125798);
      return;
      label394: localNotificationChannel.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }
  }

  public static void createActiveTimeNotification()
  {
    AppMethodBeat.i(125797);
    if (d.iW(26))
    {
      Context localContext = ah.getContext();
      NotificationManager localNotificationManager = (NotificationManager)localContext.getSystemService(NotificationManager.class);
      if (localNotificationManager.getNotificationChannel("message_dnd_mode_channel_id") == null)
      {
        NotificationChannel localNotificationChannel = new NotificationChannel("message_dnd_mode_channel_id", localContext.getString(2131301802), 4);
        localNotificationChannel.setDescription(localContext.getString(2131301801));
        localNotificationChannel.enableLights(true);
        localNotificationChannel.setLightColor(-16711936);
        localNotificationChannel.enableVibration(false);
        localNotificationChannel.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        localNotificationManager.createNotificationChannel(localNotificationChannel);
      }
    }
    AppMethodBeat.o(125797);
  }

  private static void deleteNoNumberNotification(NotificationManager paramNotificationManager, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125795);
    try
    {
      Object localObject = paramNotificationManager.getNotificationChannels();
      if (localObject == null)
        AppMethodBeat.o(125795);
      while (true)
      {
        return;
        int i = ((List)localObject).size();
        if (i > 0)
          break;
        AppMethodBeat.o(125795);
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        NotificationChannel localNotificationChannel = (NotificationChannel)((Iterator)localObject).next();
        if ((localNotificationChannel != null) && (localNotificationChannel.getId() != null) && (localNotificationChannel.getId().startsWith(paramString2)) && (!bo.isEqual(localNotificationChannel.getId(), paramString1)))
          paramNotificationManager.deleteNotificationChannel(localNotificationChannel.getId());
      }
    }
    catch (Exception paramNotificationManager)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginNotification", "deleteNoNumberNotification exception:%s", new Object[] { paramNotificationManager.getMessage() });
        AppMethodBeat.o(125795);
        continue;
        AppMethodBeat.o(125795);
      }
    }
  }

  private static void deleteNoWeChatSetNotification(NotificationManager paramNotificationManager)
  {
    AppMethodBeat.i(125796);
    try
    {
      Object localObject = paramNotificationManager.getNotificationChannels();
      if (localObject == null)
        AppMethodBeat.o(125796);
      while (true)
      {
        return;
        int i = ((List)localObject).size();
        if (i > 0)
          break;
        AppMethodBeat.o(125796);
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        NotificationChannel localNotificationChannel = (NotificationChannel)((Iterator)localObject).next();
        if ((localNotificationChannel != null) && (localNotificationChannel.getId() != null) && (!bo.isEqual(localNotificationChannel.getId(), "message_dnd_mode_channel_id")) && (!bo.isEqual(localNotificationChannel.getId(), "reminder_channel_id")) && (!localNotificationChannel.getId().startsWith("message_channel")))
        {
          ab.i("MicroMsg.PluginNotification", "deleteNoWeChatSetNotification id:%s", new Object[] { localNotificationChannel.getId() });
          paramNotificationManager.deleteNotificationChannel(localNotificationChannel.getId());
        }
      }
    }
    catch (Exception paramNotificationManager)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginNotification", "deleteNoWeChatSetNotification exception:%s", new Object[] { paramNotificationManager.getMessage() });
        AppMethodBeat.o(125796);
        continue;
        AppMethodBeat.o(125796);
      }
    }
  }

  public void execute(g paramg)
  {
  }

  public an getNotification()
  {
    return this.oVw;
  }

  public void setNotification(an paraman)
  {
    this.oVw = paraman;
    c.oVm = paraman;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.PluginNotification
 * JD-Core Version:    0.6.2
 */