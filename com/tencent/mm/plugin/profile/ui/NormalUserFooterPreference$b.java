package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;

final class NormalUserFooterPreference$b extends NormalUserFooterPreference.c
{
  public NormalUserFooterPreference$b(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void cbn()
  {
    AppMethodBeat.i(23698);
    NormalUserFooterPreference.r(this.poR).setVisibility(8);
    if ((!a.jh(NormalUserFooterPreference.a(this.poR).field_type)) || ((a.jh(NormalUserFooterPreference.a(this.poR).field_type)) && (ad.mR(NormalUserFooterPreference.a(this.poR).field_username))))
    {
      NormalUserFooterPreference.s(this.poR).setVisibility(0);
      NormalUserFooterPreference.f(this.poR).setVisibility(8);
      NormalUserFooterPreference.g(this.poR).setVisibility(8);
      NormalUserFooterPreference.h(this.poR).setVisibility(8);
    }
    while (true)
    {
      NormalUserFooterPreference.t(this.poR).setVisibility(8);
      NormalUserFooterPreference.k(this.poR).setVisibility(8);
      NormalUserFooterPreference.q(this.poR).setVisibility(8);
      if (NormalUserFooterPreference.B(this.poR))
      {
        NormalUserFooterPreference.s(this.poR).setVisibility(8);
        NormalUserFooterPreference.t(this.poR).setVisibility(0);
        NormalUserFooterPreference.t(this.poR).setOnClickListener(new NormalUserFooterPreference.b.1(this));
      }
      NormalUserFooterPreference.A(this.poR).setOnClickListener(new NormalUserFooterPreference.b.2(this));
      AppMethodBeat.o(23698);
      return;
      NormalUserFooterPreference.s(this.poR).setVisibility(8);
      NormalUserFooterPreference.f(this.poR).setVisibility(0);
      if ((this.poR.cbk()) || (NormalUserFooterPreference.a(this.poR).field_username.equals(r.Yz())))
        break;
      NormalUserFooterPreference.h(this.poR).setVisibility(0);
    }
  }

  protected final void cbp()
  {
    AppMethodBeat.i(23697);
    if (NormalUserFooterPreference.a(this.poR) == null)
    {
      ab.e("MicroMsg.NormalUserFooterPreference", "contact is null in NearByFriendHandler");
      AppMethodBeat.o(23697);
    }
    while (true)
    {
      return;
      if ((!a.jh(NormalUserFooterPreference.a(this.poR).field_type)) || ((a.jh(NormalUserFooterPreference.a(this.poR).field_type)) && (ad.mR(NormalUserFooterPreference.a(this.poR).field_username))))
      {
        if (ad.mR(NormalUserFooterPreference.a(this.poR).field_username))
        {
          F(true, true);
          AppMethodBeat.o(23697);
        }
        else
        {
          F(false, true);
          AppMethodBeat.o(23697);
        }
      }
      else
      {
        cbo();
        AppMethodBeat.o(23697);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.b
 * JD-Core Version:    0.6.2
 */