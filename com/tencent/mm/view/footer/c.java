package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.br.b;
import com.tencent.mm.sdk.platformtools.d;

public final class c extends a
{
  private Bitmap Adg;
  private Bitmap Adh;

  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  protected final boolean QG(int paramInt)
  {
    AppMethodBeat.i(116447);
    boolean bool = super.QG(paramInt);
    switch (c.1.vwX[QF(paramInt).ordinal()])
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(116447);
      return bool;
      bool = false;
    }
  }

  protected final Bitmap a(e parame, boolean paramBoolean)
  {
    Bitmap localBitmap = null;
    if (parame == e.ccM)
      if (!paramBoolean)
        break label20;
    label20: for (localBitmap = this.Adh; ; localBitmap = this.Adg)
      return localBitmap;
  }

  protected final void dMO()
  {
    AppMethodBeat.i(116446);
    super.dMO();
    this.Adg = d.v(getResources().getDrawable(2131231170));
    this.Adh = d.v(getResources().getDrawable(2131231169));
    AppMethodBeat.o(116446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.footer.c
 * JD-Core Version:    0.6.2
 */