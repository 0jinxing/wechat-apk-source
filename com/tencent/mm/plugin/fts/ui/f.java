package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.u;
import java.util.HashSet;
import java.util.List;

public final class f extends d
  implements com.tencent.mm.plugin.fts.a.l
{
  private ak ilv;
  private j mEm;
  private String mEp;
  private com.tencent.mm.plugin.fts.a.a.a mEx;
  private u mIy;

  public f(e parame, String paramString)
  {
    super(parame);
    AppMethodBeat.i(61785);
    this.ilv = new ak();
    this.mEp = paramString;
    if (t.mN(paramString))
      this.mIy = ((c)g.K(c.class)).XV().oa(paramString);
    AppMethodBeat.o(61785);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    return false;
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(61788);
    switch (paramj.bFZ)
    {
    default:
    case 0:
    case -3:
    case -2:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(61788);
      while (true)
      {
        return;
        this.mEm = paramj;
        setCount(paramj.mEy.size());
        notifyDataSetChanged();
        T(getCount(), true);
        AppMethodBeat.o(61788);
      }
      setCount(0);
      notifyDataSetChanged();
      T(getCount(), true);
    }
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61787);
    clearCache();
    if (this.mEx != null)
      ((n)g.M(n.class)).cancelSearchTask(this.mEx);
    i locali = new i();
    locali.query = this.query;
    locali.mEp = this.mEp;
    locali.mEv = com.tencent.mm.plugin.fts.a.c.e.mEY;
    locali.mEu.add("create_talker_message​");
    locali.mEw = this;
    locali.handler = this.ilv;
    locali.hbo = 3;
    this.mEx = ((n)g.M(n.class)).search(3, locali);
    ab.i("MicroMSsg.FTS.FTSChattingConvAdapter", "do search %s", new Object[] { this.query });
    AppMethodBeat.o(61787);
  }

  public final void finish()
  {
    AppMethodBeat.i(61789);
    super.finish();
    if (this.mEx != null)
      ((n)g.M(n.class)).cancelSearchTask(this.mEx);
    AppMethodBeat.o(61789);
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61786);
    com.tencent.mm.plugin.fts.ui.a.d locald = new com.tencent.mm.plugin.fts.ui.a.d(paramInt);
    locald.hpS = ((com.tencent.mm.plugin.fts.a.a.l)this.mEm.mEy.get(paramInt));
    locald.mDz = this.mEm.mDz;
    locald.mFl = -14;
    locald.mIy = this.mIy;
    locald.mFm = paramInt;
    locald.pageType = 6;
    if (locald.position == getCount() - 1)
      locald.mFk = true;
    AppMethodBeat.o(61786);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.f
 * JD-Core Version:    0.6.2
 */