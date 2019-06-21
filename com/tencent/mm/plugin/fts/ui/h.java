package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.d.g;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;

public final class h extends d
  implements e.b
{
  private ak ilv;
  private boolean mIF;
  private g mII;

  public h(e parame, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    super(parame);
    AppMethodBeat.i(61824);
    this.ilv = new ak();
    this.mII = new g(parame.getContext(), this, paramInt1);
    this.mII.mEq = paramString2;
    this.mII.talker = paramString1;
    this.mII.mEp = paramString3;
    this.mII.showType = paramInt2;
    AppMethodBeat.o(61824);
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61828);
    setCount(parame.vY(0));
    notifyDataSetChanged();
    T(getCount(), true);
    AppMethodBeat.o(61828);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(61827);
    paramBoolean = this.mII.a(paramView, parama, paramBoolean);
    if ((parama.mFt) && (!this.mIF))
    {
      this.mIF = true;
      k.c(this.query, true, this.mII.bAK(), -2);
    }
    if (paramBoolean)
    {
      clearCache();
      setCount(this.mII.vY(0));
      notifyDataSetChanged();
      T(getCount(), true);
    }
    AppMethodBeat.o(61827);
    return paramBoolean;
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61826);
    this.mIF = false;
    this.mII.a(this.query, this.ilv, new HashSet());
    AppMethodBeat.o(61826);
  }

  protected final int bAt()
  {
    AppMethodBeat.i(138527);
    int i = this.mII.bAK();
    AppMethodBeat.o(138527);
    return i;
  }

  public final void finish()
  {
    AppMethodBeat.i(61829);
    super.finish();
    if (!this.mIF)
    {
      this.mIF = true;
      k.c(this.query, false, this.mII.bAK(), -2);
    }
    AppMethodBeat.o(61829);
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61825);
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.mII.vZ(paramInt);
    if (locala != null)
      locala.pageType = 5;
    AppMethodBeat.o(61825);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.h
 * JD-Core Version:    0.6.2
 */