package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aue extends com.tencent.mm.bt.a
{
  public String desc;
  public String title;
  public String wyc;
  public String wyd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10196);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.wyc != null)
        paramArrayOfObject.e(3, this.wyc);
      if (this.wyd != null)
        paramArrayOfObject.e(4, this.wyd);
      AppMethodBeat.o(10196);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label426;
    label426: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      i = paramInt;
      if (this.wyc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wyc);
      paramInt = i;
      if (this.wyd != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wyd);
      AppMethodBeat.o(10196);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10196);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aue localaue = (aue)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10196);
          break;
        case 1:
          localaue.title = locala.BTU.readString();
          AppMethodBeat.o(10196);
          paramInt = i;
          break;
        case 2:
          localaue.desc = locala.BTU.readString();
          AppMethodBeat.o(10196);
          paramInt = i;
          break;
        case 3:
          localaue.wyc = locala.BTU.readString();
          AppMethodBeat.o(10196);
          paramInt = i;
          break;
        case 4:
          localaue.wyd = locala.BTU.readString();
          AppMethodBeat.o(10196);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10196);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aue
 * JD-Core Version:    0.6.2
 */