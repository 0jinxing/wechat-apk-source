package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bkm extends com.tencent.mm.bt.a
{
  public long cSh;
  public int ehf;
  public String nuL;
  public String pbn;
  public String pck;
  public int state;
  public String vEQ;
  public int vES;
  public String wND;
  public cij wNE;
  public bdg wNF;
  public bbk wNG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56921);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ehf);
      paramArrayOfObject.ai(2, this.cSh);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.pck != null)
        paramArrayOfObject.e(4, this.pck);
      if (this.vEQ != null)
        paramArrayOfObject.e(5, this.vEQ);
      if (this.wND != null)
        paramArrayOfObject.e(6, this.wND);
      if (this.wNE != null)
      {
        paramArrayOfObject.iy(7, this.wNE.computeSize());
        this.wNE.writeFields(paramArrayOfObject);
      }
      if (this.wNF != null)
      {
        paramArrayOfObject.iy(8, this.wNF.computeSize());
        this.wNF.writeFields(paramArrayOfObject);
      }
      if (this.wNG != null)
      {
        paramArrayOfObject.iy(9, this.wNG.computeSize());
        this.wNG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.vES);
      paramArrayOfObject.iz(11, this.state);
      if (this.nuL != null)
        paramArrayOfObject.e(12, this.nuL);
      AppMethodBeat.o(56921);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ehf) + 0 + e.a.a.b.b.a.o(2, this.cSh);
        paramInt = i;
        if (this.pbn != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.pbn);
        int j = paramInt;
        if (this.pck != null)
          j = paramInt + e.a.a.b.b.a.f(4, this.pck);
        i = j;
        if (this.vEQ != null)
          i = j + e.a.a.b.b.a.f(5, this.vEQ);
        paramInt = i;
        if (this.wND != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wND);
        i = paramInt;
        if (this.wNE != null)
          i = paramInt + e.a.a.a.ix(7, this.wNE.computeSize());
        paramInt = i;
        if (this.wNF != null)
          paramInt = i + e.a.a.a.ix(8, this.wNF.computeSize());
        i = paramInt;
        if (this.wNG != null)
          i = paramInt + e.a.a.a.ix(9, this.wNG.computeSize());
        i = i + e.a.a.b.b.a.bs(10, this.vES) + e.a.a.b.b.a.bs(11, this.state);
        paramInt = i;
        if (this.nuL != null)
          paramInt = i + e.a.a.b.b.a.f(12, this.nuL);
        AppMethodBeat.o(56921);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56921);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bkm localbkm = (bkm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56921);
          break;
        case 1:
          localbkm.ehf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 2:
          localbkm.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 3:
          localbkm.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 4:
          localbkm.pck = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 5:
          localbkm.vEQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 6:
          localbkm.wND = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cij();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cij)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkm.wNE = ((cij)localObject1);
          }
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkm.wNF = ((bdg)localObject1);
          }
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bbk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkm.wNG = ((bbk)localObject1);
          }
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 10:
          localbkm.vES = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 11:
          localbkm.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        case 12:
          localbkm.nuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56921);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56921);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkm
 * JD-Core Version:    0.6.2
 */