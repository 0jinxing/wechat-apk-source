package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atn extends com.tencent.mm.bt.a
{
  public String wxE;
  public String wxF;
  public int wxG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58908);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wxE != null)
        paramArrayOfObject.e(1, this.wxE);
      if (this.wxF != null)
        paramArrayOfObject.e(2, this.wxF);
      paramArrayOfObject.iz(3, this.wxG);
      AppMethodBeat.o(58908);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wxE == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wxE) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wxF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wxF);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wxG);
      AppMethodBeat.o(58908);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58908);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atn localatn = (atn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58908);
          break;
        case 1:
          localatn.wxE = locala.BTU.readString();
          AppMethodBeat.o(58908);
          paramInt = i;
          break;
        case 2:
          localatn.wxF = locala.BTU.readString();
          AppMethodBeat.o(58908);
          paramInt = i;
          break;
        case 3:
          localatn.wxG = locala.BTU.vd();
          AppMethodBeat.o(58908);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58908);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atn
 * JD-Core Version:    0.6.2
 */