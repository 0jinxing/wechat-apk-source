package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chy extends com.tencent.mm.bt.a
{
  public String url;
  public int xhg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55713);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      paramArrayOfObject.iz(2, this.xhg);
      AppMethodBeat.o(55713);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.url) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.xhg);
      AppMethodBeat.o(55713);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55713);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chy localchy = (chy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(55713);
          paramInt = -1;
          break;
        case 1:
          localchy.url = locala.BTU.readString();
          AppMethodBeat.o(55713);
          paramInt = i;
          break;
        case 2:
          localchy.xhg = locala.BTU.vd();
          AppMethodBeat.o(55713);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(55713);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chy
 * JD-Core Version:    0.6.2
 */