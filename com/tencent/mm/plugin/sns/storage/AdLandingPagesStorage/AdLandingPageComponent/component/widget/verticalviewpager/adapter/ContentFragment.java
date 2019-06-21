package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ac;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class ContentFragment extends Fragment
{
  private int bgColor;
  public boolean caA;
  private boolean gnp;
  private int gsN;
  private int ieu;
  private int iev;
  public Map<String, Object> puc;
  private LinearLayoutManager qYM;
  private final Map<String, Bitmap> rao;
  public g rcX;
  private int rcZ;
  public c rdb;
  private int rdc;
  private ac rdd;
  private boolean rde;
  private boolean rdf;
  private boolean rdg;
  public boolean rdh;
  public boolean rdi;
  private ValueAnimator rdj;
  private int rdk;
  public int rdl;
  private al rdm;
  public ContentFragment.a rdn;
  public ContentFragment.b rdo;
  private a rdp;
  private boolean rdq;

  public ContentFragment()
  {
    AppMethodBeat.i(37626);
    this.rao = new WeakHashMap();
    this.rdc = 700;
    this.rdi = false;
    AppMethodBeat.o(37626);
  }

  private void Vd()
  {
    AppMethodBeat.i(37636);
    if (this.rdo == null)
    {
      AppMethodBeat.o(37636);
      return;
    }
    cqc();
    String str;
    if ((this.rcX.reh != null) && (this.rcX.reh.length() > 0))
    {
      str = this.rcX.reh;
      ab.i("ContentFragment", "bg need blur %b, url %s", new Object[] { Boolean.valueOf(this.rcX.rei), str });
      if (this.rao.containsKey(str))
      {
        ab.i("ContentFragment", "bg has cache bitmap");
        Z((Bitmap)this.rao.get(str));
        label118: if (this.rdp != null)
          if ((this.rcX.reh == null) || (this.rcX.reh.length() <= 0))
            break label203;
      }
    }
    label203: for (this.rdp.bgColor = 0; ; this.rdp.bgColor = this.bgColor)
    {
      this.rdp.a(this.rcX);
      AppMethodBeat.o(37636);
      break;
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.c("adId", str, false, 1000000001, new ContentFragment.2(this, str));
      break label118;
      cqc();
      break label118;
    }
  }

  private void Z(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37638);
    int i;
    if (paramBitmap != null)
    {
      this.rdo.jWH.setBackgroundColor(0);
      this.rdo.rdw.setBackgroundColor(0);
      this.rdo.jbJ.setBackgroundColor(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.rdo.rdw.getLayoutParams();
      if (localLayoutParams.height >= this.iev)
      {
        i = localLayoutParams.height;
        localLayoutParams.height = i;
        this.rdo.rdw.setLayoutParams(localLayoutParams);
        this.rdo.rdw.setImageBitmap(paramBitmap);
        AppMethodBeat.o(37638);
      }
    }
    while (true)
    {
      return;
      i = this.iev;
      break;
      cqc();
      AppMethodBeat.o(37638);
    }
  }

  private void cqc()
  {
    AppMethodBeat.i(37637);
    if ((this.rcX.hfo != null) && (this.rcX.hfo.length() > 0))
      ab.i("ContentFragment", "setting bg color %s", new Object[] { this.rcX.hfo });
    try
    {
      this.bgColor = Color.parseColor(this.rcX.hfo);
      this.rdo.jWH.setBackgroundColor(this.bgColor);
      this.rdo.rdw.setBackgroundColor(this.bgColor);
      this.rdo.jbJ.setBackgroundColor(this.bgColor);
      AppMethodBeat.o(37637);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("ContentFragment", "the color is error : " + this.rcX.hfo);
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(37635);
    if (this.rcX != paramg)
    {
      this.rcX = paramg;
      Vd();
    }
    AppMethodBeat.o(37635);
  }

  public final void cpn()
  {
    AppMethodBeat.i(37634);
    if ((this.rdb != null) && (getUserVisibleHint()))
      this.rdb.cpY();
    AppMethodBeat.o(37634);
  }

  public final Collection<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h> cqa()
  {
    AppMethodBeat.i(37639);
    Object localObject;
    if (this.rdp == null)
    {
      localObject = Collections.EMPTY_LIST;
      AppMethodBeat.o(37639);
    }
    while (true)
    {
      return localObject;
      localObject = this.rdp.cqa();
      AppMethodBeat.o(37639);
    }
  }

  public final void cqb()
  {
    AppMethodBeat.i(37633);
    if ((this.caA) && (this.rdb != null))
      this.rdb.cpX();
    AppMethodBeat.o(37633);
  }

  public final void cqd()
  {
    AppMethodBeat.i(37640);
    if ((!cqf()) || (this.rdi) || (this.rdo.rdy))
      AppMethodBeat.o(37640);
    while (true)
    {
      return;
      this.rdo.rdx.setVisibility(0);
      this.rdo.rdx.setTranslationY(-com.tencent.mm.bz.a.fromDPToPix(getContext(), 5));
      this.rdj.setRepeatMode(2);
      this.rdj.setRepeatCount(-1);
      this.rdj.start();
      AppMethodBeat.o(37640);
    }
  }

  public final void cqe()
  {
    AppMethodBeat.i(37641);
    this.rdo.rdx.setVisibility(4);
    this.rdo.rdx.setTranslationY(-com.tencent.mm.bz.a.fromDPToPix(getContext(), 5));
    this.rdj.setRepeatMode(2);
    this.rdj.setRepeatCount(0);
    this.rdj.end();
    AppMethodBeat.o(37641);
  }

  public final boolean cqf()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(37642);
    if (!this.rdg)
      AppMethodBeat.o(37642);
    while (true)
    {
      return bool2;
      if (this.rdk != 0)
      {
        AppMethodBeat.o(37642);
      }
      else if (this.rdl != 0)
      {
        AppMethodBeat.o(37642);
      }
      else
      {
        int i = this.qYM.iQ();
        if ((i != this.qYM.iS()) || (i != -1))
          break;
        AppMethodBeat.o(37642);
      }
    }
    bool2 = bool1;
    if (this.gnp)
      if (this.qYM.iS() == this.rdp.getItemCount() - 1)
        break label129;
    label129: for (bool2 = bool1; ; bool2 = false)
    {
      AppMethodBeat.o(37642);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(37627);
    super.onCreate(paramBundle);
    Map localMap = this.puc;
    paramBundle = ad.eP(getContext());
    this.ieu = paramBundle[0];
    this.iev = paramBundle[1];
    if (this.rcX == null)
      this.rcX = ((g)localMap.get("pageInfo"));
    this.rdd = ((ac)localMap.get("pageDownIconInfo"));
    this.rde = bo.e((Boolean)localMap.get("is_first_show_page"));
    this.gnp = bo.e((Boolean)localMap.get("is_last_shown_page"));
    this.rdf = bo.e((Boolean)localMap.get("needEnterAnimation"));
    this.rdg = bo.e((Boolean)localMap.get("needDirectionAnimation"));
    this.rcZ = bo.g(localMap.get("groupListCompShowIndex"), 0);
    AppMethodBeat.o(37627);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(37628);
    paramViewGroup = paramLayoutInflater.inflate(2130968631, paramViewGroup, false);
    this.rdo = new ContentFragment.b((byte)0);
    this.rdo.jWH = paramViewGroup;
    this.rdo.rdw = ((ImageView)paramViewGroup.findViewById(2131821023));
    this.rdo.jbJ = ((LinearLayout)paramViewGroup.findViewById(2131821024));
    this.rdo.rdx = ((ImageView)paramViewGroup.findViewById(2131821026));
    this.rdo.iJP = ((RecyclerView)paramViewGroup.findViewById(2131821025));
    this.rdo.rdz = ((LinearLayout)paramViewGroup.findViewById(2131821022));
    paramLayoutInflater = this.rdo.iJP;
    paramLayoutInflater.setOverScrollMode(2);
    paramLayoutInflater.setOnTouchListener(new b((DummyViewPager)this.puc.get("viewPager")));
    getActivity();
    this.qYM = new LinearLayoutManager();
    paramLayoutInflater.setLayoutManager(this.qYM);
    this.rdp = new a(this.rcX, this.bgColor, getActivity(), this.qYM);
    if (this.rde)
      this.rdp.rcZ = this.rcZ;
    paramLayoutInflater.setAdapter(this.rdp);
    paramLayoutInflater.setDescendantFocusability(131072);
    this.rdb = new c(paramLayoutInflater);
    paramLayoutInflater.a(new ContentFragment.1(this));
    paramViewGroup.setTag(this.rdo);
    Vd();
    this.rdj = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
    this.rdj.setDuration(this.rdc);
    this.rdj.addUpdateListener(new ContentFragment.4(this));
    this.rdj.addListener(new ContentFragment.5(this));
    this.rdj.setRepeatCount(-1);
    this.rdj.setRepeatMode(2);
    if ((this.rdd != null) && (!this.rdd.equals(this.rdo.rdx.getTag())))
    {
      this.rdo.rdx.setTag(this.rdd);
      this.rdo.rdx.setVisibility(8);
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(this.rdd.iconUrl, 1000000001, new ContentFragment.6(this));
    }
    if (this.rdn != null)
      this.rdn.n(this);
    AppMethodBeat.o(37628);
    return paramViewGroup;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(37631);
    super.onDestroy();
    if (this.rdb != null)
      this.rdb.rcF.onDestroy();
    cqe();
    AppMethodBeat.o(37631);
  }

  public void onPause()
  {
    AppMethodBeat.i(37630);
    super.onPause();
    ab.i("ContentFragment", this + " onPause " + getUserVisibleHint());
    this.caA = false;
    this.rdb.caA = this.caA;
    if ((this.rdb != null) && (getUserVisibleHint()))
      this.rdb.cpY();
    AppMethodBeat.o(37630);
  }

  public void onResume()
  {
    AppMethodBeat.i(37629);
    super.onResume();
    ab.i("ContentFragment", this + " onResume " + getUserVisibleHint());
    this.caA = true;
    if ((this.rdo != null) && (this.rdo.jWH != null))
    {
      ViewGroup localViewGroup1 = (ViewGroup)this.rdo.jWH.getParent();
      if ((localViewGroup1 != null) && (localViewGroup1.getParent() != null) && (localViewGroup1.getParent().getParent() != null))
      {
        ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.getParent().getParent();
        if (localViewGroup2.indexOfChild((View)localViewGroup1.getParent()) < localViewGroup2.getChildCount() - 2)
          this.caA = false;
      }
    }
    this.rdb.caA = this.caA;
    if ((this.rdb != null) && (getUserVisibleHint()))
      this.rdb.cpl();
    AppMethodBeat.o(37629);
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    AppMethodBeat.i(37632);
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean)
    {
      if (this.rdb == null)
        break label50;
      this.rdb.cpl();
      AppMethodBeat.o(37632);
    }
    while (true)
    {
      return;
      if (this.rdb != null)
        this.rdb.cpY();
      label50: AppMethodBeat.o(37632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment
 * JD-Core Version:    0.6.2
 */