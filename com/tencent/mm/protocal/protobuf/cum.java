package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cum extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vHn;
  public long vIs;
  public int xqP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28753);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHn == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
        AppMethodBeat.o(28753);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vIs);
      if (this.vHn != null)
        paramArrayOfObject.c(2, this.vHn);
      paramArrayOfObject.iz(3, this.xqP);
      AppMethodBeat.o(28753);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.vIs) + 0;
        paramInt = i;
        if (this.vHn != null)
          paramInt = i + e.a.a.b.b.a.b(2, this.vHn);
        paramInt += e.a.a.b.b.a.bs(3, this.xqP);
        AppMethodBeat.o(28753);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHn == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
          AppMethodBeat.o(28753);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28753);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cum localcum = (cum)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28753);
          break;
        case 1:
          localcum.vIs = locala.BTU.ve();
          AppMethodBeat.o(28753);
          paramInt = 0;
          break;
        case 2:
          localcum.vHn = locala.BTU.emu();
          AppMethodBeat.o(28753);
          paramInt = 0;
          break;
        case 3:
          localcum.xqP = locala.BTU.vd();
          AppMethodBeat.o(28753);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28753);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cum
 * JD-Core Version:    0.6.2
 */