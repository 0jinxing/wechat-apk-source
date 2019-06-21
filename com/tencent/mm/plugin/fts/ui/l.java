package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;

public final class l extends d
  implements e.b
{
  private ak ilv;
  private boolean mIF;
  private com.tencent.mm.plugin.fts.ui.d.l mJL;

  public l(e parame, String paramString, int paramInt)
  {
    super(parame);
    AppMethodBeat.i(61943);
    this.ilv = new ak();
    this.mJL = new com.tencent.mm.plugin.fts.ui.d.l(parame.getContext(), this, paramInt);
    this.mJL.mEq = paramString;
    AppMethodBeat.o(61943);
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61947);
    setCount(parame.vY(0));
    notifyDataSetChanged();
    T(getCount(), true);
    AppMethodBeat.o(61947);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(61946);
    paramBoolean = this.mJL.a(paramView, parama, paramBoolean);
    if ((parama.mFt) && (!this.mIF))
    {
      this.mIF = true;
      k.c(this.query, true, this.mJL.bAK(), -2);
    }
    if (paramBoolean)
    {
      clearCache();
      setCount(this.mJL.vY(0));
      notifyDataSetChanged();
      T(getCount(), true);
    }
    AppMethodBeat.o(61946);
    return paramBoolean;
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61945);
    this.mIF = false;
    this.mJL.a(this.query, this.ilv, new HashSet());
    AppMethodBeat.o(61945);
  }

  protected final int bAt()
  {
    AppMethodBeat.i(138528);
    int i = this.mJL.bAK();
    AppMethodBeat.o(138528);
    return i;
  }

  public final void finish()
  {
    AppMethodBeat.i(61948);
    super.finish();
    if (!this.mIF)
    {
      this.mIF = true;
      k.c(this.query, false, this.mJL.bAK(), -2);
    }
    AppMethodBeat.o(61948);
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61944);
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.mJL.vZ(paramInt);
    if (locala != null)
      locala.pageType = 3;
    AppMethodBeat.o(61944);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.l
 * JD-Core Version:    0.6.2
 */