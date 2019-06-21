package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bdy extends com.tencent.mm.bt.a
{
  public String desc;
  public String title;
  public String vTT;
  public int wHD;
  public int wHE;
  public String wdd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56863);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.wdd != null)
        paramArrayOfObject.e(3, this.wdd);
      paramArrayOfObject.iz(4, this.wHD);
      paramArrayOfObject.iz(5, this.wHE);
      if (this.vTT != null)
        paramArrayOfObject.e(6, this.vTT);
      AppMethodBeat.o(56863);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label510;
    label510: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      i = paramInt;
      if (this.wdd != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wdd);
      i = i + e.a.a.b.b.a.bs(4, this.wHD) + e.a.a.b.b.a.bs(5, this.wHE);
      paramInt = i;
      if (this.vTT != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vTT);
      AppMethodBeat.o(56863);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56863);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bdy localbdy = (bdy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56863);
          break;
        case 1:
          localbdy.title = locala.BTU.readString();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        case 2:
          localbdy.desc = locala.BTU.readString();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        case 3:
          localbdy.wdd = locala.BTU.readString();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        case 4:
          localbdy.wHD = locala.BTU.vd();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        case 5:
          localbdy.wHE = locala.BTU.vd();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        case 6:
          localbdy.vTT = locala.BTU.readString();
          AppMethodBeat.o(56863);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56863);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdy
 * JD-Core Version:    0.6.2
 */