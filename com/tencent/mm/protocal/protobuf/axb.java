package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axb extends com.tencent.mm.bt.a
{
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOD;
  public String vOz;
  public int wBk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(70482);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOz != null)
        paramArrayOfObject.e(1, this.vOz);
      if (this.vOA != null)
        paramArrayOfObject.e(2, this.vOA);
      if (this.vOB != null)
        paramArrayOfObject.e(3, this.vOB);
      if (this.vOC != null)
        paramArrayOfObject.e(4, this.vOC);
      if (this.vOD != null)
        paramArrayOfObject.e(5, this.vOD);
      paramArrayOfObject.iz(6, this.wBk);
      AppMethodBeat.o(70482);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vOz == null)
        break label530;
    label530: for (i = e.a.a.b.b.a.f(1, this.vOz) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vOA != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vOA);
      i = paramInt;
      if (this.vOB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vOB);
      paramInt = i;
      if (this.vOC != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vOC);
      i = paramInt;
      if (this.vOD != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vOD);
      paramInt = i + e.a.a.b.b.a.bs(6, this.wBk);
      AppMethodBeat.o(70482);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70482);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axb localaxb = (axb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(70482);
          break;
        case 1:
          localaxb.vOz = locala.BTU.readString();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        case 2:
          localaxb.vOA = locala.BTU.readString();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        case 3:
          localaxb.vOB = locala.BTU.readString();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        case 4:
          localaxb.vOC = locala.BTU.readString();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        case 5:
          localaxb.vOD = locala.BTU.readString();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        case 6:
          localaxb.wBk = locala.BTU.vd();
          AppMethodBeat.o(70482);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(70482);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axb
 * JD-Core Version:    0.6.2
 */