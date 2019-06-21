package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cwa extends com.tencent.mm.bt.a
{
  public String mZW;
  public String wCW;
  public String xrU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11824);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xrU != null)
        paramArrayOfObject.e(1, this.xrU);
      if (this.mZW != null)
        paramArrayOfObject.e(2, this.mZW);
      if (this.wCW != null)
        paramArrayOfObject.e(3, this.wCW);
      AppMethodBeat.o(11824);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xrU == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.xrU) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZW != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZW);
      i = paramInt;
      if (this.wCW != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wCW);
      AppMethodBeat.o(11824);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11824);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwa localcwa = (cwa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11824);
          break;
        case 1:
          localcwa.xrU = locala.BTU.readString();
          AppMethodBeat.o(11824);
          paramInt = i;
          break;
        case 2:
          localcwa.mZW = locala.BTU.readString();
          AppMethodBeat.o(11824);
          paramInt = i;
          break;
        case 3:
          localcwa.wCW = locala.BTU.readString();
          AppMethodBeat.o(11824);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11824);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwa
 * JD-Core Version:    0.6.2
 */