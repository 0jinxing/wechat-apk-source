package com.tencent.ttpic.cache;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HandlerThreadManager
{
  private static HandlerThreadManager instance;
  private Map<String, HandlerThread> map;

  static
  {
    AppMethodBeat.i(81767);
    instance = new HandlerThreadManager();
    AppMethodBeat.o(81767);
  }

  private HandlerThreadManager()
  {
    AppMethodBeat.i(81764);
    this.map = new ConcurrentHashMap();
    AppMethodBeat.o(81764);
  }

  public static HandlerThreadManager getInstance()
  {
    return instance;
  }

  public void destroy()
  {
    AppMethodBeat.i(81766);
    Iterator localIterator = this.map.values().iterator();
    while (localIterator.hasNext())
      ((HandlerThread)localIterator.next()).quit();
    this.map.clear();
    AppMethodBeat.o(81766);
  }

  public HandlerThread getHanderThread(String paramString)
  {
    AppMethodBeat.i(81765);
    HandlerThread localHandlerThread1 = (HandlerThread)this.map.get(paramString);
    HandlerThread localHandlerThread2 = localHandlerThread1;
    if (localHandlerThread1 == null)
    {
      localHandlerThread2 = new HandlerThread(paramString);
      localHandlerThread2.start();
      this.map.put(paramString, localHandlerThread2);
    }
    AppMethodBeat.o(81765);
    return localHandlerThread2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.HandlerThreadManager
 * JD-Core Version:    0.6.2
 */