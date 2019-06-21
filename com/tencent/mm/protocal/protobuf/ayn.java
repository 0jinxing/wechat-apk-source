package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ayn extends bsr
{
  public int wCn;
  public LinkedList<bts> wCo;
  public int wCp;
  public LinkedList<bts> wCq;
  public String wdB;

  public ayn()
  {
    AppMethodBeat.i(73733);
    this.wCo = new LinkedList();
    this.wCq = new LinkedList();
    AppMethodBeat.o(73733);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73734);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wdB != null)
        paramArrayOfObject.e(2, this.wdB);
      paramArrayOfObject.iz(3, this.wCn);
      paramArrayOfObject.e(4, 8, this.wCo);
      paramArrayOfObject.iz(5, this.wCp);
      paramArrayOfObject.e(6, 8, this.wCq);
      AppMethodBeat.o(73734);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label764;
    label764: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wdB);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wCn) + e.a.a.a.c(4, 8, this.wCo) + e.a.a.b.b.a.bs(5, this.wCp) + e.a.a.a.c(6, 8, this.wCq);
      AppMethodBeat.o(73734);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wCo.clear();
        this.wCq.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73734);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ayn localayn = (ayn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73734);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayn.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        case 2:
          localayn.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        case 3:
          localayn.wCn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayn.wCo.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        case 5:
          localayn.wCp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayn.wCq.add(localObject1);
          }
          AppMethodBeat.o(73734);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73734);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayn
 * JD-Core Version:    0.6.2
 */