package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ob extends com.tencent.mm.bt.a
{
  public String pbn;
  public String pbo;
  public int state;
  public cgv vCN;
  public btr vCP;
  public String vJS;
  public auj vTA;
  public LinkedList<cgv> vTB;
  public int vTC;
  public int vTD;

  public ob()
  {
    AppMethodBeat.i(48789);
    this.vTB = new LinkedList();
    AppMethodBeat.o(48789);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48790);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTA != null)
      {
        paramArrayOfObject.iy(1, this.vTA.computeSize());
        this.vTA.writeFields(paramArrayOfObject);
      }
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(2, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.vTB);
      if (this.pbo != null)
        paramArrayOfObject.e(4, this.pbo);
      if (this.pbn != null)
        paramArrayOfObject.e(5, this.pbn);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(6, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.state);
      paramArrayOfObject.iz(8, this.vTC);
      paramArrayOfObject.iz(9, this.vTD);
      if (this.vJS != null)
        paramArrayOfObject.e(10, this.vJS);
      AppMethodBeat.o(48790);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vTA == null)
        break label1120;
    label1120: for (paramInt = e.a.a.a.ix(1, this.vTA.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vCN != null)
        i = paramInt + e.a.a.a.ix(2, this.vCN.computeSize());
      paramInt = i + e.a.a.a.c(3, 8, this.vTB);
      i = paramInt;
      if (this.pbo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pbo);
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pbn);
      i = paramInt;
      if (this.vCP != null)
        i = paramInt + e.a.a.a.ix(6, this.vCP.computeSize());
      i = i + e.a.a.b.b.a.bs(7, this.state) + e.a.a.b.b.a.bs(8, this.vTC) + e.a.a.b.b.a.bs(9, this.vTD);
      paramInt = i;
      if (this.vJS != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vJS);
      AppMethodBeat.o(48790);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vTB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48790);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ob localob = (ob)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48790);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localob.vTA = paramArrayOfObject;
          }
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localob.vCN = ((cgv)localObject1);
          }
          AppMethodBeat.o(48790);
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
            localob.vTB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 4:
          localob.pbo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 5:
          localob.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((btr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localob.vCP = ((btr)localObject1);
          }
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 7:
          localob.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 8:
          localob.vTC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 9:
          localob.vTD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        case 10:
          localob.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48790);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48790);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ob
 * JD-Core Version:    0.6.2
 */