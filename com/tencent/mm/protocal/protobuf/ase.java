package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ase extends com.tencent.mm.bt.a
{
  public String cIY;
  public String desc;
  public String title;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56839);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      AppMethodBeat.o(56839);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      paramInt = i;
      if (this.cIY != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.cIY);
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.url);
      AppMethodBeat.o(56839);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56839);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ase localase = (ase)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56839);
          break;
        case 1:
          localase.title = locala.BTU.readString();
          AppMethodBeat.o(56839);
          paramInt = i;
          break;
        case 2:
          localase.desc = locala.BTU.readString();
          AppMethodBeat.o(56839);
          paramInt = i;
          break;
        case 3:
          localase.cIY = locala.BTU.readString();
          AppMethodBeat.o(56839);
          paramInt = i;
          break;
        case 4:
          localase.url = locala.BTU.readString();
          AppMethodBeat.o(56839);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56839);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ase
 * JD-Core Version:    0.6.2
 */