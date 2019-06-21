package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LuDotView extends LinearLayout
{
  private int lfO;
  private int mCount;
  private GradientDrawable oiN;
  private GradientDrawable oiO;

  public LuDotView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(116836);
    this.mCount = 0;
    this.lfO = 0;
    init();
    AppMethodBeat.o(116836);
  }

  public LuDotView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116837);
    this.mCount = 0;
    this.lfO = 0;
    init();
    AppMethodBeat.o(116837);
  }

  public LuDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(116838);
    this.mCount = 0;
    this.lfO = 0;
    init();
    AppMethodBeat.o(116838);
  }

  @TargetApi(11)
  public LuDotView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    AppMethodBeat.i(116839);
    this.mCount = 0;
    this.lfO = 0;
    init();
    AppMethodBeat.o(116839);
  }

  private void init()
  {
    AppMethodBeat.i(116840);
    this.oiN = ((GradientDrawable)getContext().getResources().getDrawable(2130838514));
    this.oiO = ((GradientDrawable)getContext().getResources().getDrawable(2130838514));
    AppMethodBeat.o(116840);
  }

  public void setIndicatorActiveColor(int paramInt)
  {
    AppMethodBeat.i(116844);
    this.oiO.setColor(paramInt);
    AppMethodBeat.o(116844);
  }

  public void setIndicatorColor(int paramInt)
  {
    AppMethodBeat.i(116843);
    this.oiN.setColor(paramInt);
    AppMethodBeat.o(116843);
  }

  public void setLuDotViewOrientation(int paramInt)
  {
    AppMethodBeat.i(116841);
    setOrientation(paramInt);
    if (paramInt == 1)
    {
      setGravity(21);
      AppMethodBeat.o(116841);
    }
    while (true)
    {
      return;
      setGravity(81);
      AppMethodBeat.o(116841);
    }
  }

  public void setSelectedIndex(int paramInt)
  {
    AppMethodBeat.i(116842);
    if (this.lfO == paramInt)
      AppMethodBeat.o(116842);
    while (true)
    {
      return;
      int i;
      label64: ImageView localImageView;
      if (paramInt > getChildCount())
      {
        d.d("LuDotView", "index %d is bigger then view count %d. make index to view count", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getChildCount()) });
        i = getChildCount() - 1;
        paramInt = 0;
        if (paramInt >= getChildCount())
          break label140;
        localImageView = (ImageView)getChildAt(paramInt);
        if (paramInt != i)
          break label129;
        localImageView.setImageDrawable(this.oiO);
      }
      while (true)
      {
        paramInt++;
        break label64;
        i = paramInt;
        if (paramInt >= 0)
          break;
        d.d("LuDotView", "index %d is litter then 0. make index to 0", new Object[] { Integer.valueOf(paramInt) });
        i = 0;
        break;
        label129: localImageView.setImageDrawable(this.oiN);
      }
      label140: this.lfO = i;
      AppMethodBeat.o(116842);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuDotView
 * JD-Core Version:    0.6.2
 */