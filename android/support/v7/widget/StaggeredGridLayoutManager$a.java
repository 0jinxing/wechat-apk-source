package android.support.v7.widget;

import java.util.Arrays;

final class StaggeredGridLayoutManager$a
{
  int Lp;
  boolean alO;
  boolean alP;
  boolean ash;
  int[] asi;
  int mPosition;

  final void reset()
  {
    this.mPosition = -1;
    this.Lp = -2147483648;
    this.alO = false;
    this.ash = false;
    this.alP = false;
    if (this.asi != null)
      Arrays.fill(this.asi, -1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.a
 * JD-Core Version:    0.6.2
 */