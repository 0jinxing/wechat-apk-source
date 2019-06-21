package com.tencent.mm.plugin.order.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends com.tencent.mm.bt.a
{
  public String ThumbUrl;
  public String pdB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56620);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(1, this.ThumbUrl);
      if (this.pdB != null)
        paramArrayOfObject.e(2, this.pdB);
      AppMethodBeat.o(56620);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ThumbUrl == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.ThumbUrl) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pdB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pdB);
      AppMethodBeat.o(56620);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56620);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(56620);
          paramInt = -1;
          break;
        case 1:
          localk.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(56620);
          paramInt = i;
          break;
        case 2:
          localk.pdB = locala.BTU.readString();
          AppMethodBeat.o(56620);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(56620);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.k
 * JD-Core Version:    0.6.2
 */