package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bbd extends com.tencent.mm.bt.a
{
  public String color;
  public String jMS;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48886);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jMS != null)
        paramArrayOfObject.e(1, this.jMS);
      if (this.color != null)
        paramArrayOfObject.e(2, this.color);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      AppMethodBeat.o(48886);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jMS == null)
        break label361;
    label361: for (i = e.a.a.b.b.a.f(1, this.jMS) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.color != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.color);
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.url);
      AppMethodBeat.o(48886);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48886);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbd localbbd = (bbd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 3:
        default:
          AppMethodBeat.o(48886);
          paramInt = -1;
          break;
        case 1:
          localbbd.jMS = locala.BTU.readString();
          AppMethodBeat.o(48886);
          paramInt = i;
          break;
        case 2:
          localbbd.color = locala.BTU.readString();
          AppMethodBeat.o(48886);
          paramInt = i;
          break;
        case 4:
          localbbd.url = locala.BTU.readString();
          AppMethodBeat.o(48886);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(48886);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbd
 * JD-Core Version:    0.6.2
 */