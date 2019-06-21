package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ccx extends com.tencent.mm.bt.a
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

  public ccx()
  {
    AppMethodBeat.i(5221);
    this.xcw = new LinkedList();
    this.xcz = new LinkedList();
    AppMethodBeat.o(5221);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5222);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wem);
      paramArrayOfObject.iz(2, this.xcr);
      paramArrayOfObject.iz(3, this.vZF);
      paramArrayOfObject.iz(4, this.xcs);
      paramArrayOfObject.iz(5, this.xct);
      paramArrayOfObject.iz(6, this.xcu);
      paramArrayOfObject.iz(7, this.xcv);
      paramArrayOfObject.e(8, 2, this.xcw);
      paramArrayOfObject.iz(9, this.xcx);
      paramArrayOfObject.iz(10, this.xcy);
      paramArrayOfObject.e(11, 2, this.xcz);
      paramArrayOfObject.iz(12, this.xcA);
      paramArrayOfObject.iz(13, this.xcB);
      AppMethodBeat.o(5222);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wem) + 0 + e.a.a.b.b.a.bs(2, this.xcr) + e.a.a.b.b.a.bs(3, this.vZF) + e.a.a.b.b.a.bs(4, this.xcs) + e.a.a.b.b.a.bs(5, this.xct) + e.a.a.b.b.a.bs(6, this.xcu) + e.a.a.b.b.a.bs(7, this.xcv) + e.a.a.a.c(8, 2, this.xcw) + e.a.a.b.b.a.bs(9, this.xcx) + e.a.a.b.b.a.bs(10, this.xcy) + e.a.a.a.c(11, 2, this.xcz) + e.a.a.b.b.a.bs(12, this.xcA) + e.a.a.b.b.a.bs(13, this.xcB);
        AppMethodBeat.o(5222);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xcw.clear();
        this.xcz.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5222);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ccx localccx = (ccx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5222);
          break;
        case 1:
          localccx.wem = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 2:
          localccx.xcr = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 3:
          localccx.vZF = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 4:
          localccx.xcs = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 5:
          localccx.xct = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 6:
          localccx.xcu = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 7:
          localccx.xcv = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 8:
          localccx.xcw.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 9:
          localccx.xcx = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 10:
          localccx.xcy = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 11:
          localccx.xcz.add(Integer.valueOf(locala.BTU.vd()));
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 12:
          localccx.xcA = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        case 13:
          localccx.xcB = locala.BTU.vd();
          AppMethodBeat.o(5222);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5222);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccx
 * JD-Core Version:    0.6.2
 */