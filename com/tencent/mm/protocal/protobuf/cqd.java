package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class cqd extends bsr
{
  public int vZF;
  public int wem;
  public int xcA;
  public int xcB;
  public int xcr;
  public int xcs;
  public int xct;
  public int xcu;
  public int xcv;
  public LinkedList<Integer> xcw;
  public int xcx;
  public int xcy;
  public LinkedList<Integer> xcz;

  public cqd()
  {
    AppMethodBeat.i(5270);
    this.xcw = new LinkedList();
    this.xcz = new LinkedList();
    AppMethodBeat.o(5270);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5271);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.iz(3, this.xcr);
      paramArrayOfObject.iz(4, this.vZF);
      paramArrayOfObject.iz(5, this.xcs);
      paramArrayOfObject.iz(6, this.xct);
      paramArrayOfObject.iz(7, this.xcu);
      paramArrayOfObject.iz(8, this.xcv);
      paramArrayOfObject.f(9, 2, this.xcw);
      paramArrayOfObject.iz(10, this.xcx);
      paramArrayOfObject.iz(11, this.xcy);
      paramArrayOfObject.f(12, 2, this.xcz);
      paramArrayOfObject.iz(13, this.xcA);
      paramArrayOfObject.iz(14, this.xcB);
      AppMethodBeat.o(5271);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1008;
    label1008: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.bs(3, this.xcr) + e.a.a.b.b.a.bs(4, this.vZF) + e.a.a.b.b.a.bs(5, this.xcs) + e.a.a.b.b.a.bs(6, this.xct) + e.a.a.b.b.a.bs(7, this.xcu) + e.a.a.b.b.a.bs(8, this.xcv) + e.a.a.a.d(9, 2, this.xcw) + e.a.a.b.b.a.bs(10, this.xcx) + e.a.a.b.b.a.bs(11, this.xcy) + e.a.a.a.d(12, 2, this.xcz) + e.a.a.b.b.a.bs(13, this.xcA) + e.a.a.b.b.a.bs(14, this.xcB);
      AppMethodBeat.o(5271);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xcw.clear();
        this.xcz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5271);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cqd localcqd = (cqd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5271);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqd.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 2:
          localcqd.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 3:
          localcqd.xcr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 4:
          localcqd.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 5:
          localcqd.xcs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 6:
          localcqd.xct = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 7:
          localcqd.xcu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 8:
          localcqd.xcv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 9:
          localcqd.xcw = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 10:
          localcqd.xcx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 11:
          localcqd.xcy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 12:
          localcqd.xcz = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 13:
          localcqd.xcA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        case 14:
          localcqd.xcB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5271);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5271);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqd
 * JD-Core Version:    0.6.2
 */