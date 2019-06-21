package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class h$a
{
  private String cGT;
  private String id;

  public h$a(String paramString1, String paramString2)
  {
    this.cGT = paramString1;
    this.id = paramString2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(11567);
    if (paramObject.getClass() != a.class)
      AppMethodBeat.o(11567);
    while (true)
    {
      return bool;
      paramObject = (a)paramObject;
      if (((this.cGT == null) && (paramObject.cGT == null)) || ((this.cGT != null) && (this.cGT.equals(paramObject.cGT)) && (((this.id == null) && (paramObject.id == null)) || ((this.id != null) && (this.id.equals(paramObject.id))))))
      {
        bool = true;
        AppMethodBeat.o(11567);
      }
      else
      {
        AppMethodBeat.o(11567);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(11568);
    int i = this.cGT.hashCode();
    int j = this.id.hashCode();
    AppMethodBeat.o(11568);
    return i + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.h.a
 * JD-Core Version:    0.6.2
 */