package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bhw extends com.tencent.mm.bt.a
{
  public String pdA;
  public LinkedList<bhw> tOS;
  public int timestamp;
  public String type;
  public String wLb;
  public LinkedList<bhv> wLc;
  public int wLd;
  public int wLe;

  public bhw()
  {
    AppMethodBeat.i(90697);
    this.wLc = new LinkedList();
    this.tOS = new LinkedList();
    AppMethodBeat.o(90697);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(90698);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wLb != null)
        paramArrayOfObject.e(1, this.wLb);
      if (this.pdA != null)
        paramArrayOfObject.e(2, this.pdA);
      paramArrayOfObject.e(3, 8, this.wLc);
      paramArrayOfObject.iz(4, this.timestamp);
      if (this.type != null)
        paramArrayOfObject.e(5, this.type);
      paramArrayOfObject.e(6, 8, this.tOS);
      paramArrayOfObject.iz(7, this.wLd);
      paramArrayOfObject.iz(8, this.wLe);
      AppMethodBeat.o(90698);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wLb == null)
        break label786;
    label786: for (paramInt = e.a.a.b.b.a.f(1, this.wLb) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.pdA != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.pdA);
      i = i + e.a.a.a.c(3, 8, this.wLc) + e.a.a.b.b.a.bs(4, this.timestamp);
      paramInt = i;
      if (this.type != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.type);
      paramInt = paramInt + e.a.a.a.c(6, 8, this.tOS) + e.a.a.b.b.a.bs(7, this.wLd) + e.a.a.b.b.a.bs(8, this.wLe);
      AppMethodBeat.o(90698);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wLc.clear();
        this.tOS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(90698);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhw localbhw = (bhw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(90698);
          break;
        case 1:
          localbhw.wLb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 2:
          localbhw.pdA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhw.wLc.add(localObject1);
          }
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 4:
          localbhw.timestamp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 5:
          localbhw.type = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bhw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhw.tOS.add(localObject1);
          }
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 7:
          localbhw.wLd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        case 8:
          localbhw.wLe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(90698);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(90698);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhw
 * JD-Core Version:    0.6.2
 */