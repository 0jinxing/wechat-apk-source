package com.tencent.mm.br;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.api.r;
import com.tencent.mm.e.c;
import com.tencent.mm.e.c.5;
import com.tencent.mm.e.c.7;
import com.tencent.mm.e.c.8;
import com.tencent.mm.e.c.9;
import com.tencent.mm.e.d;
import com.tencent.mm.e.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.d.a;
import java.util.HashMap;

final class a$1
  implements r
{
  a$1(a parama)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(116303);
    ab.i("MicroMsg.DrawingPresenter", "[onSelectedFeature] features:%s", new Object[] { parame });
    if (this.vwV.vwM.getSelectedFeatureListener() != null)
      this.vwV.vwM.getSelectedFeatureListener().a(parame);
    if (parame == e.ccM)
      this.vwV.vwM.getFooterBg().setVisibility(8);
    com.tencent.mm.e.b localb = (com.tencent.mm.e.b)this.vwV.vwN.get(parame);
    if (localb == null)
      AppMethodBeat.o(116303);
    while (true)
    {
      return;
      if ((localb.bZq) && (!localb.isAlive()))
        localb.zC();
      if (localb.CG() != com.tencent.mm.e.a.ciV)
        localb.setOneFingerMoveEnable(false);
      localb.CJ();
      this.vwV.vwU = localb;
      switch (a.7.vwX[parame.ordinal()])
      {
      default:
      case 1:
      case 2:
        while (true)
        {
          this.vwV.vwT = parame;
          AppMethodBeat.o(116303);
          break;
          ((EditText)this.vwV.vwM.getTextEditView().findViewById(2131823386)).setTextColor(com.tencent.mm.view.footer.a.AcD[0]);
          this.vwV.oW(true);
          this.vwV.vwM.setFooterVisible(false);
          continue;
          this.vwV.vwM.setActionBarVisible(false);
          this.vwV.vwM.setFooterVisible(false);
          this.vwV.vwM.rj(false);
        }
      case 3:
      }
      this.vwV.vwS = this.vwV.vwT;
      AppMethodBeat.o(116303);
    }
  }

  public final void a(e parame, int paramInt)
  {
    AppMethodBeat.i(116304);
    ab.i("MicroMsg.DrawingPresenter", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { parame, Integer.valueOf(paramInt) });
    if (this.vwV.vwM.getSelectedFeatureListener() != null)
      this.vwV.vwM.getSelectedFeatureListener().a(parame, paramInt);
    this.vwV.vwU = ((com.tencent.mm.e.b)this.vwV.vwN.get(parame));
    if (this.vwV.dlU().CG() == com.tencent.mm.e.a.ciV)
    {
      AppMethodBeat.o(116304);
      return;
    }
    if (this.vwV.vwM.getFooterBg().getVisibility() == 8)
      this.vwV.vwM.getFooterBg().setVisibility(0);
    switch (a.7.vwX[parame.ordinal()])
    {
    default:
    case 4:
    case 5:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(116304);
      break;
      parame = (d)this.vwV.dlU();
      if (paramInt != -1)
      {
        this.vwV.vwM.getBaseFooterView();
        parame.mColor = com.tencent.mm.view.footer.a.getColor(paramInt);
        AppMethodBeat.o(116304);
        break;
      }
      parame.CO();
      AppMethodBeat.o(116304);
      break;
      parame = (f)this.vwV.dlU();
      if (paramInt == 0)
      {
        parame.ckt = d.a.eHy;
        AppMethodBeat.o(116304);
        break;
      }
      if (1 == paramInt)
      {
        parame.ckt = d.a.eHz;
        AppMethodBeat.o(116304);
        break;
      }
      parame.CO();
      AppMethodBeat.o(116304);
      break;
      parame = (c)this.vwV.dlU();
      Object localObject;
      float f1;
      if (paramInt == 0)
      {
        parame.cjO += 1;
        parame.cjy.cancel();
        if (parame.cjM != null)
          parame.cjM.cancel();
        Matrix localMatrix = new Matrix();
        localMatrix.postRotate(-90.0F, parame.cch.centerX(), parame.cch.centerY());
        if (parame.cjN.isEmpty())
          parame.cjN.set(parame.cch);
        localObject = new RectF(parame.cjN);
        localMatrix.mapRect((RectF)localObject);
        f1 = 1.0F * parame.cju.width() / ((RectF)localObject).width();
        float f2 = 1.0F * parame.cju.height() / ((RectF)localObject).height();
        if (f1 < f2);
        while (true)
        {
          localMatrix.postScale(f1, f1, parame.cch.centerX(), parame.cch.centerY());
          ((RectF)localObject).set(parame.cjN);
          localMatrix.mapRect((RectF)localObject);
          parame.cjN.set((int)((RectF)localObject).left, (int)((RectF)localObject).top, (int)((RectF)localObject).right, (int)((RectF)localObject).bottom);
          float f3 = parame.cch.centerX();
          f2 = parame.cch.centerY();
          localObject = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("rotation", new int[] { 0, -90 }), PropertyValuesHolder.ofInt("deltaX", new int[] { 0, parame.cju.centerX() - (int)f3 }), PropertyValuesHolder.ofInt("deltaY", new int[] { 0, parame.cju.centerY() - (int)f2 }) });
          ((ValueAnimator)localObject).addUpdateListener(new c.8(parame, f3, f2, f1));
          ((ValueAnimator)localObject).addListener(new c.9(parame));
          ((ValueAnimator)localObject).setDuration(200L);
          ((ValueAnimator)localObject).start();
          AppMethodBeat.o(116304);
          break;
          f1 = f2;
        }
      }
      if (1 == paramInt)
      {
        ab.i("MicroMsg.CropArtist", "[cancel]");
        parame.cjy.cancel();
        if (parame.cjM != null)
          parame.cjM.cancel();
        parame.cjc.dlT().getBaseBoardView().AbT = parame.cjc.dlT().getBaseBoardView().getRawBoardRect();
        localObject = ((com.tencent.mm.cache.a)parame.CI()).Jf();
        f1 = 0.0F;
        if (localObject != null)
          f1 = parame.getRotation() - parame.b(((com.tencent.mm.y.a)localObject).mMatrix);
        if ((localObject != null) && (!((com.tencent.mm.y.a)localObject).eHd.isEmpty()))
          parame.cjc.dlT().getBaseBoardView().o(((com.tencent.mm.y.a)localObject).eHd);
        parame.cjc.dlT().getBaseBoardView().a(null, f1, true);
        parame.cjc.dlT().getActionBar().setVisibility(0);
        this.vwV.vwU = ((com.tencent.mm.e.b)this.vwV.vwN.get(this.vwV.vwS));
        this.vwV.vwM.getBaseFooterView().setCurFeatureType(this.vwV.vwS);
        AppMethodBeat.o(116304);
        break;
      }
      if (2 == paramInt)
      {
        ab.i("MicroMsg.CropArtist", "[doCrop]");
        if (parame.cjM != null)
          parame.cjM.cancel();
        if (!parame.cjy.cco)
        {
          if (!parame.cjy.aFV)
          {
            parame.cjy.cancel();
            parame.cjy.play();
          }
          parame.cjy.uw = new c.5(parame);
        }
        while (true)
        {
          this.vwV.vwU = ((com.tencent.mm.e.b)this.vwV.vwN.get(this.vwV.vwS));
          this.vwV.vwM.getBaseFooterView().setCurFeatureType(this.vwV.vwS);
          AppMethodBeat.o(116304);
          break;
          parame.cjy.uw = null;
          parame.CU();
        }
      }
      if (3 == paramInt)
      {
        ab.i("MicroMsg.CropArtist", "[reset]");
        parame.cjP = true;
        parame.cjy.cancel();
        if (parame.cjM != null)
          parame.cjM.cancel();
        parame.cjN.setEmpty();
        parame.CT();
        parame.cjE = false;
        parame.cjc.dlT().getBaseBoardView().AbT = parame.cch;
        parame.cjc.dlT().getBaseBoardView().a(new c.7(parame), parame.getRotation(), true);
      }
    }
  }

  public final void bd(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.a.1
 * JD-Core Version:    0.6.2
 */