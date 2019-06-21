package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ap$a
{
  String cNS;
  String id;
  String qMS;
  String qMT;
  int type;

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(36612);
    boolean bool;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((this.id.equals(paramObject.id)) && (this.type == paramObject.type))
      {
        bool = true;
        AppMethodBeat.o(36612);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36612);
      continue;
      bool = super.equals(paramObject);
      AppMethodBeat.o(36612);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ap.a
 * JD-Core Version:    0.6.2
 */