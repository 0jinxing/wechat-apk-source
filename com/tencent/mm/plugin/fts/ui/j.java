package com.tencent.mm.plugin.fts.ui;

import android.os.Looper;
import android.view.View;
import android.widget.AbsListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.g.a.qp.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.fts.ui.a.i;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class j extends d
  implements e.b
{
  private boolean iVX;
  private ak mHE;
  int mHU;
  boolean mIF;
  boolean mIO;
  private List<com.tencent.mm.plugin.fts.a.d.e> mIR;
  com.tencent.mm.plugin.fts.ui.c.b mIS;
  private j.b mIT;
  private long mIU;
  private long mIV;
  private long mIW;
  private long mIX;
  private ak mIY;
  private int mIZ;
  boolean mJa;
  private boolean mJb;

  public j(e parame, int paramInt, j.b paramb)
  {
    super(parame);
    AppMethodBeat.i(61852);
    this.mIT = null;
    this.mHU = 1;
    this.mIY = new j.1(this, Looper.getMainLooper());
    this.mHE = new ak(Looper.getMainLooper());
    this.mIZ = -1;
    this.mIS = new com.tencent.mm.plugin.fts.ui.c.b();
    HashSet localHashSet = new HashSet();
    localHashSet.add(Integer.valueOf(16));
    localHashSet.add(Integer.valueOf(32));
    localHashSet.add(Integer.valueOf(48));
    localHashSet.add(Integer.valueOf(64));
    localHashSet.add(Integer.valueOf(128));
    localHashSet.add(Integer.valueOf(96));
    localHashSet.add(Integer.valueOf(112));
    if (com.tencent.mm.kernel.g.RK())
    {
      qp localqp = new qp();
      com.tencent.mm.sdk.b.a.xxA.m(localqp);
      parame = com.tencent.mm.model.c.c.abi().ll("100193");
      if ((!parame.isValid()) || (!"1".equals(parame.dru().get("isOpenLocalSearch"))) || (!localqp.cMI.cMK));
    }
    while (true)
    {
      if (i != 0)
        localHashSet.add(Integer.valueOf(144));
      if (com.tencent.mm.modelappbrand.a.abu())
        localHashSet.add(Integer.valueOf(208));
      this.mIR = ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).createFTSUIUnitList(localHashSet, getContext(), this, paramInt);
      this.mIT = paramb;
      AppMethodBeat.o(61852);
      return;
      i = 0;
    }
  }

  private void c(HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(61862);
    this.mIZ += 1;
    if (this.mIZ < this.mIR.size())
      ((com.tencent.mm.plugin.fts.a.d.e)this.mIR.get(this.mIZ)).a(this.query, this.mHE, paramHashSet);
    AppMethodBeat.o(61862);
  }

  private int wc(int paramInt)
  {
    AppMethodBeat.i(61859);
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mIR.iterator();
    while (localIterator.hasNext())
      localArrayList.addAll(((com.tencent.mm.plugin.fts.a.d.e)localIterator.next()).bAs());
    int j = localArrayList.size() - 1;
    if (j >= 0)
    {
      if (paramInt < ((Integer)localArrayList.get(j)).intValue())
        break label110;
      i++;
    }
    label110: 
    while (true)
    {
      j--;
      break;
      AppMethodBeat.o(61859);
      return i;
    }
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.e parame, String paramString)
  {
    AppMethodBeat.i(61861);
    Object localObject = (a)parame;
    if (paramString.equals(this.query))
      c(((a)localObject).mEu);
    if ((((a)localObject).bAK() > 0) && (this.mIU == 0L))
    {
      this.mIU = (System.currentTimeMillis() - this.mIl);
      k.M(9, this.mIU);
      ab.i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", new Object[] { Long.valueOf(this.mIU) });
    }
    com.tencent.mm.plugin.fts.ui.c.b localb;
    Iterator localIterator;
    switch (((a)localObject).getType())
    {
    default:
      localb = this.mIS;
      localIterator = ((a)localObject).mHp.iterator();
    case 16:
    case 32:
    case 48:
    }
    while (true)
    {
      if (!localIterator.hasNext())
        break label600;
      localObject = (e.a)localIterator.next();
      switch (((e.a)localObject).businessType)
      {
      case -14:
      case -12:
      case -10:
      case -9:
      default:
        break;
      case -15:
        localb.mLB = ((e.a)localObject).mFf.size();
        continue;
        if (this.mIV != 0L)
          break;
        this.mIV = (System.currentTimeMillis() - this.mIl);
        ab.i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", new Object[] { Long.valueOf(this.mIV) });
        k.M(0, this.mIV);
        break;
        if (this.mIW != 0L)
          break;
        this.mIW = (System.currentTimeMillis() - this.mIl);
        ab.i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", new Object[] { Long.valueOf(this.mIW) });
        k.M(3, this.mIW);
        break;
        if (this.mIX != 0L)
          break;
        this.mIX = (System.currentTimeMillis() - this.mIl);
        ab.i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", new Object[] { Long.valueOf(this.mIX) });
        k.M(6, this.mIX);
        break;
      case -2:
        localb.mLx = ((e.a)localObject).mFf.size();
        break;
      case -4:
        localb.mLu = ((e.a)localObject).mFf.size();
        break;
      case -6:
        localb.mLy = ((e.a)localObject).mFf.size();
        break;
      case -3:
        localb.mLv = ((e.a)localObject).mFf.size();
        break;
      case -1:
        localb.mLz = ((e.a)localObject).mFf.size();
        break;
      case -11:
        localb.mLC = ((e.a)localObject).mFf.size();
        break;
      case -7:
        localb.mLw = ((e.a)localObject).mFf.size();
        break;
      case -5:
        localb.mLA = ((e.a)localObject).mFf.size();
        break;
      case -8:
        localb.mLt = ((e.a)localObject).mFf.size();
        break;
      case -13:
        localb.mLD = ((e.a)localObject).mFf.size();
      }
    }
    label600: new j.a(this, parame, paramString).run();
    AppMethodBeat.o(61861);
  }

  protected final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(61858);
    Iterator localIterator = this.mIR.iterator();
    boolean bool;
    do
    {
      if (!localIterator.hasNext())
        break;
      bool = ((com.tencent.mm.plugin.fts.a.d.e)localIterator.next()).a(paramView, parama, paramBoolean);
      paramBoolean = bool;
    }
    while (!bool);
    if ((!this.mIF) && (!(parama instanceof com.tencent.mm.plugin.fts.ui.a.n)))
    {
      k.a(this.query, true, bAt(), 0, this.mIS);
      this.mIF = true;
    }
    if (parama.mFt)
    {
      this.mJb = true;
      ab.d("MicroMsg.FTS.FTSMainAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.mFl), Integer.valueOf(parama.mFa), Integer.valueOf(parama.mFm), Integer.valueOf(parama.mFn), parama.mFo, Long.valueOf(parama.mFp) });
      if (!bo.isNullOrNil(this.query))
        an.l(this.query, this.mHU, 1, 3);
      this.mIS.mLE = wc(parama.position);
      k.a(parama, this.mIS);
      AppMethodBeat.o(61858);
      paramBoolean = true;
      return paramBoolean;
    }
    if ((parama instanceof h))
    {
      this.mIO = true;
      if (!bo.isNullOrNil(this.query))
        an.l(this.query, this.mHU, 1, 3);
      this.mIS.mLE = wc(parama.position);
      k.a(parama, this.mIS);
    }
    while (true)
    {
      AppMethodBeat.o(61858);
      paramBoolean = false;
      break;
      if ((parama instanceof i))
      {
        this.mIS.mLE = wc(parama.position);
        k.a(parama, this.mIS);
      }
    }
  }

  protected final void bAL()
  {
    AppMethodBeat.i(61854);
    this.mIF = false;
    this.mIO = false;
    this.mIZ = -1;
    this.mJa = false;
    k.a(this.mIS);
    this.mIS.reset();
    this.mIS.query = this.query;
    this.mHU = 1;
    this.mIU = 0L;
    this.mIV = 0L;
    this.mIW = 0L;
    this.mIX = 0L;
    HashSet localHashSet = new HashSet();
    localHashSet.add("filehelper");
    boolean bool1 = r.Ze();
    boolean bool2 = bool1;
    if (!bool1)
    {
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("BindQQSwitch"), 1) == 1)
        bool2 = true;
    }
    else
    {
      if (!bool2)
      {
        ab.i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
        localHashSet.add("22");
        localHashSet.add("23");
      }
      if (!com.tencent.mm.modelappbrand.a.abu())
        localHashSet.add("61");
      localHashSet.add("62");
      if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
      {
        ab.i("MicroMsg.FTS.FTSMainAdapter", "checkLookVisibility EuropeanUnionCountry");
        localHashSet.add("65");
      }
      if (!((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVO())
        break label276;
      localHashSet.add("63");
    }
    while (true)
    {
      ab.d("MicroMsg.FTS.FTSMainAdapter", "summerqq doSearch blockSet[%d]", new Object[] { Integer.valueOf(localHashSet.size()) });
      c(localHashSet);
      AppMethodBeat.o(61854);
      return;
      bool2 = false;
      break;
      label276: localHashSet.add("67");
    }
  }

  protected final int bAt()
  {
    AppMethodBeat.i(61865);
    Iterator localIterator = this.mIR.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((com.tencent.mm.plugin.fts.a.d.e)localIterator.next()).bAt() + i);
    AppMethodBeat.o(61865);
    return i;
  }

  protected final void clearCache()
  {
    AppMethodBeat.i(61856);
    super.clearCache();
    Iterator localIterator = this.mIR.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.a.d.e locale = (com.tencent.mm.plugin.fts.a.d.e)localIterator.next();
      locale.bAr();
      locale.clearData();
    }
    AppMethodBeat.o(61856);
  }

  public final void finish()
  {
    AppMethodBeat.i(61855);
    if (!this.mIF)
    {
      this.mIF = true;
      if (!this.mIO)
        k.a(this.query, false, bAt(), 0, this.mIS);
    }
    if ((!this.mIO) && (!this.mJb))
      an.l(this.query, this.mHU, 3, 3);
    this.mIS.reset();
    super.finish();
    AppMethodBeat.o(61855);
  }

  public final int getBlockCount()
  {
    AppMethodBeat.i(61860);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mIR.iterator();
    while (localIterator.hasNext())
      localArrayList.addAll(((com.tencent.mm.plugin.fts.a.d.e)localIterator.next()).bAs());
    int i = localArrayList.size();
    AppMethodBeat.o(61860);
    return i;
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(61863);
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if ((paramAbsListView.getLastVisiblePosition() == getCount()) && (this.mJa))
    {
      this.mHU = 2;
      if (this.mIT == null)
        break label86;
      this.mIT.bAY();
      this.mIT.bAZ();
      AppMethodBeat.o(61863);
    }
    while (true)
    {
      return;
      if (this.mIT != null)
        this.mIT.bBa();
      label86: AppMethodBeat.o(61863);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(61864);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.iVX = true;
      ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().bzW();
      com.tencent.mm.plugin.sns.b.n.qFx.pause();
      AppMethodBeat.o(61864);
    }
    while (true)
    {
      return;
      this.iVX = false;
      if (!((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSImageLoader().bzX())
      {
        this.mIY.removeMessages(1);
        this.mIY.sendEmptyMessageDelayed(1, 200L);
      }
      AppMethodBeat.o(61864);
    }
  }

  public final void stopSearch()
  {
    AppMethodBeat.i(61857);
    this.mIY.removeMessages(1);
    super.stopSearch();
    AppMethodBeat.o(61857);
  }

  protected final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    AppMethodBeat.i(61853);
    Object localObject1 = null;
    Object localObject2 = this.mIR.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((com.tencent.mm.plugin.fts.a.d.e)((Iterator)localObject2).next()).vZ(paramInt);
      localObject1 = localObject3;
      if (localObject3 != null)
        localObject1 = localObject3;
    }
    if (localObject1 != null)
    {
      localObject2 = new LinkedList();
      localObject3 = this.mIR.iterator();
      while (((Iterator)localObject3).hasNext())
        ((LinkedList)localObject2).addAll(((com.tencent.mm.plugin.fts.a.d.e)((Iterator)localObject3).next()).bAs());
      i = ((LinkedList)localObject2).size() - 1;
      if (i < 0)
        break label205;
      if (paramInt <= ((Integer)((LinkedList)localObject2).get(i)).intValue())
        break label199;
    }
    label199: label205: for (int i = paramInt - i; ; i = paramInt)
    {
      localObject1.mFm = i;
      localObject1.pageType = 1;
      if (localObject1 == null)
        ab.e("MicroMsg.FTS.FTSMainAdapter", "Create Data Item Error: getCount-%d position-%d", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(61853);
      return localObject1;
      i--;
      break;
    }
  }

  public final void wd(int paramInt)
  {
    this.mIS.mLF = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.j
 * JD-Core Version:    0.6.2
 */