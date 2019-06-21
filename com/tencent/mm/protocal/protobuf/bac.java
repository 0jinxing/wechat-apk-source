package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bac extends com.tencent.mm.bt.a
{
  public String fjx;
  public String fjz;
  public String title;
  public String wDU;
  public String wDV;
  public String wDW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.fjz != null)
        paramArrayOfObject.e(2, this.fjz);
      if (this.fjx != null)
        paramArrayOfObject.e(3, this.fjx);
      if (this.wDU != null)
        paramArrayOfObject.e(4, this.wDU);
      if (this.wDV != null)
        paramArrayOfObject.e(5, this.wDV);
      if (this.wDW != null)
        paramArrayOfObject.e(6, this.wDW);
      AppMethodBeat.o(14732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label558;
    label558: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fjz != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fjz);
      paramInt = i;
      if (this.fjx != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.fjx);
      i = paramInt;
      if (this.wDU != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wDU);
      paramInt = i;
      if (this.wDV != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wDV);
      i = paramInt;
      if (this.wDW != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wDW);
      AppMethodBeat.o(14732);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bac localbac = (bac)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14732);
          break;
        case 1:
          localbac.title = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        case 2:
          localbac.fjz = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        case 3:
          localbac.fjx = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        case 4:
          localbac.wDU = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        case 5:
          localbac.wDV = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        case 6:
          localbac.wDW = locala.BTU.readString();
          AppMethodBeat.o(14732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bac
 * JD-Core Version:    0.6.2
 */