package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ef extends com.tencent.mm.bt.a
{
  public String Url;
  public String ncM;
  public int ptD;
  public int vFU = 600;
  public String vFV;
  public int vFW;
  public boolean vFX;
  public int vFY;
  public int vFZ;
  public int vGa;
  public int vGb;
  public int vGc = -1;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14689);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Url != null)
        paramArrayOfObject.e(1, this.Url);
      if (this.ncM != null)
        paramArrayOfObject.e(2, this.ncM);
      paramArrayOfObject.iz(3, this.vFU);
      if (this.vFV != null)
        paramArrayOfObject.e(4, this.vFV);
      paramArrayOfObject.iz(5, this.vFW);
      paramArrayOfObject.aO(6, this.vFX);
      paramArrayOfObject.iz(7, this.vFY);
      paramArrayOfObject.iz(8, this.vFZ);
      paramArrayOfObject.iz(9, this.ptD);
      paramArrayOfObject.iz(10, this.vGa);
      paramArrayOfObject.iz(11, this.vGb);
      paramArrayOfObject.iz(12, this.vGc);
      AppMethodBeat.o(14689);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Url == null)
        break label794;
    label794: for (paramInt = e.a.a.b.b.a.f(1, this.Url) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncM);
      i += e.a.a.b.b.a.bs(3, this.vFU);
      paramInt = i;
      if (this.vFV != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vFV);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.vFW) + (e.a.a.b.b.a.fv(6) + 1) + e.a.a.b.b.a.bs(7, this.vFY) + e.a.a.b.b.a.bs(8, this.vFZ) + e.a.a.b.b.a.bs(9, this.ptD) + e.a.a.b.b.a.bs(10, this.vGa) + e.a.a.b.b.a.bs(11, this.vGb) + e.a.a.b.b.a.bs(12, this.vGc);
      AppMethodBeat.o(14689);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14689);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ef localef = (ef)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14689);
          break;
        case 1:
          localef.Url = locala.BTU.readString();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 2:
          localef.ncM = locala.BTU.readString();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 3:
          localef.vFU = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 4:
          localef.vFV = locala.BTU.readString();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 5:
          localef.vFW = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 6:
          localef.vFX = locala.BTU.ehX();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 7:
          localef.vFY = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 8:
          localef.vFZ = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 9:
          localef.ptD = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 10:
          localef.vGa = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 11:
          localef.vGb = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        case 12:
          localef.vGc = locala.BTU.vd();
          AppMethodBeat.o(14689);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14689);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ef
 * JD-Core Version:    0.6.2
 */