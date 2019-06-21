package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class buj extends com.tencent.mm.bt.a
{
  public String Desc;
  public String iyZ;
  public String vOF;
  public int wWa;
  public String wze;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96284);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOF != null)
        paramArrayOfObject.e(1, this.vOF);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      paramArrayOfObject.iz(3, this.wWa);
      if (this.iyZ != null)
        paramArrayOfObject.e(4, this.iyZ);
      if (this.wze != null)
        paramArrayOfObject.e(5, this.wze);
      AppMethodBeat.o(96284);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vOF == null)
        break label467;
    label467: for (paramInt = e.a.a.b.b.a.f(1, this.vOF) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Desc);
      i += e.a.a.b.b.a.bs(3, this.wWa);
      paramInt = i;
      if (this.iyZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.iyZ);
      i = paramInt;
      if (this.wze != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wze);
      AppMethodBeat.o(96284);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96284);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        buj localbuj = (buj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96284);
          break;
        case 1:
          localbuj.vOF = locala.BTU.readString();
          AppMethodBeat.o(96284);
          paramInt = i;
          break;
        case 2:
          localbuj.Desc = locala.BTU.readString();
          AppMethodBeat.o(96284);
          paramInt = i;
          break;
        case 3:
          localbuj.wWa = locala.BTU.vd();
          AppMethodBeat.o(96284);
          paramInt = i;
          break;
        case 4:
          localbuj.iyZ = locala.BTU.readString();
          AppMethodBeat.o(96284);
          paramInt = i;
          break;
        case 5:
          localbuj.wze = locala.BTU.readString();
          AppMethodBeat.o(96284);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96284);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buj
 * JD-Core Version:    0.6.2
 */