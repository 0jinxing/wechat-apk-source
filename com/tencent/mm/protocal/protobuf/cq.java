package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cq extends com.tencent.mm.bt.a
{
  public String geZ;
  public String vEP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80011);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tp_username");
        AppMethodBeat.o(80011);
        throw paramArrayOfObject;
      }
      if (this.vEP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: antispam_ticket");
        AppMethodBeat.o(80011);
        throw paramArrayOfObject;
      }
      if (this.geZ != null)
        paramArrayOfObject.e(1, this.geZ);
      if (this.vEP != null)
        paramArrayOfObject.e(2, this.vEP);
      AppMethodBeat.o(80011);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geZ == null)
        break label386;
    label386: for (i = e.a.a.b.b.a.f(1, this.geZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vEP != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vEP);
      AppMethodBeat.o(80011);
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
          AppMethodBeat.o(80011);
          throw paramArrayOfObject;
        }
        if (this.vEP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: antispam_ticket");
          AppMethodBeat.o(80011);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80011);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cq localcq = (cq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80011);
          paramInt = -1;
          break;
        case 1:
          localcq.geZ = locala.BTU.readString();
          AppMethodBeat.o(80011);
          paramInt = i;
          break;
        case 2:
          localcq.vEP = locala.BTU.readString();
          AppMethodBeat.o(80011);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80011);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cq
 * JD-Core Version:    0.6.2
 */