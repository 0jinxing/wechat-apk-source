package com.tencent.liteav.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.liteav.basic.e.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

class TXCGLSurfaceView$4
  implements Runnable
{
  TXCGLSurfaceView$4(TXCGLSurfaceView paramTXCGLSurfaceView, ByteBuffer paramByteBuffer, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67356);
    this.a.position(0);
    this.b.copyPixelsFromBuffer(this.a);
    Object localObject = new Matrix();
    ((Matrix)localObject).setScale(1.0F, -1.0F);
    localObject = Bitmap.createBitmap(this.b, 0, 0, this.c, this.d, (Matrix)localObject, false);
    if (TXCGLSurfaceView.b(this.e) != null)
    {
      TXCGLSurfaceView.b(this.e).onTakePhotoComplete((Bitmap)localObject);
      TXCGLSurfaceView.a(this.e, null);
    }
    this.b.recycle();
    AppMethodBeat.o(67356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceView.4
 * JD-Core Version:    0.6.2
 */