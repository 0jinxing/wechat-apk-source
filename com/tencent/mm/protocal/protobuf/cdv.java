package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cdv extends com.tencent.mm.bt.a
{
  public String ThumbUrl;
  public String ncM;
  public String ndF;
  public String ndG;
  public int pcX;
  public long vQE;
  public int wZF;
  public int wZG;
  public int wZH;
  public int wZL;
  public int xdA;
  public int xdB;
  public int xdC;
  public String xdy;
  public String xdz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56503);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vQE);
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      if (this.xdy != null)
        paramArrayOfObject.e(4, this.xdy);
      if (this.xdz != null)
        paramArrayOfObject.e(5, this.xdz);
      paramArrayOfObject.iz(6, this.pcX);
      if (this.ncM != null)
        paramArrayOfObject.e(7, this.ncM);
      paramArrayOfObject.iz(8, this.xdA);
      paramArrayOfObject.iz(9, this.wZL);
      paramArrayOfObject.iz(10, this.wZF);
      paramArrayOfObject.iz(11, this.wZG);
      paramArrayOfObject.iz(12, this.wZH);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(13, this.ThumbUrl);
      paramArrayOfObject.iz(14, this.xdB);
      paramArrayOfObject.iz(15, this.xdC);
      AppMethodBeat.o(56503);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vQE) + 0;
        paramInt = i;
        if (this.ndG != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ndG);
        i = paramInt;
        if (this.ndF != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ndF);
        paramInt = i;
        if (this.xdy != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.xdy);
        i = paramInt;
        if (this.xdz != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.xdz);
        i += e.a.a.b.b.a.bs(6, this.pcX);
        paramInt = i;
        if (this.ncM != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.ncM);
        i = paramInt + e.a.a.b.b.a.bs(8, this.xdA) + e.a.a.b.b.a.bs(9, this.wZL) + e.a.a.b.b.a.bs(10, this.wZF) + e.a.a.b.b.a.bs(11, this.wZG) + e.a.a.b.b.a.bs(12, this.wZH);
        paramInt = i;
        if (this.ThumbUrl != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.ThumbUrl);
        paramInt = paramInt + e.a.a.b.b.a.bs(14, this.xdB) + e.a.a.b.b.a.bs(15, this.xdC);
        AppMethodBeat.o(56503);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56503);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdv localcdv = (cdv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56503);
          break;
        case 1:
          localcdv.vQE = locala.BTU.ve();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 2:
          localcdv.ndG = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 3:
          localcdv.ndF = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 4:
          localcdv.xdy = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 5:
          localcdv.xdz = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 6:
          localcdv.pcX = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 7:
          localcdv.ncM = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 8:
          localcdv.xdA = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 9:
          localcdv.wZL = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 10:
          localcdv.wZF = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 11:
          localcdv.wZG = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 12:
          localcdv.wZH = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 13:
          localcdv.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 14:
          localcdv.xdB = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        case 15:
          localcdv.xdC = locala.BTU.vd();
          AppMethodBeat.o(56503);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56503);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdv
 * JD-Core Version:    0.6.2
 */