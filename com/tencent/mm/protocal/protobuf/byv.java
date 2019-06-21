package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class byv extends bsr
{
  public int cME;
  public LinkedList<byx> fjr;
  public cdc vBy;
  public String wSq;
  public int wYd;
  public bzm wYe;
  public String wni;

  public byv()
  {
    AppMethodBeat.i(89137);
    this.fjr = new LinkedList();
    AppMethodBeat.o(89137);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89138);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wYd);
      paramArrayOfObject.e(3, 8, this.fjr);
      if (this.wSq != null)
        paramArrayOfObject.e(4, this.wSq);
      if (this.wni != null)
        paramArrayOfObject.e(5, this.wni);
      if (this.wYe != null)
      {
        paramArrayOfObject.iy(6, this.wYe.computeSize());
        this.wYe.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.cME);
      if (this.vBy != null)
      {
        paramArrayOfObject.iy(8, this.vBy.computeSize());
        this.vBy.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89138);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1012;
    label1012: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wYd) + e.a.a.a.c(3, 8, this.fjr);
      paramInt = i;
      if (this.wSq != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wSq);
      i = paramInt;
      if (this.wni != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wni);
      paramInt = i;
      if (this.wYe != null)
        paramInt = i + e.a.a.a.ix(6, this.wYe.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(7, this.cME);
      paramInt = i;
      if (this.vBy != null)
        paramInt = i + e.a.a.a.ix(8, this.vBy.computeSize());
      AppMethodBeat.o(89138);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.fjr.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89138);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byv localbyv = (byv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89138);
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
            localbyv.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 2:
          localbyv.wYd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new byx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyv.fjr.add(localObject1);
          }
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 4:
          localbyv.wSq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 5:
          localbyv.wni = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyv.wYe = ((bzm)localObject1);
          }
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 7:
          localbyv.cME = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyv.vBy = ((cdc)localObject1);
          }
          AppMethodBeat.o(89138);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89138);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byv
 * JD-Core Version:    0.6.2
 */