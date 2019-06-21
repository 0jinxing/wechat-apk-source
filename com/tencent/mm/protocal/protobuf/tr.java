package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class tr extends com.tencent.mm.bt.a
{
  public long waM;
  public int waN;
  public int waO;
  public int waP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(135597);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.waM);
      paramArrayOfObject.iz(2, this.waN);
      paramArrayOfObject.iz(3, this.waO);
      paramArrayOfObject.iz(4, this.waP);
      AppMethodBeat.o(135597);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.waM) + 0 + e.a.a.b.b.a.bs(2, this.waN) + e.a.a.b.b.a.bs(3, this.waO) + e.a.a.b.b.a.bs(4, this.waP);
        AppMethodBeat.o(135597);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135597);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        tr localtr = (tr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135597);
          break;
        case 1:
          localtr.waM = locala.BTU.ve();
          AppMethodBeat.o(135597);
          paramInt = 0;
          break;
        case 2:
          localtr.waN = locala.BTU.vd();
          AppMethodBeat.o(135597);
          paramInt = 0;
          break;
        case 3:
          localtr.waO = locala.BTU.vd();
          AppMethodBeat.o(135597);
          paramInt = 0;
          break;
        case 4:
          localtr.waP = locala.BTU.vd();
          AppMethodBeat.o(135597);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(135597);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tr
 * JD-Core Version:    0.6.2
 */