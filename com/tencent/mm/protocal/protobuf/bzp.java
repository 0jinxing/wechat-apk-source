package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzp extends com.tencent.mm.bt.a
{
  public String kCs;
  public String nZb;
  public String nZc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56973);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nZb != null)
        paramArrayOfObject.e(1, this.nZb);
      if (this.nZc != null)
        paramArrayOfObject.e(2, this.nZc);
      if (this.kCs != null)
        paramArrayOfObject.e(3, this.kCs);
      AppMethodBeat.o(56973);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nZb == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.nZb) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nZc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nZc);
      i = paramInt;
      if (this.kCs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kCs);
      AppMethodBeat.o(56973);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56973);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzp localbzp = (bzp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56973);
          break;
        case 1:
          localbzp.nZb = locala.BTU.readString();
          AppMethodBeat.o(56973);
          paramInt = i;
          break;
        case 2:
          localbzp.nZc = locala.BTU.readString();
          AppMethodBeat.o(56973);
          paramInt = i;
          break;
        case 3:
          localbzp.kCs = locala.BTU.readString();
          AppMethodBeat.o(56973);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56973);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzp
 * JD-Core Version:    0.6.2
 */