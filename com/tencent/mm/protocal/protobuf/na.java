package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class na extends com.tencent.mm.bt.a
{
  public String vJY;
  public String vRB;
  public int vRC;
  public String vRD;
  public String vRE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2537);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vRB != null)
        paramArrayOfObject.e(1, this.vRB);
      paramArrayOfObject.iz(2, this.vRC);
      if (this.vRD != null)
        paramArrayOfObject.e(3, this.vRD);
      if (this.vJY != null)
        paramArrayOfObject.e(4, this.vJY);
      if (this.vRE != null)
        paramArrayOfObject.e(5, this.vRE);
      AppMethodBeat.o(2537);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vRB == null)
        break label474;
    label474: for (paramInt = e.a.a.b.b.a.f(1, this.vRB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vRC);
      paramInt = i;
      if (this.vRD != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vRD);
      i = paramInt;
      if (this.vJY != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vJY);
      paramInt = i;
      if (this.vRE != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vRE);
      AppMethodBeat.o(2537);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(2537);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        na localna = (na)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2537);
          break;
        case 1:
          localna.vRB = locala.BTU.readString();
          AppMethodBeat.o(2537);
          paramInt = i;
          break;
        case 2:
          localna.vRC = locala.BTU.vd();
          AppMethodBeat.o(2537);
          paramInt = i;
          break;
        case 3:
          localna.vRD = locala.BTU.readString();
          AppMethodBeat.o(2537);
          paramInt = i;
          break;
        case 4:
          localna.vJY = locala.BTU.readString();
          AppMethodBeat.o(2537);
          paramInt = i;
          break;
        case 5:
          localna.vRE = locala.BTU.readString();
          AppMethodBeat.o(2537);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2537);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.na
 * JD-Core Version:    0.6.2
 */