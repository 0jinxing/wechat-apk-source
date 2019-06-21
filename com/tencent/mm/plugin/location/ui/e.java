package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends ImageView
{
  private static int nLT;
  private final String TAG;
  private double bDK;
  public b.a ecy;
  private boolean isRunning;
  private Activity mActivity;
  private b.a nLK;
  private Bitmap nLL;
  private boolean nLM;
  private double nLN;
  private double nLO;
  public com.tencent.mm.modelgeo.d nLP;
  private com.tencent.mm.plugin.k.d nLQ;
  private boolean nLR;
  private final int nLS;
  private boolean nLU;

  public e(Activity paramActivity, com.tencent.mm.plugin.k.d paramd)
  {
    super(paramActivity);
    AppMethodBeat.i(113457);
    this.TAG = "MicroMsg.MyPoiPoint";
    this.nLR = false;
    this.nLS = 689208551;
    this.nLU = false;
    this.ecy = new e.1(this);
    this.nLQ = paramd;
    this.nLK = null;
    this.mActivity = paramActivity;
    this.nLL = com.tencent.mm.sdk.platformtools.d.LV(2130839844);
    this.isRunning = false;
    this.nLM = false;
    this.nLP = com.tencent.mm.modelgeo.d.agz();
    nLT = BackwardSupportUtil.b.b(paramActivity, 80.0F);
    setImageResource(2130839844);
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    ab.d("MicroMsg.MyPoiPoint", "enableLocation");
    this.isRunning = true;
    this.nLP.a(this.ecy);
    AppMethodBeat.o(113457);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(113458);
    super.onDraw(paramCanvas);
    ab.d("MicroMsg.MyPoiPoint", "onDraw");
    AppMethodBeat.o(113458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.e
 * JD-Core Version:    0.6.2
 */