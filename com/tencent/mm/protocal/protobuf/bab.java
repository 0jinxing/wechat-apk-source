package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bab extends com.tencent.mm.bt.a
{
  public String cEh;
  public String nZb;
  public String nZc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48884);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cEh != null)
        paramArrayOfObject.e(1, this.cEh);
      if (this.nZb != null)
        paramArrayOfObject.e(2, this.nZb);
      if (this.nZc != null)
        paramArrayOfObject.e(4, this.nZc);
      AppMethodBeat.o(48884);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cEh == null)
        break label361;
    label361: for (i = e.a.a.b.b.a.f(1, this.cEh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nZb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nZb);
      i = paramInt;
      if (this.nZc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nZc);
      AppMethodBeat.o(48884);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48884);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bab localbab = (bab)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 3:
        default:
          AppMethodBeat.o(48884);
          paramInt = -1;
          break;
        case 1:
          localbab.cEh = locala.BTU.readString();
          AppMethodBeat.o(48884);
          paramInt = i;
          break;
        case 2:
          localbab.nZb = locala.BTU.readString();
          AppMethodBeat.o(48884);
          paramInt = i;
          break;
        case 4:
          localbab.nZc = locala.BTU.readString();
          AppMethodBeat.o(48884);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(48884);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bab
 * JD-Core Version:    0.6.2
 */