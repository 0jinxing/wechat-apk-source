package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class w
  implements u
{
  final v.c FA;
  final List<Bundle> FB = new ArrayList();
  RemoteViews Ff;
  RemoteViews Fg;
  RemoteViews Fh;
  int Fk;
  final Notification.Builder mBuilder;
  final Bundle mExtras = new Bundle();

  w(v.c paramc)
  {
    this.FA = paramc;
    Object localObject1;
    Object localObject2;
    label138: label158: label178: Notification.Builder localBuilder;
    if (Build.VERSION.SDK_INT >= 26)
    {
      this.mBuilder = new Notification.Builder(paramc.mContext, paramc.mChannelId);
      localObject1 = paramc.Fl;
      localObject2 = this.mBuilder.setWhen(((Notification)localObject1).when).setSmallIcon(((Notification)localObject1).icon, ((Notification)localObject1).iconLevel).setContent(((Notification)localObject1).contentView).setTicker(((Notification)localObject1).tickerText, paramc.EK).setVibrate(((Notification)localObject1).vibrate).setLights(((Notification)localObject1).ledARGB, ((Notification)localObject1).ledOnMS, ((Notification)localObject1).ledOffMS);
      if ((((Notification)localObject1).flags & 0x2) == 0)
        break label394;
      bool = true;
      localObject2 = ((Notification.Builder)localObject2).setOngoing(bool);
      if ((((Notification)localObject1).flags & 0x8) == 0)
        break label400;
      bool = true;
      localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(bool);
      if ((((Notification)localObject1).flags & 0x10) == 0)
        break label406;
      bool = true;
      localBuilder = ((Notification.Builder)localObject2).setAutoCancel(bool).setDefaults(((Notification)localObject1).defaults).setContentTitle(paramc.EG).setContentText(paramc.EH).setContentInfo(paramc.EM).setContentIntent(paramc.EI).setDeleteIntent(((Notification)localObject1).deleteIntent);
      localObject2 = paramc.EJ;
      if ((((Notification)localObject1).flags & 0x80) == 0)
        break label412;
    }
    label394: label400: label406: label412: for (boolean bool = true; ; bool = false)
    {
      localBuilder.setFullScreenIntent((PendingIntent)localObject2, bool).setLargeIcon(paramc.EL).setNumber(paramc.EN).setProgress(paramc.EU, paramc.EV, paramc.EW);
      if (Build.VERSION.SDK_INT < 21)
        this.mBuilder.setSound(((Notification)localObject1).sound, ((Notification)localObject1).audioStreamType);
      if (Build.VERSION.SDK_INT < 16)
        break label538;
      this.mBuilder.setSubText(paramc.ES).setUsesChronometer(paramc.EP).setPriority(paramc.mPriority);
      localObject2 = paramc.EF.iterator();
      while (((Iterator)localObject2).hasNext())
        a((v.a)((Iterator)localObject2).next());
      this.mBuilder = new Notification.Builder(paramc.mContext);
      break;
      bool = false;
      break label138;
      bool = false;
      break label158;
      bool = false;
      break label178;
    }
    if (paramc.mExtras != null)
      this.mExtras.putAll(paramc.mExtras);
    if (Build.VERSION.SDK_INT < 20)
    {
      if (paramc.Fa)
        this.mExtras.putBoolean("android.support.localOnly", true);
      if (paramc.EX != null)
      {
        this.mExtras.putString("android.support.groupKey", paramc.EX);
        if (!paramc.EY)
          break label753;
        this.mExtras.putBoolean("android.support.isGroupSummary", true);
      }
    }
    while (true)
    {
      if (paramc.EZ != null)
        this.mExtras.putString("android.support.sortKey", paramc.EZ);
      this.Ff = paramc.Ff;
      this.Fg = paramc.Fg;
      label538: if (Build.VERSION.SDK_INT >= 19)
      {
        this.mBuilder.setShowWhen(paramc.EO);
        if ((Build.VERSION.SDK_INT < 21) && (paramc.Fm != null) && (!paramc.Fm.isEmpty()))
          this.mExtras.putStringArray("android.people", (String[])paramc.Fm.toArray(new String[paramc.Fm.size()]));
      }
      if (Build.VERSION.SDK_INT >= 20)
      {
        this.mBuilder.setLocalOnly(paramc.Fa).setGroup(paramc.EX).setGroupSummary(paramc.EY).setSortKey(paramc.EZ);
        this.Fk = paramc.Fk;
      }
      if (Build.VERSION.SDK_INT < 21)
        break label775;
      this.mBuilder.setCategory(paramc.Fd).setColor(paramc.mColor).setVisibility(paramc.iZ).setPublicVersion(paramc.Fe).setSound(((Notification)localObject1).sound, ((Notification)localObject1).audioAttributes);
      localObject1 = paramc.Fm.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        this.mBuilder.addPerson((String)localObject2);
      }
      label753: this.mExtras.putBoolean("android.support.useSideChannel", true);
    }
    this.Fh = paramc.Fh;
    label775: if (Build.VERSION.SDK_INT >= 24)
    {
      this.mBuilder.setExtras(paramc.mExtras).setRemoteInputHistory(paramc.ET);
      if (paramc.Ff != null)
        this.mBuilder.setCustomContentView(paramc.Ff);
      if (paramc.Fg != null)
        this.mBuilder.setCustomBigContentView(paramc.Fg);
      if (paramc.Fh != null)
        this.mBuilder.setCustomHeadsUpContentView(paramc.Fh);
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      this.mBuilder.setBadgeIconType(paramc.Fi).setShortcutId(paramc.Fj).setTimeoutAfter(paramc.mTimeout).setGroupAlertBehavior(paramc.Fk);
      if (paramc.Fc)
        this.mBuilder.setColorized(paramc.Fb);
      if (!TextUtils.isEmpty(paramc.mChannelId))
        this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
    }
  }

  private void a(v.a parama)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 20)
    {
      Notification.Action.Builder localBuilder = new Notification.Action.Builder(parama.icon, parama.title, parama.actionIntent);
      if (parama.EB != null)
      {
        localObject = aa.b(parama.EB);
        int i = localObject.length;
        for (int j = 0; j < i; j++)
          localBuilder.addRemoteInput(localObject[j]);
      }
      if (parama.mExtras != null)
      {
        localObject = new Bundle(parama.mExtras);
        ((Bundle)localObject).putBoolean("android.support.allowGeneratedReplies", parama.ED);
        if (Build.VERSION.SDK_INT >= 24)
          localBuilder.setAllowGeneratedReplies(parama.ED);
        localBuilder.addExtras((Bundle)localObject);
        this.mBuilder.addAction(localBuilder.build());
      }
    }
    while (true)
    {
      return;
      localObject = new Bundle();
      break;
      if (Build.VERSION.SDK_INT >= 16)
        this.FB.add(x.a(this.mBuilder, parama));
    }
  }

  static void b(Notification paramNotification)
  {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    paramNotification.defaults &= -2;
    paramNotification.defaults &= -3;
  }

  public final Notification.Builder ds()
  {
    return this.mBuilder;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.w
 * JD-Core Version:    0.6.2
 */