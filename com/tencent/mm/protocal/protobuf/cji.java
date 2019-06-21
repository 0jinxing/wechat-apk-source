package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cji extends com.tencent.mm.bt.a
{
  public String desc;
  public String title;
  public LinkedList<cjg> vBz;
  public int wRi;
  public String xhW;
  public String xhX;
  public ayi xhY;
  public int xhZ;
  public cjh xia;
  public cjh xib;

  public cji()
  {
    AppMethodBeat.i(48979);
    this.vBz = new LinkedList();
    AppMethodBeat.o(48979);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48980);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.xhW != null)
        paramArrayOfObject.e(3, this.xhW);
      if (this.xhX != null)
        paramArrayOfObject.e(4, this.xhX);
      if (this.xhY != null)
      {
        paramArrayOfObject.iy(5, this.xhY.computeSize());
        this.xhY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(6, 8, this.vBz);
      paramArrayOfObject.iz(7, this.wRi);
      paramArrayOfObject.iz(8, this.xhZ);
      if (this.xia != null)
      {
        paramArrayOfObject.iy(9, this.xia.computeSize());
        this.xia.writeFields(paramArrayOfObject);
      }
      if (this.xib != null)
      {
        paramArrayOfObject.iy(10, this.xib.computeSize());
        this.xib.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48980);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label1139;
    label1139: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.desc);
      i = paramInt;
      if (this.xhW != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xhW);
      paramInt = i;
      if (this.xhX != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xhX);
      i = paramInt;
      if (this.xhY != null)
        i = paramInt + e.a.a.a.ix(5, this.xhY.computeSize());
      i = i + e.a.a.a.c(6, 8, this.vBz) + e.a.a.b.b.a.bs(7, this.wRi) + e.a.a.b.b.a.bs(8, this.xhZ);
      paramInt = i;
      if (this.xia != null)
        paramInt = i + e.a.a.a.ix(9, this.xia.computeSize());
      i = paramInt;
      if (this.xib != null)
        i = paramInt + e.a.a.a.ix(10, this.xib.computeSize());
      AppMethodBeat.o(48980);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vBz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48980);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cji localcji = (cji)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48980);
          break;
        case 1:
          localcji.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 2:
          localcji.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 3:
          localcji.xhW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 4:
          localcji.xhX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ayi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcji.xhY = paramArrayOfObject;
          }
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cjg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcji.vBz.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 7:
          localcji.wRi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 8:
          localcji.xhZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cjh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cjh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcji.xia = ((cjh)localObject1);
          }
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cjh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcji.xib = paramArrayOfObject;
          }
          AppMethodBeat.o(48980);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48980);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cji
 * JD-Core Version:    0.6.2
 */