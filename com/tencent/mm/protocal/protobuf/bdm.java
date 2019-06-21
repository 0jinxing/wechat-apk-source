package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bdm extends com.tencent.mm.bt.a
{
  public String content;
  public String lang;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(90694);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lang == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: lang");
        AppMethodBeat.o(90694);
        throw paramArrayOfObject;
      }
      if (this.content == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: content");
        AppMethodBeat.o(90694);
        throw paramArrayOfObject;
      }
      if (this.lang != null)
        paramArrayOfObject.e(1, this.lang);
      if (this.content != null)
        paramArrayOfObject.e(2, this.content);
      AppMethodBeat.o(90694);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.lang == null)
        break label386;
    label386: for (i = e.a.a.b.b.a.f(1, this.lang) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.content);
      AppMethodBeat.o(90694);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.lang == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: lang");
          AppMethodBeat.o(90694);
          throw paramArrayOfObject;
        }
        if (this.content == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: content");
          AppMethodBeat.o(90694);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(90694);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdm localbdm = (bdm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(90694);
          paramInt = -1;
          break;
        case 1:
          localbdm.lang = locala.BTU.readString();
          AppMethodBeat.o(90694);
          paramInt = i;
          break;
        case 2:
          localbdm.content = locala.BTU.readString();
          AppMethodBeat.o(90694);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(90694);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdm
 * JD-Core Version:    0.6.2
 */