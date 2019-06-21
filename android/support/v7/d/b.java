package android.support.v7.d;

import android.graphics.Bitmap;
import android.support.v4.f.a;
import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

public final class b
{
  static final b.b XJ = new b.1();
  public final List<b.c> XE;
  public final List<c> XF;
  public final Map<c, b.c> XG;
  public final SparseBooleanArray XH;
  public final b.c XI;

  public b(List<b.c> paramList, List<c> paramList1)
  {
    this.XE = paramList;
    this.XF = paramList1;
    this.XH = new SparseBooleanArray();
    this.XG = new a();
    this.XI = fQ();
  }

  public static b.a d(Bitmap paramBitmap)
  {
    return new b.a(paramBitmap);
  }

  private b.c fQ()
  {
    int i = -2147483648;
    Object localObject = null;
    int j = this.XE.size();
    int k = 0;
    if (k < j)
    {
      b.c localc = (b.c)this.XE.get(k);
      if (localc.Xw <= i)
        break label66;
      i = localc.Xw;
      localObject = localc;
    }
    label66: 
    while (true)
    {
      k++;
      break;
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.d.b
 * JD-Core Version:    0.6.2
 */