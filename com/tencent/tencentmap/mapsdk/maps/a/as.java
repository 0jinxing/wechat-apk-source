package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class as
{
  private int a = 12;
  private int b = 60;
  private int c = 12;
  private int d = 60;
  private int e = 20;
  private boolean f = false;
  private boolean g = true;
  private Set<String> h = null;
  private Map<String, Float> i = null;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;

  public final int a()
  {
    try
    {
      int m = this.a;
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(Map<String, String> paramMap)
  {
    label524: label543: 
    while (true)
    {
      String str;
      try
      {
        AppMethodBeat.i(98502);
        if (paramMap != null)
        {
          try
          {
            str = (String)paramMap.get("realNumUp");
            int m;
            if (str != null)
            {
              m = Integer.valueOf(str).intValue();
              if ((m > 0) && (m <= 50))
                this.a = m;
            }
            str = (String)paramMap.get("realDelayUp");
            if (str != null)
            {
              m = Integer.valueOf(str).intValue();
              if ((m >= 10) && (m <= 600))
                this.b = m;
            }
            str = (String)paramMap.get("comNumDB");
            if (str != null)
            {
              m = Integer.valueOf(str).intValue();
              if ((m > 0) && (m <= 50))
                this.c = m;
            }
            str = (String)paramMap.get("comDelayDB");
            if (str != null)
            {
              m = Integer.valueOf(str).intValue();
              if ((m >= 30) && (m <= 600))
                this.d = m;
            }
            str = (String)paramMap.get("comNumUp");
            if (str != null)
            {
              m = Integer.valueOf(str).intValue();
              if ((m > 0) && (m <= 100))
                this.e = m;
            }
            str = (String)paramMap.get("heartOnOff");
            if (str != null)
            {
              if (str.toLowerCase().equals("y"))
                this.g = true;
            }
            else
            {
              str = (String)paramMap.get("tidyEF");
              if (str != null)
              {
                if (!str.toLowerCase().equals("y"))
                  break label464;
                this.k = true;
              }
              str = (String)paramMap.get("lauEveSim");
              if (str != null)
              {
                if (!str.toLowerCase().equals("y"))
                  break label484;
                this.l = true;
              }
              str = (String)paramMap.get("comPollUp");
              if (str != null)
              {
                if (!str.toLowerCase().equals("y"))
                  break label504;
                this.f = true;
              }
              str = (String)paramMap.get("accessTestOnOff");
              if (str != null)
              {
                if (!str.toLowerCase().equals("y"))
                  break label524;
                ag.b = true;
              }
              str = (String)paramMap.get("upAc");
              if (str != null)
              {
                if (!str.toLowerCase().equals("y"))
                  break label543;
                this.j = true;
              }
              paramMap.get("appendXMeths");
              AppMethodBeat.o(98502);
              return;
            }
            if (!str.toLowerCase().equals("n"))
              continue;
            this.g = false;
            continue;
          }
          catch (Exception paramMap)
          {
            ag.a(paramMap);
          }
        }
        else
        {
          AppMethodBeat.o(98502);
          continue;
        }
      }
      finally
      {
      }
      label464: if (str.toLowerCase().equals("n"))
      {
        this.k = false;
        continue;
        label484: if (str.toLowerCase().equals("n"))
        {
          this.l = false;
          continue;
          label504: if (str.toLowerCase().equals("n"))
          {
            this.f = false;
            continue;
            if (str.toLowerCase().equals("n"))
            {
              ag.b = false;
              continue;
              if (str.toLowerCase().equals("n"))
                this.j = false;
            }
          }
        }
      }
    }
  }

  public final void a(Set<String> paramSet)
  {
    try
    {
      this.h = paramSet;
      return;
    }
    finally
    {
      paramSet = finally;
    }
    throw paramSet;
  }

  public final boolean a(String paramString)
  {
    try
    {
      AppMethodBeat.i(98503);
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (this.h != null)
      {
        bool2 = bool1;
        if (this.h.size() > 0)
          bool2 = this.h.contains(paramString);
      }
      AppMethodBeat.o(98503);
      return bool2;
    }
    finally
    {
    }
    throw paramString;
  }

  public final int b()
  {
    try
    {
      int m = this.b;
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(Set<String> paramSet)
  {
    try
    {
      AppMethodBeat.i(98504);
      Object localObject;
      if (this.i == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        this.i = ((Map)localObject);
      }
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        localObject = ((String)paramSet.next()).split(",");
        int m = localObject.length;
        if (m == 3)
          try
          {
            float f1 = Float.valueOf(localObject[1]).floatValue() / Float.valueOf(localObject[2]).floatValue();
            this.i.put(localObject[0].toLowerCase(), Float.valueOf(f1));
          }
          catch (Exception localException)
          {
          }
      }
      AppMethodBeat.o(98504);
      return;
    }
    finally
    {
    }
    throw paramSet;
  }

  public final boolean b(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(98505);
        if ((this.i == null) || (this.i.get(paramString) == null))
        {
          AppMethodBeat.o(98505);
          bool = true;
          return bool;
        }
        int m = (int)(((Float)this.i.get(paramString.toLowerCase())).floatValue() * 1000.0F);
        paramString = new java/util/Random;
        paramString.<init>();
        if (paramString.nextInt(1000) + 1 > m)
        {
          bool = false;
          AppMethodBeat.o(98505);
          continue;
        }
      }
      finally
      {
      }
      boolean bool = true;
    }
  }

  public final int c()
  {
    try
    {
      int m = this.c;
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int d()
  {
    try
    {
      int m = this.d;
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int e()
  {
    try
    {
      int m = this.e;
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean f()
  {
    return this.g;
  }

  public final boolean g()
  {
    return this.f;
  }

  public final boolean h()
  {
    return this.k;
  }

  public final boolean i()
  {
    return this.l;
  }

  public final boolean j()
  {
    return this.j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.as
 * JD-Core Version:    0.6.2
 */