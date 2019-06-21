package com.qq.taf.jce;

import TT;;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class JceInputStream
{
  private ByteBuffer bs;
  protected String sServerEncoding;

  public JceInputStream()
  {
    this.sServerEncoding = "GBK";
  }

  public JceInputStream(ByteBuffer paramByteBuffer)
  {
    this.sServerEncoding = "GBK";
    this.bs = paramByteBuffer;
  }

  public JceInputStream(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117142);
    this.sServerEncoding = "GBK";
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(117142);
  }

  public JceInputStream(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(117143);
    this.sServerEncoding = "GBK";
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
    this.bs.position(paramInt);
    AppMethodBeat.o(117143);
  }

  public static void main(String[] paramArrayOfString)
  {
  }

  private int peakHead(JceInputStream.HeadData paramHeadData)
  {
    AppMethodBeat.i(117148);
    int i = readHead(paramHeadData, this.bs.duplicate());
    AppMethodBeat.o(117148);
    return i;
  }

  private <T> T[] readArrayImpl(T paramT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117178);
    Object localObject;
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        paramT = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117178);
        throw paramT;
      case 9:
      }
      int i = read(0, 0, true);
      if (i < 0)
      {
        paramT = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117178);
        throw paramT;
      }
      localObject = (Object[])Array.newInstance(paramT.getClass(), i);
      paramInt = 0;
      if (paramInt >= i)
      {
        AppMethodBeat.o(117178);
        paramT = (TT)localObject;
      }
    }
    while (true)
    {
      return paramT;
      localObject[paramInt] = read(paramT, 0, true);
      paramInt++;
      break;
      if (paramBoolean)
      {
        paramT = new JceDecodeException("require field not exist.");
        AppMethodBeat.o(117178);
        throw paramT;
      }
      paramT = null;
      AppMethodBeat.o(117178);
    }
  }

  public static int readHead(JceInputStream.HeadData paramHeadData, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(117146);
    int i = paramByteBuffer.get();
    paramHeadData.type = ((byte)(byte)(i & 0xF));
    paramHeadData.tag = ((i & 0xF0) >> 4);
    if (paramHeadData.tag == 15)
    {
      paramHeadData.tag = (paramByteBuffer.get() & 0xFF);
      i = 2;
      AppMethodBeat.o(117146);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(117146);
    }
  }

  private <K, V> Map<K, V> readMap(Map<K, V> paramMap1, Map<K, V> paramMap2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117167);
    if ((paramMap2 == null) || (paramMap2.isEmpty()))
    {
      paramMap1 = new HashMap();
      AppMethodBeat.o(117167);
      return paramMap1;
    }
    Object localObject1 = (Map.Entry)paramMap2.entrySet().iterator().next();
    paramMap2 = ((Map.Entry)localObject1).getKey();
    Object localObject2 = ((Map.Entry)localObject1).getValue();
    if (skipToTag(paramInt))
    {
      localObject1 = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject1);
      switch (((JceInputStream.HeadData)localObject1).type)
      {
      default:
        paramMap1 = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117167);
        throw paramMap1;
      case 8:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramMap1 = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117167);
        throw paramMap1;
      }
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117167);
        break;
        paramMap1.put(read(paramMap2, 0, true), read(localObject2, 1, true));
        paramInt++;
      }
    paramMap1 = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117167);
    throw paramMap1;
  }

  private void skip(int paramInt)
  {
    AppMethodBeat.i(117149);
    this.bs.position(this.bs.position() + paramInt);
    AppMethodBeat.o(117149);
  }

  private void skipField()
  {
    AppMethodBeat.i(117152);
    JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
    readHead(localHeadData);
    skipField(localHeadData.type);
    AppMethodBeat.o(117152);
  }

  private void skipField(byte paramByte)
  {
    byte b1 = 0;
    byte b2 = 0;
    AppMethodBeat.i(117153);
    Object localObject;
    switch (paramByte)
    {
    default:
      localObject = new JceDecodeException("invalid type.");
      AppMethodBeat.o(117153);
      throw ((Throwable)localObject);
    case 0:
      skip(1);
      AppMethodBeat.o(117153);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 13:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      return;
      skip(2);
      AppMethodBeat.o(117153);
      continue;
      skip(4);
      AppMethodBeat.o(117153);
      continue;
      skip(8);
      AppMethodBeat.o(117153);
      continue;
      skip(4);
      AppMethodBeat.o(117153);
      continue;
      skip(8);
      AppMethodBeat.o(117153);
      continue;
      b2 = this.bs.get();
      paramByte = b2;
      if (b2 < 0)
        paramByte = b2 + 256;
      skip(paramByte);
      AppMethodBeat.o(117153);
      continue;
      skip(this.bs.getInt());
      AppMethodBeat.o(117153);
      continue;
      b1 = read(0, 0, true);
      for (paramByte = b2; ; paramByte++)
      {
        if (paramByte >= b1 * 2)
        {
          AppMethodBeat.o(117153);
          break;
        }
        skipField();
      }
      b2 = read(0, 0, true);
      for (paramByte = b1; ; paramByte++)
      {
        if (paramByte >= b2)
        {
          AppMethodBeat.o(117153);
          break;
        }
        skipField();
      }
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      if (((JceInputStream.HeadData)localObject).type != 0)
      {
        localObject = new JceDecodeException("skipField with invalid type, type value: " + paramByte + ", " + ((JceInputStream.HeadData)localObject).type);
        AppMethodBeat.o(117153);
        throw ((Throwable)localObject);
      }
      skip(read(0, 0, true));
      AppMethodBeat.o(117153);
      continue;
      skipToStructEnd();
      AppMethodBeat.o(117153);
      continue;
      AppMethodBeat.o(117153);
    }
  }

  public final JceStruct directRead(JceStruct paramJceStruct, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117179);
    JceInputStream.HeadData localHeadData = null;
    if (skipToTag(paramInt))
    {
      try
      {
        paramJceStruct = paramJceStruct.newInit();
        localHeadData = new JceInputStream.HeadData();
        readHead(localHeadData);
        if (localHeadData.type != 10)
        {
          paramJceStruct = new JceDecodeException("type mismatch.");
          AppMethodBeat.o(117179);
          throw paramJceStruct;
        }
      }
      catch (Exception paramJceStruct)
      {
        paramJceStruct = new JceDecodeException(paramJceStruct.getMessage());
        AppMethodBeat.o(117179);
        throw paramJceStruct;
      }
      paramJceStruct.readFrom(this);
      skipToStructEnd();
    }
    do
    {
      AppMethodBeat.o(117179);
      return paramJceStruct;
      paramJceStruct = localHeadData;
    }
    while (!paramBoolean);
    paramJceStruct = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117179);
    throw paramJceStruct;
  }

  public final ByteBuffer getBs()
  {
    return this.bs;
  }

  public final byte read(byte paramByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117155);
    byte b;
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117155);
        throw ((Throwable)localObject);
      case 12:
        paramByte = 0;
        b = paramByte;
      case 0:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(117155);
        return b;
        paramByte = this.bs.get();
        b = paramByte;
      }
      b = paramByte;
    }
    while (!paramBoolean);
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117155);
    throw ((Throwable)localObject);
  }

  public final double read(double paramDouble, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117160);
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117160);
        throw ((Throwable)localObject);
      case 12:
        paramDouble = 0.0D;
      case 4:
      case 5:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(117160);
        return paramDouble;
        paramDouble = this.bs.getFloat();
        continue;
        paramDouble = this.bs.getDouble();
      }
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117160);
    throw ((Throwable)localObject);
  }

  public final float read(float paramFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117159);
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117159);
        throw ((Throwable)localObject);
      case 12:
        paramFloat = 0.0F;
      case 4:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(117159);
        return paramFloat;
        paramFloat = this.bs.getFloat();
      }
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117159);
    throw ((Throwable)localObject);
  }

  public final int read(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(117157);
    if (skipToTag(paramInt2))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117157);
        throw ((Throwable)localObject);
      case 12:
        paramInt1 = 0;
      case 0:
      case 1:
      case 2:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(117157);
        return paramInt1;
        paramInt1 = this.bs.get();
        continue;
        paramInt1 = this.bs.getShort();
        continue;
        paramInt1 = this.bs.getInt();
      }
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117157);
    throw ((Throwable)localObject);
  }

  public final long read(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117158);
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117158);
        throw ((Throwable)localObject);
      case 12:
        paramLong = 0L;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(117158);
        return paramLong;
        paramLong = this.bs.get();
        continue;
        paramLong = this.bs.getShort();
        continue;
        paramLong = this.bs.getInt();
        continue;
        paramLong = this.bs.getLong();
      }
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117158);
    throw ((Throwable)localObject);
  }

  public final JceStruct read(JceStruct paramJceStruct, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117180);
    JceInputStream.HeadData localHeadData = null;
    if (skipToTag(paramInt))
    {
      try
      {
        paramJceStruct = (JceStruct)paramJceStruct.getClass().newInstance();
        localHeadData = new JceInputStream.HeadData();
        readHead(localHeadData);
        if (localHeadData.type != 10)
        {
          paramJceStruct = new JceDecodeException("type mismatch.");
          AppMethodBeat.o(117180);
          throw paramJceStruct;
        }
      }
      catch (Exception paramJceStruct)
      {
        paramJceStruct = new JceDecodeException(paramJceStruct.getMessage());
        AppMethodBeat.o(117180);
        throw paramJceStruct;
      }
      paramJceStruct.readFrom(this);
      skipToStructEnd();
    }
    do
    {
      AppMethodBeat.o(117180);
      return paramJceStruct;
      paramJceStruct = localHeadData;
    }
    while (!paramBoolean);
    paramJceStruct = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117180);
    throw paramJceStruct;
  }

  public final <T> Object read(T paramT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117182);
    if ((paramT instanceof Byte))
    {
      paramT = Byte.valueOf(read((byte)0, paramInt, paramBoolean));
      AppMethodBeat.o(117182);
    }
    while (true)
    {
      return paramT;
      if ((paramT instanceof Boolean))
      {
        paramT = Boolean.valueOf(read(false, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Short))
      {
        paramT = Short.valueOf(read((short)0, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Integer))
      {
        paramT = Integer.valueOf(read(0, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Long))
      {
        paramT = Long.valueOf(read(0L, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Float))
      {
        paramT = Float.valueOf(read(0.0F, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Double))
      {
        paramT = Double.valueOf(read(0.0D, paramInt, paramBoolean));
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof String))
      {
        paramT = readString(paramInt, paramBoolean);
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof Map))
      {
        paramT = readMap((Map)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof List))
      {
        paramT = readArray((List)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(117182);
      }
      else if ((paramT instanceof JceStruct))
      {
        paramT = read((JceStruct)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(117182);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        if (((paramT instanceof byte[])) || ((paramT instanceof Byte[])))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof boolean[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof short[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof int[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof long[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof float[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else if ((paramT instanceof double[]))
        {
          paramT = read(null, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
        else
        {
          paramT = readArray((Object[])paramT, paramInt, paramBoolean);
          AppMethodBeat.o(117182);
        }
      }
    }
    paramT = new JceDecodeException("read object error: unsupport type.");
    AppMethodBeat.o(117182);
    throw paramT;
  }

  public final String read(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117162);
    if (skipToTag(paramInt))
    {
      paramString = new JceInputStream.HeadData();
      readHead(paramString);
      switch (paramString.type)
      {
      default:
        paramString = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117162);
        throw paramString;
      case 6:
        i = this.bs.get();
        paramInt = i;
        if (i < 0)
          paramInt = i + 256;
        arrayOfByte = new byte[paramInt];
        this.bs.get(arrayOfByte);
      case 7:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        try
        {
          int i;
          paramString = new java/lang/String;
          paramString.<init>(arrayOfByte, this.sServerEncoding);
          AppMethodBeat.o(117162);
          return paramString;
        }
        catch (UnsupportedEncodingException paramString)
        {
          paramString = new String(arrayOfByte);
          continue;
        }
        paramInt = this.bs.getInt();
        if ((paramInt > 104857600) || (paramInt < 0))
        {
          paramString = new JceDecodeException("String too long: ".concat(String.valueOf(paramInt)));
          AppMethodBeat.o(117162);
          throw paramString;
        }
        byte[] arrayOfByte = new byte[paramInt];
        this.bs.get(arrayOfByte);
        try
        {
          paramString = new java/lang/String;
          paramString.<init>(arrayOfByte, this.sServerEncoding);
        }
        catch (UnsupportedEncodingException paramString)
        {
          paramString = new String(arrayOfByte);
        }
      }
    paramString = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117162);
    throw paramString;
  }

  public final short read(short paramShort, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117156);
    short s;
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117156);
        throw ((Throwable)localObject);
      case 12:
        paramShort = 0;
        s = paramShort;
      case 0:
      case 1:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(117156);
        return s;
        paramShort = (short)this.bs.get();
        s = paramShort;
        continue;
        paramShort = this.bs.getShort();
        s = paramShort;
      }
      s = paramShort;
    }
    while (!paramBoolean);
    Object localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117156);
    throw ((Throwable)localObject);
  }

  public final boolean read(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    paramBoolean1 = false;
    AppMethodBeat.i(117154);
    if (read((byte)0, paramInt, paramBoolean2) != 0)
    {
      paramBoolean1 = true;
      AppMethodBeat.o(117154);
    }
    while (true)
    {
      return paramBoolean1;
      AppMethodBeat.o(117154);
    }
  }

  public final byte[] read(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117170);
    paramArrayOfByte = null;
    if (skipToTag(paramInt))
    {
      localObject = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject);
      switch (((JceInputStream.HeadData)localObject).type)
      {
      default:
        paramArrayOfByte = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117170);
        throw paramArrayOfByte;
      case 13:
        paramArrayOfByte = new JceInputStream.HeadData();
        readHead(paramArrayOfByte);
        if (paramArrayOfByte.type != 0)
        {
          paramArrayOfByte = new JceDecodeException("type mismatch, tag: " + paramInt + ", type: " + ((JceInputStream.HeadData)localObject).type + ", " + paramArrayOfByte.type);
          AppMethodBeat.o(117170);
          throw paramArrayOfByte;
        }
        i = read(0, 0, true);
        if (i < 0)
        {
          paramArrayOfByte = new JceDecodeException("invalid size, tag: " + paramInt + ", type: " + ((JceInputStream.HeadData)localObject).type + ", " + paramArrayOfByte.type + ", size: " + i);
          AppMethodBeat.o(117170);
          throw paramArrayOfByte;
        }
        paramArrayOfByte = new byte[i];
        this.bs.get(paramArrayOfByte);
      case 9:
      }
    }
    while (!paramBoolean)
    {
      AppMethodBeat.o(117170);
      return paramArrayOfByte;
      int i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfByte = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117170);
        throw paramArrayOfByte;
      }
      Object localObject = new byte[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfByte = (byte[])localObject;
        if (paramInt >= i)
          break;
        localObject[paramInt] = read(localObject[0], 0, true);
      }
    }
    paramArrayOfByte = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117170);
    throw paramArrayOfByte;
  }

  public final double[] read(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117175);
    paramArrayOfDouble = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfDouble = new JceInputStream.HeadData();
      readHead(paramArrayOfDouble);
      switch (paramArrayOfDouble.type)
      {
      default:
        paramArrayOfDouble = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117175);
        throw paramArrayOfDouble;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfDouble = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117175);
        throw paramArrayOfDouble;
      }
      paramArrayOfDouble = new double[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117175);
        return paramArrayOfDouble;
        paramArrayOfDouble[paramInt] = read(paramArrayOfDouble[0], 0, true);
        paramInt++;
      }
    paramArrayOfDouble = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117175);
    throw paramArrayOfDouble;
  }

  public final float[] read(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117174);
    paramArrayOfFloat = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfFloat = new JceInputStream.HeadData();
      readHead(paramArrayOfFloat);
      switch (paramArrayOfFloat.type)
      {
      default:
        paramArrayOfFloat = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117174);
        throw paramArrayOfFloat;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfFloat = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117174);
        throw paramArrayOfFloat;
      }
      paramArrayOfFloat = new float[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117174);
        return paramArrayOfFloat;
        paramArrayOfFloat[paramInt] = read(paramArrayOfFloat[0], 0, true);
        paramInt++;
      }
    paramArrayOfFloat = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117174);
    throw paramArrayOfFloat;
  }

  public final int[] read(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117172);
    paramArrayOfInt = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfInt = new JceInputStream.HeadData();
      readHead(paramArrayOfInt);
      switch (paramArrayOfInt.type)
      {
      default:
        paramArrayOfInt = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117172);
        throw paramArrayOfInt;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfInt = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117172);
        throw paramArrayOfInt;
      }
      paramArrayOfInt = new int[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117172);
        return paramArrayOfInt;
        paramArrayOfInt[paramInt] = read(paramArrayOfInt[0], 0, true);
        paramInt++;
      }
    paramArrayOfInt = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117172);
    throw paramArrayOfInt;
  }

  public final long[] read(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117173);
    paramArrayOfLong = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfLong = new JceInputStream.HeadData();
      readHead(paramArrayOfLong);
      switch (paramArrayOfLong.type)
      {
      default:
        paramArrayOfLong = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117173);
        throw paramArrayOfLong;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfLong = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117173);
        throw paramArrayOfLong;
      }
      paramArrayOfLong = new long[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117173);
        return paramArrayOfLong;
        paramArrayOfLong[paramInt] = read(paramArrayOfLong[0], 0, true);
        paramInt++;
      }
    paramArrayOfLong = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117173);
    throw paramArrayOfLong;
  }

  public final JceStruct[] read(JceStruct[] paramArrayOfJceStruct, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117181);
    paramArrayOfJceStruct = (JceStruct[])readArray(paramArrayOfJceStruct, paramInt, paramBoolean);
    AppMethodBeat.o(117181);
    return paramArrayOfJceStruct;
  }

  public final String[] read(String[] paramArrayOfString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117164);
    paramArrayOfString = (String[])readArray(paramArrayOfString, paramInt, paramBoolean);
    AppMethodBeat.o(117164);
    return paramArrayOfString;
  }

  public final short[] read(short[] paramArrayOfShort, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117171);
    paramArrayOfShort = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfShort = new JceInputStream.HeadData();
      readHead(paramArrayOfShort);
      switch (paramArrayOfShort.type)
      {
      default:
        paramArrayOfShort = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117171);
        throw paramArrayOfShort;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfShort = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117171);
        throw paramArrayOfShort;
      }
      paramArrayOfShort = new short[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117171);
        return paramArrayOfShort;
        paramArrayOfShort[paramInt] = read(paramArrayOfShort[0], 0, true);
        paramInt++;
      }
    paramArrayOfShort = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117171);
    throw paramArrayOfShort;
  }

  public final boolean[] read(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117169);
    paramArrayOfBoolean = null;
    if (skipToTag(paramInt))
    {
      paramArrayOfBoolean = new JceInputStream.HeadData();
      readHead(paramArrayOfBoolean);
      switch (paramArrayOfBoolean.type)
      {
      default:
        paramArrayOfBoolean = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117169);
        throw paramArrayOfBoolean;
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        paramArrayOfBoolean = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117169);
        throw paramArrayOfBoolean;
      }
      paramArrayOfBoolean = new boolean[i];
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117169);
        return paramArrayOfBoolean;
        paramArrayOfBoolean[paramInt] = read(paramArrayOfBoolean[0], 0, true);
        paramInt++;
      }
    paramArrayOfBoolean = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117169);
    throw paramArrayOfBoolean;
  }

  public final <T> List<T> readArray(List<T> paramList, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(117177);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = new ArrayList();
      AppMethodBeat.o(117177);
    }
    Object[] arrayOfObject;
    while (true)
    {
      return paramList;
      arrayOfObject = readArrayImpl(paramList.get(0), paramInt, paramBoolean);
      if (arrayOfObject != null)
        break;
      paramList = null;
      AppMethodBeat.o(117177);
    }
    paramList = new ArrayList();
    for (paramInt = i; ; paramInt++)
    {
      if (paramInt >= arrayOfObject.length)
      {
        AppMethodBeat.o(117177);
        break;
      }
      paramList.add(arrayOfObject[paramInt]);
    }
  }

  public final <T> T[] readArray(T[] paramArrayOfT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117176);
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0))
    {
      paramArrayOfT = new JceDecodeException("unable to get type of key and value.");
      AppMethodBeat.o(117176);
      throw paramArrayOfT;
    }
    paramArrayOfT = readArrayImpl(paramArrayOfT[0], paramInt, paramBoolean);
    AppMethodBeat.o(117176);
    return paramArrayOfT;
  }

  public final String readByteString(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117161);
    if (skipToTag(paramInt))
    {
      paramString = new JceInputStream.HeadData();
      readHead(paramString);
      switch (paramString.type)
      {
      default:
        paramString = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117161);
        throw paramString;
      case 6:
        i = this.bs.get();
        paramInt = i;
        if (i < 0)
          paramInt = i + 256;
        paramString = new byte[paramInt];
        this.bs.get(paramString);
        paramString = HexUtil.bytes2HexStr(paramString);
      case 7:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        int i;
        AppMethodBeat.o(117161);
        return paramString;
        paramInt = this.bs.getInt();
        if ((paramInt > 104857600) || (paramInt < 0))
        {
          paramString = new JceDecodeException("String too long: ".concat(String.valueOf(paramInt)));
          AppMethodBeat.o(117161);
          throw paramString;
        }
        paramString = new byte[paramInt];
        this.bs.get(paramString);
        paramString = HexUtil.bytes2HexStr(paramString);
      }
    paramString = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117161);
    throw paramString;
  }

  public final void readHead(JceInputStream.HeadData paramHeadData)
  {
    AppMethodBeat.i(117147);
    readHead(paramHeadData, this.bs);
    AppMethodBeat.o(117147);
  }

  public final List readList(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117168);
    Object localObject1 = new ArrayList();
    if (skipToTag(paramInt))
    {
      localObject2 = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject2);
      switch (((JceInputStream.HeadData)localObject2).type)
      {
      default:
        localObject1 = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117168);
        throw ((Throwable)localObject1);
      case 9:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        localObject1 = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117168);
        throw ((Throwable)localObject1);
      }
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
    {
      int i;
      AppMethodBeat.o(117168);
      return localObject1;
      Object localObject2 = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject2);
      switch (((JceInputStream.HeadData)localObject2).type)
      {
      case 11:
      default:
        localObject1 = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117168);
        throw ((Throwable)localObject1);
      case 0:
        skip(1);
      case 8:
      case 9:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 10:
      case 12:
      }
      while (true)
      {
        paramInt++;
        break;
        skip(2);
        continue;
        skip(4);
        continue;
        skip(8);
        continue;
        skip(4);
        continue;
        skip(8);
        continue;
        int j = this.bs.get();
        int k = j;
        if (j < 0)
          k = j + 256;
        skip(k);
        continue;
        skip(this.bs.getInt());
        continue;
        try
        {
          localObject2 = (JceStruct)Class.forName(JceStruct.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
          ((JceStruct)localObject2).readFrom(this);
          skipToStructEnd();
          ((List)localObject1).add(localObject2);
        }
        catch (Exception localException)
        {
          localJceDecodeException = new JceDecodeException("type mismatch.".concat(String.valueOf(localException)));
          AppMethodBeat.o(117168);
          throw localJceDecodeException;
        }
        localJceDecodeException.add(Integer.valueOf(0));
      }
    }
    JceDecodeException localJceDecodeException = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117168);
    throw localJceDecodeException;
  }

  public final <K, V> HashMap<K, V> readMap(Map<K, V> paramMap, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117166);
    paramMap = (HashMap)readMap(new HashMap(), paramMap, paramInt, paramBoolean);
    AppMethodBeat.o(117166);
    return paramMap;
  }

  public final String readString(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117163);
    Object localObject1 = null;
    if (skipToTag(paramInt))
    {
      localObject1 = new JceInputStream.HeadData();
      readHead((JceInputStream.HeadData)localObject1);
      switch (((JceInputStream.HeadData)localObject1).type)
      {
      default:
        localObject1 = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117163);
        throw ((Throwable)localObject1);
      case 6:
        i = this.bs.get();
        paramInt = i;
        if (i < 0)
          paramInt = i + 256;
        arrayOfByte = new byte[paramInt];
        this.bs.get(arrayOfByte);
      case 7:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        Object localObject2;
        try
        {
          int i;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(arrayOfByte, this.sServerEncoding);
          AppMethodBeat.o(117163);
          return localObject1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          localObject2 = new String(arrayOfByte);
          continue;
        }
        paramInt = this.bs.getInt();
        if ((paramInt > 104857600) || (paramInt < 0))
        {
          localObject2 = new JceDecodeException("String too long: ".concat(String.valueOf(paramInt)));
          AppMethodBeat.o(117163);
          throw ((Throwable)localObject2);
        }
        byte[] arrayOfByte = new byte[paramInt];
        this.bs.get(arrayOfByte);
        try
        {
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(arrayOfByte, this.sServerEncoding);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localObject3 = new String(arrayOfByte);
        }
      }
    Object localObject3 = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117163);
    throw ((Throwable)localObject3);
  }

  public final Map<String, String> readStringMap(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117165);
    Object localObject = new HashMap();
    if (skipToTag(paramInt))
    {
      localHeadData = new JceInputStream.HeadData();
      readHead(localHeadData);
      switch (localHeadData.type)
      {
      default:
        localObject = new JceDecodeException("type mismatch.");
        AppMethodBeat.o(117165);
        throw ((Throwable)localObject);
      case 8:
      }
      i = read(0, 0, true);
      if (i < 0)
      {
        localObject = new JceDecodeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(117165);
        throw ((Throwable)localObject);
      }
      paramInt = 0;
      if (paramInt < i);
    }
    while (!paramBoolean)
      while (true)
      {
        JceInputStream.HeadData localHeadData;
        int i;
        AppMethodBeat.o(117165);
        return localObject;
        ((HashMap)localObject).put(readString(0, true), readString(1, true));
        paramInt++;
      }
    localObject = new JceDecodeException("require field not exist.");
    AppMethodBeat.o(117165);
    throw ((Throwable)localObject);
  }

  public final int setServerEncoding(String paramString)
  {
    this.sServerEncoding = paramString;
    return 0;
  }

  public final void skipToStructEnd()
  {
    AppMethodBeat.i(117151);
    JceInputStream.HeadData localHeadData = new JceInputStream.HeadData();
    do
    {
      readHead(localHeadData);
      skipField(localHeadData.type);
    }
    while (localHeadData.type != 11);
    AppMethodBeat.o(117151);
  }

  public final boolean skipToTag(int paramInt)
  {
    AppMethodBeat.i(117150);
    try
    {
      JceInputStream.HeadData localHeadData = new com/qq/taf/jce/JceInputStream$HeadData;
      localHeadData.<init>();
      while (true)
      {
        int i = peakHead(localHeadData);
        if ((paramInt <= localHeadData.tag) || (localHeadData.type == 11))
        {
          if (paramInt == localHeadData.tag)
          {
            bool = true;
            AppMethodBeat.o(117150);
          }
          while (true)
          {
            return bool;
            AppMethodBeat.o(117150);
            bool = false;
          }
        }
        skip(i);
        skipField(localHeadData.type);
      }
    }
    catch (JceDecodeException localJceDecodeException)
    {
      while (true)
      {
        AppMethodBeat.o(117150);
        boolean bool = false;
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      label86: break label86;
    }
  }

  public final void warp(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117144);
    wrap(paramArrayOfByte);
    AppMethodBeat.o(117144);
  }

  public final void wrap(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(117145);
    this.bs = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(117145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.JceInputStream
 * JD-Core Version:    0.6.2
 */