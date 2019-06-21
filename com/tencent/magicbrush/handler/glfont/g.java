package com.tencent.magicbrush.handler.glfont;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class g
{
  private List<j> bTb;
  private f bTf;
  private d bTg;
  private Canvas bTh;
  Paint bTi;
  private char[] bTj;
  private Rect bTk;
  private Rect bTl;
  Paint.FontMetrics bTm;

  g(d paramd, f paramf)
  {
    AppMethodBeat.i(115931);
    this.bTj = new char[1];
    this.bTk = new Rect();
    this.bTl = new Rect();
    this.bTb = new ArrayList();
    this.bTm = new Paint.FontMetrics();
    this.bTg = paramd;
    this.bTh = new Canvas(this.bTg.bSR);
    this.bTf = paramf;
    this.bTi = new Paint(1);
    this.bTi.setTextAlign(Paint.Align.LEFT);
    this.bTi.setColor(-1);
    AppMethodBeat.o(115931);
  }

  static float E(List<j> paramList)
  {
    AppMethodBeat.i(115939);
    float f;
    if ((paramList == null) || (paramList.size() == 0))
    {
      AppMethodBeat.o(115939);
      f = 0.0F;
    }
    while (true)
    {
      return f;
      Iterator localIterator = paramList.iterator();
      f = 0.0F;
      while (localIterator.hasNext())
      {
        paramList = (j)localIterator.next();
        if (paramList != null)
          f = paramList.bTA + f;
      }
      AppMethodBeat.o(115939);
    }
  }

  private void a(char paramChar, Rect paramRect, j paramj, Paint paramPaint)
  {
    AppMethodBeat.i(115936);
    if ((paramPaint == null) || (paramj == null) || (paramRect == null))
      AppMethodBeat.o(115936);
    while (true)
    {
      return;
      this.bTj[0] = ((char)paramChar);
      this.bTh.save();
      this.bTh.clipRect(paramRect);
      this.bTh.drawText(this.bTj, 0, 1, paramRect.left - paramj.bTB, paramRect.top + paramj.height - this.bTm.descent - 1.0F, paramPaint);
      this.bTh.restore();
      AppMethodBeat.o(115936);
    }
  }

  private void a(j paramj, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115934);
    if (paramj == null)
      AppMethodBeat.o(115934);
    while (true)
    {
      return;
      paramj.bTA = paramInt1;
      if (yI())
      {
        paramj.bTB = (-this.bTi.getStrokeWidth() / 2.0F);
        paramj.z(paramInt1 + this.bTi.getStrokeWidth(), paramInt2);
        AppMethodBeat.o(115934);
      }
      else
      {
        paramj.bTB = 0.0F;
        paramj.z(paramInt1, paramInt2);
        AppMethodBeat.o(115934);
      }
    }
  }

  private void a(j paramj, Rect paramRect)
  {
    AppMethodBeat.i(115935);
    paramj.f(paramRect.left / this.bTg.width(), paramRect.top / this.bTg.height(), paramRect.right / this.bTg.width(), paramRect.bottom / this.bTg.height());
    AppMethodBeat.o(115935);
  }

  private float p(char paramChar)
  {
    AppMethodBeat.i(115933);
    this.bTj[0] = ((char)paramChar);
    this.bTi.getTextBounds(this.bTj, 0, 1, this.bTk);
    float f = this.bTi.measureText(this.bTj, 0, 1);
    f = Math.max(this.bTk.width(), f);
    AppMethodBeat.o(115933);
    return f + 1.0F;
  }

  private boolean yI()
  {
    boolean bool = false;
    AppMethodBeat.i(115937);
    Paint localPaint = this.bTi;
    if (localPaint == null)
      AppMethodBeat.o(115937);
    while (true)
    {
      return bool;
      if ((localPaint.getStyle() == Paint.Style.STROKE) || (localPaint.getStyle() == Paint.Style.FILL_AND_STROKE))
      {
        bool = true;
        AppMethodBeat.o(115937);
      }
      else
      {
        AppMethodBeat.o(115937);
      }
    }
  }

  final j a(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115938);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      paramDrawable = new IllegalArgumentException("width or height unexpected");
      AppMethodBeat.o(115938);
      throw paramDrawable;
    }
    j localj = this.bTf.bSZ.yH();
    localj.bTA = paramInt1;
    localj.bTB = 0.0F;
    this.bTg.b(paramInt1, paramInt2, this.bTk);
    Rect localRect = this.bTk;
    if ((localRect.left < 0) || (localRect.right < 0) || (localRect.width() <= 0) || (localRect.height() <= 0))
    {
      paramDrawable = null;
      AppMethodBeat.o(115938);
    }
    while (true)
    {
      return paramDrawable;
      localj.z(paramInt1, paramInt2);
      localj.f(localRect.left / this.bTg.width(), localRect.top / this.bTg.height(), localRect.right / this.bTg.width(), localRect.bottom / this.bTg.height());
      localj.bTG = true;
      this.bTh.save();
      this.bTh.clipRect(localRect);
      paramDrawable.setBounds(localRect);
      paramDrawable.draw(this.bTh);
      this.bTh.restore();
      AppMethodBeat.o(115938);
      paramDrawable = localj;
    }
  }

  final j o(char paramChar)
  {
    AppMethodBeat.i(115932);
    j localj = this.bTf.bSZ.yH();
    localj.bTG = false;
    int i = (int)Math.ceil(this.bTm.descent - this.bTm.ascent);
    a(localj, (int)Math.ceil(p(paramChar)), i);
    if (!this.bTg.b((int)Math.ceil(localj.width), (int)Math.ceil(localj.height), this.bTk))
    {
      localj = null;
      AppMethodBeat.o(115932);
    }
    while (true)
    {
      return localj;
      a(localj, this.bTk);
      a(paramChar, this.bTk, localj, this.bTi);
      AppMethodBeat.o(115932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.g
 * JD-Core Version:    0.6.2
 */