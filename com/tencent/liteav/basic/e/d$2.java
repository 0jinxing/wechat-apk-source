package com.tencent.liteav.basic.e;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

class d$2
  implements Runnable
{
  d$2(d paramd, ByteBuffer paramByteBuffer, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66257);
    this.a.position(0);
    this.b.copyPixelsFromBuffer(this.a);
    Object localObject = new Matrix();
    ((Matrix)localObject).setScale(1.0F, -1.0F);
    localObject = Bitmap.createBitmap(this.b, 0, 0, this.c, this.d, (Matrix)localObject, false);
    if (d.a(this.e) != null)
    {
      d.a(this.e).onTakePhotoComplete((Bitmap)localObject);
      d.a(this.e, null);
    }
    this.b.recycle();
    AppMethodBeat.o(66257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.d.2
 * JD-Core Version:    0.6.2
 */