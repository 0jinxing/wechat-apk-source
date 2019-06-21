package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cym extends com.tencent.mm.bt.a
{
  public String fha;
  public String title;
  public int xtG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28775);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fha == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rankid");
        AppMethodBeat.o(28775);
        throw paramArrayOfObject;
      }
      if (this.title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: title");
        AppMethodBeat.o(28775);
        throw paramArrayOfObject;
      }
      if (this.fha != null)
        paramArrayOfObject.e(1, this.fha);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      paramArrayOfObject.iz(3, this.xtG);
      AppMethodBeat.o(28775);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fha == null)
        break label446;
    label446: for (paramInt = e.a.a.b.b.a.f(1, this.fha) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.title);
      paramInt = i + e.a.a.b.b.a.bs(3, this.xtG);
      AppMethodBeat.o(28775);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fha == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rankid");
          AppMethodBeat.o(28775);
          throw paramArrayOfObject;
        }
        if (this.title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: title");
          AppMethodBeat.o(28775);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28775);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cym localcym = (cym)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28775);
          break;
        case 1:
          localcym.fha = locala.BTU.readString();
          AppMethodBeat.o(28775);
          paramInt = i;
          break;
        case 2:
          localcym.title = locala.BTU.readString();
          AppMethodBeat.o(28775);
          paramInt = i;
          break;
        case 3:
          localcym.xtG = locala.BTU.vd();
          AppMethodBeat.o(28775);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28775);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cym
 * JD-Core Version:    0.6.2
 */