package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class fg
  implements Cloneable
{
  private static final fi<Integer> d;
  private static final fi<Number> e;
  int a;
  Class<?> b;
  fe c = null;
  private fi f;

  static
  {
    AppMethodBeat.i(98898);
    d = new fc();
    e = new ez();
    AppMethodBeat.o(98898);
  }

  private fg(int paramInt)
  {
    this.a = paramInt;
  }

  public static fg a(int paramInt, fi<Object> paramfi, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98891);
    fg localfg = new fg(paramInt);
    localfg.a(paramArrayOfObject);
    localfg.a(paramfi);
    AppMethodBeat.o(98891);
    return localfg;
  }

  public static fg a(int paramInt, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98890);
    paramArrayOfDouble = new fg.a(paramInt, paramArrayOfDouble);
    AppMethodBeat.o(98890);
    return paramArrayOfDouble;
  }

  public fg a()
  {
    AppMethodBeat.i(98894);
    try
    {
      fg localfg = (fg)super.clone();
      localfg.a = this.a;
      localfg.c = this.c.b();
      localfg.f = this.f;
      AppMethodBeat.o(98894);
      return localfg;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(98894);
      }
    }
  }

  public void a(fi paramfi)
  {
    AppMethodBeat.i(98895);
    this.f = paramfi;
    this.c.a(paramfi);
    AppMethodBeat.o(98895);
  }

  public void a(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98892);
    this.b = Double.TYPE;
    this.c = fe.a(paramArrayOfDouble);
    AppMethodBeat.o(98892);
  }

  public void a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98893);
    this.b = paramArrayOfObject[0].getClass();
    this.c = fe.a(paramArrayOfObject);
    AppMethodBeat.o(98893);
  }

  public int b()
  {
    return this.a;
  }

  public String toString()
  {
    AppMethodBeat.i(98896);
    String str = this.a + ": " + this.c.toString();
    AppMethodBeat.o(98896);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fg
 * JD-Core Version:    0.6.2
 */