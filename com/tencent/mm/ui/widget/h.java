package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
{
  private static LinkedList<WeakReference<a>> zOe;

  static
  {
    AppMethodBeat.i(107977);
    zOe = new LinkedList();
    AppMethodBeat.o(107977);
  }

  public static void J(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(107976);
    if (zOe.size() <= 0)
    {
      ab.w("MicroMsg.SwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      AppMethodBeat.o(107976);
    }
    while (true)
    {
      return;
      a locala = (a)((WeakReference)zOe.get(0)).get();
      if (locala == null)
      {
        ab.w("MicroMsg.SwipeBackHelper", "notifySettle null, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
        AppMethodBeat.o(107976);
      }
      else
      {
        locala.onSettle(paramBoolean, paramInt);
        ab.v("MicroMsg.SwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), locala });
        AppMethodBeat.o(107976);
      }
    }
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(107973);
    ab.d("MicroMsg.SwipeBackHelper", "pushCallback size %d, %s", new Object[] { Integer.valueOf(zOe.size()), parama });
    parama = new WeakReference(parama);
    zOe.add(0, parama);
    AppMethodBeat.o(107973);
  }

  public static boolean b(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(107974);
    int i = zOe.size();
    ab.d("MicroMsg.SwipeBackHelper", "popCallback size %d, %s", new Object[] { Integer.valueOf(i), parama });
    if (parama == null)
    {
      AppMethodBeat.o(107974);
      bool = true;
    }
    while (true)
    {
      return bool;
      LinkedList localLinkedList = new LinkedList();
      for (int j = 0; ; j++)
      {
        if (j < zOe.size())
        {
          if (parama == ((WeakReference)zOe.get(j)).get())
          {
            zOe.remove(j);
            ab.d("MicroMsg.SwipeBackHelper", "popCallback directly, index %d", new Object[] { Integer.valueOf(j) });
          }
        }
        else
        {
          if ((parama.forceRemoveNoMatchOnPath()) || (localLinkedList.size() != i))
            break label165;
          ab.d("MicroMsg.SwipeBackHelper", "popCallback Fail! Maybe Top Activity");
          AppMethodBeat.o(107974);
          break;
        }
        localLinkedList.add(0, Integer.valueOf(j));
      }
      label165: Iterator localIterator = localLinkedList.iterator();
      if (localIterator.hasNext())
      {
        parama = (Integer)localIterator.next();
        parama = (WeakReference)zOe.remove(parama.intValue());
        if (parama != null);
        for (parama = parama.get(); ; parama = "NULL-CALLBACK")
        {
          ab.d("MicroMsg.SwipeBackHelper", "popCallback, popup %s", new Object[] { parama });
          break;
        }
      }
      bool = localLinkedList.isEmpty();
      AppMethodBeat.o(107974);
    }
  }

  public static void bq(float paramFloat)
  {
    AppMethodBeat.i(107975);
    if (zOe.size() <= 0)
    {
      ab.w("MicroMsg.SwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(107975);
    }
    while (true)
    {
      return;
      a locala = (a)((WeakReference)zOe.get(0)).get();
      if (locala == null)
      {
        ab.w("MicroMsg.SwipeBackHelper", "notifySwipe null, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
        AppMethodBeat.o(107975);
      }
      else
      {
        locala.onSwipe(paramFloat);
        ab.v("MicroMsg.SwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", new Object[] { Float.valueOf(paramFloat), locala });
        AppMethodBeat.o(107975);
      }
    }
  }

  public static abstract interface a
  {
    public abstract boolean forceRemoveNoMatchOnPath();

    public abstract void onSettle(boolean paramBoolean, int paramInt);

    public abstract void onSwipe(float paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.h
 * JD-Core Version:    0.6.2
 */