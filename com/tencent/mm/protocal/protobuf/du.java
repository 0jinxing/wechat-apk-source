package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class du extends com.tencent.mm.bt.a
{
  public String vFC;
  public String vFD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94509);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFC != null)
        paramArrayOfObject.e(1, this.vFC);
      if (this.vFD != null)
        paramArrayOfObject.e(2, this.vFD);
      AppMethodBeat.o(94509);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFC == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.vFC) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFD != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFD);
      AppMethodBeat.o(94509);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94509);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        du localdu = (du)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(94509);
          paramInt = -1;
          break;
        case 1:
          localdu.vFC = locala.BTU.readString();
          AppMethodBeat.o(94509);
          paramInt = i;
          break;
        case 2:
          localdu.vFD = locala.BTU.readString();
          AppMethodBeat.o(94509);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94509);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.du
 * JD-Core Version:    0.6.2
 */