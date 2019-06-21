package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aw extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String Title;
  public String fKh;
  public String mZi;
  public e mZk;
  public LinkedList<String> nbo;
  public String nbp;
  public String nbq;
  public String nbr;

  public aw()
  {
    AppMethodBeat.i(111592);
    this.nbo = new LinkedList();
    AppMethodBeat.o(111592);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111593);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.IconUrl != null)
        paramArrayOfObject.e(2, this.IconUrl);
      paramArrayOfObject.e(3, 1, this.nbo);
      if (this.nbp != null)
        paramArrayOfObject.e(4, this.nbp);
      if (this.mZi != null)
        paramArrayOfObject.e(5, this.mZi);
      if (this.nbq != null)
        paramArrayOfObject.e(6, this.nbq);
      if (this.nbr != null)
        paramArrayOfObject.e(8, this.nbr);
      if (this.fKh != null)
        paramArrayOfObject.e(9, this.fKh);
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(10, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111593);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label839;
    label839: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.IconUrl);
      paramInt = i + e.a.a.a.c(3, 1, this.nbo);
      i = paramInt;
      if (this.nbp != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nbp);
      paramInt = i;
      if (this.mZi != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mZi);
      i = paramInt;
      if (this.nbq != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.nbq);
      paramInt = i;
      if (this.nbr != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.nbr);
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.fKh);
      paramInt = i;
      if (this.mZk != null)
        paramInt = i + e.a.a.a.ix(10, this.mZk.computeSize());
      AppMethodBeat.o(111593);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111593);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aw localaw = (aw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 7:
        default:
          paramInt = -1;
          AppMethodBeat.o(111593);
          break;
        case 1:
          localaw.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 2:
          localaw.IconUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 3:
          localaw.nbo.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 4:
          localaw.nbp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 5:
          localaw.mZi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 6:
          localaw.nbq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 8:
          localaw.nbr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 9:
          localaw.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaw.mZk = paramArrayOfObject;
          }
          AppMethodBeat.o(111593);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111593);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.aw
 * JD-Core Version:    0.6.2
 */