package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class dq extends com.tencent.mm.bt.a
{
  public String csB;
  public int status;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73647);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appid");
        AppMethodBeat.o(73647);
        throw paramArrayOfObject;
      }
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      paramArrayOfObject.iz(2, this.status);
      AppMethodBeat.o(73647);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.status);
      AppMethodBeat.o(73647);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.csB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appid");
          AppMethodBeat.o(73647);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73647);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dq localdq = (dq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(73647);
          paramInt = -1;
          break;
        case 1:
          localdq.csB = locala.BTU.readString();
          AppMethodBeat.o(73647);
          paramInt = i;
          break;
        case 2:
          localdq.status = locala.BTU.vd();
          AppMethodBeat.o(73647);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(73647);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dq
 * JD-Core Version:    0.6.2
 */