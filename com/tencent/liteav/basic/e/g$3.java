package com.tencent.liteav.basic.e;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;

class g$3
  implements Runnable
{
  g$3(g paramg, int paramInt, float[] paramArrayOfFloat)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66179);
    GLES20.glUniform3fv(this.a, 1, FloatBuffer.wrap(this.b));
    AppMethodBeat.o(66179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.g.3
 * JD-Core Version:    0.6.2
 */