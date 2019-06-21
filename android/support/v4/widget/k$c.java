package android.support.v4.widget;

import android.graphics.Rect;
import java.util.Comparator;

final class k$c<T>
  implements Comparator<T>
{
  private final Rect QP = new Rect();
  private final Rect QQ = new Rect();
  private final boolean QR;
  private final k.a<T> QS;

  k$c(boolean paramBoolean, k.a<T> parama)
  {
    this.QR = paramBoolean;
    this.QS = parama;
  }

  public final int compare(T paramT1, T paramT2)
  {
    int i = -1;
    Rect localRect1 = this.QP;
    Rect localRect2 = this.QQ;
    this.QS.b(paramT1, localRect1);
    this.QS.b(paramT2, localRect2);
    int j;
    if (localRect1.top < localRect2.top)
      j = i;
    while (true)
    {
      return j;
      if (localRect1.top > localRect2.top)
      {
        j = 1;
      }
      else if (localRect1.left < localRect2.left)
      {
        j = i;
        if (this.QR)
          j = 1;
      }
      else if (localRect1.left > localRect2.left)
      {
        j = i;
        if (!this.QR)
          j = 1;
      }
      else
      {
        j = i;
        if (localRect1.bottom >= localRect2.bottom)
          if (localRect1.bottom > localRect2.bottom)
          {
            j = 1;
          }
          else if (localRect1.right < localRect2.right)
          {
            j = i;
            if (this.QR)
              j = 1;
          }
          else if (localRect1.right > localRect2.right)
          {
            j = i;
            if (!this.QR)
              j = 1;
          }
          else
          {
            j = 0;
          }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k.c
 * JD-Core Version:    0.6.2
 */