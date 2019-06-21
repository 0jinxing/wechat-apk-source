package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.d;

final class a$5
  implements RecyclerView.d
{
  a$5(a parama)
  {
  }

  public final int az(int paramInt1, int paramInt2)
  {
    if (this.avH.avB == null)
      paramInt1 = paramInt2;
    while (true)
    {
      return paramInt1;
      int i = this.avH.avC;
      int j = i;
      if (i == -1)
      {
        j = this.avH.aiB.indexOfChild(this.avH.avB);
        this.avH.avC = j;
      }
      if (paramInt2 == paramInt1 - 1)
      {
        paramInt1 = j;
      }
      else
      {
        paramInt1 = paramInt2;
        if (paramInt2 >= j)
          paramInt1 = paramInt2 + 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a.5
 * JD-Core Version:    0.6.2
 */