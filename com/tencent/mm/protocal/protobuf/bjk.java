package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bjk extends com.tencent.mm.bt.a
{
  public String title;
  public String wMQ;
  public String wMR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56900);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.wMQ != null)
        paramArrayOfObject.e(2, this.wMQ);
      if (this.wMR != null)
        paramArrayOfObject.e(3, this.wMR);
      AppMethodBeat.o(56900);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wMQ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wMQ);
      i = paramInt;
      if (this.wMR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wMR);
      AppMethodBeat.o(56900);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56900);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bjk localbjk = (bjk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56900);
          break;
        case 1:
          localbjk.title = locala.BTU.readString();
          AppMethodBeat.o(56900);
          paramInt = i;
          break;
        case 2:
          localbjk.wMQ = locala.BTU.readString();
          AppMethodBeat.o(56900);
          paramInt = i;
          break;
        case 3:
          localbjk.wMR = locala.BTU.readString();
          AppMethodBeat.o(56900);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56900);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjk
 * JD-Core Version:    0.6.2
 */