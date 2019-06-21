package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.re;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class SnsInfoFlip$b extends BaseAdapter
{
  private Context context;
  private String fns;
  private boolean kNs;
  private int rgh;
  private boolean rta;
  Map<String, WeakReference<View>> rtb;
  private String rtc;

  public SnsInfoFlip$b(SnsInfoFlip paramSnsInfoFlip, Context paramContext)
  {
    AppMethodBeat.i(38974);
    this.rgh = 0;
    this.rta = false;
    this.fns = "";
    this.kNs = true;
    this.rtb = new HashMap();
    this.context = paramContext;
    this.rta = f.dzs();
    this.rgh = SnsInfoFlip.j(paramSnsInfoFlip).size();
    c.afC();
    this.kNs = c.afE();
    AppMethodBeat.o(38974);
  }

  private void DZ(int paramInt)
  {
    AppMethodBeat.i(38976);
    bau localbau = ((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).cNr;
    az localaz = az.a(SnsInfoFlip.k(this.rsU), ((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).fDG);
    if (localbau.jCt != 2)
      AppMethodBeat.o(38976);
    while (true)
    {
      return;
      boolean bool = v.Zl(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd);
      af.cnC();
      bool = g.a(localbau, localaz, bool);
      if ((SnsInfoFlip.l(this.rsU)) && (!bool))
        SnsInfoFlip.a(this.rsU, localbau.Id);
      AppMethodBeat.o(38976);
    }
  }

  public final void Ea(int paramInt)
  {
    AppMethodBeat.i(38980);
    Object localObject1 = (com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt);
    if (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "notify online sight play, but flip item is null.");
      AppMethodBeat.o(38980);
    }
    while (true)
    {
      return;
      String str = ((com.tencent.mm.plugin.sns.h.b)localObject1).qQd;
      if (bo.isNullOrNil(str))
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "notify online sight play, but sns local id is null.");
        AppMethodBeat.o(38980);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "notify online sight play pos %s sns local id %s", new Object[] { Integer.valueOf(paramInt), str });
        Object localObject2 = (WeakReference)this.rtb.get(str);
        if (localObject2 == null)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "notify online sight play, but view cache is null ");
          this.rtc = str;
          AppMethodBeat.o(38980);
        }
        else
        {
          localObject2 = (OnlineVideoView)((WeakReference)localObject2).get();
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "online sight view is null, do nothing. snsLocalId %s", new Object[] { str });
            this.rtc = str;
            AppMethodBeat.o(38980);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "%d notify online sight play video %s", new Object[] { Integer.valueOf(localObject2.hashCode()), str });
            this.rtc = null;
            ((OnlineVideoView)localObject2).csb();
            ((OnlineVideoView)localObject2).a(((com.tencent.mm.plugin.sns.h.b)localObject1).cNr, ((com.tencent.mm.plugin.sns.h.b)localObject1).qQd, ((com.tencent.mm.plugin.sns.h.b)localObject1).fDG);
            localObject1 = new re();
            ((re)localObject1).cNj.cAd = 1;
            ((re)localObject1).cNj.czD = str;
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            AppMethodBeat.o(38980);
          }
        }
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(38979);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "adapter clear.");
    this.rtb.clear();
    AppMethodBeat.o(38979);
  }

  public final void cts()
  {
    AppMethodBeat.i(38981);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "notify online sight stop %s", new Object[] { bo.dpG() });
    re localre = new re();
    localre.cNj.context = this.context;
    localre.cNj.czD = this.rtc;
    localre.cNj.cAd = 2;
    a.xxA.m(localre);
    this.rtc = null;
    AppMethodBeat.o(38981);
  }

  public final int getCount()
  {
    AppMethodBeat.i(38975);
    int i;
    if (SnsInfoFlip.j(this.rsU) == null)
    {
      i = 0;
      AppMethodBeat.o(38975);
    }
    while (true)
    {
      return i;
      i = SnsInfoFlip.j(this.rsU).size();
      AppMethodBeat.o(38975);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(38982);
    Object localObject;
    if ((paramInt < SnsInfoFlip.j(this.rsU).size()) && (paramInt >= 0))
    {
      localObject = SnsInfoFlip.j(this.rsU).get(paramInt);
      AppMethodBeat.o(38982);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(38982);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(38977);
    if (((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).cNr.jCt == 6)
    {
      paramInt = 0;
      AppMethodBeat.o(38977);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(38977);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(38978);
    boolean bool;
    if (((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).cNr.jCt == 6)
    {
      if (paramView == null)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsInfoFlip", "fill view online sight %d convert view is null %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
        localObject1 = (com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt);
        if (localObject1 != null)
          break label112;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "fill online sight view, but flip item is null.");
        AppMethodBeat.o(38978);
      }
      while (true)
      {
        return paramView;
        bool = false;
        break;
        label112: paramViewGroup = ((com.tencent.mm.plugin.sns.h.b)localObject1).qQd;
        if (!bo.isNullOrNil(paramViewGroup))
          break label142;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SnsInfoFlip", "fill online sight view, but sns local id is null.");
        AppMethodBeat.o(38978);
      }
      label142: paramView = (WeakReference)this.rtb.get(paramViewGroup);
      if ((paramView != null) && (paramView.get() != null))
        paramView = (OnlineVideoView)paramView.get();
      while (true)
      {
        if (bo.isEqual(paramViewGroup, this.rtc))
          Ea(paramInt);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "return online sight view %d parent id %s", new Object[] { Integer.valueOf(paramView.hashCode()), ((com.tencent.mm.plugin.sns.h.b)localObject1).qQd });
        AppMethodBeat.o(38978);
        break;
        paramView = new OnlineVideoView(this.context);
        this.rtb.put(paramViewGroup, new WeakReference(paramView));
      }
    }
    Object localObject2 = ((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).cNr;
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsInfoFlip", "gallery position " + paramInt + " " + this.rgh + " " + ((bau)localObject2).Id);
    label430: az localaz;
    int i;
    label539: Object localObject3;
    if (paramView == null)
    {
      paramViewGroup = new SnsInfoFlip.d();
      paramView = View.inflate(this.context, 2130970762, null);
      paramViewGroup.rtd = paramView.findViewById(2131827762);
      paramViewGroup.rte = ((ProgressBar)paramView.findViewById(2131821219));
      paramViewGroup.nHi = ((TextView)paramView.findViewById(2131827764));
      paramViewGroup.rtf = ((FrameLayout)paramView.findViewById(2131827763));
      paramViewGroup.cDh = ((ImageView)paramView.findViewById(2131820629));
      paramView.setTag(paramViewGroup);
      paramViewGroup.position = paramInt;
      localaz = az.a(SnsInfoFlip.k(this.rsU), ((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).fDG);
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      paramViewGroup.rte.setVisibility(8);
      paramViewGroup.nHi.setVisibility(8);
      paramViewGroup.rtf.setVisibility(0);
      if ((bo.isNullOrNil(SnsInfoFlip.m(this.rsU))) || (!SnsInfoFlip.m(this.rsU).equals(((bau)localObject2).Id)))
        break label1196;
      i = 1;
      if ((!((bau)localObject2).Id.startsWith("Locall_path")) || (bo.isNullOrNil(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd)))
        break label1485;
      localObject3 = (com.tencent.mm.plugin.sns.storage.n)SnsInfoFlip.n(this.rsU).get(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd);
      localObject1 = localObject3;
      if (localObject3 == null)
      {
        localObject1 = af.cnF().YT(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd);
        SnsInfoFlip.n(this.rsU).put(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd, localObject1);
      }
      localObject1 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu();
      if (((TimeLineObject)localObject1).xfI.wbK.size() <= ((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQe)
        break label1485;
    }
    label783: label1196: label1208: label1214: label1485: for (Object localObject1 = (bau)((TimeLineObject)localObject1).xfI.wbK.get(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQe); ; localObject1 = localObject2)
    {
      localObject2 = af.cnC();
      localObject3 = paramViewGroup.cDh;
      int j = this.context.hashCode();
      if (i == 0)
      {
        bool = true;
        localObject2 = ((g)localObject2).a((bau)localObject1, (View)localObject3, j, bool, localaz, v.Zl(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd));
        if ((localObject2 == null) && (SnsInfoFlip.l(this.rsU)))
          SnsInfoFlip.a(this.rsU, ((bau)localObject1).Id);
        localObject3 = paramViewGroup.cDh.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = -1;
        ((ViewGroup.LayoutParams)localObject3).height = -1;
        paramViewGroup.cDh.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        if ((localObject2 != null) || (((bau)localObject1).Id == null) || (((bau)localObject1).Id.startsWith("pre_temp_extend_pic")))
          break label1214;
        ViewGroup.LayoutParams localLayoutParams = paramViewGroup.cDh.getLayoutParams();
        BackwardSupportUtil.b.b(this.context, 160.0F);
        j = BackwardSupportUtil.b.b(this.context, 200.0F);
        BackwardSupportUtil.b.b(this.context, 44.0F);
        localObject2 = af.cnC().XK(i.bc(1, ((bau)localObject1).Id));
        if (!i.b((com.tencent.mm.memory.n)localObject2))
          break label1208;
        label974: if (localObject2 != null)
        {
          double d1 = ((com.tencent.mm.memory.n)localObject2).bitmap.getWidth();
          double d2 = ((com.tencent.mm.memory.n)localObject2).bitmap.getHeight();
          if ((d1 > 0.0D) && (d2 > 0.0D))
            Math.min(j / d1, j / d2);
        }
        paramViewGroup.cDh.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        paramViewGroup.rte.setVisibility(0);
        paramViewGroup.cDh.setVisibility(0);
        af.cnC().dz(paramViewGroup.cDh);
        af.cnC().b((bau)localObject1, paramViewGroup.cDh, 2130837968, this.context.hashCode(), localaz);
        SnsInfoFlip.DX(localLayoutParams.width);
        SnsInfoFlip.DY(localLayoutParams.height);
        if (i != 0)
          paramViewGroup.rte.setVisibility(8);
      }
      while (true)
      {
        label1123: if ((this.kNs) && (com.tencent.mm.network.ab.ch(this.context)))
        {
          if (paramInt - 1 >= 0)
            DZ(paramInt - 1);
          if (paramInt + 1 < SnsInfoFlip.d(this.rsU).getCount())
            DZ(paramInt + 1);
        }
        do
        {
          AppMethodBeat.o(38978);
          break;
          paramViewGroup = (SnsInfoFlip.d)paramView.getTag();
          break label430;
          i = 0;
          break label539;
          bool = false;
          break label783;
          localObject2 = null;
          break label974;
          if (!this.rta)
            break label1412;
          paramViewGroup.rte.setVisibility(8);
          if (localObject2 == null)
            break label1123;
        }
        while (SnsInfoFlip.o(this.rsU));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsInfoFlip", "update view ");
        paramView = new MultiTouchImageView(this.context, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), SnsInfoFlip.p(this.rsU));
        paramView.setEnableHorLongBmpMode(SnsInfoFlip.q(this.rsU));
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        af.cnC().a((bau)localObject1, paramView, this.context.hashCode(), localaz, v.Zl(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd));
        paramView.setImageBitmap((Bitmap)localObject2);
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsInfoFlip", "dancy mediaId: %s, isbigImgLoaded: %s, view: %s", new Object[] { ((bau)localObject1).Id, SnsInfoFlip.r(this.rsU).get(((bau)localObject1).Id), Integer.valueOf(paramView.getId()) });
        AppMethodBeat.o(38978);
        break;
        paramViewGroup.rte.setVisibility(8);
        af.cnC().a((bau)localObject1, paramViewGroup.cDh, this.context.hashCode(), localaz, v.Zl(((com.tencent.mm.plugin.sns.h.b)SnsInfoFlip.j(this.rsU).get(paramInt)).qQd));
        paramViewGroup.cDh.setImageBitmap((Bitmap)localObject2);
        paramViewGroup.cDh.setVisibility(0);
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(38983);
    this.rgh = SnsInfoFlip.j(this.rsU).size();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsInfoFlip", "items.size:" + SnsInfoFlip.j(this.rsU).size());
    this.rsU.invalidate();
    this.rsU.requestLayout();
    super.notifyDataSetChanged();
    if ((SnsInfoFlip.j(this.rsU).size() <= 0) && (SnsInfoFlip.s(this.rsU) != null))
      SnsInfoFlip.s(this.rsU).run();
    AppMethodBeat.o(38983);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip.b
 * JD-Core Version:    0.6.2
 */