package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class dr extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String fKh;
  public String jBB;
  public String mZL;
  public String ncH;
  public String ndP;
  public int ndQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111682);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(111682);
        throw paramArrayOfObject;
      }
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      if (this.ncH != null)
        paramArrayOfObject.e(2, this.ncH);
      if (this.IconUrl != null)
        paramArrayOfObject.e(3, this.IconUrl);
      if (this.jBB != null)
        paramArrayOfObject.e(4, this.jBB);
      if (this.ndP != null)
        paramArrayOfObject.e(5, this.ndP);
      paramArrayOfObject.iz(6, this.ndQ);
      if (this.mZL != null)
        paramArrayOfObject.e(7, this.mZL);
      AppMethodBeat.o(111682);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label641;
    label641: for (i = e.a.a.b.b.a.f(1, this.fKh) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ncH);
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.IconUrl);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.jBB);
      i = paramInt;
      if (this.ndP != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ndP);
      i += e.a.a.b.b.a.bs(6, this.ndQ);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.mZL);
      AppMethodBeat.o(111682);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(111682);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111682);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dr localdr = (dr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111682);
          break;
        case 1:
          localdr.fKh = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 2:
          localdr.ncH = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 3:
          localdr.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 4:
          localdr.jBB = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 5:
          localdr.ndP = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 6:
          localdr.ndQ = locala.BTU.vd();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        case 7:
          localdr.mZL = locala.BTU.readString();
          AppMethodBeat.o(111682);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111682);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dr
 * JD-Core Version:    0.6.2
 */