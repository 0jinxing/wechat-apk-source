package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmy extends bsr
{
  public String wIH;
  public int wII;
  public LinkedList<String> wIJ;
  public int wcA;

  public bmy()
  {
    AppMethodBeat.i(10228);
    this.wIJ = new LinkedList();
    AppMethodBeat.o(10228);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10229);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wIH != null)
        paramArrayOfObject.e(2, this.wIH);
      paramArrayOfObject.iz(3, this.wII);
      paramArrayOfObject.e(4, 1, this.wIJ);
      paramArrayOfObject.iz(5, this.wcA);
      AppMethodBeat.o(10229);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label550;
    label550: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wIH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wIH);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wII) + e.a.a.a.c(4, 1, this.wIJ) + e.a.a.b.b.a.bs(5, this.wcA);
      AppMethodBeat.o(10229);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wIJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10229);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmy localbmy = (bmy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10229);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmy.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(10229);
          paramInt = i;
          break;
        case 2:
          localbmy.wIH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10229);
          paramInt = i;
          break;
        case 3:
          localbmy.wII = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10229);
          paramInt = i;
          break;
        case 4:
          localbmy.wIJ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(10229);
          paramInt = i;
          break;
        case 5:
          localbmy.wcA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10229);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10229);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmy
 * JD-Core Version:    0.6.2
 */