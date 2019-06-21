package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bir extends com.tencent.mm.bt.a
{
  public String qkq;
  public String url;
  public long wMc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48917);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qkq != null)
        paramArrayOfObject.e(1, this.qkq);
      paramArrayOfObject.ai(2, this.wMc);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      AppMethodBeat.o(48917);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.qkq == null)
        break label337;
    label337: for (paramInt = e.a.a.b.b.a.f(1, this.qkq) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.wMc);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.url);
      AppMethodBeat.o(48917);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48917);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bir localbir = (bir)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48917);
          break;
        case 1:
          localbir.qkq = locala.BTU.readString();
          AppMethodBeat.o(48917);
          paramInt = i;
          break;
        case 2:
          localbir.wMc = locala.BTU.ve();
          AppMethodBeat.o(48917);
          paramInt = i;
          break;
        case 3:
          localbir.url = locala.BTU.readString();
          AppMethodBeat.o(48917);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48917);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bir
 * JD-Core Version:    0.6.2
 */