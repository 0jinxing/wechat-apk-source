package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.contact.a.c;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.a.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q extends m
{
  private int count;
  private ak handler;
  private com.tencent.mm.plugin.fts.a.a.g mDz;
  private com.tencent.mm.plugin.fts.a.a.a mEx;
  private List<com.tencent.mm.plugin.fts.a.a.l> mGW;
  private List<com.tencent.mm.plugin.fts.a.a.l> oov;
  private String query;
  private int zkK;
  private int zkL;
  private List<String> znn;
  private int zno;
  private int znp;
  private int znq;
  private boolean znr;
  private int zns;
  private boolean znt;
  private int znu;
  private List<com.tencent.mm.plugin.fts.a.a.l> znv;
  private List<com.tencent.mm.plugin.fts.a.a.l> znw;
  private List<Integer> znx;
  private com.tencent.mm.plugin.fts.a.l zny;
  protected com.tencent.mm.plugin.fts.a.l znz;

  public q(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramBoolean, paramInt);
    AppMethodBeat.i(105233);
    this.zno = 2147483647;
    this.znp = 2147483647;
    this.znq = 2147483647;
    this.znr = true;
    this.zns = 2147483647;
    this.zkK = 2147483647;
    this.znt = true;
    this.znu = 2147483647;
    this.zkL = 2147483647;
    this.znv = null;
    this.oov = null;
    this.mGW = null;
    this.znw = null;
    this.handler = new ak(Looper.getMainLooper());
    this.zny = new q.1(this);
    this.znz = new q.2(this);
    this.count = 0;
    this.znn = paramList;
    this.znx = new ArrayList();
    ab.i("MicroMsg.MMSearchContactAdapter", "Create!");
    Kh();
    AppMethodBeat.o(105233);
  }

  private void Kh()
  {
    AppMethodBeat.i(105238);
    ab.i("MicroMsg.MMSearchContactAdapter", "initData!");
    this.query = null;
    dIe();
    clearTask();
    clearCache();
    AppMethodBeat.o(105238);
  }

  private void clearTask()
  {
    AppMethodBeat.i(105236);
    if (this.mEx != null)
    {
      ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.mEx);
      this.mEx = null;
    }
    AppMethodBeat.o(105236);
  }

  private void dIe()
  {
    AppMethodBeat.i(105237);
    this.znp = 2147483647;
    this.znq = 2147483647;
    this.znr = true;
    this.zns = 2147483647;
    this.zkK = 2147483647;
    this.znt = true;
    this.znu = 2147483647;
    this.zkL = 2147483647;
    this.znv = null;
    this.oov = null;
    this.mGW = null;
    this.znw = null;
    this.mDz = null;
    clearCache();
    notifyDataSetChanged();
    AppMethodBeat.o(105237);
  }

  private static int fp(List<? extends Object> paramList)
  {
    AppMethodBeat.i(105241);
    int i;
    if (paramList == null)
    {
      i = 0;
      AppMethodBeat.o(105241);
    }
    while (true)
    {
      return i;
      i = paramList.size();
      AppMethodBeat.o(105241);
    }
  }

  private com.tencent.mm.ui.contact.a.a hq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105244);
    h localh = new h(paramInt2);
    localh.mKQ = this.zmV.getActivity().getResources().getString(paramInt1);
    AppMethodBeat.o(105244);
    return localh;
  }

  private void j(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105240);
    int i = fp(this.znv);
    int j = fp(this.oov);
    int k = fp(this.mGW);
    int m = fp(this.znw);
    if (i > 0)
    {
      this.znp = 0;
      i = i + 1 + 0;
      if (j <= 0)
        break label297;
      this.znq = i;
      if ((j <= 3) || ((k <= 0) && (m <= 0)))
        break label279;
      if (!this.znr)
        break label258;
      i += 4;
      this.zns = i;
      i++;
      label106: if ((this.mDz.mEa.length <= 1) || (clI()))
        break label306;
      this.zno = i;
      i++;
      label134: if (k <= 0)
        break label354;
      this.zkK = i;
      if ((k <= 3) || (m <= 0))
        break label336;
      if (!this.znt)
        break label315;
      i += 4;
      this.znu = i;
      i++;
      label175: if (m <= 0)
        break label363;
      this.zkL = i;
      i += m + 1;
    }
    while (true)
    {
      ab.i("MicroMsg.MMSearchContactAdapter", "setCount %d", new Object[] { Integer.valueOf(i) });
      this.count = i;
      if (paramBoolean2)
        ci(paramString, paramBoolean1);
      clearCache();
      notifyDataSetChanged();
      AppMethodBeat.o(105240);
      return;
      this.znp = 2147483647;
      i = 0;
      break;
      label258: i += j + 1;
      this.zns = i;
      i++;
      break label106;
      label279: this.zns = 2147483647;
      i += j + 1;
      break label106;
      label297: this.znq = 2147483647;
      break label106;
      label306: this.zno = 2147483647;
      break label134;
      label315: i += k + 1;
      this.znu = i;
      i++;
      break label175;
      label336: this.znu = 2147483647;
      i += k + 1;
      break label175;
      label354: this.zkK = 2147483647;
      break label175;
      label363: this.zkL = 2147483647;
    }
  }

  private static com.tencent.mm.ui.contact.a.a y(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(105243);
    j localj = new j(paramInt2);
    localj.resId = paramInt1;
    localj.mJY = paramBoolean;
    AppMethodBeat.o(105243);
    return localj;
  }

  public final boolean Po(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(105246);
    paramInt -= this.zmV.getContentLV().getHeaderViewsCount();
    if (paramInt == this.zns)
      if (this.znr)
      {
        paramInt = this.zmV.getContentLV().getSelectedItemPosition();
        this.znr = false;
        j(this.query, true, false);
        this.zmV.getContentLV().setSelection(paramInt);
      }
    while (true)
    {
      AppMethodBeat.o(105246);
      return bool;
      this.znr = true;
      j(this.query, true, false);
      this.zmV.getContentLV().setSelection(this.zns);
      continue;
      if (paramInt == this.znu)
      {
        if (this.znt)
        {
          paramInt = this.zmV.getContentLV().getSelectedItemPosition();
          this.znt = false;
          j(this.query, true, false);
          this.zmV.getContentLV().setSelection(paramInt);
        }
        else
        {
          this.znt = true;
          j(this.query, true, false);
          this.zmV.getContentLV().setSelection(this.znu);
        }
      }
      else
      {
        com.tencent.mm.ui.contact.a.a locala = Pn(paramInt);
        if ((locala != null) && (locala.eDk) && (this.zno != 2147483647))
        {
          if (locala.position == this.zno)
          {
            y.Pp(1);
            bool = false;
          }
          else
          {
            y.Pp(0);
          }
        }
        else
          bool = false;
      }
    }
  }

  public void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(105235);
    clearTask();
    this.query = paramString;
    this.znx.clear();
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfInt[j];
      this.znx.add(Integer.valueOf(k));
    }
    HashSet localHashSet = new HashSet();
    if (!paramBoolean)
      localHashSet.add("filehelper");
    ab.i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", new Object[] { this.query });
    i locali = new i();
    locali.query = paramString;
    locali.mEr = paramArrayOfInt;
    locali.mEt = 3;
    locali.mEw = this.zny;
    locali.handler = this.handler;
    locali.scene = 1;
    locali.mEu = localHashSet;
    this.mEx = ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).search(1, locali);
    AppMethodBeat.o(105235);
  }

  protected boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    boolean bool = true;
    int i = parama.position;
    int j = this.znp;
    int k = this.znq;
    int m = this.zkK;
    int n = this.zkL;
    int i1 = 0;
    if (i1 < 4)
      if (i + 1 != new int[] { j, k, m, n }[i1]);
    while (true)
    {
      return bool;
      i1++;
      break;
      bool = false;
    }
  }

  public void ci(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105234);
    if (this.zmU != null)
      this.zmU.w(paramString, getCount(), paramBoolean);
    AppMethodBeat.o(105234);
  }

  public final void clearData()
  {
    AppMethodBeat.i(105239);
    Kh();
    AppMethodBeat.o(105239);
  }

  public void finish()
  {
    AppMethodBeat.i(105245);
    super.finish();
    ab.i("MicroMsg.MMSearchContactAdapter", "finish!");
    Kh();
    AppMethodBeat.o(105245);
  }

  public int getCount()
  {
    return this.count;
  }

  protected com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(105242);
    Object localObject = null;
    if (paramInt == this.zno)
    {
      localObject = new com.tencent.mm.ui.contact.a.g(paramInt);
      ((com.tencent.mm.ui.contact.a.g)localObject).eDk = true;
    }
    while (true)
    {
      if (localObject != null)
      {
        ((com.tencent.mm.ui.contact.a.a)localObject).query = this.query;
        ((com.tencent.mm.ui.contact.a.a)localObject).mDz = this.mDz;
        ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      }
      AppMethodBeat.o(105242);
      return localObject;
      if (paramInt == this.znp)
      {
        localObject = hq(2131300122, paramInt);
      }
      else if (paramInt == this.znq)
      {
        localObject = hq(2131300106, paramInt);
      }
      else if (paramInt == this.zkK)
      {
        localObject = hq(2131300105, paramInt);
      }
      else if (paramInt == this.zkL)
      {
        localObject = hq(2131300103, paramInt);
      }
      else if (paramInt == this.zns)
      {
        localObject = y(2131300106, paramInt, this.znr);
      }
      else if (paramInt == this.znu)
      {
        localObject = y(2131300105, paramInt, this.znt);
      }
      else
      {
        int i;
        if (paramInt > this.zkL)
        {
          i = paramInt - this.zkL - 1;
          localObject = new e(paramInt);
          ((e)localObject).hpS = ((com.tencent.mm.plugin.fts.a.a.l)this.znw.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
          ((e)localObject).eDk = true;
          ((e)localObject).mFm = (i + 1);
          ((e)localObject).ej(((e)localObject).hpS.type, ((e)localObject).hpS.mDw);
        }
        else if (paramInt > this.zkK)
        {
          i = paramInt - this.zkK - 1;
          localObject = new c(paramInt);
          ((c)localObject).hpS = ((com.tencent.mm.plugin.fts.a.a.l)this.mGW.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
          ((c)localObject).eDk = true;
          ((c)localObject).mFm = (i + 1);
          ((c)localObject).ej(((c)localObject).hpS.type, ((c)localObject).hpS.mDw);
        }
        else if (paramInt > this.znq)
        {
          i = paramInt - this.znq - 1;
          localObject = new e(paramInt);
          ((e)localObject).hpS = ((com.tencent.mm.plugin.fts.a.a.l)this.oov.get(i));
          ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
          ((e)localObject).eDk = true;
          ((e)localObject).mFm = (i + 1);
          ((e)localObject).ej(((e)localObject).hpS.type, ((e)localObject).hpS.mDw);
        }
        else if (paramInt > this.znp)
        {
          i = paramInt - this.znp - 1;
          com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)this.znv.get(i);
          if ((locall.type == 131072) || (locall.type == 131076) || (locall.type == 131081))
          {
            localObject = new e(paramInt);
            ((e)localObject).hpS = locall;
            ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
            ((e)localObject).zpC = true;
            ((e)localObject).eDk = true;
            ((e)localObject).mFm = (i + 1);
            ((e)localObject).ej(((e)localObject).hpS.type, ((e)localObject).hpS.mDw);
          }
          else if (locall.type == 131075)
          {
            localObject = new c(paramInt);
            ((c)localObject).hpS = locall;
            ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
            ((c)localObject).zpC = true;
            ((c)localObject).eDk = true;
            ((c)localObject).mFm = (i + 1);
            ((c)localObject).ej(((c)localObject).hpS.type, ((c)localObject).hpS.mDw);
          }
          else
          {
            ab.e("MicroMsg.MMSearchContactAdapter", "createTopHitsDataItem return unkown type %d", new Object[] { Integer.valueOf(locall.type) });
            localObject = null;
          }
        }
        else
        {
          ab.e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.q
 * JD-Core Version:    0.6.2
 */