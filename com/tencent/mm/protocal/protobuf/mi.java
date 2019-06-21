package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class mi extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String vQh;
  public String vQi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124296);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.IconUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconUrl");
        AppMethodBeat.o(124296);
        throw paramArrayOfObject;
      }
      if (this.IconUrl != null)
        paramArrayOfObject.e(1, this.IconUrl);
      if (this.vQh != null)
        paramArrayOfObject.e(2, this.vQh);
      if (this.vQi != null)
        paramArrayOfObject.e(3, this.vQi);
      AppMethodBeat.o(124296);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.IconUrl == null)
        break label405;
    label405: for (i = e.a.a.b.b.a.f(1, this.IconUrl) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vQh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vQh);
      i = paramInt;
      if (this.vQi != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vQi);
      AppMethodBeat.o(124296);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.IconUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconUrl");
          AppMethodBeat.o(124296);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124296);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mi localmi = (mi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124296);
          break;
        case 1:
          localmi.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(124296);
          paramInt = i;
          break;
        case 2:
          localmi.vQh = locala.BTU.readString();
          AppMethodBeat.o(124296);
          paramInt = i;
          break;
        case 3:
          localmi.vQi = locala.BTU.readString();
          AppMethodBeat.o(124296);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124296);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mi
 * JD-Core Version:    0.6.2
 */