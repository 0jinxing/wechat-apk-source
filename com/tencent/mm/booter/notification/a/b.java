package com.tencent.mm.booter.notification.a;

import android.app.Notification;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.i;
import java.io.File;

public final class b
{
  public int eel = 0;

  private int a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification)
  {
    AppMethodBeat.i(16007);
    Notification localNotification = paramNotification;
    if (paramNotification == null)
      localNotification = new Notification();
    ab.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(localNotification.defaults), g.b(localNotification.vibrate), localNotification.sound });
    if (paramBoolean2)
      localNotification.vibrate = bo.gjH;
    int i;
    if (paramBoolean1)
    {
      paramNotification = com.tencent.mm.m.f.MK();
      if (bw(paramContext))
      {
        localNotification.sound = null;
        i = 0;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.NotificationDefaults", "end initDefaults, defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Integer.valueOf(i), g.b(localNotification.vibrate), localNotification.sound });
      this.eel = i;
      i = this.eel;
      AppMethodBeat.o(16007);
      return i;
      if ((paramNotification != null) && (paramNotification != e.i.evO))
      {
        localNotification.sound = Uri.parse(paramNotification);
        i = 0;
      }
      else
      {
        i = 1;
        continue;
        i = 0;
      }
    }
  }

  private int b(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification, String paramString)
  {
    AppMethodBeat.i(16008);
    ab.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramNotification.defaults), paramNotification.vibrate, paramNotification.sound });
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3;
    if (paramBoolean1)
      if (bw(paramContext))
        bool3 = true;
    while (true)
    {
      int j = i;
      if (paramBoolean2)
        j = i | 0x2;
      String str = com.tencent.mm.m.f.MK();
      if (bo.isNullOrNil(paramString))
        ab.d("MicroMsg.NotificationDefaults", "msgContent is null");
      paramString = str;
      if (str != null)
      {
        paramString = str;
        if (new File(str).exists())
          paramString = e.i.evO;
      }
      boolean bool4;
      if (q.etn.esd != 2)
      {
        bool4 = true;
        label161: if (!bool4)
          break label411;
        if (!ir(j))
          break label405;
        j &= -3;
        bo.z(paramContext, true);
        paramBoolean1 = true;
        label188: if ((!is(j)) || (bool3))
          break label397;
        j &= -2;
        f.a.IZ().jT(paramString);
        bool2 = true;
        paramBoolean2 = paramBoolean1;
        paramBoolean1 = bool2;
      }
      while (true)
      {
        if (bool3)
        {
          j &= -2;
          f.a.IZ().jT(paramString);
          paramBoolean1 = true;
        }
        while (true)
        {
          this.eel = j;
          ab.i("MicroMsg.NotificationDefaults", "end initDefaults, n.defaults: %d, n.vibrate: %s, n.sound: %s, soundUri: %s, headset&Play: %B, DeviceInfo.mCommonInfo.mmnotify is Enable: %B, isMMShake: %B, isMMPlaySound: %B", new Object[] { Integer.valueOf(paramNotification.defaults), g.b(paramNotification.vibrate), paramNotification.sound, paramString, Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
          j = this.eel;
          AppMethodBeat.o(16008);
          return j;
          i = 1;
          bool3 = false;
          break;
          bool4 = false;
          break label161;
          if ((is(j)) && (paramString != null))
          {
            j &= -2;
            paramNotification.sound = Uri.parse(paramString);
          }
        }
        label397: paramBoolean2 = paramBoolean1;
        paramBoolean1 = bool2;
        continue;
        label405: paramBoolean1 = bool1;
        break label188;
        label411: paramBoolean2 = false;
        paramBoolean1 = bool2;
      }
      bool3 = false;
    }
  }

  private static boolean bw(Context paramContext)
  {
    AppMethodBeat.i(16009);
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    boolean bool;
    if (paramContext == null)
    {
      bool = false;
      AppMethodBeat.o(16009);
    }
    while (true)
    {
      return bool;
      bool = paramContext.isWiredHeadsetOn();
      AppMethodBeat.o(16009);
    }
  }

  private static boolean ir(int paramInt)
  {
    if ((paramInt & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean is(int paramInt)
  {
    if ((paramInt & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification, String paramString)
  {
    AppMethodBeat.i(16006);
    int i;
    if (com.tencent.mm.m.f.MB())
    {
      i = a(paramContext, paramBoolean1, paramBoolean2, paramNotification);
      AppMethodBeat.o(16006);
    }
    while (true)
    {
      return i;
      i = b(paramContext, paramBoolean1, paramBoolean2, paramNotification, paramString);
      AppMethodBeat.o(16006);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.b
 * JD-Core Version:    0.6.2
 */