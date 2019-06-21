package android.support.v7.d;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

public final class b$a
{
  public final List<b.c> XE;
  public final List<c> XF = new ArrayList();
  public int XK = 16;
  public int XL = 12544;
  public int XM = -1;
  public Rect XN;
  public final Bitmap mBitmap;
  public final List<b.b> mFilters = new ArrayList();

  public b$a(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      throw new IllegalArgumentException("Bitmap is not valid");
    this.mFilters.add(b.XJ);
    this.mBitmap = paramBitmap;
    this.XE = null;
    this.XF.add(c.XW);
    this.XF.add(c.XX);
    this.XF.add(c.XY);
    this.XF.add(c.XZ);
    this.XF.add(c.Ya);
    this.XF.add(c.Yb);
  }

  public final int[] e(Bitmap paramBitmap)
  {
    int i = 0;
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    int[] arrayOfInt = new int[j * k];
    paramBitmap.getPixels(arrayOfInt, 0, j, 0, 0, j, k);
    if (this.XN == null)
      paramBitmap = arrayOfInt;
    while (true)
    {
      return paramBitmap;
      int m = this.XN.width();
      k = this.XN.height();
      paramBitmap = new int[m * k];
      while (i < k)
      {
        System.arraycopy(arrayOfInt, (this.XN.top + i) * j + this.XN.left, paramBitmap, i * m, m);
        i++;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.d.b.a
 * JD-Core Version:    0.6.2
 */