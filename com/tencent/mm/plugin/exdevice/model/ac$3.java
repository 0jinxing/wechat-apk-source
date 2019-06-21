package com.tencent.mm.plugin.exdevice.model;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ac$3 extends ShapeDrawable.ShaderFactory
{
  ac$3(ac paramac, int[] paramArrayOfInt)
  {
  }

  public final Shader resize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(19376);
    float f = paramInt2;
    paramInt1 = this.luh[0];
    Object localObject = Shader.TileMode.REPEAT;
    localObject = new LinearGradient(0.0F, 0.0F, 0.0F, f, new int[] { 0, paramInt1 }, new float[] { 0.0F, 1.0F }, (Shader.TileMode)localObject);
    AppMethodBeat.o(19376);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ac.3
 * JD-Core Version:    0.6.2
 */