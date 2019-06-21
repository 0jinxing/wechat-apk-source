package com.tencent.mm.app;

import android.os.Looper;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class a$a extends Error
{
  LinkedList<Pair<Thread, StackTraceElement[]>> cdN;

  private a$a(a.a.a.a parama, LinkedList<Pair<Thread, StackTraceElement[]>> paramLinkedList)
  {
    super("Application Not Responding", parama);
    this.cdN = paramLinkedList;
  }

  static a AY()
  {
    AppMethodBeat.i(15354);
    Thread localThread = Looper.getMainLooper().getThread();
    Object localObject1 = localThread.getStackTrace();
    if (localObject1 == null);
    for (int i = -1; ; i = localObject1.length)
    {
      ab.i("MicroMsg.ANRError", "summeranr NewMainOnly mainStackTrace size[%d]", new Object[] { Integer.valueOf(i) });
      new TreeMap().put(localThread, localObject1);
      Object localObject2 = new LinkedList();
      ((LinkedList)localObject2).addFirst(new Pair(localThread, localObject1));
      localObject1 = new a(a(localThread), (StackTraceElement[])localObject1, (byte)0);
      localObject1.getClass();
      localObject2 = new a(new a.a.a.a((a)localObject1, null, (byte)0), (LinkedList)localObject2);
      AppMethodBeat.o(15354);
      return localObject2;
    }
  }

  private static String a(Thread paramThread)
  {
    AppMethodBeat.i(15355);
    paramThread = paramThread.getName() + " (prio:" + paramThread.getPriority() + " tid:" + paramThread.getId() + " state:" + paramThread.getState() + ")";
    AppMethodBeat.o(15355);
    return paramThread;
  }

  static a j(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(15353);
    Object localObject1 = Looper.getMainLooper().getThread();
    LinkedList localLinkedList = new LinkedList();
    TreeMap localTreeMap = new TreeMap(new a.a.1((Thread)localObject1));
    Iterator localIterator = Thread.getAllStackTraces().entrySet().iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = (Map.Entry)localIterator.next();
      if (((((Map.Entry)localObject2).getKey() == localObject1) || ((((Thread)((Map.Entry)localObject2).getKey()).getName().startsWith(paramString)) && ((paramBoolean) || (((StackTraceElement[])((Map.Entry)localObject2).getValue()).length > 0)))) && (((Map.Entry)localObject2).getValue() != null) && (((StackTraceElement[])((Map.Entry)localObject2).getValue()).length > 0))
      {
        localTreeMap.put(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
        if (((Map.Entry)localObject2).getKey() == localObject1)
          localLinkedList.addFirst(new Pair(localObject1, ((Map.Entry)localObject2).getValue()));
        else
          localLinkedList.addLast(new Pair(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue()));
      }
    }
    if (!localTreeMap.containsKey(localObject1))
    {
      ab.i("MicroMsg.ANRError", "summeranr getAllStackTraces not return mainthread[%s, %d] put in now", new Object[] { ((Thread)localObject1).getName(), Long.valueOf(((Thread)localObject1).getId()) });
      localTreeMap.put(localObject1, ((Thread)localObject1).getStackTrace());
      localLinkedList.addFirst(new Pair(localObject1, ((Thread)localObject1).getStackTrace()));
    }
    localObject1 = localTreeMap.entrySet().iterator();
    for (paramString = null; ((Iterator)localObject1).hasNext(); paramString = new a.a.a.a((a)localObject2, paramString, (byte)0))
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = new a(a((Thread)((Map.Entry)localObject2).getKey()), (StackTraceElement[])((Map.Entry)localObject2).getValue(), (byte)0);
      localObject2.getClass();
    }
    paramString = new a(paramString, localLinkedList);
    AppMethodBeat.o(15353);
    return paramString;
  }

  public final Throwable fillInStackTrace()
  {
    AppMethodBeat.i(15352);
    super.fillInStackTrace();
    AppMethodBeat.o(15352);
    return this;
  }

  static final class a
    implements Serializable
  {
    final StackTraceElement[] cdP;
    final String name;

    private a(String paramString, StackTraceElement[] paramArrayOfStackTraceElement)
    {
      this.name = paramString;
      this.cdP = paramArrayOfStackTraceElement;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a.a
 * JD-Core Version:    0.6.2
 */