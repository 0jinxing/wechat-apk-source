package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class br extends com.tencent.mm.bt.a
{
  public String desc;
  public LinkedList<bz> kfL;
  public String summary;
  public String title;
  public String url;

  public br()
  {
    AppMethodBeat.i(111622);
    this.kfL = new LinkedList();
    AppMethodBeat.o(111622);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111623);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.summary != null)
        paramArrayOfObject.e(1, this.summary);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      paramArrayOfObject.e(3, 8, this.kfL);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      if (this.title != null)
        paramArrayOfObject.e(5, this.title);
      AppMethodBeat.o(111623);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.summary == null)
        break label568;
    label568: for (paramInt = e.a.a.b.b.a.f(1, this.summary) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      i += e.a.a.a.c(3, 8, this.kfL);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.url);
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.title);
      AppMethodBeat.o(111623);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.kfL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111623);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        br localbr = (br)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111623);
          break;
        case 1:
          localbr.summary = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111623);
          paramInt = i;
          break;
        case 2:
          localbr.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111623);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbr.kfL.add(localObject1);
          }
          AppMethodBeat.o(111623);
          paramInt = i;
          break;
        case 4:
          localbr.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111623);
          paramInt = i;
          break;
        case 5:
          localbr.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111623);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111623);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.br
 * JD-Core Version:    0.6.2
 */