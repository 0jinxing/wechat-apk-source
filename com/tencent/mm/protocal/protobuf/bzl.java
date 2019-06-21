package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bzl extends com.tencent.mm.bt.a
{
  public String url;
  public int wYt;
  public int wYu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80188);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      paramArrayOfObject.iz(2, this.wYt);
      paramArrayOfObject.iz(3, this.wYu);
      AppMethodBeat.o(80188);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.url) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wYt) + e.a.a.b.b.a.bs(3, this.wYu);
      AppMethodBeat.o(80188);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80188);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzl localbzl = (bzl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80188);
          break;
        case 1:
          localbzl.url = locala.BTU.readString();
          AppMethodBeat.o(80188);
          paramInt = i;
          break;
        case 2:
          localbzl.wYt = locala.BTU.vd();
          AppMethodBeat.o(80188);
          paramInt = i;
          break;
        case 3:
          localbzl.wYu = locala.BTU.vd();
          AppMethodBeat.o(80188);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80188);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzl
 * JD-Core Version:    0.6.2
 */