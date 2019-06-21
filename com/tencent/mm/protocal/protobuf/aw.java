package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aw extends com.tencent.mm.bt.a
{
  public String duc;
  public String dud;
  public double latitude;
  public double longitude;
  public long vCE;
  public String vCF;
  public String vCG;
  public String vCH;
  public String vCI;
  public String vCJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56697);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.duc != null)
        paramArrayOfObject.e(1, this.duc);
      if (this.dud != null)
        paramArrayOfObject.e(2, this.dud);
      paramArrayOfObject.f(3, this.latitude);
      paramArrayOfObject.f(4, this.longitude);
      paramArrayOfObject.ai(5, this.vCE);
      if (this.vCF != null)
        paramArrayOfObject.e(6, this.vCF);
      if (this.vCG != null)
        paramArrayOfObject.e(7, this.vCG);
      if (this.vCH != null)
        paramArrayOfObject.e(8, this.vCH);
      if (this.vCI != null)
        paramArrayOfObject.e(9, this.vCI);
      if (this.vCJ != null)
        paramArrayOfObject.e(10, this.vCJ);
      AppMethodBeat.o(56697);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.duc == null)
        break label756;
    label756: for (paramInt = e.a.a.b.b.a.f(1, this.duc) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.dud != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.dud);
      i = i + (e.a.a.b.b.a.fv(3) + 8) + (e.a.a.b.b.a.fv(4) + 8) + e.a.a.b.b.a.o(5, this.vCE);
      paramInt = i;
      if (this.vCF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vCF);
      i = paramInt;
      if (this.vCG != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vCG);
      paramInt = i;
      if (this.vCH != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vCH);
      i = paramInt;
      if (this.vCI != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vCI);
      paramInt = i;
      if (this.vCJ != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vCJ);
      AppMethodBeat.o(56697);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56697);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aw localaw = (aw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56697);
          break;
        case 1:
          localaw.duc = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 2:
          localaw.dud = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 3:
          localaw.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 4:
          localaw.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 5:
          localaw.vCE = locala.BTU.ve();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 6:
          localaw.vCF = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 7:
          localaw.vCG = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 8:
          localaw.vCH = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 9:
          localaw.vCI = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        case 10:
          localaw.vCJ = locala.BTU.readString();
          AppMethodBeat.o(56697);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56697);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aw
 * JD-Core Version:    0.6.2
 */