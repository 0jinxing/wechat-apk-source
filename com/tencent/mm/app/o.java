package com.tencent.mm.app;

import android.app.Application;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class o
{
  public static final com.tencent.mm.splash.d ceX;
  private static final HashSet ceY;

  static
  {
    AppMethodBeat.i(137985);
    ceX = new o.1();
    ceY = new HashSet();
    ceY.addAll(Arrays.asList(new String[] { "com.tencent.mm.plugin.card.ui.CardHomePageUI", "com.tencent.mm.plugin.card.ui.CardHomePageNewUI", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI", "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", "com.tencent.mm.ui.chatting.ChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.readerapp.ui.ReaderAppUI", "com.tencent.mm.ui.SingleChatInfoUI", "com.tencent.mm.plugin.sns.ui.SnsUploadUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI", "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI", "com.tencent.mm.chatroom.ui.ChatroomInfoUI" }));
    AppMethodBeat.o(137985);
  }

  public static void Bx()
  {
    AppMethodBeat.i(137982);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = com.tencent.mm.splash.h.xGD.iterator();
    if (localIterator.hasNext())
    {
      Message localMessage = (Message)localIterator.next();
      while (true)
      {
        try
        {
          String str = o.a.h(localMessage);
          if (str != null)
          {
            if ((k)Class.forName(str).getAnnotation(k.class) == null)
              break label115;
            i = 1;
            if (i != 0)
            {
              com.tencent.mm.splash.h.u(localMessage);
              ab.i("MicroMsg.PreventAccountNotReady", "replay message for %s", new Object[] { str });
            }
          }
        }
        catch (Throwable localThrowable)
        {
          ab.printErrStackTrace("MicroMsg.PreventAccountNotReady", localThrowable, "", new Object[0]);
          localArrayList.add(localMessage);
        }
        break;
        label115: int i = 0;
      }
    }
    com.tencent.mm.splash.h.xGD.clear();
    com.tencent.mm.splash.h.xGD.addAll(localArrayList);
    AppMethodBeat.o(137982);
  }

  private static boolean bg(boolean paramBoolean)
  {
    AppMethodBeat.i(137980);
    if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      if (paramBoolean)
        ab.i("MicroMsg.PreventAccountNotReady", "not main process");
      AppMethodBeat.o(137980);
      paramBoolean = true;
    }
    while (true)
    {
      return paramBoolean;
      if ((com.tencent.mm.kernel.g.RQ().eKs) && (com.tencent.mm.kernel.g.RN().QY()))
      {
        if (paramBoolean)
          ab.i("MicroMsg.PreventAccountNotReady", "account hasInitialized");
        AppMethodBeat.o(137980);
        paramBoolean = true;
      }
      else
      {
        paramBoolean = false;
        AppMethodBeat.o(137980);
      }
    }
  }

  private static boolean cV(String paramString)
  {
    AppMethodBeat.i(137981);
    ab.i("MicroMsg.PreventAccountNotReady", "eatActivity %s", new Object[] { paramString });
    boolean bool;
    if (bg(true))
    {
      AppMethodBeat.o(137981);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramString != null)
      {
        if (ceY.contains(paramString))
        {
          ab.w("MicroMsg.PreventAccountNotReady", "protect this activity %s", new Object[] { paramString });
          AppMethodBeat.o(137981);
          bool = true;
        }
        else
        {
          try
          {
            Object localObject = new android/content/ComponentName;
            com.tencent.mm.kernel.g.RM();
            ((ComponentName)localObject).<init>(ah.getPackageName(), paramString);
            localObject = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc.getPackageManager().getActivityInfo((ComponentName)localObject, 128);
            if (localObject != null)
            {
              ab.i("MicroMsg.PreventAccountNotReady", "%s info.exported = %s", new Object[] { paramString, Boolean.valueOf(((ActivityInfo)localObject).exported) });
              bool = ((ActivityInfo)localObject).exported;
              if (!bool)
              {
                AppMethodBeat.o(137981);
                bool = true;
              }
            }
          }
          catch (PackageManager.NameNotFoundException paramString)
          {
            ab.printErrStackTrace("MicroMsg.PreventAccountNotReady", paramString, "", new Object[0]);
          }
        }
      }
      else
      {
        AppMethodBeat.o(137981);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.o
 * JD-Core Version:    0.6.2
 */