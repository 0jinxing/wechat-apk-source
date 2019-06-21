package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class c extends Drawable
{
  final ActionBarContainer acD;

  public c(ActionBarContainer paramActionBarContainer)
  {
    this.acD = paramActionBarContainer;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.acD.acK)
      if (this.acD.acJ != null)
        this.acD.acJ.draw(paramCanvas);
    while (true)
    {
      return;
      if (this.acD.abb != null)
        this.acD.abb.draw(paramCanvas);
      if ((this.acD.acI != null) && (this.acD.acL))
        this.acD.acI.draw(paramCanvas);
    }
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.c
 * JD-Core Version:    0.6.2
 */