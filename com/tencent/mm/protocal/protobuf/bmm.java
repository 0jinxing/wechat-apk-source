package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bmm extends com.tencent.mm.bt.a
{
  public String cDL;
  public String cvZ;
  public String url;
  public int version;
  public boolean wPt;
  public int wPu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96282);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wPt);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.cvZ != null)
        paramArrayOfObject.e(3, this.cvZ);
      paramArrayOfObject.iz(4, this.version);
      paramArrayOfObject.iz(5, this.wPu);
      if (this.cDL != null)
        paramArrayOfObject.e(6, this.cDL);
      AppMethodBeat.o(96282);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 1 + 0;
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.url);
        i = paramInt;
        if (this.cvZ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.cvZ);
        i = i + e.a.a.b.b.a.bs(4, this.version) + e.a.a.b.b.a.bs(5, this.wPu);
        paramInt = i;
        if (this.cDL != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.cDL);
        AppMethodBeat.o(96282);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96282);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bmm localbmm = (bmm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96282);
          break;
        case 1:
          localbmm.wPt = locala.BTU.ehX();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        case 2:
          localbmm.url = locala.BTU.readString();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        case 3:
          localbmm.cvZ = locala.BTU.readString();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        case 4:
          localbmm.version = locala.BTU.vd();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        case 5:
          localbmm.wPu = locala.BTU.vd();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        case 6:
          localbmm.cDL = locala.BTU.readString();
          AppMethodBeat.o(96282);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(96282);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmm
 * JD-Core Version:    0.6.2
 */