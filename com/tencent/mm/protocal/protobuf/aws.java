package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aws extends com.tencent.mm.bt.a
{
  public String wAX;
  public String wAY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96271);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wAX != null)
        paramArrayOfObject.e(1, this.wAX);
      if (this.wAY != null)
        paramArrayOfObject.e(2, this.wAY);
      AppMethodBeat.o(96271);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wAX == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.wAX) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wAY != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wAY);
      AppMethodBeat.o(96271);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96271);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aws localaws = (aws)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(96271);
          paramInt = -1;
          break;
        case 1:
          localaws.wAX = locala.BTU.readString();
          AppMethodBeat.o(96271);
          paramInt = i;
          break;
        case 2:
          localaws.wAY = locala.BTU.readString();
          AppMethodBeat.o(96271);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(96271);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aws
 * JD-Core Version:    0.6.2
 */