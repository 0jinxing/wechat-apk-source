package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bvl extends com.tencent.mm.bt.a
{
  public String cFl;
  public int wWA;
  public String wWz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80180);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wWz != null)
        paramArrayOfObject.e(1, this.wWz);
      if (this.cFl != null)
        paramArrayOfObject.e(2, this.cFl);
      paramArrayOfObject.iz(3, this.wWA);
      AppMethodBeat.o(80180);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wWz == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.wWz) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cFl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cFl);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wWA);
      AppMethodBeat.o(80180);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80180);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bvl localbvl = (bvl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80180);
          break;
        case 1:
          localbvl.wWz = locala.BTU.readString();
          AppMethodBeat.o(80180);
          paramInt = i;
          break;
        case 2:
          localbvl.cFl = locala.BTU.readString();
          AppMethodBeat.o(80180);
          paramInt = i;
          break;
        case 3:
          localbvl.wWA = locala.BTU.vd();
          AppMethodBeat.o(80180);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80180);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvl
 * JD-Core Version:    0.6.2
 */