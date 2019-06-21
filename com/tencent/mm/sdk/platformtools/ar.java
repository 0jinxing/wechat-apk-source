package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.util.LruCache;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public final class ar
  implements SharedPreferences
{
  private static ak xzO;
  private static final Object xzW;
  private static final LruCache<String, ar> xzY;
  private Map<String, Object> eGu;
  private boolean eJj;
  private File gUc;
  private int mMode;
  private FLock xzP;
  private File xzQ;
  private boolean xzR;
  private int xzS;
  private long xzT;
  private long xzU;
  private final Object xzV;
  private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> xzX;

  static
  {
    AppMethodBeat.i(93459);
    xzO = null;
    xzW = new Object();
    xzY = new LruCache(5);
    AppMethodBeat.o(93459);
  }

  private ar()
  {
    AppMethodBeat.i(93442);
    this.xzP = null;
    this.gUc = null;
    this.xzQ = null;
    this.mMode = 0;
    this.xzR = false;
    this.eGu = null;
    this.xzS = 0;
    this.eJj = false;
    this.xzT = 0L;
    this.xzU = 0L;
    this.xzV = new Object();
    this.xzX = new WeakHashMap();
    RuntimeException localRuntimeException = new RuntimeException("Not supported.");
    AppMethodBeat.o(93442);
    throw localRuntimeException;
  }

  private ar(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(93443);
    this.xzP = null;
    this.gUc = null;
    this.xzQ = null;
    this.mMode = 0;
    this.xzR = false;
    this.eGu = null;
    this.xzS = 0;
    this.eJj = false;
    this.xzT = 0L;
    this.xzU = 0L;
    this.xzV = new Object();
    this.xzX = new WeakHashMap();
    Context localContext = paramContext.getApplicationContext();
    if (xzO == null)
      xzO = new ak(Looper.getMainLooper());
    String str = localContext.getApplicationInfo().dataDir;
    if (str != null)
    {
      paramContext = str;
      if (str.length() != 0);
    }
    else
    {
      ab.w("MicroMsg.MultiProcSharedPreferences", "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
      paramContext = "/data/data/" + localContext.getPackageName();
    }
    ab.i("MicroMsg.MultiProcSharedPreferences", "Path to store sp data: ".concat(String.valueOf(paramContext)));
    paramContext = new File(paramContext, "shared_prefs");
    if (!paramContext.exists())
    {
      paramContext.mkdirs();
      this.gUc = new File(paramContext, paramString + ".xml");
      paramContext = this.gUc;
      this.xzQ = new File(paramContext.getPath() + ".bak");
      this.mMode = paramInt;
      if ((paramInt & 0x4) == 0)
        break label370;
    }
    label370: for (boolean bool = true; ; bool = false)
    {
      this.xzR = bool;
      if (this.xzR)
        this.xzP = new FLock(this.gUc.getPath() + ".lock");
      doU();
      AppMethodBeat.o(93443);
      return;
      if ((paramContext.canRead()) && (paramContext.canWrite()))
        break;
      paramContext.setReadable(true, true);
      paramContext.setWritable(true, true);
      break;
    }
  }

  private void doU()
  {
    AppMethodBeat.i(93444);
    try
    {
      this.eJj = false;
      d.h(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(93412);
          synchronized (ar.this)
          {
            ar.a(ar.this);
            AppMethodBeat.o(93412);
            return;
          }
        }
      }
      , "MultiProcessSP-LoadThread").start();
      AppMethodBeat.o(93444);
      return;
    }
    finally
    {
      AppMethodBeat.o(93444);
    }
  }

  private void doV()
  {
    AppMethodBeat.i(93447);
    while (!this.eJj)
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    AppMethodBeat.o(93447);
  }

  public static SharedPreferences s(Context paramContext, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(93441);
    as localas = as.amF(paramString);
    ar localar;
    if (ar.a.doX())
    {
      ab.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use Flock version MultiProcessSP.", new Object[] { paramString });
      localar = (ar)xzY.get(paramString);
      if (localar == null)
      {
        paramContext = new ar(paramContext, paramString, paramInt);
        xzY.put(paramString, paramContext);
        as.a(paramContext, localas);
        AppMethodBeat.o(93441);
        paramContext = localas;
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = localar;
      if ((paramInt & 0x4) == 0)
        break;
      while (true)
      {
        try
        {
          if (localar.xzS <= 0)
          {
            paramInt = i;
            if (localar.xzT == localar.gUc.lastModified())
            {
              if (localar.xzU != localar.gUc.length())
                paramInt = i;
            }
            else
            {
              if (paramInt != 0)
                break label179;
              paramContext = localar;
              break;
            }
          }
        }
        finally
        {
          AppMethodBeat.o(93441);
        }
        paramInt = 0;
      }
      label179: localar.doU();
      paramContext = localar;
      break;
      ab.i("MicroMsg.MultiProcSharedPreferences", "sp: %s, use system sp.", new Object[] { paramString });
      paramContext = paramContext.getSharedPreferences(paramString, paramInt);
      AppMethodBeat.o(93441);
    }
  }

  public final boolean contains(String paramString)
  {
    AppMethodBeat.i(93455);
    try
    {
      doV();
      boolean bool = this.eGu.containsKey(paramString);
      return bool;
    }
    finally
    {
      AppMethodBeat.o(93455);
    }
    throw paramString;
  }

  public final SharedPreferences.Editor edit()
  {
    AppMethodBeat.i(93456);
    try
    {
      doV();
      ar.b localb = new ar.b(this, (byte)0);
      AppMethodBeat.o(93456);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(93456);
    }
  }

  public final Map<String, ?> getAll()
  {
    AppMethodBeat.i(93448);
    try
    {
      doV();
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>(this.eGu);
      return localHashMap;
    }
    finally
    {
      AppMethodBeat.o(93448);
    }
  }

  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93454);
    try
    {
      doV();
      paramString = (Boolean)this.eGu.get(paramString);
      if (paramString != null)
        paramBoolean = paramString.booleanValue();
      return paramBoolean;
    }
    finally
    {
      AppMethodBeat.o(93454);
    }
    throw paramString;
  }

  public final float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93453);
    try
    {
      doV();
      paramString = (Float)this.eGu.get(paramString);
      if (paramString != null)
        paramFloat = paramString.floatValue();
      return paramFloat;
    }
    finally
    {
      AppMethodBeat.o(93453);
    }
    throw paramString;
  }

  public final int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93451);
    try
    {
      doV();
      paramString = (Integer)this.eGu.get(paramString);
      if (paramString != null)
        paramInt = paramString.intValue();
      return paramInt;
    }
    finally
    {
      AppMethodBeat.o(93451);
    }
    throw paramString;
  }

  public final long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(93452);
    try
    {
      doV();
      paramString = (Long)this.eGu.get(paramString);
      if (paramString != null)
        paramLong = paramString.longValue();
      return paramLong;
    }
    finally
    {
      AppMethodBeat.o(93452);
    }
    throw paramString;
  }

  public final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93449);
    try
    {
      doV();
      paramString1 = (String)this.eGu.get(paramString1);
      if (paramString1 != null)
        paramString2 = paramString1;
      while (true)
        return paramString2;
    }
    finally
    {
      AppMethodBeat.o(93449);
    }
    throw paramString1;
  }

  public final Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(93450);
    try
    {
      doV();
      paramString = (Set)this.eGu.get(paramString);
      if (paramString != null)
        paramSet = paramString;
      while (true)
        return paramSet;
    }
    finally
    {
      AppMethodBeat.o(93450);
    }
    throw paramString;
  }

  public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(93445);
    try
    {
      this.xzX.put(paramOnSharedPreferenceChangeListener, xzW);
      return;
    }
    finally
    {
      AppMethodBeat.o(93445);
    }
    throw paramOnSharedPreferenceChangeListener;
  }

  public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(93446);
    try
    {
      this.xzX.remove(paramOnSharedPreferenceChangeListener);
      return;
    }
    finally
    {
      AppMethodBeat.o(93446);
    }
    throw paramOnSharedPreferenceChangeListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar
 * JD-Core Version:    0.6.2
 */