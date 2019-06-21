package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p extends com.tencent.mm.bt.a
{
  public String mZZ;
  public String naa;
  public String nab;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111555);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZZ != null)
        paramArrayOfObject.e(1, this.mZZ);
      if (this.naa != null)
        paramArrayOfObject.e(2, this.naa);
      if (this.nab != null)
        paramArrayOfObject.e(3, this.nab);
      AppMethodBeat.o(111555);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZZ == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.mZZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.naa != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.naa);
      i = paramInt;
      if (this.nab != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nab);
      AppMethodBeat.o(111555);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111555);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111555);
          break;
        case 1:
          localp.mZZ = locala.BTU.readString();
          AppMethodBeat.o(111555);
          paramInt = i;
          break;
        case 2:
          localp.naa = locala.BTU.readString();
          AppMethodBeat.o(111555);
          paramInt = i;
          break;
        case 3:
          localp.nab = locala.BTU.readString();
          AppMethodBeat.o(111555);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111555);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.p
 * JD-Core Version:    0.6.2
 */