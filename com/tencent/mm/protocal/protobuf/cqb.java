package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cqb extends bsr
{
  public double vNH;
  public double vNI;
  public int vZF;
  public int wem;
  public long wen;
  public LinkedList<ccw> wpo;
  public long xod;
  public bts xoe;
  public bts xof;
  public int xog;

  public cqb()
  {
    AppMethodBeat.i(5267);
    this.wpo = new LinkedList();
    AppMethodBeat.o(5267);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5268);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xoe == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: NetName");
        AppMethodBeat.o(5268);
        throw paramArrayOfObject;
      }
      if (this.xof == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: WifiName");
        AppMethodBeat.o(5268);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.xod);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.vZF);
      if (this.xoe != null)
      {
        paramArrayOfObject.iy(5, this.xoe.computeSize());
        this.xoe.writeFields(paramArrayOfObject);
      }
      if (this.xof != null)
      {
        paramArrayOfObject.iy(6, this.xof.computeSize());
        this.xof.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(7, this.vNH);
      paramArrayOfObject.f(8, this.vNI);
      paramArrayOfObject.iz(9, this.wem);
      paramArrayOfObject.iz(10, this.xog);
      paramArrayOfObject.e(11, 8, this.wpo);
      AppMethodBeat.o(5268);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1235;
    label1235: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.xod) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.vZF);
      paramInt = i;
      if (this.xoe != null)
        paramInt = i + e.a.a.a.ix(5, this.xoe.computeSize());
      i = paramInt;
      if (this.xof != null)
        i = paramInt + e.a.a.a.ix(6, this.xof.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(7) + 8) + (e.a.a.b.b.a.fv(8) + 8) + e.a.a.b.b.a.bs(9, this.wem) + e.a.a.b.b.a.bs(10, this.xog) + e.a.a.a.c(11, 8, this.wpo);
      AppMethodBeat.o(5268);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wpo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xoe == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: NetName");
          AppMethodBeat.o(5268);
          throw paramArrayOfObject;
        }
        if (this.xof == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: WifiName");
          AppMethodBeat.o(5268);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5268);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cqb localcqb = (cqb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5268);
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
            localcqb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 2:
          localcqb.xod = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 3:
          localcqb.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 4:
          localcqb.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqb.xoe = paramArrayOfObject;
          }
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqb.xof = ((bts)localObject1);
          }
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 7:
          localcqb.vNH = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 8:
          localcqb.vNI = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 9:
          localcqb.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 10:
          localcqb.xog = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ccw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ccw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqb.wpo.add(localObject1);
          }
          AppMethodBeat.o(5268);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5268);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqb
 * JD-Core Version:    0.6.2
 */