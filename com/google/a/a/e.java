package com.google.a.a;

import java.io.IOException;

public abstract class e
{
  protected volatile int bxt = -1;

  public static <T extends e> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      a locala = new com/google/a/a/a;
      locala.<init>(paramArrayOfByte, paramInt);
      paramT.a(locala);
      locala.fm(0);
      return paramT;
    }
    catch (d paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
    }
    throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
  }

  public static final byte[] b(e parame)
  {
    byte[] arrayOfByte = new byte[parame.vq()];
    int i = arrayOfByte.length;
    try
    {
      b localb = new com/google/a/a/b;
      localb.<init>(arrayOfByte, i);
      parame.a(localb);
      if (localb.limit - localb.position != 0)
      {
        parame = new java/lang/IllegalStateException;
        parame.<init>("Did not write as much data as expected.");
        throw parame;
      }
    }
    catch (IOException parame)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parame);
    }
    return arrayOfByte;
  }

  public abstract e a(a parama);

  public void a(b paramb)
  {
  }

  public String toString()
  {
    return f.c(this);
  }

  public final int vp()
  {
    if (this.bxt < 0)
      vq();
    return this.bxt;
  }

  public final int vq()
  {
    int i = vr();
    this.bxt = i;
    return i;
  }

  protected int vr()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.a.a.e
 * JD-Core Version:    0.6.2
 */