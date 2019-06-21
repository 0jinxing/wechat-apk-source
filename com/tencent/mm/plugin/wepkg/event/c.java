package com.tencent.mm.plugin.wepkg.event;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class c
{
  private static ConcurrentLinkedQueue<WeakReference<a>> uWD;

  static
  {
    AppMethodBeat.i(63473);
    uWD = new ConcurrentLinkedQueue();
    AppMethodBeat.o(63473);
  }

  public static <T extends Parcelable> void a(T paramT, a parama)
  {
    AppMethodBeat.i(63472);
    ToolsProcessIPCService.a(paramT, b.class, new c.1(parama));
    AppMethodBeat.o(63472);
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(63469);
    uWD.add(new WeakReference(parama));
    AppMethodBeat.o(63469);
  }

  public static void b(a parama)
  {
    AppMethodBeat.i(63470);
    Iterator localIterator = uWD.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == parama)
        uWD.remove(localWeakReference);
    }
    AppMethodBeat.o(63470);
  }

  public static void clear()
  {
    AppMethodBeat.i(63471);
    uWD.clear();
    AppMethodBeat.o(63471);
  }

  public static abstract interface a
  {
    public abstract void ckg();
  }

  static class b
    implements com.tencent.mm.ipcinvoker.a
  {
    public final void a(Object paramObject, com.tencent.mm.ipcinvoker.c paramc)
    {
      AppMethodBeat.i(63468);
      Iterator localIterator = c.dgy().iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() != null)
          ((a)localWeakReference.get()).ct(paramObject);
      }
      paramc.ao(null);
      AppMethodBeat.o(63468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.event.c
 * JD-Core Version:    0.6.2
 */