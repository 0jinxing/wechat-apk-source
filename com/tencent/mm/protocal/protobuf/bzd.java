package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzd extends com.tencent.mm.bt.a
{
  public int Height;
  public int Width;
  public String wVm;
  public String wYi;
  public String wdO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28654);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdO != null)
        paramArrayOfObject.e(1, this.wdO);
      paramArrayOfObject.iz(2, this.Width);
      paramArrayOfObject.iz(3, this.Height);
      if (this.wVm != null)
        paramArrayOfObject.e(4, this.wVm);
      if (this.wYi != null)
        paramArrayOfObject.e(5, this.wYi);
      AppMethodBeat.o(28654);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wdO == null)
        break label458;
    label458: for (paramInt = e.a.a.b.b.a.f(1, this.wdO) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.Width) + e.a.a.b.b.a.bs(3, this.Height);
      paramInt = i;
      if (this.wVm != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wVm);
      i = paramInt;
      if (this.wYi != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wYi);
      AppMethodBeat.o(28654);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28654);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzd localbzd = (bzd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28654);
          break;
        case 1:
          localbzd.wdO = locala.BTU.readString();
          AppMethodBeat.o(28654);
          paramInt = i;
          break;
        case 2:
          localbzd.Width = locala.BTU.vd();
          AppMethodBeat.o(28654);
          paramInt = i;
          break;
        case 3:
          localbzd.Height = locala.BTU.vd();
          AppMethodBeat.o(28654);
          paramInt = i;
          break;
        case 4:
          localbzd.wVm = locala.BTU.readString();
          AppMethodBeat.o(28654);
          paramInt = i;
          break;
        case 5:
          localbzd.wYi = locala.BTU.readString();
          AppMethodBeat.o(28654);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28654);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzd
 * JD-Core Version:    0.6.2
 */