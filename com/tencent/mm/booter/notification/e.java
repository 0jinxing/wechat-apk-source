package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class e extends a
{
  private NotificationManager FJ;
  public c edT;
  private Context mContext;

  public e()
  {
    AppMethodBeat.i(15951);
    this.mContext = ah.getContext();
    this.FJ = ((NotificationManager)this.mContext.getSystemService("notification"));
    this.edT = new c();
    AppMethodBeat.o(15951);
  }

  public static void cancel()
  {
    AppMethodBeat.i(15952);
    y localy = y.L(ah.getContext());
    LinkedList localLinkedList = new LinkedList();
    Object localObject = b.IP().IR();
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = ((Queue)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Integer)localIterator.next();
      localStringBuilder.append(localObject + ";");
      if (!localLinkedList.contains(localObject))
      {
        b.IP().a(localy, ((Integer)localObject).intValue());
        localLinkedList.add(localObject);
      }
    }
    ab.i("MicroMsg.Notification.Handle", "needRemoveNotificationId:%s", new Object[] { localStringBuilder });
    AppMethodBeat.o(15952);
  }

  public static void k(int paramInt, String paramString)
  {
    AppMethodBeat.i(15955);
    ab.i("MicroMsg.Notification.AppMsg.Handle", "refreshTotalUnread, %d, %s", new Object[] { Integer.valueOf(paramInt), paramString });
    int i = paramInt;
    if (paramInt == -1)
      i = f.Nr();
    c.im(i);
    ArrayList localArrayList;
    if ((paramString != null) && (paramString.length() > 0))
    {
      localArrayList = c.IL();
      if (localArrayList != null)
        break label309;
      localArrayList = new ArrayList();
    }
    label309: 
    while (true)
    {
      Object localObject1 = localArrayList.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c.a)((Iterator)localObject1).next();
        if (((c.a)localObject2).userName.equals(paramString))
          localArrayList.remove(localObject2);
      }
      while (true)
      {
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = new c.a((byte)0);
        ((c.a)localObject1).userName = paramString;
        ((c.a)localObject1).edE = f.kF(paramString);
        if ((((c.a)localObject1).edE == 0) && (localArrayList.isEmpty()))
        {
          c.f(null);
          AppMethodBeat.o(15955);
        }
        while (true)
        {
          return;
          paramString = localArrayList;
          if (((c.a)localObject1).edE > 0)
          {
            localArrayList.add(localObject1);
            paramString = localArrayList;
          }
          c.f(paramString);
          AppMethodBeat.o(15955);
        }
        localArrayList = new ArrayList();
        localObject2 = f.Nq();
        paramString = (String)localObject2;
        if (localObject2 == null)
          paramString = new ArrayList();
        localObject2 = paramString.iterator();
        while (true)
        {
          paramString = localArrayList;
          if (!((Iterator)localObject2).hasNext())
            break;
          localObject1 = (String)((Iterator)localObject2).next();
          paramString = new c.a((byte)0);
          paramString.userName = ((String)localObject1);
          paramString.edE = f.kF((String)localObject1);
          localArrayList.add(paramString);
        }
        localObject2 = null;
      }
    }
  }

  public final int a(NotificationItem paramNotificationItem)
  {
    AppMethodBeat.i(15953);
    int i;
    if (paramNotificationItem == null)
    {
      i = -1;
      AppMethodBeat.o(15953);
    }
    while (true)
    {
      return i;
      i = a(paramNotificationItem, null);
      AppMethodBeat.o(15953);
    }
  }

  @TargetApi(11)
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    AppMethodBeat.i(15954);
    paramNotification = this.edT.a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
    AppMethodBeat.o(15954);
    return paramNotification;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.e
 * JD-Core Version:    0.6.2
 */