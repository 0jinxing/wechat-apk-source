package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class csi extends com.tencent.mm.bt.a
{
  public String url;
  public int xpH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56998);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xpH);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      AppMethodBeat.o(56998);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xpH) + 0;
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.url);
        AppMethodBeat.o(56998);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56998);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        csi localcsi = (csi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56998);
          paramInt = -1;
          break;
        case 1:
          localcsi.xpH = locala.BTU.vd();
          AppMethodBeat.o(56998);
          paramInt = 0;
          break;
        case 2:
          localcsi.url = locala.BTU.readString();
          AppMethodBeat.o(56998);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(56998);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csi
 * JD-Core Version:    0.6.2
 */