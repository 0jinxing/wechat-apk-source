package com.tencent.liteav.basic.e;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;

class g$2
  implements Runnable
{
  g$2(g paramg, int paramInt, float[] paramArrayOfFloat)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66227);
    GLES20.glUniform2fv(this.a, 1, FloatBuffer.wrap(this.b));
    AppMethodBeat.o(66227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.g.2
 * JD-Core Version:    0.6.2
 */