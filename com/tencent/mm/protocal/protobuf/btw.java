package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class btw extends com.tencent.mm.bt.a
{
  public LinkedList<aza> wVM;
  public boolean wVN;
  public boolean wVO;
  public boolean wVP;
  public boolean wVQ;
  public boolean wVR;

  public btw()
  {
    AppMethodBeat.i(73753);
    this.wVM = new LinkedList();
    AppMethodBeat.o(73753);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73754);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.wVM);
      paramArrayOfObject.aO(2, this.wVN);
      paramArrayOfObject.aO(3, this.wVO);
      paramArrayOfObject.aO(4, this.wVP);
      paramArrayOfObject.aO(5, this.wVQ);
      paramArrayOfObject.aO(6, this.wVR);
      AppMethodBeat.o(73754);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 8, this.wVM) + 0 + (e.a.a.b.b.a.fv(2) + 1) + (e.a.a.b.b.a.fv(3) + 1) + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1) + (e.a.a.b.b.a.fv(6) + 1);
        AppMethodBeat.o(73754);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wVM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73754);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        btw localbtw = (btw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73754);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aza();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((aza)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbtw.wVM.add(localObject1);
          }
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        case 2:
          localbtw.wVN = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        case 3:
          localbtw.wVO = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        case 4:
          localbtw.wVP = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        case 5:
          localbtw.wVQ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        case 6:
          localbtw.wVR = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73754);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73754);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btw
 * JD-Core Version:    0.6.2
 */