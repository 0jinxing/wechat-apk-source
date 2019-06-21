package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;

public final class NotificationQueue
{
  public NotificationQueue.ParcelNotificationQueue eeg;

  private void save()
  {
    AppMethodBeat.i(138161);
    if (this.eeg == null)
      AppMethodBeat.o(138161);
    while (true)
    {
      return;
      ab.d("MicroMsg.NotificationCustomQueue", "jacks save: %d", new Object[] { Integer.valueOf(this.eeg.size()) });
      if (this.eeg.isEmpty())
      {
        f.MA().edit().putString("com.tencent.preference.notification.queue", "").apply();
        if (this.eeg == null)
          restore();
        ab.d("MicroMsg.NotificationCustomQueue", "jacks _reset: %d", new Object[] { Integer.valueOf(this.eeg.size()) });
        AppMethodBeat.o(138161);
      }
      else
      {
        AppMethodBeat.o(138161);
      }
    }
  }

  public final boolean d(NotificationItem paramNotificationItem)
  {
    try
    {
      AppMethodBeat.i(15984);
      if (this.eeg == null)
        restore();
      boolean bool = this.eeg.remove(paramNotificationItem);
      if (bool)
        save();
      AppMethodBeat.o(15984);
      return bool;
    }
    finally
    {
    }
    throw paramNotificationItem;
  }

  public final boolean e(NotificationItem paramNotificationItem)
  {
    try
    {
      AppMethodBeat.i(15986);
      if (this.eeg == null)
        restore();
      boolean bool = this.eeg.add(paramNotificationItem);
      if (bool)
        save();
      AppMethodBeat.o(15986);
      return bool;
    }
    finally
    {
    }
    throw paramNotificationItem;
  }

  public final NotificationItem ip(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(15985);
        if (this.eeg == null)
          restore();
        Iterator localIterator = this.eeg.iterator();
        if (localIterator.hasNext())
        {
          NotificationItem localNotificationItem = (NotificationItem)localIterator.next();
          if (localNotificationItem.id != paramInt)
            continue;
          if ((localNotificationItem != null) && (this.eeg.remove(localNotificationItem)))
            save();
          AppMethodBeat.o(15985);
          return localNotificationItem;
        }
      }
      finally
      {
      }
      Object localObject2 = null;
    }
  }

  public final void restore()
  {
    try
    {
      AppMethodBeat.i(15983);
      ab.d("MicroMsg.NotificationCustomQueue", "jacks _restore");
      if (this.eeg == null)
      {
        NotificationQueue.ParcelNotificationQueue localParcelNotificationQueue = new com/tencent/mm/booter/notification/queue/NotificationQueue$ParcelNotificationQueue;
        localParcelNotificationQueue.<init>();
        this.eeg = localParcelNotificationQueue;
      }
      ab.d("MicroMsg.NotificationCustomQueue", "jacks _restore: %d", new Object[] { Integer.valueOf(this.eeg.size()) });
      AppMethodBeat.o(15983);
      return;
    }
    finally
    {
    }
  }

  public final int size()
  {
    AppMethodBeat.i(15987);
    if (this.eeg == null)
      restore();
    int i = this.eeg.size();
    AppMethodBeat.o(15987);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.queue.NotificationQueue
 * JD-Core Version:    0.6.2
 */