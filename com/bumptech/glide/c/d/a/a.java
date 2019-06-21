package com.bumptech.glide.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.k;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a<DataType>
  implements k<DataType, BitmapDrawable>
{
  private final Resources aEH;
  private final k<DataType, Bitmap> aES;

  public a(Resources paramResources, k<DataType, Bitmap> paramk)
  {
    AppMethodBeat.i(92179);
    this.aEH = ((Resources)i.d(paramResources, "Argument must not be null"));
    this.aES = ((k)i.d(paramk, "Argument must not be null"));
    AppMethodBeat.o(92179);
  }

  public final u<BitmapDrawable> a(DataType paramDataType, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92181);
    paramDataType = this.aES.a(paramDataType, paramInt1, paramInt2, paramj);
    paramDataType = l.a(this.aEH, paramDataType);
    AppMethodBeat.o(92181);
    return paramDataType;
  }

  public final boolean a(DataType paramDataType, j paramj)
  {
    AppMethodBeat.i(92180);
    boolean bool = this.aES.a(paramDataType, paramj);
    AppMethodBeat.o(92180);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.a
 * JD-Core Version:    0.6.2
 */