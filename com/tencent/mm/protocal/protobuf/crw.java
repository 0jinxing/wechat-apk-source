package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class crw extends com.tencent.mm.bt.a
{
  public String guW;
  public String xpw;
  public int xpx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28708);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpw != null)
        paramArrayOfObject.e(1, this.xpw);
      if (this.guW != null)
        paramArrayOfObject.e(2, this.guW);
      paramArrayOfObject.iz(3, this.xpx);
      AppMethodBeat.o(28708);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpw == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.xpw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.guW);
      paramInt = i + e.a.a.b.b.a.bs(3, this.xpx);
      AppMethodBeat.o(28708);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28708);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        crw localcrw = (crw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28708);
          break;
        case 1:
          localcrw.xpw = locala.BTU.readString();
          AppMethodBeat.o(28708);
          paramInt = i;
          break;
        case 2:
          localcrw.guW = locala.BTU.readString();
          AppMethodBeat.o(28708);
          paramInt = i;
          break;
        case 3:
          localcrw.xpx = locala.BTU.vd();
          AppMethodBeat.o(28708);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28708);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crw
 * JD-Core Version:    0.6.2
 */