package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bcd extends com.tencent.mm.bt.a
{
  public int jCt;
  public String ncF;
  public String pXM;
  public String wGI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51432);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ncF != null)
        paramArrayOfObject.e(1, this.ncF);
      if (this.wGI != null)
        paramArrayOfObject.e(2, this.wGI);
      if (this.pXM != null)
        paramArrayOfObject.e(3, this.pXM);
      paramArrayOfObject.iz(4, this.jCt);
      AppMethodBeat.o(51432);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ncF == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.ncF) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wGI != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wGI);
      i = paramInt;
      if (this.pXM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pXM);
      paramInt = i + e.a.a.b.b.a.bs(4, this.jCt);
      AppMethodBeat.o(51432);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51432);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bcd localbcd = (bcd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51432);
          break;
        case 1:
          localbcd.ncF = locala.BTU.readString();
          AppMethodBeat.o(51432);
          paramInt = i;
          break;
        case 2:
          localbcd.wGI = locala.BTU.readString();
          AppMethodBeat.o(51432);
          paramInt = i;
          break;
        case 3:
          localbcd.pXM = locala.BTU.readString();
          AppMethodBeat.o(51432);
          paramInt = i;
          break;
        case 4:
          localbcd.jCt = locala.BTU.vd();
          AppMethodBeat.o(51432);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51432);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bcd
 * JD-Core Version:    0.6.2
 */