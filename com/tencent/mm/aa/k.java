package com.tencent.mm.aa;

import com.eclipsesource.a.b;
import com.eclipsesource.a.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import junit.framework.Assert;

public final class k
  implements a
{
  private b eIF;

  public k()
  {
    AppMethodBeat.i(117694);
    this.eIF = new b();
    AppMethodBeat.o(117694);
  }

  k(b paramb)
  {
    AppMethodBeat.i(117696);
    Assert.assertNotNull(paramb);
    this.eIF = paramb;
    AppMethodBeat.o(117696);
  }

  public k(String paramString)
  {
    AppMethodBeat.i(117695);
    this.eIF = com.eclipsesource.a.a.ah(paramString).oN();
    if (this.eIF == null)
    {
      paramString = new g(String.format("JSONArray string(%s) parse error.", new Object[] { paramString }));
      AppMethodBeat.o(117695);
      throw paramString;
    }
    AppMethodBeat.o(117695);
  }

  public final a av(Object paramObject)
  {
    AppMethodBeat.i(117702);
    j.a(this.eIF, paramObject);
    AppMethodBeat.o(117702);
    return this;
  }

  public final a cb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117705);
    try
    {
      this.eIF.aX(paramInt1, paramInt2);
      AppMethodBeat.o(117705);
      return this;
    }
    catch (Exception localException)
    {
      g localg = new g(localException);
      AppMethodBeat.o(117705);
      throw localg;
    }
  }

  public final a cj(boolean paramBoolean)
  {
    AppMethodBeat.i(117698);
    this.eIF.aC(paramBoolean);
    AppMethodBeat.o(117698);
    return this;
  }

  public final a d(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(117704);
    try
    {
      this.eIF.b(paramInt, paramDouble);
      AppMethodBeat.o(117704);
      return this;
    }
    catch (Exception localException)
    {
      g localg = new g(localException);
      AppMethodBeat.o(117704);
      throw localg;
    }
  }

  public final a d(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(117707);
    while (true)
    {
      b localb;
      try
      {
        localb = this.eIF;
        if ((paramObject instanceof c))
        {
          localb.a(paramInt, j.a((c)paramObject));
          AppMethodBeat.o(117707);
          return this;
        }
        if ((paramObject instanceof a))
        {
          localb.a(paramInt, j.a((a)paramObject));
          continue;
        }
      }
      catch (Exception paramObject)
      {
        paramObject = new g(paramObject);
        AppMethodBeat.o(117707);
        throw paramObject;
      }
      if ((paramObject instanceof Integer))
      {
        localb.aX(paramInt, ((Integer)paramObject).intValue());
      }
      else if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        localb.aCy.set(paramInt, com.eclipsesource.a.a.ag(paramObject));
      }
      else if ((paramObject instanceof Boolean))
      {
        localb.p(paramInt, ((Boolean)paramObject).booleanValue());
      }
      else if ((paramObject instanceof Long))
      {
        localb.f(paramInt, ((Long)paramObject).longValue());
      }
      else if ((paramObject instanceof Float))
      {
        float f = ((Float)paramObject).floatValue();
        localb.aCy.set(paramInt, com.eclipsesource.a.a.T(f));
      }
      else if ((paramObject instanceof Integer))
      {
        localb.aX(paramInt, ((Integer)paramObject).intValue());
      }
      else if ((paramObject instanceof Double))
      {
        localb.b(paramInt, ((Double)paramObject).doubleValue());
      }
      else if ((paramObject instanceof h))
      {
        localb.a(paramInt, (h)paramObject);
      }
    }
  }

  public final a fb(long paramLong)
  {
    AppMethodBeat.i(117701);
    this.eIF.u(paramLong);
    AppMethodBeat.o(117701);
    return this;
  }

  public final Object get(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(117709);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117709);
      throw ((Throwable)localObject);
    }
    h localh = this.eIF.dt(paramInt);
    if (localh == null)
      AppMethodBeat.o(117709);
    while (true)
    {
      return localObject;
      if (localh.isNumber())
      {
        localObject = localh.toString();
        AppMethodBeat.o(117709);
      }
      else if (localh.isBoolean())
      {
        localObject = Boolean.valueOf(localh.oO());
        AppMethodBeat.o(117709);
      }
      else if (localh.isArray())
      {
        localObject = new k(localh.oN());
        AppMethodBeat.o(117709);
      }
      else if (localh.isObject())
      {
        localObject = new l(localh.oS());
        AppMethodBeat.o(117709);
      }
      else if (localh.isString())
      {
        localObject = localh.pq();
        AppMethodBeat.o(117709);
      }
      else
      {
        AppMethodBeat.o(117709);
      }
    }
  }

  public final boolean getBoolean(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(117712);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117712);
      throw ((Throwable)localObject);
    }
    h localh = this.eIF.dt(paramInt);
    if (localh == null)
    {
      localObject = new g(String.format("getBoolean(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117712);
      throw ((Throwable)localObject);
    }
    if (localh.isBoolean())
    {
      bool = localh.oO();
      AppMethodBeat.o(117712);
    }
    while (true)
    {
      return bool;
      if (!localh.isString())
        break;
      localObject = localh.pq();
      if ("true".equals(localObject))
      {
        AppMethodBeat.o(117712);
      }
      else
      {
        if (!"false".equals(localObject))
          break;
        AppMethodBeat.o(117712);
        bool = false;
      }
    }
    Object localObject = new g(String.format("getBoolean(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    AppMethodBeat.o(117712);
    throw ((Throwable)localObject);
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(117715);
    int i = length();
    g localg1;
    if ((paramInt < 0) || (paramInt >= i))
    {
      localg1 = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117715);
      throw localg1;
    }
    h localh = this.eIF.dt(paramInt);
    if (localh == null)
    {
      localg1 = new g(String.format("getDouble(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117715);
      throw localg1;
    }
    try
    {
      double d;
      if (localh.isNumber())
      {
        d = localh.oR();
        AppMethodBeat.o(117715);
      }
      while (true)
      {
        return d;
        if (!localh.isString())
          break;
        d = Double.parseDouble(localh.pq());
        AppMethodBeat.o(117715);
      }
    }
    catch (Exception localException)
    {
      g localg2 = new g(String.format("getDouble(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
      AppMethodBeat.o(117715);
      throw localg2;
    }
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(117718);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117718);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eIF.dt(paramInt);
    if (localObject == null)
    {
      localObject = new g(String.format("getInteger(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117718);
      throw ((Throwable)localObject);
    }
    try
    {
      boolean bool = ((h)localObject).isNumber();
      if (bool);
      while (true)
      {
        try
        {
          i = ((h)localObject).oP();
          paramInt = i;
          AppMethodBeat.o(117718);
          return paramInt;
        }
        catch (Exception localException1)
        {
          d = ((h)localObject).oR();
          paramInt = (int)d;
          AppMethodBeat.o(117718);
          continue;
        }
        if (!((h)localObject).isString())
          break;
        double d = Double.parseDouble(((h)localObject).pq());
        paramInt = (int)d;
        AppMethodBeat.o(117718);
      }
    }
    catch (Exception localException2)
    {
      localObject = new g(String.format("getInt(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localObject }));
      AppMethodBeat.o(117718);
    }
    throw ((Throwable)localObject);
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(117721);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117721);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eIF.dt(paramInt);
    if (localObject == null)
    {
      localObject = new g(String.format("getLong(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117721);
      throw ((Throwable)localObject);
    }
    try
    {
      boolean bool = ((h)localObject).isNumber();
      if (bool);
      while (true)
      {
        try
        {
          l = ((h)localObject).oQ();
          AppMethodBeat.o(117721);
          return l;
        }
        catch (Exception localException1)
        {
          d = ((h)localObject).oR();
          l = ()d;
          AppMethodBeat.o(117721);
          continue;
        }
        if (!((h)localObject).isString())
          break;
        double d = Double.parseDouble(((h)localObject).pq());
        long l = ()d;
        AppMethodBeat.o(117721);
      }
    }
    catch (Exception localException2)
    {
      localObject = new g(String.format("getLong(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localObject }));
      AppMethodBeat.o(117721);
    }
    throw ((Throwable)localObject);
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(117724);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117724);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eIF.dt(paramInt);
    if (localObject == null)
    {
      localObject = new g(String.format("getString(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117724);
      throw ((Throwable)localObject);
    }
    if (((h)localObject).isString())
    {
      localObject = ((h)localObject).pq();
      AppMethodBeat.o(117724);
    }
    while (true)
    {
      return localObject;
      localObject = ((h)localObject).toString();
      AppMethodBeat.o(117724);
    }
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(117708);
    boolean bool;
    if ((paramInt < 0) || (paramInt >= length()) || (this.eIF.dt(paramInt) == null))
    {
      bool = true;
      AppMethodBeat.o(117708);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117708);
    }
  }

  public final a jC(int paramInt)
  {
    AppMethodBeat.i(117700);
    this.eIF.ds(paramInt);
    AppMethodBeat.o(117700);
    return this;
  }

  public final a jD(int paramInt)
  {
    AppMethodBeat.i(117727);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117727);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eIF.dt(paramInt);
    if (localObject == null)
    {
      localObject = new g(String.format("getJSONArray(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117727);
      throw ((Throwable)localObject);
    }
    localObject = new k(((h)localObject).oN());
    AppMethodBeat.o(117727);
    return localObject;
  }

  public final a jE(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(117728);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117728);
    while (true)
    {
      return localObject;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
      {
        AppMethodBeat.o(117728);
      }
      else
      {
        localObject = new k(localh.oN());
        AppMethodBeat.o(117728);
      }
    }
  }

  public final c jF(int paramInt)
  {
    AppMethodBeat.i(117729);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = new g(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
      AppMethodBeat.o(117729);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eIF.dt(paramInt);
    if (localObject == null)
    {
      localObject = new g(String.format("getJSONObject(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
      AppMethodBeat.o(117729);
      throw ((Throwable)localObject);
    }
    localObject = new l(((h)localObject).oS());
    AppMethodBeat.o(117729);
    return localObject;
  }

  public final c jG(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(117730);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117730);
    while (true)
    {
      return localObject;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
      {
        AppMethodBeat.o(117730);
      }
      else
      {
        localObject = new l(localh.oS());
        AppMethodBeat.o(117730);
      }
    }
  }

  public final int length()
  {
    AppMethodBeat.i(117697);
    int i = this.eIF.aCy.size();
    AppMethodBeat.o(117697);
    return i;
  }

  public final a o(double paramDouble)
  {
    AppMethodBeat.i(117699);
    this.eIF.n(paramDouble);
    AppMethodBeat.o(117699);
    return this;
  }

  public final Object opt(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(117710);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117710);
    while (true)
    {
      return localObject;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
      {
        AppMethodBeat.o(117710);
      }
      else if (localh.isNumber())
      {
        localObject = localh.toString();
        AppMethodBeat.o(117710);
      }
      else if (localh.isBoolean())
      {
        localObject = Boolean.valueOf(localh.oO());
        AppMethodBeat.o(117710);
      }
      else if (localh.isArray())
      {
        localObject = new k(localh.oN());
        AppMethodBeat.o(117710);
      }
      else if (localh.isObject())
      {
        localObject = new l(localh.oS());
        AppMethodBeat.o(117710);
      }
      else if (localh.isString())
      {
        localObject = localh.pq();
        AppMethodBeat.o(117710);
      }
      else
      {
        AppMethodBeat.o(117710);
      }
    }
  }

  public final boolean optBoolean(int paramInt)
  {
    AppMethodBeat.i(117713);
    boolean bool = optBoolean(paramInt, false);
    AppMethodBeat.o(117713);
    return bool;
  }

  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117714);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117714);
    while (true)
    {
      return paramBoolean;
      Object localObject = this.eIF.dt(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(117714);
      }
      else if (((h)localObject).isBoolean())
      {
        paramBoolean = ((h)localObject).oO();
        AppMethodBeat.o(117714);
      }
      else if (((h)localObject).isString())
      {
        localObject = ((h)localObject).pq();
        if ("true".equals(localObject))
        {
          paramBoolean = true;
          AppMethodBeat.o(117714);
        }
        else if ("false".equals(localObject))
        {
          paramBoolean = false;
          AppMethodBeat.o(117714);
        }
      }
      else
      {
        AppMethodBeat.o(117714);
      }
    }
  }

  public final double optDouble(int paramInt)
  {
    AppMethodBeat.i(117716);
    double d = optDouble(paramInt, 0.0D);
    AppMethodBeat.o(117716);
    return d;
  }

  public final double optDouble(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(117717);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117717);
    while (true)
    {
      return paramDouble;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
        AppMethodBeat.o(117717);
      else
        try
        {
          double d;
          if (localh.isNumber())
          {
            d = localh.oR();
            paramDouble = d;
            AppMethodBeat.o(117717);
          }
          else if (localh.isString())
          {
            d = Double.parseDouble(localh.pq());
            paramDouble = d;
            AppMethodBeat.o(117717);
          }
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(117717);
        }
    }
  }

  public final int optInt(int paramInt)
  {
    AppMethodBeat.i(117719);
    paramInt = optInt(paramInt, 0);
    AppMethodBeat.o(117719);
    return paramInt;
  }

  public final int optInt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117720);
    int i = length();
    if ((paramInt1 < 0) || (paramInt1 >= i))
      AppMethodBeat.o(117720);
    while (true)
    {
      return paramInt2;
      h localh = this.eIF.dt(paramInt1);
      if (localh == null)
        AppMethodBeat.o(117720);
      else
        try
        {
          boolean bool = localh.isNumber();
          double d;
          if (bool)
          {
            try
            {
              paramInt1 = localh.oP();
              paramInt2 = paramInt1;
              AppMethodBeat.o(117720);
            }
            catch (Exception localException2)
            {
              d = localh.oR();
              paramInt2 = (int)d;
              AppMethodBeat.o(117720);
            }
          }
          else if (localh.isString())
          {
            d = Double.parseDouble(localh.pq());
            paramInt2 = (int)d;
            AppMethodBeat.o(117720);
          }
        }
        catch (Exception localException1)
        {
          AppMethodBeat.o(117720);
        }
    }
  }

  public final long optLong(int paramInt)
  {
    AppMethodBeat.i(117722);
    long l = optLong(paramInt, 0L);
    AppMethodBeat.o(117722);
    return l;
  }

  public final long optLong(int paramInt, long paramLong)
  {
    AppMethodBeat.i(117723);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117723);
    while (true)
    {
      return paramLong;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
        AppMethodBeat.o(117723);
      else
        try
        {
          boolean bool = localh.isNumber();
          double d;
          if (bool)
          {
            try
            {
              long l = localh.oQ();
              paramLong = l;
              AppMethodBeat.o(117723);
            }
            catch (Exception localException1)
            {
              d = localh.oR();
              paramLong = ()d;
              AppMethodBeat.o(117723);
            }
          }
          else if (localh.isString())
          {
            d = Double.parseDouble(localh.pq());
            paramLong = ()d;
            AppMethodBeat.o(117723);
          }
        }
        catch (Exception localException2)
        {
          AppMethodBeat.o(117723);
        }
    }
  }

  public final String optString(int paramInt)
  {
    AppMethodBeat.i(117725);
    String str = optString(paramInt, null);
    AppMethodBeat.o(117725);
    return str;
  }

  public final String optString(int paramInt, String paramString)
  {
    AppMethodBeat.i(117726);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117726);
    while (true)
    {
      return paramString;
      h localh = this.eIF.dt(paramInt);
      if (localh == null)
      {
        AppMethodBeat.o(117726);
      }
      else if (localh.isString())
      {
        paramString = localh.pq();
        AppMethodBeat.o(117726);
      }
      else
      {
        paramString = localh.toString();
        AppMethodBeat.o(117726);
      }
    }
  }

  public final a q(int paramInt, long paramLong)
  {
    AppMethodBeat.i(117706);
    try
    {
      this.eIF.f(paramInt, paramLong);
      AppMethodBeat.o(117706);
      return this;
    }
    catch (Exception localException)
    {
      g localg = new g(localException);
      AppMethodBeat.o(117706);
      throw localg;
    }
  }

  public final Object remove(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(117711);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
      AppMethodBeat.o(117711);
    while (true)
    {
      return localObject;
      b localb = this.eIF;
      localb.aCy.remove(paramInt);
      if (localb.isNumber())
      {
        localObject = localb.toString();
        AppMethodBeat.o(117711);
      }
      else if (localb.isBoolean())
      {
        localObject = Boolean.valueOf(localb.oO());
        AppMethodBeat.o(117711);
      }
      else if (localb.isArray())
      {
        localObject = new k(localb.oN());
        AppMethodBeat.o(117711);
      }
      else if (localb.isObject())
      {
        localObject = new l(localb.oS());
        AppMethodBeat.o(117711);
      }
      else if (localb.isString())
      {
        localObject = localb.pq();
        AppMethodBeat.o(117711);
      }
      else
      {
        AppMethodBeat.o(117711);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(117731);
    String str = this.eIF.toString();
    AppMethodBeat.o(117731);
    return str;
  }

  public final String toString(int paramInt)
  {
    AppMethodBeat.i(117732);
    try
    {
      String str = this.eIF.a(com.eclipsesource.a.k.du(paramInt));
      AppMethodBeat.o(117732);
      return str;
    }
    catch (Throwable localThrowable)
    {
      g localg = new g(localThrowable);
      AppMethodBeat.o(117732);
      throw localg;
    }
  }

  public final a z(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117703);
    try
    {
      this.eIF.p(paramInt, paramBoolean);
      AppMethodBeat.o(117703);
      return this;
    }
    catch (Exception localException)
    {
      g localg = new g(localException);
      AppMethodBeat.o(117703);
      throw localg;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.k
 * JD-Core Version:    0.6.2
 */