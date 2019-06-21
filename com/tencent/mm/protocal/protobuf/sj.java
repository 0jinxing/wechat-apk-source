package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class sj extends com.tencent.mm.bt.a
{
  public int jCy;
  public int luF;
  public LinkedList<awy> naO;
  public int vKd;
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOD;
  public String vOz;
  public int vZF;

  public sj()
  {
    AppMethodBeat.i(72841);
    this.naO = new LinkedList();
    AppMethodBeat.o(72841);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72842);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.luF);
      if (this.vOB != null)
        paramArrayOfObject.e(7, this.vOB);
      paramArrayOfObject.iz(2, this.vKd);
      paramArrayOfObject.iz(3, this.vZF);
      paramArrayOfObject.e(4, 8, this.naO);
      if (this.vOz != null)
        paramArrayOfObject.e(5, this.vOz);
      if (this.vOA != null)
        paramArrayOfObject.e(6, this.vOA);
      if (this.vOC != null)
        paramArrayOfObject.e(8, this.vOC);
      if (this.vOD != null)
        paramArrayOfObject.e(9, this.vOD);
      paramArrayOfObject.iz(10, this.jCy);
      AppMethodBeat.o(72842);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.luF) + 0;
        paramInt = i;
        if (this.vOB != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vOB);
        paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vKd) + e.a.a.b.b.a.bs(3, this.vZF) + e.a.a.a.c(4, 8, this.naO);
        i = paramInt;
        if (this.vOz != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vOz);
        paramInt = i;
        if (this.vOA != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vOA);
        i = paramInt;
        if (this.vOC != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.vOC);
        paramInt = i;
        if (this.vOD != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.vOD);
        paramInt += e.a.a.b.b.a.bs(10, this.jCy);
        AppMethodBeat.o(72842);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.naO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72842);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sj localsj = (sj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72842);
          break;
        case 1:
          localsj.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 7:
          localsj.vOB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 2:
          localsj.vKd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 3:
          localsj.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new awy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((awy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsj.naO.add(localObject1);
          }
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 5:
          localsj.vOz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 6:
          localsj.vOA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 8:
          localsj.vOC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 9:
          localsj.vOD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        case 10:
          localsj.jCy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72842);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72842);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sj
 * JD-Core Version:    0.6.2
 */