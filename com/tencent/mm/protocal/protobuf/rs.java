package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class rs extends bsr
{
  public int jCt;
  public String vYZ;
  public LinkedList<bzd> vZa;
  public LinkedList<bzf> vZb;
  public LinkedList<bzc> vZc;
  public LinkedList<bzb> vZd;
  public LinkedList<bze> vZe;

  public rs()
  {
    AppMethodBeat.i(28359);
    this.vZa = new LinkedList();
    this.vZb = new LinkedList();
    this.vZc = new LinkedList();
    this.vZd = new LinkedList();
    this.vZe = new LinkedList();
    AppMethodBeat.o(28359);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28360);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      if (this.vYZ != null)
        paramArrayOfObject.e(3, this.vYZ);
      paramArrayOfObject.e(4, 8, this.vZa);
      paramArrayOfObject.e(5, 8, this.vZb);
      paramArrayOfObject.e(6, 8, this.vZc);
      paramArrayOfObject.e(7, 8, this.vZd);
      paramArrayOfObject.e(8, 8, this.vZe);
      AppMethodBeat.o(28360);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1159;
    label1159: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt);
      paramInt = i;
      if (this.vYZ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vYZ);
      paramInt = paramInt + e.a.a.a.c(4, 8, this.vZa) + e.a.a.a.c(5, 8, this.vZb) + e.a.a.a.c(6, 8, this.vZc) + e.a.a.a.c(7, 8, this.vZd) + e.a.a.a.c(8, 8, this.vZe);
      AppMethodBeat.o(28360);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vZa.clear();
        this.vZb.clear();
        this.vZc.clear();
        this.vZd.clear();
        this.vZe.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28360);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rs localrs = (rs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28360);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 2:
          localrs.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 3:
          localrs.vYZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.vZa.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.vZb.add(localObject1);
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.vZc.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.vZd.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bze();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrs.vZe.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28360);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28360);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rs
 * JD-Core Version:    0.6.2
 */