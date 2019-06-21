package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;

final class NormalUserFooterPreference$f extends NormalUserFooterPreference.a
{
  public NormalUserFooterPreference$f(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void cbn()
  {
    AppMethodBeat.i(23713);
    NormalUserFooterPreference.r(this.poR).setVisibility(8);
    NormalUserFooterPreference.s(this.poR).setVisibility(0);
    NormalUserFooterPreference.t(this.poR).setVisibility(8);
    NormalUserFooterPreference.f(this.poR).setVisibility(8);
    NormalUserFooterPreference.g(this.poR).setVisibility(8);
    NormalUserFooterPreference.h(this.poR).setVisibility(8);
    NormalUserFooterPreference.k(this.poR).setVisibility(8);
    NormalUserFooterPreference.q(this.poR).setVisibility(8);
    NormalUserFooterPreference.A(this.poR).setOnClickListener(new NormalUserFooterPreference.f.1(this));
    AppMethodBeat.o(23713);
  }

  protected final void cbp()
  {
    AppMethodBeat.i(23712);
    if ((NormalUserFooterPreference.a(this.poR) != null) && (a.jh(NormalUserFooterPreference.a(this.poR).field_type)))
    {
      cbo();
      AppMethodBeat.o(23712);
    }
    while (true)
    {
      return;
      F(false, true);
      AppMethodBeat.o(23712);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.f
 * JD-Core Version:    0.6.2
 */