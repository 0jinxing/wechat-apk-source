package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gc extends com.tencent.mm.bt.a
{
  public String pbn;
  public String vId;
  public String vIe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96199);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vId != null)
        paramArrayOfObject.e(1, this.vId);
      if (this.vIe != null)
        paramArrayOfObject.e(2, this.vIe);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      AppMethodBeat.o(96199);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vId == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.vId) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIe != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vIe);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pbn);
      AppMethodBeat.o(96199);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96199);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gc localgc = (gc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96199);
          break;
        case 1:
          localgc.vId = locala.BTU.readString();
          AppMethodBeat.o(96199);
          paramInt = i;
          break;
        case 2:
          localgc.vIe = locala.BTU.readString();
          AppMethodBeat.o(96199);
          paramInt = i;
          break;
        case 3:
          localgc.pbn = locala.BTU.readString();
          AppMethodBeat.o(96199);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96199);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gc
 * JD-Core Version:    0.6.2
 */