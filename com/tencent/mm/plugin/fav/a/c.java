package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bl;
import com.tencent.mm.sdk.e.c.a;

public final class c extends bl
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(102622);
    ccO = bl.Hm();
    AppMethodBeat.o(102622);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean buq()
  {
    if (this.field_dataType == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final float getProgress()
  {
    AppMethodBeat.i(102621);
    float f = Math.max(0.0F, Math.min(99.0F, this.field_offset / this.field_totalLen) * 100.0F);
    AppMethodBeat.o(102621);
    return f;
  }

  public final boolean isFinished()
  {
    if (this.field_status == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.c
 * JD-Core Version:    0.6.2
 */