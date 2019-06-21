package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.sdk.platformtools.ah;

final class ak$a extends e
{
  private String[] jhf;

  ak$a()
  {
    super(new ak.c(ah.getContext()));
    AppMethodBeat.i(134284);
    this.jhf = null;
    this.jhf = ah.getContext().getResources().getStringArray(2131755038);
    AppMethodBeat.o(134284);
  }

  public final int aRs()
  {
    return 0;
  }

  public final int aRt()
  {
    if (this.jhf != null);
    for (int i = this.jhf.length; ; i = 0)
      return i;
  }

  public final String getText(int paramInt)
  {
    AppMethodBeat.i(134287);
    String str = qK(paramInt);
    AppMethodBeat.o(134287);
    return str;
  }

  public final Drawable qJ(int paramInt)
  {
    AppMethodBeat.i(134285);
    f.aQv();
    ak.b localb = new ak.b(qK(paramInt), ak.access$000(), (byte)0);
    AppMethodBeat.o(134285);
    return localb;
  }

  public final String qK(int paramInt)
  {
    AppMethodBeat.i(134286);
    Object localObject1;
    if ((this.jhf == null) || (paramInt < 0) || (paramInt > this.jhf.length - 1))
    {
      localObject1 = "";
      AppMethodBeat.o(134286);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = this.jhf[paramInt].split(" ");
      localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      localObject2 = Character.toChars(Integer.decode(localObject2[1]).intValue());
      localObject1 = (char[])localObject1 + (char[])localObject2;
      AppMethodBeat.o(134286);
    }
  }

  public final String qL(int paramInt)
  {
    AppMethodBeat.i(134288);
    String str = qK(paramInt);
    AppMethodBeat.o(134288);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ak.a
 * JD-Core Version:    0.6.2
 */