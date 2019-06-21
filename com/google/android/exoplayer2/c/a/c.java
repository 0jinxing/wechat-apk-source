package com.google.android.exoplayer2.c.a;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

final class c extends d
{
  long aOz = -9223372036854775807L;

  public c()
  {
    super(null);
  }

  private static Boolean b(l paraml)
  {
    boolean bool = true;
    AppMethodBeat.i(94870);
    if (paraml.readUnsignedByte() == 1);
    while (true)
    {
      AppMethodBeat.o(94870);
      return Boolean.valueOf(bool);
      bool = false;
    }
  }

  private static Object b(l paraml, int paramInt)
  {
    AppMethodBeat.i(94877);
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 9:
    default:
      paraml = null;
      AppMethodBeat.o(94877);
    case 0:
    case 1:
    case 2:
    case 3:
    case 8:
    case 10:
    case 11:
    }
    while (true)
    {
      return paraml;
      paraml = c(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = b(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = d(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = f(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = g(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = e(paraml);
      AppMethodBeat.o(94877);
      continue;
      paraml = h(paraml);
      AppMethodBeat.o(94877);
    }
  }

  private static Double c(l paraml)
  {
    AppMethodBeat.i(94871);
    double d = Double.longBitsToDouble(paraml.readLong());
    AppMethodBeat.o(94871);
    return Double.valueOf(d);
  }

  private static String d(l paraml)
  {
    AppMethodBeat.i(94872);
    int i = paraml.readUnsignedShort();
    int j = paraml.position;
    paraml.eM(i);
    paraml = new String(paraml.data, j, i);
    AppMethodBeat.o(94872);
    return paraml;
  }

  private static ArrayList<Object> e(l paraml)
  {
    AppMethodBeat.i(94873);
    int i = paraml.tI();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(b(paraml, paraml.readUnsignedByte()));
    AppMethodBeat.o(94873);
    return localArrayList;
  }

  private static HashMap<String, Object> f(l paraml)
  {
    AppMethodBeat.i(94874);
    HashMap localHashMap = new HashMap();
    while (true)
    {
      String str = d(paraml);
      int i = paraml.readUnsignedByte();
      if (i == 9)
        break;
      localHashMap.put(str, b(paraml, i));
    }
    AppMethodBeat.o(94874);
    return localHashMap;
  }

  private static HashMap<String, Object> g(l paraml)
  {
    AppMethodBeat.i(94875);
    int i = paraml.tI();
    HashMap localHashMap = new HashMap(i);
    for (int j = 0; j < i; j++)
      localHashMap.put(d(paraml), b(paraml, paraml.readUnsignedByte()));
    AppMethodBeat.o(94875);
    return localHashMap;
  }

  private static Date h(l paraml)
  {
    AppMethodBeat.i(94876);
    Date localDate = new Date(()c(paraml).doubleValue());
    paraml.eM(2);
    AppMethodBeat.o(94876);
    return localDate;
  }

  protected final void a(l paraml, long paramLong)
  {
    AppMethodBeat.i(94869);
    if (paraml.readUnsignedByte() != 2)
    {
      paraml = new o();
      AppMethodBeat.o(94869);
      throw paraml;
    }
    if (!"onMetaData".equals(d(paraml)))
      AppMethodBeat.o(94869);
    while (true)
    {
      return;
      if (paraml.readUnsignedByte() != 8)
      {
        AppMethodBeat.o(94869);
      }
      else
      {
        paraml = g(paraml);
        if (paraml.containsKey("duration"))
        {
          double d = ((Double)paraml.get("duration")).doubleValue();
          if (d > 0.0D)
            this.aOz = (()(d * 1000000.0D));
        }
        AppMethodBeat.o(94869);
      }
    }
  }

  protected final boolean a(l paraml)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a.c
 * JD-Core Version:    0.6.2
 */