package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.sdk.platformtools.ab;

final class CardDetailUI$3
  implements e.d
{
  CardDetailUI$3(CardDetailUI paramCardDetailUI)
  {
  }

  public final void GQ(String paramString)
  {
    AppMethodBeat.i(88275);
    CardDetailUI.a(this.kjb, paramString);
    AppMethodBeat.o(88275);
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(88280);
    CardDetailUI.a(this.kjb, paramb);
    CardDetailUI.b(this.kjb, paramb.aZZ());
    CardDetailUI.m(this.kjb).kaE = CardDetailUI.n(this.kjb);
    AppMethodBeat.o(88280);
  }

  public final void bco()
  {
    AppMethodBeat.i(88281);
    CardDetailUI.o(this.kjb);
    AppMethodBeat.o(88281);
  }

  public final void bcp()
  {
    AppMethodBeat.i(88274);
    CardDetailUI.i(this.kjb);
    AppMethodBeat.o(88274);
  }

  public final void bcq()
  {
    AppMethodBeat.i(88276);
    CardDetailUI.j(this.kjb);
    AppMethodBeat.o(88276);
  }

  public final void bcr()
  {
    AppMethodBeat.i(88277);
    CardDetailUI.k(this.kjb);
    AppMethodBeat.o(88277);
  }

  public final void bcs()
  {
    AppMethodBeat.i(88278);
    CardDetailUI.h(this.kjb);
    AppMethodBeat.o(88278);
  }

  public final void bct()
  {
    AppMethodBeat.i(88279);
    CardDetailUI.l(this.kjb);
    AppMethodBeat.o(88279);
  }

  public final void bcu()
  {
    AppMethodBeat.i(88282);
    ab.i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
    AppMethodBeat.o(88282);
  }

  public final void fJ(boolean paramBoolean)
  {
    AppMethodBeat.i(88283);
    ab.i("MicroMsg.CardDetailUI", "doMark()");
    CardDetailUI.p(this.kjb);
    CardDetailUI.q(this.kjb);
    CardDetailUI.a(this.kjb, paramBoolean);
    if (CardDetailUI.r(this.kjb).aZP())
    {
      am.bbi().M(CardDetailUI.n(this.kjb), l.Ht(CardDetailUI.r(this.kjb).bab()), 2);
      AppMethodBeat.o(88283);
    }
    while (true)
    {
      return;
      am.bbi().M(CardDetailUI.n(this.kjb), l.Ht(CardDetailUI.r(this.kjb).bab()), 1);
      AppMethodBeat.o(88283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailUI.3
 * JD-Core Version:    0.6.2
 */