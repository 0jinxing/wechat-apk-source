package com.bumptech.glide.c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class j
  implements m<Drawable>
{
  private final m<Bitmap> aFv;
  private final boolean aFw;

  public j(m<Bitmap> paramm)
  {
    this.aFv = paramm;
    this.aFw = true;
  }

  public final u<Drawable> a(Context paramContext, u<Drawable> paramu, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92235);
    Object localObject1 = c.ae(paramContext).awf;
    Object localObject2 = (Drawable)paramu.get();
    localObject1 = i.a((e)localObject1, (Drawable)localObject2, paramInt1, paramInt2);
    if (localObject1 == null)
    {
      if (this.aFw)
      {
        paramContext = new IllegalArgumentException("Unable to convert " + localObject2 + " to a Bitmap");
        AppMethodBeat.o(92235);
        throw paramContext;
      }
      AppMethodBeat.o(92235);
    }
    while (true)
    {
      return paramu;
      localObject2 = this.aFv.a(paramContext, (u)localObject1, paramInt1, paramInt2);
      if (localObject2.equals(localObject1))
      {
        ((u)localObject2).recycle();
        AppMethodBeat.o(92235);
      }
      else
      {
        paramu = l.a(paramContext.getResources(), (u)localObject2);
        AppMethodBeat.o(92235);
      }
    }
  }

  public final void a(MessageDigest paramMessageDigest)
  {
    AppMethodBeat.i(92238);
    this.aFv.a(paramMessageDigest);
    AppMethodBeat.o(92238);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(92236);
    boolean bool;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      bool = this.aFv.equals(paramObject.aFv);
      AppMethodBeat.o(92236);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92236);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92237);
    int i = this.aFv.hashCode();
    AppMethodBeat.o(92237);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.j
 * JD-Core Version:    0.6.2
 */