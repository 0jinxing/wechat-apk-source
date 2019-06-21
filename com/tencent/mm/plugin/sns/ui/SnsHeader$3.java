package com.tencent.mm.plugin.sns.ui;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsHeader$3 extends ShapeDrawable.ShaderFactory
{
  SnsHeader$3(SnsHeader paramSnsHeader, int paramInt)
  {
  }

  public final Shader resize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38949);
    float f = paramInt2;
    paramInt1 = this.rse;
    Object localObject = Shader.TileMode.CLAMP;
    localObject = new LinearGradient(0.0F, 0.0F, 0.0F, f, new int[] { paramInt1, 0 }, new float[] { 0.0F, 1.0F }, (Shader.TileMode)localObject);
    AppMethodBeat.o(38949);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsHeader.3
 * JD-Core Version:    0.6.2
 */