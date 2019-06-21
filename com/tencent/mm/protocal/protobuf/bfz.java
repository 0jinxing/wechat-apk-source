package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bfz extends com.tencent.mm.bt.a
{
  public String app_id;
  public String gfa;
  public int oqG;
  public int wJQ;
  public bga wJR;
  public int wJS;
  public int wJT;
  public int wJU;
  public int wJV;
  public int wqI;
  public bgb wqJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80125);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.gfa != null)
        paramArrayOfObject.e(1, this.gfa);
      paramArrayOfObject.iz(2, this.wJQ);
      if (this.wJR != null)
      {
        paramArrayOfObject.iy(3, this.wJR.computeSize());
        this.wJR.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wqI);
      if (this.wqJ != null)
      {
        paramArrayOfObject.iy(5, this.wqJ.computeSize());
        this.wqJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.wJS);
      paramArrayOfObject.iz(7, this.wJT);
      paramArrayOfObject.iz(8, this.oqG);
      paramArrayOfObject.iz(9, this.wJU);
      if (this.app_id != null)
        paramArrayOfObject.e(10, this.app_id);
      paramArrayOfObject.iz(11, this.wJV);
      AppMethodBeat.o(80125);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.gfa == null)
        break label941;
    label941: for (paramInt = e.a.a.b.b.a.f(1, this.gfa) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wJQ);
      paramInt = i;
      if (this.wJR != null)
        paramInt = i + e.a.a.a.ix(3, this.wJR.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(4, this.wqI);
      paramInt = i;
      if (this.wqJ != null)
        paramInt = i + e.a.a.a.ix(5, this.wqJ.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(6, this.wJS) + e.a.a.b.b.a.bs(7, this.wJT) + e.a.a.b.b.a.bs(8, this.oqG) + e.a.a.b.b.a.bs(9, this.wJU);
      paramInt = i;
      if (this.app_id != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.app_id);
      paramInt += e.a.a.b.b.a.bs(11, this.wJV);
      AppMethodBeat.o(80125);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80125);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfz localbfz = (bfz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80125);
          break;
        case 1:
          localbfz.gfa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 2:
          localbfz.wJQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bga();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfz.wJR = paramArrayOfObject;
          }
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 4:
          localbfz.wqI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bgb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfz.wqJ = paramArrayOfObject;
          }
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 6:
          localbfz.wJS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 7:
          localbfz.wJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 8:
          localbfz.oqG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 9:
          localbfz.wJU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 10:
          localbfz.app_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        case 11:
          localbfz.wJV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80125);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80125);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfz
 * JD-Core Version:    0.6.2
 */