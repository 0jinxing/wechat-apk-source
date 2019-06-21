package com.tencent.mm.plugin.music.model.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Looper;
import android.support.v4.app.v.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.plugin.music.h.b;
import com.tencent.mm.plugin.music.ui.MusicMainUI;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  boolean bZi;
  MMMusicPlayerService oMK;
  NotificationManager oML;
  Runnable oMM;
  BroadcastReceiver oMN;

  public a()
  {
    AppMethodBeat.i(104974);
    this.bZi = false;
    this.oMM = new a.1(this);
    AppMethodBeat.o(104974);
  }

  private static int D(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (paramBoolean1)
      if (paramBoolean2)
        i = 2130840033;
    while (true)
    {
      return i;
      i = 2130840035;
      continue;
      if (paramBoolean2)
        i = 2130840037;
      else
        i = 2130840038;
    }
  }

  private Notification a(Context paramContext, com.tencent.mm.plugin.music.model.e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(104979);
    Object localObject = new Intent(paramContext, MusicMainUI.class);
    ((Intent)localObject).putExtra("key_scene", 5);
    localObject = PendingIntent.getActivity(paramContext, 0, (Intent)localObject, 134217728);
    v.c localc = com.tencent.mm.bo.a.bt(paramContext, "reminder_channel_id");
    localc.EI = ((PendingIntent)localObject);
    paramContext = localc.as(com.tencent.mm.bo.a.bWV()).a(b(paramContext, parama, paramBoolean)).build();
    AppMethodBeat.o(104979);
    return paramContext;
  }

  private static void a(View paramView, List<TextView> paramList)
  {
    AppMethodBeat.i(104984);
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      for (int i = 0; i < paramView.getChildCount(); i++)
        a(paramView.getChildAt(i), paramList);
      AppMethodBeat.o(104984);
    }
    while (true)
    {
      return;
      if ((paramView instanceof TextView))
        paramList.add((TextView)paramView);
      AppMethodBeat.o(104984);
    }
  }

  public static void a(com.tencent.mm.plugin.music.model.e.a parama, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(104975);
    ab.i("MicroMsg.Music.MMMusicNotification", "sendMusicPlayerEvent action:%d", new Object[] { Integer.valueOf(paramInt) });
    ke localke = new ke();
    localke.cFH.action = paramInt;
    localke.cFH.state = "";
    localke.cFH.cFB = parama.bUw();
    localke.cFH.appId = "not from app brand appid";
    localke.cFH.cFJ = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    AppMethodBeat.o(104975);
  }

  private RemoteViews b(Context paramContext, com.tencent.mm.plugin.music.model.e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(104980);
    String str = parama.field_songName;
    Object localObject1 = parama.field_songSinger;
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(parama.field_songAlbum))
      localObject2 = (String)localObject1 + parama.field_songAlbum;
    localObject1 = e(parama);
    parama = new RemoteViews(paramContext.getPackageName(), 2130970521);
    label112: boolean bool;
    if (localObject1 != null)
    {
      parama.setImageViewBitmap(2131827138, (Bitmap)localObject1);
      if (bo.isNullOrNil(str))
        break label393;
      parama.setViewVisibility(2131827139, 0);
      parama.setTextViewText(2131827139, str);
      if (bo.isNullOrNil((String)localObject2))
        break label404;
      parama.setViewVisibility(2131827140, 0);
      parama.setTextViewText(2131827140, (CharSequence)localObject2);
      label135: bool = zK(eD(this.oMK));
      localObject2 = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
      ((Intent)localObject2).putExtra("mm_music_notification_action_key", "mm_music_notification_action_pre");
      localObject2 = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject2, 134217728);
      parama.setImageViewResource(2131827141, jv(bool));
      parama.setOnClickPendingIntent(2131827141, (PendingIntent)localObject2);
      localObject2 = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
      if (!paramBoolean)
        break label415;
      ((Intent)localObject2).putExtra("mm_music_notification_action_key", "mm_music_notification_action_pause");
    }
    while (true)
    {
      localObject2 = PendingIntent.getBroadcast(paramContext, 1, (Intent)localObject2, 134217728);
      parama.setImageViewResource(2131827142, D(paramBoolean, bool));
      parama.setOnClickPendingIntent(2131827142, (PendingIntent)localObject2);
      localObject2 = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
      ((Intent)localObject2).putExtra("mm_music_notification_action_key", "mm_music_notification_action_next");
      localObject2 = PendingIntent.getBroadcast(paramContext, 2, (Intent)localObject2, 134217728);
      parama.setImageViewResource(2131827143, jw(bool));
      parama.setOnClickPendingIntent(2131827143, (PendingIntent)localObject2);
      localObject2 = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
      ((Intent)localObject2).putExtra("mm_music_notification_action_key", "mm_music_notification_action_close");
      paramContext = PendingIntent.getBroadcast(paramContext, 3, (Intent)localObject2, 134217728);
      parama.setImageViewResource(2131827144, jx(bool));
      parama.setOnClickPendingIntent(2131827144, paramContext);
      AppMethodBeat.o(104980);
      return parama;
      parama.setImageViewResource(2131827138, 2130838448);
      break;
      label393: parama.setViewVisibility(2131827139, 8);
      break label112;
      label404: parama.setViewVisibility(2131827140, 8);
      break label135;
      label415: ((Intent)localObject2).putExtra("mm_music_notification_action_key", "mm_music_notification_action_play");
    }
  }

  private Bitmap e(com.tencent.mm.plugin.music.model.e.a parama)
  {
    String str = null;
    Object localObject1 = null;
    AppMethodBeat.i(104981);
    if (parama == null)
    {
      ab.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
      AppMethodBeat.o(104981);
      parama = (com.tencent.mm.plugin.music.model.e.a)localObject1;
    }
    while (true)
    {
      return parama;
      ab.i("MicroMsg.Music.MMMusicNotification", "music.field_musicType %d", new Object[] { Integer.valueOf(parama.field_musicType) });
      localObject1 = str;
      switch (parama.field_musicType)
      {
      default:
        localObject1 = str;
      case 2:
      case 3:
      case 4:
      case 6:
      case 0:
      case 5:
      case 7:
      case 10:
      case 11:
      case 1:
      case 8:
      case 9:
      }
      Object localObject2;
      while (true)
      {
        if (localObject1 == null)
          break label261;
        parama = d.a((Bitmap)localObject1, false, 12.0F, false);
        AppMethodBeat.o(104981);
        break;
        localObject1 = o.ahl().b(parama.field_songAlbumLocalPath, com.tencent.mm.bz.a.getDensity(this.oMK), true);
        continue;
        localObject1 = o.ahl().a(parama.field_songAlbumLocalPath, com.tencent.mm.bz.a.getDensity(this.oMK), true);
        continue;
        localObject2 = new bau();
        ((bau)localObject2).Id = parama.field_songMediaId;
        ((bau)localObject2).wEH = parama.field_songAlbumUrl;
        ((bau)localObject2).wEI = parama.field_songAlbumType;
        ((bau)localObject2).Url = ((bau)localObject2).wEH;
        localObject1 = str;
        if (n.qFx != null)
          localObject1 = n.qFx.b((bau)localObject2);
      }
      label261: localObject1 = o.ahp().sB(parama.field_songAlbumUrl);
      if (localObject1 == null)
      {
        str = b.aY(parama.field_musicId, false);
        localObject2 = new c.a();
        ((c.a)localObject2).ePJ = b.aY(parama.field_musicId, false);
        ((c.a)localObject2).ePH = true;
        ((c.a)localObject2).ct(com.tencent.mm.bz.a.al(this.oMK, 2131428583), com.tencent.mm.bz.a.al(this.oMK, 2131428582));
        ((c.a)localObject2).ePF = true;
        o.ahp().a(parama.field_songAlbumUrl, ((c.a)localObject2).ahG(), new a.3(this, parama, str));
      }
      parama = d.a((Bitmap)localObject1, false, 12.0F, false);
      AppMethodBeat.o(104981);
    }
  }

  private static int eD(Context paramContext)
  {
    AppMethodBeat.i(104982);
    Object localObject = com.tencent.mm.bo.a.bt(paramContext, "reminder_channel_id").build().contentView;
    int i;
    if (localObject == null)
    {
      i = -16777216;
      AppMethodBeat.o(104982);
    }
    while (true)
    {
      return i;
      i = ((RemoteViews)localObject).getLayoutId();
      localObject = (ViewGroup)LayoutInflater.from(paramContext).inflate(i, null);
      paramContext = (TextView)((ViewGroup)localObject).findViewById(16908310);
      if (paramContext != null)
      {
        i = paramContext.getCurrentTextColor();
        AppMethodBeat.o(104982);
      }
      else
      {
        i = q((ViewGroup)localObject);
        AppMethodBeat.o(104982);
      }
    }
  }

  private static int jv(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2130840040; ; i = 2130840042)
      return i;
  }

  private static int jw(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2130840029; ; i = 2130840031)
      return i;
  }

  private static int jx(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2130840026; ; i = 2130840027)
      return i;
  }

  private static int q(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104983);
    Object localObject = new ArrayList();
    a(paramViewGroup, (List)localObject);
    paramViewGroup = null;
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      localObject = (TextView)localIterator.next();
      if (((TextView)localObject).getTextSize() <= -1.0F)
        break label93;
      paramViewGroup = (ViewGroup)localObject;
    }
    label93: 
    while (true)
    {
      break;
      int i;
      if (paramViewGroup != null)
      {
        i = paramViewGroup.getCurrentTextColor();
        AppMethodBeat.o(104983);
      }
      while (true)
      {
        return i;
        i = -16777216;
        AppMethodBeat.o(104983);
      }
    }
  }

  private static boolean zK(int paramInt)
  {
    AppMethodBeat.i(104985);
    int i = paramInt | 0xFF000000;
    int j = Color.red(-16777216) - Color.red(i);
    paramInt = Color.green(-16777216) - Color.green(i);
    i = Color.blue(-16777216) - Color.blue(i);
    boolean bool;
    if (Math.sqrt(i * i + (j * j + paramInt * paramInt)) < 180.0D)
    {
      bool = true;
      AppMethodBeat.o(104985);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104985);
    }
  }

  public final void c(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(104976);
    if (!this.bZi)
    {
      ab.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, play err");
      AppMethodBeat.o(104976);
    }
    while (true)
    {
      return;
      if (this.oMK == null)
      {
        ab.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        AppMethodBeat.o(104976);
      }
      else
      {
        ab.i("MicroMsg.Music.MMMusicNotification", "play");
        al.af(this.oMM);
        try
        {
          this.oMK.startForeground(291, a(this.oMK, parama, true));
          AppMethodBeat.o(104976);
        }
        catch (Exception parama)
        {
          ab.printErrStackTrace("MicroMsg.Music.MMMusicNotification", parama, "", new Object[0]);
          AppMethodBeat.o(104976);
        }
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(104978);
    if (!this.bZi)
    {
      ab.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, close err");
      AppMethodBeat.o(104978);
    }
    while (true)
    {
      return;
      if (this.oMK == null)
      {
        ab.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        AppMethodBeat.o(104978);
      }
      else
      {
        ab.i("MicroMsg.Music.MMMusicNotification", "close");
        al.af(this.oMM);
        al.n(this.oMM, 1000L);
        AppMethodBeat.o(104978);
      }
    }
  }

  public final void d(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(104977);
    if (!this.bZi)
    {
      ab.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, pause err");
      AppMethodBeat.o(104977);
    }
    while (true)
    {
      return;
      if (this.oMK == null)
      {
        ab.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        AppMethodBeat.o(104977);
      }
      else
      {
        ab.i("MicroMsg.Music.MMMusicNotification", "pause");
        al.af(this.oMM);
        this.oML.notify(291, a(this.oMK, parama, false));
        AppMethodBeat.o(104977);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.a
 * JD-Core Version:    0.6.2
 */