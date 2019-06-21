package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum i$a
{
  int bTx;

  static
  {
    AppMethodBeat.i(115951);
    bTt = new a("NORMAL", 0, 0);
    bTu = new a("BOLD", 1, 1);
    bTv = new a("ITALIC", 2, 2);
    bTw = new a("BOLD_ITALIC", 3, 3);
    bTy = new a[] { bTt, bTu, bTv, bTw };
    AppMethodBeat.o(115951);
  }

  private i$a(int paramInt)
  {
    this.bTx = paramInt;
  }

  public static a i(boolean paramBoolean1, boolean paramBoolean2)
  {
    a locala;
    if ((paramBoolean1) && (paramBoolean2))
      locala = bTw;
    while (true)
    {
      return locala;
      if (paramBoolean1)
        locala = bTv;
      else if (paramBoolean2)
        locala = bTu;
      else
        locala = bTt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.i.a
 * JD-Core Version:    0.6.2
 */