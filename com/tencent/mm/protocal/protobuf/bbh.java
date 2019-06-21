package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbh extends com.tencent.mm.bt.a
{
  public String desc;
  public String kbV;
  public String path;
  public String title;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56854);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kbV != null)
        paramArrayOfObject.e(1, this.kbV);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      if (this.username != null)
        paramArrayOfObject.e(4, this.username);
      if (this.path != null)
        paramArrayOfObject.e(5, this.path);
      AppMethodBeat.o(56854);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kbV == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.kbV) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.title);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.desc);
      paramInt = i;
      if (this.username != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.username);
      i = paramInt;
      if (this.path != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.path);
      AppMethodBeat.o(56854);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56854);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbh localbbh = (bbh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56854);
          break;
        case 1:
          localbbh.kbV = locala.BTU.readString();
          AppMethodBeat.o(56854);
          paramInt = i;
          break;
        case 2:
          localbbh.title = locala.BTU.readString();
          AppMethodBeat.o(56854);
          paramInt = i;
          break;
        case 3:
          localbbh.desc = locala.BTU.readString();
          AppMethodBeat.o(56854);
          paramInt = i;
          break;
        case 4:
          localbbh.username = locala.BTU.readString();
          AppMethodBeat.o(56854);
          paramInt = i;
          break;
        case 5:
          localbbh.path = locala.BTU.readString();
          AppMethodBeat.o(56854);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56854);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbh
 * JD-Core Version:    0.6.2
 */