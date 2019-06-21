package com.tencent.mm.plugin.facedetect.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

public class FaceProcessHintView extends LinearLayout
{
  private h mbs;
  private int mbt;
  private Animation mbu;

  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceProcessHintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(659);
    this.mbs = null;
    this.mbt = 0;
    this.mbu = null;
    setOrientation(0);
    setMinimumHeight(BackwardSupportUtil.b.b(getContext(), 36.0F));
    this.mbu = AnimationUtils.loadAnimation(paramContext, 2131034170);
    this.mbu.setInterpolator(new AccelerateDecelerateInterpolator());
    AppMethodBeat.o(659);
  }

  private void setCurrentProcessing(int paramInt)
  {
    AppMethodBeat.i(661);
    TextView localTextView = (TextView)getChildAt(paramInt).findViewById(2131823794);
    localTextView.setTextColor(getResources().getColor(2131690691));
    localTextView.setBackgroundResource(2130838659);
    AppMethodBeat.o(661);
  }

  @SuppressLint({"SetTextI18n"})
  public void setDataAndInvalidate(h paramh)
  {
    AppMethodBeat.i(660);
    this.mbs = paramh;
    if ((this.mbs == null) || (this.mbs.lTR <= 0))
    {
      ab.e("MicroMsg.FaceProcessHintView", "hy: model invalid");
      AppMethodBeat.o(660);
    }
    while (true)
    {
      return;
      removeAllViews();
      for (int i = 0; i < this.mbs.lTR; i++)
      {
        paramh = LayoutInflater.from(getContext()).inflate(2130969473, null, false);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        ((TextView)paramh.findViewById(2131823794)).setText(String.valueOf(i + 1));
        addView(paramh, localLayoutParams);
      }
      getChildAt(getChildCount() - 1).findViewById(2131823795).setVisibility(8);
      setCurrentProcessing(0);
      invalidate();
      AppMethodBeat.o(660);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceProcessHintView
 * JD-Core Version:    0.6.2
 */