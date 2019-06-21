package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abz extends com.tencent.mm.bt.a
{
  public String cEh;
  public String id;
  public boolean wjP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55700);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.id != null)
        paramArrayOfObject.e(1, this.id);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      paramArrayOfObject.aO(3, this.wjP);
      AppMethodBeat.o(55700);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.id == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.id) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cEh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cEh);
      paramInt = i + (e.a.a.b.b.a.fv(3) + 1);
      AppMethodBeat.o(55700);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55700);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abz localabz = (abz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55700);
          break;
        case 1:
          localabz.id = locala.BTU.readString();
          AppMethodBeat.o(55700);
          paramInt = i;
          break;
        case 2:
          localabz.cEh = locala.BTU.readString();
          AppMethodBeat.o(55700);
          paramInt = i;
          break;
        case 3:
          localabz.wjP = locala.BTU.ehX();
          AppMethodBeat.o(55700);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55700);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abz
 * JD-Core Version:    0.6.2
 */