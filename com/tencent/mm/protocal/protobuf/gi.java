package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gi extends com.tencent.mm.bt.a
{
  public int jBT;
  public String ptA;
  public long vIA;
  public double vIB;
  public int vIC;
  public long vIs;
  public String vIt;
  public int vIu;
  public long vIv;
  public int vIw;
  public long vIx;
  public long vIy;
  public int vIz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(54936);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vIs);
      if (this.ptA != null)
        paramArrayOfObject.e(2, this.ptA);
      if (this.vIt != null)
        paramArrayOfObject.e(3, this.vIt);
      paramArrayOfObject.iz(4, this.vIu);
      paramArrayOfObject.ai(5, this.vIv);
      paramArrayOfObject.iz(6, this.vIw);
      paramArrayOfObject.iz(7, this.jBT);
      paramArrayOfObject.ai(8, this.vIx);
      paramArrayOfObject.ai(9, this.vIy);
      paramArrayOfObject.iz(10, this.vIz);
      paramArrayOfObject.ai(11, this.vIA);
      paramArrayOfObject.f(12, this.vIB);
      paramArrayOfObject.iz(13, this.vIC);
      AppMethodBeat.o(54936);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vIs) + 0;
        paramInt = i;
        if (this.ptA != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.ptA);
        i = paramInt;
        if (this.vIt != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vIt);
        paramInt = i + e.a.a.b.b.a.bs(4, this.vIu) + e.a.a.b.b.a.o(5, this.vIv) + e.a.a.b.b.a.bs(6, this.vIw) + e.a.a.b.b.a.bs(7, this.jBT) + e.a.a.b.b.a.o(8, this.vIx) + e.a.a.b.b.a.o(9, this.vIy) + e.a.a.b.b.a.bs(10, this.vIz) + e.a.a.b.b.a.o(11, this.vIA) + (e.a.a.b.b.a.fv(12) + 8) + e.a.a.b.b.a.bs(13, this.vIC);
        AppMethodBeat.o(54936);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(54936);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gi localgi = (gi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(54936);
          break;
        case 1:
          localgi.vIs = locala.BTU.ve();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 2:
          localgi.ptA = locala.BTU.readString();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 3:
          localgi.vIt = locala.BTU.readString();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 4:
          localgi.vIu = locala.BTU.vd();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 5:
          localgi.vIv = locala.BTU.ve();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 6:
          localgi.vIw = locala.BTU.vd();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 7:
          localgi.jBT = locala.BTU.vd();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 8:
          localgi.vIx = locala.BTU.ve();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 9:
          localgi.vIy = locala.BTU.ve();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 10:
          localgi.vIz = locala.BTU.vd();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 11:
          localgi.vIA = locala.BTU.ve();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 12:
          localgi.vIB = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        case 13:
          localgi.vIC = locala.BTU.vd();
          AppMethodBeat.o(54936);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(54936);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gi
 * JD-Core Version:    0.6.2
 */