package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cbv extends com.tencent.mm.bt.a
{
  public float bEJ;
  public int rkk;
  public float xbk;
  public float xbl;
  public float xbm;
  public float xbn;
  public int xbo;
  public long xbp;
  public long xbq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94602);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.r(1, this.xbk);
      paramArrayOfObject.r(2, this.xbl);
      paramArrayOfObject.r(3, this.xbm);
      paramArrayOfObject.r(4, this.xbn);
      paramArrayOfObject.iz(5, this.xbo);
      paramArrayOfObject.ai(6, this.xbp);
      paramArrayOfObject.ai(7, this.xbq);
      paramArrayOfObject.r(8, this.bEJ);
      paramArrayOfObject.iz(9, this.rkk);
      AppMethodBeat.o(94602);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 4 + 0 + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.b.b.a.bs(5, this.xbo) + e.a.a.b.b.a.o(6, this.xbp) + e.a.a.b.b.a.o(7, this.xbq) + (e.a.a.b.b.a.fv(8) + 4) + e.a.a.b.b.a.bs(9, this.rkk);
        AppMethodBeat.o(94602);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94602);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cbv localcbv = (cbv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94602);
          break;
        case 1:
          localcbv.xbk = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 2:
          localcbv.xbl = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 3:
          localcbv.xbm = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 4:
          localcbv.xbn = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 5:
          localcbv.xbo = locala.BTU.vd();
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 6:
          localcbv.xbp = locala.BTU.ve();
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 7:
          localcbv.xbq = locala.BTU.ve();
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 8:
          localcbv.bEJ = Float.intBitsToFloat(locala.BTU.eia());
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        case 9:
          localcbv.rkk = locala.BTU.vd();
          AppMethodBeat.o(94602);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94602);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cbv
 * JD-Core Version:    0.6.2
 */