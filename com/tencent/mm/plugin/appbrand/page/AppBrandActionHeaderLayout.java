package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.f;

public class AppBrandActionHeaderLayout extends LinearLayout
{
  private LinearLayout iqp;
  private HorizontalScrollView iqq;
  private AppBrandActionSingleHeaderView iqr;
  private AppBrandActionMultipleHeaderView iqs;
  private AppBrandActionMultipleHeaderView iqt;
  private AppBrandActionMultipleHeaderView iqu;
  private AppBrandActionMultipleHeaderView iqv;
  private TextView iqw;
  private int iqx;
  private int iqy;
  private String mAppId;
  private Context mContext;

  public AppBrandActionHeaderLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(132328);
    this.iqx = 1;
    this.iqy = 2;
    cA(paramContext);
    AppMethodBeat.o(132328);
  }

  public AppBrandActionHeaderLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(132329);
    this.iqx = 1;
    this.iqy = 2;
    cA(paramContext);
    AppMethodBeat.o(132329);
  }

  @TargetApi(11)
  public AppBrandActionHeaderLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(132330);
    this.iqx = 1;
    this.iqy = 2;
    cA(paramContext);
    AppMethodBeat.o(132330);
  }

  private void aIY()
  {
    AppMethodBeat.i(132333);
    this.iqp.setVisibility(0);
    this.iqq.setVisibility(8);
    AppMethodBeat.o(132333);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(132331);
    this.mContext = paramContext;
    ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130968758, this);
    this.iqp = ((LinearLayout)findViewById(2131821462));
    this.iqq = ((HorizontalScrollView)findViewById(2131821464));
    this.iqr = ((AppBrandActionSingleHeaderView)findViewById(2131821463));
    this.iqs = ((AppBrandActionMultipleHeaderView)findViewById(2131821466));
    this.iqt = ((AppBrandActionMultipleHeaderView)findViewById(2131821467));
    this.iqu = ((AppBrandActionMultipleHeaderView)findViewById(2131821468));
    this.iqv = ((AppBrandActionMultipleHeaderView)findViewById(2131821469));
    this.iqw = ((TextView)findViewById(2131821470));
    this.iqs.setVisibility(8);
    this.iqt.setVisibility(8);
    this.iqu.setVisibility(8);
    this.iqv.setVisibility(8);
    this.iqw.setVisibility(8);
    AppMethodBeat.o(132331);
  }

  public final void cI(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132332);
    aIY();
    this.iqr.setImageDrawable(a.abQ());
    b.abR().a(this.iqr.getImageView(), paramString1, null, f.fqH);
    this.iqr.setTextViewText(paramString2);
    AppMethodBeat.o(132332);
  }

  public void setActionHeaderStyle(boolean paramBoolean)
  {
    AppMethodBeat.i(132334);
    if (paramBoolean)
    {
      this.iqr.setTextViewTextColor(this.mContext.getResources().getColor(2131690693));
      this.iqs.setTextViewTextColor(this.mContext.getResources().getColor(2131690693));
      this.iqt.setTextViewTextColor(this.mContext.getResources().getColor(2131690693));
      this.iqu.setTextViewTextColor(this.mContext.getResources().getColor(2131690693));
      this.iqv.setTextViewTextColor(this.mContext.getResources().getColor(2131690693));
      this.iqw.setTextColor(this.mContext.getResources().getColor(2131690693));
      AppMethodBeat.o(132334);
    }
    while (true)
    {
      return;
      this.iqr.setTextViewTextColor(this.mContext.getResources().getColor(2131689772));
      this.iqs.setTextViewTextColor(this.mContext.getResources().getColor(2131689772));
      this.iqt.setTextViewTextColor(this.mContext.getResources().getColor(2131689772));
      this.iqu.setTextViewTextColor(this.mContext.getResources().getColor(2131689772));
      this.iqv.setTextViewTextColor(this.mContext.getResources().getColor(2131689772));
      this.iqw.setTextColor(this.mContext.getResources().getColor(2131689772));
      AppMethodBeat.o(132334);
    }
  }

  public void setAppId(String paramString)
  {
    this.mAppId = paramString;
  }

  public void setStatusDescription(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(132335);
    this.iqw.setText(paramCharSequence);
    this.iqw.setVisibility(0);
    this.iqp.setVisibility(8);
    this.iqq.setVisibility(8);
    AppMethodBeat.o(132335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.AppBrandActionHeaderLayout
 * JD-Core Version:    0.6.2
 */