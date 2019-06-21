package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.v;
import android.support.v4.app.y;
import android.support.v4.app.y.b;
import android.support.v4.app.y.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.a.e;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.a;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;

public class NotificationItem
  implements Parcelable
{
  public static final Parcelable.Creator<NotificationItem> CREATOR;
  Notification Fl;
  private final String TAG;
  private Bitmap b;
  private PendingIntent edU;
  public String edV;
  public long edW;
  public int edX;
  public boolean edY;
  public int edZ;
  public int eea;
  public int id;

  static
  {
    AppMethodBeat.i(15963);
    CREATOR = new NotificationItem.1();
    AppMethodBeat.o(15963);
  }

  public NotificationItem(int paramInt, Notification paramNotification, boolean paramBoolean)
  {
    this(paramInt, null, paramNotification, paramBoolean);
  }

  public NotificationItem(int paramInt, String paramString, Notification paramNotification)
  {
    this(paramInt, paramString, paramNotification, true);
  }

  @TargetApi(11)
  private NotificationItem(int paramInt, String paramString, Notification paramNotification, boolean paramBoolean)
  {
    AppMethodBeat.i(15957);
    this.TAG = "MicroMsg.NotificationItem";
    this.id = -1;
    this.edW = 0L;
    this.edX = 0;
    this.edY = true;
    this.edZ = 0;
    this.eea = 0;
    this.id = paramInt;
    this.edV = paramString;
    if (Build.VERSION.SDK_INT >= 11)
      this.b = paramNotification.largeIcon;
    this.Fl = paramNotification;
    this.edY = paramBoolean;
    this.edZ = 0;
    AppMethodBeat.o(15957);
  }

  public NotificationItem(Notification paramNotification, boolean paramBoolean)
  {
    this(-1, paramNotification, paramBoolean);
  }

  private NotificationItem(Parcel paramParcel)
  {
    AppMethodBeat.i(15960);
    this.TAG = "MicroMsg.NotificationItem";
    this.id = -1;
    this.edW = 0L;
    this.edX = 0;
    this.edY = true;
    this.edZ = 0;
    this.eea = 0;
    if (paramParcel == null)
    {
      AppMethodBeat.o(15960);
      return;
    }
    this.id = paramParcel.readInt();
    this.edV = paramParcel.readString();
    this.b = ((Bitmap)paramParcel.readParcelable(Bitmap.class.getClassLoader()));
    this.Fl = ((Notification)paramParcel.readParcelable(Notification.class.getClassLoader()));
    this.edU = ((PendingIntent)paramParcel.readParcelable(PendingIntent.class.getClassLoader()));
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.edY = bool;
      this.edW = paramParcel.readLong();
      this.edX = paramParcel.readInt();
      AppMethodBeat.o(15960);
      break;
    }
  }

  public final int a(g paramg)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    while (true)
    {
      int i;
      Object localObject4;
      try
      {
        AppMethodBeat.i(15959);
        Context localContext;
        if (this.id == -1)
        {
          i = b.IP().n(this.edV, this.edY);
          this.id = i;
          localContext = ah.getContext();
          if (localContext == null)
          {
            ab.e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            AppMethodBeat.o(15959);
            i = -1;
            return i;
          }
        }
        else
        {
          i = this.id;
          continue;
        }
        if (this.Fl == null)
        {
          ab.e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
          AppMethodBeat.o(15959);
          i = -1;
          continue;
        }
        localObject3 = b.IP();
        localObject4 = this.edV;
        if (bo.isNullOrNil((String)localObject4))
        {
          localObject3 = null;
          if (localObject3 != null)
          {
            localObject4 = b.IP();
            i = ((NotificationItem)localObject3).id;
            ab.d("MicroMsg.Notification.Queue", "mark: %d", new Object[] { Integer.valueOf(i) });
            ((b)localObject4).mark = i;
          }
          if ((localObject3 != null) && (((NotificationItem)localObject3).Fl.tickerText != null) && (this.Fl.tickerText != null) && (((NotificationItem)localObject3).Fl.tickerText.equals(this.Fl.tickerText)))
          {
            localObject3 = this.Fl;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((Notification)localObject3).tickerText = (this.Fl.tickerText + " ");
          }
          localObject4 = b.IP();
          if (this.id != -1)
            break label409;
          ab.e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
          localObject3 = localObject2;
          label284: if (localObject3 != null)
            b.IP().cancel(((NotificationItem)localObject3).id);
          this.eea = d.a(this.Fl, paramg);
          if (localContext != null)
          {
            if (this.Fl != null)
              break label553;
            ab.e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
          }
          i = this.id;
          AppMethodBeat.o(15959);
          continue;
        }
      }
      finally
      {
      }
      Iterator localIterator = ((b)localObject3).iterator();
      while (true)
        while (true)
          if (localIterator.hasNext())
          {
            localObject3 = (NotificationItem)localIterator.next();
            if ((localObject3 != null) && (((NotificationItem)localObject3).edV != null) && (((NotificationItem)localObject3).edV.equals(localObject4)))
            {
              break;
              label409: if (((b)localObject4).mark > 0)
              {
                if (((b)localObject4).mark == this.id)
                {
                  ab.d("MicroMsg.Notification.Queue", "remove mark: %d", new Object[] { Integer.valueOf(((b)localObject4).mark) });
                  ((b)localObject4).iq(((b)localObject4).mark);
                }
                ((b)localObject4).mark = -1;
              }
              ((b)localObject4).iq(this.id);
              localObject3 = localObject1;
              if (((b)localObject4).eeh.size() >= 5)
                localObject3 = ((b)localObject4).IQ();
              ((b)localObject4).eeh.e(this);
              ((b)localObject4).eei.c(this);
              ab.i("MicroMsg.Notification.Queue", "put item: %s, queuesize: %d", new Object[] { toString(), Integer.valueOf(((b)localObject4).eeh.size()) });
              break label284;
              label553: paramg = ah.getContext();
              if (paramg == null)
              {
                ab.e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
                label569: ab.i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", new Object[] { Integer.valueOf(this.Fl.defaults), this.Fl.sound, g.b(this.Fl.vibrate) });
              }
              try
              {
                if ((e.IY() == 1) && (this.Fl.defaults != 2) && (this.Fl.vibrate == null))
                {
                  this.Fl.defaults = 0;
                  this.Fl.sound = null;
                  ab.i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
                }
                if (com.tencent.mm.compatible.util.d.iW(26))
                {
                  ab.i("MicroMsg.NotificationItem", "manual add led to notification");
                  this.Fl.ledARGB = -16711936;
                  this.Fl.ledOnMS = 300;
                  this.Fl.ledOffMS = 1000;
                }
                paramg = y.L(ah.getContext());
                int j = this.id;
                localObject3 = this.Fl;
                localObject2 = v.a((Notification)localObject3);
                if ((localObject2 != null) && (((Bundle)localObject2).getBoolean("android.support.useSideChannel")))
                {
                  i = 1;
                  label757: if (i == 0)
                    break label873;
                  localObject2 = new android/support/v4/app/y$b;
                  ((y.b)localObject2).<init>(paramg.mContext.getPackageName(), j, (Notification)localObject3);
                  paramg.a((y.e)localObject2);
                  paramg.FJ.cancel(null, j);
                }
                while (this.edW != 0L)
                {
                  c.eR(this.edW);
                  break;
                  if (this.Fl == null)
                  {
                    ab.e("MicroMsg.NotificationItem", "error, safeCheck but mNotification == null");
                    break label569;
                  }
                  i = this.Fl.icon;
                  if (paramg.getResources().getDrawable(i) != null)
                    break label569;
                  this.Fl.icon = 2130839047;
                  break label569;
                  i = 0;
                  break label757;
                  label873: paramg.FJ.notify(null, j, (Notification)localObject3);
                }
              }
              catch (Exception paramg)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.NotificationItem", paramg, "Notification Exception?", new Object[0]);
              }
            }
          }
      Object localObject3 = null;
    }
  }

  public final void clear()
  {
    try
    {
      AppMethodBeat.i(15958);
      if ((this.b != null) && (!this.b.isRecycled()))
      {
        ab.i("MicroMsg.NotificationItem", "recycle bitmap:%s", new Object[] { this.b.toString() });
        this.b.recycle();
      }
      this.Fl = null;
      this.b = null;
      this.edU = null;
      AppMethodBeat.o(15958);
      return;
    }
    finally
    {
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(15962);
    String str = "id: " + this.id + ",msgId: " + this.edW + ",userName: " + this.edV + ",unreadCount: " + this.edX;
    AppMethodBeat.o(15962);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(15961);
    paramParcel.writeInt(this.id);
    String str;
    if (this.edV == null)
    {
      str = "";
      paramParcel.writeString(str);
      paramParcel.writeParcelable(this.b, 0);
      paramParcel.writeParcelable(this.Fl, 0);
      paramParcel.writeParcelable(this.edU, 0);
      if (!this.edY)
        break label103;
    }
    label103: for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.edW);
      paramParcel.writeInt(this.edX);
      AppMethodBeat.o(15961);
      return;
      str = this.edV;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.NotificationItem
 * JD-Core Version:    0.6.2
 */