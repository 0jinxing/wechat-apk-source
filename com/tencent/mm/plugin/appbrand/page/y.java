package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

@SuppressLint({"ViewConstructor"})
public final class y extends x
{
  private aj isJ;
  private y.a itV;
  private y.b itW;
  private boolean itX;
  private LinearLayout itY;
  private TextView itZ;
  private View iua;
  private ImageView iub;
  private ImageView iuc;
  private ImageView iud;
  private long iue;

  public y(Context paramContext, aj paramaj)
  {
    super(paramContext);
    AppMethodBeat.i(87290);
    this.itX = false;
    this.iue = 0L;
    this.isJ = paramaj;
    this.itY = ((LinearLayout)LayoutInflater.from(getContext()).inflate(2130968711, this, false));
    paramContext = this.itY;
    paramaj = paramaj.getWrapperView();
    this.itI = paramContext;
    this.itJ = new FrameLayout(getContext());
    this.itJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.itJ.addView(paramContext);
    this.WL = paramaj;
    this.itK = new FrameLayout(getContext());
    this.itK.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.itK.addView(paramaj);
    addView(this.itJ);
    addView(this.itK);
    this.itZ = ((TextView)findViewById(2131821320));
    this.iua = findViewById(2131821321);
    this.iub = ((ImageView)findViewById(2131821322));
    this.iuc = ((ImageView)findViewById(2131821323));
    this.iud = ((ImageView)findViewById(2131821324));
    AppMethodBeat.o(87290);
  }

  private static AnimationDrawable e(int paramInt, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(87302);
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    localAnimationDrawable.addFrame(k(paramInt, paramArrayOfFloat[0]), 0);
    localAnimationDrawable.addFrame(k(paramInt, paramArrayOfFloat[1]), 300);
    localAnimationDrawable.addFrame(k(paramInt, paramArrayOfFloat[2]), 300);
    localAnimationDrawable.addFrame(k(paramInt, paramArrayOfFloat[3]), 300);
    AppMethodBeat.o(87302);
    return localAnimationDrawable;
  }

  private static Drawable k(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(87303);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    AppMethodBeat.o(87303);
    return localShapeDrawable;
  }

  protected final boolean aAO()
  {
    AppMethodBeat.i(87295);
    boolean bool = this.isJ.aAO();
    AppMethodBeat.o(87295);
    return bool;
  }

  protected final void aKc()
  {
    AppMethodBeat.i(87291);
    ((AnimationDrawable)this.iub.getDrawable()).start();
    ((AnimationDrawable)this.iuc.getDrawable()).start();
    ((AnimationDrawable)this.iud.getDrawable()).start();
    if (this.itV != null)
      this.itV.aJR();
    this.iue = System.currentTimeMillis();
    AppMethodBeat.o(87291);
  }

  protected final void aKd()
  {
    AppMethodBeat.i(87292);
    ((AnimationDrawable)this.iub.getDrawable()).stop();
    ((AnimationDrawable)this.iub.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.iuc.getDrawable()).stop();
    ((AnimationDrawable)this.iuc.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.iud.getDrawable()).stop();
    ((AnimationDrawable)this.iud.getDrawable()).selectDrawable(0);
    AppMethodBeat.o(87292);
  }

  public final void aKe()
  {
    AppMethodBeat.i(87294);
    long l = System.currentTimeMillis() - this.iue;
    if (l < 1000L)
    {
      postDelayed(new y.1(this), 1000L - l);
      AppMethodBeat.o(87294);
    }
    while (true)
    {
      return;
      aKb();
      AppMethodBeat.o(87294);
    }
  }

  public final void bq(String paramString, int paramInt)
  {
    AppMethodBeat.i(87298);
    setBackgroundTextStyle(paramString);
    setPullDownBackgroundColor(paramInt);
    AppMethodBeat.o(87298);
  }

  public final void dO(boolean paramBoolean)
  {
    AppMethodBeat.i(87301);
    this.itX = paramBoolean;
    setNeedStay(paramBoolean);
    View localView = this.iua;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(87301);
      return;
    }
  }

  protected final int getStayHeight()
  {
    AppMethodBeat.i(87296);
    int i = this.itY.getHeight();
    AppMethodBeat.o(87296);
    return i;
  }

  protected final void pt(int paramInt)
  {
    AppMethodBeat.i(87293);
    if (this.itW != null)
      this.itW.nT(paramInt);
    if (!this.itX)
      AppMethodBeat.o(87293);
    while (true)
    {
      return;
      int i = paramInt;
      if (paramInt > this.itY.getHeight())
        i = this.itY.getHeight();
      LinearLayout localLinearLayout = this.itY;
      localLinearLayout.setTranslationY(i - localLinearLayout.getHeight());
      AppMethodBeat.o(87293);
    }
  }

  public final void setBackgroundTextStyle(String paramString)
  {
    AppMethodBeat.i(87299);
    if ("light".equals(paramString))
    {
      this.iub.setImageDrawable(e(-1, new float[] { 0.2F, 0.6F, 0.4F, 0.2F }));
      this.iuc.setImageDrawable(e(-1, new float[] { 0.2F, 0.2F, 0.6F, 0.4F }));
      this.iud.setImageDrawable(e(-1, new float[] { 0.2F, 0.4F, 0.2F, 0.6F }));
      this.itZ.setTextColor(-1);
      this.itZ.setAlpha(0.4F);
      AppMethodBeat.o(87299);
    }
    while (true)
    {
      return;
      if (("dark".equals(paramString)) || (!"ignore".equals(paramString)))
      {
        this.iub.setImageDrawable(e(-16777216, new float[] { 0.1F, 0.4F, 0.2F, 0.1F }));
        this.iuc.setImageDrawable(e(-16777216, new float[] { 0.1F, 0.1F, 0.4F, 0.2F }));
        this.iud.setImageDrawable(e(-16777216, new float[] { 0.1F, 0.2F, 0.1F, 0.4F }));
        this.itZ.setTextColor(-16777216);
        this.itZ.setAlpha(0.2F);
      }
      AppMethodBeat.o(87299);
    }
  }

  public final void setHeadViewHeight(int paramInt)
  {
    AppMethodBeat.i(87297);
    if (paramInt <= this.itY.getHeight())
      AppMethodBeat.o(87297);
    while (true)
    {
      return;
      this.itY.getLayoutParams().height = paramInt;
      this.itY.requestLayout();
      AppMethodBeat.o(87297);
    }
  }

  public final void setOnPullDownListener(y.a parama)
  {
    this.itV = parama;
  }

  public final void setOnPullDownOffsetListener(y.b paramb)
  {
    this.itW = paramb;
  }

  public final void setPullDownText(String paramString)
  {
    AppMethodBeat.i(87300);
    if (bo.isNullOrNil(paramString))
    {
      this.itZ.setVisibility(8);
      AppMethodBeat.o(87300);
    }
    while (true)
    {
      return;
      this.itZ.setVisibility(0);
      this.itZ.setText(paramString);
      AppMethodBeat.o(87300);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.y
 * JD-Core Version:    0.6.2
 */