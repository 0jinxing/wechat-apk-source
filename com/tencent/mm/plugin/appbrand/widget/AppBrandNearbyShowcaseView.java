package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class AppBrandNearbyShowcaseView extends FrameLayout
{
  private int iTU;
  private int lz;

  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(93789);
    this.lz = a.fromDPToPix(getContext(), 25);
    this.iTU = a.fromDPToPix(getContext(), 19);
    AppMethodBeat.o(93789);
  }

  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(93790);
    this.lz = a.fromDPToPix(getContext(), 25);
    this.iTU = a.fromDPToPix(getContext(), 19);
    AppMethodBeat.o(93790);
  }

  private void aOA()
  {
    AppMethodBeat.i(93793);
    if (getChildCount() > 0)
    {
      for (int i = getChildCount() - 1; i >= 0; i--)
      {
        View localView = getChildAt(i);
        Object localObject = localView.getLayoutParams();
        ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
        int j = this.lz;
        localLayoutParams.height = j;
        ((ViewGroup.LayoutParams)localObject).width = j;
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).gravity |= 5;
        ((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin = (this.iTU * i);
      }
      requestLayout();
      invalidate();
    }
    AppMethodBeat.o(93793);
  }

  public final void aOB()
  {
    int i = 1;
    AppMethodBeat.i(93797);
    if (getChildCount() > 1)
    {
      int j = 200;
      while (i < getChildCount())
      {
        getChildAt(i).animate().setDuration(j).translationX(0.0F).start();
        j += 50;
        i++;
      }
    }
    AppMethodBeat.o(93797);
  }

  public final void eO(boolean paramBoolean)
  {
    AppMethodBeat.i(93796);
    if (getChildCount() > 1)
    {
      int i = 200;
      int j = getChildCount() - 1;
      if (j >= 0)
      {
        View localView = getChildAt(j);
        if (paramBoolean)
          localView.animate().setDuration(i).translationX(((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin).start();
        while (true)
        {
          i += 50;
          j--;
          break;
          localView.setTranslationX(((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin);
        }
      }
    }
    AppMethodBeat.o(93796);
  }

  public final int getExpandDuration()
  {
    AppMethodBeat.i(93798);
    int i;
    if (getChildCount() <= 1)
    {
      i = 0;
      AppMethodBeat.o(93798);
    }
    while (true)
    {
      return i;
      i = (getChildCount() - 2) * 50 + 200;
      AppMethodBeat.o(93798);
    }
  }

  public final ImageView qf(int paramInt)
  {
    AppMethodBeat.i(93795);
    ImageView localImageView = (ImageView)getChildAt(getChildCount() - 1 - paramInt);
    AppMethodBeat.o(93795);
    return localImageView;
  }

  public final void setIconGap(int paramInt)
  {
    AppMethodBeat.i(93792);
    if ((paramInt >= 0) && (this.iTU != paramInt))
    {
      this.iTU = paramInt;
      aOA();
    }
    AppMethodBeat.o(93792);
  }

  public final void setIconLayerCount(int paramInt)
  {
    AppMethodBeat.i(93794);
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
    AppMethodBeat.o(93794);
  }

  public final void setIconSize(int paramInt)
  {
    AppMethodBeat.i(93791);
    if ((paramInt > 0) && (paramInt != this.lz))
    {
      this.lz = paramInt;
      aOA();
    }
    AppMethodBeat.o(93791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView
 * JD-Core Version:    0.6.2
 */