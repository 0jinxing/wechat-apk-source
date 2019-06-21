package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$c
{
  public int code;
  public String id;
  public int qIJ;
  public boolean qIK;

  public g$c(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.id = paramString;
    this.code = paramInt1;
    this.qIJ = paramInt2;
    this.qIK = paramBoolean;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(36156);
    boolean bool;
    if ((paramObject != null) && (paramObject.hashCode() == this.code))
    {
      bool = true;
      AppMethodBeat.o(36156);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36156);
    }
  }

  public final int hashCode()
  {
    return this.code;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.c
 * JD-Core Version:    0.6.2
 */