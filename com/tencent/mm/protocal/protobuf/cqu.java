package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cqu extends com.tencent.mm.bt.a
{
  public String wbe;
  public String xoA;
  public String xoB;
  public int xoC;
  public float xoD;
  public float xoE;
  public String xoF;
  public String xoz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102402);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoz != null)
        paramArrayOfObject.e(1, this.xoz);
      if (this.wbe != null)
        paramArrayOfObject.e(2, this.wbe);
      if (this.xoA != null)
        paramArrayOfObject.e(3, this.xoA);
      if (this.xoB != null)
        paramArrayOfObject.e(4, this.xoB);
      paramArrayOfObject.iz(5, this.xoC);
      paramArrayOfObject.r(6, this.xoD);
      paramArrayOfObject.r(7, this.xoE);
      if (this.xoF != null)
        paramArrayOfObject.e(8, this.xoF);
      AppMethodBeat.o(102402);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xoz == null)
        break label626;
    label626: for (i = e.a.a.b.b.a.f(1, this.xoz) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wbe != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wbe);
      i = paramInt;
      if (this.xoA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xoA);
      paramInt = i;
      if (this.xoB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xoB);
      i = paramInt + e.a.a.b.b.a.bs(5, this.xoC) + (e.a.a.b.b.a.fv(6) + 4) + (e.a.a.b.b.a.fv(7) + 4);
      paramInt = i;
      if (this.xoF != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xoF);
      AppMethodBeat.o(102402);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102402);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqu localcqu = (cqu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102402);
          break;
        case 1:
          localcqu.xoz = locala.BTU.readString();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 2:
          localcqu.wbe = locala.BTU.readString();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 3:
          localcqu.xoA = locala.BTU.readString();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 4:
          localcqu.xoB = locala.BTU.readString();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 5:
          localcqu.xoC = locala.BTU.vd();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 6:
          localcqu.xoD = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 7:
          localcqu.xoE = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        case 8:
          localcqu.xoF = locala.BTU.readString();
          AppMethodBeat.o(102402);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102402);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqu
 * JD-Core Version:    0.6.2
 */