package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cga extends com.tencent.mm.bt.a
{
  public String xfb;
  public int xfc;
  public int xfd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114990);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xfb != null)
        paramArrayOfObject.e(1, this.xfb);
      paramArrayOfObject.iz(2, this.xfc);
      paramArrayOfObject.iz(3, this.xfd);
      AppMethodBeat.o(114990);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xfb == null)
        break label321;
    label321: for (paramInt = e.a.a.b.b.a.f(1, this.xfb) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.xfc) + e.a.a.b.b.a.bs(3, this.xfd);
      AppMethodBeat.o(114990);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114990);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cga localcga = (cga)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114990);
          break;
        case 1:
          localcga.xfb = locala.BTU.readString();
          AppMethodBeat.o(114990);
          paramInt = i;
          break;
        case 2:
          localcga.xfc = locala.BTU.vd();
          AppMethodBeat.o(114990);
          paramInt = i;
          break;
        case 3:
          localcga.xfd = locala.BTU.vd();
          AppMethodBeat.o(114990);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114990);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cga
 * JD-Core Version:    0.6.2
 */