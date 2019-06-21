package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cdz extends com.tencent.mm.bt.a
{
  public String qQm;
  public int qQn;
  public String qQo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56506);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qQm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: clientID");
        AppMethodBeat.o(56506);
        throw paramArrayOfObject;
      }
      if (this.qQm != null)
        paramArrayOfObject.e(1, this.qQm);
      paramArrayOfObject.iz(2, this.qQn);
      if (this.qQo != null)
        paramArrayOfObject.e(3, this.qQo);
      AppMethodBeat.o(56506);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.qQm == null)
        break label385;
    label385: for (paramInt = e.a.a.b.b.a.f(1, this.qQm) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.qQn);
      paramInt = i;
      if (this.qQo != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.qQo);
      AppMethodBeat.o(56506);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.qQm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: clientID");
          AppMethodBeat.o(56506);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56506);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdz localcdz = (cdz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56506);
          break;
        case 1:
          localcdz.qQm = locala.BTU.readString();
          AppMethodBeat.o(56506);
          paramInt = i;
          break;
        case 2:
          localcdz.qQn = locala.BTU.vd();
          AppMethodBeat.o(56506);
          paramInt = i;
          break;
        case 3:
          localcdz.qQo = locala.BTU.readString();
          AppMethodBeat.o(56506);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56506);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdz
 * JD-Core Version:    0.6.2
 */