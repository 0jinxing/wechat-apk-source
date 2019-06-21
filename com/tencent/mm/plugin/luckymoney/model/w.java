package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w extends com.tencent.mm.bt.a
{
  public String nWX;
  public long nXM;
  public String nXN;
  public String nXZ;
  public String nYa;
  public String nYb;
  public String nYc;
  public String userName;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56615);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nXZ != null)
        paramArrayOfObject.e(1, this.nXZ);
      if (this.nYa != null)
        paramArrayOfObject.e(2, this.nYa);
      paramArrayOfObject.ai(3, this.nXM);
      if (this.nXN != null)
        paramArrayOfObject.e(4, this.nXN);
      if (this.nYb != null)
        paramArrayOfObject.e(5, this.nYb);
      if (this.nWX != null)
        paramArrayOfObject.e(6, this.nWX);
      if (this.nYc != null)
        paramArrayOfObject.e(7, this.nYc);
      if (this.userName != null)
        paramArrayOfObject.e(8, this.userName);
      AppMethodBeat.o(56615);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.nXZ == null)
        break label660;
    label660: for (paramInt = e.a.a.b.b.a.f(1, this.nXZ) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nYa != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nYa);
      i += e.a.a.b.b.a.o(3, this.nXM);
      paramInt = i;
      if (this.nXN != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nXN);
      i = paramInt;
      if (this.nYb != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.nYb);
      paramInt = i;
      if (this.nWX != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.nWX);
      i = paramInt;
      if (this.nYc != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.nYc);
      paramInt = i;
      if (this.userName != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.userName);
      AppMethodBeat.o(56615);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56615);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        w localw = (w)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56615);
          break;
        case 1:
          localw.nXZ = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 2:
          localw.nYa = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 3:
          localw.nXM = locala.BTU.ve();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 4:
          localw.nXN = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 5:
          localw.nYb = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 6:
          localw.nWX = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 7:
          localw.nYc = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        case 8:
          localw.userName = locala.BTU.readString();
          AppMethodBeat.o(56615);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56615);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.w
 * JD-Core Version:    0.6.2
 */