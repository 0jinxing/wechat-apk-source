package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bb extends com.tencent.mm.bt.a
{
  public boolean vCS = false;
  public boolean vCT = false;
  public boolean vCU = false;
  public boolean vCV = false;
  public String vCW = "";
  public String vCX = "";
  public String vCY = "";
  public String vCZ = "";
  public int vDa = -1;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73642);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.vCS);
      paramArrayOfObject.aO(2, this.vCT);
      paramArrayOfObject.aO(3, this.vCU);
      paramArrayOfObject.aO(4, this.vCV);
      if (this.vCW != null)
        paramArrayOfObject.e(5, this.vCW);
      if (this.vCX != null)
        paramArrayOfObject.e(6, this.vCX);
      if (this.vCY != null)
        paramArrayOfObject.e(7, this.vCY);
      if (this.vCZ != null)
        paramArrayOfObject.e(8, this.vCZ);
      paramArrayOfObject.iz(9, this.vDa);
      AppMethodBeat.o(73642);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0 + (e.a.a.b.b.a.fv(2) + 1) + (e.a.a.b.b.a.fv(3) + 1) + (e.a.a.b.b.a.fv(4) + 1);
        paramInt = i;
        if (this.vCW != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.vCW);
        i = paramInt;
        if (this.vCX != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.vCX);
        paramInt = i;
        if (this.vCY != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vCY);
        i = paramInt;
        if (this.vCZ != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.vCZ);
        paramInt = i + e.a.a.b.b.a.bs(9, this.vDa);
        AppMethodBeat.o(73642);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73642);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bb localbb = (bb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73642);
          break;
        case 1:
          localbb.vCS = locala.BTU.ehX();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 2:
          localbb.vCT = locala.BTU.ehX();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 3:
          localbb.vCU = locala.BTU.ehX();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 4:
          localbb.vCV = locala.BTU.ehX();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 5:
          localbb.vCW = locala.BTU.readString();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 6:
          localbb.vCX = locala.BTU.readString();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 7:
          localbb.vCY = locala.BTU.readString();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 8:
          localbb.vCZ = locala.BTU.readString();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        case 9:
          localbb.vDa = locala.BTU.vd();
          AppMethodBeat.o(73642);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73642);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bb
 * JD-Core Version:    0.6.2
 */