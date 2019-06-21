package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.f;
import java.util.Timer;

final class CropImageView$3
  implements View.OnTouchListener
{
  CropImageView$3(CropImageView paramCropImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(107603);
    if (!CropImageView.u(this.zBE))
      AppMethodBeat.o(107603);
    int i;
    while (true)
    {
      return bool;
      if (CropImageView.i(this.zBE) == null)
      {
        AppMethodBeat.o(107603);
      }
      else
      {
        i = paramMotionEvent.getAction() & 0xFF;
        ab.d("MicroMsg.CropImageView", "on touch : event type=" + i + ", isDownOnImg=" + CropImageView.v(this.zBE));
        if ((CropImageView.v(this.zBE)) || (i == 0))
          break;
        AppMethodBeat.o(107603);
      }
    }
    switch (i)
    {
    case 3:
    case 4:
    default:
    case 5:
    case 6:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(107603);
      break;
      ab.d("MicroMsg.CropImageView", "action_mult_down");
      CropImageView.b(this.zBE, true);
      this.zBE.riF = f.N(paramMotionEvent);
      if (this.zBE.riF > 5.0F)
      {
        this.zBE.zBn = true;
        f.a(CropImageView.h(this.zBE), paramMotionEvent);
        AppMethodBeat.o(107603);
        bool = true;
        break;
        ab.d("MicroMsg.CropImageView", "action_mult_up");
        this.zBE.zBn = false;
        CropImageView.b(this.zBE, true);
        AppMethodBeat.o(107603);
        bool = true;
        break;
        ab.d("MicroMsg.CropImageView", "action_down");
        CropImageView.a(this.zBE, paramMotionEvent.getRawX());
        CropImageView.b(this.zBE, paramMotionEvent.getRawY());
        ab.d("MicroMsg.CropImageView", "lastX=" + CropImageView.w(this.zBE) + ",lastY=" + CropImageView.x(this.zBE));
        CropImageView.c(this.zBE, CropImageView.w(this.zBE));
        CropImageView.d(this.zBE, CropImageView.x(this.zBE));
        paramMotionEvent = this.zBE.getImageMatrix();
        paramView = new RectF();
        paramView.set(0.0F, 0.0F, CropImageView.i(this.zBE).getWidth(), CropImageView.i(this.zBE).getHeight());
        paramMotionEvent.mapRect(paramView);
        CropImageView.a(this.zBE, paramView.contains(CropImageView.w(this.zBE), CropImageView.x(this.zBE)));
        CropImageView.a(this.zBE, System.currentTimeMillis());
        continue;
        ab.d("MicroMsg.CropImageView", "action_move");
        float f1;
        if (this.zBE.zBn)
        {
          ab.d("MicroMsg.CropImageView", "is valid mult down");
          this.zBE.riG = f.N(paramMotionEvent);
          f1 = this.zBE.riG - this.zBE.riF;
          if ((this.zBE.riG > 5.0F) && (Math.abs(f1) > 5.0F))
          {
            f.a(CropImageView.h(this.zBE), paramMotionEvent);
            ab.d("MicroMsg.CropImageView", "mX=" + CropImageView.h(this.zBE).x + ",mY=" + CropImageView.h(this.zBE).y);
            if (f1 <= 0.0F)
              break label748;
            ab.d("MicroMsg.CropImageView", "zoom in");
            this.zBE.zoomIn();
          }
        }
        while (true)
        {
          this.zBE.riF = this.zBE.riG;
          if (!CropImageView.y(this.zBE))
          {
            f1 = paramMotionEvent.getRawX() - CropImageView.w(this.zBE);
            float f2 = paramMotionEvent.getRawY() - CropImageView.x(this.zBE);
            if ((Math.abs(f1) > 5.0F) || (Math.abs(f2) > 5.0F))
              this.zBE.getImageMatrix().postTranslate(f1, f2);
            this.zBE.invalidate();
          }
          CropImageView.b(this.zBE, false);
          CropImageView.a(this.zBE, paramMotionEvent.getRawX());
          CropImageView.b(this.zBE, paramMotionEvent.getRawY());
          break;
          label748: ab.d("MicroMsg.CropImageView", "zoom out");
          this.zBE.zoomOut();
        }
        ab.d("MicroMsg.CropImageView", "action_up");
        if (CropImageView.z(this.zBE))
        {
          CropImageView.c(this.zBE, false);
          if (CropImageView.A(this.zBE))
          {
            CropImageView.d(this.zBE, false);
            this.zBE.zoomOut();
            this.zBE.zoomOut();
            this.zBE.zoomOut();
            this.zBE.zoomOut();
            this.zBE.zoomOut();
          }
          else
          {
            CropImageView.d(this.zBE, true);
            this.zBE.zoomIn();
            this.zBE.zoomIn();
            this.zBE.zoomIn();
            this.zBE.zoomIn();
            this.zBE.zoomIn();
          }
        }
        else
        {
          CropImageView.c(this.zBE, true);
          if (CropImageView.B(this.zBE) != null)
            CropImageView.B(this.zBE).cancel();
          CropImageView.a(this.zBE, new Timer());
          paramView = new CropImageView.3.1(this, paramMotionEvent);
          CropImageView.B(this.zBE).schedule(paramView, 200L);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView.3
 * JD-Core Version:    0.6.2
 */