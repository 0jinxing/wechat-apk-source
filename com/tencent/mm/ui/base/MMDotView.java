package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MMDotView extends LinearLayout
{
  private int ehD;
  private int ytZ;
  private int yua;

  public MMDotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106528);
    this.ehD = 9;
    this.ytZ = 2130839769;
    this.yua = 2130839764;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(106528);
  }

  @TargetApi(11)
  public MMDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106527);
    this.ehD = 9;
    this.ytZ = 2130839769;
    this.yua = 2130839764;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(106527);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(106529);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.MMDotView);
    int i = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    setDotCount(i);
    AppMethodBeat.o(106529);
  }

  public void setDarkStyle(boolean paramBoolean)
  {
    if (paramBoolean)
      this.ytZ = 2130839770;
    for (this.yua = 2130839765; ; this.yua = 2130839764)
    {
      return;
      this.ytZ = 2130839769;
    }
  }

  public void setDotCount(int paramInt)
  {
    AppMethodBeat.i(106531);
    ab.v("MicroMsg.MMDotView", "setDotCount:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0)
      AppMethodBeat.o(106531);
    while (true)
    {
      return;
      int i = paramInt;
      if (paramInt > this.ehD)
      {
        ab.i("MicroMsg.MMDotView", "large than max count");
        i = this.ehD;
      }
      removeAllViews();
      while (i != 0)
      {
        localImageView = (ImageView)View.inflate(getContext(), 2130970231, null);
        localImageView.setImageResource(this.ytZ);
        addView(localImageView);
        i--;
      }
      ImageView localImageView = (ImageView)getChildAt(0);
      if (localImageView != null)
        localImageView.setImageResource(this.yua);
      AppMethodBeat.o(106531);
    }
  }

  public void setInvertedStyle(boolean paramBoolean)
  {
    if (paramBoolean)
      this.ytZ = 2130839764;
    for (this.yua = 2130839769; ; this.yua = 2130839764)
    {
      return;
      this.ytZ = 2130839769;
    }
  }

  public void setMaxCount(int paramInt)
  {
    AppMethodBeat.i(106530);
    ab.d("MicroMsg.MMDotView", "setMaxCount:%d", new Object[] { Integer.valueOf(paramInt) });
    this.ehD = paramInt;
    AppMethodBeat.o(106530);
  }

  public void setSelectedDot(int paramInt)
  {
    AppMethodBeat.i(106532);
    ab.v("MicroMsg.MMDotView", "setSelectedDot:target index is %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    if (paramInt >= getChildCount())
      i = getChildCount() - 1;
    while (true)
    {
      ab.v("MicroMsg.MMDotView", "setSelectedDot:after adjust index is %d", new Object[] { Integer.valueOf(i) });
      for (paramInt = 0; paramInt < getChildCount(); paramInt++)
        ((ImageView)getChildAt(paramInt)).setImageResource(this.ytZ);
      i = paramInt;
      if (paramInt < 0)
        i = 0;
    }
    ImageView localImageView = (ImageView)getChildAt(i);
    if (localImageView != null)
      localImageView.setImageResource(this.yua);
    AppMethodBeat.o(106532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMDotView
 * JD-Core Version:    0.6.2
 */