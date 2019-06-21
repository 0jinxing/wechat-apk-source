package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class as extends com.tencent.mm.bt.a
{
  public String content;
  public int erD;
  public String iconUrl;
  public int nZn;
  public int nZo;
  public String name;
  public String type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56616);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.erD);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.type != null)
        paramArrayOfObject.e(3, this.type);
      if (this.content != null)
        paramArrayOfObject.e(4, this.content);
      paramArrayOfObject.iz(5, this.nZn);
      if (this.iconUrl != null)
        paramArrayOfObject.e(6, this.iconUrl);
      paramArrayOfObject.iz(7, this.nZo);
      AppMethodBeat.o(56616);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.erD) + 0;
        int i = paramInt;
        if (this.name != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.name);
        paramInt = i;
        if (this.type != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.type);
        i = paramInt;
        if (this.content != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.content);
        i += e.a.a.b.b.a.bs(5, this.nZn);
        paramInt = i;
        if (this.iconUrl != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.iconUrl);
        paramInt += e.a.a.b.b.a.bs(7, this.nZo);
        AppMethodBeat.o(56616);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56616);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        as localas = (as)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56616);
          break;
        case 1:
          localas.erD = locala.BTU.vd();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 2:
          localas.name = locala.BTU.readString();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 3:
          localas.type = locala.BTU.readString();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 4:
          localas.content = locala.BTU.readString();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 5:
          localas.nZn = locala.BTU.vd();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 6:
          localas.iconUrl = locala.BTU.readString();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        case 7:
          localas.nZo = locala.BTU.vd();
          AppMethodBeat.o(56616);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56616);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.as
 * JD-Core Version:    0.6.2
 */