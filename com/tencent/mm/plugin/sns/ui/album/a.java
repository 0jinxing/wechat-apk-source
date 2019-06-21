package com.tencent.mm.plugin.sns.ui.album;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.LoadingMoreView;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends RecyclerView.a
{
  String edV;
  private String mBP;
  Context mContext;
  private final int rFd;
  private final int rFe;
  private final int rFf;
  List<a.b> rFg;
  String rFh;
  String rFi;
  boolean rFj;
  private long rFk;
  private long rFl;
  int rFm;
  boolean rFn;
  int rFo;
  private b rFp;
  c.a rFq;
  a.a rFr;
  private boolean rjn;

  public a(Context paramContext, String paramString, a.a parama)
  {
    AppMethodBeat.i(39966);
    this.rFd = 0;
    this.rFe = 1;
    this.rFf = 2;
    this.rFg = new ArrayList();
    this.mContext = null;
    this.mBP = null;
    this.rFh = "";
    this.rFi = "";
    this.edV = "";
    this.rjn = false;
    this.rFj = false;
    this.rFk = 0L;
    this.rFl = 0L;
    this.rFm = 0;
    this.rFn = false;
    this.rFo = 0;
    this.rFp = null;
    this.rFq = null;
    this.rFr = null;
    this.mContext = paramContext;
    this.rFr = parama;
    parama = aa.g(this.mContext.getSharedPreferences(ah.doA(), 0));
    ab.d("MicroMsg.SnsAlbumAdapter", "filterLan temp ".concat(String.valueOf(parama)));
    paramContext = parama;
    if (!parama.equals("zh_CN"))
    {
      paramContext = parama;
      if (!parama.equals("en"))
      {
        if (!parama.equals("zh_TW"))
          break label291;
        paramContext = parama;
      }
    }
    while (true)
    {
      this.mBP = paramContext;
      this.edV = paramString;
      g.RQ();
      paramContext = (String)g.RP().Ry().get(2, null);
      if (this.edV.equals(paramContext))
        this.rjn = true;
      this.rFp = new b(new a.1(this), this.edV, this.rjn);
      kJ(0L);
      ab.d("MicroMsg.SnsAlbumAdapter", "limitId=%s", new Object[] { this.rFi });
      ll(false);
      AppMethodBeat.o(39966);
      return;
      label291: if (parama.equals("zh_HK"))
        paramContext = "zh_TW";
      else
        paramContext = "en";
    }
  }

  private void kJ(long paramLong)
  {
    AppMethodBeat.i(39973);
    af.cnv();
    Object localObject = i.jW(af.cnF().d(paramLong, this.edV, this.rjn));
    if (this.rFh.equals(""))
    {
      this.rFi = ((String)localObject);
      localObject = af.cnJ().YX(this.edV).cqL();
      if (((aao)localObject).wfM != 0L)
        break label96;
      AppMethodBeat.o(39973);
    }
    while (true)
    {
      label73: return;
      if (((String)localObject).compareTo(this.rFh) < 0)
        break label176;
      localObject = this.rFh;
      break;
      label96: localObject = i.jW(((aao)localObject).wfM);
      if (!this.rFi.equals(""))
        break label129;
      this.rFi = ((String)localObject);
      AppMethodBeat.o(39973);
    }
    label129: ab.d("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s mLimitSeq=%s", new Object[] { Long.valueOf(paramLong), this.rFi });
    if (((String)localObject).compareTo(this.rFi) > 0);
    while (true)
    {
      this.rFi = ((String)localObject);
      AppMethodBeat.o(39973);
      break label73;
      label176: break;
      localObject = this.rFi;
    }
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(39968);
    ab.d("MicroMsg.SnsAlbumAdapter", "onCreateViewHolder %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1)
      paramViewGroup = new a.c(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970740, paramViewGroup, false));
    while (true)
    {
      AppMethodBeat.o(39968);
      return paramViewGroup;
      if (paramInt == 2)
        paramViewGroup = new a.e(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970742, paramViewGroup, false));
      else
        paramViewGroup = new a.f(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970739, paramViewGroup, false));
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(39969);
    ab.d("MicroMsg.SnsAlbumAdapter", "onBindViewHolder %s", new Object[] { Integer.valueOf(paramInt) });
    if ((paramv instanceof a.c))
    {
      paramv = (a.c)paramv;
      ab.d("MicroMsg.SnsAlbumAdapter", "SnsAlbumLoadingHolder onBind");
      if (paramv.rFs.rFn)
      {
        paramv.rFu.setVisibility(0);
        paramv.rFu.lc(false);
        AppMethodBeat.o(39969);
      }
      while (true)
      {
        return;
        paramInt = paramv.rFs.rFo;
        af.cnv();
        if (paramInt >= 30)
        {
          paramv.rFu.setVisibility(0);
          AppMethodBeat.o(39969);
        }
        else
        {
          paramv.rFu.setVisibility(8);
          AppMethodBeat.o(39969);
        }
      }
    }
    Object localObject1;
    Object localObject2;
    if ((paramv instanceof a.f))
    {
      localObject1 = (a.f)paramv;
      localObject2 = (a.b)((a.f)localObject1).rFs.rFg.get(paramInt);
      if (paramInt <= 1)
        break label687;
    }
    label660: label687: for (paramv = (a.b)((a.f)localObject1).rFs.rFg.get(paramInt - 1); ; paramv = null)
    {
      int i = ((n)((a.b)localObject2).rFt.get(0)).field_head;
      if (paramv == null)
      {
        paramInt = 0;
        int j = i / 10000;
        int k = paramInt / 10000;
        ab.d("MicroMsg.SnsAlbumAdapter", "handleDateTv prehead=%s head=%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        if (((paramInt != 0) || (j == aw.getYear())) && ((paramInt == 0) || (j == k)))
          break label603;
        paramv = String.format(((a.f)localObject1).rFs.mContext.getResources().getString(2131303851), new Object[] { Integer.valueOf(j) });
        ((a.f)localObject1).gnf.setText(paramv);
        ((a.f)localObject1).gnf.setVisibility(0);
        paramv = ((a.f)localObject1).apJ.getLayoutParams();
        if ((paramv instanceof ViewGroup.MarginLayoutParams))
        {
          paramv = (ViewGroup.MarginLayoutParams)paramv;
          if (paramInt == 0)
            break label583;
          paramv.topMargin = com.tencent.mm.bz.a.fromDPToPix(((a.f)localObject1).gnf.getContext(), 70);
          label363: ((a.f)localObject1).apJ.setLayoutParams(paramv);
        }
        label371: paramv = ((a.b)localObject2).label;
        if (paramv.indexOf(":") == -1)
          break label660;
        paramv = paramv.split(":");
        if (paramv.length > 1)
          ((a.f)localObject1).timeTv.setText(paramv[1]);
      }
      while (true)
      {
        ((a.f)localObject1).rFB.setLayoutManager(((a.f)localObject1).iYH);
        ((a.f)localObject1).rFB.setAdapter(((a.f)localObject1).rFA);
        paramv = ((a.f)localObject1).rFA;
        localObject2 = ((a.b)localObject2).rFt;
        paramv.rFD.clear();
        Iterator localIterator1 = ((List)localObject2).iterator();
        while (localIterator1.hasNext())
        {
          n localn = (n)localIterator1.next();
          Iterator localIterator2 = localn.cqu().xfI.wbK.iterator();
          while (localIterator2.hasNext())
          {
            localObject1 = (bau)localIterator2.next();
            localObject2 = new a.d();
            ((a.d)localObject2).cNE = localn.reX;
            ((a.d)localObject2).rFv = ((bau)localObject1);
            paramv.rFD.add(localObject2);
          }
        }
        paramInt = ((n)paramv.rFt.get(0)).field_head;
        break;
        label583: paramv.topMargin = com.tencent.mm.bz.a.am(((a.f)localObject1).gnf.getContext(), 2131427500);
        break label363;
        label603: ((a.f)localObject1).gnf.setVisibility(8);
        paramv = ((a.f)localObject1).apJ.getLayoutParams();
        if (!(paramv instanceof ViewGroup.MarginLayoutParams))
          break label371;
        paramv = (ViewGroup.MarginLayoutParams)paramv;
        paramv.topMargin = com.tencent.mm.bz.a.am(((a.f)localObject1).gnf.getContext(), 2131427500);
        ((a.f)localObject1).apJ.setLayoutParams(paramv);
        break label371;
        ((a.f)localObject1).timeTv.setText(paramv);
      }
      paramv.aop.notifyChanged();
      AppMethodBeat.o(39969);
      break;
    }
  }

  public final ArrayList<com.tencent.mm.plugin.sns.h.b> bh(int paramInt, String paramString)
  {
    AppMethodBeat.i(39975);
    ab.d("MicroMsg.SnsAlbumAdapter", "snsLocalId=%s", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.rFg.size(); i++)
    {
      Iterator localIterator1 = ((a.b)this.rFg.get(i)).rFt.iterator();
      while (localIterator1.hasNext())
      {
        n localn = (n)localIterator1.next();
        int j = localn.reX;
        if ((localn.cqu() != null) && (localn.cqu().xfI != null) && (localn.cqu().xfI.wbK.size() != 0) && ((localn.cqu().xfI.wbJ == 1) || (localn.cqu().xfI.wbJ == 15)))
        {
          if (j == paramInt)
          {
            ab.d("MicroMsg.SnsAlbumAdapter", "mFixPosition=%s", new Object[] { Integer.valueOf(this.rFm) });
            this.rFm = localArrayList.size();
          }
          Iterator localIterator2 = localn.cqu().xfI.wbK.iterator();
          for (int k = 0; localIterator2.hasNext(); k++)
          {
            bau localbau = (bau)localIterator2.next();
            if (bo.isEqual(localbau.Id, paramString))
              this.rFm += k;
            com.tencent.mm.plugin.sns.h.b localb = new com.tencent.mm.plugin.sns.h.b();
            localb.cNr = localbau;
            localb.qQd = v.ap("sns_table_", j);
            localb.fDG = localn.field_createTime;
            localb.qQe = k;
            localArrayList.add(localb);
          }
        }
      }
    }
    AppMethodBeat.o(39975);
    return localArrayList;
  }

  public final void ctK()
  {
    AppMethodBeat.i(39972);
    ab.d("MicroMsg.SnsAlbumAdapter", "i addSize ");
    List localList;
    if (this.rFg.size() > 1)
    {
      localList = ((a.b)this.rFg.get(this.rFg.size() - 2)).rFt;
      if (localList.isEmpty());
    }
    for (long l = ((n)localList.get(localList.size() - 1)).field_snsId; ; l = 0L)
    {
      kJ(l);
      AppMethodBeat.o(39972);
      return;
    }
  }

  public final void cuS()
  {
    AppMethodBeat.i(39971);
    ab.d("MicroMsg.SnsAlbumAdapter", "snsactivty onIsAll ");
    this.rFn = true;
    AppMethodBeat.o(39971);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(39970);
    int i = this.rFg.size();
    AppMethodBeat.o(39970);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(39967);
    if ("loading".equals(((a.b)this.rFg.get(paramInt)).label))
      paramInt = 1;
    while (true)
    {
      AppMethodBeat.o(39967);
      return paramInt;
      if ("my_timeline".equals(((a.b)this.rFg.get(paramInt)).label))
        paramInt = 2;
      else
        paramInt = 0;
    }
  }

  public final void kI(long paramLong)
  {
    if (0L != this.rFk);
    while (true)
    {
      return;
      this.rFk = paramLong;
      this.rFl = 0L;
    }
  }

  public final void ll(boolean paramBoolean)
  {
    AppMethodBeat.i(39974);
    ab.d("MicroMsg.SnsAlbumAdapter", "limitSeq " + this.rFi);
    if (this.rFp != null)
      this.rFp.g(this.rFi, this.rFj, paramBoolean);
    AppMethodBeat.o(39974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a
 * JD-Core Version:    0.6.2
 */