package com.tencent.mm.booter.notification.queue;

import android.support.v4.app.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class b
  implements Iterable<NotificationItem>
{
  public NotificationQueue eeh;
  public a eei;
  public int mark;

  private b()
  {
    AppMethodBeat.i(15990);
    this.mark = -1;
    this.eeh = new NotificationQueue();
    this.eei = new a();
    restore();
    AppMethodBeat.o(15990);
  }

  public static final b IP()
  {
    AppMethodBeat.i(15989);
    b localb = a.IT();
    AppMethodBeat.o(15989);
    return localb;
  }

  private Queue<Integer> IS()
  {
    AppMethodBeat.i(15995);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Object localObject1 = this.eeh;
    if (((NotificationQueue)localObject1).eeg == null)
      ((NotificationQueue)localObject1).restore();
    localLinkedList2.addAll(((NotificationQueue)localObject1).eeg);
    Object localObject2 = localLinkedList2.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (NotificationItem)((Iterator)localObject2).next();
      if (((NotificationItem)localObject1).edY)
      {
        localLinkedList1.add(Integer.valueOf(((NotificationItem)localObject1).id));
        ab.d("MicroMsg.Notification.Queue", "remove allcustom: %d", new Object[] { Integer.valueOf(((NotificationItem)localObject1).id) });
      }
    }
    localLinkedList2.clear();
    localLinkedList2 = new LinkedList();
    localObject1 = this.eei;
    if (((a)localObject1).eed == null)
      ((a)localObject1).restore();
    localLinkedList2.addAll(((a)localObject1).eed);
    localObject1 = localLinkedList2.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a.a)((Iterator)localObject1).next();
      if (((a.a)localObject2).edY)
      {
        localLinkedList1.add(Integer.valueOf(((a.a)localObject2).eee));
        ab.d("MicroMsg.Notification.Queue", "remove allcustom: %d", new Object[] { Integer.valueOf(((a.a)localObject2).eee) });
      }
    }
    localLinkedList2.clear();
    AppMethodBeat.o(15995);
    return localLinkedList1;
  }

  public final NotificationItem IQ()
  {
    AppMethodBeat.i(15993);
    int i = 0;
    Object localObject;
    if (i < this.eeh.size())
    {
      localObject = this.eeh;
      if (((NotificationQueue)localObject).eeg == null)
        ((NotificationQueue)localObject).restore();
      localObject = (NotificationItem)((NotificationQueue)localObject).eeg.get(i);
      if (((NotificationItem)localObject).edY)
      {
        if (this.eei.bJ(((NotificationItem)localObject).id))
          ab.d("MicroMsg.NotificationAppMsgQueue", "remove: [%s]", new Object[] { ((NotificationItem)localObject).toString() });
        this.eeh.d((NotificationItem)localObject);
      }
    }
    while (true)
    {
      AppMethodBeat.o(15993);
      return localObject;
      i++;
      break;
      localObject = null;
    }
  }

  public final Queue<Integer> IR()
  {
    AppMethodBeat.i(15994);
    LinkedList localLinkedList = new LinkedList();
    for (int i = 4097; i < 4102; i++)
      localLinkedList.add(Integer.valueOf(i));
    localLinkedList.addAll(IS());
    AppMethodBeat.o(15994);
    return localLinkedList;
  }

  public final void a(y paramy, int paramInt)
  {
    AppMethodBeat.i(15998);
    paramy.cancel(paramInt);
    iq(paramInt);
    AppMethodBeat.o(15998);
  }

  public final void cancel(int paramInt)
  {
    AppMethodBeat.i(15997);
    a(y.L(ah.getContext()), paramInt);
    AppMethodBeat.o(15997);
  }

  public final int getId(String paramString)
  {
    AppMethodBeat.i(15996);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(15996);
      i = -1;
    }
    while (true)
    {
      return i;
      Iterator localIterator = this.eei.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          a.a locala = (a.a)localIterator.next();
          if (locala.userName.equals(paramString))
          {
            i = locala.eee;
            AppMethodBeat.o(15996);
            break;
          }
        }
      AppMethodBeat.o(15996);
      i = -1;
    }
  }

  public final void iq(int paramInt)
  {
    AppMethodBeat.i(15992);
    this.eei.bJ(paramInt);
    NotificationItem localNotificationItem = this.eeh.ip(paramInt);
    if (localNotificationItem != null)
      localNotificationItem.clear();
    AppMethodBeat.o(15992);
  }

  public final Iterator<NotificationItem> iterator()
  {
    AppMethodBeat.i(16001);
    Object localObject = this.eeh;
    if (((NotificationQueue)localObject).eeg == null)
      ((NotificationQueue)localObject).restore();
    localObject = ((NotificationQueue)localObject).eeg.iterator();
    AppMethodBeat.o(16001);
    return localObject;
  }

  public final int jP(String paramString)
  {
    AppMethodBeat.i(15999);
    int i = getId(paramString);
    if (i > 0)
      AppMethodBeat.o(15999);
    while (true)
    {
      return i;
      i = n(paramString, true);
      AppMethodBeat.o(15999);
    }
  }

  public final int n(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(16000);
    long l = System.currentTimeMillis();
    Iterator localIterator = this.eei.iterator();
    a.a locala;
    for (String str = ""; localIterator.hasNext(); str = str + locala.eee + ",")
      locala = (a.a)localIterator.next();
    if (paramBoolean)
      i = 4097;
    while (str.contains(String.valueOf(i)))
    {
      i++;
      continue;
      i = 4102;
    }
    int j = i;
    if (i >= 4102)
    {
      j = i;
      if (paramBoolean)
        j = 4097;
    }
    int i = j;
    if (!bo.isNullOrNil(paramString))
    {
      i = j;
      if (paramBoolean)
        i = paramString.hashCode();
    }
    ab.d("MicroMsg.Notification.Queue", "create id spend: %d, id: %d, isCustomControl: %B", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(16000);
    return i;
  }

  public final void restore()
  {
    AppMethodBeat.i(15991);
    this.eeh.restore();
    this.eei.restore();
    AppMethodBeat.o(15991);
  }

  static final class a
  {
    private static final b eej;

    static
    {
      AppMethodBeat.i(15988);
      eej = new b((byte)0);
      AppMethodBeat.o(15988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.b
 * JD-Core Version:    0.6.2
 */