package com.tencent.tencentmap.mapsdk.maps.a;

import TT;;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ai
{
  private ByteBuffer a;
  private String b;

  public ai()
  {
    this.b = "GBK";
  }

  public ai(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98427);
    this.b = "GBK";
    this.a = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(98427);
  }

  public ai(byte[] paramArrayOfByte, byte paramByte)
  {
    AppMethodBeat.i(98428);
    this.b = "GBK";
    this.a = ByteBuffer.wrap(paramArrayOfByte);
    this.a.position(4);
    AppMethodBeat.o(98428);
  }

  private double a(double paramDouble, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98439);
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98439);
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
        AppMethodBeat.o(98439);
        return paramDouble;
        paramDouble = this.a.getFloat();
        continue;
        paramDouble = this.a.getDouble();
      }
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98439);
    throw ((Throwable)localObject);
  }

  private float a(float paramFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98438);
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98438);
        throw ((Throwable)localObject);
      case 12:
        paramFloat = 0.0F;
      case 4:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(98438);
        return paramFloat;
        paramFloat = this.a.getFloat();
      }
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98438);
    throw ((Throwable)localObject);
  }

  private static int a(ai.a parama, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(98430);
    int i = paramByteBuffer.get();
    parama.a = ((byte)(byte)(i & 0xF));
    parama.b = ((i & 0xF0) >> 4);
    if (parama.b == 15)
    {
      parama.b = (paramByteBuffer.get() & 0xFF);
      i = 2;
      AppMethodBeat.o(98430);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(98430);
    }
  }

  private ak a(ak paramak, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98451);
    ai.a locala = null;
    if (a(paramInt))
    {
      try
      {
        paramak = (ak)paramak.getClass().newInstance();
        locala = new ai.a();
        a(locala, this.a);
        if (locala.a != 10)
        {
          paramak = new RuntimeException("type mismatch.");
          AppMethodBeat.o(98451);
          throw paramak;
        }
      }
      catch (Exception paramak)
      {
        paramak = new RuntimeException(paramak.getMessage());
        AppMethodBeat.o(98451);
        throw paramak;
      }
      paramak.a(this);
      a();
    }
    do
    {
      AppMethodBeat.o(98451);
      return paramak;
      paramak = locala;
    }
    while (!paramBoolean);
    paramak = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98451);
    throw paramak;
  }

  private <K, V> Map<K, V> a(Map<K, V> paramMap1, Map<K, V> paramMap2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98442);
    if ((paramMap2 == null) || (paramMap2.isEmpty()))
    {
      paramMap1 = new HashMap();
      AppMethodBeat.o(98442);
    }
    while (true)
    {
      return paramMap1;
      Object localObject = (Map.Entry)paramMap2.entrySet().iterator().next();
      paramMap2 = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (a(paramInt))
      {
        ai.a locala = new ai.a();
        a(locala, this.a);
        switch (locala.a)
        {
        default:
          paramMap1 = new RuntimeException("type mismatch.");
          AppMethodBeat.o(98442);
          throw paramMap1;
        case 8:
        }
        int i = a(0, 0, true);
        if (i < 0)
        {
          paramMap1 = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
          AppMethodBeat.o(98442);
          throw paramMap1;
        }
        for (paramInt = 0; paramInt < i; paramInt++)
          paramMap1.put(a(paramMap2, 0, true), a(localObject, 1, true));
      }
      if (paramBoolean)
      {
        paramMap1 = new RuntimeException("require field not exist.");
        AppMethodBeat.o(98442);
        throw paramMap1;
      }
      AppMethodBeat.o(98442);
    }
  }

  private void a()
  {
    AppMethodBeat.i(98432);
    ai.a locala = new ai.a();
    do
    {
      a(locala, this.a);
      a(locala.a);
    }
    while (locala.a != 11);
    AppMethodBeat.o(98432);
  }

  private void a(byte paramByte)
  {
    byte b1 = 0;
    byte b2 = 0;
    AppMethodBeat.i(98433);
    Object localObject;
    switch (paramByte)
    {
    default:
      localObject = new RuntimeException("invalid type.");
      AppMethodBeat.o(98433);
      throw ((Throwable)localObject);
    case 0:
      this.a.position(this.a.position() + 1);
      AppMethodBeat.o(98433);
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
      this.a.position(this.a.position() + 2);
      AppMethodBeat.o(98433);
      continue;
      this.a.position(this.a.position() + 4);
      AppMethodBeat.o(98433);
      continue;
      this.a.position(this.a.position() + 8);
      AppMethodBeat.o(98433);
      continue;
      this.a.position(this.a.position() + 4);
      AppMethodBeat.o(98433);
      continue;
      this.a.position(this.a.position() + 8);
      AppMethodBeat.o(98433);
      continue;
      b2 = this.a.get();
      paramByte = b2;
      if (b2 < 0)
        paramByte = b2 + 256;
      this.a.position(paramByte + this.a.position());
      AppMethodBeat.o(98433);
      continue;
      paramByte = this.a.getInt();
      this.a.position(paramByte + this.a.position());
      AppMethodBeat.o(98433);
      continue;
      b1 = a(0, 0, true);
      for (paramByte = b2; paramByte < b1 << 1; paramByte++)
      {
        localObject = new ai.a();
        a((ai.a)localObject, this.a);
        a(((ai.a)localObject).a);
      }
      AppMethodBeat.o(98433);
      continue;
      b2 = a(0, 0, true);
      for (paramByte = b1; paramByte < b2; paramByte++)
      {
        localObject = new ai.a();
        a((ai.a)localObject, this.a);
        a(((ai.a)localObject).a);
      }
      AppMethodBeat.o(98433);
      continue;
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      if (((ai.a)localObject).a != 0)
      {
        localObject = new RuntimeException("skipField with invalid type, type value: " + paramByte + ", " + ((ai.a)localObject).a);
        AppMethodBeat.o(98433);
        throw ((Throwable)localObject);
      }
      paramByte = a(0, 0, true);
      this.a.position(paramByte + this.a.position());
      AppMethodBeat.o(98433);
      continue;
      a();
      AppMethodBeat.o(98433);
      continue;
      AppMethodBeat.o(98433);
    }
  }

  private boolean a(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(98431);
    try
    {
      ai.a locala = new com/tencent/tencentmap/mapsdk/maps/a/ai$a;
      locala.<init>();
      while (true)
      {
        int i = a(locala, this.a.duplicate());
        int j = locala.a;
        if (j == 11)
          AppMethodBeat.o(98431);
        while (true)
        {
          return bool;
          if (paramInt > locala.b)
            break;
          if (paramInt == locala.b)
          {
            AppMethodBeat.o(98431);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(98431);
          }
        }
        this.a.position(i + this.a.position());
        a(locala.a);
      }
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      while (true)
        AppMethodBeat.o(98431);
    }
    catch (RuntimeException localRuntimeException)
    {
      label112: break label112;
    }
  }

  private <T> T[] b(T paramT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98450);
    if (a(paramInt))
    {
      Object localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        paramT = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98450);
        throw paramT;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramT = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98450);
        throw paramT;
      }
      localObject = (Object[])Array.newInstance(paramT.getClass(), i);
      for (paramInt = 0; paramInt < i; paramInt++)
        localObject[paramInt] = a(paramT, 0, true);
      AppMethodBeat.o(98450);
      paramT = (TT)localObject;
    }
    while (true)
    {
      return paramT;
      if (paramBoolean)
      {
        paramT = new RuntimeException("require field not exist.");
        AppMethodBeat.o(98450);
        throw paramT;
      }
      paramT = null;
      AppMethodBeat.o(98450);
    }
  }

  private boolean[] c(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98443);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98443);
        throw ((Throwable)localObject);
      case 9:
      }
      i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98443);
        throw ((Throwable)localObject);
      }
      localObject = new boolean[i];
      paramInt = 0;
      if (paramInt < i)
      {
        if (a((byte)0, 0, true) != 0);
        for (paramBoolean = true; ; paramBoolean = false)
        {
          localObject[paramInt] = paramBoolean;
          paramInt++;
          break;
        }
      }
    }
    while (!paramBoolean)
    {
      int i;
      AppMethodBeat.o(98443);
      return localObject;
    }
    localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98443);
    throw ((Throwable)localObject);
  }

  private short[] d(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98445);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98445);
        throw ((Throwable)localObject);
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98445);
        throw ((Throwable)localObject);
      }
      short[] arrayOfShort = new short[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject = arrayOfShort;
        if (paramInt >= i)
          break;
        arrayOfShort[paramInt] = a(arrayOfShort[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      localObject = new RuntimeException("require field not exist.");
      AppMethodBeat.o(98445);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(98445);
    return localObject;
  }

  private int[] e(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98446);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98446);
        throw ((Throwable)localObject);
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98446);
        throw ((Throwable)localObject);
      }
      int[] arrayOfInt = new int[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject = arrayOfInt;
        if (paramInt >= i)
          break;
        arrayOfInt[paramInt] = a(arrayOfInt[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      localObject = new RuntimeException("require field not exist.");
      AppMethodBeat.o(98446);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(98446);
    return localObject;
  }

  private long[] f(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98447);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98447);
        throw ((Throwable)localObject);
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98447);
        throw ((Throwable)localObject);
      }
      long[] arrayOfLong = new long[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject = arrayOfLong;
        if (paramInt >= i)
          break;
        arrayOfLong[paramInt] = a(arrayOfLong[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      localObject = new RuntimeException("require field not exist.");
      AppMethodBeat.o(98447);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(98447);
    return localObject;
  }

  private float[] g(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98448);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98448);
        throw ((Throwable)localObject);
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98448);
        throw ((Throwable)localObject);
      }
      float[] arrayOfFloat = new float[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject = arrayOfFloat;
        if (paramInt >= i)
          break;
        arrayOfFloat[paramInt] = a(arrayOfFloat[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      localObject = new RuntimeException("require field not exist.");
      AppMethodBeat.o(98448);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(98448);
    return localObject;
  }

  private double[] h(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98449);
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98449);
        throw ((Throwable)localObject);
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        localObject = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98449);
        throw ((Throwable)localObject);
      }
      double[] arrayOfDouble = new double[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject = arrayOfDouble;
        if (paramInt >= i)
          break;
        arrayOfDouble[paramInt] = a(arrayOfDouble[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      localObject = new RuntimeException("require field not exist.");
      AppMethodBeat.o(98449);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(98449);
    return localObject;
  }

  public final byte a(byte paramByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98434);
    byte b1;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98434);
        throw ((Throwable)localObject);
      case 12:
        paramByte = 0;
        b1 = paramByte;
      case 0:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(98434);
        return b1;
        paramByte = this.a.get();
        b1 = paramByte;
      }
      b1 = paramByte;
    }
    while (!paramBoolean);
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98434);
    throw ((Throwable)localObject);
  }

  public final int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(98436);
    if (a(paramInt2))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98436);
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
        AppMethodBeat.o(98436);
        return paramInt1;
        paramInt1 = this.a.get();
        continue;
        paramInt1 = this.a.getShort();
        continue;
        paramInt1 = this.a.getInt();
      }
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98436);
    throw ((Throwable)localObject);
  }

  public final int a(String paramString)
  {
    this.b = paramString;
    return 0;
  }

  public final long a(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98437);
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98437);
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
        AppMethodBeat.o(98437);
        return paramLong;
        paramLong = this.a.get();
        continue;
        paramLong = this.a.getShort();
        continue;
        paramLong = this.a.getInt();
        continue;
        paramLong = this.a.getLong();
      }
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98437);
    throw ((Throwable)localObject);
  }

  public final <T> Object a(T paramT, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(98452);
    if ((paramT instanceof Byte))
    {
      paramT = Byte.valueOf(a((byte)0, paramInt, paramBoolean));
      AppMethodBeat.o(98452);
    }
    while (true)
    {
      return paramT;
      if ((paramT instanceof Boolean))
      {
        if (a((byte)0, paramInt, paramBoolean) != 0)
          bool = true;
        paramT = Boolean.valueOf(bool);
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Short))
      {
        paramT = Short.valueOf(a((short)0, paramInt, paramBoolean));
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Integer))
      {
        paramT = Integer.valueOf(a(0, paramInt, paramBoolean));
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Long))
      {
        paramT = Long.valueOf(a(0L, paramInt, paramBoolean));
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Float))
      {
        paramT = Float.valueOf(a(0.0F, paramInt, paramBoolean));
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Double))
      {
        paramT = Double.valueOf(a(0.0D, paramInt, paramBoolean));
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof String))
      {
        paramT = a(paramInt, paramBoolean);
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof Map))
      {
        paramT = (Map)paramT;
        paramT = (HashMap)a(new HashMap(), paramT, paramInt, paramBoolean);
        AppMethodBeat.o(98452);
      }
      else if ((paramT instanceof List))
      {
        paramT = (List)paramT;
        if ((paramT == null) || (paramT.isEmpty()))
        {
          paramT = new ArrayList();
          AppMethodBeat.o(98452);
        }
        else
        {
          Object[] arrayOfObject = b(paramT.get(0), paramInt, paramBoolean);
          if (arrayOfObject == null)
          {
            paramT = null;
            AppMethodBeat.o(98452);
          }
          else
          {
            paramT = new ArrayList();
            for (paramInt = i; paramInt < arrayOfObject.length; paramInt++)
              paramT.add(arrayOfObject[paramInt]);
            AppMethodBeat.o(98452);
          }
        }
      }
      else if ((paramT instanceof ak))
      {
        paramT = a((ak)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(98452);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        if (((paramT instanceof byte[])) || ((paramT instanceof Byte[])))
        {
          paramT = b(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof boolean[]))
        {
          paramT = c(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof short[]))
        {
          paramT = d(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof int[]))
        {
          paramT = e(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof long[]))
        {
          paramT = f(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof float[]))
        {
          paramT = g(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else if ((paramT instanceof double[]))
        {
          paramT = h(paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
        else
        {
          paramT = (Object[])paramT;
          if ((paramT == null) || (paramT.length == 0))
          {
            paramT = new RuntimeException("unable to get type of key and value.");
            AppMethodBeat.o(98452);
            throw paramT;
          }
          paramT = b(paramT[0], paramInt, paramBoolean);
          AppMethodBeat.o(98452);
        }
      }
    }
    paramT = new RuntimeException("read object error: unsupport type.");
    AppMethodBeat.o(98452);
    throw paramT;
  }

  public final String a(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98440);
    Object localObject1 = null;
    if (a(paramInt))
    {
      localObject1 = new ai.a();
      a((ai.a)localObject1, this.a);
      switch (((ai.a)localObject1).a)
      {
      default:
        localObject1 = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98440);
        throw ((Throwable)localObject1);
      case 6:
        i = this.a.get();
        paramInt = i;
        if (i < 0)
          paramInt = i + 256;
        arrayOfByte = new byte[paramInt];
        this.a.get(arrayOfByte);
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
          ((String)localObject1).<init>(arrayOfByte, this.b);
          AppMethodBeat.o(98440);
          return localObject1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          localObject2 = new String(arrayOfByte);
          continue;
        }
        paramInt = this.a.getInt();
        if ((paramInt > 104857600) || (paramInt < 0) || (paramInt > this.a.capacity()))
        {
          localObject2 = new RuntimeException("String too long: ".concat(String.valueOf(paramInt)));
          AppMethodBeat.o(98440);
          throw ((Throwable)localObject2);
        }
        byte[] arrayOfByte = new byte[paramInt];
        this.a.get(arrayOfByte);
        try
        {
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(arrayOfByte, this.b);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localObject3 = new String(arrayOfByte);
        }
      }
    Object localObject3 = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98440);
    throw ((Throwable)localObject3);
  }

  public final <K, V> HashMap<K, V> a(Map<K, V> paramMap)
  {
    AppMethodBeat.i(98441);
    paramMap = (HashMap)a(new HashMap(), paramMap, 0, false);
    AppMethodBeat.o(98441);
    return paramMap;
  }

  public final short a(short paramShort, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98435);
    short s;
    if (a(paramInt))
    {
      localObject = new ai.a();
      a((ai.a)localObject, this.a);
      switch (((ai.a)localObject).a)
      {
      default:
        localObject = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98435);
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
        AppMethodBeat.o(98435);
        return s;
        paramShort = (short)this.a.get();
        s = paramShort;
        continue;
        paramShort = this.a.getShort();
        s = paramShort;
      }
      s = paramShort;
    }
    while (!paramBoolean);
    Object localObject = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98435);
    throw ((Throwable)localObject);
  }

  public final void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98429);
    this.a = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(98429);
  }

  public final byte[] b(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98444);
    Object localObject1 = null;
    if (a(paramInt))
    {
      localObject1 = new ai.a();
      a((ai.a)localObject1, this.a);
      switch (((ai.a)localObject1).a)
      {
      default:
        localObject1 = new RuntimeException("type mismatch.");
        AppMethodBeat.o(98444);
        throw ((Throwable)localObject1);
      case 13:
        localObject2 = new ai.a();
        a((ai.a)localObject2, this.a);
        if (((ai.a)localObject2).a != 0)
        {
          localObject1 = new RuntimeException("type mismatch, tag: " + paramInt + ", type: " + ((ai.a)localObject1).a + ", " + ((ai.a)localObject2).a);
          AppMethodBeat.o(98444);
          throw ((Throwable)localObject1);
        }
        i = a(0, 0, true);
        if ((i < 0) || (i > this.a.capacity()))
        {
          localObject1 = new RuntimeException("invalid size, tag: " + paramInt + ", type: " + ((ai.a)localObject1).a + ", " + ((ai.a)localObject2).a + ", size: " + i);
          AppMethodBeat.o(98444);
          throw ((Throwable)localObject1);
        }
        localObject1 = new byte[i];
        this.a.get((byte[])localObject1);
      case 9:
      }
    }
    while (!paramBoolean)
    {
      AppMethodBeat.o(98444);
      return localObject1;
      int i = a(0, 0, true);
      if ((i < 0) || (i > this.a.capacity()))
      {
        localObject1 = new RuntimeException("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(98444);
        throw ((Throwable)localObject1);
      }
      Object localObject2 = new byte[i];
      for (paramInt = 0; ; paramInt++)
      {
        localObject1 = localObject2;
        if (paramInt >= i)
          break;
        localObject2[paramInt] = a(localObject2[0], 0, true);
      }
    }
    localObject1 = new RuntimeException("require field not exist.");
    AppMethodBeat.o(98444);
    throw ((Throwable)localObject1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ai
 * JD-Core Version:    0.6.2
 */