package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpk extends com.tencent.mm.bt.a
{
  public int id;
  public bts wRO;
  public bts wRP;
  public bts wRQ;
  public bts wRR;
  public bts wRS;
  public bts wRT;
  public bts wRU;
  public bts wRV;
  public bts wRW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28605);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wRP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: province");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: city");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: district");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: zipcode");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: detail");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: name");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      if (this.wRV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: phone");
        AppMethodBeat.o(28605);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.id);
      if (this.wRO != null)
      {
        paramArrayOfObject.iy(2, this.wRO.computeSize());
        this.wRO.writeFields(paramArrayOfObject);
      }
      if (this.wRP != null)
      {
        paramArrayOfObject.iy(3, this.wRP.computeSize());
        this.wRP.writeFields(paramArrayOfObject);
      }
      if (this.wRQ != null)
      {
        paramArrayOfObject.iy(4, this.wRQ.computeSize());
        this.wRQ.writeFields(paramArrayOfObject);
      }
      if (this.wRR != null)
      {
        paramArrayOfObject.iy(5, this.wRR.computeSize());
        this.wRR.writeFields(paramArrayOfObject);
      }
      if (this.wRS != null)
      {
        paramArrayOfObject.iy(6, this.wRS.computeSize());
        this.wRS.writeFields(paramArrayOfObject);
      }
      if (this.wRT != null)
      {
        paramArrayOfObject.iy(7, this.wRT.computeSize());
        this.wRT.writeFields(paramArrayOfObject);
      }
      if (this.wRU != null)
      {
        paramArrayOfObject.iy(8, this.wRU.computeSize());
        this.wRU.writeFields(paramArrayOfObject);
      }
      if (this.wRV != null)
      {
        paramArrayOfObject.iy(9, this.wRV.computeSize());
        this.wRV.writeFields(paramArrayOfObject);
      }
      if (this.wRW != null)
      {
        paramArrayOfObject.iy(10, this.wRW.computeSize());
        this.wRW.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28605);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.id) + 0;
        paramInt = i;
        if (this.wRO != null)
          paramInt = i + e.a.a.a.ix(2, this.wRO.computeSize());
        int j = paramInt;
        if (this.wRP != null)
          j = paramInt + e.a.a.a.ix(3, this.wRP.computeSize());
        i = j;
        if (this.wRQ != null)
          i = j + e.a.a.a.ix(4, this.wRQ.computeSize());
        paramInt = i;
        if (this.wRR != null)
          paramInt = i + e.a.a.a.ix(5, this.wRR.computeSize());
        j = paramInt;
        if (this.wRS != null)
          j = paramInt + e.a.a.a.ix(6, this.wRS.computeSize());
        i = j;
        if (this.wRT != null)
          i = j + e.a.a.a.ix(7, this.wRT.computeSize());
        paramInt = i;
        if (this.wRU != null)
          paramInt = i + e.a.a.a.ix(8, this.wRU.computeSize());
        i = paramInt;
        if (this.wRV != null)
          i = paramInt + e.a.a.a.ix(9, this.wRV.computeSize());
        paramInt = i;
        if (this.wRW != null)
          paramInt = i + e.a.a.a.ix(10, this.wRW.computeSize());
        AppMethodBeat.o(28605);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wRP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: province");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: city");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: district");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: zipcode");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: detail");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: name");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        if (this.wRV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: phone");
          AppMethodBeat.o(28605);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28605);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpk localbpk = (bpk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28605);
          break;
        case 1:
          localbpk.id = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRO = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRP = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRQ = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRR = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRS = paramArrayOfObject;
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRT = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRU = paramArrayOfObject;
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRV = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpk.wRW = ((bts)localObject1);
          }
          AppMethodBeat.o(28605);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28605);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpk
 * JD-Core Version:    0.6.2
 */