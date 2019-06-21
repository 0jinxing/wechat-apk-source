package com.qq.taf.jce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class JceDisplayer
{
  private int _level = 0;
  private StringBuilder sb;

  public JceDisplayer(StringBuilder paramStringBuilder)
  {
    this.sb = paramStringBuilder;
  }

  public JceDisplayer(StringBuilder paramStringBuilder, int paramInt)
  {
    this.sb = paramStringBuilder;
    this._level = paramInt;
  }

  public static void main(String[] paramArrayOfString)
  {
    AppMethodBeat.i(117085);
    paramArrayOfString = new StringBuilder();
    paramArrayOfString.append(1.2D);
    System.out.println(paramArrayOfString.toString());
    AppMethodBeat.o(117085);
  }

  private void ps(String paramString)
  {
    AppMethodBeat.i(117042);
    for (int i = 0; ; i++)
    {
      if (i >= this._level)
      {
        if (paramString != null)
          this.sb.append(paramString).append(": ");
        AppMethodBeat.o(117042);
        return;
      }
      this.sb.append('\t');
    }
  }

  public final JceDisplayer display(byte paramByte, String paramString)
  {
    AppMethodBeat.i(117045);
    ps(paramString);
    this.sb.append(paramByte).append('\n');
    AppMethodBeat.o(117045);
    return this;
  }

  public final JceDisplayer display(char paramChar, String paramString)
  {
    AppMethodBeat.i(117047);
    ps(paramString);
    this.sb.append(paramChar).append('\n');
    AppMethodBeat.o(117047);
    return this;
  }

  public final JceDisplayer display(double paramDouble, String paramString)
  {
    AppMethodBeat.i(117057);
    ps(paramString);
    this.sb.append(paramDouble).append('\n');
    AppMethodBeat.o(117057);
    return this;
  }

  public final JceDisplayer display(float paramFloat, String paramString)
  {
    AppMethodBeat.i(117055);
    ps(paramString);
    this.sb.append(paramFloat).append('\n');
    AppMethodBeat.o(117055);
    return this;
  }

  public final JceDisplayer display(int paramInt, String paramString)
  {
    AppMethodBeat.i(117051);
    ps(paramString);
    this.sb.append(paramInt).append('\n');
    AppMethodBeat.o(117051);
    return this;
  }

  public final JceDisplayer display(long paramLong, String paramString)
  {
    AppMethodBeat.i(117053);
    ps(paramString);
    this.sb.append(paramLong).append('\n');
    AppMethodBeat.o(117053);
    return this;
  }

  public final JceDisplayer display(JceStruct paramJceStruct, String paramString)
  {
    AppMethodBeat.i(117083);
    display('{', paramString);
    if (paramJceStruct == null)
      this.sb.append('\t').append("null");
    while (true)
    {
      display('}', null);
      AppMethodBeat.o(117083);
      return this;
      paramJceStruct.display(this.sb, this._level + 1);
    }
  }

  public final <T> JceDisplayer display(T paramT, String paramString)
  {
    AppMethodBeat.i(117081);
    if (paramT == null)
      this.sb.append("null\n");
    while (true)
    {
      AppMethodBeat.o(117081);
      return this;
      if ((paramT instanceof Byte))
      {
        display(((Byte)paramT).byteValue(), paramString);
      }
      else if ((paramT instanceof Boolean))
      {
        display(((Boolean)paramT).booleanValue(), paramString);
      }
      else if ((paramT instanceof Short))
      {
        display(((Short)paramT).shortValue(), paramString);
      }
      else if ((paramT instanceof Integer))
      {
        display(((Integer)paramT).intValue(), paramString);
      }
      else if ((paramT instanceof Long))
      {
        display(((Long)paramT).longValue(), paramString);
      }
      else if ((paramT instanceof Float))
      {
        display(((Float)paramT).floatValue(), paramString);
      }
      else if ((paramT instanceof Double))
      {
        display(((Double)paramT).doubleValue(), paramString);
      }
      else if ((paramT instanceof String))
      {
        display((String)paramT, paramString);
      }
      else if ((paramT instanceof Map))
      {
        display((Map)paramT, paramString);
      }
      else if ((paramT instanceof List))
      {
        display((List)paramT, paramString);
      }
      else if ((paramT instanceof JceStruct))
      {
        display((JceStruct)paramT, paramString);
      }
      else if ((paramT instanceof byte[]))
      {
        display((byte[])paramT, paramString);
      }
      else if ((paramT instanceof boolean[]))
      {
        display((boolean[])paramT, paramString);
      }
      else if ((paramT instanceof short[]))
      {
        display((short[])paramT, paramString);
      }
      else if ((paramT instanceof int[]))
      {
        display((int[])paramT, paramString);
      }
      else if ((paramT instanceof long[]))
      {
        display((long[])paramT, paramString);
      }
      else if ((paramT instanceof float[]))
      {
        display((float[])paramT, paramString);
      }
      else if ((paramT instanceof double[]))
      {
        display((double[])paramT, paramString);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        display((Object[])paramT, paramString);
      }
    }
    paramT = new JceEncodeException("write object error: unsupport type.");
    AppMethodBeat.o(117081);
    throw paramT;
  }

  public final JceDisplayer display(String paramString1, String paramString2)
  {
    AppMethodBeat.i(117059);
    ps(paramString2);
    if (paramString1 == null)
      this.sb.append("null\n");
    while (true)
    {
      AppMethodBeat.o(117059);
      return this;
      this.sb.append(paramString1).append('\n');
    }
  }

  public final <T> JceDisplayer display(Collection<T> paramCollection, String paramString)
  {
    AppMethodBeat.i(117079);
    if (paramCollection == null)
    {
      ps(paramString);
      this.sb.append("null\t");
      AppMethodBeat.o(117079);
      paramCollection = this;
    }
    while (true)
    {
      return paramCollection;
      paramCollection = display(paramCollection.toArray(), paramString);
      AppMethodBeat.o(117079);
    }
  }

  public final <K, V> JceDisplayer display(Map<K, V> paramMap, String paramString)
  {
    AppMethodBeat.i(117075);
    ps(paramString);
    if (paramMap == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117075);
    }
    while (true)
    {
      return this;
      if (!paramMap.isEmpty())
        break;
      this.sb.append(paramMap.size()).append(", {}\n");
      AppMethodBeat.o(117075);
    }
    this.sb.append(paramMap.size()).append(", {\n");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    paramString = new JceDisplayer(this.sb, this._level + 2);
    paramMap = paramMap.entrySet().iterator();
    while (true)
    {
      if (!paramMap.hasNext())
      {
        display('}', null);
        AppMethodBeat.o(117075);
        break;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localJceDisplayer.display('(', null);
      paramString.display(localEntry.getKey(), null);
      paramString.display(localEntry.getValue(), null);
      localJceDisplayer.display(')', null);
    }
  }

  public final JceDisplayer display(short paramShort, String paramString)
  {
    AppMethodBeat.i(117049);
    ps(paramString);
    this.sb.append(paramShort).append('\n');
    AppMethodBeat.o(117049);
    return this;
  }

  public final JceDisplayer display(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(117043);
    ps(paramString);
    paramString = this.sb;
    char c1;
    if (paramBoolean)
      c1 = 'T';
    for (char c2 = c1; ; c2 = c1)
    {
      paramString.append(c2).append('\n');
      AppMethodBeat.o(117043);
      return this;
      c1 = 'F';
    }
  }

  public final JceDisplayer display(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(117061);
    ps(paramString);
    if (paramArrayOfByte == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117061);
    }
    while (true)
    {
      return this;
      if (paramArrayOfByte.length != 0)
        break;
      this.sb.append(paramArrayOfByte.length).append(", []\n");
      AppMethodBeat.o(117061);
    }
    this.sb.append(paramArrayOfByte.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfByte.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117061);
        break;
      }
      paramString.display(paramArrayOfByte[j], null);
    }
  }

  public final JceDisplayer display(char[] paramArrayOfChar, String paramString)
  {
    AppMethodBeat.i(117063);
    ps(paramString);
    if (paramArrayOfChar == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117063);
    }
    while (true)
    {
      return this;
      if (paramArrayOfChar.length != 0)
        break;
      this.sb.append(paramArrayOfChar.length).append(", []\n");
      AppMethodBeat.o(117063);
    }
    this.sb.append(paramArrayOfChar.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfChar.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117063);
        break;
      }
      paramString.display(paramArrayOfChar[j], null);
    }
  }

  public final JceDisplayer display(double[] paramArrayOfDouble, String paramString)
  {
    AppMethodBeat.i(117073);
    ps(paramString);
    if (paramArrayOfDouble == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117073);
    }
    while (true)
    {
      return this;
      if (paramArrayOfDouble.length != 0)
        break;
      this.sb.append(paramArrayOfDouble.length).append(", []\n");
      AppMethodBeat.o(117073);
    }
    this.sb.append(paramArrayOfDouble.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfDouble.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117073);
        break;
      }
      paramString.display(paramArrayOfDouble[j], null);
    }
  }

  public final JceDisplayer display(float[] paramArrayOfFloat, String paramString)
  {
    AppMethodBeat.i(117071);
    ps(paramString);
    if (paramArrayOfFloat == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117071);
    }
    while (true)
    {
      return this;
      if (paramArrayOfFloat.length != 0)
        break;
      this.sb.append(paramArrayOfFloat.length).append(", []\n");
      AppMethodBeat.o(117071);
    }
    this.sb.append(paramArrayOfFloat.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfFloat.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117071);
        break;
      }
      paramString.display(paramArrayOfFloat[j], null);
    }
  }

  public final JceDisplayer display(int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(117067);
    ps(paramString);
    if (paramArrayOfInt == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117067);
    }
    while (true)
    {
      return this;
      if (paramArrayOfInt.length != 0)
        break;
      this.sb.append(paramArrayOfInt.length).append(", []\n");
      AppMethodBeat.o(117067);
    }
    this.sb.append(paramArrayOfInt.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117067);
        break;
      }
      paramString.display(paramArrayOfInt[j], null);
    }
  }

  public final JceDisplayer display(long[] paramArrayOfLong, String paramString)
  {
    AppMethodBeat.i(117069);
    ps(paramString);
    if (paramArrayOfLong == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117069);
    }
    while (true)
    {
      return this;
      if (paramArrayOfLong.length != 0)
        break;
      this.sb.append(paramArrayOfLong.length).append(", []\n");
      AppMethodBeat.o(117069);
    }
    this.sb.append(paramArrayOfLong.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfLong.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117069);
        break;
      }
      paramString.display(paramArrayOfLong[j], null);
    }
  }

  public final <T> JceDisplayer display(T[] paramArrayOfT, String paramString)
  {
    AppMethodBeat.i(117077);
    ps(paramString);
    if (paramArrayOfT == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117077);
    }
    while (true)
    {
      return this;
      if (paramArrayOfT.length != 0)
        break;
      this.sb.append(paramArrayOfT.length).append(", []\n");
      AppMethodBeat.o(117077);
    }
    this.sb.append(paramArrayOfT.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfT.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117077);
        break;
      }
      paramString.display(paramArrayOfT[j], null);
    }
  }

  public final JceDisplayer display(short[] paramArrayOfShort, String paramString)
  {
    AppMethodBeat.i(117065);
    ps(paramString);
    if (paramArrayOfShort == null)
    {
      this.sb.append("null\n");
      AppMethodBeat.o(117065);
    }
    while (true)
    {
      return this;
      if (paramArrayOfShort.length != 0)
        break;
      this.sb.append(paramArrayOfShort.length).append(", []\n");
      AppMethodBeat.o(117065);
    }
    this.sb.append(paramArrayOfShort.length).append(", [\n");
    paramString = new JceDisplayer(this.sb, this._level + 1);
    int i = paramArrayOfShort.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        display(']', null);
        AppMethodBeat.o(117065);
        break;
      }
      paramString.display(paramArrayOfShort[j], null);
    }
  }

  public final JceDisplayer displaySimple(byte paramByte, boolean paramBoolean)
  {
    AppMethodBeat.i(117046);
    this.sb.append(paramByte);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117046);
    return this;
  }

  public final JceDisplayer displaySimple(char paramChar, boolean paramBoolean)
  {
    AppMethodBeat.i(117048);
    this.sb.append(paramChar);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117048);
    return this;
  }

  public final JceDisplayer displaySimple(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(117058);
    this.sb.append(paramDouble);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117058);
    return this;
  }

  public final JceDisplayer displaySimple(float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(117056);
    this.sb.append(paramFloat);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117056);
    return this;
  }

  public final JceDisplayer displaySimple(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117052);
    this.sb.append(paramInt);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117052);
    return this;
  }

  public final JceDisplayer displaySimple(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(117054);
    this.sb.append(paramLong);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117054);
    return this;
  }

  public final JceDisplayer displaySimple(JceStruct paramJceStruct, boolean paramBoolean)
  {
    AppMethodBeat.i(117084);
    this.sb.append("{");
    if (paramJceStruct == null)
      this.sb.append('\t').append("null");
    while (true)
    {
      this.sb.append("}");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117084);
      return this;
      paramJceStruct.displaySimple(this.sb, this._level + 1);
    }
  }

  public final <T> JceDisplayer displaySimple(T paramT, boolean paramBoolean)
  {
    AppMethodBeat.i(117082);
    if (paramT == null)
      this.sb.append("null\n");
    while (true)
    {
      AppMethodBeat.o(117082);
      return this;
      if ((paramT instanceof Byte))
      {
        displaySimple(((Byte)paramT).byteValue(), paramBoolean);
      }
      else if ((paramT instanceof Boolean))
      {
        displaySimple(((Boolean)paramT).booleanValue(), paramBoolean);
      }
      else if ((paramT instanceof Short))
      {
        displaySimple(((Short)paramT).shortValue(), paramBoolean);
      }
      else if ((paramT instanceof Integer))
      {
        displaySimple(((Integer)paramT).intValue(), paramBoolean);
      }
      else if ((paramT instanceof Long))
      {
        displaySimple(((Long)paramT).longValue(), paramBoolean);
      }
      else if ((paramT instanceof Float))
      {
        displaySimple(((Float)paramT).floatValue(), paramBoolean);
      }
      else if ((paramT instanceof Double))
      {
        displaySimple(((Double)paramT).doubleValue(), paramBoolean);
      }
      else if ((paramT instanceof String))
      {
        displaySimple((String)paramT, paramBoolean);
      }
      else if ((paramT instanceof Map))
      {
        displaySimple((Map)paramT, paramBoolean);
      }
      else if ((paramT instanceof List))
      {
        displaySimple((List)paramT, paramBoolean);
      }
      else if ((paramT instanceof JceStruct))
      {
        displaySimple((JceStruct)paramT, paramBoolean);
      }
      else if ((paramT instanceof byte[]))
      {
        displaySimple((byte[])paramT, paramBoolean);
      }
      else if ((paramT instanceof boolean[]))
      {
        displaySimple((boolean[])paramT, paramBoolean);
      }
      else if ((paramT instanceof short[]))
      {
        displaySimple((short[])paramT, paramBoolean);
      }
      else if ((paramT instanceof int[]))
      {
        displaySimple((int[])paramT, paramBoolean);
      }
      else if ((paramT instanceof long[]))
      {
        displaySimple((long[])paramT, paramBoolean);
      }
      else if ((paramT instanceof float[]))
      {
        displaySimple((float[])paramT, paramBoolean);
      }
      else if ((paramT instanceof double[]))
      {
        displaySimple((double[])paramT, paramBoolean);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        displaySimple((Object[])paramT, paramBoolean);
      }
    }
    paramT = new JceEncodeException("write object error: unsupport type.");
    AppMethodBeat.o(117082);
    throw paramT;
  }

  public final JceDisplayer displaySimple(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117060);
    if (paramString == null)
      this.sb.append("null");
    while (true)
    {
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117060);
      return this;
      this.sb.append(paramString);
    }
  }

  public final <T> JceDisplayer displaySimple(Collection<T> paramCollection, boolean paramBoolean)
  {
    AppMethodBeat.i(117080);
    if (paramCollection == null)
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117080);
      paramCollection = this;
    }
    while (true)
    {
      return paramCollection;
      paramCollection = displaySimple(paramCollection.toArray(), paramBoolean);
      AppMethodBeat.o(117080);
    }
  }

  public final <K, V> JceDisplayer displaySimple(Map<K, V> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(117076);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      this.sb.append("{}");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117076);
      return this;
    }
    this.sb.append("{");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 2);
    Iterator localIterator = paramMap.entrySet().iterator();
    for (int i = 1; ; i = 0)
    {
      if (!localIterator.hasNext())
      {
        this.sb.append("}");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117076);
        break;
      }
      paramMap = (Map.Entry)localIterator.next();
      if (i == 0)
        this.sb.append(",");
      localJceDisplayer.displaySimple(paramMap.getKey(), true);
      localJceDisplayer.displaySimple(paramMap.getValue(), false);
    }
  }

  public final JceDisplayer displaySimple(short paramShort, boolean paramBoolean)
  {
    AppMethodBeat.i(117050);
    this.sb.append(paramShort);
    if (paramBoolean)
      this.sb.append("|");
    AppMethodBeat.o(117050);
    return this;
  }

  public final JceDisplayer displaySimple(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(117044);
    StringBuilder localStringBuilder = this.sb;
    char c1;
    if (paramBoolean1)
      c1 = 'T';
    for (char c2 = c1; ; c2 = c1)
    {
      localStringBuilder.append(c2);
      if (paramBoolean2)
        this.sb.append("|");
      AppMethodBeat.o(117044);
      return this;
      c1 = 'F';
    }
  }

  public final JceDisplayer displaySimple(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(117062);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117062);
    }
    while (true)
    {
      return this;
      this.sb.append(HexUtil.bytes2HexStr(paramArrayOfByte));
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117062);
    }
  }

  public final JceDisplayer displaySimple(char[] paramArrayOfChar, boolean paramBoolean)
  {
    AppMethodBeat.i(117064);
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0))
    {
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117064);
    }
    while (true)
    {
      return this;
      this.sb.append(new String(paramArrayOfChar));
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117064);
    }
  }

  public final JceDisplayer displaySimple(double[] paramArrayOfDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(117074);
    if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117074);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfDouble.length)
      {
        this.sb.append("[");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117074);
        break;
      }
      double d = paramArrayOfDouble[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(d, false);
    }
  }

  public final JceDisplayer displaySimple(float[] paramArrayOfFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(117072);
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117072);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfFloat.length)
      {
        this.sb.append("]");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117072);
        break;
      }
      float f = paramArrayOfFloat[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(f, false);
    }
  }

  public final JceDisplayer displaySimple(int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117068);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117068);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfInt.length)
      {
        this.sb.append("]");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117068);
        break;
      }
      int j = paramArrayOfInt[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(j, false);
    }
  }

  public final JceDisplayer displaySimple(long[] paramArrayOfLong, boolean paramBoolean)
  {
    AppMethodBeat.i(117070);
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117070);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfLong.length)
      {
        this.sb.append("]");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117070);
        break;
      }
      long l = paramArrayOfLong[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(l, false);
    }
  }

  public final <T> JceDisplayer displaySimple(T[] paramArrayOfT, boolean paramBoolean)
  {
    AppMethodBeat.i(117078);
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117078);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfT.length)
      {
        this.sb.append("]");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117078);
        break;
      }
      T ? = paramArrayOfT[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(?, false);
    }
  }

  public final JceDisplayer displaySimple(short[] paramArrayOfShort, boolean paramBoolean)
  {
    AppMethodBeat.i(117066);
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0))
    {
      this.sb.append("[]");
      if (paramBoolean)
        this.sb.append("|");
      AppMethodBeat.o(117066);
      return this;
    }
    this.sb.append("[");
    JceDisplayer localJceDisplayer = new JceDisplayer(this.sb, this._level + 1);
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfShort.length)
      {
        this.sb.append("]");
        if (paramBoolean)
          this.sb.append("|");
        AppMethodBeat.o(117066);
        break;
      }
      short s = paramArrayOfShort[i];
      if (i != 0)
        this.sb.append("|");
      localJceDisplayer.displaySimple(s, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceDisplayer
 * JD-Core Version:    0.6.2
 */