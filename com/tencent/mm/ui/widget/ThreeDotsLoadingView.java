package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.k.a;

public class ThreeDotsLoadingView extends FrameLayout
{
  private boolean OG;
  private int zOE;
  private boolean zOF;
  private ViewGroup zOG;
  private ImageView zOH;
  private ImageView zOI;
  private ImageView zOJ;
  private final Runnable zOK;

  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(77515);
    this.zOE = -16777216;
    this.OG = false;
    this.zOF = false;
    this.zOK = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(77514);
        ThreeDotsLoadingView.a(ThreeDotsLoadingView.this);
        ((AnimationDrawable)ThreeDotsLoadingView.b(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.c(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.d(ThreeDotsLoadingView.this).getDrawable()).start();
        AppMethodBeat.o(77514);
      }
    };
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(77515);
  }

  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(77516);
    this.zOE = -16777216;
    this.OG = false;
    this.zOF = false;
    this.zOK = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(77514);
        ThreeDotsLoadingView.a(ThreeDotsLoadingView.this);
        ((AnimationDrawable)ThreeDotsLoadingView.b(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.c(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.d(ThreeDotsLoadingView.this).getDrawable()).start();
        AppMethodBeat.o(77514);
      }
    };
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(77516);
  }

  private void dKU()
  {
    AppMethodBeat.i(77523);
    this.zOH.setImageDrawable(k(this.zOE, 0.5F));
    this.zOI.setImageDrawable(k(this.zOE, 0.4F));
    this.zOJ.setImageDrawable(k(this.zOE, 0.3F));
    AppMethodBeat.o(77523);
  }

  private static AnimationDrawable e(int paramInt, float[] paramArrayOfFloat)
  {
    int i = 0;
    AppMethodBeat.i(77524);
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    while (i < 3)
    {
      localAnimationDrawable.addFrame(k(paramInt, paramArrayOfFloat[i]), 300);
      i++;
    }
    AppMethodBeat.o(77524);
    return localAnimationDrawable;
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(77517);
    this.zOG = ((ViewGroup)LayoutInflater.from(paramContext).inflate(2130969927, this, true));
    this.zOH = ((ImageView)this.zOG.findViewById(2131825243));
    this.zOI = ((ImageView)this.zOG.findViewById(2131825244));
    this.zOJ = ((ImageView)this.zOG.findViewById(2131825245));
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, k.a.ThreeDotsLoadingView);
      this.zOE = paramContext.getColor(0, -16777216);
      paramContext.recycle();
    }
    dKU();
    AppMethodBeat.o(77517);
  }

  private static Drawable k(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(77525);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    AppMethodBeat.o(77525);
    return localShapeDrawable;
  }

  public final void dKS()
  {
    AppMethodBeat.i(77521);
    if (!s.av(this))
    {
      this.zOF = true;
      AppMethodBeat.o(77521);
    }
    while (true)
    {
      return;
      if (this.OG)
      {
        AppMethodBeat.o(77521);
      }
      else
      {
        this.OG = true;
        dKU();
        postDelayed(this.zOK, 300L);
        AppMethodBeat.o(77521);
      }
    }
  }

  public final void dKT()
  {
    AppMethodBeat.i(77522);
    this.zOF = false;
    if (!this.OG)
      AppMethodBeat.o(77522);
    while (true)
    {
      return;
      this.OG = false;
      removeCallbacks(this.zOK);
      if ((this.zOH.getDrawable() instanceof AnimationDrawable))
      {
        ((AnimationDrawable)this.zOH.getDrawable()).stop();
        ((AnimationDrawable)this.zOI.getDrawable()).stop();
        ((AnimationDrawable)this.zOJ.getDrawable()).stop();
      }
      AppMethodBeat.o(77522);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(77519);
    super.onAttachedToWindow();
    if (this.zOF)
    {
      this.zOF = false;
      dKS();
    }
    AppMethodBeat.o(77519);
  }

  public void setAlpha(float paramFloat)
  {
    AppMethodBeat.i(77520);
    this.zOH.setAlpha(paramFloat);
    this.zOI.setAlpha(paramFloat);
    this.zOJ.setAlpha(paramFloat);
    if (getBackground() != null)
      getBackground().setAlpha(Math.round(255.0F * paramFloat));
    AppMethodBeat.o(77520);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(77518);
    if ((8 == paramInt) || (4 == paramInt))
      dKT();
    super.setVisibility(paramInt);
    AppMethodBeat.o(77518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.ThreeDotsLoadingView
 * JD-Core Version:    0.6.2
 */