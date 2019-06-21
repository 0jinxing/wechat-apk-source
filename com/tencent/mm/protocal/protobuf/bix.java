package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bix extends com.tencent.mm.bt.a
{
  public String csB;
  public String kbV;
  public String vTT;
  public int wMn;
  public String wMo;
  public String wMp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56884);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      paramArrayOfObject.iz(2, this.wMn);
      if (this.wMo != null)
        paramArrayOfObject.e(3, this.wMo);
      if (this.wMp != null)
        paramArrayOfObject.e(4, this.wMp);
      if (this.vTT != null)
        paramArrayOfObject.e(5, this.vTT);
      if (this.kbV != null)
        paramArrayOfObject.e(6, this.kbV);
      AppMethodBeat.o(56884);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label530;
    label530: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wMn);
      i = paramInt;
      if (this.wMo != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wMo);
      paramInt = i;
      if (this.wMp != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wMp);
      i = paramInt;
      if (this.vTT != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vTT);
      paramInt = i;
      if (this.kbV != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.kbV);
      AppMethodBeat.o(56884);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56884);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bix localbix = (bix)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56884);
          break;
        case 1:
          localbix.csB = locala.BTU.readString();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        case 2:
          localbix.wMn = locala.BTU.vd();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        case 3:
          localbix.wMo = locala.BTU.readString();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        case 4:
          localbix.wMp = locala.BTU.readString();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        case 5:
          localbix.vTT = locala.BTU.readString();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        case 6:
          localbix.kbV = locala.BTU.readString();
          AppMethodBeat.o(56884);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56884);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bix
 * JD-Core Version:    0.6.2
 */