package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ccw extends com.tencent.mm.bt.a
{
  public int xce;
  public int xcf;
  public int xcg;
  public coj xch;
  public int xci;
  public int xcj;
  public int xck;
  public int xcl;
  public LinkedList<Integer> xcm;
  public int xcn;
  public LinkedList<Integer> xco;
  public int xcp;
  public LinkedList<Integer> xcq;

  public ccw()
  {
    AppMethodBeat.i(5219);
    this.xcm = new LinkedList();
    this.xco = new LinkedList();
    this.xcq = new LinkedList();
    AppMethodBeat.o(5219);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5220);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xch == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Addr");
        AppMethodBeat.o(5220);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.xce);
      paramArrayOfObject.iz(2, this.xcf);
      paramArrayOfObject.iz(3, this.xcg);
      if (this.xch != null)
      {
        paramArrayOfObject.iy(4, this.xch.computeSize());
        this.xch.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.xci);
      paramArrayOfObject.iz(6, this.xcj);
      paramArrayOfObject.iz(7, this.xck);
      paramArrayOfObject.iz(8, this.xcl);
      paramArrayOfObject.f(9, 2, this.xcm);
      paramArrayOfObject.iz(10, this.xcn);
      paramArrayOfObject.f(11, 2, this.xco);
      paramArrayOfObject.iz(12, this.xcp);
      paramArrayOfObject.f(13, 2, this.xcq);
      AppMethodBeat.o(5220);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.xce) + 0 + e.a.a.b.b.a.bs(2, this.xcf) + e.a.a.b.b.a.bs(3, this.xcg);
        paramInt = i;
        if (this.xch != null)
          paramInt = i + e.a.a.a.ix(4, this.xch.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(5, this.xci) + e.a.a.b.b.a.bs(6, this.xcj) + e.a.a.b.b.a.bs(7, this.xck) + e.a.a.b.b.a.bs(8, this.xcl) + e.a.a.a.d(9, 2, this.xcm) + e.a.a.b.b.a.bs(10, this.xcn) + e.a.a.a.d(11, 2, this.xco) + e.a.a.b.b.a.bs(12, this.xcp) + e.a.a.a.d(13, 2, this.xcq);
        AppMethodBeat.o(5220);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xcm.clear();
        this.xco.clear();
        this.xcq.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xch == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Addr");
          AppMethodBeat.o(5220);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5220);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccw localccw = (ccw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5220);
          break;
        case 1:
          localccw.xce = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 2:
          localccw.xcf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 3:
          localccw.xcg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new coj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((coj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccw.xch = ((coj)localObject1);
          }
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 5:
          localccw.xci = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 6:
          localccw.xcj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 7:
          localccw.xck = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 8:
          localccw.xcl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 9:
          localccw.xcm = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 10:
          localccw.xcn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 11:
          localccw.xco = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 12:
          localccw.xcp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        case 13:
          localccw.xcq = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(5220);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5220);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccw
 * JD-Core Version:    0.6.2
 */