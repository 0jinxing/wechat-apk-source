package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cie extends com.tencent.mm.bt.a
{
  public String Name;
  public double vNH;
  public double vNI;
  public String wKW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(113792);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.vNI);
      paramArrayOfObject.f(2, this.vNH);
      if (this.Name != null)
        paramArrayOfObject.e(3, this.Name);
      if (this.wKW != null)
        paramArrayOfObject.e(4, this.wKW);
      AppMethodBeat.o(113792);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8);
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.Name);
        i = paramInt;
        if (this.wKW != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.wKW);
        AppMethodBeat.o(113792);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(113792);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cie localcie = (cie)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113792);
          break;
        case 1:
          localcie.vNI = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113792);
          paramInt = 0;
          break;
        case 2:
          localcie.vNH = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(113792);
          paramInt = 0;
          break;
        case 3:
          localcie.Name = locala.BTU.readString();
          AppMethodBeat.o(113792);
          paramInt = 0;
          break;
        case 4:
          localcie.wKW = locala.BTU.readString();
          AppMethodBeat.o(113792);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(113792);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cie
 * JD-Core Version:    0.6.2
 */