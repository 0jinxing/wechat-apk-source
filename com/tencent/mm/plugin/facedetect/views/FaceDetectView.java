package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.d.b;
import com.tencent.mm.plugin.facedetect.d.b.b;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.c.a.c;

public class FaceDetectView extends RelativeLayout
{
  public static long maQ = 100L;
  public static int maR = 1;
  public volatile boolean eTf;
  public boolean isPaused;
  public long lTW;
  private TextView lXH;
  public String lXd;
  public FaceDetectCameraView maA;
  public FaceDetectDecorView maB;
  public ViewGroup maC;
  public ViewGroup maD;
  private a maE;
  public b maF;
  public boolean maG;
  public boolean maH;
  public String maI;
  public boolean maJ;
  public boolean maK;
  public long maL;
  private long maM;
  private final int maN;
  private Animation maO;
  private View maP;

  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }

  private FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(625);
    this.maA = null;
    this.maB = null;
    this.lXH = null;
    this.maC = null;
    this.maD = null;
    this.maE = null;
    this.maG = false;
    this.eTf = false;
    this.isPaused = false;
    this.maH = false;
    this.maI = ah.getContext().getString(2131303872);
    this.maJ = true;
    this.maK = false;
    this.lTW = -1L;
    this.maL = -1L;
    this.maM = -1L;
    this.maN = 1500;
    this.maP = null;
    paramContext = LayoutInflater.from(paramContext).inflate(2130970840, null, false);
    addView(paramContext);
    this.maA = ((FaceDetectCameraView)paramContext.findViewById(2131827969));
    this.maB = ((FaceDetectDecorView)paramContext.findViewById(2131827971));
    this.maP = paramContext.findViewById(2131827970);
    this.maA.lZO = new FaceDetectView.1(this);
    paramContext = getContext();
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
      paramContext = null;
    }
    while (true)
    {
      this.maO = paramContext;
      AppMethodBeat.o(625);
      return;
      paramContext = AnimationUtils.loadAnimation(paramContext, 2131034132);
      paramContext.setInterpolator(new c());
    }
  }

  private void Lv(String paramString)
  {
    AppMethodBeat.i(628);
    if (bo.nullAsNil(paramString).equals(this.lXH.getText().toString()))
    {
      ab.v("MicroMsg.FaceDetectView", "hy: same error. ignore");
      AppMethodBeat.o(628);
    }
    while (true)
    {
      return;
      this.lXH.setText(paramString);
      this.lXH.setVisibility(0);
      this.lXH.setAnimation(this.maO);
      AppMethodBeat.o(628);
    }
  }

  private void btI()
  {
    AppMethodBeat.i(627);
    this.lXH.setText("");
    this.lXH.setVisibility(4);
    AppMethodBeat.o(627);
  }

  public int getCameraBestHeight()
  {
    AppMethodBeat.i(633);
    int i = this.maA.getEncodeVideoBestSize().y;
    AppMethodBeat.o(633);
    return i;
  }

  public int getCameraBestWidth()
  {
    AppMethodBeat.i(632);
    int i = this.maA.getEncodeVideoBestSize().x;
    AppMethodBeat.o(632);
    return i;
  }

  public int getCameraPreivewWidth()
  {
    AppMethodBeat.i(630);
    int i = this.maA.mae.getPreviewWidth();
    AppMethodBeat.o(630);
    return i;
  }

  public int getCameraPreviewHeight()
  {
    AppMethodBeat.i(631);
    int i = this.maA.mae.getPreviewHeight();
    AppMethodBeat.o(631);
    return i;
  }

  public int getCameraRotation()
  {
    AppMethodBeat.i(629);
    int i = this.maA.mae.getRotation();
    AppMethodBeat.o(629);
    return i;
  }

  public b.b getCurrentMotionCancelInfo()
  {
    AppMethodBeat.i(634);
    b.b localb;
    if (this.maF != null)
    {
      localb = this.maF.bsY();
      AppMethodBeat.o(634);
    }
    while (true)
    {
      return localb;
      localb = new b.b(90004, "user cancelled in processing");
      AppMethodBeat.o(634);
    }
  }

  public Bitmap getPreviewBm()
  {
    AppMethodBeat.i(636);
    Bitmap localBitmap = this.maA.getBitmap();
    AppMethodBeat.o(636);
    return localBitmap;
  }

  public final void hc(boolean paramBoolean)
  {
    AppMethodBeat.i(635);
    if (this.maF != null)
      this.maF.bsX();
    if (!this.eTf)
    {
      this.eTf = true;
      if (paramBoolean)
        if (this.maA != null)
          f.V(new FaceDetectView.5(this));
    }
    label112: 
    while (true)
    {
      ab.i("MicroMsg.FaceDetectView", "hy: stopped capture face");
      this.maH = false;
      btI();
      AppMethodBeat.o(635);
      while (true)
      {
        return;
        if (this.maA == null)
          break label112;
        this.maA.btC();
        break;
        ab.w("MicroMsg.FaceDetectView", "hy: already end");
        AppMethodBeat.o(635);
      }
    }
  }

  public final void m(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(626);
    if (paramBoolean)
    {
      d.post(new FaceDetectView.2(this, paramString), "face_detect_set_backgroud");
      AppMethodBeat.o(626);
    }
    while (true)
    {
      return;
      paramString = new AlphaAnimation(1.0F, 0.0F);
      paramString.setInterpolator(new LinearInterpolator());
      paramString.setDuration(500L);
      paramString.setFillAfter(true);
      this.maP.startAnimation(paramString);
      AppMethodBeat.o(626);
    }
  }

  public void setBusinessTip(String paramString)
  {
    this.lXd = paramString;
  }

  public void setCallback(a parama)
  {
    this.maE = parama;
  }

  public void setErrTextView(TextView paramTextView)
  {
    this.lXH = paramTextView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectView
 * JD-Core Version:    0.6.2
 */