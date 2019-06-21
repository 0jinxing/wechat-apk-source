package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aec extends com.tencent.mm.bt.a
{
  public String fKh;
  public int jCt;
  public int vFs;
  public int wmf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96220);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.vFs);
      paramArrayOfObject.iz(4, this.wmf);
      AppMethodBeat.o(96220);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label364;
    label364: for (paramInt = e.a.a.b.b.a.f(1, this.fKh) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.vFs) + e.a.a.b.b.a.bs(4, this.wmf);
      AppMethodBeat.o(96220);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96220);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aec localaec = (aec)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96220);
          break;
        case 1:
          localaec.fKh = locala.BTU.readString();
          AppMethodBeat.o(96220);
          paramInt = i;
          break;
        case 2:
          localaec.jCt = locala.BTU.vd();
          AppMethodBeat.o(96220);
          paramInt = i;
          break;
        case 3:
          localaec.vFs = locala.BTU.vd();
          AppMethodBeat.o(96220);
          paramInt = i;
          break;
        case 4:
          localaec.wmf = locala.BTU.vd();
          AppMethodBeat.o(96220);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96220);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aec
 * JD-Core Version:    0.6.2
 */