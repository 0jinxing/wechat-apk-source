package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomFitTextView extends TextView
{
  private boolean gLJ;
  public int maxLines;
  private Paint zBH;
  private String zBI;
  private Rect zBJ;
  private LinkedList<String> zBK;
  public int zBL;
  private Drawable zBM;
  public boolean zBN;
  private int zBO;

  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107617);
    this.zBJ = new Rect();
    this.zBK = new LinkedList();
    this.gLJ = true;
    this.zBO = 0;
    AppMethodBeat.o(107617);
  }

  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107618);
    this.zBJ = new Rect();
    this.zBK = new LinkedList();
    this.gLJ = true;
    this.zBO = 0;
    AppMethodBeat.o(107618);
  }

  private void asf(String paramString)
  {
    AppMethodBeat.i(107622);
    if (this.zBK != null)
      if ((paramString == null) || ("".equals(paramString)))
        AppMethodBeat.o(107622);
    while (true)
    {
      return;
      this.zBK.add(paramString);
      AppMethodBeat.o(107622);
    }
  }

  private int d(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107623);
    if (paramInt2 <= paramInt1)
    {
      paramInt2 = paramInt1 + 1;
      AppMethodBeat.o(107623);
    }
    while (true)
    {
      return paramInt2;
      if (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 < paramInt4)
      {
        AppMethodBeat.o(107623);
      }
      else
      {
        int i = paramString.length();
        int j;
        while (true)
        {
          j = paramInt2;
          if (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 <= paramInt4)
            break;
          paramInt2 = paramInt2 + paramInt1 >> 1;
        }
        while ((j <= i) && (getPaint().measureText(paramString, paramInt1, j) + paramInt3 < paramInt4))
          j++;
        paramInt2 = Math.min(i, j) - 1;
        for (paramInt1 = paramInt2; (paramInt1 >= 0) && (bo.z(paramString.charAt(paramInt1))); paramInt1--);
        if ((paramInt1 < 0) || (paramInt1 == paramInt2))
        {
          paramInt2 = j - 1;
          AppMethodBeat.o(107623);
        }
        else
        {
          paramInt2 = paramInt1 + 1;
          AppMethodBeat.o(107623);
        }
      }
    }
  }

  private int dJK()
  {
    AppMethodBeat.i(107620);
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    float f1 = this.zBK.size();
    float f2 = localFontMetrics.bottom;
    float f3 = localFontMetrics.top;
    int i = (int)((localFontMetrics.leading + (f2 - f3)) * f1 + getPaddingTop() + getPaddingBottom());
    int j = Math.max(0, this.zBK.size() - 1);
    int k = this.zBO;
    AppMethodBeat.o(107620);
    return i + j * k;
  }

  private boolean eG(String paramString, int paramInt)
  {
    AppMethodBeat.i(107621);
    int i;
    int j;
    int k;
    int m;
    if ((this.gLJ) && (paramInt > 0) && (paramString != null) && (!"".equals(paramString)))
    {
      this.zBK.clear();
      i = 0;
      j = paramString.length();
      k = paramInt - getPaddingLeft() - getPaddingRight();
      if (this.zBN)
      {
        paramInt = this.zBM.getIntrinsicWidth();
        float f = getPaint().measureText(paramString, 0, j);
        f = paramInt + f;
        m = this.maxLines;
        if (Float.compare(f, this.maxLines * k) >= 0)
          break label249;
        m = (int)Math.ceil(f / k);
      }
    }
    label130: label249: 
    while (true)
    {
      int n = 0;
      if (n < m)
        if (n == m - 1)
          asf(paramString.substring(i, d(paramString, i, j, paramInt, k)).trim());
      while (true)
      {
        n++;
        break label130;
        paramInt = 0;
        break;
        int i1 = d(paramString, i, j, 0, k);
        asf(paramString.substring(i, i1).trim());
        if (i1 >= j)
        {
          ab.w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
          boolean bool = true;
          AppMethodBeat.o(107621);
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(107621);
          }
        }
        i = i1;
      }
    }
  }

  public final void a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107619);
    this.maxLines = paramInt1;
    this.zBI = paramString;
    if (this.zBI == null)
    {
      ab.w("MicroMsg.CustomFitTextView", "ori text is null");
      this.zBI = "";
    }
    if (this.maxLines <= 0)
    {
      ab.w("MicroMsg.CustomFitTextView", "maxLines is invalid");
      this.maxLines = 2;
    }
    this.zBO = getResources().getDimensionPixelSize(2131427500);
    this.zBN = paramBoolean;
    this.zBL = paramInt2;
    if (this.zBN)
      this.zBM = getResources().getDrawable(this.zBL);
    this.zBH = new Paint();
    this.zBH.set(getPaint());
    this.zBH.setAntiAlias(true);
    this.zBH.setColor(paramInt3);
    eG(this.zBI, getWidth());
    setHeight(Math.max(dJK(), a.fromDPToPix(getContext(), 32)));
    AppMethodBeat.o(107619);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107624);
    if (!this.gLJ)
      AppMethodBeat.o(107624);
    while (true)
    {
      return;
      if ((this.zBI == null) || ("".equals(this.zBI)) || (this.zBK.size() == 0))
      {
        AppMethodBeat.o(107624);
      }
      else
      {
        Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
        float f1 = localFontMetrics.descent - localFontMetrics.ascent;
        float f2 = getPaddingLeft();
        float f3 = getPaddingTop();
        Iterator localIterator = this.zBK.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          f3 = localFontMetrics.leading + f1 + f3;
          paramCanvas.drawText(str, f2, f3, this.zBH);
        }
        if (this.zBN)
        {
          getPaint().getTextBounds((String)this.zBK.getLast(), 0, ((String)this.zBK.getLast()).length(), this.zBJ);
          int i = getPaddingLeft() + this.zBJ.right;
          int j = this.zBM.getIntrinsicWidth();
          int k = (int)(f3 - f1 - localFontMetrics.leading);
          int m = this.zBM.getIntrinsicHeight();
          this.zBM.setBounds(i, k, j + i, m + k);
          this.zBM.draw(paramCanvas);
        }
        AppMethodBeat.o(107624);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107626);
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = a.fromDPToPix(getContext(), 32);
    paramInt1 = paramInt2;
    if (eG(this.zBI, i))
      paramInt1 = Math.max(dJK(), paramInt2);
    setMeasuredDimension(i, paramInt1);
    AppMethodBeat.o(107626);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107625);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4));
    for (boolean bool = true; ; bool = false)
    {
      this.gLJ = bool;
      if (this.gLJ)
        eG(this.zBI, paramInt1);
      AppMethodBeat.o(107625);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CustomFitTextView
 * JD-Core Version:    0.6.2
 */