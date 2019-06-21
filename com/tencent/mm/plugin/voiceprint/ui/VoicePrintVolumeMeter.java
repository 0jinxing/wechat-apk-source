package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;

public class VoicePrintVolumeMeter extends View
{
  static int nOt;
  private static float sMG;
  private static float sMH;
  private static float sMI;
  private static float sMJ;
  private static int sMx;
  private static int sMy;
  private static int sMz;
  private Context mContext;
  boolean mIsPlaying;
  private Paint mPaint;
  private float mVolume;
  private View nOh;
  private float sMA;
  private float sMB;
  private float sMC;
  private float sMD;
  private float sME;
  private float sMF;
  private boolean sMK;
  private int sMt;
  private int sMu;
  al sMv;
  ap sMw;

  static
  {
    AppMethodBeat.i(26218);
    sMx = Color.rgb(240, 250, 235);
    sMy = Color.rgb(210, 240, 200);
    sMz = 100;
    nOt = 20;
    sMG = 1.5F;
    sMH = 2.0F;
    sMI = 0.1F;
    sMJ = 0.05F;
    AppMethodBeat.o(26218);
  }

  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(26210);
    this.sMt = -1;
    this.sMu = -1;
    this.sMv = null;
    this.sMw = null;
    this.sMA = 0.0F;
    this.sMB = 0.0F;
    this.sMC = 0.0F;
    this.sMD = 0.0F;
    this.sME = 0.0F;
    this.sMF = 0.0F;
    this.mVolume = -1.0F;
    this.sMK = true;
    this.mIsPlaying = false;
    init(paramContext);
    AppMethodBeat.o(26210);
  }

  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(26211);
    this.sMt = -1;
    this.sMu = -1;
    this.sMv = null;
    this.sMw = null;
    this.sMA = 0.0F;
    this.sMB = 0.0F;
    this.sMC = 0.0F;
    this.sMD = 0.0F;
    this.sME = 0.0F;
    this.sMF = 0.0F;
    this.mVolume = -1.0F;
    this.sMK = true;
    this.mIsPlaying = false;
    init(paramContext);
    AppMethodBeat.o(26211);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(26212);
    this.mContext = paramContext;
    this.mPaint = new Paint();
    this.sMv = new al("VoicePrintVolumeMeter");
    this.sMw = new ap(this.sMv.oAl.getLooper(), new VoicePrintVolumeMeter.1(this), true);
    AppMethodBeat.o(26212);
  }

  final void cIc()
  {
    AppMethodBeat.i(26213);
    if ((this.nOh == null) || (this.nOh.getVisibility() == 8))
      AppMethodBeat.o(26213);
    while (true)
    {
      return;
      int[] arrayOfInt = new int[2];
      this.nOh.getLocationOnScreen(arrayOfInt);
      if ((arrayOfInt[0] == 0) || (arrayOfInt[1] == 0))
      {
        ab.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView location");
        AppMethodBeat.o(26213);
      }
      else
      {
        int i = this.nOh.getWidth();
        int j = this.nOh.getHeight();
        if ((j == 0) || (i == 0))
        {
          ab.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView size");
          AppMethodBeat.o(26213);
        }
        else
        {
          this.sMt = (arrayOfInt[0] + i / 2);
          this.sMu = (arrayOfInt[1] + j / 2 - a.fromDPToPix(this.mContext, 25));
          ab.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, mCenterX:%d, mCenterY:%d", new Object[] { Integer.valueOf(this.sMt), Integer.valueOf(this.sMu) });
          this.sMA = (i / 2.0F);
          this.sMB = (this.sMA * sMG);
          this.sMC = (this.sMA * sMH);
          this.sMD = (this.sMB * sMH);
          this.sMF = this.sMB;
          this.sME = this.sMA;
          AppMethodBeat.o(26213);
        }
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(26214);
    super.onDraw(paramCanvas);
    if (!this.mIsPlaying)
      AppMethodBeat.o(26214);
    while (true)
    {
      return;
      if ((this.sMt == -1) || (this.sMu == -1))
        cIc();
      this.mPaint.setAlpha(sMz);
      if (this.sMF > this.sMD)
        this.sMF = this.sMD;
      if (this.sMF < this.sMB)
        this.sMF = this.sMB;
      this.mPaint.setColor(sMx);
      paramCanvas.drawCircle(this.sMt, this.sMu, this.sMF, this.mPaint);
      if (this.sME > this.sMC)
        this.sME = this.sMC;
      if (this.sME < this.sMA)
        this.sME = this.sMA;
      this.mPaint.setColor(sMy);
      paramCanvas.drawCircle(this.sMt, this.sMu, this.sME, this.mPaint);
      AppMethodBeat.o(26214);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(26216);
    this.sMK = false;
    this.mVolume = -1.0F;
    this.mIsPlaying = false;
    this.sME = 0.0F;
    this.sMF = 0.0F;
    postInvalidate();
    AppMethodBeat.o(26216);
  }

  public void setArchView(View paramView)
  {
    this.nOh = paramView;
  }

  public void setVolume(float paramFloat)
  {
    if (paramFloat > this.mVolume);
    for (this.sMK = true; ; this.sMK = false)
    {
      this.mVolume = paramFloat;
      return;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(26215);
    reset();
    this.mIsPlaying = false;
    this.sMw.stopTimer();
    postInvalidate();
    AppMethodBeat.o(26215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter
 * JD-Core Version:    0.6.2
 */