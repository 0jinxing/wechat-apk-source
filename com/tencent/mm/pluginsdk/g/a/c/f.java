package com.tencent.mm.pluginsdk.g.a.c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public abstract class f<T extends f.b>
{
  final Map<String, f.b> pendingRequests = new ConcurrentHashMap();
  final Map<String, Future<?>> veZ = new ConcurrentHashMap();

  protected abstract f.d a(T paramT);

  public final boolean ajc(String paramString)
  {
    return this.veZ.containsKey(paramString);
  }

  public final boolean ajd(String paramString)
  {
    try
    {
      if (!this.veZ.containsKey(paramString))
      {
        bool = this.pendingRequests.containsKey(paramString);
        if (!bool);
      }
      else
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  protected final void b(T paramT)
  {
    this.pendingRequests.put(paramT.dib(), paramT);
    dik().submit(a(paramT));
  }

  protected abstract f<T>.a dik();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.f
 * JD-Core Version:    0.6.2
 */