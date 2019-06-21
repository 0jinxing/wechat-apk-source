package com.tencent.matrix.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.d.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class a extends c
{
  private final long bWr = 86400000L;
  private final SharedPreferences.Editor bWs;
  private final HashMap<String, Long> bWt;
  private final SharedPreferences sharedPreferences;

  public a(Context paramContext, String paramString, c.a parama)
  {
    super(parama);
    this.sharedPreferences = paramContext.getSharedPreferences(paramString + d.aD(paramContext), 0);
    this.bWt = new HashMap();
    long l1 = System.currentTimeMillis();
    this.bWs = this.sharedPreferences.edit();
    paramString = new HashSet(this.sharedPreferences.getAll().keySet()).iterator();
    while (paramString.hasNext())
    {
      paramContext = (String)paramString.next();
      long l2 = this.sharedPreferences.getLong(paramContext, 0L);
      if ((l2 <= 0L) || (l1 - l2 > this.bWr))
        this.bWs.remove(paramContext);
      else
        this.bWt.put(paramContext, Long.valueOf(l2));
    }
    this.bWs.apply();
  }

  public final void cf(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      if (!this.bWt.containsKey(paramString))
      {
        long l = System.currentTimeMillis();
        this.bWt.put(paramString, Long.valueOf(l));
        this.bWs.putLong(paramString, l).apply();
      }
    }
  }

  public final boolean cg(String paramString)
  {
    boolean bool;
    if (!this.bWt.containsKey(paramString))
      bool = false;
    while (true)
    {
      return bool;
      long l = ((Long)this.bWt.get(paramString)).longValue();
      if ((l <= 0L) || (System.currentTimeMillis() - l > this.bWr))
      {
        this.bWs.remove(paramString).apply();
        this.bWt.remove(paramString);
        bool = false;
      }
      else
      {
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.c.a
 * JD-Core Version:    0.6.2
 */