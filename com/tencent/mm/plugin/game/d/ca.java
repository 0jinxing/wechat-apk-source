package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ca extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncM;
  public LinkedList<String> ncN;

  public ca()
  {
    AppMethodBeat.i(111634);
    this.ncN = new LinkedList();
    AppMethodBeat.o(111634);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111635);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.ncM != null)
        paramArrayOfObject.e(2, this.ncM);
      paramArrayOfObject.e(3, 1, this.ncN);
      AppMethodBeat.o(111635);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label353;
    label353: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncM);
      paramInt = i + e.a.a.a.c(3, 1, this.ncN);
      AppMethodBeat.o(111635);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ncN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111635);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ca localca = (ca)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111635);
          break;
        case 1:
          localca.Title = locala.BTU.readString();
          AppMethodBeat.o(111635);
          paramInt = i;
          break;
        case 2:
          localca.ncM = locala.BTU.readString();
          AppMethodBeat.o(111635);
          paramInt = i;
          break;
        case 3:
          localca.ncN.add(locala.BTU.readString());
          AppMethodBeat.o(111635);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111635);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ca
 * JD-Core Version:    0.6.2
 */