package com.tencent.mm.sdk.platformtools;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

final class ar$b
  implements SharedPreferences.Editor
{
  private final Map<String, Object> xAc;
  private boolean xAd;

  private ar$b(ar paramar)
  {
    AppMethodBeat.i(93423);
    this.xAc = new HashMap();
    this.xAd = false;
    AppMethodBeat.o(93423);
  }

  private FileOutputStream Y(File paramFile)
  {
    AppMethodBeat.i(93435);
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>(paramFile);
      paramFile = localFileOutputStream;
      AppMethodBeat.o(93435);
      return paramFile;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      while (true)
      {
        Object localObject = paramFile.getParentFile();
        if (!((File)localObject).mkdir())
        {
          ab.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create directory for SharedPreferences file ".concat(String.valueOf(paramFile)));
          AppMethodBeat.o(93435);
          paramFile = null;
        }
        else
        {
          ar.f((File)localObject, ar.h(this.xzZ));
          try
          {
            localObject = new java/io/FileOutputStream;
            ((FileOutputStream)localObject).<init>(paramFile);
            paramFile = (File)localObject;
          }
          catch (FileNotFoundException localFileNotFoundException2)
          {
            ab.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create SharedPreferences file ".concat(String.valueOf(paramFile)), new Object[] { localFileNotFoundException2 });
            paramFile = null;
          }
        }
      }
    }
  }

  private void a(ar.c paramc)
  {
    AppMethodBeat.i(93436);
    if ((paramc.epg == null) || (paramc.xAj == null) || (paramc.xAj.size() == 0))
      AppMethodBeat.o(93436);
    while (true)
    {
      return;
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        for (int i = paramc.xAj.size() - 1; i >= 0; i--)
        {
          String str = (String)paramc.xAj.get(i);
          Iterator localIterator = paramc.epg.iterator();
          while (localIterator.hasNext())
          {
            SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)localIterator.next();
            if (localOnSharedPreferenceChangeListener != null)
              localOnSharedPreferenceChangeListener.onSharedPreferenceChanged(this.xzZ, str);
          }
        }
        AppMethodBeat.o(93436);
      }
      else
      {
        ar.doW().post(new ar.b.4(this, paramc));
        AppMethodBeat.o(93436);
      }
    }
  }

  private void a(ar.c paramc, Runnable arg2)
  {
    int i = 1;
    AppMethodBeat.i(93434);
    paramc = new ar.b.3(this, paramc, ???);
    int j;
    if (??? == null)
    {
      j = 1;
      if (j == 0)
        break label95;
    }
    while (true)
    {
      synchronized (this.xzZ)
      {
        if (ar.b(this.xzZ) == 1)
        {
          j = i;
          if (j == 0)
            break label95;
          paramc.run();
          AppMethodBeat.o(93434);
          return;
          j = 0;
          break;
        }
        j = 0;
      }
      label95: ba.dph().execute(paramc);
      AppMethodBeat.o(93434);
    }
  }

  private ar.c doY()
  {
    AppMethodBeat.i(93433);
    ar.c localc1 = new ar.c((byte)0);
    while (true)
    {
      Object localObject3;
      Object localObject4;
      Object localObject5;
      synchronized (this.xzZ)
      {
        Object localObject2;
        if (ar.b(this.xzZ) > 0)
        {
          localObject2 = this.xzZ;
          localObject3 = new java/util/HashMap;
          ((HashMap)localObject3).<init>(ar.c(this.xzZ));
          ar.a((ar)localObject2, (Map)localObject3);
        }
        localc1.xAk = ar.c(this.xzZ);
        ar.d(this.xzZ);
        if (ar.e(this.xzZ).size() > 0)
        {
          i = 1;
          if (i != 0)
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            localc1.xAj = ((List)localObject2);
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>(ar.e(this.xzZ).keySet());
            localc1.epg = ((Set)localObject2);
          }
          try
          {
            if (this.xAd)
            {
              if (!ar.c(this.xzZ).isEmpty())
              {
                localc1.xAi = true;
                ar.c(this.xzZ).clear();
              }
              this.xAd = false;
            }
            localObject2 = this.xAc.entrySet().iterator();
            if (!((Iterator)localObject2).hasNext())
              break;
            localObject4 = (Map.Entry)((Iterator)localObject2).next();
            localObject3 = (String)((Map.Entry)localObject4).getKey();
            localObject5 = ((Map.Entry)localObject4).getValue();
            if (localObject5 != this)
              break label330;
            if (!ar.c(this.xzZ).containsKey(localObject3))
              continue;
            ar.c(this.xzZ).remove(localObject3);
            localc1.xAi = true;
            if (i == 0)
              continue;
            localc1.xAj.add(localObject3);
            continue;
          }
          finally
          {
            AppMethodBeat.o(93433);
          }
        }
      }
      int i = 0;
      continue;
      label330: if (ar.c(this.xzZ).containsKey(localObject3))
      {
        localObject4 = ar.c(this.xzZ).get(localObject3);
        if ((localObject4 != null) && (localObject4.equals(localObject5)));
      }
      else
      {
        ar.c(this.xzZ).put(localObject3, localObject5);
      }
    }
    this.xAc.clear();
    AppMethodBeat.o(93433);
    return localc2;
  }

  public final void apply()
  {
    AppMethodBeat.i(93432);
    ar.c localc = doY();
    final ar.b.1 local1 = new ar.b.1(this, localc);
    ba.ah(local1);
    a(localc, new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(93420);
        local1.run();
        ba.ai(local1);
        AppMethodBeat.o(93420);
      }
    });
    a(localc);
    AppMethodBeat.o(93432);
  }

  public final SharedPreferences.Editor clear()
  {
    try
    {
      this.xAd = true;
      return this;
    }
    finally
    {
    }
  }

  public final boolean commit()
  {
    AppMethodBeat.i(93431);
    ar.c localc = doY();
    a(localc, null);
    try
    {
      localc.xAl.await();
      a(localc);
      bool = localc.xAm;
      AppMethodBeat.o(93431);
      return bool;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(93431);
      }
    }
  }

  public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93429);
    try
    {
      this.xAc.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    finally
    {
      AppMethodBeat.o(93429);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93428);
    try
    {
      this.xAc.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    finally
    {
      AppMethodBeat.o(93428);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93426);
    try
    {
      this.xAc.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    finally
    {
      AppMethodBeat.o(93426);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(93427);
    try
    {
      this.xAc.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    finally
    {
      AppMethodBeat.o(93427);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93424);
    try
    {
      this.xAc.put(paramString1, paramString2);
      return this;
    }
    finally
    {
      AppMethodBeat.o(93424);
    }
    throw paramString1;
  }

  public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(93425);
    try
    {
      this.xAc.put(paramString, paramSet);
      return this;
    }
    finally
    {
      AppMethodBeat.o(93425);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor remove(String paramString)
  {
    AppMethodBeat.i(93430);
    try
    {
      this.xAc.put(paramString, this);
      return this;
    }
    finally
    {
      AppMethodBeat.o(93430);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar.b
 * JD-Core Version:    0.6.2
 */