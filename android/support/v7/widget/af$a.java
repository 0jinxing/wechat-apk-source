package android.support.v7.widget;

import java.util.Arrays;

final class af$a
  implements RecyclerView.i.a
{
  int aja;
  int ajb;
  int[] ajc;
  int mCount;

  public final void T(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException("Layout positions must be non-negative");
    if (paramInt2 < 0)
      throw new IllegalArgumentException("Pixel distance must be non-negative");
    int i = this.mCount * 2;
    if (this.ajc == null)
    {
      this.ajc = new int[4];
      Arrays.fill(this.ajc, -1);
    }
    while (true)
    {
      this.ajc[i] = paramInt1;
      this.ajc[(i + 1)] = paramInt2;
      this.mCount += 1;
      return;
      if (i >= this.ajc.length)
      {
        int[] arrayOfInt = this.ajc;
        this.ajc = new int[i * 2];
        System.arraycopy(arrayOfInt, 0, this.ajc, 0, arrayOfInt.length);
      }
    }
  }

  final void a(RecyclerView paramRecyclerView, boolean paramBoolean)
  {
    this.mCount = 0;
    if (this.ajc != null)
      Arrays.fill(this.ajc, -1);
    RecyclerView.i locali = paramRecyclerView.ank;
    if ((paramRecyclerView.Yq != null) && (locali != null) && (locali.aoG))
    {
      if (!paramBoolean)
        break label101;
      if (!paramRecyclerView.ane.hw())
        locali.a(paramRecyclerView.Yq.getItemCount(), this);
    }
    while (true)
    {
      if (this.mCount > locali.aoH)
      {
        locali.aoH = this.mCount;
        locali.aoI = paramBoolean;
        paramRecyclerView.anc.kb();
      }
      return;
      label101: if (!paramRecyclerView.jO())
        locali.a(this.aja, this.ajb, paramRecyclerView.anY, this);
    }
  }

  final boolean bM(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    int i;
    if (this.ajc != null)
      i = this.mCount;
    for (int j = 0; ; j += 2)
    {
      bool2 = bool1;
      if (j < i * 2)
      {
        if (this.ajc[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  final void ig()
  {
    if (this.ajc != null)
      Arrays.fill(this.ajc, -1);
    this.mCount = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.af.a
 * JD-Core Version:    0.6.2
 */