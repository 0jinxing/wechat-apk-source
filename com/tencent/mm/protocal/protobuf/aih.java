package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class aih extends com.tencent.mm.bt.a
{
  public String Md5;
  public String wot;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62553);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wot == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ActivityId");
        AppMethodBeat.o(62553);
        throw paramArrayOfObject;
      }
      if (this.wot != null)
        paramArrayOfObject.e(1, this.wot);
      if (this.Md5 != null)
        paramArrayOfObject.e(2, this.Md5);
      AppMethodBeat.o(62553);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wot == null)
        break label338;
    label338: for (i = e.a.a.b.b.a.f(1, this.wot) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Md5);
      AppMethodBeat.o(62553);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wot == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ActivityId");
          AppMethodBeat.o(62553);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62553);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aih localaih = (aih)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(62553);
          paramInt = -1;
          break;
        case 1:
          localaih.wot = locala.BTU.readString();
          AppMethodBeat.o(62553);
          paramInt = i;
          break;
        case 2:
          localaih.Md5 = locala.BTU.readString();
          AppMethodBeat.o(62553);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(62553);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aih
 * JD-Core Version:    0.6.2
 */