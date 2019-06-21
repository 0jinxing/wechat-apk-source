package com.tencent.mm.e;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.view.b.a.b;
import java.util.Stack;

public final class c extends b<com.tencent.mm.cache.a>
{
  public Rect cch;
  boolean cjA;
  boolean cjB;
  boolean cjC;
  boolean cjD;
  public boolean cjE;
  boolean cjF;
  float cjG;
  float cjH;
  float cjI;
  float cjJ;
  float cjK;
  float cjL;
  public ValueAnimator cjM;
  public Rect cjN;
  public int cjO;
  public boolean cjP;
  private int cjm;
  private int cjn;
  private int cjo;
  private Matrix cjp;
  private RectF cjq;
  private RectF cjr;
  private RectF cjs;
  private RectF cjt;
  public final Rect cju;
  private com.tencent.mm.y.a cjv;
  private boolean cjw;
  private boolean cjx;
  public com.tencent.mm.b.a cjy;
  boolean cjz;

  public c()
  {
    AppMethodBeat.i(116166);
    this.cjm = ((int)ah.getResources().getDimension(2131428144));
    this.cjn = ((int)ah.getResources().getDimension(2131428406));
    this.cjo = ((int)ah.getResources().getDimension(2131428261));
    this.cjp = new Matrix();
    this.cju = new Rect();
    this.cjw = false;
    this.cjx = false;
    this.cjz = false;
    this.cjA = false;
    this.cjB = false;
    this.cjC = false;
    this.cjD = false;
    this.cjE = true;
    this.cjF = false;
    this.cjN = new Rect();
    this.cjO = 0;
    this.cjP = false;
    AppMethodBeat.o(116166);
  }

  private boolean CR()
  {
    if ((this.cjC) || (this.cjA) || (this.cjB) || (this.cjD));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final a CG()
  {
    return a.ciZ;
  }

  public final void CH()
  {
  }

  public final void CJ()
  {
    AppMethodBeat.i(116169);
    super.CJ();
    this.cjc.dlT().getActionBar().setVisibility(8);
    this.cjN.setEmpty();
    com.tencent.mm.y.a locala;
    if (((com.tencent.mm.cache.a)CI()).ac(true) <= 0)
    {
      locala = new com.tencent.mm.y.a();
      locala.mMatrix.set(getMainMatrix());
      ((com.tencent.mm.cache.a)CI()).a(locala);
      CT();
      this.cjc.dlT().getBaseBoardView().AbT = this.cch;
      this.cjc.dlT().getBaseBoardView().a(new a.b()
      {
        public final void CV()
        {
          AppMethodBeat.i(116149);
          if (((com.tencent.mm.cache.a)c.this.CI()).efr.isIdentity())
          {
            localObject = (com.tencent.mm.cache.a)c.this.CI();
            Matrix localMatrix = c.this.getMainMatrix();
            ((com.tencent.mm.cache.a)localObject).efr.set(localMatrix);
          }
          Object localObject = new Rect();
          if (c.this.cjc.dlV() == null)
            ((Rect)localObject).set(0, 0, c.this.cjc.dlT().getBaseBoardView().getBoardRect().width(), c.this.cjc.dlT().getBaseBoardView().getBoardRect().height());
          while (true)
          {
            c.this.cjc.dlT().getBaseBoardView().o((Rect)localObject);
            c.a(c.this, 200L, true, false);
            c.this.CQ();
            AppMethodBeat.o(116149);
            return;
            ((Rect)localObject).set(0, 0, c.this.cjc.dlV().getWidth(), c.this.cjc.dlV().getHeight());
          }
        }

        public final void onStart()
        {
          AppMethodBeat.i(116150);
          c.a(c.this, false);
          c.this.cjE = false;
          AppMethodBeat.o(116150);
        }
      }
      , 0.0F, false);
    }
    while (true)
    {
      setOneFingerMoveEnable(true);
      AppMethodBeat.o(116169);
      while (true)
      {
        return;
        locala = ((com.tencent.mm.cache.a)CI()).Jg();
        if (locala != null)
          break;
        ab.e("MicroMsg.CropArtist", "item is null!!!");
        AppMethodBeat.o(116169);
      }
      this.cch.set(new Rect(locala.cch));
      this.cjc.dlT().getBaseBoardView().AbT = locala.cch;
      try
      {
        ((com.tencent.mm.cache.a)CI()).a((com.tencent.mm.y.a)locala.clone());
        this.cjc.dlT().getBaseBoardView().a(new c.2(this), 0.0F, false);
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.CropArtist", localCloneNotSupportedException, "", new Object[0]);
      }
    }
  }

  public final boolean CL()
  {
    AppMethodBeat.i(116170);
    boolean bool;
    if (CI() == null)
    {
      AppMethodBeat.o(116170);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!((com.tencent.mm.cache.a)CI()).efr.equals(getMainMatrix()))
      {
        bool = true;
        AppMethodBeat.o(116170);
      }
      else
      {
        AppMethodBeat.o(116170);
        bool = false;
      }
    }
  }

  public final void CS()
  {
    AppMethodBeat.i(116173);
    this.cjr.set(this.cch.left - this.cjm, this.cch.bottom - this.cjm, this.cch.right + this.cjm, this.cch.bottom + this.cjm);
    this.cjq.set(this.cch.left - this.cjm, this.cch.top - this.cjm, this.cch.right + this.cjm, this.cch.top + this.cjm);
    this.cjs.set(this.cch.left - this.cjm, this.cch.top - this.cjm, this.cch.left + this.cjm, this.cch.bottom + this.cjm);
    this.cjt.set(this.cch.right - this.cjm, this.cch.top - this.cjm, this.cch.right + this.cjm, this.cch.bottom + this.cjm);
    AppMethodBeat.o(116173);
  }

  public final void CT()
  {
    AppMethodBeat.i(116174);
    if (this.cjc.dlV() == null)
    {
      ab.w("MicroMsg.CropArtist", "[resetBoxRect] getImageBitmap is null!");
      AppMethodBeat.o(116174);
      return;
    }
    float f1 = this.cjc.dlV().getWidth() * 1.0F / this.cjc.dlV().getHeight();
    int i;
    if (f1 < this.cju.width() * 1.0F / this.cju.height())
    {
      float f2 = this.cju.height();
      i = (int)((this.cju.width() - f1 * f2) / 2.0F);
      this.cch.set(this.cju.left + i, this.cju.top, this.cju.right - i, this.cju.bottom);
    }
    while (true)
    {
      CS();
      AppMethodBeat.o(116174);
      break;
      f1 = this.cju.width() / f1;
      i = (int)((this.cju.height() - f1) / 2.0F);
      this.cch.set(this.cju.left, this.cju.top + i, this.cju.right, this.cju.bottom - i);
    }
  }

  public final void CU()
  {
    AppMethodBeat.i(116175);
    this.cjc.dlT().getBaseBoardView().AbT = this.cjc.dlT().getBaseBoardView().getRawBoardRect();
    Object localObject1 = new RectF(this.cch);
    Object localObject2 = new Matrix();
    getMainMatrix().invert((Matrix)localObject2);
    ((Matrix)localObject2).mapRect((RectF)localObject1);
    localObject2 = new Rect();
    ((RectF)localObject1).round((Rect)localObject2);
    this.cjc.dlT().getBaseBoardView().o((Rect)localObject2);
    localObject1 = new com.tencent.mm.y.a();
    ((com.tencent.mm.y.a)localObject1).cch = new Rect(this.cch);
    ((com.tencent.mm.y.a)localObject1).eHd.set((Rect)localObject2);
    this.cjc.dlT().getBaseBoardView().a(new a.b()
    {
      public final void CV()
      {
        AppMethodBeat.i(116159);
        com.tencent.mm.y.a locala = this.cjR;
        Object localObject = c.this.getMainMatrix();
        locala.mMatrix.set((Matrix)localObject);
        localObject = (com.tencent.mm.cache.a)c.this.CI();
        if (((com.tencent.mm.cache.a)localObject).efp != null)
          ((com.tencent.mm.cache.a)localObject).efp.clear();
        ((com.tencent.mm.cache.a)c.this.CI()).a(this.cjR);
        AppMethodBeat.o(116159);
      }

      public final void onStart()
      {
      }
    }
    , 0.0F, true);
    this.cjc.dlT().getActionBar().setVisibility(0);
    AppMethodBeat.o(116175);
  }

  public final void a(com.tencent.mm.br.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    AppMethodBeat.i(116167);
    super.a(paramb, paramMatrix, paramRect);
    this.cch = new Rect();
    this.cjr = new RectF();
    this.cjq = new RectF();
    this.cjs = new RectF();
    this.cjt = new RectF();
    this.cjv = new com.tencent.mm.y.a(this.cch);
    this.cjy = new com.tencent.mm.b.a(this);
    AppMethodBeat.o(116167);
  }

  public final boolean o(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116172);
    boolean bool;
    if (!CN())
    {
      AppMethodBeat.o(116172);
      bool = false;
      return bool;
    }
    Object localObject = this.cjc.dlT().getBaseBoardView().getCurImageRect();
    this.cjI = (((RectF)localObject).top - (((RectF)localObject).bottom - this.cch.bottom));
    this.cjJ = (((RectF)localObject).bottom + (this.cch.top - ((RectF)localObject).top));
    this.cjK = (((RectF)localObject).left - (((RectF)localObject).right - this.cch.right));
    this.cjL = (((RectF)localObject).right + (this.cch.left - ((RectF)localObject).left));
    if (this.cjL > this.cju.right)
      this.cjL = this.cju.right;
    if (this.cjK < this.cjm)
      this.cjK = this.cjm;
    if (this.cjJ > this.cju.bottom)
      this.cjJ = this.cju.bottom;
    if (this.cjI < this.cjm)
      this.cjI = this.cjm;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
    case 5:
    case 0:
      do
      {
        while (true)
        {
          bool = this.cjz;
          AppMethodBeat.o(116172);
          break;
          this.cjC = false;
          this.cjA = false;
          this.cjB = false;
          this.cjD = false;
          this.cjz = false;
        }
        this.cjF = false;
        if (this.cjy != null)
          this.cjy.cancel();
        if (this.cjr.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
          this.cjC = true;
        if (this.cjq.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
          this.cjB = true;
        if (this.cjs.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
          this.cjA = true;
        if (this.cjt.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
          this.cjD = true;
        this.cjE = false;
      }
      while (!CR());
      if ((this.cjC) && (this.cjA))
      {
        this.cjC = true;
        this.cjA = true;
        this.cjB = false;
        this.cjD = false;
      }
      while (true)
      {
        this.cjG = paramMotionEvent.getX();
        this.cjH = paramMotionEvent.getY();
        break;
        if ((this.cjC) && (this.cjD))
        {
          this.cjC = true;
          this.cjA = false;
          this.cjB = false;
          this.cjD = true;
        }
        else if ((this.cjB) && (this.cjD))
        {
          this.cjC = false;
          this.cjA = false;
          this.cjB = true;
          this.cjD = true;
        }
        else if ((this.cjB) && (this.cjD))
        {
          this.cjC = false;
          this.cjA = false;
          this.cjB = true;
          this.cjD = true;
        }
      }
    case 2:
      this.cjF = true;
      if ((paramMotionEvent.getPointerCount() == 1) && (CR()))
      {
        if ((this.cjD) && (this.cch.right >= this.cch.left))
        {
          if (this.cch.right <= this.cju.right)
          {
            if (paramMotionEvent.getX() - this.cjG <= this.cju.right - this.cch.right)
              break label1870;
            this.cch.right = this.cju.right;
          }
          label701: if (this.cch.right < this.cch.left + this.cjm * 2)
            this.cch.right = (this.cch.left + this.cjm * 2);
          if (this.cch.right > this.cju.right)
            this.cch.right = this.cju.right;
          if (((int)((RectF)localObject).right <= (int)this.cjL) && ((int)((RectF)localObject).right <= this.cch.right))
          {
            if (paramMotionEvent.getX() - this.cjG <= this.cjL - ((RectF)localObject).right)
              break label1901;
            getMainMatrix().postTranslate(this.cjL - ((RectF)localObject).right, 0.0F);
          }
          label845: if ((this.cch.width() > ((RectF)localObject).width()) && (this.cch.right < this.cju.right))
          {
            f1 = this.cch.width() / ((RectF)localObject).width();
            getMainMatrix().postScale(f1, f1, this.cch.left, this.cch.centerY());
          }
        }
        if ((this.cjA) && (this.cch.right >= this.cch.left))
        {
          if (this.cch.left >= this.cju.left)
          {
            if (this.cjG - paramMotionEvent.getX() <= this.cch.left - this.cju.left)
              break label1922;
            this.cch.left = this.cju.left;
          }
          label1005: if (this.cch.left > this.cch.right - this.cjm * 2)
            this.cch.left = (this.cch.right - this.cjm * 2);
          if (this.cch.left < this.cju.left)
            this.cch.left = this.cju.left;
          if (((int)((RectF)localObject).left >= (int)this.cjK) && ((int)((RectF)localObject).left >= this.cch.left))
          {
            if (this.cjG - paramMotionEvent.getX() <= ((RectF)localObject).left - this.cjK)
              break label1953;
            getMainMatrix().postTranslate(this.cjK - ((RectF)localObject).left, 0.0F);
          }
          label1149: if ((this.cch.width() > ((RectF)localObject).width()) && (this.cch.left > this.cju.left))
          {
            f1 = this.cch.width() / ((RectF)localObject).width();
            getMainMatrix().postScale(f1, f1, this.cch.right, this.cch.centerY());
          }
        }
        if ((this.cjB) && (this.cch.bottom >= this.cch.top))
        {
          if (this.cch.top >= this.cju.top)
          {
            if (this.cjH - paramMotionEvent.getY() <= this.cch.top - this.cju.top)
              break label1974;
            this.cch.top = this.cju.top;
          }
          label1309: if (this.cch.top > this.cch.bottom - this.cjm * 2)
            this.cch.top = (this.cch.bottom - this.cjm * 2);
          if (this.cch.top < this.cju.top)
            this.cch.top = this.cju.top;
          if (((int)((RectF)localObject).top >= (int)this.cjI) && ((int)((RectF)localObject).top >= this.cch.top))
          {
            if (this.cjH - paramMotionEvent.getY() <= ((RectF)localObject).top - this.cjI)
              break label2005;
            getMainMatrix().postTranslate(0.0F, this.cjI - ((RectF)localObject).top);
          }
          label1453: if ((this.cch.height() > ((RectF)localObject).height()) && (this.cch.top > this.cju.top))
          {
            f1 = this.cch.height() / ((RectF)localObject).height();
            getMainMatrix().postScale(f1, f1, this.cch.centerX(), this.cch.bottom);
          }
        }
        if ((this.cjC) && (this.cch.bottom >= this.cch.top))
        {
          if (this.cch.bottom <= this.cju.bottom)
          {
            if (paramMotionEvent.getY() - this.cjH <= this.cju.bottom - this.cch.bottom)
              break label2026;
            this.cch.bottom = this.cju.bottom;
          }
          label1613: if (this.cch.bottom < this.cch.top + this.cjm * 2)
            this.cch.bottom = (this.cch.top + this.cjm * 2);
          if (this.cch.bottom > this.cju.bottom)
            this.cch.bottom = this.cju.bottom;
          if (((int)((RectF)localObject).bottom <= (int)this.cjJ) && ((int)((RectF)localObject).bottom <= this.cch.bottom))
          {
            if (paramMotionEvent.getY() - this.cjH <= this.cjJ - ((RectF)localObject).bottom)
              break label2057;
            getMainMatrix().postTranslate(0.0F, this.cjJ - ((RectF)localObject).bottom);
          }
          label1757: if ((this.cch.height() > ((RectF)localObject).height()) && (this.cch.bottom < this.cju.bottom))
          {
            f1 = this.cch.height() / ((RectF)localObject).height();
            getMainMatrix().postScale(f1, f1, this.cch.centerX(), this.cch.top);
          }
        }
        CS();
        this.cjz = true;
        CP();
        this.cjG = paramMotionEvent.getX();
        this.cjH = paramMotionEvent.getY();
      }
      while (true)
      {
        r(paramMotionEvent);
        break;
        label1870: Rect localRect = this.cch;
        localRect.right = ((int)(localRect.right + (paramMotionEvent.getX() - this.cjG)));
        break label701;
        label1901: getMainMatrix().postTranslate(paramMotionEvent.getX() - this.cjG, 0.0F);
        break label845;
        label1922: localRect = this.cch;
        localRect.left = ((int)(localRect.left - (this.cjG - paramMotionEvent.getX())));
        break label1005;
        label1953: getMainMatrix().postTranslate(paramMotionEvent.getX() - this.cjG, 0.0F);
        break label1149;
        label1974: localRect = this.cch;
        localRect.top = ((int)(localRect.top - (this.cjH - paramMotionEvent.getY())));
        break label1309;
        label2005: getMainMatrix().postTranslate(0.0F, paramMotionEvent.getY() - this.cjH);
        break label1453;
        label2026: localRect = this.cch;
        localRect.bottom = ((int)(localRect.bottom + (paramMotionEvent.getY() - this.cjH)));
        break label1613;
        label2057: getMainMatrix().postTranslate(0.0F, paramMotionEvent.getY() - this.cjH);
        break label1757;
        this.cjz = false;
      }
    case 1:
    }
    float f1 = this.cju.width() * 1.0F / this.cch.width();
    float f2 = this.cju.height() * 1.0F / this.cch.height();
    if (f1 < f2)
    {
      label2136: float f3 = this.cju.centerX();
      float f4 = this.cju.centerY();
      f2 = this.cch.centerX();
      float f5 = this.cch.centerY();
      if (this.cjF)
      {
        this.cjy.cck = 1000L;
        localObject = this.cjy;
        paramMotionEvent = this.cch;
        ((com.tencent.mm.b.a)localObject).ccf = (f3 - f2);
        ((com.tencent.mm.b.a)localObject).ccg = (f4 - f5);
        ((com.tencent.mm.b.a)localObject).cch = paramMotionEvent;
        ((com.tencent.mm.b.a)localObject).cci.set(((com.tencent.mm.b.a)localObject).cch);
        ((com.tencent.mm.b.a)localObject).cce = f1;
        this.cjy.play();
      }
      if (!CR())
        break label2296;
    }
    label2296: for (this.cjz = true; ; this.cjz = false)
    {
      this.cjC = false;
      this.cjA = false;
      this.cjB = false;
      this.cjD = false;
      CQ();
      break;
      f1 = f2;
      break label2136;
    }
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116171);
    com.tencent.mm.y.a locala;
    boolean bool1;
    boolean bool2;
    if (!this.cjx)
    {
      paramCanvas.setMatrix(null);
      locala = this.cjv;
      bool1 = this.cjE;
      bool2 = this.cjw;
      if (locala.cch != null)
        break label68;
      ab.e("MicroMsg.CropItem", "[draw] mBoxRect is null!");
      AppMethodBeat.o(116171);
    }
    while (true)
    {
      return;
      paramCanvas.setMatrix(this.cjp);
      break;
      label68: if (bool1)
      {
        paramCanvas.save();
        paramCanvas.clipRect(locala.cch, Region.Op.DIFFERENCE);
        paramCanvas.drawPaint(com.tencent.mm.y.a.eGZ);
        paramCanvas.restore();
      }
      if (bool2)
      {
        if (!com.tencent.mm.y.a.oT.equals(locala.cch))
        {
          com.tencent.mm.y.a.eGW.reset();
          com.tencent.mm.y.a.eGW.moveTo(locala.cch.left, locala.cch.top);
          com.tencent.mm.y.a.eGW.lineTo(locala.cch.right, locala.cch.top);
          com.tencent.mm.y.a.eGW.lineTo(locala.cch.right, locala.cch.bottom);
          com.tencent.mm.y.a.eGW.lineTo(locala.cch.left, locala.cch.bottom);
          com.tencent.mm.y.a.eGW.close();
          com.tencent.mm.y.a.eGV.reset();
          for (int i = 1; i < 3; i++)
          {
            com.tencent.mm.y.a.eGV.moveTo(locala.cch.left + locala.cch.width() / 3 * i, locala.cch.top);
            com.tencent.mm.y.a.eGV.lineTo(locala.cch.left + locala.cch.width() / 3 * i, locala.cch.bottom);
            com.tencent.mm.y.a.eGV.moveTo(locala.cch.left, locala.cch.top + locala.cch.height() / 3 * i);
            com.tencent.mm.y.a.eGV.lineTo(locala.cch.right, locala.cch.top + locala.cch.height() / 3 * i);
          }
        }
        paramCanvas.drawRect(locala.cch.left, locala.cch.top, locala.cch.right, locala.cch.bottom, com.tencent.mm.y.a.eGY);
        paramCanvas.drawPath(com.tencent.mm.y.a.eGV, com.tencent.mm.y.a.eHa);
        paramCanvas.drawPath(com.tencent.mm.y.a.eGW, com.tencent.mm.y.a.eGX);
        float f1 = locala.cch.left;
        float f2 = com.tencent.mm.y.a.eGT;
        float f3 = locala.cch.top;
        float f4 = com.tencent.mm.y.a.eGT / 2.0F;
        float f5 = locala.cch.left;
        paramCanvas.drawLine(f1 - f2, f3 - f4, com.tencent.mm.y.a.eGU + f5, locala.cch.top - com.tencent.mm.y.a.eGT / 2.0F, com.tencent.mm.y.a.eHb);
        f3 = locala.cch.right;
        f4 = com.tencent.mm.y.a.eGU;
        f5 = com.tencent.mm.y.a.eGT / 2.0F;
        float f6 = locala.cch.top;
        f2 = com.tencent.mm.y.a.eGT / 2.0F;
        f1 = locala.cch.right;
        paramCanvas.drawLine(f5 + (f3 - f4), f6 - f2, com.tencent.mm.y.a.eGT + f1, locala.cch.top - com.tencent.mm.y.a.eGT / 2.0F, com.tencent.mm.y.a.eHb);
        f6 = locala.cch.left;
        f5 = com.tencent.mm.y.a.eGT / 2.0F;
        f4 = locala.cch.top;
        f1 = com.tencent.mm.y.a.eGT / 2.0F;
        f2 = locala.cch.left;
        float f7 = com.tencent.mm.y.a.eGT / 2.0F;
        f3 = locala.cch.top;
        paramCanvas.drawLine(f6 - f5, f4 - f1, f2 - f7, com.tencent.mm.y.a.eGU + f3, com.tencent.mm.y.a.eHb);
        f3 = locala.cch.left;
        f2 = com.tencent.mm.y.a.eGT / 2.0F;
        f7 = locala.cch.bottom;
        f4 = com.tencent.mm.y.a.eGU;
        f6 = com.tencent.mm.y.a.eGT / 2.0F;
        float f8 = locala.cch.left;
        f5 = com.tencent.mm.y.a.eGT / 2.0F;
        f1 = locala.cch.bottom;
        paramCanvas.drawLine(f3 - f2, f6 + (f7 - f4), f8 - f5, com.tencent.mm.y.a.eGT / 2.0F + f1, com.tencent.mm.y.a.eHb);
        f4 = locala.cch.right;
        f3 = com.tencent.mm.y.a.eGT / 2.0F;
        f6 = locala.cch.top;
        f2 = locala.cch.right;
        f5 = com.tencent.mm.y.a.eGT / 2.0F;
        f1 = locala.cch.top;
        paramCanvas.drawLine(f3 + f4, f6, f5 + f2, com.tencent.mm.y.a.eGU + f1, com.tencent.mm.y.a.eHb);
        f5 = locala.cch.right;
        f6 = com.tencent.mm.y.a.eGT / 2.0F;
        f3 = locala.cch.bottom;
        f4 = com.tencent.mm.y.a.eGU;
        f8 = com.tencent.mm.y.a.eGT / 2.0F;
        f2 = locala.cch.right;
        f1 = com.tencent.mm.y.a.eGT / 2.0F;
        f7 = locala.cch.bottom;
        paramCanvas.drawLine(f6 + f5, f8 + (f3 - f4), f1 + f2, com.tencent.mm.y.a.eGT / 2.0F + f7, com.tencent.mm.y.a.eHb);
        f3 = locala.cch.left;
        f5 = com.tencent.mm.y.a.eGT;
        f7 = locala.cch.bottom;
        f6 = com.tencent.mm.y.a.eGT / 2.0F;
        f1 = locala.cch.left;
        f2 = com.tencent.mm.y.a.eGU;
        f4 = locala.cch.bottom;
        paramCanvas.drawLine(f3 - f5, f6 + f7, f2 + f1, com.tencent.mm.y.a.eGT / 2.0F + f4, com.tencent.mm.y.a.eHb);
        f4 = locala.cch.right;
        f2 = com.tencent.mm.y.a.eGU;
        f5 = locala.cch.bottom;
        f1 = com.tencent.mm.y.a.eGT / 2.0F;
        f6 = locala.cch.right;
        f3 = com.tencent.mm.y.a.eGT;
        f7 = locala.cch.bottom;
        paramCanvas.drawLine(f4 - f2, f1 + f5, f3 + f6, com.tencent.mm.y.a.eGT / 2.0F + f7, com.tencent.mm.y.a.eHb);
        if (!com.tencent.mm.y.a.oT.equals(locala.cch))
          com.tencent.mm.y.a.oT.set(locala.cch);
      }
      AppMethodBeat.o(116171);
    }
  }

  public final void zC()
  {
    AppMethodBeat.i(116168);
    super.zC();
    if (this.cju.isEmpty())
      this.cju.set(this.cjm, this.cjm * 2, getBoardRect().width() - this.cjm, getBoardRect().height() - this.cjn - this.cjo - this.cjm * 2);
    ab.i("MicroMsg.CropArtist", "[onAlive] CROP_MAX_RECT:%s", new Object[] { this.cju });
    com.tencent.mm.y.a locala = ((com.tencent.mm.cache.a)CI()).Jg();
    if ((locala != null) && (!locala.eHd.isEmpty()))
    {
      this.cjc.dlT().getBaseBoardView().o(locala.eHd);
      float f = b(locala.mMatrix);
      ab.i("MicroMsg.CropArtist", "[onAlive] rotation:%s", new Object[] { Float.valueOf(f) });
      getMainMatrix().postRotate(-f, locala.eHd.centerX(), locala.eHd.centerY());
    }
    AppMethodBeat.o(116168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c
 * JD-Core Version:    0.6.2
 */