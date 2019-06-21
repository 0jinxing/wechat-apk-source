package com.bumptech.glide.c.c;

import com.bumptech.glide.c.j;
import com.bumptech.glide.g.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e<Model, Data>
  implements n<Model, Data>
{
  private final a<Data> aDS;

  public e(a<Data> parama)
  {
    this.aDS = parama;
  }

  public final boolean X(Model paramModel)
  {
    AppMethodBeat.i(92056);
    boolean bool = paramModel.toString().startsWith("data:image");
    AppMethodBeat.o(92056);
    return bool;
  }

  public final n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92055);
    paramModel = new n.a(new b(paramModel), new e.b(paramModel.toString(), this.aDS));
    AppMethodBeat.o(92055);
    return paramModel;
  }

  public static abstract interface a<Data>
  {
    public abstract void R(Data paramData);

    public abstract Data aa(String paramString);

    public abstract Class<Data> mg();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.e
 * JD-Core Version:    0.6.2
 */