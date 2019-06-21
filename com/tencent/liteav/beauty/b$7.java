package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.b.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

class b$7
  implements Runnable
{
  b$7(b paramb, Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66827);
    if (this.a != null)
      a.a().e();
    if (this.a == null)
    {
      if (b.b(this.e) != null)
      {
        b.b(this.e).d();
        b.a(this.e, null);
      }
      AppMethodBeat.o(66827);
    }
    while (true)
    {
      return;
      if (b.b(this.e) == null)
      {
        if ((b.c(this.e) <= 0) || (b.d(this.e) <= 0))
        {
          TXCLog.e("TXCFilterDrawer", "output Width and Height is error!");
          AppMethodBeat.o(66827);
        }
        else
        {
          b.a(this.e, new v());
          b.b(this.e).a(true);
          if (!b.b(this.e).a())
          {
            TXCLog.e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
            b.b(this.e).d();
            b.a(this.e, null);
            AppMethodBeat.o(66827);
          }
          else
          {
            b.b(this.e).a(b.c(this.e), b.d(this.e));
          }
        }
      }
      else
      {
        b.b(this.e).c(true);
        b.b(this.e).a(this.a, this.b, this.c, this.d);
        AppMethodBeat.o(66827);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.7
 * JD-Core Version:    0.6.2
 */