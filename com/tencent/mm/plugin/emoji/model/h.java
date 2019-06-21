package com.tencent.mm.plugin.emoji.model;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;

public final class h
  implements i
{
  public i kVz;

  public h(i parami)
  {
    this.kVz = parami;
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53053);
    if (this.kVz != null)
      this.kVz.a(paramString, paramView, paramBitmap, paramArrayOfObject);
    AppMethodBeat.o(53053);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.h
 * JD-Core Version:    0.6.2
 */