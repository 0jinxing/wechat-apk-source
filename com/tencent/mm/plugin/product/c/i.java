package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i extends com.tencent.mm.bt.a
{
  public String name;
  public String value;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56632);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      if (this.value != null)
        paramArrayOfObject.e(2, this.value);
      AppMethodBeat.o(56632);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.value != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.value);
      AppMethodBeat.o(56632);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56632);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        i locali = (i)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56632);
          paramInt = -1;
          break;
        case 1:
          locali.name = locala.BTU.readString();
          AppMethodBeat.o(56632);
          paramInt = i;
          break;
        case 2:
          locali.value = locala.BTU.readString();
          AppMethodBeat.o(56632);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56632);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.i
 * JD-Core Version:    0.6.2
 */