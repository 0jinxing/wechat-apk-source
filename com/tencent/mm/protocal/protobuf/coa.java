package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class coa extends com.tencent.mm.bt.a
{
  public int vHo;
  public int vHp;
  public int vHq;
  public int vHr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28701);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vHo);
      paramArrayOfObject.iz(2, this.vHp);
      paramArrayOfObject.iz(3, this.vHq);
      paramArrayOfObject.iz(4, this.vHr);
      AppMethodBeat.o(28701);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vHo) + 0 + e.a.a.b.b.a.bs(2, this.vHp) + e.a.a.b.b.a.bs(3, this.vHq) + e.a.a.b.b.a.bs(4, this.vHr);
        AppMethodBeat.o(28701);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28701);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        coa localcoa = (coa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28701);
          break;
        case 1:
          localcoa.vHo = locala.BTU.vd();
          AppMethodBeat.o(28701);
          paramInt = 0;
          break;
        case 2:
          localcoa.vHp = locala.BTU.vd();
          AppMethodBeat.o(28701);
          paramInt = 0;
          break;
        case 3:
          localcoa.vHq = locala.BTU.vd();
          AppMethodBeat.o(28701);
          paramInt = 0;
          break;
        case 4:
          localcoa.vHr = locala.BTU.vd();
          AppMethodBeat.o(28701);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28701);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.coa
 * JD-Core Version:    0.6.2
 */