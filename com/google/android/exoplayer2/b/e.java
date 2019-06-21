package com.google.android.exoplayer2.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class e extends a
{
  public ByteBuffer aEY;
  public final b aSj;
  public long aSk;
  public final int aSl;

  public e(int paramInt)
  {
    AppMethodBeat.i(94739);
    this.aSj = new b();
    this.aSl = paramInt;
    AppMethodBeat.o(94739);
  }

  private ByteBuffer dE(int paramInt)
  {
    AppMethodBeat.i(94744);
    Object localObject;
    if (this.aSl == 1)
    {
      localObject = ByteBuffer.allocate(paramInt);
      AppMethodBeat.o(94744);
    }
    while (true)
    {
      return localObject;
      if (this.aSl != 2)
        break;
      localObject = ByteBuffer.allocateDirect(paramInt);
      AppMethodBeat.o(94744);
    }
    if (this.aEY == null);
    for (int i = 0; ; i = this.aEY.capacity())
    {
      localObject = new IllegalStateException("Buffer too small (" + i + " < " + paramInt + ")");
      AppMethodBeat.o(94744);
      throw ((Throwable)localObject);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(94743);
    super.clear();
    if (this.aEY != null)
      this.aEY.clear();
    AppMethodBeat.o(94743);
  }

  public final void dD(int paramInt)
  {
    AppMethodBeat.i(94740);
    if (this.aEY == null)
    {
      this.aEY = dE(paramInt);
      AppMethodBeat.o(94740);
    }
    while (true)
    {
      return;
      int i = this.aEY.capacity();
      int j = this.aEY.position();
      paramInt = j + paramInt;
      if (i >= paramInt)
      {
        AppMethodBeat.o(94740);
      }
      else
      {
        ByteBuffer localByteBuffer = dE(paramInt);
        if (j > 0)
        {
          this.aEY.position(0);
          this.aEY.limit(j);
          localByteBuffer.put(this.aEY);
        }
        this.aEY = localByteBuffer;
        AppMethodBeat.o(94740);
      }
    }
  }

  public final boolean qK()
  {
    AppMethodBeat.i(94741);
    boolean bool = dC(1073741824);
    AppMethodBeat.o(94741);
    return bool;
  }

  public final void qL()
  {
    AppMethodBeat.i(94742);
    this.aEY.flip();
    AppMethodBeat.o(94742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.e
 * JD-Core Version:    0.6.2
 */