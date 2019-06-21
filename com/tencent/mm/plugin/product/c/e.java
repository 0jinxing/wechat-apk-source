package com.tencent.mm.plugin.product.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends com.tencent.mm.bt.a
{
  public int id;
  public String name;
  public int value;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56628);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.id);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      paramArrayOfObject.iz(3, this.value);
      AppMethodBeat.o(56628);
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
        paramInt += e.a.a.b.b.a.bs(3, this.value);
        AppMethodBeat.o(56628);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56628);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56628);
          break;
        case 1:
          locale.id = locala.BTU.vd();
          AppMethodBeat.o(56628);
          paramInt = 0;
          break;
        case 2:
          locale.name = locala.BTU.readString();
          AppMethodBeat.o(56628);
          paramInt = 0;
          break;
        case 3:
          locale.value = locala.BTU.vd();
          AppMethodBeat.o(56628);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56628);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.c.e
 * JD-Core Version:    0.6.2
 */