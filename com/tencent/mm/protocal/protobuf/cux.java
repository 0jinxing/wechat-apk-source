package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cux extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vHn;
  public int wdn;
  public String wyw;
  public boolean xqX;
  public boolean xqY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28765);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
        AppMethodBeat.o(28765);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      paramArrayOfObject.iz(2, this.wdn);
      if (this.vHn != null)
        paramArrayOfObject.c(3, this.vHn);
      paramArrayOfObject.aO(4, this.xqX);
      paramArrayOfObject.aO(5, this.xqY);
      AppMethodBeat.o(28765);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label486;
    label486: for (paramInt = e.a.a.b.b.a.f(1, this.wyw) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wdn);
      paramInt = i;
      if (this.vHn != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.vHn);
      paramInt = paramInt + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(28765);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wyw == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
          AppMethodBeat.o(28765);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28765);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cux localcux = (cux)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28765);
          break;
        case 1:
          localcux.wyw = locala.BTU.readString();
          AppMethodBeat.o(28765);
          paramInt = i;
          break;
        case 2:
          localcux.wdn = locala.BTU.vd();
          AppMethodBeat.o(28765);
          paramInt = i;
          break;
        case 3:
          localcux.vHn = locala.BTU.emu();
          AppMethodBeat.o(28765);
          paramInt = i;
          break;
        case 4:
          localcux.xqX = locala.BTU.ehX();
          AppMethodBeat.o(28765);
          paramInt = i;
          break;
        case 5:
          localcux.xqY = locala.BTU.ehX();
          AppMethodBeat.o(28765);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28765);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cux
 * JD-Core Version:    0.6.2
 */