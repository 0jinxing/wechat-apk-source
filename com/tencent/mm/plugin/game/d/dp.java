package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class dp extends com.tencent.mm.bt.a
{
  public boolean ndK;
  public LinkedList<cu> ndL;
  public LinkedList<cu> ndM;

  public dp()
  {
    AppMethodBeat.i(117005);
    this.ndL = new LinkedList();
    this.ndM = new LinkedList();
    AppMethodBeat.o(117005);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(117006);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.ndK);
      paramArrayOfObject.e(3, 8, this.ndL);
      paramArrayOfObject.e(4, 8, this.ndM);
      AppMethodBeat.o(117006);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.fv(1) + 1 + 0 + e.a.a.a.c(3, 8, this.ndL) + e.a.a.a.c(4, 8, this.ndM);
        AppMethodBeat.o(117006);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ndL.clear();
        this.ndM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(117006);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        dp localdp = (dp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int i;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 2:
        default:
          paramInt = -1;
          AppMethodBeat.o(117006);
          break;
        case 1:
          localdp.ndK = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(117006);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdp.ndL.add(localObject1);
          }
          AppMethodBeat.o(117006);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdp.ndM.add(paramArrayOfObject);
          }
          AppMethodBeat.o(117006);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(117006);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dp
 * JD-Core Version:    0.6.2
 */