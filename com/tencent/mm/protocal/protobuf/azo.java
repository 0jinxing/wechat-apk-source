package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azo extends com.tencent.mm.bt.a
{
  public String Title;
  public int vEq;
  public String wDw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11786);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wDw != null)
        paramArrayOfObject.e(1, this.wDw);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      paramArrayOfObject.iz(3, this.vEq);
      AppMethodBeat.o(11786);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wDw == null)
        break label346;
    label346: for (paramInt = e.a.a.b.b.a.f(1, this.wDw) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      paramInt = i + e.a.a.b.b.a.bs(3, this.vEq);
      AppMethodBeat.o(11786);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11786);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azo localazo = (azo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11786);
          break;
        case 1:
          localazo.wDw = locala.BTU.readString();
          AppMethodBeat.o(11786);
          paramInt = i;
          break;
        case 2:
          localazo.Title = locala.BTU.readString();
          AppMethodBeat.o(11786);
          paramInt = i;
          break;
        case 3:
          localazo.vEq = locala.BTU.vd();
          AppMethodBeat.o(11786);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11786);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azo
 * JD-Core Version:    0.6.2
 */