package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class kd extends com.tencent.mm.bt.a
{
  public String name;
  public int type;
  public String vMV;
  public String vMW;
  public int vMX;
  public int vMY;
  public String vMZ;
  public String vNa;
  public int ver;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11700);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMV != null)
        paramArrayOfObject.e(1, this.vMV);
      paramArrayOfObject.iz(2, this.type);
      if (this.vMW != null)
        paramArrayOfObject.e(3, this.vMW);
      if (this.name != null)
        paramArrayOfObject.e(4, this.name);
      paramArrayOfObject.iz(5, this.ver);
      paramArrayOfObject.iz(6, this.vMX);
      paramArrayOfObject.iz(7, this.vMY);
      if (this.vMZ != null)
        paramArrayOfObject.e(8, this.vMZ);
      if (this.vNa != null)
        paramArrayOfObject.e(9, this.vNa);
      AppMethodBeat.o(11700);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMV == null)
        break label690;
    label690: for (paramInt = e.a.a.b.b.a.f(1, this.vMV) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.type);
      paramInt = i;
      if (this.vMW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vMW);
      i = paramInt;
      if (this.name != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.name);
      i = i + e.a.a.b.b.a.bs(5, this.ver) + e.a.a.b.b.a.bs(6, this.vMX) + e.a.a.b.b.a.bs(7, this.vMY);
      paramInt = i;
      if (this.vMZ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vMZ);
      i = paramInt;
      if (this.vNa != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vNa);
      AppMethodBeat.o(11700);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11700);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        kd localkd = (kd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11700);
          break;
        case 1:
          localkd.vMV = locala.BTU.readString();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 2:
          localkd.type = locala.BTU.vd();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 3:
          localkd.vMW = locala.BTU.readString();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 4:
          localkd.name = locala.BTU.readString();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 5:
          localkd.ver = locala.BTU.vd();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 6:
          localkd.vMX = locala.BTU.vd();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 7:
          localkd.vMY = locala.BTU.vd();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 8:
          localkd.vMZ = locala.BTU.readString();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        case 9:
          localkd.vNa = locala.BTU.readString();
          AppMethodBeat.o(11700);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11700);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kd
 * JD-Core Version:    0.6.2
 */