package com.tencent.mm.plugin.music.ui;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a$1 extends ShapeDrawable.ShaderFactory
{
  b$a$1(b.a parama, int paramInt)
  {
  }

  public final Shader resize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105073);
    float f = paramInt2;
    paramInt1 = this.oOJ;
    Object localObject = Shader.TileMode.REPEAT;
    localObject = new LinearGradient(0.0F, 0.0F, 0.0F, f, new int[] { 0, paramInt1 }, new float[] { 0.0F, 1.0F }, (Shader.TileMode)localObject);
    AppMethodBeat.o(105073);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.b.a.1
 * JD-Core Version:    0.6.2
 */