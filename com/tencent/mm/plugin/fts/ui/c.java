package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;

public final class c extends d
  implements e.b
{
  private com.tencent.mm.plugin.fts.ui.d.a mHC;
  protected boolean mHD;
  private ak mHE;

  public c(e parame)
  {
    super(parame);
    AppMethodBeat.i(61720);
    this.mHE = new ak(Looper.getMainLooper());
    this.mHC = new com.tencent.mm.plugin.fts.ui.d.a(parame.getContext(), this, 0);
    AppMethodBeat.o(61720);
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61723);
    int i = this.mHC.vY(0);
    setCount(i);
    notifyDataSetChanged();
    T(i, true);
    AppMethodBeat.o(61723);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    return false;
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61722);
    this.mHD = false;
    this.mHC.a(this.query, this.mHE, new HashSet());
    AppMethodBeat.o(61722);
  }

  protected final int bAt()
  {
    AppMethodBeat.i(61724);
    int i = this.mHC.bAK();
    AppMethodBeat.o(61724);
    return i;
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61721);
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.mHC.vZ(paramInt);
    AppMethodBeat.o(61721);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.c
 * JD-Core Version:    0.6.2
 */