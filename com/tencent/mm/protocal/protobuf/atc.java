package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atc extends com.tencent.mm.bt.a
{
  public String wwU;
  public String wwV;
  public String wwW;
  public String wwX;
  public String wwY;
  public String wwZ;
  public String wxa;
  public String wxb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56844);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wwU != null)
        paramArrayOfObject.e(1, this.wwU);
      if (this.wwV != null)
        paramArrayOfObject.e(2, this.wwV);
      if (this.wwW != null)
        paramArrayOfObject.e(3, this.wwW);
      if (this.wwX != null)
        paramArrayOfObject.e(4, this.wwX);
      if (this.wwY != null)
        paramArrayOfObject.e(5, this.wwY);
      if (this.wwZ != null)
        paramArrayOfObject.e(6, this.wwZ);
      if (this.wxa != null)
        paramArrayOfObject.e(7, this.wxa);
      if (this.wxb != null)
        paramArrayOfObject.e(8, this.wxb);
      AppMethodBeat.o(56844);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wwU == null)
        break label676;
    label676: for (paramInt = e.a.a.b.b.a.f(1, this.wwU) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wwV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wwV);
      paramInt = i;
      if (this.wwW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wwW);
      i = paramInt;
      if (this.wwX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wwX);
      paramInt = i;
      if (this.wwY != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wwY);
      i = paramInt;
      if (this.wwZ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wwZ);
      paramInt = i;
      if (this.wxa != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wxa);
      i = paramInt;
      if (this.wxb != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wxb);
      AppMethodBeat.o(56844);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56844);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atc localatc = (atc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56844);
          break;
        case 1:
          localatc.wwU = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 2:
          localatc.wwV = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 3:
          localatc.wwW = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 4:
          localatc.wwX = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 5:
          localatc.wwY = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 6:
          localatc.wwZ = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 7:
          localatc.wxa = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        case 8:
          localatc.wxb = locala.BTU.readString();
          AppMethodBeat.o(56844);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56844);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atc
 * JD-Core Version:    0.6.2
 */