package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar
{
  private final m afT = new m(this);

  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772229);
  }

  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.afT.a(paramAttributeSet, paramInt);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    m localm = this.afT;
    Drawable localDrawable = localm.afV;
    if ((localDrawable != null) && (localDrawable.isStateful()) && (localDrawable.setState(localm.afU.getDrawableState())))
      localm.afU.invalidateDrawable(localDrawable);
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    m localm = this.afT;
    if (localm.afV != null)
      localm.afV.jumpToCurrentState();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 1;
    try
    {
      super.onDraw(paramCanvas);
      m localm = this.afT;
      if (localm.afV != null)
      {
        int j = localm.afU.getMax();
        if (j > 1)
        {
          int k = localm.afV.getIntrinsicWidth();
          int m = localm.afV.getIntrinsicHeight();
          if (k >= 0)
            k /= 2;
          while (true)
          {
            if (m >= 0)
              i = m / 2;
            localm.afV.setBounds(-k, -i, k, i);
            float f = (localm.afU.getWidth() - localm.afU.getPaddingLeft() - localm.afU.getPaddingRight()) / j;
            i = paramCanvas.save();
            paramCanvas.translate(localm.afU.getPaddingLeft(), localm.afU.getHeight() / 2);
            for (k = 0; k <= j; k++)
            {
              localm.afV.draw(paramCanvas);
              paramCanvas.translate(f, 0.0F);
            }
            k = 1;
          }
          paramCanvas.restoreToCount(i);
        }
      }
      return;
    }
    finally
    {
    }
    throw paramCanvas;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatSeekBar
 * JD-Core Version:    0.6.2
 */