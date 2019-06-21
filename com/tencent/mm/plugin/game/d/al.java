package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class al extends com.tencent.mm.bt.a
{
  public String Title;
  public String mZL;
  public int mZN;
  public String mZj;
  public String naV;
  public boolean naW;
  public boolean naX;
  public String naY;
  public String naZ;
  public int nba;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111577);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111577);
        throw paramArrayOfObject;
      }
      if (this.naV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NavKey");
        AppMethodBeat.o(111577);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.naV != null)
        paramArrayOfObject.e(2, this.naV);
      if (this.mZj != null)
        paramArrayOfObject.e(3, this.mZj);
      paramArrayOfObject.aO(4, this.naW);
      paramArrayOfObject.aO(5, this.naX);
      if (this.naY != null)
        paramArrayOfObject.e(6, this.naY);
      if (this.naZ != null)
        paramArrayOfObject.e(7, this.naZ);
      paramArrayOfObject.iz(8, this.nba);
      paramArrayOfObject.iz(9, this.mZN);
      if (this.mZL != null)
        paramArrayOfObject.e(10, this.mZL);
      AppMethodBeat.o(111577);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label830;
    label830: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.naV != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.naV);
      i = paramInt;
      if (this.mZj != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZj);
      i = i + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1);
      paramInt = i;
      if (this.naY != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.naY);
      i = paramInt;
      if (this.naZ != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.naZ);
      i = i + e.a.a.b.b.a.bs(8, this.nba) + e.a.a.b.b.a.bs(9, this.mZN);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.mZL);
      AppMethodBeat.o(111577);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111577);
          throw paramArrayOfObject;
        }
        if (this.naV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NavKey");
          AppMethodBeat.o(111577);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111577);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        al localal = (al)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111577);
          break;
        case 1:
          localal.Title = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 2:
          localal.naV = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 3:
          localal.mZj = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 4:
          localal.naW = locala.BTU.ehX();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 5:
          localal.naX = locala.BTU.ehX();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 6:
          localal.naY = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 7:
          localal.naZ = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 8:
          localal.nba = locala.BTU.vd();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 9:
          localal.mZN = locala.BTU.vd();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        case 10:
          localal.mZL = locala.BTU.readString();
          AppMethodBeat.o(111577);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111577);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.al
 * JD-Core Version:    0.6.2
 */