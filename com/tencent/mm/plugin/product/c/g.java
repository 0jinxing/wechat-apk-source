package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends com.tencent.mm.bt.a
{
  public String country;
  public String duc;
  public String dud;
  public String fBg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56630);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.country != null)
        paramArrayOfObject.e(1, this.country);
      if (this.duc != null)
        paramArrayOfObject.e(2, this.duc);
      if (this.dud != null)
        paramArrayOfObject.e(3, this.dud);
      if (this.fBg != null)
        paramArrayOfObject.e(4, this.fBg);
      AppMethodBeat.o(56630);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.country == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.country) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.duc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.duc);
      paramInt = i;
      if (this.dud != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.dud);
      i = paramInt;
      if (this.fBg != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.fBg);
      AppMethodBeat.o(56630);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56630);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56630);
          break;
        case 1:
          localg.country = locala.BTU.readString();
          AppMethodBeat.o(56630);
          paramInt = i;
          break;
        case 2:
          localg.duc = locala.BTU.readString();
          AppMethodBeat.o(56630);
          paramInt = i;
          break;
        case 3:
          localg.dud = locala.BTU.readString();
          AppMethodBeat.o(56630);
          paramInt = i;
          break;
        case 4:
          localg.fBg = locala.BTU.readString();
          AppMethodBeat.o(56630);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56630);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.g
 * JD-Core Version:    0.6.2
 */