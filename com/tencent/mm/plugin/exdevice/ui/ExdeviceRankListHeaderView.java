package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class ExdeviceRankListHeaderView extends RelativeLayout
{
  private TextView lDF;
  private View.OnClickListener lDG;
  private Animation lDH;
  private Animation lDI;
  private boolean lDJ;
  private Context mContext;
  private Runnable mHideRunnable;

  public ExdeviceRankListHeaderView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(20209);
    this.lDJ = true;
    cA(paramContext);
    AppMethodBeat.o(20209);
  }

  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(20208);
    this.lDJ = true;
    cA(paramContext);
    AppMethodBeat.o(20208);
  }

  private void aOR()
  {
    AppMethodBeat.i(20211);
    this.lDH = AnimationUtils.loadAnimation(this.mContext, 2131034112);
    this.lDI = AnimationUtils.loadAnimation(this.mContext, 2131034113);
    this.mHideRunnable = new ExdeviceRankListHeaderView.2(this);
    this.lDH.setAnimationListener(new ExdeviceRankListHeaderView.3(this));
    this.lDI.setAnimationListener(new ExdeviceRankListHeaderView.4(this));
    this.lDH.setFillAfter(true);
    this.lDH.setFillEnabled(true);
    this.lDI.setFillAfter(true);
    this.lDI.setFillAfter(true);
    AppMethodBeat.o(20211);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(20210);
    this.mContext = paramContext;
    this.lDF = ((TextView)LayoutInflater.from(this.mContext).inflate(2130969441, this, true).findViewById(2131823709));
    this.lDF.setVisibility(4);
    aOR();
    setOnClickListener(new ExdeviceRankListHeaderView.1(this));
    AppMethodBeat.o(20210);
  }

  public String getMotto()
  {
    AppMethodBeat.i(20213);
    String str = bo.bc(this.lDF.getText().toString(), "");
    AppMethodBeat.o(20213);
    return str;
  }

  public void setIsShowTip(boolean paramBoolean)
  {
    this.lDJ = paramBoolean;
  }

  public void setMotto(String paramString)
  {
    AppMethodBeat.i(20212);
    this.lDF.setText(paramString);
    AppMethodBeat.o(20212);
  }

  public void setOnViewClickListener(View.OnClickListener paramOnClickListener)
  {
    this.lDG = paramOnClickListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView
 * JD-Core Version:    0.6.2
 */