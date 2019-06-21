package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bsq extends com.tencent.mm.bt.a
{
  public int Scene;
  public String Url;
  public int vFW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14745);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Url != null)
        paramArrayOfObject.e(1, this.Url);
      paramArrayOfObject.iz(2, this.vFW);
      paramArrayOfObject.iz(3, this.Scene);
      AppMethodBeat.o(14745);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Url == null)
        break label330;
    label330: for (paramInt = e.a.a.b.b.a.f(1, this.Url) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vFW) + e.a.a.b.b.a.bs(3, this.Scene);
      AppMethodBeat.o(14745);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14745);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bsq localbsq = (bsq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14745);
          break;
        case 1:
          localbsq.Url = locala.BTU.readString();
          AppMethodBeat.o(14745);
          paramInt = i;
          break;
        case 2:
          localbsq.vFW = locala.BTU.vd();
          AppMethodBeat.o(14745);
          paramInt = i;
          break;
        case 3:
          localbsq.Scene = locala.BTU.vd();
          AppMethodBeat.o(14745);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14745);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsq
 * JD-Core Version:    0.6.2
 */