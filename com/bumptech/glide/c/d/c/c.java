package com.bumptech.glide.c.d.c;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.c.b.u;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c extends b<Drawable>
{
  private c(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  static u<Drawable> p(Drawable paramDrawable)
  {
    AppMethodBeat.i(92287);
    if (paramDrawable != null)
    {
      paramDrawable = new c(paramDrawable);
      AppMethodBeat.o(92287);
    }
    while (true)
    {
      return paramDrawable;
      paramDrawable = null;
      AppMethodBeat.o(92287);
    }
  }

  public final int getSize()
  {
    AppMethodBeat.i(92289);
    int i = Math.max(1, this.drawable.getIntrinsicWidth() * this.drawable.getIntrinsicHeight() * 4);
    AppMethodBeat.o(92289);
    return i;
  }

  public final Class<Drawable> mK()
  {
    AppMethodBeat.i(92288);
    Class localClass = this.drawable.getClass();
    AppMethodBeat.o(92288);
    return localClass;
  }

  public final void recycle()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.c.c
 * JD-Core Version:    0.6.2
 */