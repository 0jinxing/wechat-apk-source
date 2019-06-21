package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bdl extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String jBB;
  public long ptF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(118281);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      paramArrayOfObject.ai(4, this.ptF);
      AppMethodBeat.o(118281);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label400;
    label400: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Desc);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBB);
      paramInt = i + e.a.a.b.b.a.o(4, this.ptF);
      AppMethodBeat.o(118281);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(118281);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdl localbdl = (bdl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(118281);
          break;
        case 1:
          localbdl.Title = locala.BTU.readString();
          AppMethodBeat.o(118281);
          paramInt = i;
          break;
        case 2:
          localbdl.Desc = locala.BTU.readString();
          AppMethodBeat.o(118281);
          paramInt = i;
          break;
        case 3:
          localbdl.jBB = locala.BTU.readString();
          AppMethodBeat.o(118281);
          paramInt = i;
          break;
        case 4:
          localbdl.ptF = locala.BTU.ve();
          AppMethodBeat.o(118281);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(118281);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdl
 * JD-Core Version:    0.6.2
 */