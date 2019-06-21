package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
{
  public int x;
  public int y;
  public int z;

  public final b fT(int paramInt)
  {
    this.x = 1;
    this.y = 1;
    this.z = paramInt;
    return this;
  }

  public final String toString()
  {
    AppMethodBeat.i(115909);
    String str = "[" + this.x + ", " + this.y + ", " + this.z + "]";
    AppMethodBeat.o(115909);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.c.b
 * JD-Core Version:    0.6.2
 */