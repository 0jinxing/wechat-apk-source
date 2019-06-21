package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.j;
import com.tencent.mm.ui.MMActivity;

public final class c extends j
{
  public c(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public final void t(Drawable paramDrawable)
  {
    AppMethodBeat.i(42016);
    super.t(paramDrawable);
    AppMethodBeat.o(42016);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.c
 * JD-Core Version:    0.6.2
 */