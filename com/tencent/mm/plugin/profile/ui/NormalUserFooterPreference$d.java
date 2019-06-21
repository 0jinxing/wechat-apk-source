package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import junit.framework.Assert;

final class NormalUserFooterPreference$d extends NormalUserFooterPreference.a
{
  public NormalUserFooterPreference$d(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void cbn()
  {
    AppMethodBeat.i(23710);
    Assert.assertTrue(t.nl(NormalUserFooterPreference.a(this.poR).field_username));
    NormalUserFooterPreference.r(this.poR).setVisibility(8);
    NormalUserFooterPreference.s(this.poR).setVisibility(8);
    NormalUserFooterPreference.t(this.poR).setVisibility(8);
    NormalUserFooterPreference.f(this.poR).setVisibility(0);
    NormalUserFooterPreference.g(this.poR).setVisibility(8);
    NormalUserFooterPreference.h(this.poR).setVisibility(8);
    NormalUserFooterPreference.k(this.poR).setVisibility(8);
    NormalUserFooterPreference.q(this.poR).setVisibility(8);
    AppMethodBeat.o(23710);
  }

  protected final void cbp()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.d
 * JD-Core Version:    0.6.2
 */