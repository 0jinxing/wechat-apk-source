package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class c
{
  private static final c a;
  private ConcurrentHashMap<Integer, WeakReference<e>> b;
  private PhoneStateListener c;
  private Context d;

  static
  {
    AppMethodBeat.i(66552);
    a = new c();
    AppMethodBeat.o(66552);
  }

  private c()
  {
    AppMethodBeat.i(66545);
    this.b = new ConcurrentHashMap();
    this.c = null;
    AppMethodBeat.o(66545);
  }

  public static c a()
  {
    return a;
  }

  private void a(int paramInt)
  {
    while (true)
    {
      Iterator localIterator;
      try
      {
        AppMethodBeat.i(66548);
        localIterator = this.b.entrySet().iterator();
        if (!localIterator.hasNext())
          break;
        e locale = (e)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
        if (locale != null)
        {
          locale.b(paramInt);
          continue;
        }
      }
      finally
      {
      }
      localIterator.remove();
    }
    AppMethodBeat.o(66548);
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(66549);
    if (this.c != null)
      AppMethodBeat.o(66549);
    while (true)
    {
      return;
      this.d = paramContext.getApplicationContext();
      new Handler(Looper.getMainLooper()).post(new c.1(this));
      AppMethodBeat.o(66549);
    }
  }

  public void a(e parame)
  {
    try
    {
      AppMethodBeat.i(66546);
      if (parame == null)
        AppMethodBeat.o(66546);
      while (true)
      {
        return;
        ConcurrentHashMap localConcurrentHashMap = this.b;
        int i = parame.hashCode();
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(parame);
        localConcurrentHashMap.put(Integer.valueOf(i), localWeakReference);
        AppMethodBeat.o(66546);
      }
    }
    finally
    {
    }
    throw parame;
  }

  public void b(e parame)
  {
    try
    {
      AppMethodBeat.i(66547);
      if (parame == null)
        AppMethodBeat.o(66547);
      while (true)
      {
        return;
        if (this.b.containsKey(Integer.valueOf(parame.hashCode())))
          this.b.remove(Integer.valueOf(parame.hashCode()));
        AppMethodBeat.o(66547);
      }
    }
    finally
    {
    }
    throw parame;
  }

  protected void finalize()
  {
    AppMethodBeat.i(66550);
    super.finalize();
    if ((this.c != null) && (this.d != null))
      new Handler(Looper.getMainLooper()).post(new c.2(this));
    AppMethodBeat.o(66550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.c
 * JD-Core Version:    0.6.2
 */