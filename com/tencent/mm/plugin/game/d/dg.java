package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dg extends com.tencent.mm.bt.a
{
  public String mZL;
  public String mZi;
  public String mZj;
  public int ndE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111673);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZi != null)
        paramArrayOfObject.e(1, this.mZi);
      if (this.mZj != null)
        paramArrayOfObject.e(2, this.mZj);
      paramArrayOfObject.iz(3, this.ndE);
      if (this.mZL != null)
        paramArrayOfObject.e(4, this.mZL);
      AppMethodBeat.o(111673);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZi == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.mZi) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZj);
      i += e.a.a.b.b.a.bs(3, this.ndE);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mZL);
      AppMethodBeat.o(111673);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111673);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dg localdg = (dg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111673);
          break;
        case 1:
          localdg.mZi = locala.BTU.readString();
          AppMethodBeat.o(111673);
          paramInt = i;
          break;
        case 2:
          localdg.mZj = locala.BTU.readString();
          AppMethodBeat.o(111673);
          paramInt = i;
          break;
        case 3:
          localdg.ndE = locala.BTU.vd();
          AppMethodBeat.o(111673);
          paramInt = i;
          break;
        case 4:
          localdg.mZL = locala.BTU.readString();
          AppMethodBeat.o(111673);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111673);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dg
 * JD-Core Version:    0.6.2
 */