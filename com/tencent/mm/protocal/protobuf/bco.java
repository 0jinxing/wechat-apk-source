package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bco extends bsr
{
  public int cME;
  public String csB;
  public String wGP;
  public int wGQ;
  public int wGR;
  public int wGS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127727);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.wGP != null)
        paramArrayOfObject.e(3, this.wGP);
      paramArrayOfObject.iz(4, this.wGQ);
      paramArrayOfObject.iz(5, this.wGR);
      paramArrayOfObject.iz(6, this.wGS);
      paramArrayOfObject.iz(7, this.cME);
      AppMethodBeat.o(127727);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label638;
    label638: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.wGP != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wGP);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wGQ) + e.a.a.b.b.a.bs(5, this.wGR) + e.a.a.b.b.a.bs(6, this.wGS) + e.a.a.b.b.a.bs(7, this.cME);
      AppMethodBeat.o(127727);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(127727);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bco localbco = (bco)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127727);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbco.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 2:
          localbco.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 3:
          localbco.wGP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 4:
          localbco.wGQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 5:
          localbco.wGR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 6:
          localbco.wGS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        case 7:
          localbco.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127727);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127727);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bco
 * JD-Core Version:    0.6.2
 */