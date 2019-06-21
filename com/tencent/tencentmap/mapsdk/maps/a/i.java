package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
{
  private StringBuilder a;
  private int b = 0;

  public i(StringBuilder paramStringBuilder, int paramInt)
  {
    this.a = paramStringBuilder;
    this.b = paramInt;
  }

  private void a(String paramString)
  {
    AppMethodBeat.i(99705);
    for (int i = 0; i < this.b; i++)
      this.a.append('\t');
    if (paramString != null)
      this.a.append(paramString).append(": ");
    AppMethodBeat.o(99705);
  }

  public final i a(byte paramByte, String paramString)
  {
    AppMethodBeat.i(99708);
    a(paramString);
    this.a.append(paramByte).append('\n');
    AppMethodBeat.o(99708);
    return this;
  }

  public final i a(byte paramByte, boolean paramBoolean)
  {
    AppMethodBeat.i(99709);
    this.a.append(paramByte);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99709);
    return this;
  }

  public final i a(char paramChar, String paramString)
  {
    AppMethodBeat.i(99710);
    a(paramString);
    this.a.append(paramChar).append('\n');
    AppMethodBeat.o(99710);
    return this;
  }

  public final i a(double paramDouble, String paramString)
  {
    AppMethodBeat.i(99719);
    a(paramString);
    this.a.append(paramDouble).append('\n');
    AppMethodBeat.o(99719);
    return this;
  }

  public final i a(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(99720);
    this.a.append(paramDouble);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99720);
    return this;
  }

  public final i a(float paramFloat, String paramString)
  {
    AppMethodBeat.i(99717);
    a(paramString);
    this.a.append(paramFloat).append('\n');
    AppMethodBeat.o(99717);
    return this;
  }

  public final i a(float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(99718);
    this.a.append(paramFloat);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99718);
    return this;
  }

  public final i a(int paramInt, String paramString)
  {
    AppMethodBeat.i(99713);
    a(paramString);
    this.a.append(paramInt).append('\n');
    AppMethodBeat.o(99713);
    return this;
  }

  public final i a(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99714);
    this.a.append(paramInt);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99714);
    return this;
  }

  public final i a(long paramLong, String paramString)
  {
    AppMethodBeat.i(99715);
    a(paramString);
    this.a.append(paramLong).append('\n');
    AppMethodBeat.o(99715);
    return this;
  }

  public final i a(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(99716);
    this.a.append(paramLong);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99716);
    return this;
  }

  public final i a(m paramm, String paramString)
  {
    AppMethodBeat.i(99743);
    a('{', paramString);
    if (paramm == null)
      this.a.append('\t').append("null");
    while (true)
    {
      a('}', null);
      AppMethodBeat.o(99743);
      return this;
      paramm.display(this.a, this.b + 1);
    }
  }

  public final i a(m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(99744);
    this.a.append("{");
    if (paramm == null)
      this.a.append('\t').append("null");
    while (true)
    {
      this.a.append("}");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99744);
      return this;
      paramm.displaySimple(this.a, this.b + 1);
    }
  }

  public final <T> i a(T paramT, String paramString)
  {
    AppMethodBeat.i(99741);
    if (paramT == null)
      this.a.append("null\n");
    while (true)
    {
      AppMethodBeat.o(99741);
      return this;
      if ((paramT instanceof Byte))
      {
        a(((Byte)paramT).byteValue(), paramString);
      }
      else if ((paramT instanceof Boolean))
      {
        a(((Boolean)paramT).booleanValue(), paramString);
      }
      else if ((paramT instanceof Short))
      {
        a(((Short)paramT).shortValue(), paramString);
      }
      else if ((paramT instanceof Integer))
      {
        a(((Integer)paramT).intValue(), paramString);
      }
      else if ((paramT instanceof Long))
      {
        a(((Long)paramT).longValue(), paramString);
      }
      else if ((paramT instanceof Float))
      {
        a(((Float)paramT).floatValue(), paramString);
      }
      else if ((paramT instanceof Double))
      {
        a(((Double)paramT).doubleValue(), paramString);
      }
      else if ((paramT instanceof String))
      {
        a((String)paramT, paramString);
      }
      else if ((paramT instanceof Map))
      {
        a((Map)paramT, paramString);
      }
      else if ((paramT instanceof List))
      {
        a((List)paramT, paramString);
      }
      else if ((paramT instanceof m))
      {
        a((m)paramT, paramString);
      }
      else if ((paramT instanceof byte[]))
      {
        a((byte[])paramT, paramString);
      }
      else if ((paramT instanceof boolean[]))
      {
        a((boolean[])paramT, paramString);
      }
      else if ((paramT instanceof short[]))
      {
        a((short[])paramT, paramString);
      }
      else if ((paramT instanceof int[]))
      {
        a((int[])paramT, paramString);
      }
      else if ((paramT instanceof long[]))
      {
        a((long[])paramT, paramString);
      }
      else if ((paramT instanceof float[]))
      {
        a((float[])paramT, paramString);
      }
      else if ((paramT instanceof double[]))
      {
        a((double[])paramT, paramString);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        a((Object[])paramT, paramString);
      }
    }
    paramT = new j("write object error: unsupport type.");
    AppMethodBeat.o(99741);
    throw paramT;
  }

  public final <T> i a(T paramT, boolean paramBoolean)
  {
    AppMethodBeat.i(99742);
    if (paramT == null)
      this.a.append("null\n");
    while (true)
    {
      AppMethodBeat.o(99742);
      return this;
      if ((paramT instanceof Byte))
      {
        a(((Byte)paramT).byteValue(), paramBoolean);
      }
      else if ((paramT instanceof Boolean))
      {
        a(((Boolean)paramT).booleanValue(), paramBoolean);
      }
      else if ((paramT instanceof Short))
      {
        a(((Short)paramT).shortValue(), paramBoolean);
      }
      else if ((paramT instanceof Integer))
      {
        a(((Integer)paramT).intValue(), paramBoolean);
      }
      else if ((paramT instanceof Long))
      {
        a(((Long)paramT).longValue(), paramBoolean);
      }
      else if ((paramT instanceof Float))
      {
        a(((Float)paramT).floatValue(), paramBoolean);
      }
      else if ((paramT instanceof Double))
      {
        a(((Double)paramT).doubleValue(), paramBoolean);
      }
      else if ((paramT instanceof String))
      {
        a((String)paramT, paramBoolean);
      }
      else if ((paramT instanceof Map))
      {
        a((Map)paramT, paramBoolean);
      }
      else if ((paramT instanceof List))
      {
        a((List)paramT, paramBoolean);
      }
      else if ((paramT instanceof m))
      {
        a((m)paramT, paramBoolean);
      }
      else if ((paramT instanceof byte[]))
      {
        a((byte[])paramT, paramBoolean);
      }
      else if ((paramT instanceof boolean[]))
      {
        a((boolean[])paramT, paramBoolean);
      }
      else if ((paramT instanceof short[]))
      {
        a((short[])paramT, paramBoolean);
      }
      else if ((paramT instanceof int[]))
      {
        a((int[])paramT, paramBoolean);
      }
      else if ((paramT instanceof long[]))
      {
        a((long[])paramT, paramBoolean);
      }
      else if ((paramT instanceof float[]))
      {
        a((float[])paramT, paramBoolean);
      }
      else if ((paramT instanceof double[]))
      {
        a((double[])paramT, paramBoolean);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        a((Object[])paramT, paramBoolean);
      }
    }
    paramT = new j("write object error: unsupport type.");
    AppMethodBeat.o(99742);
    throw paramT;
  }

  public final i a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99721);
    a(paramString2);
    if (paramString1 == null)
      this.a.append("null\n");
    while (true)
    {
      AppMethodBeat.o(99721);
      return this;
      this.a.append(paramString1).append('\n');
    }
  }

  public final i a(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(99722);
    if (paramString == null)
      this.a.append("null");
    while (true)
    {
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99722);
      return this;
      this.a.append(paramString);
    }
  }

  public final <T> i a(Collection<T> paramCollection, String paramString)
  {
    AppMethodBeat.i(99739);
    if (paramCollection == null)
    {
      a(paramString);
      this.a.append("null\t");
      AppMethodBeat.o(99739);
      paramCollection = this;
    }
    while (true)
    {
      return paramCollection;
      paramCollection = a(paramCollection.toArray(), paramString);
      AppMethodBeat.o(99739);
    }
  }

  public final <T> i a(Collection<T> paramCollection, boolean paramBoolean)
  {
    AppMethodBeat.i(99740);
    if (paramCollection == null)
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99740);
      paramCollection = this;
    }
    while (true)
    {
      return paramCollection;
      paramCollection = a(paramCollection.toArray(), paramBoolean);
      AppMethodBeat.o(99740);
    }
  }

  public final <K, V> i a(Map<K, V> paramMap, String paramString)
  {
    AppMethodBeat.i(99735);
    a(paramString);
    if (paramMap == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99735);
    }
    while (true)
    {
      return this;
      if (paramMap.isEmpty())
      {
        this.a.append(paramMap.size()).append(", {}\n");
        AppMethodBeat.o(99735);
      }
      else
      {
        this.a.append(paramMap.size()).append(", {\n");
        paramString = new i(this.a, this.b + 1);
        i locali = new i(this.a, this.b + 2);
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          paramMap = (Map.Entry)localIterator.next();
          paramString.a('(', null);
          locali.a(paramMap.getKey(), null);
          locali.a(paramMap.getValue(), null);
          paramString.a(')', null);
        }
        a('}', null);
        AppMethodBeat.o(99735);
      }
    }
  }

  public final <K, V> i a(Map<K, V> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(99736);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      this.a.append("{}");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99736);
    }
    while (true)
    {
      return this;
      this.a.append("{");
      i locali = new i(this.a, this.b + 2);
      paramMap = paramMap.entrySet().iterator();
      for (int i = 1; paramMap.hasNext(); i = 0)
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (i == 0)
          this.a.append(",");
        locali.a(localEntry.getKey(), true);
        locali.a(localEntry.getValue(), false);
      }
      this.a.append("}");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99736);
    }
  }

  public final i a(short paramShort, String paramString)
  {
    AppMethodBeat.i(99711);
    a(paramString);
    this.a.append(paramShort).append('\n');
    AppMethodBeat.o(99711);
    return this;
  }

  public final i a(short paramShort, boolean paramBoolean)
  {
    AppMethodBeat.i(99712);
    this.a.append(paramShort);
    if (paramBoolean)
      this.a.append("|");
    AppMethodBeat.o(99712);
    return this;
  }

  public final i a(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(99706);
    a(paramString);
    paramString = this.a;
    char c1;
    if (paramBoolean)
      c1 = 'T';
    for (char c2 = c1; ; c2 = c1)
    {
      paramString.append(c2).append('\n');
      AppMethodBeat.o(99706);
      return this;
      c1 = 'F';
    }
  }

  public final i a(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(99707);
    StringBuilder localStringBuilder = this.a;
    char c1;
    if (paramBoolean1)
      c1 = 'T';
    for (char c2 = c1; ; c2 = c1)
    {
      localStringBuilder.append(c2);
      if (paramBoolean2)
        this.a.append("|");
      AppMethodBeat.o(99707);
      return this;
      c1 = 'F';
    }
  }

  public final i a(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(99723);
    a(paramString);
    if (paramArrayOfByte == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99723);
    }
    while (true)
    {
      return this;
      if (paramArrayOfByte.length == 0)
      {
        this.a.append(paramArrayOfByte.length).append(", []\n");
        AppMethodBeat.o(99723);
      }
      else
      {
        this.a.append(paramArrayOfByte.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfByte.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfByte[j], null);
        a(']', null);
        AppMethodBeat.o(99723);
      }
    }
  }

  public final i a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(99724);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99724);
    }
    while (true)
    {
      return this;
      this.a.append(g.a(paramArrayOfByte));
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99724);
    }
  }

  public final i a(double[] paramArrayOfDouble, String paramString)
  {
    AppMethodBeat.i(99733);
    a(paramString);
    if (paramArrayOfDouble == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99733);
    }
    while (true)
    {
      return this;
      if (paramArrayOfDouble.length == 0)
      {
        this.a.append(paramArrayOfDouble.length).append(", []\n");
        AppMethodBeat.o(99733);
      }
      else
      {
        this.a.append(paramArrayOfDouble.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfDouble.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfDouble[j], null);
        a(']', null);
        AppMethodBeat.o(99733);
      }
    }
  }

  public final i a(double[] paramArrayOfDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(99734);
    if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99734);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfDouble.length; i++)
      {
        double d = paramArrayOfDouble[i];
        if (i != 0)
          this.a.append("|");
        locali.a(d, false);
      }
      this.a.append("[");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99734);
    }
  }

  public final i a(float[] paramArrayOfFloat, String paramString)
  {
    AppMethodBeat.i(99731);
    a(paramString);
    if (paramArrayOfFloat == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99731);
    }
    while (true)
    {
      return this;
      if (paramArrayOfFloat.length == 0)
      {
        this.a.append(paramArrayOfFloat.length).append(", []\n");
        AppMethodBeat.o(99731);
      }
      else
      {
        this.a.append(paramArrayOfFloat.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfFloat.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfFloat[j], null);
        a(']', null);
        AppMethodBeat.o(99731);
      }
    }
  }

  public final i a(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(99732);
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99732);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfFloat.length; i++)
      {
        float f = paramArrayOfFloat[i];
        if (i != 0)
          this.a.append("|");
        locali.a(f, false);
      }
      this.a.append("]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99732);
    }
  }

  public final i a(int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(99727);
    a(paramString);
    if (paramArrayOfInt == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99727);
    }
    while (true)
    {
      return this;
      if (paramArrayOfInt.length == 0)
      {
        this.a.append(paramArrayOfInt.length).append(", []\n");
        AppMethodBeat.o(99727);
      }
      else
      {
        this.a.append(paramArrayOfInt.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfInt.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfInt[j], null);
        a(']', null);
        AppMethodBeat.o(99727);
      }
    }
  }

  public final i a(int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(99728);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99728);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfInt.length; i++)
      {
        int j = paramArrayOfInt[i];
        if (i != 0)
          this.a.append("|");
        locali.a(j, false);
      }
      this.a.append("]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99728);
    }
  }

  public final i a(long[] paramArrayOfLong, String paramString)
  {
    AppMethodBeat.i(99729);
    a(paramString);
    if (paramArrayOfLong == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99729);
    }
    while (true)
    {
      return this;
      if (paramArrayOfLong.length == 0)
      {
        this.a.append(paramArrayOfLong.length).append(", []\n");
        AppMethodBeat.o(99729);
      }
      else
      {
        this.a.append(paramArrayOfLong.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfLong.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfLong[j], null);
        a(']', null);
        AppMethodBeat.o(99729);
      }
    }
  }

  public final i a(long[] paramArrayOfLong, boolean paramBoolean)
  {
    AppMethodBeat.i(99730);
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99730);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfLong.length; i++)
      {
        long l = paramArrayOfLong[i];
        if (i != 0)
          this.a.append("|");
        locali.a(l, false);
      }
      this.a.append("]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99730);
    }
  }

  public final <T> i a(T[] paramArrayOfT, String paramString)
  {
    AppMethodBeat.i(99737);
    a(paramString);
    if (paramArrayOfT == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99737);
    }
    while (true)
    {
      return this;
      if (paramArrayOfT.length == 0)
      {
        this.a.append(paramArrayOfT.length).append(", []\n");
        AppMethodBeat.o(99737);
      }
      else
      {
        this.a.append(paramArrayOfT.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfT.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfT[j], null);
        a(']', null);
        AppMethodBeat.o(99737);
      }
    }
  }

  public final <T> i a(T[] paramArrayOfT, boolean paramBoolean)
  {
    AppMethodBeat.i(99738);
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99738);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfT.length; i++)
      {
        T ? = paramArrayOfT[i];
        if (i != 0)
          this.a.append("|");
        locali.a(?, false);
      }
      this.a.append("]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99738);
    }
  }

  public final i a(short[] paramArrayOfShort, String paramString)
  {
    AppMethodBeat.i(99725);
    a(paramString);
    if (paramArrayOfShort == null)
    {
      this.a.append("null\n");
      AppMethodBeat.o(99725);
    }
    while (true)
    {
      return this;
      if (paramArrayOfShort.length == 0)
      {
        this.a.append(paramArrayOfShort.length).append(", []\n");
        AppMethodBeat.o(99725);
      }
      else
      {
        this.a.append(paramArrayOfShort.length).append(", [\n");
        paramString = new i(this.a, this.b + 1);
        int i = paramArrayOfShort.length;
        for (int j = 0; j < i; j++)
          paramString.a(paramArrayOfShort[j], null);
        a(']', null);
        AppMethodBeat.o(99725);
      }
    }
  }

  public final i a(short[] paramArrayOfShort, boolean paramBoolean)
  {
    AppMethodBeat.i(99726);
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0))
    {
      this.a.append("[]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99726);
    }
    while (true)
    {
      return this;
      this.a.append("[");
      i locali = new i(this.a, this.b + 1);
      for (int i = 0; i < paramArrayOfShort.length; i++)
      {
        short s = paramArrayOfShort[i];
        if (i != 0)
          this.a.append("|");
        locali.a(s, false);
      }
      this.a.append("]");
      if (paramBoolean)
        this.a.append("|");
      AppMethodBeat.o(99726);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.i
 * JD-Core Version:    0.6.2
 */