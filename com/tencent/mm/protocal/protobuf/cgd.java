package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cgd extends com.tencent.mm.bt.a
{
  public btr vCP;
  public String vJS;
  public bif wVz;
  public auj xff;
  public LinkedList<cgv> xfg;
  public LinkedList<cgv> xfh;
  public auj xfi;
  public bqn xfj;
  public btq xfk;

  public cgd()
  {
    AppMethodBeat.i(48965);
    this.xfg = new LinkedList();
    this.xfh = new LinkedList();
    AppMethodBeat.o(48965);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48966);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xff != null)
      {
        paramArrayOfObject.iy(1, this.xff.computeSize());
        this.xff.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.xfg);
      paramArrayOfObject.e(3, 8, this.xfh);
      if (this.xfi != null)
      {
        paramArrayOfObject.iy(4, this.xfi.computeSize());
        this.xfi.writeFields(paramArrayOfObject);
      }
      if (this.xfj != null)
      {
        paramArrayOfObject.iy(5, this.xfj.computeSize());
        this.xfj.writeFields(paramArrayOfObject);
      }
      if (this.vJS != null)
        paramArrayOfObject.e(6, this.vJS);
      if (this.wVz != null)
      {
        paramArrayOfObject.iy(7, this.wVz.computeSize());
        this.wVz.writeFields(paramArrayOfObject);
      }
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(8, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      if (this.xfk != null)
      {
        paramArrayOfObject.iy(9, this.xfk.computeSize());
        this.xfk.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48966);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xff == null)
        break label1465;
    label1465: for (paramInt = e.a.a.a.ix(1, this.xff.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.xfg) + e.a.a.a.c(3, 8, this.xfh);
      i = paramInt;
      if (this.xfi != null)
        i = paramInt + e.a.a.a.ix(4, this.xfi.computeSize());
      paramInt = i;
      if (this.xfj != null)
        paramInt = i + e.a.a.a.ix(5, this.xfj.computeSize());
      i = paramInt;
      if (this.vJS != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vJS);
      paramInt = i;
      if (this.wVz != null)
        paramInt = i + e.a.a.a.ix(7, this.wVz.computeSize());
      i = paramInt;
      if (this.vCP != null)
        i = paramInt + e.a.a.a.ix(8, this.vCP.computeSize());
      paramInt = i;
      if (this.xfk != null)
        paramInt = i + e.a.a.a.ix(9, this.xfk.computeSize());
      AppMethodBeat.o(48966);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xfg.clear();
        this.xfh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48966);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgd localcgd = (cgd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48966);
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
            localcgd.xff = ((auj)localObject1);
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.xfg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.xfh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.xfi = paramArrayOfObject;
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bqn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.xfj = paramArrayOfObject;
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 6:
          localcgd.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bif();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.wVz = paramArrayOfObject;
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.vCP = ((btr)localObject1);
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgd.xfk = paramArrayOfObject;
          }
          AppMethodBeat.o(48966);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48966);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgd
 * JD-Core Version:    0.6.2
 */