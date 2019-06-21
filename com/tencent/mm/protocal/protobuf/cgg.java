package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cgg extends com.tencent.mm.bt.a
{
  public int xfo;
  public String xfp;
  public String xfq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124366);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xfo);
      if (this.xfp != null)
        paramArrayOfObject.e(2, this.xfp);
      if (this.xfq != null)
        paramArrayOfObject.e(3, this.xfq);
      AppMethodBeat.o(124366);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xfo) + 0;
        paramInt = i;
        if (this.xfp != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xfp);
        i = paramInt;
        if (this.xfq != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.xfq);
        AppMethodBeat.o(124366);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124366);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cgg localcgg = (cgg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124366);
          break;
        case 1:
          localcgg.xfo = locala.BTU.vd();
          AppMethodBeat.o(124366);
          paramInt = 0;
          break;
        case 2:
          localcgg.xfp = locala.BTU.readString();
          AppMethodBeat.o(124366);
          paramInt = 0;
          break;
        case 3:
          localcgg.xfq = locala.BTU.readString();
          AppMethodBeat.o(124366);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124366);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgg
 * JD-Core Version:    0.6.2
 */