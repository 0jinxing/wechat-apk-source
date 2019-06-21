package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjj extends com.tencent.mm.bt.a
{
  public String fFZ;
  public String pQe;
  public String pcl;
  public int wMI;
  public String wMJ;
  public int wMK;
  public String wML;
  public int wMM;
  public String wMN;
  public long wMO;
  public LinkedList<bja> wMP;
  public String wyq;

  public bjj()
  {
    AppMethodBeat.i(56898);
    this.wMP = new LinkedList();
    AppMethodBeat.o(56898);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56899);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wMI);
      if (this.wMJ != null)
        paramArrayOfObject.e(2, this.wMJ);
      if (this.wyq != null)
        paramArrayOfObject.e(3, this.wyq);
      paramArrayOfObject.iz(4, this.wMK);
      if (this.pcl != null)
        paramArrayOfObject.e(5, this.pcl);
      if (this.wML != null)
        paramArrayOfObject.e(6, this.wML);
      if (this.pQe != null)
        paramArrayOfObject.e(7, this.pQe);
      paramArrayOfObject.iz(8, this.wMM);
      if (this.fFZ != null)
        paramArrayOfObject.e(9, this.fFZ);
      if (this.wMN != null)
        paramArrayOfObject.e(10, this.wMN);
      paramArrayOfObject.ai(11, this.wMO);
      paramArrayOfObject.e(12, 8, this.wMP);
      AppMethodBeat.o(56899);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wMI) + 0;
        paramInt = i;
        if (this.wMJ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wMJ);
        i = paramInt;
        if (this.wyq != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wyq);
        paramInt = i + e.a.a.b.b.a.bs(4, this.wMK);
        i = paramInt;
        if (this.pcl != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.pcl);
        paramInt = i;
        if (this.wML != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wML);
        i = paramInt;
        if (this.pQe != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.pQe);
        i += e.a.a.b.b.a.bs(8, this.wMM);
        paramInt = i;
        if (this.fFZ != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.fFZ);
        i = paramInt;
        if (this.wMN != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.wMN);
        paramInt = i + e.a.a.b.b.a.o(11, this.wMO) + e.a.a.a.c(12, 8, this.wMP);
        AppMethodBeat.o(56899);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wMP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56899);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjj localbjj = (bjj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56899);
          break;
        case 1:
          localbjj.wMI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 2:
          localbjj.wMJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 3:
          localbjj.wyq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 4:
          localbjj.wMK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 5:
          localbjj.pcl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 6:
          localbjj.wML = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 7:
          localbjj.pQe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 8:
          localbjj.wMM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 9:
          localbjj.fFZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 10:
          localbjj.wMN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 11:
          localbjj.wMO = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bja();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjj.wMP.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56899);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56899);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjj
 * JD-Core Version:    0.6.2
 */