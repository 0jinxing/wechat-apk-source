package com.tencent.magicbrush.handler.image;

import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$e$a
  implements IMBImageHandler.a
{
  public final void ag(Object paramObject)
  {
    AppMethodBeat.i(115968);
    if (paramObject != null)
      ((IBitmap)paramObject).recycle();
    AppMethodBeat.o(115968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.a.e.a
 * JD-Core Version:    0.6.2
 */