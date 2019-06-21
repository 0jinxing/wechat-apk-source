package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class biv extends com.tencent.mm.bt.a
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

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80154);
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
      AppMethodBeat.o(80154);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.duc == null)
        break label693;
    label693: for (paramInt = e.a.a.b.b.a.f(1, this.duc) + 0; ; paramInt = 0)
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
      AppMethodBeat.o(80154);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80154);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        biv localbiv = (biv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80154);
          break;
        case 1:
          localbiv.duc = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 2:
          localbiv.dud = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 3:
          localbiv.latitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 4:
          localbiv.longitude = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 5:
          localbiv.vCE = locala.BTU.ve();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 6:
          localbiv.vCF = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 7:
          localbiv.vCG = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 8:
          localbiv.vCH = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        case 9:
          localbiv.vCI = locala.BTU.readString();
          AppMethodBeat.o(80154);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80154);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.biv
 * JD-Core Version:    0.6.2
 */