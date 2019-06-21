package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bia extends com.tencent.mm.bt.a
{
  public String pdA;
  public int state;
  public LinkedList<bhz> wLj;
  public int wLk;
  public int wLl;
  public bsz wLm;
  public int wLn;
  public LinkedList<bhy> wLo;
  public boolean wLp;
  public LinkedList<bsz> wLq;

  public bia()
  {
    AppMethodBeat.i(90704);
    this.wLj = new LinkedList();
    this.wLo = new LinkedList();
    this.wLq = new LinkedList();
    AppMethodBeat.o(90704);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(90705);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pdA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: pid");
        AppMethodBeat.o(90705);
        throw paramArrayOfObject;
      }
      if (this.pdA != null)
        paramArrayOfObject.e(1, this.pdA);
      paramArrayOfObject.iz(2, this.state);
      paramArrayOfObject.e(3, 8, this.wLj);
      paramArrayOfObject.iz(4, this.wLk);
      paramArrayOfObject.iz(5, this.wLl);
      if (this.wLm != null)
      {
        paramArrayOfObject.iy(6, this.wLm.computeSize());
        this.wLm.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wLn);
      paramArrayOfObject.e(8, 8, this.wLo);
      paramArrayOfObject.aO(9, this.wLp);
      paramArrayOfObject.e(10, 8, this.wLq);
      AppMethodBeat.o(90705);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pdA == null)
        break label1097;
    label1097: for (paramInt = e.a.a.b.b.a.f(1, this.pdA) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.state) + e.a.a.a.c(3, 8, this.wLj) + e.a.a.b.b.a.bs(4, this.wLk) + e.a.a.b.b.a.bs(5, this.wLl);
      paramInt = i;
      if (this.wLm != null)
        paramInt = i + e.a.a.a.ix(6, this.wLm.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.wLn) + e.a.a.a.c(8, 8, this.wLo) + (e.a.a.b.b.a.fv(9) + 1) + e.a.a.a.c(10, 8, this.wLq);
      AppMethodBeat.o(90705);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wLj.clear();
        this.wLo.clear();
        this.wLq.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.pdA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: pid");
          AppMethodBeat.o(90705);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(90705);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bia localbia = (bia)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(90705);
          break;
        case 1:
          localbia.pdA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 2:
          localbia.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbia.wLj.add(localObject1);
          }
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 4:
          localbia.wLk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 5:
          localbia.wLl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bsz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bsz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbia.wLm = ((bsz)localObject1);
          }
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 7:
          localbia.wLn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbia.wLo.add(localObject1);
          }
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 9:
          localbia.wLp = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bsz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbia.wLq.add(paramArrayOfObject);
          }
          AppMethodBeat.o(90705);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(90705);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bia
 * JD-Core Version:    0.6.2
 */