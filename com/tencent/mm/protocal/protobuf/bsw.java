package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bsw extends com.tencent.mm.bt.a
{
  public int vQW;
  public int vek;
  public int wOI;
  public bsz wUV;
  public bsy wUW;
  public int wUX;
  public String wUY;
  public int wUZ;
  public int wVa;
  public int wVb;
  public int wpk;
  public int wxG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80162);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wUY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SampleId");
        AppMethodBeat.o(80162);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wOI);
      if (this.wUV != null)
      {
        paramArrayOfObject.iy(2, this.wUV.computeSize());
        this.wUV.writeFields(paramArrayOfObject);
      }
      if (this.wUW != null)
      {
        paramArrayOfObject.iy(3, this.wUW.computeSize());
        this.wUW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wpk);
      paramArrayOfObject.iz(5, this.wUX);
      if (this.wUY != null)
        paramArrayOfObject.e(6, this.wUY);
      paramArrayOfObject.iz(7, this.vQW);
      paramArrayOfObject.iz(8, this.wUZ);
      paramArrayOfObject.iz(9, this.vek);
      paramArrayOfObject.iz(10, this.wVa);
      paramArrayOfObject.iz(11, this.wVb);
      paramArrayOfObject.iz(12, this.wxG);
      AppMethodBeat.o(80162);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wOI) + 0;
        paramInt = i;
        if (this.wUV != null)
          paramInt = i + e.a.a.a.ix(2, this.wUV.computeSize());
        i = paramInt;
        if (this.wUW != null)
          i = paramInt + e.a.a.a.ix(3, this.wUW.computeSize());
        i = i + e.a.a.b.b.a.bs(4, this.wpk) + e.a.a.b.b.a.bs(5, this.wUX);
        paramInt = i;
        if (this.wUY != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wUY);
        paramInt = paramInt + e.a.a.b.b.a.bs(7, this.vQW) + e.a.a.b.b.a.bs(8, this.wUZ) + e.a.a.b.b.a.bs(9, this.vek) + e.a.a.b.b.a.bs(10, this.wVa) + e.a.a.b.b.a.bs(11, this.wVb) + e.a.a.b.b.a.bs(12, this.wxG);
        AppMethodBeat.o(80162);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wUY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SampleId");
          AppMethodBeat.o(80162);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80162);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsw localbsw = (bsw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80162);
          break;
        case 1:
          localbsw.wOI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bsz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bsz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsw.wUV = ((bsz)localObject1);
          }
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bsy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsw.wUW = paramArrayOfObject;
          }
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 4:
          localbsw.wpk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 5:
          localbsw.wUX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 6:
          localbsw.wUY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 7:
          localbsw.vQW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 8:
          localbsw.wUZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 9:
          localbsw.vek = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 10:
          localbsw.wVa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 11:
          localbsw.wVb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        case 12:
          localbsw.wxG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80162);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80162);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsw
 * JD-Core Version:    0.6.2
 */