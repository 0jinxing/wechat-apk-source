package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bkd extends com.tencent.mm.bt.a
{
  public cgv vCN;
  public cgv vCO;
  public auj wNo;
  public LinkedList<ob> wNp;
  public bdw wNq;

  public bkd()
  {
    AppMethodBeat.i(48922);
    this.wNp = new LinkedList();
    AppMethodBeat.o(48922);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48923);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wNo != null)
      {
        paramArrayOfObject.iy(1, this.wNo.computeSize());
        this.wNo.writeFields(paramArrayOfObject);
      }
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(2, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      if (this.vCO != null)
      {
        paramArrayOfObject.iy(3, this.vCO.computeSize());
        this.vCO.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(4, 8, this.wNp);
      if (this.wNq != null)
      {
        paramArrayOfObject.iy(5, this.wNq.computeSize());
        this.wNq.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48923);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wNo == null)
        break label943;
    label943: for (i = e.a.a.a.ix(1, this.wNo.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vCN != null)
        paramInt = i + e.a.a.a.ix(2, this.vCN.computeSize());
      i = paramInt;
      if (this.vCO != null)
        i = paramInt + e.a.a.a.ix(3, this.vCO.computeSize());
      i += e.a.a.a.c(4, 8, this.wNp);
      paramInt = i;
      if (this.wNq != null)
        paramInt = i + e.a.a.a.ix(5, this.wNq.computeSize());
      AppMethodBeat.o(48923);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wNp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48923);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bkd localbkd = (bkd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48923);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((auj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkd.wNo = ((auj)localObject1);
          }
          AppMethodBeat.o(48923);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkd.vCN = ((cgv)localObject1);
          }
          AppMethodBeat.o(48923);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkd.vCO = ((cgv)localObject1);
          }
          AppMethodBeat.o(48923);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkd.wNp.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48923);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkd.wNq = ((bdw)localObject1);
          }
          AppMethodBeat.o(48923);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48923);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkd
 * JD-Core Version:    0.6.2
 */