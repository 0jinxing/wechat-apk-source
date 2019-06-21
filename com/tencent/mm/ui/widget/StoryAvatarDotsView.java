package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class StoryAvatarDotsView extends FrameLayout
{
  private int iTU;
  private int lz;

  public StoryAvatarDotsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107965);
    this.lz = a.fromDPToPix(getContext(), 25);
    this.iTU = a.fromDPToPix(getContext(), 19);
    AppMethodBeat.o(107965);
  }

  public StoryAvatarDotsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107966);
    this.lz = a.fromDPToPix(getContext(), 25);
    this.iTU = a.fromDPToPix(getContext(), 19);
    AppMethodBeat.o(107966);
  }

  private void aOA()
  {
    AppMethodBeat.i(107969);
    if (getChildCount() > 0)
    {
      for (int i = getChildCount() - 1; i >= 0; i--)
      {
        View localView = getChildAt(i);
        ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
        Object localObject = localView.getLayoutParams();
        int j = this.lz;
        ((ViewGroup.LayoutParams)localObject).height = j;
        localLayoutParams.width = j;
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).gravity |= 5;
        ((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin = (this.iTU * i);
      }
      requestLayout();
      invalidate();
    }
    AppMethodBeat.o(107969);
  }

  public final int getExpandDuration()
  {
    AppMethodBeat.i(107972);
    int i;
    if (getChildCount() <= 1)
    {
      i = 0;
      AppMethodBeat.o(107972);
    }
    while (true)
    {
      return i;
      i = (getChildCount() - 2) * 50 + 200;
      AppMethodBeat.o(107972);
    }
  }

  public final ImageView qf(int paramInt)
  {
    AppMethodBeat.i(107971);
    ImageView localImageView = (ImageView)getChildAt(getChildCount() - 1 - paramInt);
    AppMethodBeat.o(107971);
    return localImageView;
  }

  public final void setIconGap(int paramInt)
  {
    AppMethodBeat.i(107968);
    if ((paramInt >= 0) && (this.iTU != paramInt))
    {
      this.iTU = paramInt;
      aOA();
    }
    AppMethodBeat.o(107968);
  }

  public final void setIconLayerCount(int paramInt)
  {
    AppMethodBeat.i(107970);
    if ((paramInt >= 0) && (paramInt != getChildCount()))
    {
      if (paramInt > getChildCount())
      {
        int i = getChildCount();
        for (int j = 0; j < paramInt - i; j++)
        {
          ImageView localImageView = new ImageView(getContext());
          FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.lz, this.lz);
          localLayoutParams.gravity = 16;
          addViewInLayout(localImageView, 0, localLayoutParams, true);
        }
      }
      if (paramInt < getChildCount())
        removeViewsInLayout(0, getChildCount() - paramInt);
      aOA();
    }
    AppMethodBeat.o(107970);
  }

  public final void setIconSize(int paramInt)
  {
    AppMethodBeat.i(107967);
    if ((paramInt > 0) && (paramInt != this.lz))
    {
      this.lz = paramInt;
      aOA();
    }
    AppMethodBeat.o(107967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.StoryAvatarDotsView
 * JD-Core Version:    0.6.2
 */