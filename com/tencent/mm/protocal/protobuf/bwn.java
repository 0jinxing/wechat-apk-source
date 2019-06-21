package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bwn extends com.tencent.mm.bt.a
{
  public String geZ;
  public String vEP;
  public String wWZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80184);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: tp_username");
        AppMethodBeat.o(80184);
        throw paramArrayOfObject;
      }
      if (this.wWZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: verify_content");
        AppMethodBeat.o(80184);
        throw paramArrayOfObject;
      }
      if (this.vEP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: antispam_ticket");
        AppMethodBeat.o(80184);
        throw paramArrayOfObject;
      }
      if (this.geZ != null)
        paramArrayOfObject.e(1, this.geZ);
      if (this.wWZ != null)
        paramArrayOfObject.e(2, this.wWZ);
      if (this.vEP != null)
        paramArrayOfObject.e(3, this.vEP);
      AppMethodBeat.o(80184);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geZ == null)
        break label501;
    label501: for (i = e.a.a.b.b.a.f(1, this.geZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wWZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wWZ);
      i = paramInt;
      if (this.vEP != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vEP);
      AppMethodBeat.o(80184);
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
          AppMethodBeat.o(80184);
          throw paramArrayOfObject;
        }
        if (this.wWZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: verify_content");
          AppMethodBeat.o(80184);
          throw paramArrayOfObject;
        }
        if (this.vEP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: antispam_ticket");
          AppMethodBeat.o(80184);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80184);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bwn localbwn = (bwn)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80184);
          break;
        case 1:
          localbwn.geZ = locala.BTU.readString();
          AppMethodBeat.o(80184);
          paramInt = i;
          break;
        case 2:
          localbwn.wWZ = locala.BTU.readString();
          AppMethodBeat.o(80184);
          paramInt = i;
          break;
        case 3:
          localbwn.vEP = locala.BTU.readString();
          AppMethodBeat.o(80184);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80184);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwn
 * JD-Core Version:    0.6.2
 */