package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class byx extends com.tencent.mm.bt.a
{
  public String cMC;
  public String cMD;
  public String kbU;
  public String vBu;
  public String vBv;
  public int vBw;
  public String vGv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89140);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC != null)
        paramArrayOfObject.e(1, this.cMC);
      if (this.kbU != null)
        paramArrayOfObject.e(2, this.kbU);
      if (this.cMD != null)
        paramArrayOfObject.e(3, this.cMD);
      if (this.vBu != null)
        paramArrayOfObject.e(4, this.vBu);
      if (this.vBv != null)
        paramArrayOfObject.e(5, this.vBv);
      paramArrayOfObject.iz(6, this.vBw);
      if (this.vGv != null)
        paramArrayOfObject.e(7, this.vGv);
      AppMethodBeat.o(89140);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cMC == null)
        break label593;
    label593: for (i = e.a.a.b.b.a.f(1, this.cMC) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kbU != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kbU);
      i = paramInt;
      if (this.cMD != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cMD);
      paramInt = i;
      if (this.vBu != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vBu);
      i = paramInt;
      if (this.vBv != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vBv);
      i += e.a.a.b.b.a.bs(6, this.vBw);
      paramInt = i;
      if (this.vGv != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vGv);
      AppMethodBeat.o(89140);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89140);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        byx localbyx = (byx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89140);
          break;
        case 1:
          localbyx.cMC = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 2:
          localbyx.kbU = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 3:
          localbyx.cMD = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 4:
          localbyx.vBu = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 5:
          localbyx.vBv = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 6:
          localbyx.vBw = locala.BTU.vd();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        case 7:
          localbyx.vGv = locala.BTU.readString();
          AppMethodBeat.o(89140);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89140);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byx
 * JD-Core Version:    0.6.2
 */