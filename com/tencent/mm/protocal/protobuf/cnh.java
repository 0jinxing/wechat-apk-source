package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class cnh extends bsr
{
  public int vIJ;
  public SKBuiltinBuffer_t vIl;
  public String wsM;
  public int xkM;
  public LinkedList<cnf> xkN;
  public int xkO;
  public LinkedList<Integer> xkP;
  public int xkQ;
  public LinkedList<cng> xkR;

  public cnh()
  {
    AppMethodBeat.i(80209);
    this.xkN = new LinkedList();
    this.xkP = new LinkedList();
    this.xkR = new LinkedList();
    AppMethodBeat.o(80209);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80210);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vIJ);
      paramArrayOfObject.iz(3, this.xkM);
      paramArrayOfObject.e(4, 8, this.xkN);
      if (this.wsM != null)
        paramArrayOfObject.e(5, this.wsM);
      paramArrayOfObject.iz(6, this.xkO);
      paramArrayOfObject.f(7, 2, this.xkP);
      paramArrayOfObject.iz(8, this.xkQ);
      paramArrayOfObject.e(9, 8, this.xkR);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(10, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80210);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1097;
    label1097: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vIJ) + e.a.a.b.b.a.bs(3, this.xkM) + e.a.a.a.c(4, 8, this.xkN);
      paramInt = i;
      if (this.wsM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wsM);
      i = paramInt + e.a.a.b.b.a.bs(6, this.xkO) + e.a.a.a.d(7, 2, this.xkP) + e.a.a.b.b.a.bs(8, this.xkQ) + e.a.a.a.c(9, 8, this.xkR);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(10, this.vIl.computeSize());
      AppMethodBeat.o(80210);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xkN.clear();
        this.xkP.clear();
        this.xkR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80210);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnh localcnh = (cnh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80210);
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
            localcnh.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 2:
          localcnh.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 3:
          localcnh.xkM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cnf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cnf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnh.xkN.add(localObject1);
          }
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 5:
          localcnh.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 6:
          localcnh.xkO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 7:
          localcnh.xkP = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 8:
          localcnh.xkQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cng();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cng)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnh.xkR.add(localObject1);
          }
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnh.vIl = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80210);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80210);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnh
 * JD-Core Version:    0.6.2
 */