package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axi extends com.tencent.mm.bt.a
{
  public int type;
  public String url;
  public String vTT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56848);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.vTT != null)
        paramArrayOfObject.e(3, this.vTT);
      AppMethodBeat.o(56848);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.url != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.url);
        i = paramInt;
        if (this.vTT != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vTT);
        AppMethodBeat.o(56848);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56848);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axi localaxi = (axi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56848);
          break;
        case 1:
          localaxi.type = locala.BTU.vd();
          AppMethodBeat.o(56848);
          paramInt = 0;
          break;
        case 2:
          localaxi.url = locala.BTU.readString();
          AppMethodBeat.o(56848);
          paramInt = 0;
          break;
        case 3:
          localaxi.vTT = locala.BTU.readString();
          AppMethodBeat.o(56848);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56848);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axi
 * JD-Core Version:    0.6.2
 */