package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.bt.a
{
  public String pOz;
  public int tmM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56645);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pOz != null)
        paramArrayOfObject.e(1, this.pOz);
      paramArrayOfObject.iz(2, this.tmM);
      AppMethodBeat.o(56645);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pOz == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.pOz) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.tmM);
      AppMethodBeat.o(56645);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56645);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56645);
          paramInt = -1;
          break;
        case 1:
          locald.pOz = locala.BTU.readString();
          AppMethodBeat.o(56645);
          paramInt = i;
          break;
        case 2:
          locald.tmM = locala.BTU.vd();
          AppMethodBeat.o(56645);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56645);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.d
 * JD-Core Version:    0.6.2
 */