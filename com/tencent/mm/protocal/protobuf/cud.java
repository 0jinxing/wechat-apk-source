package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cud extends com.tencent.mm.bt.a
{
  public String vHl;
  public long wOP;
  public boolean xqF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28741);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Username");
        AppMethodBeat.o(28741);
        throw paramArrayOfObject;
      }
      if (this.vHl != null)
        paramArrayOfObject.e(1, this.vHl);
      paramArrayOfObject.ai(2, this.wOP);
      paramArrayOfObject.aO(3, this.xqF);
      AppMethodBeat.o(28741);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHl == null)
        break label378;
    label378: for (paramInt = e.a.a.b.b.a.f(1, this.vHl) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.wOP) + (e.a.a.b.b.a.fv(3) + 1);
      AppMethodBeat.o(28741);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Username");
          AppMethodBeat.o(28741);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28741);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cud localcud = (cud)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28741);
          break;
        case 1:
          localcud.vHl = locala.BTU.readString();
          AppMethodBeat.o(28741);
          paramInt = i;
          break;
        case 2:
          localcud.wOP = locala.BTU.ve();
          AppMethodBeat.o(28741);
          paramInt = i;
          break;
        case 3:
          localcud.xqF = locala.BTU.ehX();
          AppMethodBeat.o(28741);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28741);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cud
 * JD-Core Version:    0.6.2
 */