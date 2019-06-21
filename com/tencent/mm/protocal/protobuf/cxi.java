package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxi extends com.tencent.mm.bt.a
{
  public String path;
  public String username;
  public int vOP;
  public String wHu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96342);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.wHu != null)
        paramArrayOfObject.e(2, this.wHu);
      paramArrayOfObject.iz(3, this.vOP);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      AppMethodBeat.o(96342);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wHu != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wHu);
      i += e.a.a.b.b.a.bs(3, this.vOP);
      paramInt = i;
      if (this.path != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.path);
      AppMethodBeat.o(96342);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96342);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxi localcxi = (cxi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96342);
          break;
        case 1:
          localcxi.username = locala.BTU.readString();
          AppMethodBeat.o(96342);
          paramInt = i;
          break;
        case 2:
          localcxi.wHu = locala.BTU.readString();
          AppMethodBeat.o(96342);
          paramInt = i;
          break;
        case 3:
          localcxi.vOP = locala.BTU.vd();
          AppMethodBeat.o(96342);
          paramInt = i;
          break;
        case 4:
          localcxi.path = locala.BTU.readString();
          AppMethodBeat.o(96342);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96342);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxi
 * JD-Core Version:    0.6.2
 */