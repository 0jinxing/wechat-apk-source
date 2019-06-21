package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cci extends com.tencent.mm.bt.a
{
  public String cvF;
  public long xbJ;
  public long xbK;
  public long xbL;
  public LinkedList<caz> xbM;

  public cci()
  {
    AppMethodBeat.i(73657);
    this.xbJ = 0L;
    this.xbK = 0L;
    this.xbL = 0L;
    this.xbM = new LinkedList();
    AppMethodBeat.o(73657);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73658);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cvF != null)
        paramArrayOfObject.e(1, this.cvF);
      paramArrayOfObject.ai(2, this.xbJ);
      paramArrayOfObject.ai(3, this.xbK);
      paramArrayOfObject.ai(4, this.xbL);
      paramArrayOfObject.e(5, 8, this.xbM);
      AppMethodBeat.o(73658);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cvF == null)
        break label512;
    label512: for (paramInt = e.a.a.b.b.a.f(1, this.cvF) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.xbJ) + e.a.a.b.b.a.o(3, this.xbK) + e.a.a.b.b.a.o(4, this.xbL) + e.a.a.a.c(5, 8, this.xbM);
      AppMethodBeat.o(73658);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xbM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73658);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cci localcci = (cci)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73658);
          break;
        case 1:
          localcci.cvF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73658);
          paramInt = i;
          break;
        case 2:
          localcci.xbJ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73658);
          paramInt = i;
          break;
        case 3:
          localcci.xbK = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73658);
          paramInt = i;
          break;
        case 4:
          localcci.xbL = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73658);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new caz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((caz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcci.xbM.add(localObject1);
          }
          AppMethodBeat.o(73658);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73658);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cci
 * JD-Core Version:    0.6.2
 */