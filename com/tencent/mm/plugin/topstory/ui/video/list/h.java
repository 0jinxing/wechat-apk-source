package com.tencent.mm.plugin.topstory.ui.video.list;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMNeat7extView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public final class h extends com.tencent.mm.plugin.topstory.ui.video.h
  implements a
{
  public View jNV;
  public MMNeat7extView jXy;
  public View ltW;
  public TextView mLM;
  public TextView mLN;
  public TextView qeX;
  public ImageView sDW;
  public View sFZ;
  public com.tencent.mm.plugin.topstory.ui.video.f sGZ;
  public TextView sGc;
  public View sGg;
  public TextView sGh;
  public View sGi;
  public View sGj;
  public ImageView sGk;
  public ImageView sGl;
  public View sGm;
  public FrameLayout sGr;
  public View sHa;
  public ImageView sHb;
  public View sHc;
  public View sHd;
  public View sHe;
  private boolean sHf;

  public h(View paramView, b paramb, boolean paramBoolean)
  {
    super(paramView, paramb);
    this.sHf = paramBoolean;
  }

  public final void cFN()
  {
    AppMethodBeat.i(2091);
    super.cFN();
    AppMethodBeat.o(2091);
  }

  public final void cFO()
  {
    AppMethodBeat.i(2090);
    super.cFO();
    this.sHe.animate().cancel();
    this.sHd.animate().cancel();
    this.sHe.setAlpha(0.0F);
    this.sHd.setAlpha(0.0F);
    AppMethodBeat.o(2090);
  }

  public final com.tencent.mm.plugin.topstory.ui.video.f cGA()
  {
    return this.sGZ;
  }

  public final boolean cGy()
  {
    AppMethodBeat.i(2092);
    boolean bool;
    if ((this.sHe.getAlpha() != 0.0F) && (this.sHd.getAlpha() != 0.0F))
    {
      bool = true;
      AppMethodBeat.o(2092);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(2092);
    }
  }

  public final void cGz()
  {
    AppMethodBeat.i(2094);
    if (!bo.isNullOrNil(this.sAX.title))
    {
      this.jXy.ah(this.sAX.title);
      this.jXy.setVisibility(0);
      this.jXy.requestLayout();
      this.jXy.setOnClickListener(this.pLd);
      this.qeX.setText(this.sAX.source);
      if (bo.isNullOrNil(this.sAX.phw))
        break label802;
      this.sGm.setVisibility(0);
      label94: this.sDW.setOnClickListener(this.pLd);
      this.qeX.setOnClickListener(this.pLd);
      this.sGm.setOnClickListener(this.pLd);
      if (bo.isNullOrNil(this.sAX.xgY))
        break label814;
      com.tencent.mm.at.o.ahp().a(this.sAX.xgY, this.sDW, c.sBm);
      label160: if (!this.sDN.cFZ())
        break label827;
      this.ltW.setVisibility(0);
      this.ltW.setOnClickListener(this.pLd);
      label191: this.sFZ.setTag(this.sAX);
      this.sFZ.setOnClickListener(this.pLd);
      if (bo.ek(this.sAX.xhc))
        break label839;
      this.sFZ.setVisibility(0);
      label234: this.jNV.setOnClickListener(this.pLd);
      this.sHc.setVisibility(0);
      this.sHd.setVisibility(0);
      this.sHe.setVisibility(0);
      if (this.sGZ == null)
      {
        this.sGZ = new f(this.sDN.bKU(), this.sDN, this);
        this.sGr.removeAllViews();
        localObject = this.sGr;
        com.tencent.mm.plugin.topstory.ui.video.f localf = this.sGZ;
        ab.i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "lxl getVideoViewLayoutParams: %s, %s", new Object[] { Integer.valueOf(this.sDN.getVideoWidth()), Integer.valueOf(this.sDN.getVideoHeight()) });
        ((FrameLayout)localObject).addView(localf, new FrameLayout.LayoutParams(this.sDN.getVideoWidth(), this.sDN.getVideoHeight()));
      }
      this.sGZ.a(this.sAX, cFP());
      if (this.sDN.cFY() == cFP())
        super.cFN();
      this.sGh.setText(this.sAX.qVw);
      if ((!this.sHf) || (this.sAX.wiH.size() <= 0))
        break label872;
      this.sGg.setVisibility(0);
      Object localObject = (bzs)this.sAX.wiH.get(0);
      this.mLM.setTag(localObject);
      this.mLM.setText(((bzs)localObject).cEh);
      this.mLM.setVisibility(0);
      this.mLM.setOnClickListener(this.pLd);
      this.sGi.setVisibility(0);
      this.sGk.setVisibility(8);
      if (!bo.isNullOrNil(((bzs)localObject).cIY))
      {
        com.tencent.mm.at.o.ahp().a(((bzs)localObject).cIY, this.sGk, c.sBn);
        this.sGk.setVisibility(0);
      }
      if (this.sAX.wiH.size() <= 1)
        break label851;
      localObject = (bzs)this.sAX.wiH.get(1);
      this.mLN.setTag(localObject);
      this.mLN.setText(((bzs)localObject).cEh);
      this.mLN.setOnClickListener(this.pLd);
      this.mLN.setVisibility(0);
      this.sGj.setVisibility(0);
      this.sGl.setVisibility(8);
      if (!bo.isNullOrNil(((bzs)localObject).cIY))
      {
        com.tencent.mm.at.o.ahp().a(((bzs)localObject).cIY, this.sGl, c.sBn);
        this.sGl.setVisibility(0);
      }
      label690: if (this.sDN.cFY() != cFP())
        cHj();
      if ((this.sAX.xhd & 0x80) <= 0)
        break label923;
      this.sHa.setVisibility(0);
      this.sHa.setOnClickListener(this.pLd);
      if (!this.sAX.xhh)
        break label884;
      this.sHb.setImageResource(2131232066);
      this.sGc.setTextColor(this.sGc.getResources().getColor(2131690595));
      AppMethodBeat.o(2094);
    }
    while (true)
    {
      return;
      this.jXy.setVisibility(8);
      break;
      label802: this.sGm.setVisibility(8);
      break label94;
      label814: this.sDW.setImageResource(2130838444);
      break label160;
      label827: this.ltW.setVisibility(8);
      break label191;
      label839: this.sFZ.setVisibility(8);
      break label234;
      label851: this.sGj.setVisibility(8);
      this.mLN.setVisibility(8);
      break label690;
      label872: this.sGg.setVisibility(8);
      break label690;
      label884: this.sHb.setImageResource(2131232067);
      this.sGc.setTextColor(this.sGc.getResources().getColor(2131690691));
      AppMethodBeat.o(2094);
      continue;
      label923: this.sHa.setVisibility(8);
      AppMethodBeat.o(2094);
    }
  }

  public final void cHj()
  {
    AppMethodBeat.i(2088);
    ab.d("MicroMsg.TopStory.TopStoryListVideoItemHolder", "showMaskView %d", new Object[] { Integer.valueOf(hashCode()) });
    this.sHe.animate().cancel();
    this.sHd.animate().cancel();
    this.sHc.animate().cancel();
    this.sHc.setAlpha(0.8F);
    this.sHe.setAlpha(0.8F);
    this.sHd.setAlpha(0.8F);
    AppMethodBeat.o(2088);
  }

  public final void cHk()
  {
    AppMethodBeat.i(2089);
    ab.d("MicroMsg.TopStory.TopStoryListVideoItemHolder", "hideMaskView %d", new Object[] { Integer.valueOf(hashCode()) });
    this.sHe.animate().cancel();
    this.sHd.animate().cancel();
    this.sHc.animate().cancel();
    this.sHc.setAlpha(0.0F);
    this.sHe.setAlpha(0.0F);
    this.sHd.setAlpha(0.0F);
    AppMethodBeat.o(2089);
  }

  public final void ej(View paramView)
  {
    AppMethodBeat.i(2087);
    super.ej(paramView);
    this.sGr = ((FrameLayout)paramView.findViewById(2131828298));
    this.sDW = ((ImageView)paramView.findViewById(2131828267));
    this.qeX = ((TextView)paramView.findViewById(2131821512));
    this.jXy = ((MMNeat7extView)paramView.findViewById(2131821185));
    this.sGm = paramView.findViewById(2131828268);
    this.ltW = paramView.findViewById(2131828270);
    this.sHa = paramView.findViewById(2131828271);
    this.sHb = ((ImageView)paramView.findViewById(2131828272));
    this.sGc = ((TextView)paramView.findViewById(2131828273));
    this.sFZ = paramView.findViewById(2131828269);
    this.sGg = paramView.findViewById(2131828275);
    this.sGh = ((TextView)paramView.findViewById(2131828282));
    this.sGi = paramView.findViewById(2131828276);
    this.sGj = paramView.findViewById(2131828279);
    this.mLM = ((TextView)paramView.findViewById(2131828278));
    this.mLN = ((TextView)paramView.findViewById(2131828281));
    this.sGk = ((ImageView)paramView.findViewById(2131828277));
    this.sGl = ((ImageView)paramView.findViewById(2131828280));
    this.sHc = paramView.findViewById(2131828336);
    this.sHd = paramView.findViewById(2131828335);
    this.sHe = paramView.findViewById(2131828337);
    this.jNV = paramView.findViewById(2131824237);
    if (this.sHf)
    {
      this.sGg.setVisibility(0);
      AppMethodBeat.o(2087);
    }
    while (true)
    {
      return;
      this.sGg.setVisibility(8);
      AppMethodBeat.o(2087);
    }
  }

  public final void ek(View paramView)
  {
    AppMethodBeat.i(2095);
    if ((com.tencent.mm.plugin.topstory.a.g.cFm()) && (paramView.getId() == this.jXy.getId()))
      this.sDN.cFV().sFy = true;
    super.ek(paramView);
    AppMethodBeat.o(2095);
  }

  public final void el(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(2096);
    Object localObject1;
    Object localObject2;
    if (paramView.getId() == this.jXy.getId())
    {
      if ((this.sAX != null) && (!bo.isNullOrNil(this.sAX.uaj)))
      {
        paramView = this.sAX.uaj;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramView);
        d.b(this.sDN.bKU(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject1);
        if (this.sDN.cFV().sFw)
        {
          this.sGZ.cGw();
          this.sDN.cFV().cpN();
        }
        this.sDN.cFR().f(this.sAX);
        ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDN.cFT(), this.sAX, cFP(), 1, "");
        AppMethodBeat.o(2096);
      }
    }
    else
    {
      while (true)
      {
        return;
        if (paramView.getId() == this.ltW.getId())
        {
          com.tencent.mm.plugin.websearch.api.a.a.kT(8);
          a(this.sDN, this.sDN.bKU(), this.sGZ, cFP());
          AppMethodBeat.o(2096);
        }
        else
        {
          if (paramView.getId() != this.sFZ.getId())
            break;
          this.sDN.ad(this.sFZ, cFP());
          AppMethodBeat.o(2096);
        }
      }
      if ((paramView.getId() == this.mLM.getId()) || (paramView.getId() == this.mLN.getId()))
      {
        this.sDN.cFQ().sEM = true;
        this.sDN.cFV().stopPlay();
        this.sGZ.cGq();
        localObject1 = (bzs)paramView.getTag();
        paramView = com.tencent.mm.plugin.topstory.a.g.a(this.sDN.cFT());
        paramView.xgj = UUID.randomUUID().toString();
        paramView.xgC = this.sAX.xgS;
        paramView.xgG = ((bzs)localObject1).wYN;
        paramView.xgH = null;
        paramView.xgI = ((bzs)localObject1);
        paramView.eif = this.sDN.DX();
        paramView.xgJ = this.sDN.cFQ().sEM;
        localObject2 = paramView.tZG.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          tn localtn = (tn)((Iterator)localObject2).next();
          if ("show_tag_list".equals(localtn.key))
            localtn.waE = ((bzs)localObject1).id;
        }
      }
    }
    while (true)
    {
      if (i == 0)
      {
        localObject2 = new tn();
        ((tn)localObject2).key = "show_tag_list";
        ((tn)localObject2).waE = ((bzs)localObject1).id;
        paramView.tZG.add(localObject2);
      }
      aa.a(this.sDN.bKU(), paramView);
      com.tencent.mm.plugin.websearch.api.a.a.kT(28);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDN.cFT(), this.sAX, cFP(), 4, ((bzs)localObject1).cEh + ":" + ((bzs)localObject1).id);
      AppMethodBeat.o(2096);
      break;
      if ((paramView.getId() == this.sDW.getId()) || (paramView.getId() == this.qeX.getId()) || (paramView.getId() == this.sGm.getId()))
      {
        if ((this.sAX == null) || (bo.isNullOrNil(this.sAX.phw)))
          break label875;
        paramView = new Intent();
        paramView.putExtra("rawUrl", this.sAX.phw);
        d.b(this.sDN.bKU().getApplicationContext(), "webview", ".ui.tools.WebViewUI", paramView);
        ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDN.cFT(), this.sAX, cFP(), 3, "");
        AppMethodBeat.o(2096);
        break;
      }
      if (paramView.getId() == this.sHa.getId())
      {
        this.sDN.a(this.sAX);
        if (this.sAX.xhh)
        {
          this.sHb.setImageResource(2131232066);
          this.sGc.setTextColor(this.sGc.getResources().getColor(2131690595));
          AppMethodBeat.o(2096);
          break;
        }
        this.sHb.setImageResource(2131232067);
        this.sGc.setTextColor(this.sGc.getResources().getColor(2131690691));
      }
      label875: AppMethodBeat.o(2096);
      break;
      i = 0;
    }
  }

  public final View getWowView()
  {
    return this.sHa;
  }

  public final void mc(boolean paramBoolean)
  {
    AppMethodBeat.i(2093);
    super.mc(paramBoolean);
    cHk();
    this.sDN.FD(cFP());
    if (this.sGZ.O(paramBoolean, false))
    {
      cFO();
      super.cFN();
    }
    AppMethodBeat.o(2093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.h
 * JD-Core Version:    0.6.2
 */