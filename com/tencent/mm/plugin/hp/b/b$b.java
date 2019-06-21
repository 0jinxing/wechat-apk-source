package com.tencent.mm.plugin.hp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$b
{
  public final int value;

  static
  {
    AppMethodBeat.i(90554);
    ntx = new b("SCENE_PATCH", 0, 0);
    nty = new b("SCENE_LOAD", 1, 1);
    ntz = new b("SCENE_CHECK", 2, 2);
    ntA = new b[] { ntx, nty, ntz };
    AppMethodBeat.o(90554);
  }

  private b$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.b.b
 * JD-Core Version:    0.6.2
 */