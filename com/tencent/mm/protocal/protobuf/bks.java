package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bks extends com.tencent.mm.bt.a
{
  public String tod;
  public String wNN;
  public String wNO;
  public String wdd;
  public int wvn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48925);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wNN != null)
        paramArrayOfObject.e(1, this.wNN);
      if (this.wNO != null)
        paramArrayOfObject.e(2, this.wNO);
      if (this.tod != null)
        paramArrayOfObject.e(3, this.tod);
      if (this.wdd != null)
        paramArrayOfObject.e(4, this.wdd);
      paramArrayOfObject.iz(5, this.wvn);
      AppMethodBeat.o(48925);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wNN == null)
        break label463;
    label463: for (paramInt = e.a.a.b.b.a.f(1, this.wNN) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wNO != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wNO);
      paramInt = i;
      if (this.tod != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.tod);
      i = paramInt;
      if (this.wdd != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wdd);
      paramInt = i + e.a.a.b.b.a.bs(5, this.wvn);
      AppMethodBeat.o(48925);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48925);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bks localbks = (bks)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48925);
          break;
        case 1:
          localbks.wNN = locala.BTU.readString();
          AppMethodBeat.o(48925);
          paramInt = i;
          break;
        case 2:
          localbks.wNO = locala.BTU.readString();
          AppMethodBeat.o(48925);
          paramInt = i;
          break;
        case 3:
          localbks.tod = locala.BTU.readString();
          AppMethodBeat.o(48925);
          paramInt = i;
          break;
        case 4:
          localbks.wdd = locala.BTU.readString();
          AppMethodBeat.o(48925);
          paramInt = i;
          break;
        case 5:
          localbks.wvn = locala.BTU.vd();
          AppMethodBeat.o(48925);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48925);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bks
 * JD-Core Version:    0.6.2
 */