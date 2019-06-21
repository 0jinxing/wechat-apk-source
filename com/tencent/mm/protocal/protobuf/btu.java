package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class btu extends com.tencent.mm.bt.a
{
  public String Name;
  public int pcX;
  public String vIk;
  public String wcI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123516);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.wcI != null)
        paramArrayOfObject.e(2, this.wcI);
      if (this.vIk != null)
        paramArrayOfObject.e(3, this.vIk);
      paramArrayOfObject.iz(4, this.pcX);
      AppMethodBeat.o(123516);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.Name) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wcI != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wcI);
      i = paramInt;
      if (this.vIk != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vIk);
      paramInt = i + e.a.a.b.b.a.bs(4, this.pcX);
      AppMethodBeat.o(123516);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123516);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        btu localbtu = (btu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123516);
          break;
        case 1:
          localbtu.Name = locala.BTU.readString();
          AppMethodBeat.o(123516);
          paramInt = i;
          break;
        case 2:
          localbtu.wcI = locala.BTU.readString();
          AppMethodBeat.o(123516);
          paramInt = i;
          break;
        case 3:
          localbtu.vIk = locala.BTU.readString();
          AppMethodBeat.o(123516);
          paramInt = i;
          break;
        case 4:
          localbtu.pcX = locala.BTU.vd();
          AppMethodBeat.o(123516);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123516);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btu
 * JD-Core Version:    0.6.2
 */