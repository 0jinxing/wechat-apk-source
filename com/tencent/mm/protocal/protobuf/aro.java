package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aro extends com.tencent.mm.bt.a
{
  public String Desc;
  public String IconUrl;
  public String Title;
  public String wvB;
  public String wvC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80105);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wvB != null)
        paramArrayOfObject.e(1, this.wvB);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.wvC != null)
        paramArrayOfObject.e(5, this.wvC);
      AppMethodBeat.o(80105);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wvB == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.wvB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.IconUrl);
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Title);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Desc);
      i = paramInt;
      if (this.wvC != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wvC);
      AppMethodBeat.o(80105);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80105);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aro localaro = (aro)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80105);
          break;
        case 1:
          localaro.wvB = locala.BTU.readString();
          AppMethodBeat.o(80105);
          paramInt = i;
          break;
        case 2:
          localaro.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(80105);
          paramInt = i;
          break;
        case 3:
          localaro.Title = locala.BTU.readString();
          AppMethodBeat.o(80105);
          paramInt = i;
          break;
        case 4:
          localaro.Desc = locala.BTU.readString();
          AppMethodBeat.o(80105);
          paramInt = i;
          break;
        case 5:
          localaro.wvC = locala.BTU.readString();
          AppMethodBeat.o(80105);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80105);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aro
 * JD-Core Version:    0.6.2
 */