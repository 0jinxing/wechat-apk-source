package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cus extends com.tencent.mm.bt.a
{
  public int Scene;
  public com.tencent.mm.bt.b vHn;
  public String wyw;
  public long xqQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28760);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wyw == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Talker");
        AppMethodBeat.o(28760);
        throw paramArrayOfObject;
      }
      if (this.vHn == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
        AppMethodBeat.o(28760);
        throw paramArrayOfObject;
      }
      if (this.wyw != null)
        paramArrayOfObject.e(1, this.wyw);
      paramArrayOfObject.ai(2, this.xqQ);
      if (this.vHn != null)
        paramArrayOfObject.c(3, this.vHn);
      paramArrayOfObject.iz(4, this.Scene);
      AppMethodBeat.o(28760);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wyw == null)
        break label494;
    label494: for (paramInt = e.a.a.b.b.a.f(1, this.wyw) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.xqQ);
      paramInt = i;
      if (this.vHn != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.vHn);
      paramInt += e.a.a.b.b.a.bs(4, this.Scene);
      AppMethodBeat.o(28760);
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
          AppMethodBeat.o(28760);
          throw paramArrayOfObject;
        }
        if (this.vHn == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
          AppMethodBeat.o(28760);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28760);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cus localcus = (cus)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28760);
          break;
        case 1:
          localcus.wyw = locala.BTU.readString();
          AppMethodBeat.o(28760);
          paramInt = i;
          break;
        case 2:
          localcus.xqQ = locala.BTU.ve();
          AppMethodBeat.o(28760);
          paramInt = i;
          break;
        case 3:
          localcus.vHn = locala.BTU.emu();
          AppMethodBeat.o(28760);
          paramInt = i;
          break;
        case 4:
          localcus.Scene = locala.BTU.vd();
          AppMethodBeat.o(28760);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28760);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cus
 * JD-Core Version:    0.6.2
 */