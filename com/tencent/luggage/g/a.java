package com.tencent.luggage.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class a extends InputStream
{
  public final ByteBuffer bRy;
  private int bRz;

  public a(ByteBuffer paramByteBuffer)
  {
    this.bRy = paramByteBuffer;
  }

  public static void j(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(90872);
    Object localObject;
    if (paramByteBuffer.getClass().getName().equals("java.nio.DirectByteBuffer"))
      localObject = paramByteBuffer.getClass();
    try
    {
      localObject = ((Class)localObject).getDeclaredMethod("free", new Class[0]);
      boolean bool = ((Method)localObject).isAccessible();
      ((Method)localObject).setAccessible(true);
      ((Method)localObject).invoke(paramByteBuffer, new Object[0]);
      ((Method)localObject).setAccessible(bool);
      System.gc();
      AppMethodBeat.o(90872);
      return;
    }
    catch (Exception paramByteBuffer)
    {
      while (true)
        ab.d("MicroMsg.ByteBufferBackedInputStream", "free ByteBuffer, exp = %s", new Object[] { paramByteBuffer });
    }
  }

  public final int available()
  {
    AppMethodBeat.i(90864);
    int i = this.bRy.remaining();
    AppMethodBeat.o(90864);
    return i;
  }

  public final void close()
  {
    AppMethodBeat.i(90867);
    super.close();
    j(this.bRy);
    AppMethodBeat.o(90867);
  }

  public final long getLength()
  {
    AppMethodBeat.i(90871);
    long l = this.bRy.limit();
    AppMethodBeat.o(90871);
    return l;
  }

  public final void mark(int paramInt)
  {
    try
    {
      AppMethodBeat.i(90868);
      this.bRz = this.bRy.position();
      AppMethodBeat.o(90868);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean markSupported()
  {
    return true;
  }

  public final int read()
  {
    AppMethodBeat.i(90865);
    int i;
    if (this.bRy.hasRemaining())
    {
      i = this.bRy.get() & 0xFF;
      AppMethodBeat.o(90865);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(90865);
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(90866);
    if (!this.bRy.hasRemaining())
    {
      paramInt1 = -1;
      AppMethodBeat.o(90866);
    }
    while (true)
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, this.bRy.remaining());
      this.bRy.get(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(90866);
      paramInt1 = paramInt2;
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(90870);
      this.bRy.position(this.bRz);
      AppMethodBeat.o(90870);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void seek(int paramInt)
  {
    try
    {
      AppMethodBeat.i(90869);
      this.bRy.position(paramInt);
      AppMethodBeat.o(90869);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.a
 * JD-Core Version:    0.6.2
 */