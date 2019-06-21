package com.bumptech.glide.c.c;

import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.j;
import com.bumptech.glide.g;
import com.bumptech.glide.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v<Model>
  implements n<Model, Model>
{
  private static final v<?> aEI;

  static
  {
    AppMethodBeat.i(92144);
    aEI = new v();
    AppMethodBeat.o(92144);
  }

  public static <T> v<T> nk()
  {
    return aEI;
  }

  public final boolean X(Model paramModel)
  {
    return true;
  }

  public final n.a<Model> b(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92143);
    paramModel = new n.a(new b(paramModel), new b(paramModel));
    AppMethodBeat.o(92143);
    return paramModel;
  }

  static final class b<Model>
    implements d<Model>
  {
    private final Model aEK;

    b(Model paramModel)
    {
      this.aEK = paramModel;
    }

    public final void a(g paramg, d.a<? super Model> parama)
    {
      AppMethodBeat.i(92141);
      parama.S(this.aEK);
      AppMethodBeat.o(92141);
    }

    public final void cancel()
    {
    }

    public final void cleanup()
    {
    }

    public final Class<Model> mg()
    {
      AppMethodBeat.i(92142);
      Class localClass = this.aEK.getClass();
      AppMethodBeat.o(92142);
      return localClass;
    }

    public final a mh()
    {
      return a.ayD;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.v
 * JD-Core Version:    0.6.2
 */