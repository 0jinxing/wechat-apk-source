package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class k extends com.tencent.mm.bt.a
{
  public String Url;
  public String mZR;
  public String mZS;
  public String mZT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111551);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Message");
        AppMethodBeat.o(111551);
        throw paramArrayOfObject;
      }
      if (this.mZS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: GotoBtn");
        AppMethodBeat.o(111551);
        throw paramArrayOfObject;
      }
      if (this.mZT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CancelBtn");
        AppMethodBeat.o(111551);
        throw paramArrayOfObject;
      }
      if (this.Url == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Url");
        AppMethodBeat.o(111551);
        throw paramArrayOfObject;
      }
      if (this.mZR != null)
        paramArrayOfObject.e(1, this.mZR);
      if (this.mZS != null)
        paramArrayOfObject.e(2, this.mZS);
      if (this.mZT != null)
        paramArrayOfObject.e(3, this.mZT);
      if (this.Url != null)
        paramArrayOfObject.e(4, this.Url);
      AppMethodBeat.o(111551);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZR == null)
        break label608;
    label608: for (i = e.a.a.b.b.a.f(1, this.mZR) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZS != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZS);
      i = paramInt;
      if (this.mZT != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZT);
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Url);
      AppMethodBeat.o(111551);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Message");
          AppMethodBeat.o(111551);
          throw paramArrayOfObject;
        }
        if (this.mZS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: GotoBtn");
          AppMethodBeat.o(111551);
          throw paramArrayOfObject;
        }
        if (this.mZT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CancelBtn");
          AppMethodBeat.o(111551);
          throw paramArrayOfObject;
        }
        if (this.Url == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Url");
          AppMethodBeat.o(111551);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111551);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111551);
          break;
        case 1:
          localk.mZR = locala.BTU.readString();
          AppMethodBeat.o(111551);
          paramInt = i;
          break;
        case 2:
          localk.mZS = locala.BTU.readString();
          AppMethodBeat.o(111551);
          paramInt = i;
          break;
        case 3:
          localk.mZT = locala.BTU.readString();
          AppMethodBeat.o(111551);
          paramInt = i;
          break;
        case 4:
          localk.Url = locala.BTU.readString();
          AppMethodBeat.o(111551);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111551);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.k
 * JD-Core Version:    0.6.2
 */