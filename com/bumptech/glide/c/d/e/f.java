package com.bumptech.glide.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.d.a.d;
import com.bumptech.glide.c.m;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class f
  implements m<c>
{
  private final m<Bitmap> aFv;

  public f(m<Bitmap> paramm)
  {
    AppMethodBeat.i(92337);
    this.aFv = ((m)i.d(paramm, "Argument must not be null"));
    AppMethodBeat.o(92337);
  }

  public final u<c> a(Context paramContext, u<c> paramu, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92338);
    c localc = (c)paramu.get();
    Object localObject = com.bumptech.glide.c.ae(paramContext).awf;
    localObject = new d(localc.ny(), (e)localObject);
    paramContext = this.aFv.a(paramContext, (u)localObject, paramInt1, paramInt2);
    if (!localObject.equals(paramContext))
      ((u)localObject).recycle();
    paramContext = (Bitmap)paramContext.get();
    localObject = this.aFv;
    localc.aFU.aGa.a((m)localObject, paramContext);
    AppMethodBeat.o(92338);
    return paramu;
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(92341);
    this.aFv.a(paramMessageDigest);
    AppMethodBeat.o(92341);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(92339);
    boolean bool;
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      bool = this.aFv.equals(paramObject.aFv);
      AppMethodBeat.o(92339);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92339);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92340);
    int i = this.aFv.hashCode();
    AppMethodBeat.o(92340);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.f
 * JD-Core Version:    0.6.2
 */