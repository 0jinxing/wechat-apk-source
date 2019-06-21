package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class Placeholder extends View
{
  int fq = -1;
  View fs = null;
  int ft = 4;

  public Placeholder(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b(paramAttributeSet);
  }

  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b(paramAttributeSet);
  }

  private void b(AttributeSet paramAttributeSet)
  {
    super.setVisibility(this.ft);
    this.fq = -1;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, b.a.ConstraintLayout_placeholder);
      int i = paramAttributeSet.getIndexCount();
      int j = 0;
      if (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == 0)
          this.fq = paramAttributeSet.getResourceId(k, this.fq);
        while (true)
        {
          j++;
          break;
          if (k == 1)
            this.ft = paramAttributeSet.getInt(k, this.ft);
        }
      }
    }
  }

  public View getContent()
  {
    return this.fs;
  }

  public int getEmptyVisibility()
  {
    return this.ft;
  }

  public void onDraw(Canvas paramCanvas)
  {
    if (isInEditMode())
    {
      paramCanvas.drawRGB(223, 223, 223);
      Paint localPaint = new Paint();
      localPaint.setARGB(255, 210, 210, 210);
      localPaint.setTextAlign(Paint.Align.CENTER);
      localPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect localRect = new Rect();
      paramCanvas.getClipBounds(localRect);
      localPaint.setTextSize(localRect.height());
      int i = localRect.height();
      int j = localRect.width();
      localPaint.setTextAlign(Paint.Align.LEFT);
      localPaint.getTextBounds("?", 0, "?".length(), localRect);
      paramCanvas.drawText("?", j / 2.0F - localRect.width() / 2.0F - localRect.left, i / 2.0F + localRect.height() / 2.0F - localRect.bottom, localPaint);
    }
  }

  public void setContentId(int paramInt)
  {
    if (this.fq == paramInt);
    while (true)
    {
      return;
      if (this.fs != null)
      {
        this.fs.setVisibility(0);
        ((ConstraintLayout.LayoutParams)this.fs.getLayoutParams()).ew = false;
        this.fs = null;
      }
      this.fq = paramInt;
      if (paramInt != -1)
      {
        View localView = ((View)getParent()).findViewById(paramInt);
        if (localView != null)
          localView.setVisibility(8);
      }
    }
  }

  public void setEmptyVisibility(int paramInt)
  {
    this.ft = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.constraint.Placeholder
 * JD-Core Version:    0.6.2
 */