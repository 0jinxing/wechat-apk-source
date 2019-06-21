package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cs extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String fKh;
  public String mZi;
  public e mZk;
  public String nas;
  public String nbr;
  public LinkedList<x> ndm;

  public cs()
  {
    AppMethodBeat.i(111658);
    this.ndm = new LinkedList();
    AppMethodBeat.o(111658);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111659);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.mZi != null)
        paramArrayOfObject.e(3, this.mZi);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.nbr != null)
        paramArrayOfObject.e(5, this.nbr);
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(6, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(7, 8, this.ndm);
      if (this.nas != null)
        paramArrayOfObject.e(8, this.nas);
      AppMethodBeat.o(111659);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label853;
    label853: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.mZi != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZi);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Desc);
      paramInt = i;
      if (this.nbr != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nbr);
      i = paramInt;
      if (this.mZk != null)
        i = paramInt + e.a.a.a.ix(6, this.mZk.computeSize());
      i += e.a.a.a.c(7, 8, this.ndm);
      paramInt = i;
      if (this.nas != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.nas);
      AppMethodBeat.o(111659);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ndm.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111659);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cs localcs = (cs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111659);
          break;
        case 1:
          localcs.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 2:
          localcs.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 3:
          localcs.mZi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 4:
          localcs.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 5:
          localcs.nbr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcs.mZk = ((e)localObject1);
          }
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new x();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcs.ndm.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        case 8:
          localcs.nas = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111659);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111659);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cs
 * JD-Core Version:    0.6.2
 */