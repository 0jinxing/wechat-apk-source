package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cmv extends com.tencent.mm.bt.a
{
  public String geZ;
  public String gfi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80205);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tp_username");
        AppMethodBeat.o(80205);
        throw paramArrayOfObject;
      }
      if (this.gfi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: verify_ticket");
        AppMethodBeat.o(80205);
        throw paramArrayOfObject;
      }
      if (this.geZ != null)
        paramArrayOfObject.e(1, this.geZ);
      if (this.gfi != null)
        paramArrayOfObject.e(2, this.gfi);
      AppMethodBeat.o(80205);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geZ == null)
        break label386;
    label386: for (i = e.a.a.b.b.a.f(1, this.geZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.gfi != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.gfi);
      AppMethodBeat.o(80205);
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
          AppMethodBeat.o(80205);
          throw paramArrayOfObject;
        }
        if (this.gfi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: verify_ticket");
          AppMethodBeat.o(80205);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80205);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cmv localcmv = (cmv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80205);
          paramInt = -1;
          break;
        case 1:
          localcmv.geZ = locala.BTU.readString();
          AppMethodBeat.o(80205);
          paramInt = i;
          break;
        case 2:
          localcmv.gfi = locala.BTU.readString();
          AppMethodBeat.o(80205);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80205);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cmv
 * JD-Core Version:    0.6.2
 */