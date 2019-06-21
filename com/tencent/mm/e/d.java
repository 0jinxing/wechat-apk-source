package com.tencent.mm.e;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends b
{
  private float ati;
  private float atj;
  private boolean cjF;
  private float cjG;
  private float cjH;
  private float ckc;
  private boolean ckd;
  public int mColor;
  private Path vr;

  public d()
  {
    AppMethodBeat.i(116178);
    this.ckd = true;
    this.cjF = false;
    this.mColor = com.tencent.mm.view.footer.a.AcD[2];
    this.vr = new Path();
    AppMethodBeat.o(116178);
  }

  public final a CG()
  {
    return a.ciW;
  }

  public final void CH()
  {
    AppMethodBeat.i(116182);
    bk(true);
    AppMethodBeat.o(116182);
  }

  public final boolean o(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(116180);
    if (!CN())
    {
      AppMethodBeat.o(116180);
      return bool;
    }
    float[] arrayOfFloat = A(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
    case 0:
    case 1:
    case 5:
    case 2:
    }
    while (true)
    {
      bool = this.ckd;
      AppMethodBeat.o(116180);
      break;
      if (this.cje.contains((int)arrayOfFloat[0], (int)arrayOfFloat[1]))
      {
        float f = arrayOfFloat[0];
        this.cjG = f;
        this.ati = f;
        f = arrayOfFloat[1];
        this.cjH = f;
        this.atj = f;
      }
      for (this.ckd = true; ; this.ckd = false)
      {
        this.cjF = false;
        break;
      }
      if ((this.ckd) && (this.cjF))
      {
        CI().add(new com.tencent.mm.y.b(new Path(this.vr), this.ckc / this.cjc.getInitScale() / this.cjc.getCurScale(), this.mColor));
        bk(false);
      }
      CQ();
      this.vr.reset();
      this.cjF = false;
      this.ckd = false;
      continue;
      if ((this.ckd) && (this.cjF))
      {
        this.cjG = this.ati;
        this.cjH = this.atj;
        this.ati = arrayOfFloat[0];
        this.atj = arrayOfFloat[1];
        this.vr.quadTo(this.cjG, this.cjH, (this.ati + this.cjG) / 2.0F, (this.atj + this.cjH) / 2.0F);
        CP();
      }
      else if ((this.ckd) && (!this.cjF))
      {
        this.vr.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
        this.cjF = true;
      }
    }
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116181);
    paramCanvas.save();
    paramCanvas.clipRect(this.cje);
    a(paramCanvas);
    if (!this.vr.isEmpty())
      new com.tencent.mm.y.b(this.vr, this.ckc / this.cjc.getInitScale() / this.cjc.getCurScale(), this.mColor).draw(paramCanvas);
    paramCanvas.restore();
    AppMethodBeat.o(116181);
  }

  public final void zC()
  {
    AppMethodBeat.i(116179);
    super.zC();
    this.ckc = this.cjc.getInitScale();
    AppMethodBeat.o(116179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.d
 * JD-Core Version:    0.6.2
 */