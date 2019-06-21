package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bfe extends com.tencent.mm.bt.a
{
  public int kaG;
  public int mXP;
  public String vNN;
  public int wIV;
  public int wIW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14737);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNN != null)
        paramArrayOfObject.e(1, this.vNN);
      paramArrayOfObject.iz(2, this.wIV);
      paramArrayOfObject.iz(3, this.mXP);
      paramArrayOfObject.iz(4, this.wIW);
      paramArrayOfObject.iz(5, this.kaG);
      AppMethodBeat.o(14737);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNN == null)
        break label422;
    label422: for (paramInt = e.a.a.b.b.a.f(1, this.vNN) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wIV) + e.a.a.b.b.a.bs(3, this.mXP) + e.a.a.b.b.a.bs(4, this.wIW) + e.a.a.b.b.a.bs(5, this.kaG);
      AppMethodBeat.o(14737);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14737);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bfe localbfe = (bfe)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14737);
          break;
        case 1:
          localbfe.vNN = locala.BTU.readString();
          AppMethodBeat.o(14737);
          paramInt = i;
          break;
        case 2:
          localbfe.wIV = locala.BTU.vd();
          AppMethodBeat.o(14737);
          paramInt = i;
          break;
        case 3:
          localbfe.mXP = locala.BTU.vd();
          AppMethodBeat.o(14737);
          paramInt = i;
          break;
        case 4:
          localbfe.wIW = locala.BTU.vd();
          AppMethodBeat.o(14737);
          paramInt = i;
          break;
        case 5:
          localbfe.kaG = locala.BTU.vd();
          AppMethodBeat.o(14737);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14737);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfe
 * JD-Core Version:    0.6.2
 */