package com.tencent.mm.plugin.mmsight.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  int cvd;
  int scene;

  public a$a(int paramInt)
  {
    AppMethodBeat.i(54953);
    this.cvd = 2;
    if (paramInt == 1)
    {
      this.scene = 1;
      AppMethodBeat.o(54953);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        this.scene = 2;
        AppMethodBeat.o(54953);
      }
      else if (paramInt == 512)
      {
        this.cvd = 1;
        this.scene = 2;
        AppMethodBeat.o(54953);
      }
      else
      {
        if (paramInt == 4)
          this.scene = 4;
        AppMethodBeat.o(54953);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(54954);
    String str = "VideoEditCountData{scene=" + this.scene + ", source=" + this.cvd + '}';
    AppMethodBeat.o(54954);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.a.a.a
 * JD-Core Version:    0.6.2
 */