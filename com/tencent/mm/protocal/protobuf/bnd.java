package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bnd extends com.tencent.mm.bt.a
{
  public String cMC;
  public int wPW;
  public boolean wPX;
  public String wPY;
  public int wPZ;
  public int wQa;
  public LinkedList<bnc> wQb;

  public bnd()
  {
    AppMethodBeat.i(89124);
    this.wQb = new LinkedList();
    AppMethodBeat.o(89124);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89125);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cMC != null)
        paramArrayOfObject.e(1, this.cMC);
      paramArrayOfObject.iz(2, this.wPW);
      paramArrayOfObject.aO(3, this.wPX);
      if (this.wPY != null)
        paramArrayOfObject.e(4, this.wPY);
      paramArrayOfObject.iz(5, this.wPZ);
      paramArrayOfObject.iz(6, this.wQa);
      paramArrayOfObject.e(7, 8, this.wQb);
      AppMethodBeat.o(89125);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cMC == null)
        break label622;
    label622: for (paramInt = e.a.a.b.b.a.f(1, this.cMC) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wPW) + (e.a.a.b.b.a.fv(3) + 1);
      paramInt = i;
      if (this.wPY != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wPY);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.wPZ) + e.a.a.b.b.a.bs(6, this.wQa) + e.a.a.a.c(7, 8, this.wQb);
      AppMethodBeat.o(89125);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wQb.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89125);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnd localbnd = (bnd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89125);
          break;
        case 1:
          localbnd.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 2:
          localbnd.wPW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 3:
          localbnd.wPX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 4:
          localbnd.wPY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 5:
          localbnd.wPZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 6:
          localbnd.wQa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bnc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bnc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnd.wQb.add(localObject1);
          }
          AppMethodBeat.o(89125);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89125);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnd
 * JD-Core Version:    0.6.2
 */