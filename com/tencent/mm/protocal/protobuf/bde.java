package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bde extends com.tencent.mm.bt.a
{
  public String cDL;
  public String url;
  public String wsY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96277);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wsY != null)
        paramArrayOfObject.e(1, this.wsY);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.cDL != null)
        paramArrayOfObject.e(3, this.cDL);
      AppMethodBeat.o(96277);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wsY == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.wsY) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.cDL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cDL);
      AppMethodBeat.o(96277);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96277);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bde localbde = (bde)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96277);
          break;
        case 1:
          localbde.wsY = locala.BTU.readString();
          AppMethodBeat.o(96277);
          paramInt = i;
          break;
        case 2:
          localbde.url = locala.BTU.readString();
          AppMethodBeat.o(96277);
          paramInt = i;
          break;
        case 3:
          localbde.cDL = locala.BTU.readString();
          AppMethodBeat.o(96277);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96277);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bde
 * JD-Core Version:    0.6.2
 */