package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class blr extends com.tencent.mm.bt.a
{
  public String cEh;
  public String url;
  public String wOM;
  public int wON;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(852);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cEh != null)
        paramArrayOfObject.e(1, this.cEh);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.wOM != null)
        paramArrayOfObject.e(3, this.wOM);
      paramArrayOfObject.iz(4, this.wON);
      AppMethodBeat.o(852);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cEh == null)
        break label410;
    label410: for (i = e.a.a.b.b.a.f(1, this.cEh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.wOM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wOM);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wON);
      AppMethodBeat.o(852);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(852);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        blr localblr = (blr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(852);
          break;
        case 1:
          localblr.cEh = locala.BTU.readString();
          AppMethodBeat.o(852);
          paramInt = i;
          break;
        case 2:
          localblr.url = locala.BTU.readString();
          AppMethodBeat.o(852);
          paramInt = i;
          break;
        case 3:
          localblr.wOM = locala.BTU.readString();
          AppMethodBeat.o(852);
          paramInt = i;
          break;
        case 4:
          localblr.wON = locala.BTU.vd();
          AppMethodBeat.o(852);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(852);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blr
 * JD-Core Version:    0.6.2
 */