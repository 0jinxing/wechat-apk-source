package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aq extends com.tencent.mm.bt.a
{
  public String mZL;
  public e mZk;
  public String mZo;
  public LinkedList<ar> nbg;

  public aq()
  {
    AppMethodBeat.i(111583);
    this.nbg = new LinkedList();
    AppMethodBeat.o(111583);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111584);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppItem");
        AppMethodBeat.o(111584);
        throw paramArrayOfObject;
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.mZo != null)
        paramArrayOfObject.e(2, this.mZo);
      paramArrayOfObject.e(3, 8, this.nbg);
      if (this.mZL != null)
        paramArrayOfObject.e(4, this.mZL);
      AppMethodBeat.o(111584);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label645;
    label645: for (paramInt = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZo != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZo);
      i += e.a.a.a.c(3, 8, this.nbg);
      paramInt = i;
      if (this.mZL != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mZL);
      AppMethodBeat.o(111584);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppItem");
          AppMethodBeat.o(111584);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111584);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aq localaq = (aq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111584);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaq.mZk = ((e)localObject1);
          }
          AppMethodBeat.o(111584);
          paramInt = i;
          break;
        case 2:
          localaq.mZo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111584);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ar();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaq.nbg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111584);
          paramInt = i;
          break;
        case 4:
          localaq.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111584);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111584);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.aq
 * JD-Core Version:    0.6.2
 */