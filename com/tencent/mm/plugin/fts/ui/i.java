package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import android.widget.AbsListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i extends d
  implements e.b
{
  private boolean gxV;
  private boolean iVX;
  private int mFl;
  private ak mHE;
  private boolean mIF;
  private com.tencent.mm.plugin.fts.a.d.e mIL;
  private com.tencent.mm.plugin.fts.ui.c.a mIM;
  private ak mIN;
  private boolean mIO;

  public i(e parame, int paramInt1, int paramInt2)
  {
    super(parame);
    AppMethodBeat.i(61836);
    this.mHE = new ak(Looper.getMainLooper());
    this.mIN = new i.1(this, Looper.getMainLooper());
    this.mFl = paramInt1;
    parame = getContext();
    int i = -1;
    int j = i;
    switch (paramInt1)
    {
    default:
      j = i;
    case -14:
    case -12:
    case -11:
    case -10:
    case -9:
    case -8:
    case -4:
    case -3:
    case -2:
    case -5:
    case -1:
    case -7:
    case -13:
    case -15:
    case -6:
    }
    while (true)
    {
      ab.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", new Object[] { Integer.valueOf(j), Integer.valueOf(j) });
      HashSet localHashSet = new HashSet();
      localHashSet.add(Integer.valueOf(j));
      this.mIL = ((com.tencent.mm.plugin.fts.a.d.e)((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).createFTSUIUnitList(localHashSet, parame, this, paramInt2).get(0));
      this.mIM = new com.tencent.mm.plugin.fts.ui.c.a();
      AppMethodBeat.o(61836);
      return;
      j = 4112;
      continue;
      j = 4128;
      continue;
      j = 4176;
      continue;
      j = 4144;
      continue;
      j = 4192;
      continue;
      j = 4208;
      continue;
      j = 4224;
      continue;
      j = 4240;
      continue;
      j = 4160;
    }
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61842);
    if (paramString.equals(this.query))
      this.gxV = false;
    setCount(parame.vY(0));
    notifyDataSetChanged();
    T(getCount(), true);
    this.mIM.mLr = System.currentTimeMillis();
    paramString = this.mIM;
    parame = ((a)parame).mHp.iterator();
    while (parame.hasNext())
    {
      e.a locala = (e.a)parame.next();
      int i = paramString.mLs;
      paramString.mLs = (locala.mFf.size() + i);
    }
    AppMethodBeat.o(61842);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(61840);
    this.mIL.a(paramView, parama, paramBoolean);
    if (parama.mFt)
    {
      ab.d("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.mFl), Integer.valueOf(parama.mFa), Integer.valueOf(parama.mFm), Integer.valueOf(parama.mFn), parama.mFo, Long.valueOf(parama.mFp) });
      if (!this.mIF)
      {
        k.c(this.query, true, bAt(), parama.mFl);
        this.mIF = true;
      }
      k.a(parama, this.mIM);
    }
    while (true)
    {
      AppMethodBeat.o(61840);
      return false;
      if ((parama instanceof h))
      {
        this.mIO = true;
        k.a(parama, this.mIM);
      }
    }
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61838);
    this.gxV = true;
    this.mIF = false;
    this.mIM.reset();
    this.mIL.a(this.query, this.mHE, new HashSet());
    AppMethodBeat.o(61838);
  }

  protected final int bAt()
  {
    AppMethodBeat.i(61844);
    int i = this.mIL.bAt();
    AppMethodBeat.o(61844);
    return i;
  }

  protected final void clearCache()
  {
    AppMethodBeat.i(61839);
    super.clearCache();
    this.mIL.clearData();
    this.mIL.bAr();
    this.mIN.removeMessages(1);
    AppMethodBeat.o(61839);
  }

  public final void finish()
  {
    AppMethodBeat.i(61841);
    if (!this.mIF)
    {
      this.mIF = true;
      if (!this.mIO)
        k.c(this.query, false, bAt(), this.mFl);
    }
    this.mIM.reset();
    super.finish();
    AppMethodBeat.o(61841);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(61843);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.iVX = true;
      ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().bzW();
      com.tencent.mm.plugin.sns.b.n.qFx.pause();
      ab.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is false");
      AppMethodBeat.o(61843);
    }
    while (true)
    {
      return;
      this.iVX = false;
      if (!((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().bzX())
      {
        this.mIN.removeMessages(1);
        this.mIN.sendEmptyMessageDelayed(1, 200L);
      }
      AppMethodBeat.o(61843);
    }
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61837);
    com.tencent.mm.plugin.fts.a.d.a.a locala = this.mIL.vZ(paramInt);
    if (locala != null)
    {
      locala.mFm = paramInt;
      locala.pageType = 2;
    }
    AppMethodBeat.o(61837);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.i
 * JD-Core Version:    0.6.2
 */