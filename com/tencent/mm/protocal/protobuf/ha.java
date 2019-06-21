package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ha extends com.tencent.mm.bt.a
{
  public String nuL;
  public String pbn;
  public String pck;
  public String vJF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56709);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJF != null)
        paramArrayOfObject.e(1, this.vJF);
      if (this.pbn != null)
        paramArrayOfObject.e(2, this.pbn);
      if (this.nuL != null)
        paramArrayOfObject.e(3, this.nuL);
      if (this.pck != null)
        paramArrayOfObject.e(4, this.pck);
      AppMethodBeat.o(56709);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJF == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.vJF) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.pbn);
      paramInt = i;
      if (this.nuL != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nuL);
      i = paramInt;
      if (this.pck != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pck);
      AppMethodBeat.o(56709);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56709);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ha localha = (ha)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56709);
          break;
        case 1:
          localha.vJF = locala.BTU.readString();
          AppMethodBeat.o(56709);
          paramInt = i;
          break;
        case 2:
          localha.pbn = locala.BTU.readString();
          AppMethodBeat.o(56709);
          paramInt = i;
          break;
        case 3:
          localha.nuL = locala.BTU.readString();
          AppMethodBeat.o(56709);
          paramInt = i;
          break;
        case 4:
          localha.pck = locala.BTU.readString();
          AppMethodBeat.o(56709);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56709);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ha
 * JD-Core Version:    0.6.2
 */