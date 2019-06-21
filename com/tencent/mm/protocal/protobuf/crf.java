package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crf extends com.tencent.mm.bt.a
{
  public boolean xoO;
  public String xoP;
  public String xoQ;
  public int xoR;
  public int xoS;
  public int xoT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102416);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.xoO);
      if (this.xoP != null)
        paramArrayOfObject.e(2, this.xoP);
      if (this.xoQ != null)
        paramArrayOfObject.e(3, this.xoQ);
      paramArrayOfObject.iz(4, this.xoR);
      paramArrayOfObject.iz(5, this.xoS);
      paramArrayOfObject.iz(6, this.xoT);
      AppMethodBeat.o(102416);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0;
        paramInt = i;
        if (this.xoP != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xoP);
        i = paramInt;
        if (this.xoQ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xoQ);
        paramInt = i + e.a.a.b.b.a.bs(4, this.xoR) + e.a.a.b.b.a.bs(5, this.xoS) + e.a.a.b.b.a.bs(6, this.xoT);
        AppMethodBeat.o(102416);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102416);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crf localcrf = (crf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102416);
          break;
        case 1:
          localcrf.xoO = locala.BTU.ehX();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        case 2:
          localcrf.xoP = locala.BTU.readString();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        case 3:
          localcrf.xoQ = locala.BTU.readString();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        case 4:
          localcrf.xoR = locala.BTU.vd();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        case 5:
          localcrf.xoS = locala.BTU.vd();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        case 6:
          localcrf.xoT = locala.BTU.vd();
          AppMethodBeat.o(102416);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(102416);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crf
 * JD-Core Version:    0.6.2
 */