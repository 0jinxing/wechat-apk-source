package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbs extends com.tencent.mm.bt.a
{
  public String jBB;
  public int pXD;
  public String vEf;
  public int wGd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5597);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEf != null)
        paramArrayOfObject.e(1, this.vEf);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.wGd);
      paramArrayOfObject.iz(4, this.pXD);
      AppMethodBeat.o(5597);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEf == null)
        break label394;
    label394: for (paramInt = e.a.a.b.b.a.f(1, this.vEf) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wGd) + e.a.a.b.b.a.bs(4, this.pXD);
      AppMethodBeat.o(5597);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5597);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbs localbbs = (bbs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5597);
          break;
        case 1:
          localbbs.vEf = locala.BTU.readString();
          AppMethodBeat.o(5597);
          paramInt = i;
          break;
        case 2:
          localbbs.jBB = locala.BTU.readString();
          AppMethodBeat.o(5597);
          paramInt = i;
          break;
        case 3:
          localbbs.wGd = locala.BTU.vd();
          AppMethodBeat.o(5597);
          paramInt = i;
          break;
        case 4:
          localbbs.pXD = locala.BTU.vd();
          AppMethodBeat.o(5597);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5597);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbs
 * JD-Core Version:    0.6.2
 */