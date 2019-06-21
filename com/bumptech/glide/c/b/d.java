package com.bumptech.glide.c.b;

import com.bumptech.glide.c.b.b.a.b;
import com.bumptech.glide.c.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class d<DataType>
  implements a.b
{
  private final com.bumptech.glide.c.d<DataType> aAc;
  private final j aAd;
  private final DataType data;

  d(com.bumptech.glide.c.d<DataType> paramd, DataType paramDataType, j paramj)
  {
    this.aAc = paramd;
    this.data = paramDataType;
    this.aAd = paramj;
  }

  public final boolean m(File paramFile)
  {
    AppMethodBeat.i(91762);
    boolean bool = this.aAc.a(this.data, paramFile, this.aAd);
    AppMethodBeat.o(91762);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.d
 * JD-Core Version:    0.6.2
 */