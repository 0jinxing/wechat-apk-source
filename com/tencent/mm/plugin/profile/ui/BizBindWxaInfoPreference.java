package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public class BizBindWxaInfoPreference extends Preference
{
  private static DisplayMetrics iQY;
  private static int iUs;
  private static int iUt;
  private d gIN;
  private TextView iDT;
  private List<WxaAttributes.WxaEntryInfo> iUl;
  private View iUm;
  private ImageView iUn;
  private TextView iUo;
  private LinearLayout iUp;
  private ViewGroup iUq;
  private View iUr;
  private View.OnClickListener lBl;
  private volatile boolean pkJ;
  private volatile boolean pkK;
  private View.OnClickListener pkL;

  static
  {
    AppMethodBeat.i(23305);
    iQY = ah.getContext().getResources().getDisplayMetrics();
    iUs = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 15);
    iUt = ah.getResources().getDimensionPixelSize(2131427810);
    AppMethodBeat.o(23305);
  }

  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23297);
    init();
    AppMethodBeat.o(23297);
  }

  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23296);
    init();
    AppMethodBeat.o(23296);
  }

  private void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo)
  {
    AppMethodBeat.i(23303);
    ImageView localImageView = new ImageView(this.mContext);
    localImageView.setLayoutParams(new ViewGroup.LayoutParams(iUt + iUs, iUt));
    localImageView.setPadding(0, 0, iUs, 0);
    this.iUp.addView(localImageView);
    a(paramWxaEntryInfo, localImageView, null);
    AppMethodBeat.o(23303);
  }

  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    AppMethodBeat.i(23304);
    if (paramWxaEntryInfo == null)
      AppMethodBeat.o(23304);
    while (true)
    {
      return;
      String str = paramWxaEntryInfo.username;
      if (paramImageView != null)
      {
        paramImageView.setTag(str);
        b.abR().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
      }
      if (paramTextView != null)
        paramTextView.setText(bo.nullAsNil(paramWxaEntryInfo.title));
      AppMethodBeat.o(23304);
    }
  }

  private void azx()
  {
    AppMethodBeat.i(23301);
    if ((!this.pkJ) || (this.iUl == null))
      AppMethodBeat.o(23301);
    while (true)
    {
      return;
      if (this.pkK)
        break;
      AppMethodBeat.o(23301);
    }
    this.pkK = false;
    if (!this.iUl.isEmpty());
    for (WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.iUl.get(0); ; localWxaEntryInfo = null)
    {
      if (localWxaEntryInfo != null)
        a(localWxaEntryInfo, this.iUn, this.iDT);
      this.iUo.setText(this.mContext.getString(2131298449, new Object[] { Integer.valueOf(this.iUl.size()) }));
      cB(this.iUl);
      if (this.iUl.size() == 1)
      {
        this.iUm.setVisibility(0);
        this.iUq.setTag(((WxaAttributes.WxaEntryInfo)this.iUl.get(0)).username);
        this.iUq.setOnClickListener(this.lBl);
        AppMethodBeat.o(23301);
        break;
      }
      this.iUm.setVisibility(8);
      this.iUq.setTag(null);
      this.iUq.setOnClickListener(this.pkL);
      AppMethodBeat.o(23301);
      break;
    }
  }

  private void cB(List<WxaAttributes.WxaEntryInfo> paramList)
  {
    AppMethodBeat.i(23302);
    this.iUp.removeAllViews();
    if (paramList.isEmpty())
      AppMethodBeat.o(23302);
    while (true)
    {
      return;
      int i = paramList.size();
      int j = this.iUq.getMeasuredWidth();
      int k = j;
      if (j == 0)
        k = iQY.widthPixels;
      j = k - this.iUq.getPaddingLeft() - this.iUq.getPaddingRight();
      k = j / (iUt + iUs);
      if (k > i)
        this.iUr.setVisibility(8);
      while (true)
      {
        j = Math.min(k, i);
        if (j <= 1)
          break;
        for (k = 0; k < j; k++)
          a((WxaAttributes.WxaEntryInfo)paramList.get(k));
        this.iUr.setVisibility(0);
        k = (j - this.iUr.getMeasuredWidth()) / (iUt + iUs);
      }
      ab.i("MicroMsg.BizBindWxaInfoPreference", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(paramList.size()) });
      AppMethodBeat.o(23302);
    }
  }

  private void init()
  {
    AppMethodBeat.i(23300);
    this.lBl = new BizBindWxaInfoPreference.1(this);
    this.pkL = new BizBindWxaInfoPreference.2(this);
    AppMethodBeat.o(23300);
  }

  public final void a(d paramd, List<WxaAttributes.WxaEntryInfo> paramList)
  {
    AppMethodBeat.i(23299);
    this.pkK = true;
    this.gIN = paramd;
    if (this.iUl == null)
      this.iUl = new LinkedList();
    while (true)
    {
      if ((paramList != null) && (!paramList.isEmpty()))
        this.iUl.addAll(paramList);
      azx();
      AppMethodBeat.o(23299);
      return;
      this.iUl.clear();
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23298);
    this.iUm = paramView.findViewById(2131821312);
    this.iUn = ((ImageView)paramView.findViewById(2131821313));
    this.iDT = ((TextView)paramView.findViewById(2131821314));
    this.iUo = ((TextView)paramView.findViewById(2131821317));
    this.iUr = paramView.findViewById(2131821316);
    this.iUp = ((LinearLayout)paramView.findViewById(2131821315));
    this.iUq = ((ViewGroup)paramView.findViewById(2131821311));
    this.pkJ = true;
    if (this.iUl != null);
    for (boolean bool = true; ; bool = false)
    {
      this.pkK = bool;
      azx();
      super.onBindView(paramView);
      AppMethodBeat.o(23298);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference
 * JD-Core Version:    0.6.2
 */