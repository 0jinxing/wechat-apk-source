package com.tencent.mm.aa;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public final class i extends JSONObject
  implements c
{
  private final c eIE;

  public i()
  {
    AppMethodBeat.i(117631);
    this.eIE = h.QC();
    AppMethodBeat.o(117631);
  }

  public i(c paramc)
  {
    AppMethodBeat.i(117632);
    Assert.assertNotNull(paramc);
    this.eIE = paramc;
    AppMethodBeat.o(117632);
  }

  public i(String paramString)
  {
    AppMethodBeat.i(117634);
    this.eIE = h.lx(paramString);
    AppMethodBeat.o(117634);
  }

  public i(Map paramMap)
  {
    AppMethodBeat.i(117633);
    this.eIE = h.j(paramMap);
    AppMethodBeat.o(117633);
  }

  private i d(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117637);
    this.eIE.c(lr(paramString), paramDouble);
    AppMethodBeat.o(117637);
    return this;
  }

  private i h(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117641);
    this.eIE.f(paramString, paramObject);
    AppMethodBeat.o(117641);
    return this;
  }

  private i l(String paramString, long paramLong)
  {
    AppMethodBeat.i(117639);
    this.eIE.k(lr(paramString), paramLong);
    AppMethodBeat.o(117639);
    return this;
  }

  private f lA(String paramString)
  {
    AppMethodBeat.i(117664);
    paramString = this.eIE.lt(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117664);
    }
    while (true)
    {
      return paramString;
      paramString = new f(paramString);
      AppMethodBeat.o(117664);
    }
  }

  private i lC(String paramString)
  {
    AppMethodBeat.i(117666);
    paramString = this.eIE.lv(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117666);
    }
    while (true)
    {
      return paramString;
      paramString = new i(paramString);
      AppMethodBeat.o(117666);
    }
  }

  private f lz(String paramString)
  {
    AppMethodBeat.i(117663);
    paramString = this.eIE.ls(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117663);
    }
    while (true)
    {
      return paramString;
      paramString = new f(paramString);
      AppMethodBeat.o(117663);
    }
  }

  private i t(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117636);
    this.eIE.s(paramString, paramBoolean);
    AppMethodBeat.o(117636);
    return this;
  }

  public final i K(String paramString, int paramInt)
  {
    AppMethodBeat.i(117638);
    this.eIE.J(lr(paramString), paramInt);
    AppMethodBeat.o(117638);
    return this;
  }

  public final i g(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117640);
    while ((paramObject instanceof i))
      paramObject = ((i)paramObject).eIE;
    this.eIE.e(paramString, paramObject);
    AppMethodBeat.o(117640);
    return this;
  }

  public final Object get(String paramString)
  {
    AppMethodBeat.i(117646);
    paramString = this.eIE.get(paramString);
    AppMethodBeat.o(117646);
    return paramString;
  }

  public final boolean getBoolean(String paramString)
  {
    AppMethodBeat.i(117648);
    boolean bool = this.eIE.getBoolean(paramString);
    AppMethodBeat.o(117648);
    return bool;
  }

  public final double getDouble(String paramString)
  {
    AppMethodBeat.i(117651);
    double d = this.eIE.getDouble(paramString);
    AppMethodBeat.o(117651);
    return d;
  }

  public final int getInt(String paramString)
  {
    AppMethodBeat.i(117654);
    int i = this.eIE.getInt(paramString);
    AppMethodBeat.o(117654);
    return i;
  }

  public final long getLong(String paramString)
  {
    AppMethodBeat.i(117657);
    long l = this.eIE.getLong(paramString);
    AppMethodBeat.o(117657);
    return l;
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(117660);
    paramString = this.eIE.getString(paramString);
    AppMethodBeat.o(117660);
    return paramString;
  }

  public final boolean has(String paramString)
  {
    AppMethodBeat.i(117645);
    boolean bool = this.eIE.has(paramString);
    AppMethodBeat.o(117645);
    return bool;
  }

  public final boolean isNull(String paramString)
  {
    AppMethodBeat.i(117644);
    boolean bool = this.eIE.isNull(paramString);
    AppMethodBeat.o(117644);
    return bool;
  }

  public final Iterator<String> keys()
  {
    AppMethodBeat.i(117667);
    Iterator localIterator = this.eIE.keys();
    AppMethodBeat.o(117667);
    return localIterator;
  }

  public final i lB(String paramString)
  {
    AppMethodBeat.i(117665);
    paramString = this.eIE.lu(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117665);
    }
    while (true)
    {
      return paramString;
      paramString = new i(paramString);
      AppMethodBeat.o(117665);
    }
  }

  public final int length()
  {
    AppMethodBeat.i(117635);
    int i = this.eIE.length();
    AppMethodBeat.o(117635);
    return i;
  }

  public final String lr(String paramString)
  {
    AppMethodBeat.i(117642);
    paramString = this.eIE.lr(paramString);
    AppMethodBeat.o(117642);
    return paramString;
  }

  public final Object opt(String paramString)
  {
    AppMethodBeat.i(117647);
    paramString = this.eIE.opt(paramString);
    AppMethodBeat.o(117647);
    return paramString;
  }

  public final boolean optBoolean(String paramString)
  {
    AppMethodBeat.i(117649);
    boolean bool = this.eIE.optBoolean(paramString, false);
    AppMethodBeat.o(117649);
    return bool;
  }

  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117650);
    paramBoolean = this.eIE.optBoolean(paramString, paramBoolean);
    AppMethodBeat.o(117650);
    return paramBoolean;
  }

  public final double optDouble(String paramString)
  {
    AppMethodBeat.i(117652);
    double d = this.eIE.optDouble(paramString, (0.0D / 0.0D));
    AppMethodBeat.o(117652);
    return d;
  }

  public final double optDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117653);
    paramDouble = this.eIE.optDouble(paramString, paramDouble);
    AppMethodBeat.o(117653);
    return paramDouble;
  }

  public final int optInt(String paramString)
  {
    AppMethodBeat.i(117655);
    int i = this.eIE.optInt(paramString, 0);
    AppMethodBeat.o(117655);
    return i;
  }

  public final int optInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(117656);
    paramInt = this.eIE.optInt(paramString, paramInt);
    AppMethodBeat.o(117656);
    return paramInt;
  }

  public final long optLong(String paramString)
  {
    AppMethodBeat.i(117658);
    long l = this.eIE.optLong(paramString, 0L);
    AppMethodBeat.o(117658);
    return l;
  }

  public final long optLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(117659);
    paramLong = this.eIE.optLong(paramString, paramLong);
    AppMethodBeat.o(117659);
    return paramLong;
  }

  public final String optString(String paramString)
  {
    AppMethodBeat.i(117661);
    paramString = this.eIE.optString(paramString, "");
    AppMethodBeat.o(117661);
    return paramString;
  }

  public final String optString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(117662);
    paramString1 = this.eIE.optString(paramString1);
    AppMethodBeat.o(117662);
    return paramString1;
  }

  public final Object remove(String paramString)
  {
    AppMethodBeat.i(117643);
    paramString = this.eIE.remove(paramString);
    AppMethodBeat.o(117643);
    return paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(117668);
    String str = this.eIE.toString();
    AppMethodBeat.o(117668);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.i
 * JD-Core Version:    0.6.2
 */