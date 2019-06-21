package com.tencent.mm.audio.mix.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.d.h;
import com.tencent.mm.audio.mix.d.i;

public final class e extends i
{
  private f ckS;

  public e(f paramf, String paramString)
  {
    super(paramString);
    this.ckS = paramf;
  }

  public final void run()
  {
    AppMethodBeat.i(137007);
    if (this.ckS != null)
    {
      this.ckS.Dp();
      this.ckS.end();
    }
    this.ckS = null;
    h.b(this);
    AppMethodBeat.o(137007);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.a.e
 * JD-Core Version:    0.6.2
 */