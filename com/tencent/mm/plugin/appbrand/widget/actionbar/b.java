package com.tencent.mm.plugin.appbrand.widget.actionbar;

import a.f.b.j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.a.d.a;
import com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.a;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.b;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class b extends LinearLayout
  implements f
{
  protected CircleProgressDrawable iUA;
  protected AppBrandOptionButton iUB;
  protected AppBrandCapsuleHomeButton iUC;
  protected LinearLayout iUD;
  protected ImageView iUE;
  protected int iUF;
  protected int iUG;
  protected double iUH;
  protected boolean iUI;
  protected boolean iUJ;
  protected c iUK;
  private e iUL;
  private b.a iUM;
  private final Set<a> iUN;
  private boolean iUO;
  private AppBrandActionBarCustomImageView iUP;
  protected ImageView iUu;
  protected View iUv;
  protected View iUw;
  protected TextView iUx;
  protected TextView iUy;
  protected ProgressBar iUz;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87453);
    this.iUK = new c();
    this.iUN = new LinkedHashSet();
    this.iUO = false;
    this.iUI = false;
    this.iUJ = false;
    setOrientation(1);
    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    setBackgroundResource(2131689639);
    addView(((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130968654, this, false));
    this.iUF = -1;
    this.iUG = getResources().getColor(2131689639);
    this.iUH = 1.0D;
    this.iUu = ((ImageView)findViewById(2131821113));
    this.iUv = findViewById(2131821112);
    this.iUw = findViewById(2131821120);
    this.iUx = ((TextView)findViewById(2131821122));
    this.iUy = ((TextView)findViewById(2131821123));
    this.iUz = ((ProgressBar)findViewById(2131821124));
    this.iUA = new CircleProgressDrawable();
    this.iUB = ((AppBrandOptionButton)findViewById(2131821116));
    this.iUC = ((AppBrandCapsuleHomeButton)findViewById(2131821118));
    this.iUD = ((LinearLayout)findViewById(2131821115));
    this.iUP = ((AppBrandActionBarCustomImageView)findViewById(2131821119));
    this.iUE = ((ImageView)findViewById(2131821117));
    this.iUL = new e();
    paramContext = this.iUL;
    AppBrandOptionButton localAppBrandOptionButton = this.iUB;
    j.p(localAppBrandOptionButton, "button");
    paramContext.iUZ = localAppBrandOptionButton;
    this.iUv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(87449);
        b.this.iUK.cA(b.this.iUv);
        AppMethodBeat.o(87449);
      }
    });
    this.iUC.setOnClickListener(new b.2(this));
    this.iUB.setAccessibilityLabel(getContext().getString(2131296539));
    this.iUC.setAccessibilityLabel(getContext().getString(2131296535));
    AppMethodBeat.o(87453);
  }

  private void aOH()
  {
    AppMethodBeat.i(87463);
    this.iUw.setOnClickListener(new b.3(this));
    AppMethodBeat.o(87463);
  }

  private void aOK()
  {
    AppMethodBeat.i(87473);
    if (this.iUM == null)
    {
      this.iUu.setImageResource(2130837616);
      this.iUu.setColorFilter(this.iUF, PorterDuff.Mode.SRC_ATOP);
    }
    while (true)
    {
      this.iUx.setTextColor(this.iUF);
      this.iUy.setTextColor(this.iUF);
      this.iUA.setStrokeColor(this.iUF);
      this.iUz.setLayerType(1, null);
      this.iUz.setIndeterminateDrawable(this.iUA);
      aOL();
      qg(this.iUF);
      AppMethodBeat.o(87473);
      return;
      this.iUM.a(this.iUu, this.iUv);
    }
  }

  private void aOL()
  {
    AppMethodBeat.i(87475);
    if (this.iUF == -1)
    {
      this.iUB.setColor(-1);
      this.iUC.setColor(-1);
      AppMethodBeat.o(87475);
    }
    while (true)
    {
      return;
      this.iUB.setColor(-16777216);
      this.iUC.setColor(-16777216);
      AppMethodBeat.o(87475);
    }
  }

  private void aOM()
  {
    AppMethodBeat.i(87478);
    View localView = this.iUv;
    if ((this.iUJ) || (this.iUI));
    for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      requestLayout();
      AppMethodBeat.o(87478);
      return;
    }
  }

  private void qg(int paramInt)
  {
    AppMethodBeat.i(87474);
    if (paramInt == -1)
    {
      this.iUE.setImageResource(2131689682);
      this.iUD.setBackgroundResource(2130837738);
      AppMethodBeat.o(87474);
    }
    while (true)
    {
      return;
      this.iUE.setImageResource(2131689683);
      this.iUD.setBackgroundResource(2130837739);
      AppMethodBeat.o(87474);
    }
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(87457);
    this.iUN.add(parama);
    if (!this.iUO)
    {
      aOH();
      this.iUO = true;
    }
    AppMethodBeat.o(87457);
  }

  public final boolean aOI()
  {
    AppMethodBeat.i(87468);
    boolean bool;
    if (this.iUD.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(87468);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87468);
    }
  }

  public final void aOJ()
  {
    AppMethodBeat.i(87469);
    this.iUB.reset();
    this.iUC.reset();
    aOL();
    AppMethodBeat.o(87469);
  }

  public final void aON()
  {
    AppMethodBeat.i(87481);
    this.iUv.setVisibility(0);
    requestLayout();
    AppMethodBeat.o(87481);
  }

  public final void eP(boolean paramBoolean)
  {
    AppMethodBeat.i(87467);
    if (paramBoolean)
    {
      this.iUD.setVisibility(0);
      AppMethodBeat.o(87467);
    }
    while (true)
    {
      return;
      this.iUD.setVisibility(8);
      AppMethodBeat.o(87467);
    }
  }

  public View getActionView()
  {
    return this;
  }

  public double getBackgroundAlpha()
  {
    return this.iUH;
  }

  public final int getBackgroundColor()
  {
    if (this.iUJ);
    for (int i = 0; ; i = this.iUG)
      return i;
  }

  public com.tencent.mm.plugin.appbrand.page.a.b getCapsuleBar()
  {
    return this.iUL;
  }

  public View getCapsuleView()
  {
    return this.iUD;
  }

  public int getForegroundColor()
  {
    return this.iUF;
  }

  public CharSequence getMainTitle()
  {
    AppMethodBeat.i(87461);
    CharSequence localCharSequence = this.iUx.getText();
    AppMethodBeat.o(87461);
    return localCharSequence;
  }

  public final boolean isFullscreenMode()
  {
    return this.iUJ;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(87459);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(87459);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(87460);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(87460);
  }

  public void setBackButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(87454);
    this.iUK.iUT.add(paramOnClickListener);
    AppMethodBeat.o(87454);
  }

  public void setBackgroundAlpha(double paramDouble)
  {
    AppMethodBeat.i(87464);
    this.iUH = paramDouble;
    if (!this.iUJ)
      super.getBackground().setAlpha((int)(255.0D * paramDouble));
    AppMethodBeat.o(87464);
  }

  public void setBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(87465);
    this.iUG = paramInt;
    if (!this.iUJ)
      super.setBackgroundColor(paramInt);
    while (true)
    {
      setBackgroundAlpha(this.iUH);
      AppMethodBeat.o(87465);
      return;
      super.setBackgroundColor(0);
    }
  }

  public void setCapsuleHomeButtonLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(87456);
    this.iUC.setOnLongClickListener(paramOnLongClickListener);
    AppMethodBeat.o(87456);
  }

  public void setCloseButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(87455);
    this.iUK.iUS.add(paramOnClickListener);
    AppMethodBeat.o(87455);
  }

  public void setForegroundColor(int paramInt)
  {
    AppMethodBeat.i(87472);
    this.iUF = paramInt;
    aOK();
    AppMethodBeat.o(87472);
  }

  public void setForegroundStyle(String paramString)
  {
    AppMethodBeat.i(87470);
    this.iUF = d.a.Dk(paramString).ivl;
    aOK();
    AppMethodBeat.o(87470);
  }

  public void setForegroundStyle(boolean paramBoolean)
  {
    AppMethodBeat.i(87471);
    if (paramBoolean);
    for (int i = -16777216; ; i = -1)
    {
      this.iUF = i;
      aOK();
      AppMethodBeat.o(87471);
      return;
    }
  }

  public void setFullscreenMode(boolean paramBoolean)
  {
    AppMethodBeat.i(87480);
    this.iUJ = paramBoolean;
    aOM();
    View localView = this.iUw;
    if (this.iUJ);
    for (int i = 4; ; i = 0)
    {
      localView.setVisibility(i);
      requestLayout();
      setBackgroundColor(this.iUG);
      AppMethodBeat.o(87480);
      return;
    }
  }

  public void setLoadingIconVisibility(boolean paramBoolean)
  {
    AppMethodBeat.i(87479);
    Object localObject1 = this.iUz;
    int i;
    if (paramBoolean)
    {
      i = 0;
      ((ProgressBar)localObject1).setVisibility(i);
      if (!paramBoolean)
        break label306;
      localObject1 = this.iUA;
      ((CircleProgressDrawable)localObject1).uC.clear();
      ArrayList localArrayList = ((CircleProgressDrawable)localObject1).uC;
      Object localObject2 = ((CircleProgressDrawable)localObject1).iTY;
      Object localObject3 = ObjectAnimator.ofFloat(localObject2, "trimPathStart", new float[] { 0.0F, 0.75F });
      ((ObjectAnimator)localObject3).setDuration(1333L);
      ((ObjectAnimator)localObject3).setInterpolator(CircleProgressDrawable.c.iUa);
      ((ObjectAnimator)localObject3).setRepeatCount(-1);
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(localObject2, "trimPathEnd", new float[] { 0.0F, 0.75F });
      localObjectAnimator.setDuration(1333L);
      localObjectAnimator.setInterpolator(CircleProgressDrawable.b.iUa);
      localObjectAnimator.setRepeatCount(-1);
      localObject2 = ObjectAnimator.ofFloat(localObject2, "trimPathOffset", new float[] { 0.0F, 0.25F });
      ((ObjectAnimator)localObject2).setDuration(1333L);
      ((ObjectAnimator)localObject2).setInterpolator(CircleProgressDrawable.a.iUa);
      ((ObjectAnimator)localObject2).setRepeatCount(-1);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObject3, localObjectAnimator, localObject2 });
      localArrayList.add(localAnimatorSet);
      localObject3 = ((CircleProgressDrawable)localObject1).uC;
      localObject1 = ObjectAnimator.ofFloat(((CircleProgressDrawable)localObject1).iTZ, "rotation", new float[] { 0.0F, 720.0F });
      ((ObjectAnimator)localObject1).setDuration(6665L);
      ((ObjectAnimator)localObject1).setInterpolator(CircleProgressDrawable.a.iUa);
      ((ObjectAnimator)localObject1).setRepeatCount(-1);
      ((ArrayList)localObject3).add(localObject1);
      this.iUA.start();
      AppMethodBeat.o(87479);
    }
    while (true)
    {
      return;
      i = 8;
      break;
      label306: this.iUA.stop();
      AppMethodBeat.o(87479);
    }
  }

  public void setMainTitle(String paramString)
  {
    AppMethodBeat.i(87458);
    boolean bool = isLayoutRequested();
    this.iUx.setText(paramString);
    if (bool)
      requestLayout();
    AppMethodBeat.o(87458);
  }

  public void setNavBackOrClose(boolean paramBoolean)
  {
    AppMethodBeat.i(87476);
    aOK();
    AppMethodBeat.o(87476);
  }

  public void setNavHidden(boolean paramBoolean)
  {
    AppMethodBeat.i(87477);
    this.iUI = paramBoolean;
    aOM();
    AppMethodBeat.o(87477);
  }

  public void setNavResetStyleListener(b.a parama)
  {
    this.iUM = parama;
  }

  public void setOptionButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(87466);
    this.iUB.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(87466);
  }

  public void setSubTitle(String paramString)
  {
    AppMethodBeat.i(87462);
    if (bo.isNullOrNil(paramString))
      this.iUy.setVisibility(8);
    while (true)
    {
      this.iUy.clearAnimation();
      AppMethodBeat.o(87462);
      return;
      this.iUy.setVisibility(0);
      this.iUy.setText(paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.b
 * JD-Core Version:    0.6.2
 */