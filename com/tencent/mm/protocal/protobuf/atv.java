package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atv extends com.tencent.mm.bt.a
{
  public String Title;
  public String Url;
  public String ncH;
  public String wxR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28528);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Url != null)
        paramArrayOfObject.e(1, this.Url);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.wxR != null)
        paramArrayOfObject.e(3, this.wxR);
      if (this.ncH != null)
        paramArrayOfObject.e(4, this.ncH);
      AppMethodBeat.o(28528);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Url == null)
        break label426;
    label426: for (i = e.a.a.b.b.a.f(1, this.Url) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Title);
      i = paramInt;
      if (this.wxR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wxR);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ncH);
      AppMethodBeat.o(28528);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28528);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atv localatv = (atv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28528);
          break;
        case 1:
          localatv.Url = locala.BTU.readString();
          AppMethodBeat.o(28528);
          paramInt = i;
          break;
        case 2:
          localatv.Title = locala.BTU.readString();
          AppMethodBeat.o(28528);
          paramInt = i;
          break;
        case 3:
          localatv.wxR = locala.BTU.readString();
          AppMethodBeat.o(28528);
          paramInt = i;
          break;
        case 4:
          localatv.ncH = locala.BTU.readString();
          AppMethodBeat.o(28528);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28528);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atv
 * JD-Core Version:    0.6.2
 */