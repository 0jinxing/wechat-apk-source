package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class caz extends com.tencent.mm.bt.a
{
  public long endTime;
  public String feedId;
  public int height;
  public int iev;
  public int lqq;
  public boolean pCS;
  public int qDY;
  public int rBZ;
  public long startTime;
  public int xae;
  public int xaf;
  public LinkedList<aby> xag;
  public long xah;
  public double xai;
  public double xaj;
  public int y;

  public caz()
  {
    AppMethodBeat.i(73655);
    this.y = -1;
    this.height = -1;
    this.iev = -1;
    this.xae = 0;
    this.qDY = -1;
    this.xaf = -1;
    this.lqq = 0;
    this.rBZ = 0;
    this.pCS = false;
    this.startTime = -1L;
    this.endTime = -1L;
    this.xag = new LinkedList();
    this.xah = 0L;
    this.xai = 0.0D;
    this.xaj = 0.0D;
    AppMethodBeat.o(73655);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73656);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.feedId != null)
        paramArrayOfObject.e(1, this.feedId);
      paramArrayOfObject.iz(2, this.y);
      paramArrayOfObject.iz(3, this.height);
      paramArrayOfObject.iz(4, this.iev);
      paramArrayOfObject.iz(5, this.xae);
      paramArrayOfObject.iz(6, this.qDY);
      paramArrayOfObject.iz(7, this.xaf);
      paramArrayOfObject.iz(8, this.lqq);
      paramArrayOfObject.iz(9, this.rBZ);
      paramArrayOfObject.aO(10, this.pCS);
      paramArrayOfObject.ai(11, this.startTime);
      paramArrayOfObject.ai(12, this.endTime);
      paramArrayOfObject.e(13, 8, this.xag);
      paramArrayOfObject.ai(14, this.xah);
      paramArrayOfObject.f(15, this.xai);
      paramArrayOfObject.f(16, this.xaj);
      AppMethodBeat.o(73656);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.feedId == null)
        break label1030;
    label1030: for (paramInt = e.a.a.b.b.a.f(1, this.feedId) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.y) + e.a.a.b.b.a.bs(3, this.height) + e.a.a.b.b.a.bs(4, this.iev) + e.a.a.b.b.a.bs(5, this.xae) + e.a.a.b.b.a.bs(6, this.qDY) + e.a.a.b.b.a.bs(7, this.xaf) + e.a.a.b.b.a.bs(8, this.lqq) + e.a.a.b.b.a.bs(9, this.rBZ) + (e.a.a.b.b.a.fv(10) + 1) + e.a.a.b.b.a.o(11, this.startTime) + e.a.a.b.b.a.o(12, this.endTime) + e.a.a.a.c(13, 8, this.xag) + e.a.a.b.b.a.o(14, this.xah) + (e.a.a.b.b.a.fv(15) + 8) + (e.a.a.b.b.a.fv(16) + 8);
      AppMethodBeat.o(73656);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xag.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73656);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        caz localcaz = (caz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73656);
          break;
        case 1:
          localcaz.feedId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 2:
          localcaz.y = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 3:
          localcaz.height = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 4:
          localcaz.iev = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 5:
          localcaz.xae = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 6:
          localcaz.qDY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 7:
          localcaz.xaf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 8:
          localcaz.lqq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 9:
          localcaz.rBZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 10:
          localcaz.pCS = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 11:
          localcaz.startTime = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 12:
          localcaz.endTime = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aby();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaz.xag.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 14:
          localcaz.xah = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 15:
          localcaz.xai = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        case 16:
          localcaz.xaj = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(73656);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73656);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.caz
 * JD-Core Version:    0.6.2
 */