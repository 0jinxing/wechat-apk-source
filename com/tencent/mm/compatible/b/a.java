package com.tencent.mm.compatible.b;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  public static void a(AudioManager paramAudioManager, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92826);
    if (d.iW(24))
      ab.i("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume()");
    while (true)
    {
      try
      {
        paramAudioManager.adjustStreamVolume(paramInt1, paramInt2, 5);
        AppMethodBeat.o(92826);
        return;
      }
      catch (SecurityException paramAudioManager)
      {
        ab.e("MicroMsg.AudioAdaptNHelp", "adjustStreamVolume() Exception: %s", new Object[] { paramAudioManager.getMessage() });
        requestPermission();
        AppMethodBeat.o(92826);
        continue;
      }
      paramAudioManager.adjustStreamVolume(paramInt1, paramInt2, 5);
      AppMethodBeat.o(92826);
    }
  }

  public static void b(AudioManager paramAudioManager, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92827);
    if (d.iW(24))
      ab.i("MicroMsg.AudioAdaptNHelp", "setStreamVolume()");
    while (true)
    {
      try
      {
        paramAudioManager.setStreamVolume(paramInt1, paramInt2, 0);
        AppMethodBeat.o(92827);
        return;
      }
      catch (Exception paramAudioManager)
      {
        ab.e("MicroMsg.AudioAdaptNHelp", "setStreamVolume() Exception:%s", new Object[] { paramAudioManager.getMessage() });
        requestPermission();
        AppMethodBeat.o(92827);
        continue;
      }
      paramAudioManager.setStreamVolume(paramInt1, paramInt2, 0);
      AppMethodBeat.o(92827);
    }
  }

  private static void requestPermission()
  {
    AppMethodBeat.i(92828);
    boolean bool = ((NotificationManager)ah.getContext().getSystemService("notification")).isNotificationPolicyAccessGranted();
    ab.i("MicroMsg.AudioAdaptNHelp", "requestPermission() result:%s", new Object[] { Boolean.valueOf(bool) });
    if (!bool);
    while (true)
    {
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        localIntent.putExtra("android.provider.extra.APP_PACKAGE", ah.getPackageName());
        ah.getContext().startActivity(localIntent);
        AppMethodBeat.o(92828);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AudioAdaptNHelp", "requestPermission() Exception:%s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(92828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.a
 * JD-Core Version:    0.6.2
 */