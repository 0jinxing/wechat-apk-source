package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LoadingMoreView extends LinearLayout
{
  private ImageView cDh;
  private Context context;
  protected LinearLayout khb;

  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22967);
    this.context = paramContext;
    paramContext = LayoutInflater.from(this.context).inflate(2130969933, this, true);
    this.cDh = ((ImageView)findViewById(2131825254));
    this.khb = ((LinearLayout)paramContext.findViewById(2131822250));
    this.khb.setVisibility(0);
    paramContext = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    paramContext.setDuration(1000L);
    paramContext.setRepeatCount(-1);
    paramContext.setInterpolator(new LinearInterpolator());
    this.cDh.startAnimation(paramContext);
    AppMethodBeat.o(22967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.LoadingMoreView
 * JD-Core Version:    0.6.2
 */