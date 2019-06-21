package com.tencent.magicbrush.handler.glfont;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class k
  implements c
{
  private c.a bTH;
  private int bTI;
  private c.c bTJ;
  private ArrayList<c.b> hd;
  private int mHeight;
  private int mWidth;

  k()
  {
    AppMethodBeat.i(115956);
    this.hd = new ArrayList();
    this.bTH = new c.a();
    this.bTJ = new c.c();
    AppMethodBeat.o(115956);
  }

  public final void a(int paramInt1, int paramInt2, Rect paramRect)
  {
    AppMethodBeat.i(115958);
    if (paramRect == null)
      AppMethodBeat.o(115958);
    while (true)
    {
      return;
      if ((paramInt1 > 0) && (paramInt2 > 0))
        break;
      paramRect.setEmpty();
      AppMethodBeat.o(115958);
    }
    c.c localc = this.bTJ;
    localc.x = 0;
    localc.y = 0;
    localc.width = paramInt1;
    localc.height = paramInt2;
    int i = -1;
    int j = 0;
    int k = 2147483647;
    int m = 2147483647;
    label79: c.b localb1;
    int n;
    if (j < this.hd.size())
    {
      localb1 = (c.b)this.hd.get(j);
      if (localb1.x + paramInt1 > this.mWidth - 1)
      {
        n = -1;
        label124: if (n < 0)
          break label758;
        localb1 = (c.b)this.hd.get(j);
        if ((n + paramInt2 >= m) && ((n + paramInt2 != m) || (localb1.z <= 0) || (localb1.z >= k)))
          break label758;
        k = localb1.z;
        localc.x = localb1.x;
        localc.y = n;
        i = j;
        m = n + paramInt2;
      }
    }
    label312: label718: label758: 
    while (true)
    {
      j++;
      break label79;
      n = localb1.y;
      int i1 = j;
      int i2 = paramInt1;
      while (true)
      {
        if (i2 <= 0)
          break label312;
        localb1 = (c.b)this.hd.get(i1);
        int i3 = n;
        if (localb1.y > n)
          i3 = localb1.y;
        if (i3 + paramInt2 > this.mHeight - 1)
        {
          n = -1;
          break;
        }
        i2 -= localb1.z;
        i1++;
        n = i3;
      }
      break label124;
      if (i == -1)
      {
        localc.x = -1;
        localc.y = -1;
        localc.width = 0;
        localc.height = 0;
      }
      while (true)
      {
        if ((localc.x >= 0) && (localc.y >= 0))
          break label718;
        paramRect.setEmpty();
        AppMethodBeat.o(115958);
        break;
        localb1 = this.bTH.yG();
        localb1.x = localc.x;
        localb1.y = (localc.y + paramInt2);
        localb1.z = paramInt1;
        this.hd.add(i, localb1);
        c.b localb2;
        for (j = i + 1; j < this.hd.size(); j = j - 1 + 1)
        {
          localb1 = (c.b)this.hd.get(j);
          localb2 = (c.b)this.hd.get(j - 1);
          if (localb1.x >= localb2.x + localb2.z)
            break;
          k = localb2.x;
          k = localb2.z + k - localb1.x;
          localb1.x += k;
          localb1.z -= k;
          if (localb1.z > 0)
            break;
          localb1 = (c.b)this.hd.remove(j);
          this.bTH.a(localb1);
        }
        for (j = 0; j < this.hd.size() - 1; j = k + 1)
        {
          localb1 = (c.b)this.hd.get(j);
          localb2 = (c.b)this.hd.get(j + 1);
          k = j;
          if (localb1.y == localb2.y)
          {
            k = localb1.z;
            localb2.z += k;
            localb1 = (c.b)this.hd.remove(j + 1);
            this.bTH.a(localb1);
            k = j - 1;
          }
        }
        this.bTI += paramInt1 * paramInt2;
      }
      paramRect.set(localc.x, localc.y, localc.x + paramInt1 - 1, localc.y + paramInt2 - 1);
      AppMethodBeat.o(115958);
      break;
    }
  }

  public final void init(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115957);
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    reset();
    AppMethodBeat.o(115957);
  }

  public final void reset()
  {
    AppMethodBeat.i(115959);
    this.bTI = 0;
    this.bTH.d(this.hd);
    c.b localb = this.bTH.yG();
    localb.fT(this.mWidth - 2);
    this.hd.add(localb);
    AppMethodBeat.o(115959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.k
 * JD-Core Version:    0.6.2
 */