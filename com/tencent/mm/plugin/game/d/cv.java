package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cv extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncA;
  public String ncB;
  public LinkedList<cw> ndo;
  public String ndp;
  public String ndq;

  public cv()
  {
    AppMethodBeat.i(111661);
    this.ndo = new LinkedList();
    AppMethodBeat.o(111661);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111662);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111662);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      paramArrayOfObject.e(2, 8, this.ndo);
      if (this.ncA != null)
        paramArrayOfObject.e(3, this.ncA);
      if (this.ncB != null)
        paramArrayOfObject.e(4, this.ncB);
      if (this.ndp != null)
        paramArrayOfObject.e(5, this.ndp);
      if (this.ndq != null)
        paramArrayOfObject.e(6, this.ndq);
      AppMethodBeat.o(111662);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label679;
    label679: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.ndo);
      paramInt = i;
      if (this.ncA != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ncA);
      i = paramInt;
      if (this.ncB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ncB);
      paramInt = i;
      if (this.ndp != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ndp);
      i = paramInt;
      if (this.ndq != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.ndq);
      AppMethodBeat.o(111662);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ndo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111662);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111662);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cv localcv = (cv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111662);
          break;
        case 1:
          localcv.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcv.ndo.add(localObject1);
          }
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        case 3:
          localcv.ncA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        case 4:
          localcv.ncB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        case 5:
          localcv.ndp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        case 6:
          localcv.ndq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111662);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111662);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cv
 * JD-Core Version:    0.6.2
 */