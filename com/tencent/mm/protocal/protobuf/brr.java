package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class brr extends com.tencent.mm.bt.a
{
  public String jCg;
  public int qBF;
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOz;
  public int wTR;
  public int wTS;
  public String wTT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96283);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCg != null)
        paramArrayOfObject.e(1, this.jCg);
      paramArrayOfObject.iz(2, this.wTR);
      if (this.vOz != null)
        paramArrayOfObject.e(3, this.vOz);
      if (this.vOA != null)
        paramArrayOfObject.e(4, this.vOA);
      paramArrayOfObject.iz(5, this.qBF);
      paramArrayOfObject.iz(6, this.wTS);
      if (this.vOB != null)
        paramArrayOfObject.e(7, this.vOB);
      if (this.vOC != null)
        paramArrayOfObject.e(8, this.vOC);
      if (this.wTT != null)
        paramArrayOfObject.e(9, this.wTT);
      AppMethodBeat.o(96283);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCg == null)
        break label691;
    label691: for (paramInt = e.a.a.b.b.a.f(1, this.jCg) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wTR);
      paramInt = i;
      if (this.vOz != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vOz);
      i = paramInt;
      if (this.vOA != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vOA);
      paramInt = i + e.a.a.b.b.a.bs(5, this.qBF) + e.a.a.b.b.a.bs(6, this.wTS);
      i = paramInt;
      if (this.vOB != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vOB);
      paramInt = i;
      if (this.vOC != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vOC);
      i = paramInt;
      if (this.wTT != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wTT);
      AppMethodBeat.o(96283);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96283);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        brr localbrr = (brr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96283);
          break;
        case 1:
          localbrr.jCg = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 2:
          localbrr.wTR = locala.BTU.vd();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 3:
          localbrr.vOz = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 4:
          localbrr.vOA = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 5:
          localbrr.qBF = locala.BTU.vd();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 6:
          localbrr.wTS = locala.BTU.vd();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 7:
          localbrr.vOB = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 8:
          localbrr.vOC = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        case 9:
          localbrr.wTT = locala.BTU.readString();
          AppMethodBeat.o(96283);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96283);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brr
 * JD-Core Version:    0.6.2
 */