package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p extends com.tencent.mm.bt.a
{
  public String fjD;
  public int id;
  public String name;
  public String tmN;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56659);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      if (this.tmN != null)
        paramArrayOfObject.e(4, this.tmN);
      if (this.fjD != null)
        paramArrayOfObject.e(5, this.fjD);
      AppMethodBeat.o(56659);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.name);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.url);
        paramInt = i;
        if (this.tmN != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.tmN);
        i = paramInt;
        if (this.fjD != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.fjD);
        AppMethodBeat.o(56659);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56659);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56659);
          break;
        case 1:
          localp.id = locala.BTU.vd();
          AppMethodBeat.o(56659);
          paramInt = 0;
          break;
        case 2:
          localp.name = locala.BTU.readString();
          AppMethodBeat.o(56659);
          paramInt = 0;
          break;
        case 3:
          localp.url = locala.BTU.readString();
          AppMethodBeat.o(56659);
          paramInt = 0;
          break;
        case 4:
          localp.tmN = locala.BTU.readString();
          AppMethodBeat.o(56659);
          paramInt = 0;
          break;
        case 5:
          localp.fjD = locala.BTU.readString();
          AppMethodBeat.o(56659);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56659);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.p
 * JD-Core Version:    0.6.2
 */