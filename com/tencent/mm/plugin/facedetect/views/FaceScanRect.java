package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class FaceScanRect extends RelativeLayout
{
  private ImageView mbA;
  private ImageView mbB;
  private ImageView mbC;
  private ImageView mbD;
  public ImageView[] mbE;
  private ScaleAnimation mbF;
  private ScaleAnimation mbG;
  private ScaleAnimation mbH;
  private ScaleAnimation mbI;
  public TranslateAnimation mbJ;
  private FaceScanRect.b mbK;
  private ViewGroup mbL;
  public View mbM;
  public FaceScanRect.a mbN;
  public View mbv;
  private ImageView mbw;
  private ImageView mbx;
  private ImageView mby;
  private ImageView mbz;

  public FaceScanRect(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceScanRect(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(665);
    this.mbv = null;
    this.mbw = null;
    this.mbx = null;
    this.mby = null;
    this.mbz = null;
    this.mbA = null;
    this.mbB = null;
    this.mbC = null;
    this.mbD = null;
    this.mbE = null;
    this.mbF = null;
    this.mbG = null;
    this.mbH = null;
    this.mbI = null;
    this.mbJ = null;
    this.mbK = null;
    this.mbL = null;
    this.mbM = null;
    LayoutInflater.from(paramContext).inflate(2130969477, this, true);
    this.mbv = findViewById(2131823816);
    this.mbw = ((ImageView)findViewById(2131823818));
    this.mbx = ((ImageView)findViewById(2131823819));
    this.mby = ((ImageView)findViewById(2131823822));
    this.mbz = ((ImageView)findViewById(2131823823));
    this.mbA = ((ImageView)findViewById(2131823824));
    this.mbB = ((ImageView)findViewById(2131823825));
    this.mbC = ((ImageView)findViewById(2131823820));
    this.mbD = ((ImageView)findViewById(2131823821));
    this.mbM = findViewById(2131823817);
    this.mbL = ((ViewGroup)findViewById(2131823826));
    this.mbE = new ImageView[] { this.mbw, this.mbx, this.mby, this.mbz, this.mbA, this.mbB, this.mbC, this.mbD };
    this.mbN = FaceScanRect.a.mbQ;
    this.mbJ = new TranslateAnimation(2, 0.0F, 2, 1.0F, 2, 0.0F, 2, 0.0F);
    this.mbJ.setRepeatCount(-1);
    this.mbJ.setRepeatMode(1);
    this.mbJ.setDuration(1000L);
    AppMethodBeat.o(665);
  }

  private void btN()
  {
    AppMethodBeat.i(666);
    this.mbM.setVisibility(8);
    this.mbv.setBackground(null);
    this.mbM.clearAnimation();
    AppMethodBeat.o(666);
  }

  private void c(Animation.AnimationListener paramAnimationListener)
  {
    AppMethodBeat.i(668);
    int i = getWidth();
    int j = getHeight();
    int k = getResources().getDimensionPixelSize(2131428397);
    int m = getResources().getDimensionPixelSize(2131428398);
    float f1 = (i - k * 2 - m * 2 + m) / m;
    float f2 = (j - k * 2 - m * 2 + m) / m;
    ab.i("MicroMsg.FaceScanRect", "hy: horizontalScale : %f, verticalScale : %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
    this.mbF = new ScaleAnimation(1.0F, f1, 1.0F, 1.0F, 1, 0.0F, 1, 0.0F);
    this.mbF.setFillAfter(true);
    this.mbF.setDuration(1500L);
    this.mbF.setInterpolator(getContext(), 17563654);
    this.mbF.setAnimationListener(paramAnimationListener);
    this.mbG = new ScaleAnimation(1.0F, f1, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.mbG.setFillAfter(true);
    this.mbG.setDuration(1500L);
    this.mbG.setInterpolator(getContext(), 17563654);
    this.mbH = new ScaleAnimation(1.0F, 1.0F, 1.0F, f2, 1, 0.0F, 1, 0.0F);
    this.mbH.setFillAfter(true);
    this.mbH.setDuration(1500L);
    this.mbH.setInterpolator(getContext(), 17563654);
    this.mbI = new ScaleAnimation(1.0F, 1.0F, 1.0F, f2, 1, 0.0F, 1, 1.0F);
    this.mbI.setFillAfter(true);
    this.mbI.setDuration(1500L);
    this.mbI.setInterpolator(getContext(), 17563654);
    AppMethodBeat.o(668);
  }

  public final void b(Animation.AnimationListener paramAnimationListener)
  {
    AppMethodBeat.i(667);
    if (this.mbN == FaceScanRect.a.mbP)
    {
      ab.w("MicroMsg.FaceScanRect", "hy: already closed");
      if (paramAnimationListener != null)
        paramAnimationListener.onAnimationEnd(null);
      AppMethodBeat.o(667);
    }
    while (true)
    {
      return;
      this.mbN = FaceScanRect.a.mbP;
      c(paramAnimationListener);
      this.mbw.startAnimation(this.mbF);
      this.mbz.startAnimation(this.mbI);
      this.mbA.startAnimation(this.mbH);
      this.mbD.startAnimation(this.mbG);
      btN();
      paramAnimationListener = this.mbE;
      int i = paramAnimationListener.length;
      for (int j = 0; j < i; j++)
        paramAnimationListener[j].setBackgroundColor(getResources().getColor(2131690039));
      AppMethodBeat.o(667);
    }
  }

  public ViewGroup getCenterHintHolder()
  {
    return this.mbL;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(669);
    super.onMeasure(paramInt1, paramInt2);
    if (this.mbK != null)
      this.mbK.btt();
    AppMethodBeat.o(669);
  }

  public void setOnRefreshRectListener(FaceScanRect.b paramb)
  {
    this.mbK = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceScanRect
 * JD-Core Version:    0.6.2
 */