package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class nm extends com.tencent.mm.bt.a
{
  public int kdC;
  public String text;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89018);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.kdC);
      if (this.text != null)
        paramArrayOfObject.e(2, this.text);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      AppMethodBeat.o(89018);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.kdC) + 0;
        paramInt = i;
        if (this.text != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.text);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.url);
        AppMethodBeat.o(89018);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89018);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        nm localnm = (nm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89018);
          break;
        case 1:
          localnm.kdC = locala.BTU.vd();
          AppMethodBeat.o(89018);
          paramInt = 0;
          break;
        case 2:
          localnm.text = locala.BTU.readString();
          AppMethodBeat.o(89018);
          paramInt = 0;
          break;
        case 3:
          localnm.url = locala.BTU.readString();
          AppMethodBeat.o(89018);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89018);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nm
 * JD-Core Version:    0.6.2
 */