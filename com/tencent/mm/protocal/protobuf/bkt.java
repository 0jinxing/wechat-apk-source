package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bkt extends com.tencent.mm.bt.a
{
  public float vRp;
  public float vRq;
  public int wfG;
  public String wfH;
  public String wfI;
  public int wfJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80155);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.vRp);
      paramArrayOfObject.r(2, this.vRq);
      paramArrayOfObject.iz(3, this.wfG);
      if (this.wfH != null)
        paramArrayOfObject.e(4, this.wfH);
      if (this.wfI != null)
        paramArrayOfObject.e(5, this.wfI);
      paramArrayOfObject.iz(6, this.wfJ);
      AppMethodBeat.o(80155);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4) + e.a.a.b.b.a.bs(3, this.wfG);
        paramInt = i;
        if (this.wfH != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wfH);
        i = paramInt;
        if (this.wfI != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wfI);
        paramInt = i + e.a.a.b.b.a.bs(6, this.wfJ);
        AppMethodBeat.o(80155);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80155);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bkt localbkt = (bkt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80155);
          break;
        case 1:
          localbkt.vRp = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        case 2:
          localbkt.vRq = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        case 3:
          localbkt.wfG = locala.BTU.vd();
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        case 4:
          localbkt.wfH = locala.BTU.readString();
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        case 5:
          localbkt.wfI = locala.BTU.readString();
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        case 6:
          localbkt.wfJ = locala.BTU.vd();
          AppMethodBeat.o(80155);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80155);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkt
 * JD-Core Version:    0.6.2
 */