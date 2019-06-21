package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cxr extends com.tencent.mm.bt.a
{
  public cxt xtd;
  public cxs xte;
  public cxu xtf;
  public cxw xtg;
  public cxv xth;
  public cxx xti;
  public cxq xtj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(115018);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xtd != null)
      {
        paramArrayOfObject.iy(1, this.xtd.computeSize());
        this.xtd.writeFields(paramArrayOfObject);
      }
      if (this.xte != null)
      {
        paramArrayOfObject.iy(2, this.xte.computeSize());
        this.xte.writeFields(paramArrayOfObject);
      }
      if (this.xtf != null)
      {
        paramArrayOfObject.iy(3, this.xtf.computeSize());
        this.xtf.writeFields(paramArrayOfObject);
      }
      if (this.xtg != null)
      {
        paramArrayOfObject.iy(4, this.xtg.computeSize());
        this.xtg.writeFields(paramArrayOfObject);
      }
      if (this.xth != null)
      {
        paramArrayOfObject.iy(5, this.xth.computeSize());
        this.xth.writeFields(paramArrayOfObject);
      }
      if (this.xti != null)
      {
        paramArrayOfObject.iy(6, this.xti.computeSize());
        this.xti.writeFields(paramArrayOfObject);
      }
      if (this.xtj != null)
      {
        paramArrayOfObject.iy(7, this.xtj.computeSize());
        this.xtj.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(115018);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xtd == null)
        break label1277;
    label1277: for (i = e.a.a.a.ix(1, this.xtd.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xte != null)
        paramInt = i + e.a.a.a.ix(2, this.xte.computeSize());
      i = paramInt;
      if (this.xtf != null)
        i = paramInt + e.a.a.a.ix(3, this.xtf.computeSize());
      paramInt = i;
      if (this.xtg != null)
        paramInt = i + e.a.a.a.ix(4, this.xtg.computeSize());
      i = paramInt;
      if (this.xth != null)
        i = paramInt + e.a.a.a.ix(5, this.xth.computeSize());
      paramInt = i;
      if (this.xti != null)
        paramInt = i + e.a.a.a.ix(6, this.xti.computeSize());
      i = paramInt;
      if (this.xtj != null)
        i = paramInt + e.a.a.a.ix(7, this.xtj.computeSize());
      AppMethodBeat.o(115018);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(115018);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cxr localcxr = (cxr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(115018);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xtd = paramArrayOfObject;
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxs)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xte = ((cxs)localObject1);
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xtf = ((cxu)localObject1);
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xtg = ((cxw)localObject1);
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xth = ((cxv)localObject1);
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xti = paramArrayOfObject;
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcxr.xtj = paramArrayOfObject;
          }
          AppMethodBeat.o(115018);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(115018);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxr
 * JD-Core Version:    0.6.2
 */