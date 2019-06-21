package com.tencent.mm.aa;

import com.eclipsesource.a.e;
import com.eclipsesource.a.e.a;
import com.eclipsesource.a.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
  implements c
{
  private e eIG;

  public l()
  {
    AppMethodBeat.i(117733);
    this.eIG = new e();
    AppMethodBeat.o(117733);
  }

  l(e parame)
  {
    AppMethodBeat.i(117734);
    e locale = parame;
    if (parame == null)
      locale = new e();
    this.eIG = locale;
    AppMethodBeat.o(117734);
  }

  public l(String paramString)
  {
    AppMethodBeat.i(117736);
    this.eIG = com.eclipsesource.a.a.ah(paramString).oS();
    AppMethodBeat.o(117736);
  }

  public l(Map paramMap)
  {
    AppMethodBeat.i(117735);
    this.eIG = j.k(paramMap);
    AppMethodBeat.o(117735);
  }

  public final c J(String paramString, int paramInt)
  {
    AppMethodBeat.i(117740);
    this.eIG.a(paramString, com.eclipsesource.a.a.dr(paramInt));
    AppMethodBeat.o(117740);
    return this;
  }

  public final c c(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117739);
    this.eIG.a(paramString, com.eclipsesource.a.a.m(paramDouble));
    AppMethodBeat.o(117739);
    return this;
  }

  public final c e(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117742);
    j.a(this.eIG, paramString, paramObject);
    AppMethodBeat.o(117742);
    return this;
  }

  public final c f(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117743);
    j.a(this.eIG, paramString, paramObject);
    AppMethodBeat.o(117743);
    return this;
  }

  public final Object get(String paramString)
  {
    AppMethodBeat.i(117748);
    paramString = opt(paramString);
    AppMethodBeat.o(117748);
    return paramString;
  }

  public final boolean getBoolean(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(117750);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117750);
      throw paramString;
    }
    if (localh.isBoolean())
    {
      bool = localh.oO();
      AppMethodBeat.o(117750);
    }
    while (true)
    {
      return bool;
      if (!localh.isString())
        break;
      String str = localh.toString();
      if ("true".equals(str))
      {
        AppMethodBeat.o(117750);
      }
      else
      {
        if (!"false".equals(str))
          break;
        AppMethodBeat.o(117750);
        bool = false;
      }
    }
    paramString = new g(String.format("getBoolean by key : %s error, value : %s", new Object[] { paramString, localh }));
    AppMethodBeat.o(117750);
    throw paramString;
  }

  public final double getDouble(String paramString)
  {
    AppMethodBeat.i(117752);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117752);
      throw paramString;
    }
    try
    {
      double d;
      if (localh.isNumber())
      {
        d = localh.oR();
        AppMethodBeat.o(117752);
      }
      while (true)
      {
        return d;
        if (!localh.isString())
          break;
        d = Double.parseDouble(localh.toString());
        AppMethodBeat.o(117752);
      }
    }
    catch (Exception localException)
    {
      paramString = new g(String.format("getDouble by key : %s error, value : %s", new Object[] { paramString, localh }));
      AppMethodBeat.o(117752);
    }
    throw paramString;
  }

  public final int getInt(String paramString)
  {
    AppMethodBeat.i(117754);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117754);
      throw paramString;
    }
    try
    {
      boolean bool = localh.isNumber();
      if (bool);
      while (true)
      {
        try
        {
          i = localh.oP();
          AppMethodBeat.o(117754);
          return i;
        }
        catch (Exception localException1)
        {
          d = localh.oR();
          i = (int)d;
          AppMethodBeat.o(117754);
          continue;
        }
        if (!localh.isString())
          break;
        double d = Double.parseDouble(localh.toString());
        int i = (int)d;
        AppMethodBeat.o(117754);
      }
    }
    catch (Exception localException2)
    {
      paramString = new g(String.format("getInt by key : %s error, value : %s", new Object[] { paramString, localh }));
      AppMethodBeat.o(117754);
    }
    throw paramString;
  }

  public final long getLong(String paramString)
  {
    AppMethodBeat.i(117756);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117756);
      throw paramString;
    }
    try
    {
      boolean bool = localh.isNumber();
      if (bool);
      while (true)
      {
        try
        {
          l = localh.oQ();
          AppMethodBeat.o(117756);
          return l;
        }
        catch (Exception localException1)
        {
          d = localh.oR();
          l = ()d;
          AppMethodBeat.o(117756);
          continue;
        }
        if (!localh.isString())
          break;
        double d = Double.parseDouble(localh.toString());
        long l = ()d;
        AppMethodBeat.o(117756);
      }
    }
    catch (Exception localException2)
    {
      paramString = new g(String.format("getLong by key : %s error, value : %s", new Object[] { paramString, localh }));
      AppMethodBeat.o(117756);
    }
    throw paramString;
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(117758);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117758);
      throw paramString;
    }
    if (localh.isString())
    {
      paramString = localh.pq();
      AppMethodBeat.o(117758);
    }
    while (true)
    {
      return paramString;
      paramString = localh.toString();
      AppMethodBeat.o(117758);
    }
  }

  public final boolean has(String paramString)
  {
    AppMethodBeat.i(117747);
    boolean bool;
    if (this.eIG.ak(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(117747);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117747);
    }
  }

  public final boolean isNull(String paramString)
  {
    AppMethodBeat.i(117746);
    boolean bool;
    if (this.eIG.ak(paramString) == null)
    {
      bool = true;
      AppMethodBeat.o(117746);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117746);
    }
  }

  public final c k(String paramString, long paramLong)
  {
    AppMethodBeat.i(117741);
    this.eIG.a(paramString, com.eclipsesource.a.a.t(paramLong));
    AppMethodBeat.o(117741);
    return this;
  }

  public final Iterator<String> keys()
  {
    AppMethodBeat.i(117765);
    Iterator localIterator = Collections.unmodifiableList(this.eIG.aLq).iterator();
    AppMethodBeat.o(117765);
    return localIterator;
  }

  public final int length()
  {
    AppMethodBeat.i(117737);
    int i = this.eIG.aLq.size();
    AppMethodBeat.o(117737);
    return i;
  }

  public final String lr(String paramString)
  {
    AppMethodBeat.i(117744);
    if (paramString == null)
    {
      paramString = new g("Names must be non-null");
      AppMethodBeat.o(117744);
      throw paramString;
    }
    AppMethodBeat.o(117744);
    return paramString;
  }

  public final a ls(String paramString)
  {
    AppMethodBeat.i(117761);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117761);
      throw paramString;
    }
    paramString = new k(localh.oN());
    AppMethodBeat.o(117761);
    return paramString;
  }

  public final a lt(String paramString)
  {
    AppMethodBeat.i(117762);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117762);
    }
    while (true)
    {
      return paramString;
      paramString = new k(paramString.oN());
      AppMethodBeat.o(117762);
    }
  }

  public final c lu(String paramString)
  {
    AppMethodBeat.i(117763);
    h localh = this.eIG.ak(paramString);
    if (localh == null)
    {
      paramString = new g(String.format("key %s do not exist.", new Object[] { paramString }));
      AppMethodBeat.o(117763);
      throw paramString;
    }
    paramString = new l(localh.oS());
    AppMethodBeat.o(117763);
    return paramString;
  }

  public final c lv(String paramString)
  {
    AppMethodBeat.i(117764);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117764);
    }
    while (true)
    {
      return paramString;
      paramString = new l(paramString.oS());
      AppMethodBeat.o(117764);
    }
  }

  public final Object opt(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(117749);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(117749);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (paramString.isNumber())
      {
        paramString = paramString.toString();
        AppMethodBeat.o(117749);
      }
      else if (paramString.isBoolean())
      {
        paramString = Boolean.valueOf(paramString.oO());
        AppMethodBeat.o(117749);
      }
      else if (paramString.isArray())
      {
        paramString = new k(paramString.oN());
        AppMethodBeat.o(117749);
      }
      else if (paramString.isObject())
      {
        paramString = new l(paramString.oS());
        AppMethodBeat.o(117749);
      }
      else if (paramString.isString())
      {
        paramString = paramString.pq();
        AppMethodBeat.o(117749);
      }
      else
      {
        AppMethodBeat.o(117749);
        paramString = localObject;
      }
    }
  }

  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117751);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
      AppMethodBeat.o(117751);
    while (true)
    {
      return paramBoolean;
      if (paramString.isBoolean())
      {
        paramBoolean = paramString.oO();
        AppMethodBeat.o(117751);
      }
      else if (paramString.isString())
      {
        paramString = paramString.toString();
        if ("true".equals(paramString))
        {
          paramBoolean = true;
          AppMethodBeat.o(117751);
        }
        else if ("false".equals(paramString))
        {
          paramBoolean = false;
          AppMethodBeat.o(117751);
        }
      }
      else
      {
        AppMethodBeat.o(117751);
      }
    }
  }

  public final double optDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117753);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
      AppMethodBeat.o(117753);
    while (true)
    {
      return paramDouble;
      try
      {
        double d;
        if (paramString.isNumber())
        {
          d = paramString.oR();
          paramDouble = d;
          AppMethodBeat.o(117753);
        }
        else if (paramString.isString())
        {
          d = Double.parseDouble(paramString.toString());
          paramDouble = d;
          AppMethodBeat.o(117753);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(117753);
      }
    }
  }

  public final int optInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(117755);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
      AppMethodBeat.o(117755);
    while (true)
    {
      return paramInt;
      try
      {
        boolean bool = paramString.isNumber();
        double d;
        if (bool)
        {
          try
          {
            int i = paramString.oP();
            paramInt = i;
            AppMethodBeat.o(117755);
          }
          catch (Exception localException)
          {
            d = paramString.oR();
            paramInt = (int)d;
            AppMethodBeat.o(117755);
          }
        }
        else if (paramString.isString())
        {
          d = Double.parseDouble(paramString.toString());
          paramInt = (int)d;
          AppMethodBeat.o(117755);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(117755);
      }
    }
  }

  public final long optLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(117757);
    paramString = this.eIG.ak(paramString);
    if (paramString == null)
      AppMethodBeat.o(117757);
    while (true)
    {
      return paramLong;
      try
      {
        boolean bool = paramString.isNumber();
        double d;
        if (bool)
        {
          try
          {
            long l = paramString.oQ();
            paramLong = l;
            AppMethodBeat.o(117757);
          }
          catch (Exception localException)
          {
            d = paramString.oR();
            paramLong = ()d;
            AppMethodBeat.o(117757);
          }
        }
        else if (paramString.isString())
        {
          d = Double.parseDouble(paramString.toString());
          paramLong = ()d;
          AppMethodBeat.o(117757);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(117757);
      }
    }
  }

  public final String optString(String paramString)
  {
    AppMethodBeat.i(117759);
    paramString = optString(paramString, null);
    AppMethodBeat.o(117759);
    return paramString;
  }

  public final String optString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(117760);
    paramString1 = this.eIG.ak(paramString1);
    if (paramString1 == null)
    {
      paramString1 = null;
      AppMethodBeat.o(117760);
    }
    while (true)
    {
      return paramString1;
      if (paramString1.isString())
      {
        paramString1 = paramString1.pq();
        AppMethodBeat.o(117760);
      }
      else
      {
        paramString1 = paramString1.toString();
        AppMethodBeat.o(117760);
      }
    }
  }

  public final Object remove(String paramString)
  {
    AppMethodBeat.i(117745);
    e locale = this.eIG;
    if (paramString == null)
    {
      paramString = new NullPointerException("name is null");
      AppMethodBeat.o(117745);
      throw paramString;
    }
    int i = locale.indexOf(paramString);
    if (i != -1)
    {
      locale.aLr.remove(i);
      locale.aLq.remove(i);
      locale.aCy.remove(i);
    }
    if (locale.isNumber())
    {
      paramString = locale.toString();
      AppMethodBeat.o(117745);
    }
    while (true)
    {
      return paramString;
      if (locale.isBoolean())
      {
        paramString = Boolean.valueOf(locale.oO());
        AppMethodBeat.o(117745);
      }
      else if (locale.isArray())
      {
        paramString = new k(locale.oN());
        AppMethodBeat.o(117745);
      }
      else if (locale.isObject())
      {
        paramString = new l(locale.oS());
        AppMethodBeat.o(117745);
      }
      else if (locale.isString())
      {
        paramString = locale.pq();
        AppMethodBeat.o(117745);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(117745);
      }
    }
  }

  public final c s(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117738);
    this.eIG.a(paramString, com.eclipsesource.a.a.aB(paramBoolean));
    AppMethodBeat.o(117738);
    return this;
  }

  public final String toString()
  {
    AppMethodBeat.i(117766);
    String str = this.eIG.toString();
    AppMethodBeat.o(117766);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.l
 * JD-Core Version:    0.6.2
 */