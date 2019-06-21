package com.tencent.mm.ui.chatting.i;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.g;
import com.tencent.mm.protocal.protobuf.abt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.f;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.chatting.k;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public abstract class b
  implements c.f, com.tencent.mm.ui.chatting.e.b.a
{
  protected String emo;
  protected ArrayList<c.b> iPr = null;
  private LinearLayoutManager jop;
  private boolean kuU = false;
  protected Context mContext;
  private long yUK = 0L;
  protected b.b yYY;
  com.tencent.mm.ui.chatting.a.c yYZ;
  protected ArrayList<c.b> yZa = null;

  public b(Context paramContext)
  {
    this.mContext = paramContext;
    this.iPr = new ArrayList();
  }

  protected static String b(bi parambi, boolean paramBoolean)
  {
    String str1 = null;
    String str2 = null;
    if (parambi == null);
    while (true)
    {
      return str2;
      if (parambi.field_isSend == 1)
      {
        str2 = r.Yz();
      }
      else
      {
        if (paramBoolean)
          str1 = bf.oy(parambi.field_content);
        str2 = str1;
        if (bo.isNullOrNil(str1))
          str2 = parambi.field_talker;
      }
    }
  }

  private void bH(bi parambi)
  {
    cl localcl = new cl();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(parambi);
    if (g.a(this.mContext, localcl, this.emo, localArrayList, false))
      c(localcl);
    while (true)
    {
      return;
      ab.e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
    }
  }

  private void bI(bi parambi)
  {
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 19L, 1L, true);
    boolean bool = this.emo.toLowerCase().endsWith("@chatroom");
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(parambi);
    k.a(this.mContext, localArrayList, bool, this.emo, new b.3(this));
  }

  private void bJ(bi parambi)
  {
    com.tencent.mm.plugin.report.service.h.pYm.e(11627, new Object[] { Integer.valueOf(5) });
    TreeSet localTreeSet = new TreeSet();
    localTreeSet.add(Long.valueOf(parambi.field_msgId));
    com.tencent.mm.ui.base.h.d(this.mContext, this.mContext.getString(2131298414), "", this.mContext.getString(2131298868), this.mContext.getString(2131296868), new b.4(this, localTreeSet, parambi), null);
  }

  private void c(cl paramcl)
  {
    paramcl.cvA.cvH = 45;
    paramcl.cvA.activity = ((Activity)this.mContext);
    a.xxA.m(paramcl);
    if ((paramcl.cvB.ret == -2) || (paramcl.cvB.ret > 0));
    while (true)
    {
      return;
      if (paramcl.cvB.ret <= 0)
        if (14 != paramcl.cvA.type)
          ab.d("MicroMsg.BaseHistoryListPresenter", "not record type, do not report");
        else if (paramcl.cvA.cvD == null)
          ab.e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
        else
          com.tencent.mm.plugin.report.service.h.pYm.e(11142, new Object[] { Integer.valueOf(paramcl.cvA.cvD.wiK), Integer.valueOf(paramcl.cvA.cvD.wiL), Integer.valueOf(paramcl.cvA.cvD.wiM), Integer.valueOf(paramcl.cvA.cvD.wiN), Integer.valueOf(paramcl.cvA.cvD.wiO), Integer.valueOf(paramcl.cvA.cvD.wiP), Integer.valueOf(paramcl.cvA.cvD.wiQ), Integer.valueOf(paramcl.cvA.cvD.fileCount), Integer.valueOf(paramcl.cvA.cvD.wiR), Integer.valueOf(paramcl.cvA.cvD.wiS), Integer.valueOf(paramcl.cvA.cvD.wiT), Integer.valueOf(paramcl.cvA.cvD.wiU), Integer.valueOf(paramcl.cvA.cvD.wiV), Integer.valueOf(paramcl.cvA.cvD.wiW), Integer.valueOf(paramcl.cvA.cvD.wiX) });
    }
  }

  public final c.b Oy(int paramInt)
  {
    if ((this.iPr == null) || (this.iPr.size() <= paramInt));
    for (c.b localb = null; ; localb = (c.b)this.iPr.get(paramInt))
      return localb;
  }

  public final RecyclerView.a aru(String paramString)
  {
    this.emo = paramString;
    this.yYZ = new com.tencent.mm.ui.chatting.a.c(this.mContext, this);
    com.tencent.mm.ui.chatting.a.c.yNI = dFI();
    return this.yYZ;
  }

  public final void d(int paramInt, bi parambi)
  {
    ab.i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      return;
      bH(parambi);
      continue;
      bI(parambi);
      continue;
      bJ(parambi);
    }
  }

  public final RecyclerView.h dFG()
  {
    return new b.1(this);
  }

  public final com.tencent.mm.modelvoiceaddr.ui.b.a dFJ()
  {
    return new b.2(this);
  }

  protected final boolean dFS()
  {
    long l1 = this.yUK;
    long l2 = System.currentTimeMillis();
    this.yUK = l2;
    if (l1 + 30000L < l2)
    {
      aw.ZK();
      this.kuU = com.tencent.mm.model.c.isSDCardAvailable();
    }
    return this.kuU;
  }

  public final int getCount()
  {
    if (this.iPr == null);
    for (int i = 0; ; i = this.iPr.size())
      return i;
  }

  public final void onDetach()
  {
    this.yYY.a(null);
    this.yYY = null;
    if (this.yYZ != null)
    {
      com.tencent.mm.ui.chatting.a.c.yNI = null;
      com.tencent.mm.ui.chatting.a.c.yNJ = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b
 * JD-Core Version:    0.6.2
 */