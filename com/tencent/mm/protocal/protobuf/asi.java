package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class asi extends com.tencent.mm.bt.a
{
  public String cIY;
  public String url;
  public String wvU;
  public String wvV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48863);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wvU != null)
        paramArrayOfObject.e(1, this.wvU);
      if (this.wvV != null)
        paramArrayOfObject.e(2, this.wvV);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      if (this.cIY != null)
        paramArrayOfObject.e(4, this.cIY);
      AppMethodBeat.o(48863);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wvU == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.wvU) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wvV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wvV);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.url);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.cIY);
      AppMethodBeat.o(48863);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48863);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        asi localasi = (asi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48863);
          break;
        case 1:
          localasi.wvU = locala.BTU.readString();
          AppMethodBeat.o(48863);
          paramInt = i;
          break;
        case 2:
          localasi.wvV = locala.BTU.readString();
          AppMethodBeat.o(48863);
          paramInt = i;
          break;
        case 3:
          localasi.url = locala.BTU.readString();
          AppMethodBeat.o(48863);
          paramInt = i;
          break;
        case 4:
          localasi.cIY = locala.BTU.readString();
          AppMethodBeat.o(48863);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48863);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asi
 * JD-Core Version:    0.6.2
 */