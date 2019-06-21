package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cdm extends com.tencent.mm.bt.a
{
  public String content;
  public String type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28658);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.type == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: type");
        AppMethodBeat.o(28658);
        throw paramArrayOfObject;
      }
      if (this.type != null)
        paramArrayOfObject.e(1, this.type);
      if (this.content != null)
        paramArrayOfObject.e(2, this.content);
      AppMethodBeat.o(28658);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.type == null)
        break label350;
    label350: for (paramInt = e.a.a.b.b.a.f(1, this.type) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.content != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.content);
      AppMethodBeat.o(28658);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.type == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: type");
          AppMethodBeat.o(28658);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28658);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cdm localcdm = (cdm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28658);
          paramInt = -1;
          break;
        case 1:
          localcdm.type = locala.BTU.readString();
          AppMethodBeat.o(28658);
          paramInt = i;
          break;
        case 2:
          localcdm.content = locala.BTU.readString();
          AppMethodBeat.o(28658);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28658);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdm
 * JD-Core Version:    0.6.2
 */