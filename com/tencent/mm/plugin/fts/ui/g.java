package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.d.f;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.LinkedList;

public final class g extends d
  implements e.b
{
  private ak mHE;
  private f mIE;
  private boolean mIF;

  public g(e parame, String paramString, int paramInt)
  {
    super(parame);
    AppMethodBeat.i(61811);
    this.mHE = new ak(Looper.getMainLooper());
    parame = parame.getContext();
    HashSet localHashSet = new HashSet();
    localHashSet.add(Integer.valueOf(160));
    parame = (f)((n)com.tencent.mm.kernel.g.M(n.class)).createFTSUIUnitList(localHashSet, parame, this, paramInt).get(0);
    parame.mEp = paramString;
    if (t.kH(paramString))
      parame.mIy = ((c)com.tencent.mm.kernel.g.K(c.class)).XV().oa(paramString);
    this.mIE = parame;
    AppMethodBeat.o(61811);
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61812);
    setCount(parame.vY(0));
    notifyDataSetChanged();
    T(getCount(), true);
    AppMethodBeat.o(61812);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(61815);
    this.mIE.a(paramView, parama, paramBoolean);
    if ((parama.mFt) && (!this.mIF))
    {
      this.mIF = true;
      k.c(this.query, true, this.mIE.bAK(), -2);
    }
    AppMethodBeat.o(61815);
    return false;
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61814);
    this.mIF = false;
    this.mIE.a(this.query, this.mHE, new HashSet());
    AppMethodBeat.o(61814);
  }

  protected final int bAt()
  {
    AppMethodBeat.i(138526);
    int i = this.mIE.bAK();
    AppMethodBeat.o(138526);
    return i;
  }

  public final void finish()
  {
    AppMethodBeat.i(61816);
    super.finish();
    if (!this.mIF)
    {
      this.mIF = true;
      k.c(this.query, false, this.mIE.bAK(), -2);
    }
    AppMethodBeat.o(61816);
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61813);
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.mIE.vZ(paramInt);
    if (locala != null)
    {
      locala.mFm = paramInt;
      locala.pageType = 4;
    }
    AppMethodBeat.o(61813);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.g
 * JD-Core Version:    0.6.2
 */