package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class asp extends com.tencent.mm.bt.a
{
  public long wwg;
  public int wwh;
  public long wwi;
  public int wwj;
  public long wwk;
  public int wwl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5217);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.wwg);
      paramArrayOfObject.iz(2, this.wwh);
      paramArrayOfObject.ai(3, this.wwi);
      paramArrayOfObject.iz(4, this.wwj);
      paramArrayOfObject.ai(5, this.wwk);
      paramArrayOfObject.iz(6, this.wwl);
      AppMethodBeat.o(5217);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.wwg) + 0 + e.a.a.b.b.a.bs(2, this.wwh) + e.a.a.b.b.a.o(3, this.wwi) + e.a.a.b.b.a.bs(4, this.wwj) + e.a.a.b.b.a.o(5, this.wwk) + e.a.a.b.b.a.bs(6, this.wwl);
        AppMethodBeat.o(5217);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5217);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asp localasp = (asp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5217);
          break;
        case 1:
          localasp.wwg = locala.BTU.ve();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        case 2:
          localasp.wwh = locala.BTU.vd();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        case 3:
          localasp.wwi = locala.BTU.ve();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        case 4:
          localasp.wwj = locala.BTU.vd();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        case 5:
          localasp.wwk = locala.BTU.ve();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        case 6:
          localasp.wwl = locala.BTU.vd();
          AppMethodBeat.o(5217);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asp
 * JD-Core Version:    0.6.2
 */