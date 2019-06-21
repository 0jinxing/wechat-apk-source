package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aht extends bsr
{
  public LinkedList<bts> vEg;
  public int wnW;
  public int wnX;
  public LinkedList<bts> wnY;
  public int wnZ;
  public LinkedList<bts> woa;
  public int wob;
  public bts woc;

  public aht()
  {
    AppMethodBeat.i(28428);
    this.vEg = new LinkedList();
    this.wnY = new LinkedList();
    this.woa = new LinkedList();
    AppMethodBeat.o(28428);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28429);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wnW);
      paramArrayOfObject.e(3, 8, this.vEg);
      paramArrayOfObject.iz(4, this.wnX);
      paramArrayOfObject.e(5, 8, this.wnY);
      paramArrayOfObject.iz(6, this.wnZ);
      paramArrayOfObject.e(7, 8, this.woa);
      paramArrayOfObject.iz(8, this.wob);
      if (this.woc != null)
      {
        paramArrayOfObject.iy(9, this.woc.computeSize());
        this.woc.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28429);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1113;
    label1113: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wnW) + e.a.a.a.c(3, 8, this.vEg) + e.a.a.b.b.a.bs(4, this.wnX) + e.a.a.a.c(5, 8, this.wnY) + e.a.a.b.b.a.bs(6, this.wnZ) + e.a.a.a.c(7, 8, this.woa) + e.a.a.b.b.a.bs(8, this.wob);
      paramInt = i;
      if (this.woc != null)
        paramInt = i + e.a.a.a.ix(9, this.woc.computeSize());
      AppMethodBeat.o(28429);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEg.clear();
        this.wnY.clear();
        this.woa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28429);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aht localaht = (aht)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28429);
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
            localaht.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 2:
          localaht.wnW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaht.vEg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 4:
          localaht.wnX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaht.wnY.add(localObject1);
          }
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 6:
          localaht.wnZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaht.woa.add(localObject1);
          }
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 8:
          localaht.wob = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaht.woc = paramArrayOfObject;
          }
          AppMethodBeat.o(28429);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28429);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aht
 * JD-Core Version:    0.6.2
 */