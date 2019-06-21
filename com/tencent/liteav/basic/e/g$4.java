package com.tencent.liteav.basic.e;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;

class g$4
  implements Runnable
{
  g$4(g paramg, int paramInt, float[] paramArrayOfFloat)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66187);
    GLES20.glUniform4fv(this.a, 1, FloatBuffer.wrap(this.b));
    AppMethodBeat.o(66187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.g.4
 * JD-Core Version:    0.6.2
 */