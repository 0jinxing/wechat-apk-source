package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class alk extends com.tencent.mm.bt.a
{
  public String cxb;
  public String geY;
  public String geZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80083);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tp_username");
        AppMethodBeat.o(80083);
        throw paramArrayOfObject;
      }
      if (this.geZ != null)
        paramArrayOfObject.e(1, this.geZ);
      if (this.geY != null)
        paramArrayOfObject.e(2, this.geY);
      if (this.cxb != null)
        paramArrayOfObject.e(3, this.cxb);
      AppMethodBeat.o(80083);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geZ == null)
        break label405;
    label405: for (i = e.a.a.b.b.a.f(1, this.geZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.geY != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.geY);
      i = paramInt;
      if (this.cxb != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cxb);
      AppMethodBeat.o(80083);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.geZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: tp_username");
          AppMethodBeat.o(80083);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80083);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        alk localalk = (alk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80083);
          break;
        case 1:
          localalk.geZ = locala.BTU.readString();
          AppMethodBeat.o(80083);
          paramInt = i;
          break;
        case 2:
          localalk.geY = locala.BTU.readString();
          AppMethodBeat.o(80083);
          paramInt = i;
          break;
        case 3:
          localalk.cxb = locala.BTU.readString();
          AppMethodBeat.o(80083);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80083);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.alk
 * JD-Core Version:    0.6.2
 */