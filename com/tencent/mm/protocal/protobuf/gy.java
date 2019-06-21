package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class gy extends com.tencent.mm.bt.a
{
  public String title;
  public int ttd;
  public String tte;
  public String ttg;
  public String tzW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56707);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      paramArrayOfObject.iz(2, this.ttd);
      if (this.tte != null)
        paramArrayOfObject.e(3, this.tte);
      if (this.tzW != null)
        paramArrayOfObject.e(4, this.tzW);
      if (this.ttg != null)
        paramArrayOfObject.e(5, this.ttg);
      AppMethodBeat.o(56707);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label467;
    label467: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.ttd);
      i = paramInt;
      if (this.tte != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.tte);
      paramInt = i;
      if (this.tzW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tzW);
      i = paramInt;
      if (this.ttg != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ttg);
      AppMethodBeat.o(56707);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56707);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        gy localgy = (gy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56707);
          break;
        case 1:
          localgy.title = locala.BTU.readString();
          AppMethodBeat.o(56707);
          paramInt = i;
          break;
        case 2:
          localgy.ttd = locala.BTU.vd();
          AppMethodBeat.o(56707);
          paramInt = i;
          break;
        case 3:
          localgy.tte = locala.BTU.readString();
          AppMethodBeat.o(56707);
          paramInt = i;
          break;
        case 4:
          localgy.tzW = locala.BTU.readString();
          AppMethodBeat.o(56707);
          paramInt = i;
          break;
        case 5:
          localgy.ttg = locala.BTU.readString();
          AppMethodBeat.o(56707);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56707);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gy
 * JD-Core Version:    0.6.2
 */