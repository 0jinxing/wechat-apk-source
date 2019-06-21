package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ss extends com.tencent.mm.bt.a
{
  public int Scene;
  public String jCh;
  public String mZV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63688);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PkgId");
        AppMethodBeat.o(63688);
        throw paramArrayOfObject;
      }
      if (this.mZV != null)
        paramArrayOfObject.e(1, this.mZV);
      if (this.jCh != null)
        paramArrayOfObject.e(2, this.jCh);
      paramArrayOfObject.iz(3, this.Scene);
      AppMethodBeat.o(63688);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZV == null)
        break label385;
    label385: for (paramInt = e.a.a.b.b.a.f(1, this.mZV) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCh);
      paramInt = i + e.a.a.b.b.a.bs(3, this.Scene);
      AppMethodBeat.o(63688);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PkgId");
          AppMethodBeat.o(63688);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63688);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ss localss = (ss)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63688);
          break;
        case 1:
          localss.mZV = locala.BTU.readString();
          AppMethodBeat.o(63688);
          paramInt = i;
          break;
        case 2:
          localss.jCh = locala.BTU.readString();
          AppMethodBeat.o(63688);
          paramInt = i;
          break;
        case 3:
          localss.Scene = locala.BTU.vd();
          AppMethodBeat.o(63688);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63688);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ss
 * JD-Core Version:    0.6.2
 */