package com.google.android.exoplayer2.f;

import com.google.android.exoplayer2.b.g;
import java.nio.ByteBuffer;

public abstract class b extends g<h, i, f>
  implements e
{
  private final String name;

  protected b(String paramString)
  {
    super(new h[2], new i[2]);
    this.name = paramString;
    if (this.aSr == this.aSp.length);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      paramString = this.aSp;
      int j = paramString.length;
      while (i < j)
      {
        paramString[i].dD(1024);
        i++;
      }
    }
  }

  private f a(h paramh, i parami, boolean paramBoolean)
  {
    try
    {
      Object localObject = paramh.aEY;
      localObject = c(((ByteBuffer)localObject).array(), ((ByteBuffer)localObject).limit(), paramBoolean);
      parami.a(paramh.aSk, (d)localObject, paramh.aOr);
      parami.flags &= 2147483647;
      paramh = null;
      label50: return paramh;
    }
    catch (f paramh)
    {
      break label50;
    }
  }

  protected final void a(i parami)
  {
    super.a(parami);
  }

  public final void ai(long paramLong)
  {
  }

  protected abstract d c(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.b
 * JD-Core Version:    0.6.2
 */