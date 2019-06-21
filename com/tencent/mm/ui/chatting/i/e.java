package com.tencent.mm.ui.chatting.i;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.protocal.protobuf.abt;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.ac;
import com.tencent.mm.ui.chatting.e.a.a;
import com.tencent.mm.ui.chatting.e.a.b;
import com.tencent.mm.ui.chatting.gallery.h.a;
import com.tencent.mm.ui.chatting.gallery.h.b;
import com.tencent.mm.ui.chatting.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class e
  implements d.a, t.a, a.a, h.b
{
  static int count = 0;
  private String emo;
  private ArrayList<b.c> iPr;
  private com.tencent.mm.sdk.b.c kvj;
  private GridLayoutManager kvk;
  private Context mContext;
  private ak mHandler;
  boolean moy;
  private int moz;
  private long yNB;
  private int yZg;
  private a.b yZk;
  b yZl;
  private int yZm;
  private boolean yZn;

  public e(Context paramContext)
  {
    AppMethodBeat.i(32576);
    this.iPr = null;
    this.kvj = new e.9(this);
    this.moy = false;
    this.yZm = 0;
    this.mHandler = new ak(Looper.getMainLooper());
    this.yZn = false;
    this.yZg = 0;
    this.moz = 0;
    this.mContext = paramContext;
    this.iPr = new ArrayList();
    AppMethodBeat.o(32576);
  }

  private static String c(bi parambi, s params)
  {
    AppMethodBeat.i(32593);
    Object localObject;
    if (params.fXk == -1)
    {
      params = params.alv();
      localObject = params;
      if (!com.tencent.mm.vfs.e.ct(params))
      {
        com.tencent.mm.modelvideo.o.all();
        localObject = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
      }
    }
    String str;
    do
    {
      do
      {
        do
        {
          AppMethodBeat.o(32593);
          return localObject;
          com.tencent.mm.modelvideo.o.all();
          str = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
          localObject = str;
        }
        while (parambi.field_isSend != 1);
        localObject = str;
      }
      while (params.fXn == null);
      localObject = str;
    }
    while (!params.fXn.wDP);
    while (true)
    {
      try
      {
        params = com.tencent.mm.vfs.e.atb(str);
        parambi = params;
        if (!params.endsWith("/"))
        {
          parambi = new java/lang/StringBuilder;
          parambi.<init>();
          parambi = params + "/";
        }
        params = com.tencent.mm.vfs.e.atd(str);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        parambi = parambi + params + "_hd.mp4";
        boolean bool = com.tencent.mm.vfs.e.ct(parambi);
        ab.i("MicroMsg.MediaHistoryGalleryPresenter", "local capture video, hdFilePath: %s, exist: %s", new Object[] { parambi, Boolean.valueOf(bool) });
        if (!bool)
          break label228;
        localObject = parambi;
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.MediaHistoryGalleryPresenter", "try to get hd filePath error: %s", new Object[] { parambi.getMessage() });
        localObject = str;
      }
      break;
      label228: parambi = str;
    }
  }

  private void c(cl paramcl)
  {
    AppMethodBeat.i(32597);
    paramcl.cvA.cvH = 45;
    paramcl.cvA.activity = ((Activity)this.mContext);
    com.tencent.mm.sdk.b.a.xxA.m(paramcl);
    if ((paramcl.cvB.ret == -2) || (paramcl.cvB.ret > 0))
      AppMethodBeat.o(32597);
    while (true)
    {
      return;
      if (paramcl.cvB.ret <= 0)
      {
        if (14 != paramcl.cvA.type)
        {
          ab.d("MicroMsg.MediaHistoryGalleryPresenter", "not record type, do not report");
          AppMethodBeat.o(32597);
        }
        else if (paramcl.cvA.cvD == null)
        {
          ab.e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
          AppMethodBeat.o(32597);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11142, new Object[] { Integer.valueOf(paramcl.cvA.cvD.wiK), Integer.valueOf(paramcl.cvA.cvD.wiL), Integer.valueOf(paramcl.cvA.cvD.wiM), Integer.valueOf(paramcl.cvA.cvD.wiN), Integer.valueOf(paramcl.cvA.cvD.wiO), Integer.valueOf(paramcl.cvA.cvD.wiP), Integer.valueOf(paramcl.cvA.cvD.wiQ), Integer.valueOf(paramcl.cvA.cvD.fileCount), Integer.valueOf(paramcl.cvA.cvD.wiR), Integer.valueOf(paramcl.cvA.cvD.wiS), Integer.valueOf(paramcl.cvA.cvD.wiT), Integer.valueOf(paramcl.cvA.cvD.wiU), Integer.valueOf(paramcl.cvA.cvD.wiV), Integer.valueOf(paramcl.cvA.cvD.wiW), Integer.valueOf(paramcl.cvA.cvD.wiX) });
        }
      }
      else
        AppMethodBeat.o(32597);
    }
  }

  private boolean dGW()
  {
    if (this.yZm == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void fe(List<bi> paramList)
  {
    AppMethodBeat.i(32592);
    com.tencent.mm.sdk.g.d.post(new e.2(this, paramList), "handleSave");
    AppMethodBeat.o(32592);
  }

  private void ff(List<bi> paramList)
  {
    AppMethodBeat.i(32594);
    Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext())
      if (!ac.aO((bi)((Iterator)localObject).next()))
      {
        com.tencent.mm.ui.base.t.makeText(this.mContext, 2131299631, 0).show();
        AppMethodBeat.o(32594);
        return;
      }
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 18L, 1L, true);
    cl localcl = new cl();
    if (com.tencent.mm.pluginsdk.model.g.a(this.mContext, localcl, this.emo, paramList, false))
    {
      c(localcl);
      fh(paramList);
    }
    while (true)
    {
      this.yZk.bwr();
      AppMethodBeat.o(32594);
      break;
      if (paramList.size() > 1)
      {
        Context localContext = this.mContext;
        if (localcl.cvA.cvG >= 0)
        {
          localObject = this.mContext.getString(2131299636);
          label161: if (localcl.cvA.cvG < 0)
            break label233;
        }
        label233: for (String str = this.mContext.getString(2131298421); ; str = this.mContext.getString(2131301955))
        {
          com.tencent.mm.ui.base.h.d(localContext, (String)localObject, "", str, this.mContext.getString(2131298419), new e.4(this, localcl, paramList), null);
          break;
          localObject = this.mContext.getString(2131299635);
          break label161;
        }
      }
      com.tencent.mm.ui.base.h.g(this.mContext, localcl.cvA.cvG, 0);
    }
  }

  private void fg(List<bi> paramList)
  {
    AppMethodBeat.i(32595);
    com.tencent.mm.plugin.report.service.h.pYm.e(11627, new Object[] { Integer.valueOf(5) });
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localTreeSet.add(Long.valueOf(((bi)localIterator.next()).field_msgId));
    com.tencent.mm.ui.base.h.d(this.mContext, this.mContext.getString(2131298414), "", this.mContext.getString(2131298868), this.mContext.getString(2131296868), new e.5(this, localTreeSet, paramList), null);
    AppMethodBeat.o(32595);
  }

  private static void fh(List<bi> paramList)
  {
    AppMethodBeat.i(32596);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bi localbi = (bi)paramList.next();
      com.tencent.mm.ui.chatting.a.a(a.c.yFG, a.d.yFL, localbi, 0);
    }
    AppMethodBeat.o(32596);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
    AppMethodBeat.i(32588);
    ab.d("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskProgress] offset:%s totalLen:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    AppMethodBeat.o(32588);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(32589);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", new Object[] { Integer.valueOf(this.yZm), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
    if (!this.yZk.dFF())
      AppMethodBeat.o(32589);
    while (true)
    {
      return;
      this.yZm -= 1;
      aw.ZK();
      paramObject = com.tencent.mm.model.c.XO().jf(paramLong2);
      if (!com.tencent.mm.ui.chatting.gallery.c.b(this.mContext, paramObject, false))
        this.yZn = true;
      if (dGW())
      {
        if (!this.yZn)
        {
          this.mHandler.post(new e.11(this));
          AppMethodBeat.o(32589);
        }
        else
        {
          this.mHandler.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(32572);
              if (e.c(e.this) != null)
                e.c(e.this).OI(2131300206);
              AppMethodBeat.o(32572);
            }
          });
        }
      }
      else
        AppMethodBeat.o(32589);
    }
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(32591);
    if (!this.yZk.dFF())
      AppMethodBeat.o(32591);
    while (true)
    {
      return;
      s locals = u.ut(parama.fileName);
      ab.d("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] mNeedDownloadCount:%s statusType:%s %s", new Object[] { Integer.valueOf(this.yZm), parama.fXu, parama.fileName });
      if (locals != null)
        if (locals.alz())
        {
          this.yZm -= 1;
          aw.ZK();
          parama = com.tencent.mm.model.c.XO().jf(locals.fXe);
          com.tencent.mm.ui.chatting.gallery.c.a(this.mContext, parama, false);
        }
      while (true)
        if (dGW())
        {
          if (this.yZn)
          {
            this.mHandler.post(new e.13(this));
            AppMethodBeat.o(32591);
            break;
            ab.e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
            dFC();
            this.yZk.OI(0);
            continue;
          }
          this.mHandler.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(32574);
              if (e.c(e.this) != null)
                e.c(e.this).dFE();
              AppMethodBeat.o(32574);
            }
          });
        }
      AppMethodBeat.o(32591);
    }
  }

  public final RecyclerView.a aT(String paramString, long paramLong)
  {
    AppMethodBeat.i(32580);
    this.emo = paramString;
    this.yNB = paramLong;
    if (paramLong == -1L);
    for (this.yZl = new b(this.mContext, this.iPr, paramString); ; this.yZl = new b(this.mContext, this.iPr, paramString, paramLong))
    {
      this.yZl.yNC = new e.10(this);
      paramString = this.yZl;
      AppMethodBeat.o(32580);
      return paramString;
    }
  }

  public final String aoy()
  {
    AppMethodBeat.i(32581);
    String str = this.mContext.getString(2131296509);
    AppMethodBeat.o(32581);
    return str;
  }

  public final <T extends RecyclerView.i> T bfC()
  {
    AppMethodBeat.i(32578);
    if (this.kvk == null)
    {
      this.kvk = new GridLayoutManager(4);
      this.kvk.akZ = new e.1(this);
    }
    GridLayoutManager localGridLayoutManager = this.kvk;
    AppMethodBeat.o(32578);
    return localGridLayoutManager;
  }

  public final void bwq()
  {
    AppMethodBeat.i(32584);
    this.yZl.mod = true;
    h.a.dFX().mnY = true;
    GridLayoutManager localGridLayoutManager = (GridLayoutManager)bfC();
    int i = localGridLayoutManager.iQ();
    int j = localGridLayoutManager.iS();
    this.yZl.c(i, j - i + 1, Integer.valueOf(0));
    AppMethodBeat.o(32584);
  }

  public final void bwr()
  {
    AppMethodBeat.i(32585);
    this.yZl.mod = false;
    h.a.dFX().clear();
    h.a.dFX().mnY = false;
    this.yZl.aop.notifyChanged();
    AppMethodBeat.o(32585);
  }

  public final boolean bwy()
  {
    AppMethodBeat.i(32586);
    boolean bool = h.a.dFX().mnY;
    AppMethodBeat.o(32586);
    return bool;
  }

  public final void clear()
  {
  }

  public final int dFB()
  {
    AppMethodBeat.i(32583);
    int i = h.a.dFX().mnX.size();
    AppMethodBeat.o(32583);
    return i;
  }

  public final void dFC()
  {
    AppMethodBeat.i(32590);
    com.tencent.mm.at.o.ahm().a(this);
    com.tencent.mm.modelvideo.o.all().a(this);
    this.yZk.dFC();
    AppMethodBeat.o(32590);
  }

  public final void dFU()
  {
    this.moy = true;
  }

  public final RecyclerView.h dN(Context paramContext)
  {
    AppMethodBeat.i(32579);
    paramContext = new e.8(this, paramContext);
    AppMethodBeat.o(32579);
    return paramContext;
  }

  public final void onDetach()
  {
    AppMethodBeat.i(32577);
    this.kvj.dead();
    this.yZk.a(null);
    this.yZk = null;
    com.tencent.mm.at.o.ahm().a(this);
    com.tencent.mm.modelvideo.o.all().a(this);
    h.a.dFX().detach();
    k.dCa();
    AppMethodBeat.o(32577);
  }

  public final void onResume()
  {
    AppMethodBeat.i(32587);
    if ((this.moy) && (h.a.dFX().mnY))
    {
      this.yZk.vF(h.a.dFX().mnX.size());
      this.yZl.aop.notifyChanged();
    }
    AppMethodBeat.o(32587);
  }

  public final void s(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(32598);
    if ((!paramBoolean) && (this.moz + this.yZg == this.iPr.size()))
    {
      ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", new Object[] { Integer.valueOf(this.moz), Integer.valueOf(paramInt) });
      AppMethodBeat.o(32598);
    }
    while (true)
    {
      return;
      this.yZl.kuX = true;
      this.yZk.fO(paramBoolean);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RS().aa(new e.7(this, paramBoolean, paramInt));
      AppMethodBeat.o(32598);
    }
  }

  public final void vH(int paramInt)
  {
    AppMethodBeat.i(32582);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList1 = h.a.dFX().mnX;
    switch (paramInt)
    {
    default:
    case 3:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(32582);
      while (true)
      {
        return;
        this.yZk.dFD();
        ArrayList localArrayList2 = new ArrayList();
        Iterator localIterator = localArrayList1.iterator();
        while (localIterator.hasNext())
        {
          bi localbi = (bi)localIterator.next();
          if ((!com.tencent.mm.ui.chatting.gallery.c.bp(localbi)) && (!com.tencent.mm.ui.chatting.gallery.c.bq(localbi)))
            localArrayList2.add(localbi);
        }
        if (localArrayList2.size() != localArrayList1.size())
        {
          com.tencent.mm.ui.base.h.a(this.mContext, 2131300195, 2131297061, new e.15(this, localArrayList2), null);
          AppMethodBeat.o(32582);
        }
        else
        {
          fe(localArrayList2);
          AppMethodBeat.o(32582);
          continue;
          ff(localArrayList1);
          AppMethodBeat.o(32582);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(219L, 19L, 1L, true);
          boolean bool = com.tencent.mm.model.t.kH(this.emo);
          k.a(this.mContext, localArrayList1, bool, this.emo, new e.6(this));
          this.yZk.bwr();
          AppMethodBeat.o(32582);
        }
      }
      fg(localArrayList1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e
 * JD-Core Version:    0.6.2
 */