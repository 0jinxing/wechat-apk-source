package com.tencent.matrix.resource.c;

import com.tencent.matrix.resource.c.a.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class e extends d
{
  int bXj = 0;
  final OutputStream bXu;
  final ByteArrayOutputStream bXv = new ByteArrayOutputStream();

  public e(OutputStream paramOutputStream)
  {
    super(null);
    this.bXu = paramOutputStream;
  }

  private a b(int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      a locala = new a(paramInt1, paramInt2, paramLong);
      return locala;
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException(localThrowable);
    }
  }

  public final void a(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfByte)
  {
    try
    {
      this.bXu.write(paramInt1);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt2);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, (int)paramLong);
      this.bXu.write(paramArrayOfByte, 0, (int)paramLong);
      return;
    }
    catch (Throwable paramArrayOfByte)
    {
    }
    throw new RuntimeException(paramArrayOfByte);
  }

  public final void a(int paramInt1, int paramInt2, com.tencent.matrix.resource.c.a.b[] paramArrayOfb, int paramInt3, long paramLong)
  {
    try
    {
      this.bXu.write(5);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt3);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, (int)paramLong);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt1);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt2);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramArrayOfb.length);
      paramInt2 = paramArrayOfb.length;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        com.tencent.matrix.resource.c.a.b localb = paramArrayOfb[paramInt1];
        this.bXu.write(localb.bXC);
      }
    }
    catch (Throwable paramArrayOfb)
    {
      throw new RuntimeException(paramArrayOfb);
    }
  }

  public final void a(int paramInt1, com.tencent.matrix.resource.c.a.b paramb1, int paramInt2, com.tencent.matrix.resource.c.a.b paramb2, int paramInt3, long paramLong)
  {
    try
    {
      this.bXu.write(2);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt3);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, (int)paramLong);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt1);
      this.bXu.write(paramb1.bXC);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt2);
      this.bXu.write(paramb2.bXC);
      return;
    }
    catch (Throwable paramb1)
    {
    }
    throw new RuntimeException(paramb1);
  }

  public final void a(com.tencent.matrix.resource.c.a.b paramb1, com.tencent.matrix.resource.c.a.b paramb2, com.tencent.matrix.resource.c.a.b paramb3, com.tencent.matrix.resource.c.a.b paramb4, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    try
    {
      this.bXu.write(4);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt3);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, (int)paramLong);
      this.bXu.write(paramb1.bXC);
      this.bXu.write(paramb2.bXC);
      this.bXu.write(paramb3.bXC);
      this.bXu.write(paramb4.bXC);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt1);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt2);
      return;
    }
    catch (Throwable paramb1)
    {
    }
    throw new RuntimeException(paramb1);
  }

  public final void a(com.tencent.matrix.resource.c.a.b paramb, String paramString, int paramInt, long paramLong)
  {
    try
    {
      this.bXu.write(1);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt);
      com.tencent.matrix.resource.c.b.a.b(this.bXu, (int)paramLong);
      this.bXu.write(paramb.bXC);
      paramb = this.bXu;
      paramInt = paramString.length();
      paramb.write(paramString.getBytes(Charset.forName("UTF-8")), 0, paramInt);
      return;
    }
    catch (Throwable paramb)
    {
    }
    throw new RuntimeException(paramb);
  }

  public final void a(String paramString, int paramInt, long paramLong)
  {
    if ((paramInt <= 0) || (paramInt >= 1073741823))
      try
      {
        paramString = new java/io/IOException;
        paramString.<init>("bad idSize: ".concat(String.valueOf(paramInt)));
        throw paramString;
      }
      catch (Throwable paramString)
      {
        throw new RuntimeException(paramString);
      }
    this.bXj = paramInt;
    OutputStream localOutputStream = this.bXu;
    localOutputStream.write(paramString.getBytes(Charset.forName("UTF-8")));
    localOutputStream.write(0);
    com.tencent.matrix.resource.c.b.a.b(this.bXu, paramInt);
    com.tencent.matrix.resource.c.b.a.a(this.bXu, paramLong);
  }

  public final void zn()
  {
    try
    {
      this.bXu.flush();
      return;
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException(localThrowable);
    }
  }

  final class a extends b
  {
    private final int bXw;
    private final long bXx;
    private final int mTag;

    a(int paramInt1, int paramLong, long arg4)
    {
      super();
      this.mTag = paramInt1;
      this.bXw = paramLong;
      Object localObject;
      this.bXx = localObject;
    }

    public final void a(int paramInt, com.tencent.matrix.resource.c.a.b paramb)
    {
      try
      {
        e.this.bXv.write(254);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt);
        e.this.bXv.write(paramb.bXC);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void a(int paramInt1, com.tencent.matrix.resource.c.a.b paramb, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.bXv.write(paramInt1);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt3);
        e.this.bXv.write(paramInt4);
        paramInt1 = c.fW(paramInt4).getSize(e.this.bXj);
        e.this.bXv.write(paramArrayOfByte, 0, paramInt1 * paramInt3);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb, int paramInt)
    {
      try
      {
        e.this.bXv.write(4);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.bXv.write(2);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt1, int paramInt2, com.tencent.matrix.resource.c.a.b paramb2, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.bXv.write(34);
        e.this.bXv.write(paramb1.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        e.this.bXv.write(paramb2.bXC);
        paramInt1 = e.this.bXj;
        e.this.bXv.write(paramArrayOfByte, 0, paramInt1 * paramInt2);
        return;
      }
      catch (Throwable paramb1)
      {
      }
      throw new RuntimeException(paramb1);
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt1, com.tencent.matrix.resource.c.a.b paramb2, com.tencent.matrix.resource.c.a.b paramb3, int paramInt2, com.tencent.matrix.resource.c.a.a[] paramArrayOfa1, com.tencent.matrix.resource.c.a.a[] paramArrayOfa2)
    {
      try
      {
        e.this.bXv.write(32);
        e.this.bXv.write(paramb1.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        e.this.bXv.write(paramb2.bXC);
        e.this.bXv.write(paramb3.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, e.this.bXj << 2);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        com.tencent.matrix.resource.c.b.a.a(e.this.bXv, 0);
        com.tencent.matrix.resource.c.b.a.a(e.this.bXv, paramArrayOfa1.length);
        int i = paramArrayOfa1.length;
        paramInt1 = 0;
        if (paramInt1 >= i)
          break label557;
        paramb1 = paramArrayOfa1[paramInt1];
        com.tencent.matrix.resource.c.b.a.a(e.this.bXv, paramb1.bXA);
        e.this.bXv.write(paramb1.bXz);
        paramb2 = e.this.bXv;
        paramb1 = paramb1.bXB;
        if (paramb1 == null)
        {
          paramb1 = new java/lang/IllegalArgumentException;
          paramb1.<init>("value is null.");
          throw paramb1;
        }
      }
      catch (Throwable paramb1)
      {
        throw new RuntimeException(paramb1);
      }
      if ((paramb1 instanceof com.tencent.matrix.resource.c.a.b))
        com.tencent.matrix.resource.c.b.a.a(paramb2, (com.tencent.matrix.resource.c.a.b)paramb1);
      while (true)
      {
        paramInt1++;
        break;
        if (((paramb1 instanceof Boolean)) || (Boolean.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          if (((Boolean)paramb1).booleanValue());
          for (paramInt2 = 1; ; paramInt2 = 0)
          {
            paramb2.write(paramInt2);
            break;
          }
        }
        if (((paramb1 instanceof Character)) || (Character.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.a(paramb2, ((Character)paramb1).charValue());
        }
        else if (((paramb1 instanceof Float)) || (Float.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.b(paramb2, Float.floatToRawIntBits(((Float)paramb1).floatValue()));
        }
        else if (((paramb1 instanceof Double)) || (Double.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.a(paramb2, Double.doubleToRawLongBits(((Double)paramb1).doubleValue()));
        }
        else if (((paramb1 instanceof Byte)) || (Byte.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          paramb2.write(((Byte)paramb1).byteValue());
        }
        else if (((paramb1 instanceof Short)) || (Short.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.a(paramb2, ((Short)paramb1).shortValue());
        }
        else if (((paramb1 instanceof Integer)) || (Integer.TYPE.isAssignableFrom(paramb1.getClass())))
        {
          com.tencent.matrix.resource.c.b.a.b(paramb2, ((Integer)paramb1).intValue());
        }
        else
        {
          if ((!(paramb1 instanceof Long)) && (!Long.TYPE.isAssignableFrom(paramb1.getClass())))
            break label520;
          com.tencent.matrix.resource.c.b.a.a(paramb2, ((Long)paramb1).longValue());
        }
      }
      label520: paramb3 = new java/lang/IllegalArgumentException;
      paramb2 = new java/lang/StringBuilder;
      paramb2.<init>("bad value type: ");
      paramb3.<init>(paramb1.getClass().getName());
      throw paramb3;
      label557: com.tencent.matrix.resource.c.b.a.a(e.this.bXv, paramArrayOfa2.length);
      paramInt2 = paramArrayOfa2.length;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        paramb1 = paramArrayOfa2[paramInt1];
        com.tencent.matrix.resource.c.b.a.a(e.this.bXv, paramb1.bXA);
        e.this.bXv.write(paramb1.bXz);
      }
    }

    public final void a(com.tencent.matrix.resource.c.a.b paramb1, int paramInt, com.tencent.matrix.resource.c.a.b paramb2, byte[] paramArrayOfByte)
    {
      try
      {
        e.this.bXv.write(33);
        e.this.bXv.write(paramb1.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt);
        e.this.bXv.write(paramb2.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramArrayOfByte.length);
        e.this.bXv.write(paramArrayOfByte);
        return;
      }
      catch (Throwable paramb1)
      {
      }
      throw new RuntimeException(paramb1);
    }

    public final void b(int paramInt, com.tencent.matrix.resource.c.a.b paramb)
    {
      try
      {
        e.this.bXv.write(paramInt);
        e.this.bXv.write(paramb.bXC);
        if (paramInt == 1)
          com.tencent.matrix.resource.c.b.a.b(e.this.bXv, e.this.bXj);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void b(com.tencent.matrix.resource.c.a.b paramb, int paramInt)
    {
      try
      {
        e.this.bXv.write(6);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void b(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.bXv.write(3);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void c(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.bXv.write(8);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void d(com.tencent.matrix.resource.c.a.b paramb, int paramInt1, int paramInt2)
    {
      try
      {
        e.this.bXv.write(142);
        e.this.bXv.write(paramb.bXC);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt1);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXv, paramInt2);
        return;
      }
      catch (Throwable paramb)
      {
      }
      throw new RuntimeException(paramb);
    }

    public final void zn()
    {
      try
      {
        e.this.bXu.write(this.mTag);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXu, this.bXw);
        com.tencent.matrix.resource.c.b.a.b(e.this.bXu, e.this.bXv.size());
        e.this.bXu.write(e.this.bXv.toByteArray());
        e.this.bXv.reset();
        return;
      }
      catch (Throwable localThrowable)
      {
        throw new RuntimeException(localThrowable);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.e
 * JD-Core Version:    0.6.2
 */