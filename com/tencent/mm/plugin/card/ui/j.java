package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

public final class j
{
  public Bitmap gKF;
  public o gKG;
  ImageView gKH;
  View gKI;
  View.OnClickListener gKK;
  b kaS;
  public Bitmap kgb;
  float kgj;
  boolean kjx;
  MMActivity knn;
  Bitmap kno;
  TextView knp;
  TextView knq;
  View knr;
  ImageView kns;
  MMVerticalTextView knt;
  MMVerticalTextView knu;
  ArrayList<Bitmap> knv;
  String knw;

  public j(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(88623);
    this.kjx = true;
    this.kno = null;
    this.gKG = null;
    this.kgj = 0.0F;
    this.knv = new ArrayList();
    this.knw = "";
    this.gKK = new j.1(this);
    this.knn = paramMMActivity;
    AppMethodBeat.o(88623);
  }

  private void az(float paramFloat)
  {
    AppMethodBeat.i(88624);
    WindowManager.LayoutParams localLayoutParams = this.knn.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.knn.getWindow().setAttributes(localLayoutParams);
    AppMethodBeat.o(88624);
  }

  public final void bdp()
  {
    AppMethodBeat.i(88625);
    if (this.kgj < 0.8F)
      az(0.8F);
    AppMethodBeat.o(88625);
  }

  public final void bdq()
  {
    AppMethodBeat.i(88626);
    az(this.kgj);
    AppMethodBeat.o(88626);
  }

  public final void bdr()
  {
    AppMethodBeat.i(88627);
    if ((this.gKG != null) && (this.gKG.isShowing()))
      this.gKH.setImageBitmap(this.gKF);
    AppMethodBeat.o(88627);
  }

  final void bds()
  {
    AppMethodBeat.i(88628);
    if (this.knv.size() > 2)
      for (int i = this.knv.size() - 1; i > 1; i--)
        l.K((Bitmap)this.knv.remove(i));
    AppMethodBeat.o(88628);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.j
 * JD-Core Version:    0.6.2
 */