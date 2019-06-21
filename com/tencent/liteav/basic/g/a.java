package com.tencent.liteav.basic.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
  implements Cloneable
{
  public int a;
  public int b;
  public int c;
  public int d;
  public long e;
  public byte[] f;

  public Object clone()
  {
    AppMethodBeat.i(66081);
    try
    {
      a locala = (a)super.clone();
      AppMethodBeat.o(66081);
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (true)
        Object localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.g.a
 * JD-Core Version:    0.6.2
 */