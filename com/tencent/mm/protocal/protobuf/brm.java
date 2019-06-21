package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class brm extends com.tencent.mm.bt.a
{
  public int ndr;
  public String vMR;
  public long wTJ;
  public int wTK;
  public boolean wTL;
  public boolean wTM;
  public int wTN;
  public boolean wTO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11801);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMR != null)
        paramArrayOfObject.e(1, this.vMR);
      paramArrayOfObject.ai(2, this.wTJ);
      paramArrayOfObject.iz(3, this.wTK);
      paramArrayOfObject.aO(4, this.wTL);
      paramArrayOfObject.aO(5, this.wTM);
      paramArrayOfObject.iz(6, this.wTN);
      paramArrayOfObject.iz(7, this.ndr);
      paramArrayOfObject.aO(8, this.wTO);
      AppMethodBeat.o(11801);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMR == null)
        break label558;
    label558: for (paramInt = e.a.a.b.b.a.f(1, this.vMR) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.wTJ) + e.a.a.b.b.a.bs(3, this.wTK) + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1) + e.a.a.b.b.a.bs(6, this.wTN) + e.a.a.b.b.a.bs(7, this.ndr) + (e.a.a.b.b.a.fv(8) + 1);
      AppMethodBeat.o(11801);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11801);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        brm localbrm = (brm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11801);
          break;
        case 1:
          localbrm.vMR = locala.BTU.readString();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 2:
          localbrm.wTJ = locala.BTU.ve();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 3:
          localbrm.wTK = locala.BTU.vd();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 4:
          localbrm.wTL = locala.BTU.ehX();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 5:
          localbrm.wTM = locala.BTU.ehX();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 6:
          localbrm.wTN = locala.BTU.vd();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 7:
          localbrm.ndr = locala.BTU.vd();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        case 8:
          localbrm.wTO = locala.BTU.ehX();
          AppMethodBeat.o(11801);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11801);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brm
 * JD-Core Version:    0.6.2
 */