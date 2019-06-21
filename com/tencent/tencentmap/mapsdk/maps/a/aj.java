package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class aj
{
  private ByteBuffer a;
  private String b;

  public aj()
  {
    this(128);
  }

  public aj(int paramInt)
  {
    AppMethodBeat.i(98453);
    this.b = "GBK";
    this.a = ByteBuffer.allocate(paramInt);
    AppMethodBeat.o(98453);
  }

  private void a(int paramInt)
  {
    AppMethodBeat.i(98455);
    int i;
    if (this.a.remaining() < paramInt)
      i = this.a.capacity();
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(i + paramInt << 1);
      localByteBuffer.put(this.a.array(), 0, this.a.position());
      this.a = localByteBuffer;
      AppMethodBeat.o(98455);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      AppMethodBeat.o(98455);
      throw localIllegalArgumentException;
    }
  }

  private void b(byte paramByte, int paramInt)
  {
    AppMethodBeat.i(98456);
    byte b1;
    if (paramInt < 15)
    {
      b1 = (byte)(paramInt << 4 | paramByte);
      this.a.put(b1);
      AppMethodBeat.o(98456);
    }
    while (true)
    {
      return;
      if (paramInt >= 256)
        break;
      b1 = (byte)(paramByte | 0xF0);
      this.a.put(b1);
      this.a.put((byte)paramInt);
      AppMethodBeat.o(98456);
    }
    RuntimeException localRuntimeException = new RuntimeException("tag is too large: ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(98456);
    throw localRuntimeException;
  }

  public final int a(String paramString)
  {
    this.b = paramString;
    return 0;
  }

  public final ByteBuffer a()
  {
    return this.a;
  }

  public final void a(byte paramByte, int paramInt)
  {
    AppMethodBeat.i(98458);
    a(3);
    if (paramByte == 0)
    {
      b((byte)12, paramInt);
      AppMethodBeat.o(98458);
    }
    while (true)
    {
      return;
      b((byte)0, paramInt);
      this.a.put(paramByte);
      AppMethodBeat.o(98458);
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98460);
    a(6);
    if ((paramInt1 >= -32768) && (paramInt1 <= 32767))
    {
      a((short)paramInt1, paramInt2);
      AppMethodBeat.o(98460);
    }
    while (true)
    {
      return;
      b((byte)2, paramInt2);
      this.a.putInt(paramInt1);
      AppMethodBeat.o(98460);
    }
  }

  public final void a(long paramLong, int paramInt)
  {
    AppMethodBeat.i(98461);
    a(10);
    if ((paramLong >= -2147483648L) && (paramLong <= 2147483647L))
    {
      a((int)paramLong, paramInt);
      AppMethodBeat.o(98461);
    }
    while (true)
    {
      return;
      b((byte)3, paramInt);
      this.a.putLong(paramLong);
      AppMethodBeat.o(98461);
    }
  }

  public final void a(Object paramObject, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(98466);
    if ((paramObject instanceof Byte))
    {
      a(((Byte)paramObject).byteValue(), paramInt);
      AppMethodBeat.o(98466);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Boolean))
      {
        if (((Boolean)paramObject).booleanValue())
          i = 1;
        a((byte)i, paramInt);
        AppMethodBeat.o(98466);
      }
      else if ((paramObject instanceof Short))
      {
        a(((Short)paramObject).shortValue(), paramInt);
        AppMethodBeat.o(98466);
      }
      else if ((paramObject instanceof Integer))
      {
        a(((Integer)paramObject).intValue(), paramInt);
        AppMethodBeat.o(98466);
      }
      else if ((paramObject instanceof Long))
      {
        a(((Long)paramObject).longValue(), paramInt);
        AppMethodBeat.o(98466);
      }
      else
      {
        float f;
        if ((paramObject instanceof Float))
        {
          f = ((Float)paramObject).floatValue();
          a(6);
          b((byte)4, paramInt);
          this.a.putFloat(f);
          AppMethodBeat.o(98466);
        }
        else
        {
          double d;
          if ((paramObject instanceof Double))
          {
            d = ((Double)paramObject).doubleValue();
            a(10);
            b((byte)5, paramInt);
            this.a.putDouble(d);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof String))
          {
            a((String)paramObject, paramInt);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof Map))
          {
            a((Map)paramObject, paramInt);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof List))
          {
            a((List)paramObject, paramInt);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof ak))
          {
            paramObject = (ak)paramObject;
            a(2);
            b((byte)10, paramInt);
            paramObject.a(this);
            a(2);
            b((byte)11, 0);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof byte[]))
          {
            a((byte[])paramObject, paramInt);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof boolean[]))
          {
            paramObject = (boolean[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            int j = paramObject.length;
            paramInt = 0;
            if (paramInt < j)
            {
              if (paramObject[paramInt] != 0);
              for (i = 1; ; i = 0)
              {
                a((byte)i, 0);
                paramInt++;
                break;
              }
            }
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof short[]))
          {
            paramObject = (short[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
              a(paramObject[paramInt], 0);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof int[]))
          {
            paramObject = (int[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
              a(paramObject[paramInt], 0);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof long[]))
          {
            paramObject = (long[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
              a(paramObject[paramInt], 0);
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof float[]))
          {
            paramObject = (float[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
            {
              f = paramObject[paramInt];
              a(6);
              b((byte)4, 0);
              this.a.putFloat(f);
            }
            AppMethodBeat.o(98466);
          }
          else if ((paramObject instanceof double[]))
          {
            paramObject = (double[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
            {
              d = paramObject[paramInt];
              a(10);
              b((byte)5, 0);
              this.a.putDouble(d);
            }
            AppMethodBeat.o(98466);
          }
          else if (paramObject.getClass().isArray())
          {
            paramObject = (Object[])paramObject;
            a(8);
            b((byte)9, paramInt);
            a(paramObject.length, 0);
            i = paramObject.length;
            for (paramInt = 0; paramInt < i; paramInt++)
              a(paramObject[paramInt], 0);
            AppMethodBeat.o(98466);
          }
          else
          {
            if (!(paramObject instanceof Collection))
              break;
            a((Collection)paramObject, paramInt);
            AppMethodBeat.o(98466);
          }
        }
      }
    }
    paramObject = new RuntimeException("write object error: unsupport type. " + paramObject.getClass());
    AppMethodBeat.o(98466);
    throw paramObject;
  }

  public final void a(String paramString, int paramInt)
  {
    AppMethodBeat.i(98462);
    try
    {
      byte[] arrayOfByte = paramString.getBytes(this.b);
      paramString = arrayOfByte;
      a(paramString.length + 10);
      if (paramString.length > 255)
      {
        b((byte)7, paramInt);
        this.a.putInt(paramString.length);
        this.a.put(paramString);
        AppMethodBeat.o(98462);
        return;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        paramString = paramString.getBytes();
        continue;
        b((byte)6, paramInt);
        this.a.put((byte)paramString.length);
        this.a.put(paramString);
        AppMethodBeat.o(98462);
      }
    }
  }

  public final <T> void a(Collection<T> paramCollection, int paramInt)
  {
    AppMethodBeat.i(98465);
    a(8);
    b((byte)9, paramInt);
    if (paramCollection == null);
    for (paramInt = 0; ; paramInt = paramCollection.size())
    {
      a(paramInt, 0);
      if (paramCollection == null)
        break;
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
        a(paramCollection.next(), 0);
    }
    AppMethodBeat.o(98465);
  }

  public final <K, V> void a(Map<K, V> paramMap, int paramInt)
  {
    AppMethodBeat.i(98463);
    a(8);
    b((byte)8, paramInt);
    if (paramMap == null);
    for (paramInt = 0; ; paramInt = paramMap.size())
    {
      a(paramInt, 0);
      if (paramMap == null)
        break;
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(localEntry.getKey(), 0);
        a(localEntry.getValue(), 1);
      }
    }
    AppMethodBeat.o(98463);
  }

  public final void a(short paramShort, int paramInt)
  {
    AppMethodBeat.i(98459);
    a(4);
    if ((paramShort >= -128) && (paramShort <= 127))
    {
      a((byte)paramShort, paramInt);
      AppMethodBeat.o(98459);
    }
    while (true)
    {
      return;
      b((byte)1, paramInt);
      this.a.putShort(paramShort);
      AppMethodBeat.o(98459);
    }
  }

  public final void a(boolean paramBoolean)
  {
    AppMethodBeat.i(98457);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      a((byte)i, 3);
      AppMethodBeat.o(98457);
      return;
    }
  }

  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(98464);
    a(paramArrayOfByte.length + 8);
    b((byte)13, paramInt);
    b((byte)0, 0);
    a(paramArrayOfByte.length, 0);
    this.a.put(paramArrayOfByte);
    AppMethodBeat.o(98464);
  }

  public final byte[] b()
  {
    AppMethodBeat.i(98454);
    byte[] arrayOfByte = new byte[this.a.position()];
    System.arraycopy(this.a.array(), 0, arrayOfByte, 0, this.a.position());
    AppMethodBeat.o(98454);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aj
 * JD-Core Version:    0.6.2
 */