package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.m.f;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements Serializable, Iterable<a.a>
{
  LinkedList<a.a> eed;

  private void save()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(15973);
        if (this.eed == null)
        {
          AppMethodBeat.o(15973);
          return;
        }
        ab.d("MicroMsg.NotificationAppMsgQueue", "save: size: %d", new Object[] { Integer.valueOf(this.eed.size()) });
        if (this.eed.isEmpty())
        {
          f.MA().edit().putString("com.tencent.preference.notification.key.queue", "").apply();
          ab.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", new Object[] { Integer.valueOf(this.eed.size()), toString() });
          AppMethodBeat.o(15973);
          continue;
        }
      }
      finally
      {
      }
      try
      {
        LinkedList localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>(this.eed);
        f.MA().edit().putString("com.tencent.preference.notification.key.queue", c.a(localLinkedList)).apply();
        ab.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", new Object[] { Integer.valueOf(this.eed.size()), toString() });
        AppMethodBeat.o(15973);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", localIOException, "", new Object[0]);
      }
    }
  }

  public final boolean bJ(int paramInt)
  {
    while (true)
    {
      boolean bool;
      try
      {
        AppMethodBeat.i(15976);
        if (paramInt == -1)
        {
          AppMethodBeat.o(15976);
          bool = false;
          return bool;
        }
        if (this.eed == null)
          restore();
        LinkedList localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        Iterator localIterator = this.eed.iterator();
        i = 0;
        if (!localIterator.hasNext())
          break label108;
        a.a locala = (a.a)localIterator.next();
        if (locala.eee != paramInt)
        {
          localLinkedList.add(locala);
          continue;
        }
      }
      finally
      {
      }
      int i = 1;
      continue;
      label108: if (i != 0)
      {
        this.eed = localObject;
        save();
        AppMethodBeat.o(15976);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(15976);
        bool = false;
      }
    }
  }

  public final void c(NotificationItem paramNotificationItem)
  {
    int i = 1;
    while (true)
      try
      {
        AppMethodBeat.i(15974);
        if (this.eed == null)
          restore();
        bJ(paramNotificationItem.id);
        Object localObject;
        a.a locala;
        if ((paramNotificationItem.edY) && (!ah.isNullOrNil(paramNotificationItem.edV)))
        {
          localObject = this.eed.iterator();
          if (((Iterator)localObject).hasNext())
          {
            locala = (a.a)((Iterator)localObject).next();
            if (locala.userName.equals(paramNotificationItem.edV))
            {
              locala.a(paramNotificationItem.id, paramNotificationItem.edW, paramNotificationItem.edV, paramNotificationItem.edX, paramNotificationItem.edY, paramNotificationItem.edZ);
              i = 0;
            }
          }
          else
          {
            if (i != 0)
            {
              locala = new com/tencent/mm/booter/notification/queue/a$a;
              locala.<init>(paramNotificationItem.id, paramNotificationItem.edW, paramNotificationItem.edV, paramNotificationItem.edX, paramNotificationItem.edY, paramNotificationItem.edZ);
              this.eed.add(locala);
              ab.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
            }
            save();
            AppMethodBeat.o(15974);
          }
        }
        else
        {
          localObject = this.eed;
          locala = new com/tencent/mm/booter/notification/queue/a$a;
          locala.<init>(paramNotificationItem.id, paramNotificationItem.edY);
          ((LinkedList)localObject).add(locala);
          ab.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
        }
      }
      finally
      {
      }
  }

  public final List<Integer> io(int paramInt)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(15975);
      if (this.eed == null)
        restore();
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        a.a locala = (a.a)localIterator.next();
        if (((locala.eef & paramInt) != 0) && (!localArrayList.contains(Integer.valueOf(locala.eee))))
          localArrayList.add(Integer.valueOf(locala.eee));
      }
    }
    finally
    {
    }
    AppMethodBeat.o(15975);
    return localArrayList;
  }

  public final Iterator<a.a> iterator()
  {
    AppMethodBeat.i(15978);
    if (this.eed == null)
      restore();
    Iterator localIterator = this.eed.iterator();
    AppMethodBeat.o(15978);
    return localIterator;
  }

  public final boolean remove(String paramString)
  {
    try
    {
      AppMethodBeat.i(15977);
      ab.i("MicroMsg.NotificationAppMsgQueue", "remove username: %s", new Object[] { paramString });
      boolean bool;
      if (ah.isNullOrNil(paramString))
      {
        AppMethodBeat.o(15977);
        bool = false;
      }
      while (true)
      {
        return bool;
        if (this.eed == null)
          restore();
        Iterator localIterator = this.eed.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            a.a locala = (a.a)localIterator.next();
            if (paramString.equals(locala.userName))
            {
              this.eed.remove(locala);
              save();
              AppMethodBeat.o(15977);
              bool = true;
              break;
            }
          }
        AppMethodBeat.o(15977);
        bool = false;
      }
    }
    finally
    {
    }
    throw paramString;
  }

  // ERROR //
  public final void restore()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 15972
    //   5: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 65	com/tencent/mm/m/f:MA	()Landroid/content/SharedPreferences;
    //   11: ldc 73
    //   13: ldc 75
    //   15: invokeinterface 217 3 0
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: invokestatic 221	com/tencent/mm/booter/notification/queue/c:jQ	(Ljava/lang/String;)Ljava/io/Serializable;
    //   26: checkcast 39	java/util/LinkedList
    //   29: putfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   32: aload_0
    //   33: getfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   36: ifnonnull +16 -> 52
    //   39: new 39	java/util/LinkedList
    //   42: astore_1
    //   43: aload_1
    //   44: invokespecial 113	java/util/LinkedList:<init>	()V
    //   47: aload_0
    //   48: aload_1
    //   49: putfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   52: ldc 35
    //   54: ldc 223
    //   56: iconst_2
    //   57: anewarray 5	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: getfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   66: invokevirtual 43	java/util/LinkedList:size	()I
    //   69: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: aastore
    //   73: dup
    //   74: iconst_1
    //   75: aload_0
    //   76: invokevirtual 90	com/tencent/mm/booter/notification/queue/a:toString	()Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: sipush 15972
    //   86: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: aload_0
    //   90: monitorexit
    //   91: return
    //   92: astore_1
    //   93: ldc 35
    //   95: aload_1
    //   96: ldc 75
    //   98: iconst_0
    //   99: anewarray 5	java/lang/Object
    //   102: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: getfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   109: ifnonnull -57 -> 52
    //   112: new 39	java/util/LinkedList
    //   115: astore_1
    //   116: aload_1
    //   117: invokespecial 113	java/util/LinkedList:<init>	()V
    //   120: aload_0
    //   121: aload_1
    //   122: putfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   125: goto -73 -> 52
    //   128: astore_1
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    //   133: astore_1
    //   134: aload_0
    //   135: getfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   138: ifnonnull +16 -> 154
    //   141: new 39	java/util/LinkedList
    //   144: astore_2
    //   145: aload_2
    //   146: invokespecial 113	java/util/LinkedList:<init>	()V
    //   149: aload_0
    //   150: aload_2
    //   151: putfield 30	com/tencent/mm/booter/notification/queue/a:eed	Ljava/util/LinkedList;
    //   154: sipush 15972
    //   157: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: aload_1
    //   161: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   21	32	92	java/lang/Exception
    //   2	21	128	finally
    //   32	52	128	finally
    //   52	89	128	finally
    //   105	125	128	finally
    //   134	154	128	finally
    //   154	162	128	finally
    //   21	32	133	finally
    //   93	105	133	finally
  }

  public final String toString()
  {
    AppMethodBeat.i(15971);
    Iterator localIterator = this.eed.iterator();
    a.a locala;
    for (String str = ""; localIterator.hasNext(); str = str + locala.toString() + ";  ")
      locala = (a.a)localIterator.next();
    AppMethodBeat.o(15971);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.a
 * JD-Core Version:    0.6.2
 */