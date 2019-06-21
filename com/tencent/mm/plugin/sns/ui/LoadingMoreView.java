package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class LoadingMoreView extends LinearLayout
{
  private ImageView cDh;
  private Context context;
  protected LinearLayout khb;
  protected LinearLayout khc;
  protected LinearLayout rjW;
  protected LinearLayout rjX;
  protected TextView rjY;

  public LoadingMoreView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38281);
    this.context = paramContext;
    init();
    AppMethodBeat.o(38281);
  }

  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38280);
    this.context = paramContext;
    init();
    AppMethodBeat.o(38280);
  }

  private void init()
  {
    AppMethodBeat.i(38282);
    Object localObject = LayoutInflater.from(this.context).inflate(2130970784, this, true);
    this.cDh = ((ImageView)findViewById(2131822251));
    this.khb = ((LinearLayout)((View)localObject).findViewById(2131822250));
    this.khc = ((LinearLayout)((View)localObject).findViewById(2131822252));
    this.rjW = ((LinearLayout)((View)localObject).findViewById(2131827811));
    this.rjX = ((LinearLayout)((View)localObject).findViewById(2131827812));
    this.rjY = ((TextView)((View)localObject).findViewById(2131827813));
    this.khb.setVisibility(0);
    this.khc.setVisibility(8);
    this.rjW.setVisibility(8);
    this.rjX.setVisibility(8);
    localObject = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    ((Animation)localObject).setDuration(1000L);
    ((Animation)localObject).setRepeatCount(-1);
    ((Animation)localObject).setInterpolator(new LinearInterpolator());
    this.cDh.startAnimation((Animation)localObject);
    AppMethodBeat.o(38282);
  }

  public final void bf(int paramInt, String paramString)
  {
    AppMethodBeat.i(138385);
    this.khb.setVisibility(8);
    this.rjW.setVisibility(8);
    this.khc.setVisibility(8);
    this.rjX.setVisibility(0);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
    {
      if (paramInt != 2001)
        break label83;
      str = getContext().getResources().getString(2131303750);
    }
    while (true)
    {
      this.rjY.setText(str);
      AppMethodBeat.o(138385);
      return;
      label83: if (paramInt == 2003)
      {
        str = getContext().getResources().getString(2131303606);
      }
      else if (paramInt == 2004)
      {
        str = getContext().getResources().getString(2131303751);
      }
      else if (paramInt == 2005)
      {
        str = getContext().getResources().getString(2131305966);
      }
      else
      {
        str = paramString;
        if (paramInt == 203)
          str = getContext().getResources().getString(2131303782);
      }
    }
  }

  public final void lc(boolean paramBoolean)
  {
    AppMethodBeat.i(38283);
    this.khb.setVisibility(8);
    if (paramBoolean)
    {
      this.rjW.setVisibility(0);
      this.khc.setVisibility(8);
    }
    while (true)
    {
      this.rjX.setVisibility(8);
      AppMethodBeat.o(38283);
      return;
      this.khc.setVisibility(0);
      this.rjW.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LoadingMoreView
 * JD-Core Version:    0.6.2
 */